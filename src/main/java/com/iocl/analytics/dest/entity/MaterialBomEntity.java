package com.iocl.analytics.dest.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="materialbom_data",schema = "iocl")
public class MaterialBomEntity {
    @Id
    @SequenceGenerator(name = "MaterialBom_Data", sequenceName = "iocl.materialbom_data_mat_bom_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MaterialBom_Data")

    private Long mat_bom_id;

    private String finish_product;
    private String plant;

    private String fnsd_by_qty;

    private String UOM;
    private Date valid_from;
    private Date valid_to;
    private Date created_on;

    private String sno1;

    private String qty1;

    private String uom1;


    private String sno2;

    private String qty2;

    private String uom2;


    private String sno3;

    private String qty3;

    private String uom3;


    private String sno4;

    private String qty4;

    private String uom4;


    private String sno5;

    private String qty5;

    private String uom5;

    private String sno6;

    private String qty6;

    private String uom6;


    private String sno7;

    private String qty7;

    private String uom7;


    private String sno8;

    private String qty8;

    private String uom8;


    private String sno9;

    private String qty9;

    private String uom9;


    private String sno10;

    private String qty10;

    private String uom10;


    private String sno11;
      private String qty11;
     private String uom11;


    private String sno12;
    private String qty12;
    private String uom12;


    private String sno13;
     private String qty13;
    private String uom13;

    private String sno14;
    private String qty14;
    private String uom14;

    private String sno15;
    private String qty15;
    private String uom15;



    public String getFinish_product() {
        return finish_product;
    }

