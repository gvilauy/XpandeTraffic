package org.xpande.traffic.callout;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.util.Env;
import org.xpande.traffic.model.*;
import org.zkoss.zhtml.Big;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Properties;

/**
 * Callouts de Tráfico.
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 11/6/19.
 */
public class CalloutTrafico extends CalloutEngine {


    /***
     * Callout para setear información de un expediente de tráfico. según trayecto recibido.
     * Xpande. Created by Gabriel Vila on 11/6/19.
     * @param ctx
     * @param WindowNo
     * @param mTab
     * @param mField
     * @param value
     * @return
     */
    public String setInfoExpByTrayecto(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

        if ((value == null) || (((Integer) value).intValue() <= 0)){
            mTab.setValue(X_Z_ExpedienteInt.COLUMNNAME_TipoExpedienteInt, null);
            mTab.setValue(X_Z_ExpedienteInt.COLUMNNAME_C_Country_ID, null);
            mTab.setValue(X_Z_ExpedienteInt.COLUMNNAME_C_Country_To_ID, null);
            return "";
        }

        int recordID = ((Integer) value).intValue();

        MZTrayectoTrafico trayectoTrafico = new MZTrayectoTrafico(ctx, recordID, null);
        MZTraficoConfig traficoConfig = MZTraficoConfig.getDefault(ctx, null);

        if (trayectoTrafico.getC_Country_ID() == traficoConfig.getC_Country_ID()){
            mTab.setValue(X_Z_ExpedienteInt.COLUMNNAME_TipoExpedienteInt, X_Z_ExpedienteInt.TIPOEXPEDIENTEINT_EXPORTACION);
        }
        else{
            mTab.setValue(X_Z_ExpedienteInt.COLUMNNAME_TipoExpedienteInt, X_Z_ExpedienteInt.TIPOEXPEDIENTEINT_IMPORTACION);
        }

        mTab.setValue(X_Z_ExpedienteInt.COLUMNNAME_C_Country_ID, trayectoTrafico.getC_Country_ID());
        mTab.setValue(X_Z_ExpedienteInt.COLUMNNAME_C_Country_To_ID, trayectoTrafico.getC_Country_To_ID());

        return "";
    }

    /***
     * Callout para setear información de un CRT según ID de expediente de tráfico recibido.
     * Xpande. Created by Gabriel Vila on 6/29/20.
     * @param ctx
     * @param WindowNo
     * @param mTab
     * @param mField
     * @param value
     * @return
     */
    public String setInfoCrtByExp(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

        if ((value == null) || (((Integer) value).intValue() <= 0)){
            mTab.setValue(X_Z_CRT.COLUMNNAME_TipoExpedienteInt, null);
            mTab.setValue(X_Z_CRT.COLUMNNAME_Importador_ID, null);
            mTab.setValue(X_Z_CRT.COLUMNNAME_Exportador_ID, null);
            return "";
        }

        int recordID = ((Integer) value).intValue();

        MZExpedienteInt expedienteInt = new MZExpedienteInt(ctx, recordID, null);

        mTab.setValue(X_Z_CRT.COLUMNNAME_TipoExpedienteInt, expedienteInt.getTipoExpedienteInt());
        mTab.setValue(X_Z_CRT.COLUMNNAME_Importador_ID, expedienteInt.getImportador_ID());
        mTab.setValue(X_Z_CRT.COLUMNNAME_Exportador_ID, expedienteInt.getExportador_ID());

        return "";
    }

