package com.girl;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * <p>girl/com.girl</p>
 *
 * @author Created by BruceZheng
 * @date 2018-01-19 14:42
 **/
@Repository
public class GirlsDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public Girl getById(long id) {
        String sql = "select *from girl where id=?";
        RowMapper<Girl> rowMapper = new BeanPropertyRowMapper<Girl>(Girl.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, id);
    }


}
