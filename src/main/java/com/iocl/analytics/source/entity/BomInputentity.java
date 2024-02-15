package com.iocl.analytics.source.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity

@Table(name="y_lubebom_dnld_e_bom", schema = "pricing_tool")
public class BomInputentity {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO);
    @Column(name="mat_pack_bom_id")
    private Long Id;
    private String comnm;
    private String datuv;
    private String idnrk;
    private String matnr;
    private String meins;
    private String menge;
    private String mtart;
    private String posnr;
    private String stlal;
    private String stlkn;
    private String stlnr;
    private String stprs;
    private String verpr;
    private String werks;
    private Date createddate;
    private boolean is_active;
    private Date modifieddate;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getComnm() {
        return comnm;
    }

    public void setComnm(String comnm) {
        this.comnm = comnm;
    }

    public String getDatuv() {
        return datuv;
    }

    public void setDatuv(String datuv) {
        this.datuv = datuv;
    }

    public String getIdnrk() {
        return idnrk;
    }

    public void setIdnrk(String idnrk) {
        this.idnrk = idnrk;
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

    public String getPosnr() {
        return posnr;
    }

    public void setPosnr(String posnr) {
        this.posnr = posnr;
    }

    public String getStlal() {
        return stlal;
    }

    public void setStlal(String stlal) {
        this.stlal = stlal;
    }

    public String getStlkn() {
        return stlkn;
    }

    public void setStlkn(String stlkn) {
        this.stlkn = stlkn;
    }

    public String getStlnr() {
        return stlnr;
    }

    public void setStlnr(String stlnr) {
        this.stlnr = stlnr;
    }

    public String getStprs() {
        return stprs;
    }

    public void setStprs(String stprs) {
        this.stprs = stprs;
    }

    public String getVerpr() {
        return verpr;
    }

    public void setVerpr(String verpr) {
        this.verpr = verpr;
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

    public BomInputentity() {

    }
    public BomInputentity(String idnrk, String meins, String menge) {
        this.idnrk = idnrk;
        this.meins = meins;
        this.menge = menge;
    }
    public BomInputentity(String matnr, String werks,String stlkn,String stlal) {
        this.matnr = matnr;
        this.werks = werks;
        this.stlkn = stlkn;

     }

}
