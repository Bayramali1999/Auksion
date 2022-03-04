package com.example.auksion.data;

import java.io.Serializable;

public class FilterRequestData implements Serializable {

    private Integer action;
    private String version;
    private String language;
    private Integer is_gzipped;


    public FilterRequestData(Integer action, String version, String language, Integer is_gzipped) {
        this.action = action;
        this.version = version;
        this.language = language;
        this.is_gzipped = is_gzipped;
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

}
