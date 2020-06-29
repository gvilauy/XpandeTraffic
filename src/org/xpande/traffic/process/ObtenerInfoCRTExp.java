package org.xpande.traffic.process;

import org.compiere.process.SvrProcess;
import org.xpande.traffic.model.MZCRT;

/**
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 6/29/20.
 */
public class ObtenerInfoCRTExp extends SvrProcess {

    MZCRT crt = null;

    @Override
    protected void prepare() {
        this.crt = new MZCRT(getCtx(), this.getRecord_ID(), get_TrxName());
    }

    @Override
    protected String doIt() throws Exception {

        // Cargo info en CRT a partir de info del expediente asociado al mismo.
        String message = this.crt.getDataByExpediente();

        if (message != null){
            return "@Error@ " + message;
        }

        return "OK";
    }
}
