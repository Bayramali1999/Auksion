package com.example.auksion.data.lot;

public class RequestLots {
    private int action;
    private String version;
    private String language;
    private String currentPage;
    private int is_gzipped;
    private Object filters_map;

    public RequestLots() {
    }

    public RequestLots(int action, String version, String language, String currentPage, int is_gzipped, Object filters_map) {
        this.action = action;
        this.version = version;
        this.language = language;
        this.currentPage = currentPage;
        this.is_gzipped = is_gzipped;
        this.filters_map = filters_map;
    }

    public Object getFilters_map() {
        return filters_map;
    }

    public void setFilters_map(Object filters_map) {
        this.filters_map = filters_map;
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

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public int getIs_gzipped() {
        return is_gzipped;
    }

    public void setIs_gzipped(int is_gzipped) {
        this.is_gzipped = is_gzipped;
    }
}

//{
//        "action":5,
//        "version":"1.3.7",
//        "language":"uz",
//        "currentPage":"2" ,
//        "is_gzipped": 0
//        }