package com.ssm.chapter4.controller;

import com.ssm.chapter4.model.UserModel;
import org.springframework.web.servlet.mvc.SimpleFormController;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 提交表单的控制器
 */
public class RegisterSimpleFormController extends SimpleFormController {
    public RegisterSimpleFormController() {
        setCommandClass(UserModel.class); //设置命令对象实现类
        setCommandName("user");//设置命令对象的名字
    }
    @Override
    //form object 表单对象，提供展示表单时的表单数据（使用commandName放入请求）
    protected Object formBackingObject(HttpServletRequest request) throws Exception {
        UserModel user = new UserModel();
        user.setUsername("请输入用户名");
        return user;
    }
    @Override
    //提供展示表单时需要的一些其他数据
    protected Map referenceData(HttpServletRequest request) throws Exception {
        Map<String, List<String>> model = new HashMap<String,List<String>>();
        model.put("cityList", Arrays.asList("山东", "北京", "上海"));
        return model;
    }
    @Override
    protected void doSubmitAction(Object command) throws Exception {
        UserModel user = (UserModel) command;
        System.out.println(user);
    }
}
