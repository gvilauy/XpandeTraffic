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

/** Generated Interface for Z_CRT
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_Z_CRT 
{

    /** TableName=Z_CRT */
    public static final String Table_Name = "Z_CRT";

    /** AD_Table_ID=1000316 */
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

    /** Column name AmtFleteDest */
    public static final String COLUMNNAME_AmtFleteDest = "AmtFleteDest";

	/** Set AmtFleteDest.
	  * Monto flete destinatario en Tráfico
	  */
	public void setAmtFleteDest (BigDecimal AmtFleteDest);

	/** Get AmtFleteDest.
	  * Monto flete destinatario en Tráfico
	  */
	public BigDecimal getAmtFleteDest();

    /** Column name AmtFleteExterno */
    public static final String COLUMNNAME_AmtFleteExterno = "AmtFleteExterno";

	/** Set AmtFleteExterno.
	  * Monto flete externo en Tráfico
	  */
	public void setAmtFleteExterno (BigDecimal AmtFleteExterno);

	/** Get AmtFleteExterno.
	  * Monto flete externo en Tráfico
	  */
	public BigDecimal getAmtFleteExterno();

    /** Column name AmtFleteRemit */
    public static final String COLUMNNAME_AmtFleteRemit = "AmtFleteRemit";

	/** Set AmtFleteRemit.
	  * Monto flete remitente en Tráfico
	  */
	public void setAmtFleteRemit (BigDecimal AmtFleteRemit);

	/** Get AmtFleteRemit.
	  * Monto flete remitente en Tráfico
	  */
	public BigDecimal getAmtFleteRemit();

    /** Column name AmtOtroDest */
    public static final String COLUMNNAME_AmtOtroDest = "AmtOtroDest";

	/** Set AmtOtroDest.
	  * Monto otros destinatario
	  */
	public void setAmtOtroDest (BigDecimal AmtOtroDest);

	/** Get AmtOtroDest.
	  * Monto otros destinatario
	  */
	public BigDecimal getAmtOtroDest();

    /** Column name AmtOtroRemit */
    public static final String COLUMNNAME_AmtOtroRemit = "AmtOtroRemit";

	/** Set AmtOtroRemit.
	  * Monto otros remitente en Tráfico
	  */
	public void setAmtOtroRemit (BigDecimal AmtOtroRemit);

	/** Get AmtOtroRemit.
	  * Monto otros remitente en Tráfico
	  */
	public BigDecimal getAmtOtroRemit();

    /** Column name AmtReembolso */
    public static final String COLUMNNAME_AmtReembolso = "AmtReembolso";

	/** Set AmtReembolso.
	  * Monto reembolso
	  */
	public void setAmtReembolso (BigDecimal AmtReembolso);

	/** Get AmtReembolso.
	  * Monto reembolso
	  */
	public BigDecimal getAmtReembolso();

    /** Column name AmtTotalDest */
    public static final String COLUMNNAME_AmtTotalDest = "AmtTotalDest";

	/** Set AmtTotalDest.
	  * Monto total destinatario en Tráfico
	  */
	public void setAmtTotalDest (BigDecimal AmtTotalDest);

	/** Get AmtTotalDest.
	  * Monto total destinatario en Tráfico
	  */
	public BigDecimal getAmtTotalDest();

    /** Column name AmtTotalRemit */
    public static final String COLUMNNAME_AmtTotalRemit = "AmtTotalRemit";

	/** Set AmtTotalRemit.
	  * Monto total remitente en Tráfico
	  */
	public void setAmtTotalRemit (BigDecimal AmtTotalRemit);

	/** Get AmtTotalRemit.
	  * Monto total remitente en Tráfico
	  */
	public BigDecimal getAmtTotalRemit();

    /** Column name Anexos */
    public static final String COLUMNNAME_Anexos = "Anexos";

	/** Set Anexos.
	  * Información de anexos para Tráfico
	  */
	public void setAnexos (String Anexos);

	/** Get Anexos.
	  * Información de anexos para Tráfico
	  */
	public String getAnexos();

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

    /** Column name ClaseBultos */
    public static final String COLUMNNAME_ClaseBultos = "ClaseBultos";

	/** Set ClaseBultos.
	  * Información de cantidad y clase de bultos para Tráfico
	  */
	public void setClaseBultos (String ClaseBultos);

	/** Get ClaseBultos.
	  * Información de cantidad y clase de bultos para Tráfico
	  */
	public String getClaseBultos();

    /** Column name Consignatario */
    public static final String COLUMNNAME_Consignatario = "Consignatario";

	/** Set Consignatario.
	  * Información de Consignatario para Tráfico
	  */
	public void setConsignatario (String Consignatario);

	/** Get Consignatario.
	  * Información de Consignatario para Tráfico
	  */
	public String getConsignatario();

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

    /** Column name Declaraciones */
    public static final String COLUMNNAME_Declaraciones = "Declaraciones";

	/** Set Declaraciones.
	  * Información de declaraciones para Tráfico
	  */
	public void setDeclaraciones (String Declaraciones);

	/** Get Declaraciones.
	  * Información de declaraciones para Tráfico
	  */
	public String getDeclaraciones();

    /** Column name Destinatario */
    public static final String COLUMNNAME_Destinatario = "Destinatario";

	/** Set Destinatario.
	  * Información de Destinatario para Tráfico
	  */
	public void setDestinatario (String Destinatario);

	/** Get Destinatario.
	  * Información de Destinatario para Tráfico
	  */
	public String getDestinatario();

    /** Column name DocumentNoRef */
    public static final String COLUMNNAME_DocumentNoRef = "DocumentNoRef";

	/** Set DocumentNoRef.
	  * Numero de documento referenciado
	  */
	public void setDocumentNoRef (String DocumentNoRef);

	/** Get DocumentNoRef.
	  * Numero de documento referenciado
	  */
	public String getDocumentNoRef();

    /** Column name EstadoCRT */
    public static final String COLUMNNAME_EstadoCRT = "EstadoCRT";

	/** Set EstadoCRT.
	  * Estado de un documento de CRT
	  */
	public void setEstadoCRT (String EstadoCRT);

	/** Get EstadoCRT.
	  * Estado de un documento de CRT
	  */
	public String getEstadoCRT();

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

    /** Column name Instrucciones */
    public static final String COLUMNNAME_Instrucciones = "Instrucciones";

	/** Set Instrucciones.
	  * Información de instrucciones para Tráfico
	  */
	public void setInstrucciones (String Instrucciones);

	/** Get Instrucciones.
	  * Información de instrucciones para Tráfico
	  */
	public String getInstrucciones();

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

    /** Column name LiteralImporte */
    public static final String COLUMNNAME_LiteralImporte = "LiteralImporte";

	/** Set LiteralImporte.
	  * Literal importe
	  */
	public void setLiteralImporte (String LiteralImporte);

	/** Get LiteralImporte.
	  * Literal importe
	  */
	public String getLiteralImporte();

    /** Column name LugarEmision */
    public static final String COLUMNNAME_LugarEmision = "LugarEmision";

	/** Set LugarEmision.
	  * Información de lugar de emisión de documento en Tráfico
	  */
	public void setLugarEmision (String LugarEmision);

	/** Get LugarEmision.
	  * Información de lugar de emisión de documento en Tráfico
	  */
	public String getLugarEmision();

    /** Column name LugarEntrega */
    public static final String COLUMNNAME_LugarEntrega = "LugarEntrega";

	/** Set LugarEntrega.
	  * Información de lugar de entrega para Tráfico
	  */
	public void setLugarEntrega (String LugarEntrega);

	/** Get LugarEntrega.
	  * Información de lugar de entrega para Tráfico
	  */
	public String getLugarEntrega();

    /** Column name MonedaFlete_ID */
    public static final String COLUMNNAME_MonedaFlete_ID = "MonedaFlete_ID";

	/** Set MonedaFlete_ID.
	  * ID de moneda de flete en Tráfico
	  */
	public void setMonedaFlete_ID (int MonedaFlete_ID);

	/** Get MonedaFlete_ID.
	  * ID de moneda de flete en Tráfico
	  */
	public int getMonedaFlete_ID();

    /** Column name Notificacion */
    public static final String COLUMNNAME_Notificacion = "Notificacion";

	/** Set Notificacion.
	  * Información de notificación para Tráfico
	  */
	public void setNotificacion (String Notificacion);

	/** Get Notificacion.
	  * Información de notificación para Tráfico
	  */
	public String getNotificacion();

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

    /** Column name PorteadoresSuc */
    public static final String COLUMNNAME_PorteadoresSuc = "PorteadoresSuc";

	/** Set PorteadoresSuc.
	  * Información de porteadores sucesivos para Tráfico
	  */
	public void setPorteadoresSuc (String PorteadoresSuc);

	/** Get PorteadoresSuc.
	  * Información de porteadores sucesivos para Tráfico
	  */
	public String getPorteadoresSuc();

    /** Column name PorteadorMerc */
    public static final String COLUMNNAME_PorteadorMerc = "PorteadorMerc";

	/** Set PorteadorMerc.
	  * Información de porteador de mercaderia
	  */
	public void setPorteadorMerc (String PorteadorMerc);

	/** Get PorteadorMerc.
	  * Información de porteador de mercaderia
	  */
	public String getPorteadorMerc();

    /** Column name ProcessButton */
    public static final String COLUMNNAME_ProcessButton = "ProcessButton";

	/** Set ProcessButton	  */
	public void setProcessButton (String ProcessButton);

	/** Get ProcessButton	  */
	public String getProcessButton();

    /** Column name ProcessButton2 */
    public static final String COLUMNNAME_ProcessButton2 = "ProcessButton2";

	/** Set ProcessButton2.
	  * Botón de Proceso
	  */
	public void setProcessButton2 (String ProcessButton2);

	/** Get ProcessButton2.
	  * Botón de Proceso
	  */
	public String getProcessButton2();

    /** Column name ProcessButton3 */
    public static final String COLUMNNAME_ProcessButton3 = "ProcessButton3";

	/** Set ProcessButton3.
	  * Botón para proceso
	  */
	public void setProcessButton3 (String ProcessButton3);

	/** Get ProcessButton3.
	  * Botón para proceso
	  */
	public String getProcessButton3();

    /** Column name ProcessButton4 */
    public static final String COLUMNNAME_ProcessButton4 = "ProcessButton4";

	/** Set ProcessButton4.
	  * Botón de Proceso
	  */
	public void setProcessButton4 (String ProcessButton4);

	/** Get ProcessButton4.
	  * Botón de Proceso
	  */
	public String getProcessButton4();

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

    /** Column name Remitente */
    public static final String COLUMNNAME_Remitente = "Remitente";

	/** Set Remitente.
	  * Información del remitente para Tráfico
	  */
	public void setRemitente (String Remitente);

	/** Get Remitente.
	  * Información del remitente para Tráfico
	  */
	public String getRemitente();

    /** Column name Text */
    public static final String COLUMNNAME_Text = "Text";

	/** Set Description	  */
	public void setText (String Text);

	/** Get Description	  */
	public String getText();

    /** Column name TipoExpedienteInt */
    public static final String COLUMNNAME_TipoExpedienteInt = "TipoExpedienteInt";

	/** Set TipoExpedienteInt.
	  * Tipo de expediente de tráfico internacional
	  */
	public void setTipoExpedienteInt (String TipoExpedienteInt);

	/** Get TipoExpedienteInt.
	  * Tipo de expediente de tráfico internacional
	  */
	public String getTipoExpedienteInt();

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

    /** Column name Volume */
    public static final String COLUMNNAME_Volume = "Volume";

	/** Set Volume.
	  * Volume of a product
	  */
	public void setVolume (BigDecimal Volume);

	/** Get Volume.
	  * Volume of a product
	  */
	public BigDecimal getVolume();

    /** Column name Z_CRT_ID */
    public static final String COLUMNNAME_Z_CRT_ID = "Z_CRT_ID";

	/** Set Z_CRT ID	  */
	public void setZ_CRT_ID (int Z_CRT_ID);

	/** Get Z_CRT ID	  */
	public int getZ_CRT_ID();

    /** Column name Z_ExpedienteInt_ID */
    public static final String COLUMNNAME_Z_ExpedienteInt_ID = "Z_ExpedienteInt_ID";

	/** Set Z_ExpedienteInt ID	  */
	public void setZ_ExpedienteInt_ID (int Z_ExpedienteInt_ID);

	/** Get Z_ExpedienteInt ID	  */
	public int getZ_ExpedienteInt_ID();

	public I_Z_ExpedienteInt getZ_ExpedienteInt() throws RuntimeException;
}
