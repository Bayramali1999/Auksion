package com.example.auksion.data;

import java.io.Serializable;

public class MyData implements Serializable {
    private Long id;

    public MyData(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
