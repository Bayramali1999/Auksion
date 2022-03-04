package com.example.auksion.data.detail;

import java.util.List;

public class LotBean {

    private Integer id;
    private String name;
    private String start_time;
    private String end_time;
    private String order_end_time;
    private Integer lot_statuses_id;
    private String joylashgan_manzil;
    private String lot_number;
    private Integer lot_types_id;
    private String lot_types_name;
    private Double start_price;
    private Double zaklad_summa;
    private Integer confiscant_groups_id;
    private Integer confiscant_categories_id;
    private String confiscant_categories_name;
    private Integer count_favourite;
    private Integer is_favourite;
    private Integer view_count;
    private String area_name;
    private String region_name;
    private String department_name;
    private String user_fio;
    private String user_phone;
    private String ex_doc_number;
    private String ex_doc_org;
    private String ex_doc_date;
    private String ex_work_number;
    private String ex_work_date;
    private String f_visit_time1;
    private String f_visit_time2;
    private String f_visit_time3;
    private Integer ex_order_type;
    private String order_end_time_str;
    private Integer auction_type_id;
    private String small_address;
    private Integer properties_sets_id;
    private Integer show_room_time;
    private String zakalad_currency_amount;
    private Integer not_announce_of_results;
    private List<ConfiscantDetails> confiscant_details_list = null;
    private List<Object> confiscantDocumentsList = null;
    private List<ConfiscantImagesList> confiscantImagesList;
    private User user;
    private Rekvisits rekvisits;
    private Integer lot_type;
    private String file_hash;
    private Integer confirm_price_from_date_of_sale;
    private Double current_price;
    private Double next_price;
    private Integer customer_id;
    private Integer confiscants_id;
    private Integer exec_orders_id;
    private Integer is_closed;
    private Integer areas_id;
    private Integer check_for_debt;
    private Integer user_order_cnt;
    private String user_order_cnt_str;

    public LotBean(Integer id, String name, String start_time, String end_time, String order_end_time, Integer lot_statuses_id, String joylashgan_manzil, String lot_number, Integer lot_types_id, String lot_types_name, Double start_price, Double zaklad_summa, Integer confiscant_groups_id, Integer confiscant_categories_id, String confiscant_categories_name, Integer count_favourite, Integer is_favourite, Integer view_count, String area_name, String region_name, String department_name, String user_fio, String user_phone, String ex_doc_number, String ex_doc_org, String ex_doc_date, String ex_work_number, String ex_work_date, String f_visit_time1, String f_visit_time2, String f_visit_time3, Integer ex_order_type, String order_end_time_str, Integer auction_type_id, String small_address, Integer properties_sets_id, Integer show_room_time, String zakalad_currency_amount, Integer not_announce_of_results, List<ConfiscantDetails> confiscant_details_list, List<Object> confiscantDocumentsList, List<ConfiscantImagesList> confiscantImagesList, User user, Rekvisits rekvisits, Integer lot_type, String file_hash, Integer confirm_price_from_date_of_sale, Double current_price, Double next_price, Integer customer_id, Integer confiscants_id, Integer exec_orders_id, Integer is_closed, Integer areas_id, Integer check_for_debt, Integer user_order_cnt, String user_order_cnt_str) {
        this.id = id;
        this.name = name;
        this.start_time = start_time;
        this.end_time = end_time;
        this.order_end_time = order_end_time;
        this.lot_statuses_id = lot_statuses_id;
        this.joylashgan_manzil = joylashgan_manzil;
        this.lot_number = lot_number;
        this.lot_types_id = lot_types_id;
        this.lot_types_name = lot_types_name;
        this.start_price = start_price;
        this.zaklad_summa = zaklad_summa;
        this.confiscant_groups_id = confiscant_groups_id;
        this.confiscant_categories_id = confiscant_categories_id;
        this.confiscant_categories_name = confiscant_categories_name;
        this.count_favourite = count_favourite;
        this.is_favourite = is_favourite;
        this.view_count = view_count;
        this.area_name = area_name;
        this.region_name = region_name;
        this.department_name = department_name;
        this.user_fio = user_fio;
        this.user_phone = user_phone;
        this.ex_doc_number = ex_doc_number;
        this.ex_doc_org = ex_doc_org;
        this.ex_doc_date = ex_doc_date;
        this.ex_work_number = ex_work_number;
        this.ex_work_date = ex_work_date;
        this.f_visit_time1 = f_visit_time1;
        this.f_visit_time2 = f_visit_time2;
        this.f_visit_time3 = f_visit_time3;
        this.ex_order_type = ex_order_type;
        this.order_end_time_str = order_end_time_str;
        this.auction_type_id = auction_type_id;
        this.small_address = small_address;
        this.properties_sets_id = properties_sets_id;
        this.show_room_time = show_room_time;
        this.zakalad_currency_amount = zakalad_currency_amount;
        this.not_announce_of_results = not_announce_of_results;
        this.confiscant_details_list = confiscant_details_list;
        this.confiscantDocumentsList = confiscantDocumentsList;
        this.confiscantImagesList = confiscantImagesList;
        this.user = user;
        this.rekvisits = rekvisits;
        this.lot_type = lot_type;
        this.file_hash = file_hash;
        this.confirm_price_from_date_of_sale = confirm_price_from_date_of_sale;
        this.current_price = current_price;
        this.next_price = next_price;
        this.customer_id = customer_id;
        this.confiscants_id = confiscants_id;
        this.exec_orders_id = exec_orders_id;
        this.is_closed = is_closed;
        this.areas_id = areas_id;
        this.check_for_debt = check_for_debt;
        this.user_order_cnt = user_order_cnt;
        this.user_order_cnt_str = user_order_cnt_str;
    }

