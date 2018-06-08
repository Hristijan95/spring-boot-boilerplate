package com.hristijan.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "test_model")
@Entity
public class TestModel extends BaseModel {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
