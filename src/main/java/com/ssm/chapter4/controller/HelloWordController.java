package com.ssm.chapter4.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloWordController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        return handle1(httpServletRequest,httpServletResponse);
    }
    private ModelAndView handle3(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        //如果想直接在控制器写出响应，只需要通过response写出，并返回null即可。
        try {
            //点击后再次请求当前页面
            httpServletResponse.getWriter().write("<a href=''>this</a>");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    private ModelAndView handle2(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        //如果想直接在控制器写出响应，只需要通过response写出，并返回null即可。
        try {
            httpServletResponse.getWriter().write("not need viewResover");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    private ModelAndView handle1(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        //1、收集参数
        //2、绑定参数到命令对象
        //3、调用业务对象
        //4、选择下一个页面
        ModelAndView mv = new ModelAndView();
        //添加模型数据 可以是任意的POJO对象
        mv.addObject("message", "Hello World!");
        //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
        mv.setViewName("hello");
        return mv;
    }
}
