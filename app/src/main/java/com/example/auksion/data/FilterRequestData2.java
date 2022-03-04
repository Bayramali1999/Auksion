package com.example.auksion.data;

import java.io.Serializable;

public class FilterRequestData2 implements Serializable {

    private Integer action;
    private String version;
    private String language;
    private Integer is_gzipped;
    private String currentPage;
    private FilterMap filters_map;


    public FilterRequestData2(Integer action, String version, String language, String currentPage, Integer is_gzipped, FilterMap filters_map) {
        this.action = action;
        this.version = version;
        this.language = language;
        this.is_gzipped = is_gzipped;
        this.currentPage = currentPage;
        this.filters_map = filters_map;
    }


    public FilterRequestData2() {
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

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public FilterMap getFilters_map() {
        return filters_map;
    }

    public void setFilters_map(FilterMap filters_map) {
        this.filters_map = filters_map;
    }
}
