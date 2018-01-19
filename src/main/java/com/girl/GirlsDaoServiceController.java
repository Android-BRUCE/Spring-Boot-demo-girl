package com.girl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>girl/com.girl</p>
 *
 * @author Created by BruceZheng
 * @date 2018-01-19 14:50
 **/
@RestController
public class GirlsDaoServiceController {

    @Resource
    private GirlsDaoService girlsDaoService;

    @GetMapping("/girls/getById/{id}")
    public Girl getById(@PathVariable(value = "id") Integer id){
        return girlsDaoService.getById(id);
    }
}
