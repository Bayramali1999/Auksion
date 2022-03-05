package com.example.auksion.data.detail;

public class DetailData {
    private LotBean lotBean;
    private Integer result_code;
    private String result_msg;

    public DetailData(LotBean lotBean, Integer result_code, String result_msg) {
        this.lotBean = lotBean;
        this.result_code = result_code;
        this.result_msg = result_msg;
    }

    public LotBean getLotBean() {
        return lotBean;
    }

    public void setLotBean(LotBean lotBean) {
        this.lotBean = lotBean;
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

