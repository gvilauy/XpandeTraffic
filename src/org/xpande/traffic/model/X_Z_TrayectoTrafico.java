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

/** Generated Model for Z_TrayectoTrafico
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_Z_TrayectoTrafico extends PO implements I_Z_TrayectoTrafico, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20191106L;

    /** Standard Constructor */
    public X_Z_TrayectoTrafico (Properties ctx, int Z_TrayectoTrafico_ID, String trxName)
    {
      super (ctx, Z_TrayectoTrafico_ID, trxName);
      /** if (Z_TrayectoTrafico_ID == 0)
        {
			setC_Country_ID (0);
			setC_Country_To_ID (0);
			setName (null);
			setZ_TrayectoTrafico_ID (0);
        } */
    }

    /** Load Constructor */
    public X_Z_TrayectoTrafico (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_Z_TrayectoTrafico[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_C_Country getC_Country() throws RuntimeException
    {
		return (I_C_Country)MTable.get(getCtx(), I_C_Country.Table_Name)
			.getPO(getC_Country_ID(), get_TrxName());	}

	/** Set Country.
		@param C_Country_ID 
		Country 
	  */
	public void setC_Country_ID (int C_Country_ID)
	{
		if (C_Country_ID < 1) 
			set_Value (COLUMNNAME_C_Country_ID, null);
		else 
			set_Value (COLUMNNAME_C_Country_ID, Integer.valueOf(C_Country_ID));
	}

	/** Get Country.
		@return Country 
	  */
	public int getC_Country_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Country_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_Country_To_ID.
		@param C_Country_To_ID 
		Pais destino
	  */
	public void setC_Country_To_ID (int C_Country_To_ID)
	{
		if (C_Country_To_ID < 1) 
			set_Value (COLUMNNAME_C_Country_To_ID, null);
		else 
			set_Value (COLUMNNAME_C_Country_To_ID, Integer.valueOf(C_Country_To_ID));
	}

	/** Get C_Country_To_ID.
		@return Pais destino
	  */
	public int getC_Country_To_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Country_To_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
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

	/** Set Z_TrayectoTrafico ID.
		@param Z_TrayectoTrafico_ID Z_TrayectoTrafico ID	  */
	public void setZ_TrayectoTrafico_ID (int Z_TrayectoTrafico_ID)
	{
		if (Z_TrayectoTrafico_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_Z_TrayectoTrafico_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_Z_TrayectoTrafico_ID, Integer.valueOf(Z_TrayectoTrafico_ID));
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