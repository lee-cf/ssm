package com.ssm.chapter6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author lcf
 */
@Controller
@RequestMapping("/customers")
public class RequestMethodController {
    @RequestMapping(value="/create", method = RequestMethod.GET)//②类级别的@RequestMapping窄化
    public String showForm() {
        System.out.println("===============GET");
        return "customer/create";
    }
    @RequestMapping(value="/create", method = RequestMethod.POST)//③类级别的@RequestMapping窄化
    public String submit() {
        System.out.println("================POST");
        return "redirect:/success";
    }
}
