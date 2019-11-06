package org.xpande.traffic.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Modelo para trayectos de tráfico.
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 11/6/19.
 */
public class MZTrayectoTrafico extends X_Z_TrayectoTrafico {

    public MZTrayectoTrafico(Properties ctx, int Z_TrayectoTrafico_ID, String trxName) {
        super(ctx, Z_TrayectoTrafico_ID, trxName);
    }

    public MZTrayectoTrafico(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }
}
