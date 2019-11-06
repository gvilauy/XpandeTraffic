package org.xpande.traffic.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Modelo para definición de aduanas para tráfico.
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 11/6/19.
 */
public class MZAduanaTrafico extends X_Z_AduanaTrafico {

    public MZAduanaTrafico(Properties ctx, int Z_AduanaTrafico_ID, String trxName) {
        super(ctx, Z_AduanaTrafico_ID, trxName);
    }

    public MZAduanaTrafico(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }
}
