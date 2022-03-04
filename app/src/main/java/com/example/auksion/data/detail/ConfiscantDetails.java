package com.example.auksion.data.detail;

public class ConfiscantDetails {

    private Integer id;
    private Integer confiscant_detail_field_id;
    private String name;
    private String table_field_name;
    private String short_name;
    private String detail_value;
    private String json_params;
    private Integer detail_unit;
    private String unit_name;


    public ConfiscantDetails(Integer id, Integer confiscant_detail_field_id, String name, String table_field_name, String short_name, String detail_value, String json_params, Integer detail_unit, String unit_name) {
        this.id = id;
        this.confiscant_detail_field_id = confiscant_detail_field_id;
        this.name = name;
        this.table_field_name = table_field_name;
        this.short_name = short_name;
        this.detail_value = detail_value;
        this.json_params = json_params;
        this.detail_unit = detail_unit;
        this.unit_name = unit_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getConfiscant_detail_field_id() {
        return confiscant_detail_field_id;
    }

    public void setConfiscant_detail_field_id(Integer confiscant_detail_field_id) {
        this.confiscant_detail_field_id = confiscant_detail_field_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTable_field_name() {
        return table_field_name;
    }

    public void setTable_field_name(String table_field_name) {
        this.table_field_name = table_field_name;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public String getDetail_value() {
        return detail_value;
    }

    public void setDetail_value(String detail_value) {
        this.detail_value = detail_value;
    }

    public String getJson_params() {
        return json_params;
    }

    public void setJson_params(String json_params) {
        this.json_params = json_params;
    }

    public Integer getDetail_unit() {
        return detail_unit;
    }

    public void setDetail_unit(Integer detail_unit) {
        this.detail_unit = detail_unit;
    }

    public String getUnit_name() {
        return unit_name;
    }

    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name;
    }
}
