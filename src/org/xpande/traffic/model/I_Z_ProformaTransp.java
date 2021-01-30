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

/** Generated Interface for Z_ProformaTransp
 *  @author Adempiere (generated) 
 *  @version Release 3.9.1
 */
public interface I_Z_ProformaTransp 
{

    /** TableName=Z_ProformaTransp */
    public static final String Table_Name = "Z_ProformaTransp";

    /** AD_Table_ID=1000345 */
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

    /** Column name AdValorem */
    public static final String COLUMNNAME_AdValorem = "AdValorem";

	/** Set AdValorem.
	  * Si aplica o no Advalorem para comprobantes comerciales de Transporte Internacional
	  */
	public void setAdValorem (boolean AdValorem);

	/** Get AdValorem.
	  * Si aplica o no Advalorem para comprobantes comerciales de Transporte Internacional
	  */
	public boolean isAdValorem();

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

    /** Column name C_Currency_ID */
    public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

	/** Set Currency.
	  * The Currency for this record
	  */
	public void setC_Currency_ID (int C_Currency_ID);

	/** Get Currency.
	  * The Currency for this record
	  */
	public int getC_Currency_ID();

	public I_C_Currency getC_Currency() throws RuntimeException;

    /** Column name C_Currency_ID_To */
    public static final String COLUMNNAME_C_Currency_ID_To = "C_Currency_ID_To";

	/** Set Currency To.
	  * Target currency
	  */
	public void setC_Currency_ID_To (int C_Currency_ID_To);

	/** Get Currency To.
	  * Target currency
	  */
	public int getC_Currency_ID_To();

	public I_C_Currency getC_Currency_To() throws RuntimeException;

    /** Column name C_DocType_ID */
    public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

	/** Set Document Type.
	  * Document type or rules
	  */
	public void setC_DocType_ID (int C_DocType_ID);

	/** Get Document Type.
	  * Document type or rules
	  */
	public int getC_DocType_ID();

	public I_C_DocType getC_DocType() throws RuntimeException;

    /** Column name C_PaymentTerm_ID */
    public static final String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";

	/** Set Payment Term.
	  * The terms of Payment (timing, discount)
	  */
	public void setC_PaymentTerm_ID (int C_PaymentTerm_ID);

	/** Get Payment Term.
	  * The terms of Payment (timing, discount)
	  */
	public int getC_PaymentTerm_ID();

	public I_C_PaymentTerm getC_PaymentTerm() throws RuntimeException;

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

    /** Column name C_UOM_Weight_ID */
    public static final String COLUMNNAME_C_UOM_Weight_ID = "C_UOM_Weight_ID";

	/** Set UOM for Weight.
	  * Standard Unit of Measure for Weight
	  */
	public void setC_UOM_Weight_ID (int C_UOM_Weight_ID);

	/** Get UOM for Weight.
	  * Standard Unit of Measure for Weight
	  */
	public int getC_UOM_Weight_ID();

	public I_C_UOM getC_UOM_Weight() throws RuntimeException;

    /** Column name DateDoc */
    public static final String COLUMNNAME_DateDoc = "DateDoc";

	/** Set Document Date.
	  * Date of the Document
	  */
	public void setDateDoc (Timestamp DateDoc);

	/** Get Document Date.
	  * Date of the Document
	  */
	public Timestamp getDateDoc();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name DocAction */
    public static final String COLUMNNAME_DocAction = "DocAction";

	/** Set Document Action.
	  * The targeted status of the document
	  */
	public void setDocAction (String DocAction);

	/** Get Document Action.
	  * The targeted status of the document
	  */
	public String getDocAction();

    /** Column name DocStatus */
    public static final String COLUMNNAME_DocStatus = "DocStatus";

	/** Set Document Status.
	  * The current status of the document
	  */
	public void setDocStatus (String DocStatus);

	/** Get Document Status.
	  * The current status of the document
	  */
	public String getDocStatus();

    /** Column name DocumentNo */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";

	/** Set Document No.
	  * Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo);

	/** Get Document No.
	  * Document sequence number of the document
	  */
	public String getDocumentNo();

    /** Column name EnRepresentacion */
    public static final String COLUMNNAME_EnRepresentacion = "EnRepresentacion";

