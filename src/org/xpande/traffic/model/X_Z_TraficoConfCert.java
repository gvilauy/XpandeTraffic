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

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for Z_TraficoConfCert
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_Z_TraficoConfCert extends PO implements I_Z_TraficoConfCert, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200630L;

    /** Standard Constructor */
    public X_Z_TraficoConfCert (Properties ctx, int Z_TraficoConfCert_ID, String trxName)
    {
      super (ctx, Z_TraficoConfCert_ID, trxName);
      /** if (Z_TraficoConfCert_ID == 0)
        {
			setAD_OrgTrx_ID (0);
			setValue (null);
			setZ_TraficoConfCert_ID (0);
			setZ_TraficoConfig_ID (0);
			setZ_TrayectoTrafico_ID (0);
        } */
    }

    /** Load Constructor */
    public X_Z_TraficoConfCert (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_Z_TraficoConfCert[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Trx Organization.
		@param AD_OrgTrx_ID 
		Performing or initiating organization
	  */
	public void setAD_OrgTrx_ID (int AD_OrgTrx_ID)
	{
		if (AD_OrgTrx_ID < 1) 
			set_Value (COLUMNNAME_AD_OrgTrx_ID, null);
		else 
			set_Value (COLUMNNAME_AD_OrgTrx_ID, Integer.valueOf(AD_OrgTrx_ID));
	}

	/** Get Trx Organization.
		@return Performing or initiating organization
	  */
	public int getAD_OrgTrx_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgTrx_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Search Key.
		@param Value 
		Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue () 
	{
		return (String)get_Value(COLUMNNAME_Value);
	}

	/** Set Z_TraficoConfCert ID.
		@param Z_TraficoConfCert_ID Z_TraficoConfCert ID	  */
	public void setZ_TraficoConfCert_ID (int Z_TraficoConfCert_ID)
	{
		if (Z_TraficoConfCert_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_Z_TraficoConfCert_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_Z_TraficoConfCert_ID, Integer.valueOf(Z_TraficoConfCert_ID));
	}

	/** Get Z_TraficoConfCert ID.
		@return Z_TraficoConfCert ID	  */
	public int getZ_TraficoConfCert_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_TraficoConfCert_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_Z_TraficoConfig getZ_TraficoConfig() throws RuntimeException
    {
		return (I_Z_TraficoConfig)MTable.get(getCtx(), I_Z_TraficoConfig.Table_Name)
			.getPO(getZ_TraficoConfig_ID(), get_TrxName());	}

	/** Set Z_TraficoConfig ID.
		@param Z_TraficoConfig_ID Z_TraficoConfig ID	  */
	public void setZ_TraficoConfig_ID (int Z_TraficoConfig_ID)
	{
		if (Z_TraficoConfig_ID < 1) 
			set_Value (COLUMNNAME_Z_TraficoConfig_ID, null);
		else 
			set_Value (COLUMNNAME_Z_TraficoConfig_ID, Integer.valueOf(Z_TraficoConfig_ID));
	}

	/** Get Z_TraficoConfig ID.
		@return Z_TraficoConfig ID	  */
	public int getZ_TraficoConfig_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_TraficoConfig_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_Z_TrayectoTrafico getZ_TrayectoTrafico() throws RuntimeException
    {
		return (I_Z_TrayectoTrafico)MTable.get(getCtx(), I_Z_TrayectoTrafico.Table_Name)
			.getPO(getZ_TrayectoTrafico_ID(), get_TrxName());	}

	/** Set Z_TrayectoTrafico ID.
		@param Z_TrayectoTrafico_ID Z_TrayectoTrafico ID	  */
	public void setZ_TrayectoTrafico_ID (int Z_TrayectoTrafico_ID)
	{
		if (Z_TrayectoTrafico_ID < 1) 
			set_Value (COLUMNNAME_Z_TrayectoTrafico_ID, null);
		else 
			set_Value (COLUMNNAME_Z_TrayectoTrafico_ID, Integer.valueOf(Z_TrayectoTrafico_ID));
	}

	/** Get Z_TrayectoTrafico ID.
		@return Z_TrayectoTrafico ID	  */
	public int getZ_TrayectoTrafico_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_TrayectoTrafico_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}