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

/** Generated Model for Z_TrayectoTrafLoc
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_Z_TrayectoTrafLoc extends PO implements I_Z_TrayectoTrafLoc, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200702L;

    /** Standard Constructor */
    public X_Z_TrayectoTrafLoc (Properties ctx, int Z_TrayectoTrafLoc_ID, String trxName)
    {
      super (ctx, Z_TrayectoTrafLoc_ID, trxName);
      /** if (Z_TrayectoTrafLoc_ID == 0)
        {
			setC_Location_ID (0);
			setZ_TrayectoTrafico_ID (0);
			setZ_TrayectoTrafLoc_ID (0);
        } */
    }

    /** Load Constructor */
    public X_Z_TrayectoTrafLoc (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_Z_TrayectoTrafLoc[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_C_Location getC_Location() throws RuntimeException
    {
		return (I_C_Location)MTable.get(getCtx(), I_C_Location.Table_Name)
			.getPO(getC_Location_ID(), get_TrxName());	}

	/** Set Address.
		@param C_Location_ID 
		Location or Address
	  */
	public void setC_Location_ID (int C_Location_ID)
	{
		if (C_Location_ID < 1) 
			set_Value (COLUMNNAME_C_Location_ID, null);
		else 
			set_Value (COLUMNNAME_C_Location_ID, Integer.valueOf(C_Location_ID));
	}

	/** Get Address.
		@return Location or Address
	  */
	public int getC_Location_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Location_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Z_TrayectoTrafLoc ID.
		@param Z_TrayectoTrafLoc_ID Z_TrayectoTrafLoc ID	  */
	public void setZ_TrayectoTrafLoc_ID (int Z_TrayectoTrafLoc_ID)
	{
		if (Z_TrayectoTrafLoc_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_Z_TrayectoTrafLoc_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_Z_TrayectoTrafLoc_ID, Integer.valueOf(Z_TrayectoTrafLoc_ID));
	}

	/** Get Z_TrayectoTrafLoc ID.
		@return Z_TrayectoTrafLoc ID	  */
	public int getZ_TrayectoTrafLoc_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_TrayectoTrafLoc_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}