package com.example.auksion.data;

public class RegionData {
    private Integer soato;
    private String name_ru;
    private String name_uk;
    private String name;
    private Integer id;

    public RegionData(Integer soato, String name_ru, String name_uk, String name, Integer id) {
        this.soato = soato;
        this.name_ru = name_ru;
        this.name_uk = name_uk;
        this.name = name;
        this.id = id;
    }

    public RegionData() {
    }

    public Integer getSoato() {
        return soato;
    }

    public void setSoato(Integer soato) {
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
// "soato": 1726,
//         "name_ru": "г.Ташкент",
//         "name_uk": "Тошкент ш.",
//         "name": "Тошкент ш.",
//         "id": 1
