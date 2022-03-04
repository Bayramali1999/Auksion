package com.example.auksion.data.detail;

public class PostDetailReq {
    private int action;
    private String version;
    private String language;
    private String lot_id;
    private String is_view;
    private String buyers_id;
    private int is_gzipped;


    public PostDetailReq(int action, String version, String language, String lot_id, String is_view, String buyers_id, int is_gzipped) {
        this.action = action;
        this.version = version;
        this.language = language;
        this.lot_id = lot_id;
        this.is_view = is_view;
        this.buyers_id = buyers_id;
        this.is_gzipped = is_gzipped;
    }

    public PostDetailReq() {
    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLot_id() {
        return lot_id;
    }

    public void setLot_id(String lot_id) {
        this.lot_id = lot_id;
    }

    public String getIs_view() {
        return is_view;
    }

    public void setIs_view(String is_view) {
        this.is_view = is_view;
    }

    public String getBuyers_id() {
        return buyers_id;
    }

    public void setBuyers_id(String buyers_id) {
        this.buyers_id = buyers_id;
    }

    public int getIs_gzipped() {
        return is_gzipped;
    }

    public void setIs_gzipped(int is_gzipped) {
        this.is_gzipped = is_gzipped;
    }
}
//{
//        "action":15,
//        "version":"1.3.7",
//        "language":"uz",
//        "lot_id":"1369275",
//        "is_view":"true",
//        "buyers_id":"1",
//        "is_gzipped": 0
//        }
