package org.xpande.traffic.model;

import org.compiere.model.Query;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Modelo para configuraciones de tráfico.
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 11/6/19.
 */
public class MZTraficoConfig extends X_Z_TraficoConfig {

    public MZTraficoConfig(Properties ctx, int Z_TraficoConfig_ID, String trxName) {
        super(ctx, Z_TraficoConfig_ID, trxName);
    }

    public MZTraficoConfig(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }

    /***
     * Obtiene modelo único de configuraciones de tráfico
     * Xpande. Created by Gabriel Vila on 11/6/19.
     * @param ctx
     * @param trxName
     * @return
     */
    public static MZTraficoConfig getDefault(Properties ctx, String trxName){

        MZTraficoConfig model = new Query(ctx, I_Z_TraficoConfig.Table_Name, "", trxName).first();

        return model;
    }

}
