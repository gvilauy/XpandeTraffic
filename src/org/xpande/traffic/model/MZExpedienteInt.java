package org.xpande.traffic.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Modeolo para expediente internacionales de tráfico.
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 11/6/19.
 */
public class MZExpedienteInt extends X_Z_ExpedienteInt {

    public MZExpedienteInt(Properties ctx, int Z_ExpedienteInt_ID, String trxName) {
        super(ctx, Z_ExpedienteInt_ID, trxName);
    }

    public MZExpedienteInt(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }
}
