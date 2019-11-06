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

/** Generated Interface for Z_ExpedienteInt
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_Z_ExpedienteInt 
{

    /** TableName=Z_ExpedienteInt */
    public static final String Table_Name = "Z_ExpedienteInt";

    /** AD_Table_ID=1000306 */
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
	public void setAD_Org_ID(int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name Bill_BPartner_ID */
    public static final String COLUMNNAME_Bill_BPartner_ID = "Bill_BPartner_ID";

	/** Set Invoice Partner.
	  * Business Partner to be invoiced
	  */
	public void setBill_BPartner_ID(int Bill_BPartner_ID);

	/** Get Invoice Partner.
	  * Business Partner to be invoiced
	  */
	public int getBill_BPartner_ID();

	public I_C_BPartner getBill_BPartner() throws RuntimeException;

    /** Column name C_City_ID */
    public static final String COLUMNNAME_C_City_ID = "C_City_ID";

	/** Set City.
	  * City
	  */
	public void setC_City_ID(int C_City_ID);

	/** Get City.
	  * City
	  */
	public int getC_City_ID();

	public I_C_City getC_City() throws RuntimeException;

    /** Column name C_City_To_ID */
    public static final String COLUMNNAME_C_City_To_ID = "C_City_To_ID";

	/** Set C_City_To_ID.
	  * Ciudad Destino
	  */
	public void setC_City_To_ID(int C_City_To_ID);

	/** Get C_City_To_ID.
	  * Ciudad Destino
	  */
	public int getC_City_To_ID();

	public I_C_City getC_City_To() throws RuntimeException;

    /** Column name C_Country_ID */
    public static final String COLUMNNAME_C_Country_ID = "C_Country_ID";

	/** Set Country.
	  * Country 
	  */
	public void setC_Country_ID(int C_Country_ID);

	/** Get Country.
	  * Country 
	  */
	public int getC_Country_ID();

	public I_C_Country getC_Country() throws RuntimeException;

    /** Column name C_Country_To_ID */
    public static final String COLUMNNAME_C_Country_To_ID = "C_Country_To_ID";

	/** Set C_Country_To_ID.
	  * Pais destino
	  */
	public void setC_Country_To_ID(int C_Country_To_ID);

	/** Get C_Country_To_ID.
	  * Pais destino
	  */
	public int getC_Country_To_ID();

    /** Column name C_Currency_ID */
    public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

	/** Set Currency.
	  * The Currency for this record
	  */
	public void setC_Currency_ID(int C_Currency_ID);

	/** Get Currency.
	  * The Currency for this record
	  */
	public int getC_Currency_ID();

	public I_C_Currency getC_Currency() throws RuntimeException;

    /** Column name ColetaMercaderia */
    public static final String COLUMNNAME_ColetaMercaderia = "ColetaMercaderia";

	/** Set ColetaMercaderia.
	  * Si se coleta o no mercadería en tráfico
	  */
	public void setColetaMercaderia(boolean ColetaMercaderia);

	/** Get ColetaMercaderia.
	  * Si se coleta o no mercadería en tráfico
	  */
	public boolean isColetaMercaderia();

    /** Column name Consolidado */
    public static final String COLUMNNAME_Consolidado = "Consolidado";

	/** Set Consolidado.
	  * Si esta o no consolidado
	  */
	public void setConsolidado(boolean Consolidado);

	/** Get Consolidado.
	  * Si esta o no consolidado
	  */
	public boolean isConsolidado();

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

    /** Column name C_UOM_Volume_ID */
    public static final String COLUMNNAME_C_UOM_Volume_ID = "C_UOM_Volume_ID";

	/** Set UOM for Volume.
	  * Standard Unit of Measure for Volume
	  */
	public void setC_UOM_Volume_ID(int C_UOM_Volume_ID);

	/** Get UOM for Volume.
	  * Standard Unit of Measure for Volume
	  */
	public int getC_UOM_Volume_ID();

	public I_C_UOM getC_UOM_Volume() throws RuntimeException;

    /** Column name C_UOM_Weight_ID */
    public static final String COLUMNNAME_C_UOM_Weight_ID = "C_UOM_Weight_ID";

	/** Set UOM for Weight.
	  * Standard Unit of Measure for Weight
	  */
	public void setC_UOM_Weight_ID(int C_UOM_Weight_ID);

	/** Get UOM for Weight.
	  * Standard Unit of Measure for Weight
	  */
	public int getC_UOM_Weight_ID();

	public I_C_UOM getC_UOM_Weight() throws RuntimeException;

    /** Column name DescBultos */
    public static final String COLUMNNAME_DescBultos = "DescBultos";

	/** Set DescBultos.
	  * Descripción de Bultos
	  */
	public void setDescBultos(String DescBultos);

	/** Get DescBultos.
	  * Descripción de Bultos
	  */
	public String getDescBultos();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription(String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name DocVisto */
    public static final String COLUMNNAME_DocVisto = "DocVisto";

	/** Set DocVisto.
	  * Si un determinado documento fue visto o no
	  */
	public void setDocVisto(boolean DocVisto);

	/** Get DocVisto.
	  * Si un determinado documento fue visto o no
	  */
	public boolean isDocVisto();

    /** Column name EnRepresentacion */
    public static final String COLUMNNAME_EnRepresentacion = "EnRepresentacion";

	/** Set EnRepresentacion.
	  * SI un expediente de tráfico es en Representación o no
	  */
	public void setEnRepresentacion(boolean EnRepresentacion);

	/** Get EnRepresentacion.
	  * SI un expediente de tráfico es en Representación o no
	  */
	public boolean isEnRepresentacion();

    /** Column name EnTransito */
    public static final String COLUMNNAME_EnTransito = "EnTransito";

	/** Set EnTransito.
	  * SI un expediente de tráfico esta en Tránsito o no
	  */
	public void setEnTransito(boolean EnTransito);

	/** Get EnTransito.
	  * SI un expediente de tráfico esta en Tránsito o no
	  */
	public boolean isEnTransito();

    /** Column name EsPeligroso */
    public static final String COLUMNNAME_EsPeligroso = "EsPeligroso";

	/** Set EsPeligroso.
	  * Si es peligroso o no
	  */
	public void setEsPeligroso(boolean EsPeligroso);

	/** Get EsPeligroso.
	  * Si es peligroso o no
	  */
	public boolean isEsPeligroso();

    /** Column name EstadoCargaExp */
    public static final String COLUMNNAME_EstadoCargaExp = "EstadoCargaExp";

	/** Set EstadoCargaExp.
	  * Estado de Carga en expediente de Tráfico
	  */
	public void setEstadoCargaExp(String EstadoCargaExp);

	/** Get EstadoCargaExp.
	  * Estado de Carga en expediente de Tráfico
	  */
	public String getEstadoCargaExp();

    /** Column name EstadoExp */
    public static final String COLUMNNAME_EstadoExp = "EstadoExp";

	/** Set EstadoExp.
	  * Estado de un expediente de tráfico
	  */
	public void setEstadoExp(String EstadoExp);

	/** Get EstadoExp.
	  * Estado de un expediente de tráfico
	  */
	public String getEstadoExp();

    /** Column name FechaApertura */
    public static final String COLUMNNAME_FechaApertura = "FechaApertura";

	/** Set FechaApertura.
	  * Fecha de Apertura de un Documento
	  */
	public void setFechaApertura(Timestamp FechaApertura);

	/** Get FechaApertura.
	  * Fecha de Apertura de un Documento
	  */
	public Timestamp getFechaApertura();

    /** Column name FechaDescarga */
    public static final String COLUMNNAME_FechaDescarga = "FechaDescarga";

	/** Set FechaDescarga.
	  * Fecha de descarga de mercadería
	  */
	public void setFechaDescarga(Timestamp FechaDescarga);

	/** Get FechaDescarga.
	  * Fecha de descarga de mercadería
	  */
	public Timestamp getFechaDescarga();

    /** Column name FechaDUA */
    public static final String COLUMNNAME_FechaDUA = "FechaDUA";

	/** Set FechaDUA.
	  * Fecha DUA en Tráfico
	  */
	public void setFechaDUA(Timestamp FechaDUA);

	/** Get FechaDUA.
	  * Fecha DUA en Tráfico
	  */
	public Timestamp getFechaDUA();

    /** Column name FechaEmbarque */
    public static final String COLUMNNAME_FechaEmbarque = "FechaEmbarque";

	/** Set FechaEmbarque.
	  * Fecha de embarque de mercadería
	  */
	public void setFechaEmbarque(Timestamp FechaEmbarque);

	/** Get FechaEmbarque.
	  * Fecha de embarque de mercadería
	  */
	public Timestamp getFechaEmbarque();

    /** Column name FechaEmbarqueReal */
    public static final String COLUMNNAME_FechaEmbarqueReal = "FechaEmbarqueReal";

	/** Set FechaEmbarqueReal.
	  * Fecha de embarque real de mercadería
	  */
	public void setFechaEmbarqueReal(Timestamp FechaEmbarqueReal);

	/** Get FechaEmbarqueReal.
	  * Fecha de embarque real de mercadería
	  */
	public Timestamp getFechaEmbarqueReal();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive(boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name IsSatisfied */
    public static final String COLUMNNAME_IsSatisfied = "IsSatisfied";

	/** Set IsSatisfied.
	  * Si esta o no satisfecha
	  */
	public void setIsSatisfied(boolean IsSatisfied);

	/** Get IsSatisfied.
	  * Si esta o no satisfecha
	  */
	public boolean isSatisfied();

    /** Column name NroDUA */
    public static final String COLUMNNAME_NroDUA = "NroDUA";

	/** Set NroDUA.
	  * Número DUA para expediente de Tráfico
	  */
	public void setNroDUA(String NroDUA);

	/** Get NroDUA.
	  * Número DUA para expediente de Tráfico
	  */
	public String getNroDUA();

    /** Column name NroOnu */
    public static final String COLUMNNAME_NroOnu = "NroOnu";

	/** Set NroOnu.
	  * Número ONU para mercaderías peligrosas en Tráfico
	  */
	public void setNroOnu(String NroOnu);

	/** Get NroOnu.
	  * Número ONU para mercaderías peligrosas en Tráfico
	  */
	public String getNroOnu();

    /** Column name OrigenMercaderia */
    public static final String COLUMNNAME_OrigenMercaderia = "OrigenMercaderia";

	/** Set OrigenMercaderia.
	  * Descripción del orígen de Mercaderias
	  */
	public void setOrigenMercaderia(String OrigenMercaderia);

	/** Get OrigenMercaderia.
	  * Descripción del orígen de Mercaderias
	  */
	public String getOrigenMercaderia();

    /** Column name PesoBruto */
    public static final String COLUMNNAME_PesoBruto = "PesoBruto";

	/** Set PesoBruto.
	  * Peso Bruto de Mercaderías
	  */
	public void setPesoBruto(BigDecimal PesoBruto);

	/** Get PesoBruto.
	  * Peso Bruto de Mercaderías
	  */
	public BigDecimal getPesoBruto();

    /** Column name PesoNeto */
    public static final String COLUMNNAME_PesoNeto = "PesoNeto";

	/** Set PesoNeto.
	  * Peso Neto de Mercaderías
	  */
	public void setPesoNeto(BigDecimal PesoNeto);

	/** Get PesoNeto.
	  * Peso Neto de Mercaderías
	  */
	public BigDecimal getPesoNeto();

    /** Column name QtyEntered */
    public static final String COLUMNNAME_QtyEntered = "QtyEntered";

	/** Set Quantity.
	  * The Quantity Entered is based on the selected UoM
	  */
	public void setQtyEntered(BigDecimal QtyEntered);

	/** Get Quantity.
	  * The Quantity Entered is based on the selected UoM
	  */
	public BigDecimal getQtyEntered();

    /** Column name ReferenceNo */
    public static final String COLUMNNAME_ReferenceNo = "ReferenceNo";

	/** Set Reference No.
	  * Your customer or vendor number at the Business Partner's site
	  */
	public void setReferenceNo(String ReferenceNo);

	/** Get Reference No.
	  * Your customer or vendor number at the Business Partner's site
	  */
	public String getReferenceNo();

    /** Column name TipoCobroExp */
    public static final String COLUMNNAME_TipoCobroExp = "TipoCobroExp";

	/** Set TipoCobroExp.
	  * Tipo de manera de cobro en un expediente de tráfico
	  */
	public void setTipoCobroExp(String TipoCobroExp);

	/** Get TipoCobroExp.
	  * Tipo de manera de cobro en un expediente de tráfico
	  */
	public String getTipoCobroExp();

    /** Column name TipoExpedienteInt */
    public static final String COLUMNNAME_TipoExpedienteInt = "TipoExpedienteInt";

	/** Set TipoExpedienteInt.
	  * Tipo de expediente de tráfico internacional
	  */
	public void setTipoExpedienteInt(String TipoExpedienteInt);

	/** Get TipoExpedienteInt.
	  * Tipo de expediente de tráfico internacional
	  */
	public String getTipoExpedienteInt();

    /** Column name TipoMercaderiaExp */
    public static final String COLUMNNAME_TipoMercaderiaExp = "TipoMercaderiaExp";

	/** Set TipoMercaderiaExp.
	  * Tipo de mercadería descripta en un expediente de tráfico
	  */
	public void setTipoMercaderiaExp(String TipoMercaderiaExp);

	/** Get TipoMercaderiaExp.
	  * Tipo de mercadería descripta en un expediente de tráfico
	  */
	public String getTipoMercaderiaExp();

    /** Column name TotalAmt */
    public static final String COLUMNNAME_TotalAmt = "TotalAmt";

	/** Set Total Amount.
	  * Total Amount
	  */
	public void setTotalAmt(BigDecimal TotalAmt);

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
	public void setUUID(String UUID);

	/** Get Immutable Universally Unique Identifier.
	  * Immutable Universally Unique Identifier
	  */
	public String getUUID();

    /** Column name Value */
    public static final String COLUMNNAME_Value = "Value";

	/** Set Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public void setValue(String Value);

	/** Get Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public String getValue();

    /** Column name Volume */
    public static final String COLUMNNAME_Volume = "Volume";

	/** Set Volume.
	  * Volume of a product
	  */
	public void setVolume(BigDecimal Volume);

	/** Get Volume.
	  * Volume of a product
	  */
	public BigDecimal getVolume();

    /** Column name Z_AduanaTrafico_ID */
    public static final String COLUMNNAME_Z_AduanaTrafico_ID = "Z_AduanaTrafico_ID";

	/** Set Z_AduanaTrafico ID	  */
	public void setZ_AduanaTrafico_ID(int Z_AduanaTrafico_ID);

	/** Get Z_AduanaTrafico ID	  */
	public int getZ_AduanaTrafico_ID();

	public org.xpande.traffic.model.I_Z_AduanaTrafico getZ_AduanaTrafico() throws RuntimeException;

    /** Column name Z_AduanaTrafico_To_ID */
    public static final String COLUMNNAME_Z_AduanaTrafico_To_ID = "Z_AduanaTrafico_To_ID";

	/** Set Z_AduanaTrafico_To_ID.
	  * Aduana Destino
	  */
	public void setZ_AduanaTrafico_To_ID(int Z_AduanaTrafico_To_ID);

	/** Get Z_AduanaTrafico_To_ID.
	  * Aduana Destino
	  */
	public int getZ_AduanaTrafico_To_ID();

	public org.xpande.traffic.model.I_Z_AduanaTrafico getZ_AduanaTrafico_To() throws RuntimeException;

    /** Column name Z_ExpedienteInt_ID */
    public static final String COLUMNNAME_Z_ExpedienteInt_ID = "Z_ExpedienteInt_ID";

	/** Set Z_ExpedienteInt ID	  */
	public void setZ_ExpedienteInt_ID(int Z_ExpedienteInt_ID);

	/** Get Z_ExpedienteInt ID	  */
	public int getZ_ExpedienteInt_ID();

    /** Column name Z_TipoBultoCom_ID */
    public static final String COLUMNNAME_Z_TipoBultoCom_ID = "Z_TipoBultoCom_ID";

	/** Set Z_TipoBultoCom ID	  */
	public void setZ_TipoBultoCom_ID(int Z_TipoBultoCom_ID);

	/** Get Z_TipoBultoCom ID	  */
	public int getZ_TipoBultoCom_ID();

    /** Column name Z_TrayectoTrafico_ID */
    public static final String COLUMNNAME_Z_TrayectoTrafico_ID = "Z_TrayectoTrafico_ID";

	/** Set Z_TrayectoTrafico ID	  */
	public void setZ_TrayectoTrafico_ID(int Z_TrayectoTrafico_ID);

	/** Get Z_TrayectoTrafico ID	  */
	public int getZ_TrayectoTrafico_ID();

	public I_Z_TrayectoTrafico getZ_TrayectoTrafico() throws RuntimeException;
}
