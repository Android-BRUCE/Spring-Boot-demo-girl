package com.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>girl/com.girl</p>
 *
 * @author Created by BruceZheng
 * @date 2017-12-27 16:15
 **/
@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    /**
     * 查询列表
     *
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList() {
        List<Girl> all = girlRepository.findAll();
        return all;
    }

    /**
     * 添加
     *
     * @param cupSize
     * @param age
     * @return
     */
    @PostMapping(value = "/girls")
    public Girl girlAdd(@RequestParam(value = "cupSize") String cupSize
            , @RequestParam(value = "age") Integer age) {
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setSizeCup(cupSize);
        Girl save = girlRepository.save(girl);
        return save;
    }

    /**
     * 根据年龄查询
     *
     * @param age
     * @return
     */
    @GetMapping(value = "/girls/age")
    public List<Girl> girlListByAge(@RequestParam(value = "age") Integer age) {
        List<Girl> byAge = girlRepository.findByAge(age);
        return byAge;
    }

    @PostMapping(value = "/girls/two")
    public void grilTwo() {
        girlService.inserTwo();
    }

    @PutMapping(value = "/girls/{id}")
    public Girl girlUpdate(@PathVariable(value = "id") Integer id, @RequestParam(value = "cupSize") String cupSize, @RequestParam(value = "age") Integer age
    ) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setSizeCup(cupSize);
        girl.setAge(age);
        Girl save = girlRepository.save(girl);
        return save;
    }
    @DeleteMapping(value = "/girls/{id}")
    public void delete(@PathVariable(value = "id") Integer id){
        girlRepository.delete(id);
    }

    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlListBAyge(@PathVariable(value = "age") Integer age){
        return girlRepository.findByAge(age);
    }
    @GetMapping(value = "/girls/count/{age}")
    public Integer countByAge(@PathVariable(value = "age") Integer age){
        return girlRepository.countGirlsByAgeEquals(age);
    }
}
