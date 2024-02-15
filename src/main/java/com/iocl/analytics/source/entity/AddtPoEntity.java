package com.iocl.analytics.source.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "ym_po_det_rfc_ho_lubes", schema = "pricing_tool")
public class AddtPoEntity {
	@Id
	private Integer id;
	private String aedat;
	private String belnr;
	private String bsart;
	private String bstme;
	private String bstyp;
	private String buzei;
	private String ebeln;
	private String ebelp;
	private String gjahr;
	private String konnr;
	private String ktpnr;
	private String loekz;
	private String matkl;
	private String matnr;
	private String meins;
	private String menge;
	private String mtart;
	private String waers;
	private String werks;
	private String wrbtr;
	private Date createddate;
	private boolean is_active;
	private Date modifieddate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAedat() {
		return aedat;
	}

	public void setAedat(String aedat) {
		this.aedat = aedat;
	}

	public String getBelnr() {
		return belnr;
	}

	public void setBelnr(String belnr) {
		this.belnr = belnr;
	}

	public String getBsart() {
		return bsart;
	}

	public void setBsart(String bsart) {
		this.bsart = bsart;
	}

	public String getBstme() {
		return bstme;
	}

	public void setBstme(String bstme) {
		this.bstme = bstme;
	}

	public String getBstyp() {
		return bstyp;
	}

	public void setBstyp(String bstyp) {
		this.bstyp = bstyp;
	}

	public String getBuzei() {
		return buzei;
	}

	public void setBuzei(String buzei) {
		this.buzei = buzei;
	}

	public String getEbeln() {
		return ebeln;
	}

	public void setEbeln(String ebeln) {
		this.ebeln = ebeln;
	}

	public String getEbelp() {
		return ebelp;
	}

	public void setEbelp(String ebelp) {
		this.ebelp = ebelp;
	}

	public String getGjahr() {
		return gjahr;
	}

	public void setGjahr(String gjahr) {
		this.gjahr = gjahr;
	}

	public String getKonnr() {
		return konnr;
	}

	public void setKonnr(String konnr) {
		this.konnr = konnr;
	}

	public String getKtpnr() {
		return ktpnr;
	}

	public void setKtpnr(String ktpnr) {
		this.ktpnr = ktpnr;
	}

	public String getLoekz() {
		return loekz;
	}

	public void setLoekz(String loekz) {
		this.loekz = loekz;
	}

	public String getMatkl() {
		return matkl;
	}

	public void setMatkl(String matkl) {
		this.matkl = matkl;
	}

	public String getMatnr() {
		return matnr;
	}

	public void setMatnr(String matnr) {
		this.matnr = matnr;
	}

	public String getMeins() {
		return meins;
	}

	public void setMeins(String meins) {
		this.meins = meins;
	}

	public String getMenge() {
		return menge;
	}

	public void setMenge(String menge) {
		this.menge = menge;
	}

	public String getMtart() {
		return mtart;
	}

	public void setMtart(String mtart) {
		this.mtart = mtart;
	}

	public String getWaers() {
		return waers;
	}

	public void setWaers(String waers) {
		this.waers = waers;
	}

	public String getWerks() {
		return werks;
	}

	public void setWerks(String werks) {
		this.werks = werks;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	public Date getModifieddate() {
		return modifieddate;
	}

	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}

	public String getWrbtr() {
		return wrbtr;
	}

	public void setWrbtr(String wrbtr) {
		this.wrbtr = wrbtr;
	}

	public AddtPoEntity(String ebeln, String ebelp, String matnr, String werks, String loekz) {
		super();
		this.ebeln = ebeln;
		this.ebelp = ebelp;
		this.matnr = matnr;
		this.werks = werks;
		this.loekz = loekz;
	}

	public AddtPoEntity(String ebeln, String ebelp) {
		super();
		this.ebeln = ebeln;
		this.ebelp = ebelp;
	}

	public AddtPoEntity(String bstme, String menge, String wrbtr) {
		super();
		this.bstme = bstme;
		this.menge = menge;
		this.wrbtr = wrbtr;
	}

	public AddtPoEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
