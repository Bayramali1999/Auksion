package com.example.auksion.data;

import android.os.Parcel;
import android.os.Parcelable;

public class FilterRequestData2 implements Parcelable {

    public static final Creator<FilterRequestData2> CREATOR = new Creator<FilterRequestData2>() {
        @Override
        public FilterRequestData2 createFromParcel(Parcel in) {
            return new FilterRequestData2(in);
        }

        @Override
        public FilterRequestData2[] newArray(int size) {
            return new FilterRequestData2[size];
        }
    };
    private Integer action;
    private String version;
    private String language;
    private Integer is_gzipped;
    private String currentPage;
    private Object filters_map;

    public FilterRequestData2(Integer action, String version, String language, Integer is_gzipped, String currentPage, Object filters_map) {
        this.action = action;
        this.version = version;
        this.language = language;
        this.is_gzipped = is_gzipped;
        this.currentPage = currentPage;
        this.filters_map = filters_map;
    }

    public FilterRequestData2() {
    }

    protected FilterRequestData2(Parcel in) {
        if (in.readByte() == 0) {
            action = null;
        } else {
            action = in.readInt();
        }
        version = in.readString();
        language = in.readString();
        if (in.readByte() == 0) {
            is_gzipped = null;
        } else {
            is_gzipped = in.readInt();
        }
        currentPage = in.readString();
    }


    public static Creator<FilterRequestData2> getCREATOR() {
        return CREATOR;
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

    public Object getFilters_map() {
        return filters_map;
    }

    public void setFilters_map(Object filters_map) {
        this.filters_map = filters_map;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        if (action == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(action);
        }
        parcel.writeString(version);
        parcel.writeString(language);
        if (is_gzipped == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(is_gzipped);
        }
        parcel.writeString(currentPage);
    }
}
