package org.xpande.traffic.model;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.*;
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
            MBPartner partnerRem = new MBPartner(getCtx(), this.getExportador_ID(), null);
            String infoRemitente = partnerRem.getName();
            MBPartnerLocation partnerLocationRem = new MBPartnerLocation(getCtx(), expedienteInt.getExportadorLoc_ID(), null);
            if ((partnerLocationRem == null) || (partnerLocationRem.get_ID() <= 0)){
                return "No se pudo obtener información de Dirección Fiscal del Remitente.";
            }
            MLocation locationRem = (MLocation) partnerLocationRem.getC_Location();
            if ((locationRem == null) || (locationRem.get_ID() <= 0)){
                return "No se pudo obtener dirección para Remitente.";
            }
            MRegion regionRem = (MRegion) locationRem.getC_Region();
            if ((regionRem == null) || (regionRem.get_ID() <= 0)){
                return "No se pudo obtener Departamento Geográfico para Remitente.";
            }

            String addressRem = locationRem.getAddress1();
            if (addressRem == null) addressRem = partnerLocationRem.getName();
            infoRemitente += "\n" + addressRem;

            if (expedienteInt.getC_Country_ID() == locationOrg.getC_Country_ID()){
                infoRemitente += "\n" + regionRem.getName() + "/" + ((MCountry) expedienteInt.getC_Country()).getName();
            }
            else {
                String cityRem = locationRem.getCity();
                if (cityRem == null){
                    cityRem = "";
                }
                else {
                    cityRem += "/";
                }
                infoRemitente += "\n" + cityRem + regionRem.getName() + "/" + ((MCountry) expedienteInt.getC_Country()).getName();
            }
            this.setRemitente(infoRemitente);

            this.saveEx();
        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return message;
    }

}


