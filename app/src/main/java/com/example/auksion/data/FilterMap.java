package com.example.auksion.data;

public class FilterMap {
    private int lot_number;
    private int conficant_groups_id;
    private int conficant_categories_id;
    private int regions_id;
    private int areas_id;

    public FilterMap() {

    }

    public FilterMap(int conficant_groups_id, int conficant_categories_id, int regions_id, int areas_id) {
        this.conficant_groups_id = conficant_groups_id;
        this.conficant_categories_id = conficant_categories_id;
        this.regions_id = regions_id;
        this.areas_id = areas_id;
    }

    public FilterMap(int lot_number, int conficant_groups_id, int conficant_categories_id, int regions_id, int areas_id) {
        this.lot_number = lot_number;
        this.conficant_groups_id = conficant_groups_id;
        this.conficant_categories_id = conficant_categories_id;
        this.regions_id = regions_id;
        this.areas_id = areas_id;
    }

    public FilterMap(int lot_number) {
        this.lot_number = lot_number;
    }

    public FilterMap(int lot_number, int conficant_groups_id) {
        this.lot_number = lot_number;
        this.conficant_groups_id = conficant_groups_id;
    }


    public int getLot_number() {
        return lot_number;
    }

    public void setLot_number(int lot_number) {
        this.lot_number = lot_number;
    }

    public int getConficant_groups_id() {
        return conficant_groups_id;
    }

    public void setConficant_groups_id(int conficant_groups_id) {
        this.conficant_groups_id = conficant_groups_id;
    }

    public int getConficant_categories_id() {
        return conficant_categories_id;
    }

    public void setConficant_categories_id(int conficant_categories_id) {
        this.conficant_categories_id = conficant_categories_id;
    }

    public int getRegions_id() {
        return regions_id;
    }

    public void setRegions_id(int regions_id) {
        this.regions_id = regions_id;
    }

    public int getAreas_id() {
        return areas_id;
    }

    public void setAreas_id(int areas_id) {
        this.areas_id = areas_id;
    }

    @Override
    public String toString() {
        return "FilterMap{" +
                "lot_number=" + lot_number +
                ", conficant_groups_id=" + conficant_groups_id +
                ", conficant_categories_id=" + conficant_categories_id +
                ", regions_id=" + regions_id +
                ", areas_id=" + areas_id +
                '}';
    }

    //    "conficant_groups_id":1,
//            "conficant_categories_id":1,
//            "regions_id":1,
//            "areas_id":1
    //lot_number
}
