package com.example.auksion.data.filter;

import android.os.Parcel;
import android.os.Parcelable;

public class FiltersMapForSpinner2 implements Parcelable {

    public static final Creator<FiltersMapForSpinner2> CREATOR = new Creator<FiltersMapForSpinner2>() {
        @Override
        public FiltersMapForSpinner2 createFromParcel(Parcel in) {
            return new FiltersMapForSpinner2(in);
        }

        @Override
        public FiltersMapForSpinner2[] newArray(int size) {
            return new FiltersMapForSpinner2[size];
        }
    };
    private String lot_number;
    private Integer confiscant_groups_id;
    private Integer confiscant_categories_id;
    private Integer regions_id;
    private Integer areas_id;
    private String orderby_;
    private String order_type;

    public FiltersMapForSpinner2() {
    }

    protected FiltersMapForSpinner2(Parcel in) {
        lot_number = in.readString();
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
        orderby_ = in.readString();
        if (in.readByte() == 0) {
            order_type = null;
        } else {
            order_type = in.readString();
        }
    }

    public static Creator<FiltersMapForSpinner2> getCREATOR() {
        return CREATOR;
    }

    public String getLot_number() {
        return lot_number;
    }

    public void setLot_number(String lot_number) {
        this.lot_number = lot_number;
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

    public String getOrderby_() {
        return orderby_;
    }

    public void setOrderby_(String orderby_) {
        this.orderby_ = orderby_;
    }

    public String getOrder_type() {
        return order_type;
    }

    public void setOrder_type(String order_type) {
        this.order_type = order_type;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(lot_number);
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
        parcel.writeString(orderby_);
        if (order_type == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(order_type);
        }
    }
}
