package com.girl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>girl/com.girl</p>
 *
 * @author Created by BruceZheng
 * @date 2018-01-19 14:44
 **/
@Service
public class GirlsDaoService {
    @Resource
    private GirlsDao girlsDao;

    public Girl getById(Integer id){
        Girl byId = girlsDao.getById(id);
        return byId;
    }

}
