package org.xpande.traffic.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Modelo para configuración de secuenciales de documentación en Tráfco.
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 6/30/20.
 */
public class MZTraficoConfSeq extends X_Z_TraficoConfSeq{

    public MZTraficoConfSeq(Properties ctx, int Z_TraficoConfSeq_ID, String trxName) {
        super(ctx, Z_TraficoConfSeq_ID, trxName);
    }

    public MZTraficoConfSeq(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }
}
