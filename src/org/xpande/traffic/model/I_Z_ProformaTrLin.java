/******************************************************************************
 * Product: ADempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2006-2017 ADempiere Foundation, All Rights Reserved.         *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * or (at your option) any later version.										*
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * or via info@adempiere.net or http://www.adempiere.net/license.html         *
 *****************************************************************************/
package org.xpande.traffic.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for Z_ProformaTrLin
 *  @author Adempiere (generated) 
 *  @version Release 3.9.1
 */
public interface I_Z_ProformaTrLin 
{

    /** TableName=Z_ProformaTrLin */
    public static final String Table_Name = "Z_ProformaTrLin";

    /** AD_Table_ID=1000346 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name AmtSubtotal */
    public static final String COLUMNNAME_AmtSubtotal = "AmtSubtotal";

	/** Set AmtSubtotal.
	  * Subtotales para no mostrar impuestos incluídos
	  */
	public void setAmtSubtotal (BigDecimal AmtSubtotal);

	/** Get AmtSubtotal.
	  * Subtotales para no mostrar impuestos incluídos
	  */
	public BigDecimal getAmtSubtotal();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name C_Tax_ID */
    public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";

	/** Set Tax.
	  * Tax identifier
	  */
	public void setC_Tax_ID (int C_Tax_ID);

	/** Get Tax.
	  * Tax identifier
	  */
	public int getC_Tax_ID();

	public I_C_Tax getC_Tax() throws RuntimeException;

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name MontoExterno */
    public static final String COLUMNNAME_MontoExterno = "MontoExterno";

	/** Set MontoExterno.
	  * Monto Externo
	  */
	public void setMontoExterno (BigDecimal MontoExterno);

	/** Get MontoExterno.
	  * Monto Externo
	  */
	public BigDecimal getMontoExterno();

    /** Column name MontoFlete */
    public static final String COLUMNNAME_MontoFlete = "MontoFlete";

	/** Set MontoFlete.
	  * Monto de Flete
	  */
	public void setMontoFlete (BigDecimal MontoFlete);

	/** Get MontoFlete.
	  * Monto de Flete
	  */
	public BigDecimal getMontoFlete();

    /** Column name MontoInterno */
    public static final String COLUMNNAME_MontoInterno = "MontoInterno";

	/** Set MontoInterno.
	  * Monto interno
	  */
	public void setMontoInterno (BigDecimal MontoInterno);

	/** Get MontoInterno.
	  * Monto interno
	  */
	public BigDecimal getMontoInterno();

    /** Column name M_Product_ID */
    public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

	/** Set Product.
	  * Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID);

	/** Get Product.
	  * Product, Service, Item
	  */
	public int getM_Product_ID();

	public I_M_Product getM_Product() throws RuntimeException;

    /** Column name PorcExterno */
    public static final String COLUMNNAME_PorcExterno = "PorcExterno";

	/** Set PorcExterno.
	  * Porcentaje Externo
	  */
	public void setPorcExterno (BigDecimal PorcExterno);

	/** Get PorcExterno.
	  * Porcentaje Externo
	  */
	public BigDecimal getPorcExterno();

    /** Column name PorcInterno */
    public static final String COLUMNNAME_PorcInterno = "PorcInterno";

	/** Set PorcInterno.
	  * Porcentaje Interno
	  */
	public void setPorcInterno (BigDecimal PorcInterno);

	/** Get PorcInterno.
	  * Porcentaje Interno
	  */
	public BigDecimal getPorcInterno();

    /** Column name TaxAmt */
    public static final String COLUMNNAME_TaxAmt = "TaxAmt";

	/** Set Tax Amount.
	  * Tax Amount for a document
	  */
	public void setTaxAmt (BigDecimal TaxAmt);

	/** Get Tax Amount.
	  * Tax Amount for a document
	  */
	public BigDecimal getTaxAmt();

    /** Column name TotalAmt */
    public static final String COLUMNNAME_TotalAmt = "TotalAmt";

	/** Set Total Amount.
	  * Total Amount
	  */
	public void setTotalAmt (BigDecimal TotalAmt);

	/** Get Total Amount.
	  * Total Amount
	  */
	public BigDecimal getTotalAmt();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name UUID */
    public static final String COLUMNNAME_UUID = "UUID";

	/** Set Immutable Universally Unique Identifier.
	  * Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID);

	/** Get Immutable Universally Unique Identifier.
	  * Immutable Universally Unique Identifier
	  */
	public String getUUID();

    /** Column name Z_ProformaTransp_ID */
    public static final String COLUMNNAME_Z_ProformaTransp_ID = "Z_ProformaTransp_ID";

	/** Set Z_ProformaTransp ID	  */
	public void setZ_ProformaTransp_ID (int Z_ProformaTransp_ID);

	/** Get Z_ProformaTransp ID	  */
	public int getZ_ProformaTransp_ID();

	public I_Z_ProformaTransp getZ_ProformaTransp() throws RuntimeException;

    /** Column name Z_ProformaTrLin_ID */
    public static final String COLUMNNAME_Z_ProformaTrLin_ID = "Z_ProformaTrLin_ID";

	/** Set Z_ProformaTrLin ID	  */
	public void setZ_ProformaTrLin_ID (int Z_ProformaTrLin_ID);

	/** Get Z_ProformaTrLin ID	  */
	public int getZ_ProformaTrLin_ID();
}
