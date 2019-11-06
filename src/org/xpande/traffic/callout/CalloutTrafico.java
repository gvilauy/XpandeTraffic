package org.xpande.traffic.callout;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.xpande.traffic.model.MZTraficoConfig;
import org.xpande.traffic.model.MZTrayectoTrafico;
import org.xpande.traffic.model.X_Z_ExpedienteInt;

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


}
