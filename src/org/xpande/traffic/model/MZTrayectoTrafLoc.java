package org.xpande.traffic.model;

import org.compiere.model.MCountry;
import org.compiere.model.MLocation;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Modelo para configuración de Lugares de emisión de documentación para Tráfico.
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 7/2/20.
 */
public class MZTrayectoTrafLoc extends X_Z_TrayectoTrafLoc{

    public MZTrayectoTrafLoc(Properties ctx, int Z_TrayectoTrafLoc_ID, String trxName) {
        super(ctx, Z_TrayectoTrafLoc_ID, trxName);
    }

    public MZTrayectoTrafLoc(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }

    @Override
    protected boolean beforeSave(boolean newRecord) {

        // Armo string de lugar de emisión para documentación.
        if ((newRecord) || (is_ValueChanged(X_Z_TrayectoTrafLoc.COLUMNNAME_C_Location_ID))){
            MLocation location = (MLocation) this.getC_Location();
            String city = location.getCity();
            if (city == null) city ="";
            String region = location.getRegionName();
            if (region == null) region = "";
            String pais = "";
            if (location.getC_Country_ID() > 0){
                MCountry country = (MCountry) location.getC_Country();
                pais = country.getName();
            }
            String lugarEmision = city + "/" + region + "/" + pais;

            // Seteo texto de lugar de emisión para documentacion.
            this.setName(lugarEmision.toUpperCase());
        }

        return true;
    }
}