    /***
     * Callout para setear información de una Proforma Comercial según ID de expediente de tráfico recibido.
     * Xpande. Created by Gabriel Vila on 1/31/21.
     * @param ctx
     * @param WindowNo
     * @param mTab
     * @param mField
     * @param value
     * @return
     */
    public String setInfoProformaByExp(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

        if ((value == null) || (((Integer) value).intValue() <= 0)){
            mTab.setValue(X_Z_ProformaTransp.COLUMNNAME_ImportadorLoc_ID, null);
            mTab.setValue(X_Z_ProformaTransp.COLUMNNAME_Exportador_ID, null);
            mTab.setValue(X_Z_ProformaTransp.COLUMNNAME_QtyEntered, null);
            mTab.setValue(X_Z_ProformaTransp.COLUMNNAME_Z_TipoBultoCom_ID, null);
            mTab.setValue(X_Z_ProformaTransp.COLUMNNAME_Z_Incoterm_ID, null);
            mTab.setValue(X_Z_ProformaTransp.COLUMNNAME_C_UOM_Weight_ID, null);
            mTab.setValue(X_Z_ProformaTransp.COLUMNNAME_PesoBruto, null);
            mTab.setValue(X_Z_ProformaTransp.COLUMNNAME_PesoNeto, null);
            mTab.setValue(X_Z_ProformaTransp.COLUMNNAME_TotalAmt, null);
            mTab.setValue(X_Z_ProformaTransp.COLUMNNAME_C_Currency_ID_To, null);
            return "";
        }

        int recordID = ((Integer) value).intValue();

        MZExpedienteInt expedienteInt = new MZExpedienteInt(ctx, recordID, null);

        mTab.setValue(X_Z_ProformaTransp.COLUMNNAME_ImportadorLoc_ID, expedienteInt.getImportadorLoc_ID());
        mTab.setValue(X_Z_ProformaTransp.COLUMNNAME_Exportador_ID, expedienteInt.getExportador_ID());
        mTab.setValue(X_Z_ProformaTransp.COLUMNNAME_QtyEntered, expedienteInt.getQtyEntered());

        if (expedienteInt.getZ_TipoBultoCom_ID() > 0){
            mTab.setValue(X_Z_ProformaTransp.COLUMNNAME_Z_TipoBultoCom_ID, expedienteInt.getZ_TipoBultoCom_ID());
        }

        if (expedienteInt.getZ_Incoterm_ID() > 0){
            mTab.setValue(X_Z_ProformaTransp.COLUMNNAME_Z_Incoterm_ID, expedienteInt.getZ_Incoterm_ID());
        }

        if (expedienteInt.getC_UOM_Weight_ID() > 0){
            mTab.setValue(X_Z_ProformaTransp.COLUMNNAME_C_UOM_Weight_ID, expedienteInt.getC_UOM_Weight_ID());
        }

        mTab.setValue(X_Z_ProformaTransp.COLUMNNAME_PesoBruto, expedienteInt.getPesoBruto());
        mTab.setValue(X_Z_ProformaTransp.COLUMNNAME_PesoNeto, expedienteInt.getPesoNeto());
        mTab.setValue(X_Z_ProformaTransp.COLUMNNAME_TotalAmt, expedienteInt.getTotalAmt());
        mTab.setValue(X_Z_ProformaTransp.COLUMNNAME_C_Currency_ID_To, expedienteInt.getC_Currency_ID());

        return "";
    }

