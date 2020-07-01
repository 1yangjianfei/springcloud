package com.example.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @program: blogserver
 * @author: Bi tong
 * @create: 2020-07-01 11:48
 **/
@Entity
@Table
public class Roles extends BaseModel {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