	/** Set EnRepresentacion.
	  * SI un expediente de tráfico es en Representación o no
	  */
	public void setEnRepresentacion (boolean EnRepresentacion);

	/** Get EnRepresentacion.
	  * SI un expediente de tráfico es en Representación o no
	  */
	public boolean isEnRepresentacion();

    /** Column name Exportador_ID */
    public static final String COLUMNNAME_Exportador_ID = "Exportador_ID";

	/** Set Exportador_ID.
	  * Socio de Negocio Exportador
	  */
	public void setExportador_ID (int Exportador_ID);

	/** Get Exportador_ID.
	  * Socio de Negocio Exportador
	  */
	public int getExportador_ID();

    /** Column name GrandTotal */
    public static final String COLUMNNAME_GrandTotal = "GrandTotal";

	/** Set Grand Total.
	  * Total amount of document
	  */
	public void setGrandTotal (BigDecimal GrandTotal);

	/** Get Grand Total.
	  * Total amount of document
	  */
	public BigDecimal getGrandTotal();

    /** Column name Importador_ID */
    public static final String COLUMNNAME_Importador_ID = "Importador_ID";

	/** Set Importador_ID.
	  * Socio de Negocio Importador
	  */
	public void setImportador_ID (int Importador_ID);

	/** Get Importador_ID.
	  * Socio de Negocio Importador
	  */
	public int getImportador_ID();

    /** Column name ImportadorLoc_ID */
    public static final String COLUMNNAME_ImportadorLoc_ID = "ImportadorLoc_ID";

	/** Set ImportadorLoc_ID.
	  * Localización del Socio de Negocio Importador
	  */
	public void setImportadorLoc_ID (int ImportadorLoc_ID);

	/** Get ImportadorLoc_ID.
	  * Localización del Socio de Negocio Importador
	  */
	public int getImportadorLoc_ID();

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

    /** Column name IsApproved */
    public static final String COLUMNNAME_IsApproved = "IsApproved";

	/** Set Approved.
	  * Indicates if this document requires approval
	  */
	public void setIsApproved (boolean IsApproved);

	/** Get Approved.
	  * Indicates if this document requires approval
	  */
	public boolean isApproved();

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

    /** Column name PesoBruto */
    public static final String COLUMNNAME_PesoBruto = "PesoBruto";

	/** Set PesoBruto.
	  * Peso Bruto de Mercaderías
	  */
	public void setPesoBruto (BigDecimal PesoBruto);

	/** Get PesoBruto.
	  * Peso Bruto de Mercaderías
	  */
	public BigDecimal getPesoBruto();

    /** Column name PesoNeto */
    public static final String COLUMNNAME_PesoNeto = "PesoNeto";

	/** Set PesoNeto.
	  * Peso Neto de Mercaderías
	  */
	public void setPesoNeto (BigDecimal PesoNeto);

	/** Get PesoNeto.
	  * Peso Neto de Mercaderías
	  */
	public BigDecimal getPesoNeto();

    /** Column name PorcAdValorem */
    public static final String COLUMNNAME_PorcAdValorem = "PorcAdValorem";

	/** Set PorcAdValorem.
	  * Porcentaje AdValorem
	  */
	public void setPorcAdValorem (BigDecimal PorcAdValorem);

	/** Get PorcAdValorem.
	  * Porcentaje AdValorem
	  */
	public BigDecimal getPorcAdValorem();

    /** Column name Processed */
    public static final String COLUMNNAME_Processed = "Processed";

	/** Set Processed.
	  * The document has been processed
	  */
	public void setProcessed (boolean Processed);

	/** Get Processed.
	  * The document has been processed
	  */
	public boolean isProcessed();

    /** Column name Processing */
    public static final String COLUMNNAME_Processing = "Processing";

	/** Set Process Now	  */
	public void setProcessing (boolean Processing);

	/** Get Process Now	  */
	public boolean isProcessing();

    /** Column name QtyEntered */
    public static final String COLUMNNAME_QtyEntered = "QtyEntered";

	/** Set Quantity.
	  * The Quantity Entered is based on the selected UoM
	  */
	public void setQtyEntered (BigDecimal QtyEntered);

	/** Get Quantity.
	  * The Quantity Entered is based on the selected UoM
	  */
	public BigDecimal getQtyEntered();

    /** Column name Reference */
    public static final String COLUMNNAME_Reference = "Reference";

