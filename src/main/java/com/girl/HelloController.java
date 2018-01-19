package com.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>girl/com.girl</p>
 *
 * @author Created by BruceZheng
 * @date 2017-12-27 11:13
 *
 * @RestController 在类上注解，方法都返回字符串
 **/
@RestController
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/hello")
    public String say() {
        return "Hello1 WORLD!"+girlProperties.getCupSize()+girlProperties.getAge();
    }

    @RequestMapping(value = {"/index","/index02"})
    public String say02(Model model) {
        model.addAttribute("name","brucezheng");
        return "index";
    }
}
