package com.girl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * <p>girl/com.girl</p>
 *
 * @author Created by BruceZheng
 * @date 2017-12-27 16:17
 **/
public interface GirlRepository extends JpaRepository<Girl,Integer> {

    //通过年龄查询
    public List<Girl> findByAge(Integer age);

    public Integer countGirlsByAgeEquals(Integer age);
}
