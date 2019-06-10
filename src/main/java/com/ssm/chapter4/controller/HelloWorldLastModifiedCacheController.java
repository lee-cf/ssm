package com.ssm.chapter4.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.LastModified;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 可以判断是否修改的控制器
 */
public class HelloWorldLastModifiedCacheController extends AbstractController implements LastModified {
    private long lastModified;
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        return handle3(httpServletRequest,httpServletResponse);
    }

    @Override
    public long getLastModified(HttpServletRequest httpServletRequest) {
        if(lastModified == 0L) {
            //TODO 此处更新的条件：如果内容有更新，应该重新返回内容最新修改的时间戳
            lastModified = System.currentTimeMillis();
        }
        return lastModified;
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

}
