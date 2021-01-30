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

/** Generated Model for Z_ProformaTransp
 *  @author Adempiere (generated) 
 *  @version Release 3.9.1 - $Id$ */
public class X_Z_ProformaTransp extends PO implements I_Z_ProformaTransp, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210130L;

    /** Standard Constructor */
    public X_Z_ProformaTransp (Properties ctx, int Z_ProformaTransp_ID, String trxName)
    {
      super (ctx, Z_ProformaTransp_ID, trxName);
      /** if (Z_ProformaTransp_ID == 0)
        {
			setAdValorem (false);
// N
			setAmtSubtotal (Env.ZERO);
			setC_Currency_ID (0);
			setC_DocType_ID (0);
			setC_UOM_Weight_ID (0);
			setDateDoc (new Timestamp( System.currentTimeMillis() ));
// @#Date@
			setDocAction (null);
// CO
			setDocStatus (null);
// DR
			setDocumentNo (null);
			setEnRepresentacion (false);
// N
			setGrandTotal (Env.ZERO);
			setImportador_ID (0);
			setImportadorLoc_ID (0);
			setIsApproved (false);
// N
			setProcessed (false);
// N
			setProcessing (false);
// N
			setTaxAmt (Env.ZERO);
			setTipoFormaPago (null);
			setZ_ExpedienteInt_ID (0);
			setZ_ProformaTransp_ID (0);
        } */
    }

    /** Load Constructor */
    public X_Z_ProformaTransp (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_Z_ProformaTransp[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set AdValorem.
		@param AdValorem 
		Si aplica o no Advalorem para comprobantes comerciales de Transporte Internacional
	  */
	public void setAdValorem (boolean AdValorem)
	{
		set_Value (COLUMNNAME_AdValorem, Boolean.valueOf(AdValorem));
	}

	/** Get AdValorem.
		@return Si aplica o no Advalorem para comprobantes comerciales de Transporte Internacional
	  */
	public boolean isAdValorem () 
	{
		Object oo = get_Value(COLUMNNAME_AdValorem);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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

	public I_C_Currency getC_Currency_To() throws RuntimeException
    {
		return (I_C_Currency)MTable.get(getCtx(), I_C_Currency.Table_Name)
			.getPO(getC_Currency_ID_To(), get_TrxName());	}

	/** Set Currency To.
		@param C_Currency_ID_To 
		Target currency
	  */
	public void setC_Currency_ID_To (int C_Currency_ID_To)
	{
		set_Value (COLUMNNAME_C_Currency_ID_To, Integer.valueOf(C_Currency_ID_To));
	}

	/** Get Currency To.
		@return Target currency
	  */
	public int getC_Currency_ID_To () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID_To);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_DocType getC_DocType() throws RuntimeException
    {
		return (I_C_DocType)MTable.get(getCtx(), I_C_DocType.Table_Name)
			.getPO(getC_DocType_ID(), get_TrxName());	}

	/** Set Document Type.
		@param C_DocType_ID 
		Document type or rules
	  */
	public void setC_DocType_ID (int C_DocType_ID)
	{
		if (C_DocType_ID < 0) 
			set_Value (COLUMNNAME_C_DocType_ID, null);
		else 
			set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
	}

	/** Get Document Type.
		@return Document type or rules
	  */
	public int getC_DocType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_PaymentTerm getC_PaymentTerm() throws RuntimeException
    {
		return (I_C_PaymentTerm)MTable.get(getCtx(), I_C_PaymentTerm.Table_Name)
			.getPO(getC_PaymentTerm_ID(), get_TrxName());	}

	/** Set Payment Term.
		@param C_PaymentTerm_ID 
		The terms of Payment (timing, discount)
	  */
	public void setC_PaymentTerm_ID (int C_PaymentTerm_ID)
	{
		if (C_PaymentTerm_ID < 1) 
			set_Value (COLUMNNAME_C_PaymentTerm_ID, null);
		else 
			set_Value (COLUMNNAME_C_PaymentTerm_ID, Integer.valueOf(C_PaymentTerm_ID));
	}

	/** Get Payment Term.
		@return The terms of Payment (timing, discount)
	  */
	public int getC_PaymentTerm_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_PaymentTerm_ID);
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

	/** DocAction AD_Reference_ID=135 */
	public static final int DOCACTION_AD_Reference_ID=135;
	/** Complete = CO */
	public static final String DOCACTION_Complete = "CO";
	/** Approve = AP */
	public static final String DOCACTION_Approve = "AP";
	/** Reject = RJ */
	public static final String DOCACTION_Reject = "RJ";
	/** Post = PO */
	public static final String DOCACTION_Post = "PO";
	/** Void = VO */
	public static final String DOCACTION_Void = "VO";
	/** Close = CL */
	public static final String DOCACTION_Close = "CL";
	/** Reverse - Correct = RC */
	public static final String DOCACTION_Reverse_Correct = "RC";
	/** Reverse - Accrual = RA */
	public static final String DOCACTION_Reverse_Accrual = "RA";
	/** Invalidate = IN */
	public static final String DOCACTION_Invalidate = "IN";
	/** Re-activate = RE */
	public static final String DOCACTION_Re_Activate = "RE";
	/** <None> = -- */
	public static final String DOCACTION_None = "--";
	/** Prepare = PR */
	public static final String DOCACTION_Prepare = "PR";
	/** Unlock = XL */
	public static final String DOCACTION_Unlock = "XL";
	/** Wait Complete = WC */
	public static final String DOCACTION_WaitComplete = "WC";
	/** Set Document Action.
		@param DocAction 
		The targeted status of the document
	  */
	public void setDocAction (String DocAction)
	{

		set_Value (COLUMNNAME_DocAction, DocAction);
	}

	/** Get Document Action.
		@return The targeted status of the document
	  */
	public String getDocAction () 
	{
		return (String)get_Value(COLUMNNAME_DocAction);
	}

	/** DocStatus AD_Reference_ID=131 */
	public static final int DOCSTATUS_AD_Reference_ID=131;
	/** Drafted = DR */
	public static final String DOCSTATUS_Drafted = "DR";
	/** Completed = CO */
	public static final String DOCSTATUS_Completed = "CO";
	/** Approved = AP */
	public static final String DOCSTATUS_Approved = "AP";
	/** Not Approved = NA */
	public static final String DOCSTATUS_NotApproved = "NA";
	/** Voided = VO */
	public static final String DOCSTATUS_Voided = "VO";
	/** Invalid = IN */
	public static final String DOCSTATUS_Invalid = "IN";
	/** Reversed = RE */
	public static final String DOCSTATUS_Reversed = "RE";
	/** Closed = CL */
	public static final String DOCSTATUS_Closed = "CL";
	/** Unknown = ?? */
	public static final String DOCSTATUS_Unknown = "??";
	/** In Progress = IP */
	public static final String DOCSTATUS_InProgress = "IP";
	/** Waiting Payment = WP */
	public static final String DOCSTATUS_WaitingPayment = "WP";
	/** Waiting Confirmation = WC */
	public static final String DOCSTATUS_WaitingConfirmation = "WC";
	/** Set Document Status.
		@param DocStatus 
		The current status of the document
	  */
	public void setDocStatus (String DocStatus)
	{

		set_Value (COLUMNNAME_DocStatus, DocStatus);
	}

	/** Get Document Status.
		@return The current status of the document
	  */
	public String getDocStatus () 
	{
		return (String)get_Value(COLUMNNAME_DocStatus);
	}

	/** Set Document No.
		@param DocumentNo 
		Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo)
	{
		set_Value (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo () 
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
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

	/** Set Grand Total.
		@param GrandTotal 
		Total amount of document
	  */
	public void setGrandTotal (BigDecimal GrandTotal)
	{
		set_Value (COLUMNNAME_GrandTotal, GrandTotal);
	}

	/** Get Grand Total.
		@return Total amount of document
	  */
	public BigDecimal getGrandTotal () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_GrandTotal);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set ImportadorLoc_ID.
		@param ImportadorLoc_ID 
		Localización del Socio de Negocio Importador
	  */
	public void setImportadorLoc_ID (int ImportadorLoc_ID)
	{
		if (ImportadorLoc_ID < 1) 
			set_Value (COLUMNNAME_ImportadorLoc_ID, null);
		else 
			set_Value (COLUMNNAME_ImportadorLoc_ID, Integer.valueOf(ImportadorLoc_ID));
	}

	/** Get ImportadorLoc_ID.
		@return Localización del Socio de Negocio Importador
	  */
	public int getImportadorLoc_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ImportadorLoc_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Approved.
		@param IsApproved 
		Indicates if this document requires approval
	  */
	public void setIsApproved (boolean IsApproved)
	{
		set_Value (COLUMNNAME_IsApproved, Boolean.valueOf(IsApproved));
	}

	/** Get Approved.
		@return Indicates if this document requires approval
	  */
	public boolean isApproved () 
	{
		Object oo = get_Value(COLUMNNAME_IsApproved);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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

	/** Set PorcAdValorem.
		@param PorcAdValorem 
		Porcentaje AdValorem
	  */
	public void setPorcAdValorem (BigDecimal PorcAdValorem)
	{
		set_Value (COLUMNNAME_PorcAdValorem, PorcAdValorem);
	}

	/** Get PorcAdValorem.
		@return Porcentaje AdValorem
	  */
	public BigDecimal getPorcAdValorem () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PorcAdValorem);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Processed.
		@param Processed 
		The document has been processed
	  */
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Process Now.
		@param Processing Process Now	  */
	public void setProcessing (boolean Processing)
	{
		set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
	}

	/** Get Process Now.
		@return Process Now	  */
	public boolean isProcessing () 
	{
		Object oo = get_Value(COLUMNNAME_Processing);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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

	/** Set Reference.
		@param Reference 
		Reference for this record
	  */
	public void setReference (String Reference)
	{
		set_Value (COLUMNNAME_Reference, Reference);
	}

	/** Get Reference.
		@return Reference for this record
	  */
	public String getReference () 
	{
		return (String)get_Value(COLUMNNAME_Reference);
	}

	/** Set SubTotAdValor.
		@param SubTotAdValor 
		Subtotal para AdValorem en Transporte Internacional
	  */
	public void setSubTotAdValor (BigDecimal SubTotAdValor)
	{
		set_Value (COLUMNNAME_SubTotAdValor, SubTotAdValor);
	}

	/** Get SubTotAdValor.
		@return Subtotal para AdValorem en Transporte Internacional
	  */
	public BigDecimal getSubTotAdValor () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_SubTotAdValor);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set TaxAdValorem_ID.
		@param TaxAdValorem_ID 
		Impuesto para AdValorem en Tranporte Internacional
	  */
	public void setTaxAdValorem_ID (int TaxAdValorem_ID)
	{
		if (TaxAdValorem_ID < 1) 
			set_Value (COLUMNNAME_TaxAdValorem_ID, null);
		else 
			set_Value (COLUMNNAME_TaxAdValorem_ID, Integer.valueOf(TaxAdValorem_ID));
	}

	/** Get TaxAdValorem_ID.
		@return Impuesto para AdValorem en Tranporte Internacional
	  */
	public int getTaxAdValorem_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TaxAdValorem_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set TaxAmtAdValor.
		@param TaxAmtAdValor 
		Monto de impuesto para AdValorem
	  */
	public void setTaxAmtAdValor (BigDecimal TaxAmtAdValor)
	{
		set_Value (COLUMNNAME_TaxAmtAdValor, TaxAmtAdValor);
	}

	/** Get TaxAmtAdValor.
		@return Monto de impuesto para AdValorem
	  */
	public BigDecimal getTaxAmtAdValor () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxAmtAdValor);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** TipoFormaPago AD_Reference_ID=1000035 */
	public static final int TIPOFORMAPAGO_AD_Reference_ID=1000035;
	/** CONTADO = CONTADO */
	public static final String TIPOFORMAPAGO_CONTADO = "CONTADO";
	/** CREDITO = CREDITO */
	public static final String TIPOFORMAPAGO_CREDITO = "CREDITO";
	/** Set TipoFormaPago.
		@param TipoFormaPago 
		Tipo de Forma de Pago según Impositiva
	  */
	public void setTipoFormaPago (String TipoFormaPago)
	{

		set_Value (COLUMNNAME_TipoFormaPago, TipoFormaPago);
	}

	/** Get TipoFormaPago.
		@return Tipo de Forma de Pago según Impositiva
	  */
	public String getTipoFormaPago () 
	{
		return (String)get_Value(COLUMNNAME_TipoFormaPago);
	}

	/** Set TotalAdValorem.
		@param TotalAdValorem 
		Total para AdValorem en Transporte Internacional
	  */
	public void setTotalAdValorem (BigDecimal TotalAdValorem)
	{
		set_Value (COLUMNNAME_TotalAdValorem, TotalAdValorem);
	}

	/** Get TotalAdValorem.
		@return Total para AdValorem en Transporte Internacional
	  */
	public BigDecimal getTotalAdValorem () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalAdValorem);
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

	public I_Z_Incoterm getZ_Incoterm() throws RuntimeException
    {
		return (I_Z_Incoterm)MTable.get(getCtx(), I_Z_Incoterm.Table_Name)
			.getPO(getZ_Incoterm_ID(), get_TrxName());	}

	/** Set Z_Incoterm ID.
		@param Z_Incoterm_ID Z_Incoterm ID	  */
	public void setZ_Incoterm_ID (int Z_Incoterm_ID)
	{
		if (Z_Incoterm_ID < 1) 
			set_Value (COLUMNNAME_Z_Incoterm_ID, null);
		else 
			set_Value (COLUMNNAME_Z_Incoterm_ID, Integer.valueOf(Z_Incoterm_ID));
	}

	/** Get Z_Incoterm ID.
		@return Z_Incoterm ID	  */
	public int getZ_Incoterm_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_Incoterm_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Z_ProformaTransp ID.
		@param Z_ProformaTransp_ID Z_ProformaTransp ID	  */
	public void setZ_ProformaTransp_ID (int Z_ProformaTransp_ID)
	{
		if (Z_ProformaTransp_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_Z_ProformaTransp_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_Z_ProformaTransp_ID, Integer.valueOf(Z_ProformaTransp_ID));
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
}