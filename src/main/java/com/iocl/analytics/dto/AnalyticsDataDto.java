package com.iocl.analytics.dto;

import java.util.Date;

public class AnalyticsDataDto {
	private String product_code;
	private String blending_plant;
	private Double cost;
	private String bstme_uom;
	private String currency;
	private Date valid_from;
	private Date valid_to;
	private String doc_no;
	private String item_no;
	private Date created_on;

	private String menge_quantity;

	private String wrbtr_amt;

	public String getProduct_code() {
		return product_code;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
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

	public String getBstme_uom() {
		return bstme_uom;
	}

	public void setBstme_uom(String bstme_uom) {
		this.bstme_uom = bstme_uom;
	}

	public String getWrbtr_amt() {
		return wrbtr_amt;
	}

	public void setWrbtr_amt(String wrbtr_amt) {
		this.wrbtr_amt = wrbtr_amt;
	}

	public AnalyticsDataDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}


}