package com.example.auksion.data.filter_item;

public class DirectionData {


    private Integer ordering;
    private String name_ru;
    private String name_uk;
    private Integer id;

    public DirectionData(Integer ordering, String name_ru, String name_uk, Integer id) {
        this.ordering = ordering;
        this.name_ru = name_ru;
        this.name_uk = name_uk;
        this.id = id;
    }

    public DirectionData() {
    }

    public Integer getOrdering() {
        return ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }

    public String getName_ru() {
        return name_ru;
    }

    public void setName_ru(String name_ru) {
        this.name_ru = name_ru;
    }

    public String getName_uk() {
        return name_uk;
    }

    public void setName_uk(String name_uk) {
        this.name_uk = name_uk;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}