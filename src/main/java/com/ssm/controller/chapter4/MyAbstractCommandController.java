package com.ssm.controller.chapter4;

import com.ssm.controller.chapter4.model.UserModel;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 命令控制器之一，可以实现该控制器来创建命令控制器，
 * 该控制器能把自动封装请求参数到一个命令对象，而且提供了验证功能。
 */
public class MyAbstractCommandController extends AbstractCommandController {
    public MyAbstractCommandController() {
        //设置命令对象实现类
        setCommandClass(UserModel.class);
    }
    @Override
    protected ModelAndView handle(HttpServletRequest req, HttpServletResponse resp, Object command, BindException errors) throws Exception {
        //将命令对象转换为实际类型
        UserModel user = (UserModel) command;
        ModelAndView mv = new ModelAndView();
        mv.setViewName("abstractCommand");
        mv.addObject("user", user);
        return mv;
    }
}
