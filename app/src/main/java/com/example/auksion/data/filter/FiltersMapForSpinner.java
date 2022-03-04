package com.example.auksion.data.filter;

import android.os.Parcel;
import android.os.Parcelable;

public class FiltersMapForSpinner implements Parcelable {



    private Integer confiscant_groups_id;
    private Integer confiscant_categories_id;
    private Integer regions_id;
    private Integer areas_id;

    public FiltersMapForSpinner() {
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

    public Integer getRegions_id() {
        return regions_id;
    }

    public void setRegions_id(Integer regions_id) {
        this.regions_id = regions_id;
    }

    public Integer getAreas_id() {
        return areas_id;
    }

    public void setAreas_id(Integer areas_id) {
        this.areas_id = areas_id;
    }

    public static Creator<FiltersMapForSpinner> getCREATOR() {
        return CREATOR;
    }

    protected FiltersMapForSpinner(Parcel in) {
        if (in.readByte() == 0) {
            confiscant_groups_id = null;
        } else {
            confiscant_groups_id = in.readInt();
        }
        if (in.readByte() == 0) {
            confiscant_categories_id = null;
        } else {
            confiscant_categories_id = in.readInt();
        }
        if (in.readByte() == 0) {
            regions_id = null;
        } else {
            regions_id = in.readInt();
        }
        if (in.readByte() == 0) {
            areas_id = null;
        } else {
            areas_id = in.readInt();
        }
    }

    public static final Creator<FiltersMapForSpinner> CREATOR = new Creator<FiltersMapForSpinner>() {
        @Override
        public FiltersMapForSpinner createFromParcel(Parcel in) {
            return new FiltersMapForSpinner(in);
        }

        @Override
        public FiltersMapForSpinner[] newArray(int size) {
            return new FiltersMapForSpinner[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        if (confiscant_groups_id == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(confiscant_groups_id);
        }
        if (confiscant_categories_id == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(confiscant_categories_id);
        }
        if (regions_id == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(regions_id);
        }
        if (areas_id == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(areas_id);
        }
    }
}
