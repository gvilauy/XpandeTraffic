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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for Z_ExpedienteInt
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_Z_ExpedienteInt extends PO implements I_Z_ExpedienteInt, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20191106L;

    /** Standard Constructor */
    public X_Z_ExpedienteInt (Properties ctx, int Z_ExpedienteInt_ID, String trxName)
    {
      super (ctx, Z_ExpedienteInt_ID, trxName);
      /** if (Z_ExpedienteInt_ID == 0)
        {
			setC_City_ID (0);
			setC_City_To_ID (0);
			setC_Country_ID (0);
			setC_Country_To_ID (0);
			setC_Currency_ID (0);
			setColetaMercaderia (false);
// N
			setConsolidado (false);
// N
			setC_UOM_Volume_ID (0);
			setC_UOM_Weight_ID (0);
			setDocVisto (false);
// N
			setEnRepresentacion (false);
// N
			setEnTransito (false);
// N
			setEsPeligroso (false);
// N
			setEstadoExp (null);
// NUEVO
			setFechaApertura (new Timestamp( System.currentTimeMillis() ));
// @#Date@
			setIsSatisfied (false);
// N
			setTipoCobroExp (null);
			setTipoExpedienteInt (null);
			setValue (null);
			setZ_ExpedienteInt_ID (0);
			setZ_TrayectoTrafico_ID (0);
        } */
    }

    /** Load Constructor */
    public X_Z_ExpedienteInt (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_Z_ExpedienteInt[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_C_BPartner getBill_BPartner() throws RuntimeException
    {
		return (I_C_BPartner)MTable.get(getCtx(), I_C_BPartner.Table_Name)
			.getPO(getBill_BPartner_ID(), get_TrxName());	}

	/** Set Invoice Partner.
		@param Bill_BPartner_ID 
		Business Partner to be invoiced
	  */
	public void setBill_BPartner_ID (int Bill_BPartner_ID)
	{
		if (Bill_BPartner_ID < 1) 
			set_Value (COLUMNNAME_Bill_BPartner_ID, null);
		else 
			set_Value (COLUMNNAME_Bill_BPartner_ID, Integer.valueOf(Bill_BPartner_ID));
	}

	/** Get Invoice Partner.
		@return Business Partner to be invoiced
	  */
	public int getBill_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Bill_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_City getC_City() throws RuntimeException
    {
		return (I_C_City)MTable.get(getCtx(), I_C_City.Table_Name)
			.getPO(getC_City_ID(), get_TrxName());	}

	/** Set City.
		@param C_City_ID 
		City
	  */
	public void setC_City_ID (int C_City_ID)
	{
		if (C_City_ID < 1) 
			set_Value (COLUMNNAME_C_City_ID, null);
		else 
			set_Value (COLUMNNAME_C_City_ID, Integer.valueOf(C_City_ID));
	}

	/** Get City.
		@return City
	  */
	public int getC_City_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_City_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_City getC_City_To() throws RuntimeException
    {
		return (I_C_City)MTable.get(getCtx(), I_C_City.Table_Name)
			.getPO(getC_City_To_ID(), get_TrxName());	}

	/** Set C_City_To_ID.
		@param C_City_To_ID 
		Ciudad Destino
	  */
	public void setC_City_To_ID (int C_City_To_ID)
	{
		if (C_City_To_ID < 1) 
			set_Value (COLUMNNAME_C_City_To_ID, null);
		else 
			set_Value (COLUMNNAME_C_City_To_ID, Integer.valueOf(C_City_To_ID));
	}

	/** Get C_City_To_ID.
		@return Ciudad Destino
	  */
	public int getC_City_To_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_City_To_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	public I_C_Currency getC_Currency() throws RuntimeException
    {
		return (I_C_Currency)MTable.get(getCtx(), I_C_Currency.Table_Name)
			.getPO(getC_Currency_ID(), get_TrxName());	}

	/** Set Currency.
		@param C_Currency_ID 
		The Currency for this record
	  */
	public void setC_Currency_ID (int C_Currency_ID)
	{
		if (C_Currency_ID < 1) 
			set_Value (COLUMNNAME_C_Currency_ID, null);
		else 
			set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
	}

	/** Get Currency.
		@return The Currency for this record
	  */
	public int getC_Currency_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ColetaMercaderia.
		@param ColetaMercaderia 
		Si se coleta o no mercadería en tráfico
	  */
	public void setColetaMercaderia (boolean ColetaMercaderia)
	{
		set_Value (COLUMNNAME_ColetaMercaderia, Boolean.valueOf(ColetaMercaderia));
	}

	/** Get ColetaMercaderia.
		@return Si se coleta o no mercadería en tráfico
	  */
	public boolean isColetaMercaderia () 
	{
		Object oo = get_Value(COLUMNNAME_ColetaMercaderia);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Consolidado.
		@param Consolidado 
		Si esta o no consolidado
	  */
	public void setConsolidado (boolean Consolidado)
	{
		set_Value (COLUMNNAME_Consolidado, Boolean.valueOf(Consolidado));
	}

	/** Get Consolidado.
		@return Si esta o no consolidado
	  */
	public boolean isConsolidado () 
	{
		Object oo = get_Value(COLUMNNAME_Consolidado);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	public I_C_UOM getC_UOM_Volume() throws RuntimeException
    {
		return (I_C_UOM)MTable.get(getCtx(), I_C_UOM.Table_Name)
			.getPO(getC_UOM_Volume_ID(), get_TrxName());	}

	/** Set UOM for Volume.
		@param C_UOM_Volume_ID 
		Standard Unit of Measure for Volume
	  */
	public void setC_UOM_Volume_ID (int C_UOM_Volume_ID)
	{
		if (C_UOM_Volume_ID < 1) 
			set_Value (COLUMNNAME_C_UOM_Volume_ID, null);
		else 
			set_Value (COLUMNNAME_C_UOM_Volume_ID, Integer.valueOf(C_UOM_Volume_ID));
	}

	/** Get UOM for Volume.
		@return Standard Unit of Measure for Volume
	  */
	public int getC_UOM_Volume_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_Volume_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_UOM getC_UOM_Weight() throws RuntimeException
    {
		return (I_C_UOM)MTable.get(getCtx(), I_C_UOM.Table_Name)
			.getPO(getC_UOM_Weight_ID(), get_TrxName());	}

	/** Set UOM for Weight.
		@param C_UOM_Weight_ID 
		Standard Unit of Measure for Weight
	  */
	public void setC_UOM_Weight_ID (int C_UOM_Weight_ID)
	{
		if (C_UOM_Weight_ID < 1) 
			set_Value (COLUMNNAME_C_UOM_Weight_ID, null);
		else 
			set_Value (COLUMNNAME_C_UOM_Weight_ID, Integer.valueOf(C_UOM_Weight_ID));
	}

	/** Get UOM for Weight.
		@return Standard Unit of Measure for Weight
	  */
	public int getC_UOM_Weight_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_Weight_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set DescBultos.
		@param DescBultos 
		Descripción de Bultos
	  */
	public void setDescBultos (String DescBultos)
	{
		set_Value (COLUMNNAME_DescBultos, DescBultos);
	}

	/** Get DescBultos.
		@return Descripción de Bultos
	  */
	public String getDescBultos () 
	{
		return (String)get_Value(COLUMNNAME_DescBultos);
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

	/** Set DocVisto.
		@param DocVisto 
		Si un determinado documento fue visto o no
	  */
	public void setDocVisto (boolean DocVisto)
	{
		set_Value (COLUMNNAME_DocVisto, Boolean.valueOf(DocVisto));
	}

	/** Get DocVisto.
		@return Si un determinado documento fue visto o no
	  */
	public boolean isDocVisto () 
	{
		Object oo = get_Value(COLUMNNAME_DocVisto);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set EnRepresentacion.
		@param EnRepresentacion 
		SI un expediente de tráfico es en Representación o no
	  */
	public void setEnRepresentacion (boolean EnRepresentacion)
	{
		set_Value (COLUMNNAME_EnRepresentacion, Boolean.valueOf(EnRepresentacion));
	}

	/** Get EnRepresentacion.
		@return SI un expediente de tráfico es en Representación o no
	  */
	public boolean isEnRepresentacion () 
	{
		Object oo = get_Value(COLUMNNAME_EnRepresentacion);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set EnTransito.
		@param EnTransito 
		SI un expediente de tráfico esta en Tránsito o no
	  */
	public void setEnTransito (boolean EnTransito)
	{
		set_Value (COLUMNNAME_EnTransito, Boolean.valueOf(EnTransito));
	}

	/** Get EnTransito.
		@return SI un expediente de tráfico esta en Tránsito o no
	  */
	public boolean isEnTransito () 
	{
		Object oo = get_Value(COLUMNNAME_EnTransito);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set EsPeligroso.
		@param EsPeligroso 
		Si es peligroso o no
	  */
	public void setEsPeligroso (boolean EsPeligroso)
	{
		set_Value (COLUMNNAME_EsPeligroso, Boolean.valueOf(EsPeligroso));
	}

	/** Get EsPeligroso.
		@return Si es peligroso o no
	  */
	public boolean isEsPeligroso () 
	{
		Object oo = get_Value(COLUMNNAME_EsPeligroso);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** EstadoCargaExp AD_Reference_ID=1000063 */
	public static final int ESTADOCARGAEXP_AD_Reference_ID=1000063;
	/** CRUZADO = CRUZADO */
	public static final String ESTADOCARGAEXP_CRUZADO = "CRUZADO";
	/** EN FRONTERA = FRONTERA */
	public static final String ESTADOCARGAEXP_ENFRONTERA = "FRONTERA";
	/** OTRO = OTRO */
	public static final String ESTADOCARGAEXP_OTRO = "OTRO";
	/** Set EstadoCargaExp.
		@param EstadoCargaExp 
		Estado de Carga en expediente de Tráfico
	  */
	public void setEstadoCargaExp (String EstadoCargaExp)
	{

		set_Value (COLUMNNAME_EstadoCargaExp, EstadoCargaExp);
	}

	/** Get EstadoCargaExp.
		@return Estado de Carga en expediente de Tráfico
	  */
	public String getEstadoCargaExp () 
	{
		return (String)get_Value(COLUMNNAME_EstadoCargaExp);
	}

	/** EstadoExp AD_Reference_ID=1000064 */
	public static final int ESTADOEXP_AD_Reference_ID=1000064;
	/** NUEVO = NUEVO */
	public static final String ESTADOEXP_NUEVO = "NUEVO";
	/** EN EJECUCION = EJECUCION */
	public static final String ESTADOEXP_ENEJECUCION = "EJECUCION";
	/** ENTREGADO = ENTREGADO */
	public static final String ESTADOEXP_ENTREGADO = "ENTREGADO";
	/** CERRADO = CERRADO */
	public static final String ESTADOEXP_CERRADO = "CERRADO";
	/** Set EstadoExp.
		@param EstadoExp 
		Estado de un expediente de tráfico
	  */
	public void setEstadoExp (String EstadoExp)
	{

		set_Value (COLUMNNAME_EstadoExp, EstadoExp);
	}

	/** Get EstadoExp.
		@return Estado de un expediente de tráfico
	  */
	public String getEstadoExp () 
	{
		return (String)get_Value(COLUMNNAME_EstadoExp);
	}

	/** Set FechaApertura.
		@param FechaApertura 
		Fecha de Apertura de un Documento
	  */
	public void setFechaApertura (Timestamp FechaApertura)
	{
		set_Value (COLUMNNAME_FechaApertura, FechaApertura);
	}

	/** Get FechaApertura.
		@return Fecha de Apertura de un Documento
	  */
	public Timestamp getFechaApertura () 
	{
		return (Timestamp)get_Value(COLUMNNAME_FechaApertura);
	}

	/** Set FechaDescarga.
		@param FechaDescarga 
		Fecha de descarga de mercadería
	  */
	public void setFechaDescarga (Timestamp FechaDescarga)
	{
		set_Value (COLUMNNAME_FechaDescarga, FechaDescarga);
	}

	/** Get FechaDescarga.
		@return Fecha de descarga de mercadería
	  */
	public Timestamp getFechaDescarga () 
	{
		return (Timestamp)get_Value(COLUMNNAME_FechaDescarga);
	}

	/** Set FechaDUA.
		@param FechaDUA 
		Fecha DUA en Tráfico
	  */
	public void setFechaDUA (Timestamp FechaDUA)
	{
		set_Value (COLUMNNAME_FechaDUA, FechaDUA);
	}

	/** Get FechaDUA.
		@return Fecha DUA en Tráfico
	  */
	public Timestamp getFechaDUA () 
	{
		return (Timestamp)get_Value(COLUMNNAME_FechaDUA);
	}

	/** Set FechaEmbarque.
		@param FechaEmbarque 
		Fecha de embarque de mercadería
	  */
	public void setFechaEmbarque (Timestamp FechaEmbarque)
	{
		set_Value (COLUMNNAME_FechaEmbarque, FechaEmbarque);
	}

	/** Get FechaEmbarque.
		@return Fecha de embarque de mercadería
	  */
	public Timestamp getFechaEmbarque () 
	{
		return (Timestamp)get_Value(COLUMNNAME_FechaEmbarque);
	}

	/** Set FechaEmbarqueReal.
		@param FechaEmbarqueReal 
		Fecha de embarque real de mercadería
	  */
	public void setFechaEmbarqueReal (Timestamp FechaEmbarqueReal)
	{
		set_Value (COLUMNNAME_FechaEmbarqueReal, FechaEmbarqueReal);
	}

	/** Get FechaEmbarqueReal.
		@return Fecha de embarque real de mercadería
	  */
	public Timestamp getFechaEmbarqueReal () 
	{
		return (Timestamp)get_Value(COLUMNNAME_FechaEmbarqueReal);
	}

	/** Set IsSatisfied.
		@param IsSatisfied 
		Si esta o no satisfecha
	  */
	public void setIsSatisfied (boolean IsSatisfied)
	{
		set_Value (COLUMNNAME_IsSatisfied, Boolean.valueOf(IsSatisfied));
	}

	/** Get IsSatisfied.
		@return Si esta o no satisfecha
	  */
	public boolean isSatisfied () 
	{
		Object oo = get_Value(COLUMNNAME_IsSatisfied);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set NroDUA.
		@param NroDUA 
		Número DUA para expediente de Tráfico
	  */
	public void setNroDUA (String NroDUA)
	{
		set_Value (COLUMNNAME_NroDUA, NroDUA);
	}

	/** Get NroDUA.
		@return Número DUA para expediente de Tráfico
	  */
	public String getNroDUA () 
	{
		return (String)get_Value(COLUMNNAME_NroDUA);
	}

	/** Set NroOnu.
		@param NroOnu 
		Número ONU para mercaderías peligrosas en Tráfico
	  */
	public void setNroOnu (String NroOnu)
	{
		set_Value (COLUMNNAME_NroOnu, NroOnu);
	}

	/** Get NroOnu.
		@return Número ONU para mercaderías peligrosas en Tráfico
	  */
	public String getNroOnu () 
	{
		return (String)get_Value(COLUMNNAME_NroOnu);
	}

	/** Set OrigenMercaderia.
		@param OrigenMercaderia 
		Descripción del orígen de Mercaderias
	  */
	public void setOrigenMercaderia (String OrigenMercaderia)
	{
		set_Value (COLUMNNAME_OrigenMercaderia, OrigenMercaderia);
	}

	/** Get OrigenMercaderia.
		@return Descripción del orígen de Mercaderias
	  */
	public String getOrigenMercaderia () 
	{
		return (String)get_Value(COLUMNNAME_OrigenMercaderia);
	}

	/** Set PesoBruto.
		@param PesoBruto 
		Peso Bruto de Mercaderías
	  */
	public void setPesoBruto (BigDecimal PesoBruto)
	{
		set_Value (COLUMNNAME_PesoBruto, PesoBruto);
	}

	/** Get PesoBruto.
		@return Peso Bruto de Mercaderías
	  */
	public BigDecimal getPesoBruto () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PesoBruto);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PesoNeto.
		@param PesoNeto 
		Peso Neto de Mercaderías
	  */
	public void setPesoNeto (BigDecimal PesoNeto)
	{
		set_Value (COLUMNNAME_PesoNeto, PesoNeto);
	}

	/** Get PesoNeto.
		@return Peso Neto de Mercaderías
	  */
	public BigDecimal getPesoNeto () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PesoNeto);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Quantity.
		@param QtyEntered 
		The Quantity Entered is based on the selected UoM
	  */
	public void setQtyEntered (BigDecimal QtyEntered)
	{
		set_Value (COLUMNNAME_QtyEntered, QtyEntered);
	}

	/** Get Quantity.
		@return The Quantity Entered is based on the selected UoM
	  */
	public BigDecimal getQtyEntered () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyEntered);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Reference No.
		@param ReferenceNo 
		Your customer or vendor number at the Business Partner's site
	  */
	public void setReferenceNo (String ReferenceNo)
	{
		set_Value (COLUMNNAME_ReferenceNo, ReferenceNo);
	}

	/** Get Reference No.
		@return Your customer or vendor number at the Business Partner's site
	  */
	public String getReferenceNo () 
	{
		return (String)get_Value(COLUMNNAME_ReferenceNo);
	}

	/** TipoCobroExp AD_Reference_ID=1000061 */
	public static final int TIPOCOBROEXP_AD_Reference_ID=1000061;
	/** DESTINO = DESTINO */
	public static final String TIPOCOBROEXP_DESTINO = "DESTINO";
	/** ORIGEN = ORIGEN */
	public static final String TIPOCOBROEXP_ORIGEN = "ORIGEN";
	/** AMBOS = AMBOS */
	public static final String TIPOCOBROEXP_AMBOS = "AMBOS";
	/** Set TipoCobroExp.
		@param TipoCobroExp 
		Tipo de manera de cobro en un expediente de tráfico
	  */
	public void setTipoCobroExp (String TipoCobroExp)
	{

		set_Value (COLUMNNAME_TipoCobroExp, TipoCobroExp);
	}

	/** Get TipoCobroExp.
		@return Tipo de manera de cobro en un expediente de tráfico
	  */
	public String getTipoCobroExp () 
	{
		return (String)get_Value(COLUMNNAME_TipoCobroExp);
	}

	/** TipoExpedienteInt AD_Reference_ID=1000060 */
	public static final int TIPOEXPEDIENTEINT_AD_Reference_ID=1000060;
	/** IMPORTACION = IMPORTACION */
	public static final String TIPOEXPEDIENTEINT_IMPORTACION = "IMPORTACION";
	/** EXPORTACION = EXPORTACION */
	public static final String TIPOEXPEDIENTEINT_EXPORTACION = "EXPORTACION";
	/** Set TipoExpedienteInt.
		@param TipoExpedienteInt 
		Tipo de expediente de tráfico internacional
	  */
	public void setTipoExpedienteInt (String TipoExpedienteInt)
	{

		set_Value (COLUMNNAME_TipoExpedienteInt, TipoExpedienteInt);
	}

	/** Get TipoExpedienteInt.
		@return Tipo de expediente de tráfico internacional
	  */
	public String getTipoExpedienteInt () 
	{
		return (String)get_Value(COLUMNNAME_TipoExpedienteInt);
	}

	/** Set TipoMercaderiaExp.
		@param TipoMercaderiaExp 
		Tipo de mercadería descripta en un expediente de tráfico
	  */
	public void setTipoMercaderiaExp (String TipoMercaderiaExp)
	{
		set_Value (COLUMNNAME_TipoMercaderiaExp, TipoMercaderiaExp);
	}

	/** Get TipoMercaderiaExp.
		@return Tipo de mercadería descripta en un expediente de tráfico
	  */
	public String getTipoMercaderiaExp () 
	{
		return (String)get_Value(COLUMNNAME_TipoMercaderiaExp);
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

	/** Set Volume.
		@param Volume 
		Volume of a product
	  */
	public void setVolume (BigDecimal Volume)
	{
		set_Value (COLUMNNAME_Volume, Volume);
	}

	/** Get Volume.
		@return Volume of a product
	  */
	public BigDecimal getVolume () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Volume);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public org.xpande.traffic.model.I_Z_AduanaTrafico getZ_AduanaTrafico() throws RuntimeException
    {
		return (org.xpande.traffic.model.I_Z_AduanaTrafico)MTable.get(getCtx(), org.xpande.traffic.model.I_Z_AduanaTrafico.Table_Name)
			.getPO(getZ_AduanaTrafico_ID(), get_TrxName());	}

	/** Set Z_AduanaTrafico ID.
		@param Z_AduanaTrafico_ID Z_AduanaTrafico ID	  */
	public void setZ_AduanaTrafico_ID (int Z_AduanaTrafico_ID)
	{
		if (Z_AduanaTrafico_ID < 1) 
			set_Value (COLUMNNAME_Z_AduanaTrafico_ID, null);
		else 
			set_Value (COLUMNNAME_Z_AduanaTrafico_ID, Integer.valueOf(Z_AduanaTrafico_ID));
	}

	/** Get Z_AduanaTrafico ID.
		@return Z_AduanaTrafico ID	  */
	public int getZ_AduanaTrafico_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_AduanaTrafico_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.xpande.traffic.model.I_Z_AduanaTrafico getZ_AduanaTrafico_To() throws RuntimeException
    {
		return (org.xpande.traffic.model.I_Z_AduanaTrafico)MTable.get(getCtx(), org.xpande.traffic.model.I_Z_AduanaTrafico.Table_Name)
			.getPO(getZ_AduanaTrafico_To_ID(), get_TrxName());	}

	/** Set Z_AduanaTrafico_To_ID.
		@param Z_AduanaTrafico_To_ID 
		Aduana Destino
	  */
	public void setZ_AduanaTrafico_To_ID (int Z_AduanaTrafico_To_ID)
	{
		if (Z_AduanaTrafico_To_ID < 1) 
			set_Value (COLUMNNAME_Z_AduanaTrafico_To_ID, null);
		else 
			set_Value (COLUMNNAME_Z_AduanaTrafico_To_ID, Integer.valueOf(Z_AduanaTrafico_To_ID));
	}

	/** Get Z_AduanaTrafico_To_ID.
		@return Aduana Destino
	  */
	public int getZ_AduanaTrafico_To_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_AduanaTrafico_To_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Z_ExpedienteInt ID.
		@param Z_ExpedienteInt_ID Z_ExpedienteInt ID	  */
	public void setZ_ExpedienteInt_ID (int Z_ExpedienteInt_ID)
	{
		if (Z_ExpedienteInt_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_Z_ExpedienteInt_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_Z_ExpedienteInt_ID, Integer.valueOf(Z_ExpedienteInt_ID));
	}

	/** Get Z_ExpedienteInt ID.
		@return Z_ExpedienteInt ID	  */
	public int getZ_ExpedienteInt_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_ExpedienteInt_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Z_TipoBultoCom ID.
		@param Z_TipoBultoCom_ID Z_TipoBultoCom ID	  */
	public void setZ_TipoBultoCom_ID (int Z_TipoBultoCom_ID)
	{
		if (Z_TipoBultoCom_ID < 1) 
			set_Value (COLUMNNAME_Z_TipoBultoCom_ID, null);
		else 
			set_Value (COLUMNNAME_Z_TipoBultoCom_ID, Integer.valueOf(Z_TipoBultoCom_ID));
	}

	/** Get Z_TipoBultoCom ID.
		@return Z_TipoBultoCom ID	  */
	public int getZ_TipoBultoCom_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_TipoBultoCom_ID);
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