    public void setFinish_product(String finish_product) {
        this.finish_product = finish_product;
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public String getFnsd_by_qty() {
        return fnsd_by_qty;
    }

    public void setFnsd_by_qty(String fnsd_by_qty) {
        this.fnsd_by_qty = fnsd_by_qty;
    }

    public String getUOM() {
        return UOM;
    }

    public void setUOM(String UOM) {
        this.UOM = UOM;
    }

    public String getSno1() {
        return sno1;
    }

    public void setSno1(String sno1) {
        this.sno1 = sno1;
    }

    public String getQty1() {
        return qty1;
    }

    public void setQty1(String qty1) {
        this.qty1 = qty1;
    }

    public String getUom1() {
        return uom1;
    }

    public void setUom1(String uom1) {
        this.uom1 = uom1;
    }

    public String getSno2() {
        return sno2;
    }

    public void setSno2(String sno2) {
        this.sno2 = sno2;
    }

    public String getQty2() {
        return qty2;
    }

    public void setQty2(String qty2) {
        this.qty2 = qty2;
    }

    public String getUom2() {
        return uom2;
    }

    public void setUom2(String uom2) {
        this.uom2 = uom2;
    }

    public String getSno3() {
        return sno3;
    }

    public void setSno3(String sno3) {
        this.sno3 = sno3;
    }

    public String getQty3() {
        return qty3;
    }

    public void setQty3(String qty3) {
        this.qty3 = qty3;
    }

    public String getUom3() {
        return uom3;
    }

    public void setUom3(String uom3) {
        this.uom3 = uom3;
    }

    public String getSno4() {
        return sno4;
    }

    public void setSno4(String sno4) {
        this.sno4 = sno4;
    }

    public String getQty4() {
        return qty4;
    }

    public void setQty4(String qty4) {
        this.qty4 = qty4;
    }

    public String getUom4() {
        return uom4;
    }

    public void setUom4(String uom4) {
        this.uom4 = uom4;
    }

    public String getSno5() {
        return sno5;
    }

    public void setSno5(String sno5) {
        this.sno5 = sno5;
    }

    public String getQty5() {
        return qty5;
    }

    public void setQty5(String qty5) {
        this.qty5 = qty5;
    }

    public String getUom5() {
        return uom5;
    }

    public void setUom5(String uom5) {
        this.uom5 = uom5;
    }

    public String getSno6() {
        return sno6;
    }

    public void setSno6(String sno6) {
        this.sno6 = sno6;
    }

    public String getQty6() {
        return qty6;
    }

    public void setQty6(String qty6) {
        this.qty6 = qty6;
    }

    public String getUom6() {
        return uom6;
    }

    public void setUom6(String uom6) {
        this.uom6 = uom6;
    }

    public String getSno7() {
        return sno7;
    }

    public void setSno7(String sno7) {
        this.sno7 = sno7;
    }

    public String getQty7() {
        return qty7;
    }

    public void setQty7(String qty7) {
        this.qty7 = qty7;
    }

    public String getUom7() {
        return uom7;
    }

    public void setUom7(String uom7) {
        this.uom7 = uom7;
    }

    public String getSno8() {
        return sno8;
    }

    public void setSno8(String sno8) {
        this.sno8 = sno8;
    }

    public String getQty8() {
        return qty8;
    }

    public void setQty8(String qty8) {
        this.qty8 = qty8;
    }

    public String getUom8() {
        return uom8;
    }

    public void setUom8(String uom8) {
        this.uom8 = uom8;
    }

    public String getSno9() {
        return sno9;
    }

    public void setSno9(String sno9) {
        this.sno9 = sno9;
    }

    public String getQty9() {
        return qty9;
    }

    public void setQty9(String qty9) {
        this.qty9 = qty9;
    }

    public String getUom9() {
        return uom9;
    }

    public void setUom9(String uom9) {
        this.uom9 = uom9;
    }

    public String getSno10() {
        return sno10;
    }

    public void setSno10(String sno10) {
        this.sno10 = sno10;
    }

    public String getQty10() {
        return qty10;
    }

    public void setQty10(String qty10) {
        this.qty10 = qty10;
    }

    public String getUom10() {
        return uom10;
    }

    public void setUom10(String uom10) {
        this.uom10 = uom10;
    }

    public String getSno11() {
        return sno11;
    }

    public void setSno11(String sno11) {
        this.sno11 = sno11;
    }

    public String getQty11() {
        return qty11;
    }

    public void setQty11(String qty11) {
        this.qty11 = qty11;
    }

    public String getUom11() {
        return uom11;
    }

    public void setUom11(String uom11) {
        this.uom11 = uom11;
    }

    public String getSno12() {
        return sno12;
    }

    public void setSno12(String sno12) {
        this.sno12 = sno12;
    }

    public String getQty12() {
        return qty12;
    }

    public void setQty12(String qty12) {
        this.qty12 = qty12;
    }

    public String getUom12() {
        return uom12;
    }

    public void setUom12(String uom12) {
        this.uom12 = uom12;
    }

    public String getSno13() {
        return sno13;
    }

    public void setSno13(String sno13) {
        this.sno13 = sno13;
    }

    public String getQty13() {
        return qty13;
    }

    public void setQty13(String qty13) {
        this.qty13 = qty13;
    }

    public String getUom13() {
        return uom13;
    }

    public void setUom13(String uom13) {
        this.uom13 = uom13;
    }

    public String getSno14() {
        return sno14;
    }

    public void setSno14(String sno14) {
        this.sno14 = sno14;
    }

    public String getQty14() {
        return qty14;
    }

    public void setQty14(String qty14) {
        this.qty14 = qty14;
    }

    public String getUom14() {
        return uom14;
    }

    public void setUom14(String uom14) {
        this.uom14 = uom14;
    }

    public String getSno15() {
        return sno15;
    }

    public void setSno15(String sno15) {
        this.sno15 = sno15;
    }

    public String getQty15() {
        return qty15;
    }

    public void setQty15(String qty15) {
        this.qty15 = qty15;
    }

    public String getUom15() {
        return uom15;
    }

    public void setUom15(String uom15) {
        this.uom15 = uom15;
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

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }
}
