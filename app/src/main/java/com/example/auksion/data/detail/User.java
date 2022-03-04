package com.example.auksion.data.detail;

public class User {

    private Integer subject_type;
    private String fio;
    private String email;
    private String phone;
    private String inn;
    private String login;
    private String full_address;
    private Integer is_confirm_email;
    private Integer is_confirm_phone;
    private Integer offer_signed;
    private Integer id;


    public User(Integer subject_type, String fio, String email, String phone, String inn, String login, String full_address, Integer is_confirm_email, Integer is_confirm_phone, Integer offer_signed, Integer id) {
        this.subject_type = subject_type;
        this.fio = fio;
        this.email = email;
        this.phone = phone;
        this.inn = inn;
        this.login = login;
        this.full_address = full_address;
        this.is_confirm_email = is_confirm_email;
        this.is_confirm_phone = is_confirm_phone;
        this.offer_signed = offer_signed;
        this.id = id;
    }

    public Integer getSubject_type() {
        return subject_type;
    }

    public void setSubject_type(Integer subject_type) {
        this.subject_type = subject_type;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFull_address() {
        return full_address;
    }

    public void setFull_address(String full_address) {
        this.full_address = full_address;
    }

    public Integer getIs_confirm_email() {
        return is_confirm_email;
    }

    public void setIs_confirm_email(Integer is_confirm_email) {
        this.is_confirm_email = is_confirm_email;
    }

    public Integer getIs_confirm_phone() {
        return is_confirm_phone;
    }

    public void setIs_confirm_phone(Integer is_confirm_phone) {
        this.is_confirm_phone = is_confirm_phone;
    }

    public Integer getOffer_signed() {
        return offer_signed;
    }

    public void setOffer_signed(Integer offer_signed) {
        this.offer_signed = offer_signed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
