package com.esliceu.dwes.xavi.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController{


    @RequestMapping( method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello!!");
        return "hello";
    }

    @RequestMapping(value = "/vitaly", method = RequestMethod.GET)
    public String printHelloVitaly(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "vitaly";
    }

    @RequestMapping(value = "/xavi", method = RequestMethod.GET)
    public String printHelloXavi(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "xavi";
    }

}