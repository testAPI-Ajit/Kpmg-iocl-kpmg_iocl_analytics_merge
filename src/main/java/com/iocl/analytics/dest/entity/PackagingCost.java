package com.iocl.analytics.dest.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "packaging_input_cost", schema = "iocl")
public class PackagingCost {
	@Id
	@SequenceGenerator(name = "PackagingCostSeq", sequenceName = "iocl.packaging_cost_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PackagingCostSeq")
	@Column(name = "pkg_cost_id")
	private Long packaging_cost_id;
	private String packaging_material;
	private String blending_plant;
	@Column(name = "pkg_cost")
	private Double cost;
	@Column(name = "uom")
	private String bstme_uom;
	private String currency;
	private Date valid_from;
	private Date valid_to;
	private Date created_on;

	@Transient
	private String doc_no;
	@Transient
	private String item_no;

	@Transient
	private String menge_quantity;
	@Transient
	private String wrbtr_amt;

	public Long getPackaging_cost_id() {
		return packaging_cost_id;
	}

	public void setPackaging_cost_id(Long packaging_cost_id) {
		this.packaging_cost_id = packaging_cost_id;
	}

	public String getPackaging_material() {
		return packaging_material;
	}

	public void setPackaging_material(String packaging_material) {
		this.packaging_material = packaging_material;
	}

	public String getBlending_plant() {
		return blending_plant;
	}

	public void setBlending_plant(String blending_plant) {
		this.blending_plant = blending_plant;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getBstme_uom() {
		return bstme_uom;
	}

	public void setBstme_uom(String bstme_uom) {
		this.bstme_uom = bstme_uom;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Date getValid_from() {
		return valid_from;
	}

	public void setValid_from(Date valid_from) {
		this.valid_from = valid_from;
	}

	public Date getValid_to() {
		return valid_to;
	}

	public void setValid_to(Date valid_to) {
		this.valid_to = valid_to;
	}

	public String getDoc_no() {
		return doc_no;
	}

	public void setDoc_no(String doc_no) {
		this.doc_no = doc_no;
	}

	public String getItem_no() {
		return item_no;
	}

	public void setItem_no(String item_no) {
		this.item_no = item_no;
	}

	public String getMenge_quantity() {
		return menge_quantity;
	}

	public void setMenge_quantity(String menge_quantity) {
		this.menge_quantity = menge_quantity;
	}

	public String getWrbtr_amt() {
		return wrbtr_amt;
	}

	public void setWrbtr_amt(String wrbtr_amt) {
		this.wrbtr_amt = wrbtr_amt;
	}

	public Date getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}

}