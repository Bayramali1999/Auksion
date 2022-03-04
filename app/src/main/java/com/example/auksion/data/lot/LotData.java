package com.example.auksion.data.lot;

public class LotData {
    private String name;
    private Integer lot_statuses_id;
    private String lot_number;
    private Float zaklad_summa;
    private Float start_price;
    private Integer confiscant_groups_id;
    private Integer confiscant_categories_id;
    private Integer confiscants_id;
    private String order_end_time_str;
    private String start_time_date_str;
    private String file_hash;
    private Integer id;


    public LotData(String name, Integer lot_statuses_id, String lot_number, Float zaklad_summa, Float start_price, Integer confiscant_groups_id, Integer confiscant_categories_id, Integer confiscants_id, String order_end_time_str, String start_time_date_str, String file_hash, Integer id) {
        this.name = name;
        this.lot_statuses_id = lot_statuses_id;
        this.lot_number = lot_number;
        this.zaklad_summa = zaklad_summa;
        this.start_price = start_price;
        this.confiscant_groups_id = confiscant_groups_id;
        this.confiscant_categories_id = confiscant_categories_id;
        this.confiscants_id = confiscants_id;
        this.order_end_time_str = order_end_time_str;
        this.start_time_date_str = start_time_date_str;
        this.file_hash = file_hash;
        this.id = id;
    }

    public LotData() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLot_statuses_id() {
        return lot_statuses_id;
    }

    public void setLot_statuses_id(Integer lot_statuses_id) {
        this.lot_statuses_id = lot_statuses_id;
    }

    public String getLot_number() {
        return lot_number;
    }

    public void setLot_number(String lot_number) {
        this.lot_number = lot_number;
    }

    public Float getZaklad_summa() {
        return zaklad_summa;
    }

    public void setZaklad_summa(Float zaklad_summa) {
        this.zaklad_summa = zaklad_summa;
    }

    public Float getStart_price() {
        return start_price;
    }

    public void setStart_price(Float start_price) {
        this.start_price = start_price;
    }

    public Integer getConfiscant_groups_id() {
        return confiscant_groups_id;
    }

    public void setConfiscant_groups_id(Integer confiscant_groups_id) {
        this.confiscant_groups_id = confiscant_groups_id;
    }

    public Integer getConfiscant_categories_id() {
        return confiscant_categories_id;
    }

    public void setConfiscant_categories_id(Integer confiscant_categories_id) {
        this.confiscant_categories_id = confiscant_categories_id;
    }

    public Integer getConfiscants_id() {
        return confiscants_id;
    }

    public void setConfiscants_id(Integer confiscants_id) {
        this.confiscants_id = confiscants_id;
    }

    public String getOrder_end_time_str() {
        return order_end_time_str;
    }

    public void setOrder_end_time_str(String order_end_time_str) {
        this.order_end_time_str = order_end_time_str;
    }

    public String getStart_time_date_str() {
        return start_time_date_str;
    }

    public void setStart_time_date_str(String start_time_date_str) {
        this.start_time_date_str = start_time_date_str;
    }

    public String getFile_hash() {
        return file_hash;
    }

    public void setFile_hash(String file_hash) {
        this.file_hash = file_hash;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "LotData{" +
                "name='" + name + '\'' +
                ", lot_statuses_id=" + lot_statuses_id +
                ", lot_number='" + lot_number + '\'' +
                ", zaklad_summa=" + zaklad_summa +
                ", start_price=" + start_price +
                ", confiscant_groups_id=" + confiscant_groups_id +
                ", confiscant_categories_id=" + confiscant_categories_id +
                ", confiscants_id=" + confiscants_id +
                ", order_end_time_str='" + order_end_time_str + '\'' +
                ", start_time_date_str='" + start_time_date_str + '\'' +
                ", file_hash='" + file_hash + '\'' +
                ", id=" + id +
                '}';
    }
}

// "name":"Трактор DF 304",
//         "lot_statuses_id":2,
//         "lot_number":"1395724",
//
//         "zaklad_summa":4500000.0,
//         "start_price":9.0E7,
//         "confiscant_groups_id":3,
//         "confiscant_categories_id":23,
//         "confiscants_id":130385,
//         "order_end_time_str":"10.03.2022 09:00",
//         "start_time_date_str":"10.03.2022 10:00",
//         "file_hash":"74d0eeb07fa29d8c3dbfc83072f5f5ffc09d9dd6",
//         "id":1395724