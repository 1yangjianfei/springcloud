package com.example.demo.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @program: blogserver
 * @author: Bi tong
 * @create: 2020-07-01 11:21
 **/
@MappedSuperclass
public abstract class  BaseModel implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1782474744437162148L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseModel baseModel = (BaseModel) o;

        return id != null ? id.equals(baseModel.id) : baseModel.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
