package com.example.auksion.data.filter_item;

public class AreaData {

    private Integer regions_id;
    private String soato;
    private String name_ru;
    private String name_uk;
    private String name;
    private Integer id;

    public AreaData(Integer regions_id, String soato, String name_ru, String name_uk, String name, Integer id) {
        this.regions_id = regions_id;
        this.soato = soato;
        this.name_ru = name_ru;
        this.name_uk = name_uk;
        this.name = name;
        this.id = id;
    }

    public AreaData() {
    }

    public Integer getRegions_id() {
        return regions_id;
    }

    public void setRegions_id(Integer regions_id) {
        this.regions_id = regions_id;
    }

    public String getSoato() {
        return soato;
    }

    public void setSoato(String soato) {
        this.soato = soato;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
//
// "regions_id": 8,
//         "soato": "1714216",
//         "name_ru": "Нарынский район",
//         "name_uk": "Норин тумани",
//         "name": "Норин тумани",
//         "id": 111
