package com.iocl.analytics.source.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zst_lu_plant_mattyp",schema = "pricing_tool")
public class MaterialTable {
	@Id
	@Column(name = "material")
	private Integer material_code;
	@Column(name = "material_type")
	private String material_type;
	private String plant;
	private String cfa;

	public Integer getMaterial_code() {
		return material_code;
	}

	public void setMaterial_code(Integer material_code) {
		this.material_code = material_code;
	}

	public String getMaterial_type() {
		return material_type;
	}

	public void setMaterial_type(String material_type) {
		this.material_type = material_type;
	}

	public String getPlant() {
		return plant;
	}

	public void setPlant(String plant) {
		this.plant = plant;
	}

	public String getCfa() {
		return cfa;
	}

	public void setCfa(String cfa) {
		this.cfa = cfa;
	}

}