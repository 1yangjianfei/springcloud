package com.example.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @program: blogserver
 * @author: Bi tong
 * @create: 2020-07-01 13:49
 **/
@Entity
@Table
public class Tags extends BaseModel  {
    private String tagName;

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
}
