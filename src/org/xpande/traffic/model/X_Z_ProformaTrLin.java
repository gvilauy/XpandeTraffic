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
/** Generated Model - DO NOT CHANGE */
package org.xpande.traffic.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for Z_ProformaTrLin
 *  @author Adempiere (generated) 
 *  @version Release 3.9.1 - $Id$ */
public class X_Z_ProformaTrLin extends PO implements I_Z_ProformaTrLin, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210201L;

    /** Standard Constructor */
    public X_Z_ProformaTrLin (Properties ctx, int Z_ProformaTrLin_ID, String trxName)
    {
      super (ctx, Z_ProformaTrLin_ID, trxName);
      /** if (Z_ProformaTrLin_ID == 0)
        {
			setAmtSubtotal (Env.ZERO);
			setC_Tax_ID (0);
			setMontoExterno (Env.ZERO);
			setMontoFlete (Env.ZERO);
			setMontoInterno (Env.ZERO);
			setM_Product_ID (0);
			setPorcExterno (Env.ZERO);
			setPorcInterno (Env.ZERO);
			setTaxAmt (Env.ZERO);
			setTotalAmt (Env.ZERO);
			setZ_ProformaTransp_ID (0);
			setZ_ProformaTrLin_ID (0);
        } */
    }

    /** Load Constructor */
    public X_Z_ProformaTrLin (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_Z_ProformaTrLin[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set AmtSubtotal.
		@param AmtSubtotal 
		Subtotales para no mostrar impuestos incluídos
	  */
	public void setAmtSubtotal (BigDecimal AmtSubtotal)
	{
		set_Value (COLUMNNAME_AmtSubtotal, AmtSubtotal);
	}

	/** Get AmtSubtotal.
		@return Subtotales para no mostrar impuestos incluídos
	  */
	public BigDecimal getAmtSubtotal () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtSubtotal);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public I_C_Tax getC_Tax() throws RuntimeException
    {
		return (I_C_Tax)MTable.get(getCtx(), I_C_Tax.Table_Name)
			.getPO(getC_Tax_ID(), get_TrxName());	}

	/** Set Tax.
		@param C_Tax_ID 
		Tax identifier
	  */
	public void setC_Tax_ID (int C_Tax_ID)
	{
		if (C_Tax_ID < 1) 
			set_Value (COLUMNNAME_C_Tax_ID, null);
		else 
			set_Value (COLUMNNAME_C_Tax_ID, Integer.valueOf(C_Tax_ID));
	}

	/** Get Tax.
		@return Tax identifier
	  */
	public int getC_Tax_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Tax_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set MontoExterno.
		@param MontoExterno 
		Monto Externo
	  */
	public void setMontoExterno (BigDecimal MontoExterno)
	{
		set_Value (COLUMNNAME_MontoExterno, MontoExterno);
	}

	/** Get MontoExterno.
		@return Monto Externo
	  */
	public BigDecimal getMontoExterno () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MontoExterno);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set MontoFlete.
		@param MontoFlete 
		Monto de Flete
	  */
	public void setMontoFlete (BigDecimal MontoFlete)
	{
		set_Value (COLUMNNAME_MontoFlete, MontoFlete);
	}

	/** Get MontoFlete.
		@return Monto de Flete
	  */
	public BigDecimal getMontoFlete () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MontoFlete);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set MontoInterno.
		@param MontoInterno 
		Monto interno
	  */
	public void setMontoInterno (BigDecimal MontoInterno)
	{
		set_Value (COLUMNNAME_MontoInterno, MontoInterno);
	}

	/** Get MontoInterno.
		@return Monto interno
	  */
	public BigDecimal getMontoInterno () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MontoInterno);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public I_M_Product getM_Product() throws RuntimeException
    {
		return (I_M_Product)MTable.get(getCtx(), I_M_Product.Table_Name)
			.getPO(getM_Product_ID(), get_TrxName());	}

	/** Set Product.
		@param M_Product_ID 
		Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID)
	{
		if (M_Product_ID < 1) 
			set_Value (COLUMNNAME_M_Product_ID, null);
		else 
			set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
	}

	/** Get Product.
		@return Product, Service, Item
	  */
	public int getM_Product_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set PorcExterno.
		@param PorcExterno 
		Porcentaje Externo
	  */
	public void setPorcExterno (BigDecimal PorcExterno)
	{
		set_Value (COLUMNNAME_PorcExterno, PorcExterno);
	}

	/** Get PorcExterno.
		@return Porcentaje Externo
	  */
	public BigDecimal getPorcExterno () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PorcExterno);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PorcInterno.
		@param PorcInterno 
		Porcentaje Interno
	  */
	public void setPorcInterno (BigDecimal PorcInterno)
	{
		set_Value (COLUMNNAME_PorcInterno, PorcInterno);
	}

	/** Get PorcInterno.
		@return Porcentaje Interno
	  */
	public BigDecimal getPorcInterno () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PorcInterno);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Tax Amount.
		@param TaxAmt 
		Tax Amount for a document
	  */
	public void setTaxAmt (BigDecimal TaxAmt)
	{
		set_Value (COLUMNNAME_TaxAmt, TaxAmt);
	}

	/** Get Tax Amount.
		@return Tax Amount for a document
	  */
	public BigDecimal getTaxAmt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Total Amount.
		@param TotalAmt 
		Total Amount
	  */
	public void setTotalAmt (BigDecimal TotalAmt)
	{
		set_Value (COLUMNNAME_TotalAmt, TotalAmt);
	}

	/** Get Total Amount.
		@return Total Amount
	  */
	public BigDecimal getTotalAmt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Immutable Universally Unique Identifier.
		@param UUID 
		Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID)
	{
		set_Value (COLUMNNAME_UUID, UUID);
	}

	/** Get Immutable Universally Unique Identifier.
		@return Immutable Universally Unique Identifier
	  */
	public String getUUID () 
	{
		return (String)get_Value(COLUMNNAME_UUID);
	}

	public I_Z_ProformaTransp getZ_ProformaTransp() throws RuntimeException
    {
		return (I_Z_ProformaTransp)MTable.get(getCtx(), I_Z_ProformaTransp.Table_Name)
			.getPO(getZ_ProformaTransp_ID(), get_TrxName());	}

	/** Set Z_ProformaTransp ID.
		@param Z_ProformaTransp_ID Z_ProformaTransp ID	  */
	public void setZ_ProformaTransp_ID (int Z_ProformaTransp_ID)
	{
		if (Z_ProformaTransp_ID < 1) 
			set_Value (COLUMNNAME_Z_ProformaTransp_ID, null);
		else 
			set_Value (COLUMNNAME_Z_ProformaTransp_ID, Integer.valueOf(Z_ProformaTransp_ID));
	}

	/** Get Z_ProformaTransp ID.
		@return Z_ProformaTransp ID	  */
	public int getZ_ProformaTransp_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_ProformaTransp_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Z_ProformaTrLin ID.
		@param Z_ProformaTrLin_ID Z_ProformaTrLin ID	  */
	public void setZ_ProformaTrLin_ID (int Z_ProformaTrLin_ID)
	{
		if (Z_ProformaTrLin_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_Z_ProformaTrLin_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_Z_ProformaTrLin_ID, Integer.valueOf(Z_ProformaTrLin_ID));
	}

	/** Get Z_ProformaTrLin ID.
		@return Z_ProformaTrLin ID	  */
	public int getZ_ProformaTrLin_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_ProformaTrLin_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}