    public List<ConfiscantImagesList> getConfiscantImagesList() {
        return confiscantImagesList;
    }

    public void setConfiscantImagesList(List<ConfiscantImagesList> confiscantImagesList) {
        this.confiscantImagesList = confiscantImagesList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getOrder_end_time() {
        return order_end_time;
    }

    public void setOrder_end_time(String order_end_time) {
        this.order_end_time = order_end_time;
    }

    public Integer getLot_statuses_id() {
        return lot_statuses_id;
    }

    public void setLot_statuses_id(Integer lot_statuses_id) {
        this.lot_statuses_id = lot_statuses_id;
    }

    public String getJoylashgan_manzil() {
        return joylashgan_manzil;
    }

    public void setJoylashgan_manzil(String joylashgan_manzil) {
        this.joylashgan_manzil = joylashgan_manzil;
    }

    public String getLot_number() {
        return lot_number;
    }

    public void setLot_number(String lot_number) {
        this.lot_number = lot_number;
    }

    public Integer getLot_types_id() {
        return lot_types_id;
    }

    public void setLot_types_id(Integer lot_types_id) {
        this.lot_types_id = lot_types_id;
    }

    public String getLot_types_name() {
        return lot_types_name;
    }

    public void setLot_types_name(String lot_types_name) {
        this.lot_types_name = lot_types_name;
    }

    public Double getStart_price() {
        return start_price;
    }

    public void setStart_price(Double start_price) {
        this.start_price = start_price;
    }

    public Double getZaklad_summa() {
        return zaklad_summa;
    }

    public void setZaklad_summa(Double zaklad_summa) {
        this.zaklad_summa = zaklad_summa;
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

    public String getConfiscant_categories_name() {
        return confiscant_categories_name;
    }

    public void setConfiscant_categories_name(String confiscant_categories_name) {
        this.confiscant_categories_name = confiscant_categories_name;
    }

    public Integer getCount_favourite() {
        return count_favourite;
    }

    public void setCount_favourite(Integer count_favourite) {
        this.count_favourite = count_favourite;
    }

    public Integer getIs_favourite() {
        return is_favourite;
    }

    public void setIs_favourite(Integer is_favourite) {
        this.is_favourite = is_favourite;
    }

    public Integer getView_count() {
        return view_count;
    }

    public void setView_count(Integer view_count) {
        this.view_count = view_count;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getUser_fio() {
        return user_fio;
    }

    public void setUser_fio(String user_fio) {
        this.user_fio = user_fio;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getEx_doc_number() {
        return ex_doc_number;
    }

    public void setEx_doc_number(String ex_doc_number) {
        this.ex_doc_number = ex_doc_number;
    }

    public String getEx_doc_org() {
        return ex_doc_org;
    }

    public void setEx_doc_org(String ex_doc_org) {
        this.ex_doc_org = ex_doc_org;
    }

    public String getEx_doc_date() {
        return ex_doc_date;
    }

    public void setEx_doc_date(String ex_doc_date) {
        this.ex_doc_date = ex_doc_date;
    }

    public String getEx_work_number() {
        return ex_work_number;
    }

    public void setEx_work_number(String ex_work_number) {
        this.ex_work_number = ex_work_number;
    }

    public String getEx_work_date() {
        return ex_work_date;
    }

    public void setEx_work_date(String ex_work_date) {
        this.ex_work_date = ex_work_date;
    }

    public String getF_visit_time1() {
        return f_visit_time1;
    }

    public void setF_visit_time1(String f_visit_time1) {
        this.f_visit_time1 = f_visit_time1;
    }

    public String getF_visit_time2() {
        return f_visit_time2;
    }

    public void setF_visit_time2(String f_visit_time2) {
        this.f_visit_time2 = f_visit_time2;
    }

    public String getF_visit_time3() {
        return f_visit_time3;
    }

    public void setF_visit_time3(String f_visit_time3) {
        this.f_visit_time3 = f_visit_time3;
    }

    public Integer getEx_order_type() {
        return ex_order_type;
    }

    public void setEx_order_type(Integer ex_order_type) {
        this.ex_order_type = ex_order_type;
    }

    public String getOrder_end_time_str() {
        return order_end_time_str;
    }

    public void setOrder_end_time_str(String order_end_time_str) {
        this.order_end_time_str = order_end_time_str;
    }

    public Integer getAuction_type_id() {
        return auction_type_id;
    }

    public void setAuction_type_id(Integer auction_type_id) {
        this.auction_type_id = auction_type_id;
    }

    public String getSmall_address() {
        return small_address;
    }

    public void setSmall_address(String small_address) {
        this.small_address = small_address;
    }

    public Integer getProperties_sets_id() {
        return properties_sets_id;
    }

    public void setProperties_sets_id(Integer properties_sets_id) {
        this.properties_sets_id = properties_sets_id;
    }

    public Integer getShow_room_time() {
        return show_room_time;
    }

    public void setShow_room_time(Integer show_room_time) {
        this.show_room_time = show_room_time;
    }

    public String getZakalad_currency_amount() {
        return zakalad_currency_amount;
    }

    public void setZakalad_currency_amount(String zakalad_currency_amount) {
        this.zakalad_currency_amount = zakalad_currency_amount;
    }

    public Integer getNot_announce_of_results() {
        return not_announce_of_results;
    }

    public void setNot_announce_of_results(Integer not_announce_of_results) {
        this.not_announce_of_results = not_announce_of_results;
    }

    public List<ConfiscantDetails> getConfiscant_details_list() {
        return confiscant_details_list;
    }

    public void setConfiscant_details_list(List<ConfiscantDetails> confiscant_details_list) {
        this.confiscant_details_list = confiscant_details_list;
    }

    public List<Object> getConfiscantDocumentsList() {
        return confiscantDocumentsList;
    }

    public void setConfiscantDocumentsList(List<Object> confiscantDocumentsList) {
        this.confiscantDocumentsList = confiscantDocumentsList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Rekvisits getRekvisits() {
        return rekvisits;
    }

    public void setRekvisits(Rekvisits rekvisits) {
        this.rekvisits = rekvisits;
    }

    public Integer getLot_type() {
        return lot_type;
    }

    public void setLot_type(Integer lot_type) {
        this.lot_type = lot_type;
    }

    public String getFile_hash() {
        return file_hash;
    }

    public void setFile_hash(String file_hash) {
        this.file_hash = file_hash;
    }

    public Integer getConfirm_price_from_date_of_sale() {
        return confirm_price_from_date_of_sale;
    }

    public void setConfirm_price_from_date_of_sale(Integer confirm_price_from_date_of_sale) {
        this.confirm_price_from_date_of_sale = confirm_price_from_date_of_sale;
    }

    public Double getCurrent_price() {
        return current_price;
    }

    public void setCurrent_price(Double current_price) {
        this.current_price = current_price;
    }

    public Double getNext_price() {
        return next_price;
    }

    public void setNext_price(Double next_price) {
        this.next_price = next_price;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getConfiscants_id() {
        return confiscants_id;
    }

    public void setConfiscants_id(Integer confiscants_id) {
        this.confiscants_id = confiscants_id;
    }

    public Integer getExec_orders_id() {
        return exec_orders_id;
    }

    public void setExec_orders_id(Integer exec_orders_id) {
        this.exec_orders_id = exec_orders_id;
    }

    public Integer getIs_closed() {
        return is_closed;
    }

    public void setIs_closed(Integer is_closed) {
        this.is_closed = is_closed;
    }

    public Integer getAreas_id() {
        return areas_id;
    }

    public void setAreas_id(Integer areas_id) {
        this.areas_id = areas_id;
    }

    public Integer getCheck_for_debt() {
        return check_for_debt;
    }

    public void setCheck_for_debt(Integer check_for_debt) {
        this.check_for_debt = check_for_debt;
    }

    public Integer getUser_order_cnt() {
        return user_order_cnt;
    }

    public void setUser_order_cnt(Integer user_order_cnt) {
        this.user_order_cnt = user_order_cnt;
    }

    public String getUser_order_cnt_str() {
        return user_order_cnt_str;
    }

    public void setUser_order_cnt_str(String user_order_cnt_str) {
        this.user_order_cnt_str = user_order_cnt_str;
    }
}
