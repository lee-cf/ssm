package com.ssm.chapter4.controller;

import com.ssm.chapter4.model.DataBinderTestModel;
import com.ssm.chapter4.model.PhoneNumberModel;
import com.ssm.chapter4.controller.support.editor.PhoneNumberEditor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataBinderTestController extends AbstractCommandController {
        public DataBinderTestController() {
            setCommandClass(DataBinderTestModel.class); //设置命令对象
            setCommandName("dataBinderTest");//设置命令对象的名字
        }
        @Override
        protected ModelAndView handle(HttpServletRequest req, HttpServletResponse resp, Object command, BindException errors) throws Exception {
            //输出command对象看看是否绑定正确
            System.out.println(command);
            return new ModelAndView("bindAndValidate/success").addObject("dataBinderTest", command);
        }
//        @Override
//        protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
//            super.initBinder(request, binder);
//            //注册自定义的属性编辑器
//            //1、日期
//            DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            CustomDateEditor dateEditor = new CustomDateEditor(df, true);
//            //表示如果命令对象有Date类型的属性，将使用该属性编辑器进行类型转换
//            binder.registerCustomEditor(Date.class, dateEditor);
//            //自定义的电话号码编辑器
//            binder.registerCustomEditor(PhoneNumberModel.class, new PhoneNumberEditor());
//        }
    }
