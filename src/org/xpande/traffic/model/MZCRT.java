package org.xpande.traffic.model;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.*;
import org.eevolution.model.X_C_TaxGroup;
import org.xpande.core.utils.CurrencyUtils;
import org.xpande.core.utils.NumberToString;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Modelo para gestión de documentos CRT para tráfico.
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 6/29/20.
 */
public class MZCRT extends X_Z_CRT{

    private MZTraficoConfig traficoConfig = null;

    public MZCRT(Properties ctx, int Z_CRT_ID, String trxName) {
        super(ctx, Z_CRT_ID, trxName);
    }

    public MZCRT(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }

    /***
     * Setea información de este deocumento a partir de información del expediente asociado.
     * Xpande. Created by Gabriel Vila on 6/29/20.
     */
    public String getDataByExpediente(){

        String message = null;

        try{

            if (this.getZ_ExpedienteInt_ID() <= 0){
                return null;
            }

            this.traficoConfig = MZTraficoConfig.getDefault(getCtx(), null);

            MOrg org = new MOrg(getCtx(), this.getAD_Org_ID(), null);
            MOrgInfo orgInfo = org.getInfo();
            MLocation locationOrg = (MLocation) orgInfo.getC_Location();
            if ((locationOrg == null) || (locationOrg.get_ID() <= 0)){
                return "No se pudo obtener dirección para Organización de este Documento.";
            }

            NumberToString conv = new NumberToString();

            MZExpedienteInt expedienteInt = (MZExpedienteInt) this.getZ_ExpedienteInt();
            this.setTipoExpedienteInt(expedienteInt.getTipoExpedienteInt());
            this.setImportador_ID(expedienteInt.getImportador_ID());
            this.setExportador_ID(expedienteInt.getExportador_ID());
            this.setC_Currency_ID(expedienteInt.getC_Currency_ID());
            this.setPesoBruto(expedienteInt.getPesoBruto());
            this.setPesoNeto(expedienteInt.getPesoNeto());
            this.setVolume(expedienteInt.getVolume());
            this.setQtyEntered(expedienteInt.getQtyEntered());
            this.setTotalAmt(expedienteInt.getTotalAmt());
            this.setLiteralImporte(conv.getStringOfBigDecimal(this.getTotalAmt()));

            // Datos del remitente (Exportador)
            message = this.setDatosRemitente(expedienteInt);
            if (message != null){
                return message;
            }

            // Datos del destinatario (Importador)
            message = this.setDatosDestinatario(expedienteInt);
            if (message != null){
                return message;
            }

            this.saveEx();
        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return message;
    }

    /***
     * Setea información relacionada con el Remitente de este CRT (exportador)
     * @param expedienteInt
     * @return
     */
    private String setDatosRemitente(MZExpedienteInt expedienteInt) {

        String message = null;

        try{
            MBPartner partner = new MBPartner(getCtx(), this.getExportador_ID(), null);
            String infoPartner = partner.getName();
            MBPartnerLocation partnerLocation = new MBPartnerLocation(getCtx(), expedienteInt.getExportadorLoc_ID(), null);
            if ((partnerLocation == null) || (partnerLocation.get_ID() <= 0)){
                return "No se pudo obtener información de Dirección Fiscal del Remitente.";
            }
            MLocation location = (MLocation) partnerLocation.getC_Location();
            if ((location == null) || (location.get_ID() <= 0)){
                return "No se pudo obtener dirección para Remitente.";
            }
            MRegion region = (MRegion) location.getC_Region();
            if ((region == null) || (region.get_ID() <= 0)){
                return "No se pudo obtener Departamento Geográfico para Remitente.";
            }
            String addressRem = location.getAddress1();
            if (addressRem == null) addressRem = partnerLocation.getName();
            infoPartner += "\n" + addressRem;
            if (expedienteInt.getC_Country_ID() == this.traficoConfig.getC_Country_ID()){
                infoPartner += "\n" + region.getName() + "/" + ((MCountry) expedienteInt.getC_Country()).getName();
            }
            else {
                String cityRem = location.getCity();
                if (cityRem == null){
                    cityRem = "";
                }
                else {
                    cityRem += "/";
                }
                infoPartner += "\n" + cityRem + region.getName() + "/" + ((MCountry) expedienteInt.getC_Country()).getName();
            }
            infoPartner = infoPartner.toUpperCase();

            this.setRemitente(infoPartner);
        }
        catch (Exception e){
            throw new AdempiereException(e);
        }
        return message;
    }

    /***
     * Setea información relacionada con el Destinatario de este CRT (importador)
     * @param expedienteInt
     * @return
     */
    private String setDatosDestinatario(MZExpedienteInt expedienteInt) {

        String message = null;

        try{
            MBPartner partner = new MBPartner(getCtx(), this.getImportador_ID(), null);
            String infoPartner = partner.getName();
            MBPartnerLocation partnerLocation = new MBPartnerLocation(getCtx(), expedienteInt.getImportadorLoc_ID(), null);
            if ((partnerLocation == null) || (partnerLocation.get_ID() <= 0)){
                return "No se pudo obtener información de Dirección Fiscal del Destinatario.";
            }
            MLocation location = (MLocation) partnerLocation.getC_Location();
            if ((location == null) || (location.get_ID() <= 0)){
                return "No se pudo obtener dirección para Destinatario.";
            }
            MRegion region = (MRegion) location.getC_Region();
            if ((region == null) || (region.get_ID() <= 0)){
                return "No se pudo obtener Departamento Geográfico para Destinatario.";
            }
            MCountry country = new MCountry(getCtx(), expedienteInt.getC_Country_To_ID(), null);
            String addressRem = location.getAddress1();
            if (addressRem == null) addressRem = partnerLocation.getName();
            infoPartner += "\n" + addressRem;
            if (expedienteInt.getC_Country_To_ID() == this.traficoConfig.getC_Country_ID()){
                infoPartner += "\n" + region.getName() + "/" + country.getName();
            }
            else {
                String cityRem = location.getCity();
                if (cityRem == null){
                    cityRem = "";
                }
                else {
                    cityRem += "/";
                }
                infoPartner += "\n" + cityRem + region.getName() + "/" + country.getName();
            }

            // Datos de tributación
            X_C_TaxGroup taxGroup = (X_C_TaxGroup) partner.getC_TaxGroup();
            infoPartner += " " + taxGroup.getName() + ": " + partner.getTaxID();

            infoPartner = infoPartner.toUpperCase();

            this.setDestinatario(infoPartner);
            this.setConsignatario(infoPartner);
            this.setNotificacion(infoPartner);
        }
        catch (Exception e){
            throw new AdempiereException(e);
        }
        return message;
    }

    /***
     * Setea número de CRT según información del mismo.
     * Xpande. Created by Gabriel Vila on 6/30/20.
     * @return
     */
    public String setNumeroDocumento(){

        String message = null;

        try{

            String numeroDoc = "";

            // Codigo del Pais orígen del Trayecto
            



        }
        catch (Exception e){
            throw new AdempiereException(e);
        }
        return message;
    }
}


