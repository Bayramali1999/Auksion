package com.example.auksion.data.filter;

public class GetFilteredReq {

    private Integer action;
    private String version;
    private String currentPage;
    private String language;
    private Integer is_gzipped;
    private Object filters_map;


    public GetFilteredReq(Integer action, String version, String currentPage, String language, Integer is_gzipped, Object filters_map) {
        this.action = action;
        this.version = version;
        this.currentPage = currentPage;
        this.language = language;
        this.is_gzipped = is_gzipped;
        this.filters_map = filters_map;
    }

    public GetFilteredReq() {
    }

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getIs_gzipped() {
        return is_gzipped;
    }

    public void setIs_gzipped(Integer is_gzipped) {
        this.is_gzipped = is_gzipped;
    }

    public Object getFilters_map() {
        return filters_map;
    }

    public void setFilters_map(Object filters_map) {
        this.filters_map = filters_map;
    }

    @Override
    public String toString() {
        return "GetFilteredReq{" +
                "action=" + action +
                ", version='" + version + '\'' +
                ", currentPage='" + currentPage + '\'' +
                ", language='" + language + '\'' +
                ", is_gzipped=" + is_gzipped +
                ", filters_map=" + filters_map +
                '}';
    }
}
