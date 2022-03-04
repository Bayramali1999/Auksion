package com.example.auksion.data.detail;

public class Rekvisits {

    private String pay_receiver;
    private String pay_bank_currency_xr;
    private String pay_bank_swift;
    private String pay_bank_name;
    private String pay_bank_xr;
    private String pay_bank_mfo;
    private String pay_inn;


    public Rekvisits(String pay_receiver, String pay_bank_currency_xr, String pay_bank_swift, String pay_bank_name, String pay_bank_xr, String pay_bank_mfo, String pay_inn) {
        this.pay_receiver = pay_receiver;
        this.pay_bank_currency_xr = pay_bank_currency_xr;
        this.pay_bank_swift = pay_bank_swift;
        this.pay_bank_name = pay_bank_name;
        this.pay_bank_xr = pay_bank_xr;
        this.pay_bank_mfo = pay_bank_mfo;
        this.pay_inn = pay_inn;
    }

    public String getPay_receiver() {
        return pay_receiver;
    }

    public void setPay_receiver(String pay_receiver) {
        this.pay_receiver = pay_receiver;
    }

    public String getPay_bank_currency_xr() {
        return pay_bank_currency_xr;
    }

    public void setPay_bank_currency_xr(String pay_bank_currency_xr) {
        this.pay_bank_currency_xr = pay_bank_currency_xr;
    }

    public String getPay_bank_swift() {
        return pay_bank_swift;
    }

    public void setPay_bank_swift(String pay_bank_swift) {
        this.pay_bank_swift = pay_bank_swift;
    }

    public String getPay_bank_name() {
        return pay_bank_name;
    }

    public void setPay_bank_name(String pay_bank_name) {
        this.pay_bank_name = pay_bank_name;
    }

    public String getPay_bank_xr() {
        return pay_bank_xr;
    }

    public void setPay_bank_xr(String pay_bank_xr) {
        this.pay_bank_xr = pay_bank_xr;
    }

    public String getPay_bank_mfo() {
        return pay_bank_mfo;
    }

    public void setPay_bank_mfo(String pay_bank_mfo) {
        this.pay_bank_mfo = pay_bank_mfo;
    }

    public String getPay_inn() {
        return pay_inn;
    }

    public void setPay_inn(String pay_inn) {
        this.pay_inn = pay_inn;
    }
}
