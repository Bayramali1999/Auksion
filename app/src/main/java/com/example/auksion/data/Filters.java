package com.example.auksion.data;

import java.util.ArrayList;
import java.util.List;

public class Filters {
    private List<RegionData> regions = new ArrayList<>();
    private List<AreaData> areas = new ArrayList<>();
    private List<GroupData> groups = new ArrayList<>();
    private List<CategoryData> categories = new ArrayList<>();
    private List<DirectionData> directions = new ArrayList<>();
    private Integer result_code;
    private String result_msg;


    public Filters(List<RegionData> regions, List<AreaData> areas, List<GroupData> groups, List<CategoryData> categories, List<DirectionData> directions, Integer result_code, String result_msg) {
        this.regions = regions;
        this.areas = areas;
        this.groups = groups;
        this.categories = categories;
        this.directions = directions;
        this.result_code = result_code;
        this.result_msg = result_msg;
    }

    public Filters() {
    }

    public List<RegionData> getRegions() {
        return regions;
    }

    public void setRegions(List<RegionData> regions) {
        this.regions = regions;
    }

    public List<AreaData> getAreas() {
        return areas;
    }

    public void setAreas(List<AreaData> areas) {
        this.areas = areas;
    }

    public List<GroupData> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupData> groups) {
        this.groups = groups;
    }

    public List<CategoryData> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryData> categories) {
        this.categories = categories;
    }

    public List<DirectionData> getDirections() {
        return directions;
    }

    public void setDirections(List<DirectionData> directions) {
        this.directions = directions;
    }

    public Integer getResult_code() {
        return result_code;
    }

    public void setResult_code(Integer result_code) {
        this.result_code = result_code;
    }

    public String getResult_msg() {
        return result_msg;
    }

    public void setResult_msg(String result_msg) {
        this.result_msg = result_msg;
    }
}
