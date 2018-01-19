package com.girl;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * <p>girl/com.girl</p>
 *
 * @author Created by BruceZheng
 * @date 2017-12-27 15:39
 **/
@Entity
public class Girl {
    @Id
    @GeneratedValue
    private Integer id;
    private String sizeCup;
    /**
     * serialize 不序列化该字段，在返回字段中 不会出现 该字段（使用了fastjson）
     */
    @JSONField(serialize = false)
    private Integer age;
    public Girl(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSizeCup() {
        return sizeCup;
    }

    public void setSizeCup(String sizeCup) {
        this.sizeCup = sizeCup;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
