package com.example.auksion.data;

public class CategoryData {

    private Integer confiscant_groups_id;
    private Integer ordering;
    private String name_ru;
    private String name_uk;
    private String name;
    private Integer id;

    public CategoryData(Integer confiscant_groups_id, Integer ordering, String name_ru, String name_uk, String name, Integer id) {
        this.confiscant_groups_id = confiscant_groups_id;
        this.ordering = ordering;
        this.name_ru = name_ru;
        this.name_uk = name_uk;
        this.name = name;
        this.id = id;
    }

    public CategoryData() {
    }

    public Integer getConfiscant_groups_id() {
        return confiscant_groups_id;
    }

    public void setConfiscant_groups_id(Integer confiscant_groups_id) {
        this.confiscant_groups_id = confiscant_groups_id;
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

    @Override
    public String toString() {
        return "CategoryData{" +
                "confiscant_groups_id=" + confiscant_groups_id +
                ", ordering=" + ordering +
                ", name_ru='" + name_ru + '\'' +
                ", name_uk='" + name_uk + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
//
// "confiscant_groups_id": 5,
//         "ordering": 2,
//         "name_ru": "Государственная доля",
//         "name_uk": "Давлат улуши",
//         "name": "Давлат улуши",
//         "id": 26
