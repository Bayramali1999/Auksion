package com.example.auksion.data;

import java.util.List;

public class Lots {
    private List<LotData> shortLotBeans;
    private int result_code;
    private String result_msg;

    public Lots(List<LotData> shortLotBeans, int result_code, String result_msg) {
        this.shortLotBeans = shortLotBeans;
        this.result_code = result_code;
        this.result_msg = result_msg;
    }

    public Lots() {
    }

    public List<LotData> getShortLotBeans() {
        return shortLotBeans;
    }

    public void setShortLotBeans(List<LotData> shortLotBeans) {
        this.shortLotBeans = shortLotBeans;
    }

    public int getResult_code() {
        return result_code;
    }

    public void setResult_code(int result_code) {
        this.result_code = result_code;
    }

    public String getResult_msg() {
        return result_msg;
    }

    public void setResult_msg(String result_msg) {
        this.result_msg = result_msg;
    }
}
