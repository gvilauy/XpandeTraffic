package org.xpande.traffic.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Modelo para configuración de certificados de idoneidad en Tráfico
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 6/30/20.
 */
public class MZTraficoConfCert extends X_Z_TraficoConfCert{

    public MZTraficoConfCert(Properties ctx, int Z_TraficoConfCert_ID, String trxName) {
        super(ctx, Z_TraficoConfCert_ID, trxName);
    }

    public MZTraficoConfCert(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }
}
