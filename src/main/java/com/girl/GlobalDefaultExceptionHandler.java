package com.girl;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>girl/com.girl</p>
 * 全局异常捕捉
 * 1、新建一个Class,这里取名为GlobalDefaultExceptionHandler
 * 2、在class上添加注解，@ControllerAdvice;
 * 3、在class中添加一个方法
 * 4、在方法上添加@ExcetionHandler拦截相应的异常信息；
 * 5、如果返回的是View -- 方法的返回值是ModelAndView;
 * 6、如果返回的是String或者是Json数据，那么需要在方法上添加@ResponseBody注解.
 *
 * @author Created by BruceZheng
 * @date 2018-01-19 15:10
 **/
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public String defaultErrorHandler(HttpServletRequest req, Exception e) {
        //ModelAndView -- 介绍 模板引擎...?
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName(viewName);
        return "对不起，服务器繁忙，请稍后再试！";
    }
}
