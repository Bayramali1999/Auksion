package com.example.auksion.data.detail;

public class ConfiscantImagesList {

    private Integer confiscants_id;
    private Integer confiscant_groups_id;
    private Integer document_resources_id;
    private Integer image_positions_id;
    private  String image_positions_name;
    private String file_hash;
    private Integer id;

    public ConfiscantImagesList(Integer confiscants_id, Integer confiscant_groups_id, Integer document_resources_id, Integer image_positions_id, String image_positions_name, String file_hash, Integer id) {
        this.confiscants_id = confiscants_id;
        this.confiscant_groups_id = confiscant_groups_id;
        this.document_resources_id = document_resources_id;
        this.image_positions_id = image_positions_id;
        this.image_positions_name = image_positions_name;
        this.file_hash = file_hash;
        this.id = id;
    }

    public Integer getConfiscants_id() {
        return confiscants_id;
    }

    public void setConfiscants_id(Integer confiscants_id) {
        this.confiscants_id = confiscants_id;
    }

    public Integer getConfiscant_groups_id() {
        return confiscant_groups_id;
    }

    public void setConfiscant_groups_id(Integer confiscant_groups_id) {
        this.confiscant_groups_id = confiscant_groups_id;
    }

    public Integer getDocument_resources_id() {
        return document_resources_id;
    }

    public void setDocument_resources_id(Integer document_resources_id) {
        this.document_resources_id = document_resources_id;
    }

    public Integer getImage_positions_id() {
        return image_positions_id;
    }

    public void setImage_positions_id(Integer image_positions_id) {
        this.image_positions_id = image_positions_id;
    }

    public String getImage_positions_name() {
        return image_positions_name;
    }

    public void setImage_positions_name(String image_positions_name) {
        this.image_positions_name = image_positions_name;
    }

    public String getFile_hash() {
        return file_hash;
    }

    public void setFile_hash(String file_hash) {
        this.file_hash = file_hash;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //
//     "confiscants_id": 5192,
//             "confiscant_groups_id": 1,
//             "document_resources_id": 140013,
//             "image_positions_id": 11,
//             "image_positions_name": "Tashqi ko`rinishi",
//             "file_hash": "ae7cc3bd8962c445aed6fc83049be32542e2c5a2",
//             "id": 65953
}