	/** Set Reference.
	  * Reference for this record
	  */
	public void setReference (String Reference);

	/** Get Reference.
	  * Reference for this record
	  */
	public String getReference();

    /** Column name SubTotAdValor */
    public static final String COLUMNNAME_SubTotAdValor = "SubTotAdValor";

	/** Set SubTotAdValor.
	  * Subtotal para AdValorem en Transporte Internacional
	  */
	public void setSubTotAdValor (BigDecimal SubTotAdValor);

	/** Get SubTotAdValor.
	  * Subtotal para AdValorem en Transporte Internacional
	  */
	public BigDecimal getSubTotAdValor();

    /** Column name TaxAdValorem_ID */
    public static final String COLUMNNAME_TaxAdValorem_ID = "TaxAdValorem_ID";

	/** Set TaxAdValorem_ID.
	  * Impuesto para AdValorem en Tranporte Internacional
	  */
	public void setTaxAdValorem_ID (int TaxAdValorem_ID);

	/** Get TaxAdValorem_ID.
	  * Impuesto para AdValorem en Tranporte Internacional
	  */
	public int getTaxAdValorem_ID();

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

    /** Column name TaxAmtAdValor */
    public static final String COLUMNNAME_TaxAmtAdValor = "TaxAmtAdValor";

	/** Set TaxAmtAdValor.
	  * Monto de impuesto para AdValorem
	  */
	public void setTaxAmtAdValor (BigDecimal TaxAmtAdValor);

	/** Get TaxAmtAdValor.
	  * Monto de impuesto para AdValorem
	  */
	public BigDecimal getTaxAmtAdValor();

    /** Column name TipoFormaPago */
    public static final String COLUMNNAME_TipoFormaPago = "TipoFormaPago";

	/** Set TipoFormaPago.
	  * Tipo de Forma de Pago según Impositiva
	  */
	public void setTipoFormaPago (String TipoFormaPago);

	/** Get TipoFormaPago.
	  * Tipo de Forma de Pago según Impositiva
	  */
	public String getTipoFormaPago();

    /** Column name TotalAdValorem */
    public static final String COLUMNNAME_TotalAdValorem = "TotalAdValorem";

	/** Set TotalAdValorem.
	  * Total para AdValorem en Transporte Internacional
	  */
	public void setTotalAdValorem (BigDecimal TotalAdValorem);

	/** Get TotalAdValorem.
	  * Total para AdValorem en Transporte Internacional
	  */
	public BigDecimal getTotalAdValorem();

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

    /** Column name Z_ExpedienteInt_ID */
    public static final String COLUMNNAME_Z_ExpedienteInt_ID = "Z_ExpedienteInt_ID";

	/** Set Z_ExpedienteInt ID	  */
	public void setZ_ExpedienteInt_ID (int Z_ExpedienteInt_ID);

	/** Get Z_ExpedienteInt ID	  */
	public int getZ_ExpedienteInt_ID();

	public I_Z_ExpedienteInt getZ_ExpedienteInt() throws RuntimeException;

    /** Column name Z_Incoterm_ID */
    public static final String COLUMNNAME_Z_Incoterm_ID = "Z_Incoterm_ID";

	/** Set Z_Incoterm ID	  */
	public void setZ_Incoterm_ID (int Z_Incoterm_ID);

	/** Get Z_Incoterm ID	  */
	public int getZ_Incoterm_ID();

	public I_Z_Incoterm getZ_Incoterm() throws RuntimeException;

    /** Column name Z_ProformaTransp_ID */
    public static final String COLUMNNAME_Z_ProformaTransp_ID = "Z_ProformaTransp_ID";

	/** Set Z_ProformaTransp ID	  */
	public void setZ_ProformaTransp_ID (int Z_ProformaTransp_ID);

	/** Get Z_ProformaTransp ID	  */
	public int getZ_ProformaTransp_ID();

    /** Column name Z_TipoBultoCom_ID */
    public static final String COLUMNNAME_Z_TipoBultoCom_ID = "Z_TipoBultoCom_ID";

	/** Set Z_TipoBultoCom ID	  */
	public void setZ_TipoBultoCom_ID (int Z_TipoBultoCom_ID);

	/** Get Z_TipoBultoCom ID	  */
	public int getZ_TipoBultoCom_ID();
}
