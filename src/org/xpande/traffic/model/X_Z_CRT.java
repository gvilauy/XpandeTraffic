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

/** Generated Model for Z_CRT
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_Z_CRT extends PO implements I_Z_CRT, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200702L;

    /** Standard Constructor */
    public X_Z_CRT (Properties ctx, int Z_CRT_ID, String trxName)
    {
      super (ctx, Z_CRT_ID, trxName);
      /** if (Z_CRT_ID == 0)
        {
			setDateDoc (new Timestamp( System.currentTimeMillis() ));
			setEstadoCRT (null);
// NUEVO
			setZ_CRT_ID (0);
			setZ_ExpedienteInt_ID (0);
        } */
    }

    /** Load Constructor */
    public X_Z_CRT (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_Z_CRT[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set AmtFleteDest.
		@param AmtFleteDest 
		Monto flete destinatario en Tráfico
	  */
	public void setAmtFleteDest (BigDecimal AmtFleteDest)
	{
		set_Value (COLUMNNAME_AmtFleteDest, AmtFleteDest);
	}

	/** Get AmtFleteDest.
		@return Monto flete destinatario en Tráfico
	  */
	public BigDecimal getAmtFleteDest () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtFleteDest);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AmtFleteExterno.
		@param AmtFleteExterno 
		Monto flete externo en Tráfico
	  */
	public void setAmtFleteExterno (BigDecimal AmtFleteExterno)
	{
		set_Value (COLUMNNAME_AmtFleteExterno, AmtFleteExterno);
	}

	/** Get AmtFleteExterno.
		@return Monto flete externo en Tráfico
	  */
	public BigDecimal getAmtFleteExterno () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtFleteExterno);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AmtFleteRemit.
		@param AmtFleteRemit 
		Monto flete remitente en Tráfico
	  */
	public void setAmtFleteRemit (BigDecimal AmtFleteRemit)
	{
		set_Value (COLUMNNAME_AmtFleteRemit, AmtFleteRemit);
	}

	/** Get AmtFleteRemit.
		@return Monto flete remitente en Tráfico
	  */
	public BigDecimal getAmtFleteRemit () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtFleteRemit);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AmtOtroDest.
		@param AmtOtroDest 
		Monto otros destinatario
	  */
	public void setAmtOtroDest (BigDecimal AmtOtroDest)
	{
		set_Value (COLUMNNAME_AmtOtroDest, AmtOtroDest);
	}

	/** Get AmtOtroDest.
		@return Monto otros destinatario
	  */
	public BigDecimal getAmtOtroDest () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtOtroDest);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AmtOtroRemit.
		@param AmtOtroRemit 
		Monto otros remitente en Tráfico
	  */
	public void setAmtOtroRemit (BigDecimal AmtOtroRemit)
	{
		set_Value (COLUMNNAME_AmtOtroRemit, AmtOtroRemit);
	}

	/** Get AmtOtroRemit.
		@return Monto otros remitente en Tráfico
	  */
	public BigDecimal getAmtOtroRemit () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtOtroRemit);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AmtReembolso.
		@param AmtReembolso 
		Monto reembolso
	  */
	public void setAmtReembolso (BigDecimal AmtReembolso)
	{
		set_Value (COLUMNNAME_AmtReembolso, AmtReembolso);
	}

	/** Get AmtReembolso.
		@return Monto reembolso
	  */
	public BigDecimal getAmtReembolso () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtReembolso);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AmtTotalDest.
		@param AmtTotalDest 
		Monto total destinatario en Tráfico
	  */
	public void setAmtTotalDest (BigDecimal AmtTotalDest)
	{
		set_Value (COLUMNNAME_AmtTotalDest, AmtTotalDest);
	}

	/** Get AmtTotalDest.
		@return Monto total destinatario en Tráfico
	  */
	public BigDecimal getAmtTotalDest () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtTotalDest);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AmtTotalRemit.
		@param AmtTotalRemit 
		Monto total remitente en Tráfico
	  */
	public void setAmtTotalRemit (BigDecimal AmtTotalRemit)
	{
		set_Value (COLUMNNAME_AmtTotalRemit, AmtTotalRemit);
	}

	/** Get AmtTotalRemit.
		@return Monto total remitente en Tráfico
	  */
	public BigDecimal getAmtTotalRemit () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtTotalRemit);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Anexos.
		@param Anexos 
		Información de anexos para Tráfico
	  */
	public void setAnexos (String Anexos)
	{
		set_Value (COLUMNNAME_Anexos, Anexos);
	}

	/** Get Anexos.
		@return Información de anexos para Tráfico
	  */
	public String getAnexos () 
	{
		return (String)get_Value(COLUMNNAME_Anexos);
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

	/** Set ClaseBultos.
		@param ClaseBultos 
		Información de cantidad y clase de bultos para Tráfico
	  */
	public void setClaseBultos (String ClaseBultos)
	{
		set_Value (COLUMNNAME_ClaseBultos, ClaseBultos);
	}

	/** Get ClaseBultos.
		@return Información de cantidad y clase de bultos para Tráfico
	  */
	public String getClaseBultos () 
	{
		return (String)get_Value(COLUMNNAME_ClaseBultos);
	}

	/** Set Consignatario.
		@param Consignatario 
		Información de Consignatario para Tráfico
	  */
	public void setConsignatario (String Consignatario)
	{
		set_Value (COLUMNNAME_Consignatario, Consignatario);
	}

	/** Get Consignatario.
		@return Información de Consignatario para Tráfico
	  */
	public String getConsignatario () 
	{
		return (String)get_Value(COLUMNNAME_Consignatario);
	}

	/** Set Document Date.
		@param DateDoc 
		Date of the Document
	  */
	public void setDateDoc (Timestamp DateDoc)
	{
		set_Value (COLUMNNAME_DateDoc, DateDoc);
	}

	/** Get Document Date.
		@return Date of the Document
	  */
	public Timestamp getDateDoc () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateDoc);
	}

	/** Set Declaraciones.
		@param Declaraciones 
		Información de declaraciones para Tráfico
	  */
	public void setDeclaraciones (String Declaraciones)
	{
		set_Value (COLUMNNAME_Declaraciones, Declaraciones);
	}

	/** Get Declaraciones.
		@return Información de declaraciones para Tráfico
	  */
	public String getDeclaraciones () 
	{
		return (String)get_Value(COLUMNNAME_Declaraciones);
	}

	/** Set Destinatario.
		@param Destinatario 
		Información de Destinatario para Tráfico
	  */
	public void setDestinatario (String Destinatario)
	{
		set_Value (COLUMNNAME_Destinatario, Destinatario);
	}

	/** Get Destinatario.
		@return Información de Destinatario para Tráfico
	  */
	public String getDestinatario () 
	{
		return (String)get_Value(COLUMNNAME_Destinatario);
	}

	/** Set DocumentNoRef.
		@param DocumentNoRef 
		Numero de documento referenciado
	  */
	public void setDocumentNoRef (String DocumentNoRef)
	{
		set_Value (COLUMNNAME_DocumentNoRef, DocumentNoRef);
	}

	/** Get DocumentNoRef.
		@return Numero de documento referenciado
	  */
	public String getDocumentNoRef () 
	{
		return (String)get_Value(COLUMNNAME_DocumentNoRef);
	}

	/** EstadoCRT AD_Reference_ID=1000070 */
	public static final int ESTADOCRT_AD_Reference_ID=1000070;
	/** NUEVO = NUEVO */
	public static final String ESTADOCRT_NUEVO = "NUEVO";
	/** EN EJECUCION = EJECUCION */
	public static final String ESTADOCRT_ENEJECUCION = "EJECUCION";
	/** CERRADO = CERRADO */
	public static final String ESTADOCRT_CERRADO = "CERRADO";
	/** Set EstadoCRT.
		@param EstadoCRT 
		Estado de un documento de CRT
	  */
	public void setEstadoCRT (String EstadoCRT)
	{

		set_Value (COLUMNNAME_EstadoCRT, EstadoCRT);
	}

	/** Get EstadoCRT.
		@return Estado de un documento de CRT
	  */
	public String getEstadoCRT () 
	{
		return (String)get_Value(COLUMNNAME_EstadoCRT);
	}

	/** Set Exportador_ID.
		@param Exportador_ID 
		Socio de Negocio Exportador
	  */
	public void setExportador_ID (int Exportador_ID)
	{
		if (Exportador_ID < 1) 
			set_Value (COLUMNNAME_Exportador_ID, null);
		else 
			set_Value (COLUMNNAME_Exportador_ID, Integer.valueOf(Exportador_ID));
	}

	/** Get Exportador_ID.
		@return Socio de Negocio Exportador
	  */
	public int getExportador_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Exportador_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Importador_ID.
		@param Importador_ID 
		Socio de Negocio Importador
	  */
	public void setImportador_ID (int Importador_ID)
	{
		if (Importador_ID < 1) 
			set_Value (COLUMNNAME_Importador_ID, null);
		else 
			set_Value (COLUMNNAME_Importador_ID, Integer.valueOf(Importador_ID));
	}

	/** Get Importador_ID.
		@return Socio de Negocio Importador
	  */
	public int getImportador_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Importador_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Instrucciones.
		@param Instrucciones 
		Información de instrucciones para Tráfico
	  */
	public void setInstrucciones (String Instrucciones)
	{
		set_Value (COLUMNNAME_Instrucciones, Instrucciones);
	}

	/** Get Instrucciones.
		@return Información de instrucciones para Tráfico
	  */
	public String getInstrucciones () 
	{
		return (String)get_Value(COLUMNNAME_Instrucciones);
	}

	/** Set LiteralImporte.
		@param LiteralImporte 
		Literal importe
	  */
	public void setLiteralImporte (String LiteralImporte)
	{
		set_Value (COLUMNNAME_LiteralImporte, LiteralImporte);
	}

	/** Get LiteralImporte.
		@return Literal importe
	  */
	public String getLiteralImporte () 
	{
		return (String)get_Value(COLUMNNAME_LiteralImporte);
	}

	/** Set LugarEntrega.
		@param LugarEntrega 
		Información de lugar de entrega para Tráfico
	  */
	public void setLugarEntrega (String LugarEntrega)
	{
		set_Value (COLUMNNAME_LugarEntrega, LugarEntrega);
	}

	/** Get LugarEntrega.
		@return Información de lugar de entrega para Tráfico
	  */
	public String getLugarEntrega () 
	{
		return (String)get_Value(COLUMNNAME_LugarEntrega);
	}

	/** Set MonedaFlete_ID.
		@param MonedaFlete_ID 
		ID de moneda de flete en Tráfico
	  */
	public void setMonedaFlete_ID (int MonedaFlete_ID)
	{
		if (MonedaFlete_ID < 1) 
			set_Value (COLUMNNAME_MonedaFlete_ID, null);
		else 
			set_Value (COLUMNNAME_MonedaFlete_ID, Integer.valueOf(MonedaFlete_ID));
	}

	/** Get MonedaFlete_ID.
		@return ID de moneda de flete en Tráfico
	  */
	public int getMonedaFlete_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_MonedaFlete_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Notificacion.
		@param Notificacion 
		Información de notificación para Tráfico
	  */
	public void setNotificacion (String Notificacion)
	{
		set_Value (COLUMNNAME_Notificacion, Notificacion);
	}

	/** Get Notificacion.
		@return Información de notificación para Tráfico
	  */
	public String getNotificacion () 
	{
		return (String)get_Value(COLUMNNAME_Notificacion);
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

	/** Set PorteadoresSuc.
		@param PorteadoresSuc 
		Información de porteadores sucesivos para Tráfico
	  */
	public void setPorteadoresSuc (String PorteadoresSuc)
	{
		set_Value (COLUMNNAME_PorteadoresSuc, PorteadoresSuc);
	}

	/** Get PorteadoresSuc.
		@return Información de porteadores sucesivos para Tráfico
	  */
	public String getPorteadoresSuc () 
	{
		return (String)get_Value(COLUMNNAME_PorteadoresSuc);
	}

	/** Set PorteadorMerc.
		@param PorteadorMerc 
		Información de porteador de mercaderia
	  */
	public void setPorteadorMerc (String PorteadorMerc)
	{
		set_Value (COLUMNNAME_PorteadorMerc, PorteadorMerc);
	}

	/** Get PorteadorMerc.
		@return Información de porteador de mercaderia
	  */
	public String getPorteadorMerc () 
	{
		return (String)get_Value(COLUMNNAME_PorteadorMerc);
	}

	/** Set ProcessButton.
		@param ProcessButton ProcessButton	  */
	public void setProcessButton (String ProcessButton)
	{
		set_Value (COLUMNNAME_ProcessButton, ProcessButton);
	}

	/** Get ProcessButton.
		@return ProcessButton	  */
	public String getProcessButton () 
	{
		return (String)get_Value(COLUMNNAME_ProcessButton);
	}

	/** Set ProcessButton2.
		@param ProcessButton2 
		Botón de Proceso
	  */
	public void setProcessButton2 (String ProcessButton2)
	{
		set_Value (COLUMNNAME_ProcessButton2, ProcessButton2);
	}

	/** Get ProcessButton2.
		@return Botón de Proceso
	  */
	public String getProcessButton2 () 
	{
		return (String)get_Value(COLUMNNAME_ProcessButton2);
	}

	/** Set ProcessButton3.
		@param ProcessButton3 
		Botón para proceso
	  */
	public void setProcessButton3 (String ProcessButton3)
	{
		set_Value (COLUMNNAME_ProcessButton3, ProcessButton3);
	}

	/** Get ProcessButton3.
		@return Botón para proceso
	  */
	public String getProcessButton3 () 
	{
		return (String)get_Value(COLUMNNAME_ProcessButton3);
	}

	/** Set ProcessButton4.
		@param ProcessButton4 
		Botón de Proceso
	  */
	public void setProcessButton4 (String ProcessButton4)
	{
		set_Value (COLUMNNAME_ProcessButton4, ProcessButton4);
	}

	/** Get ProcessButton4.
		@return Botón de Proceso
	  */
	public String getProcessButton4 () 
	{
		return (String)get_Value(COLUMNNAME_ProcessButton4);
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

	/** Set Remitente.
		@param Remitente 
		Información del remitente para Tráfico
	  */
	public void setRemitente (String Remitente)
	{
		set_Value (COLUMNNAME_Remitente, Remitente);
	}

	/** Get Remitente.
		@return Información del remitente para Tráfico
	  */
	public String getRemitente () 
	{
		return (String)get_Value(COLUMNNAME_Remitente);
	}

	/** Set Description.
		@param Text Description	  */
	public void setText (String Text)
	{
		set_Value (COLUMNNAME_Text, Text);
	}

	/** Get Description.
		@return Description	  */
	public String getText () 
	{
		return (String)get_Value(COLUMNNAME_Text);
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

	/** Set Z_CRT ID.
		@param Z_CRT_ID Z_CRT ID	  */
	public void setZ_CRT_ID (int Z_CRT_ID)
	{
		if (Z_CRT_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_Z_CRT_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_Z_CRT_ID, Integer.valueOf(Z_CRT_ID));
	}

	/** Get Z_CRT ID.
		@return Z_CRT ID	  */
	public int getZ_CRT_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_CRT_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_Z_ExpedienteInt getZ_ExpedienteInt() throws RuntimeException
    {
		return (I_Z_ExpedienteInt)MTable.get(getCtx(), I_Z_ExpedienteInt.Table_Name)
			.getPO(getZ_ExpedienteInt_ID(), get_TrxName());	}

	/** Set Z_ExpedienteInt ID.
		@param Z_ExpedienteInt_ID Z_ExpedienteInt ID	  */
	public void setZ_ExpedienteInt_ID (int Z_ExpedienteInt_ID)
	{
		if (Z_ExpedienteInt_ID < 1) 
			set_Value (COLUMNNAME_Z_ExpedienteInt_ID, null);
		else 
			set_Value (COLUMNNAME_Z_ExpedienteInt_ID, Integer.valueOf(Z_ExpedienteInt_ID));
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

	public I_Z_TrayectoTrafLoc getZ_TrayectoTrafLoc() throws RuntimeException
    {
		return (I_Z_TrayectoTrafLoc)MTable.get(getCtx(), I_Z_TrayectoTrafLoc.Table_Name)
			.getPO(getZ_TrayectoTrafLoc_ID(), get_TrxName());	}

	/** Set Z_TrayectoTrafLoc ID.
		@param Z_TrayectoTrafLoc_ID Z_TrayectoTrafLoc ID	  */
	public void setZ_TrayectoTrafLoc_ID (int Z_TrayectoTrafLoc_ID)
	{
		if (Z_TrayectoTrafLoc_ID < 1) 
			set_Value (COLUMNNAME_Z_TrayectoTrafLoc_ID, null);
		else 
			set_Value (COLUMNNAME_Z_TrayectoTrafLoc_ID, Integer.valueOf(Z_TrayectoTrafLoc_ID));
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