    /***
     * Al digitar monto nacional, internacional, o porcentaje nacional, internacional, el ssitema calcula los demas
     * valores.
     * Xpande. Created by Gabriel Vila on 2/1/21.
     * @param ctx
     * @param WindowNo
     * @param mTab
     * @param mField
     * @param value
     * @return
     */
    public String setLineMontoTerritorio(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

        if (isCalloutActive()) return "";

        if ((value == null) || (value.toString().trim().equalsIgnoreCase(""))){
            return "";
        }

        BigDecimal valor = (BigDecimal) value;
        if (valor == null) valor = Env.ZERO;

        BigDecimal montoExterno = Env.ZERO;
        BigDecimal montoInterno = Env.ZERO;
        BigDecimal montoFlete = Env.ZERO;
        BigDecimal porcInterno = Env.ZERO;
        BigDecimal porcExterno = Env.ZERO;

        String column = mField.getColumnName();

        if (column.equalsIgnoreCase("MontoFlete")){
            mTab.setValue("MontoInterno", Env.ZERO);
            mTab.setValue("MontoExterno", Env.ZERO);
            mTab.setValue("PorcInterno", Env.ZERO);
            mTab.setValue("PorcExterno", Env.ZERO);
            mTab.setValue("AmtSubtotal", Env.ZERO);
            mTab.setValue("TaxAmt", Env.ZERO);
            mTab.setValue("TotalAmt", Env.ZERO);
        }
        else if (column.equalsIgnoreCase("MontoInterno")){

            montoInterno = valor;
            montoExterno = (BigDecimal) mTab.getValue("MontoExterno");
            montoFlete = (BigDecimal) mTab.getValue("MontoFlete");

            if (montoFlete == null) montoFlete = Env.ZERO;
            if (montoFlete.compareTo(Env.ZERO) > 0){
                montoExterno = montoFlete.subtract(montoInterno);
                mTab.setValue("MontoExterno", montoExterno);
            }
            else{
                montoFlete = montoInterno.add(montoExterno);
                mTab.setValue("MontoFlete", montoFlete);
            }

            porcInterno = (montoInterno.multiply(Env.ONEHUNDRED)).divide(montoFlete, RoundingMode.HALF_UP);
            porcExterno = (montoExterno.multiply(Env.ONEHUNDRED)).divide(montoFlete, RoundingMode.HALF_UP);
            mTab.setValue("PorcInterno", porcInterno);
            mTab.setValue("PorcExterno", porcExterno);
        }
        else if (column.equalsIgnoreCase("MontoExterno")){

            montoExterno = valor;
            montoInterno = (BigDecimal) mTab.getValue("MontoInterno");
            montoFlete = (BigDecimal) mTab.getValue("MontoFlete");

            if (montoFlete == null) montoFlete = Env.ZERO;
            if (montoFlete.compareTo(Env.ZERO) > 0){
                montoInterno = montoFlete.subtract(montoExterno);
                mTab.setValue("MontoInterno", montoInterno);
            }
            else{
                montoFlete = montoExterno.add(montoInterno);
                mTab.setValue("MontoFlete", montoFlete);
            }

            porcInterno = (montoInterno.multiply(Env.ONEHUNDRED)).divide(montoFlete, RoundingMode.HALF_UP);
            porcExterno = (montoExterno.multiply(Env.ONEHUNDRED)).divide(montoFlete, RoundingMode.HALF_UP);
            mTab.setValue("PorcInterno", porcInterno);
            mTab.setValue("PorcExterno", porcExterno);
        }
        else if (column.equalsIgnoreCase("PorcInterno")){

            porcInterno = valor;
            porcExterno = Env.ONEHUNDRED.subtract(porcInterno);

            montoFlete = (BigDecimal) mTab.getValue("MontoFlete");
            if (montoFlete == null) montoFlete = Env.ZERO;

            montoInterno = (porcInterno.multiply(montoFlete).setScale(2, RoundingMode.HALF_UP)).divide(Env.ONEHUNDRED, 2, RoundingMode.HALF_UP);
            montoExterno = montoFlete.subtract(montoInterno);

            mTab.setValue("PorcExterno", porcExterno);
            mTab.setValue("MontoInterno", montoInterno);
            mTab.setValue("MontoExterno", montoExterno);
        }
        else if (column.equalsIgnoreCase("PorcExterno")){

            porcExterno = valor;
            porcInterno = Env.ONEHUNDRED.subtract(porcExterno);

            montoFlete = (BigDecimal) mTab.getValue("MontoFlete");
            if (montoFlete == null) montoFlete = Env.ZERO;

            montoExterno = (porcExterno.multiply(montoFlete).setScale(2, RoundingMode.HALF_UP)).divide(Env.ONEHUNDRED, 2, RoundingMode.HALF_UP);
            montoInterno = montoFlete.subtract(montoExterno);

            mTab.setValue("PorcInterno", porcInterno);
            mTab.setValue("MontoInterno", montoInterno);
            mTab.setValue("MontoExterno", montoExterno);
        }

        return "";
    }
}
