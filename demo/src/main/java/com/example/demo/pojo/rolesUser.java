package com.example.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @program: blogserver
 * @author: Bi tong
 * @create: 2020-07-01 14:19
 **/
@Entity
@Table
public class rolesUser extends BaseModel {
    private Long rid;
    private Long uid;

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }
}
