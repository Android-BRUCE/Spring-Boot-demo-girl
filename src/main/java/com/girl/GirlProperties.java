package com.girl;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * <p>girl/com.girl</p>
 * 获取配置文件中定义的 girl 的值
 * @author Created by BruceZheng
 * @date 2017-12-27 14:00
 **/
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
    private String cupSize;
    private Integer age;

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
