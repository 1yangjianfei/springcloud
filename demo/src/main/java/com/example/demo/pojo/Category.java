package com.example.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * @program: blogserver
 * @author: Bi tong
 * @create: 2020-07-01 13:55
 **/
@Entity
@Table
public class Category extends BaseModel {
    private String cateName;
    private Timestamp date;

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
}
