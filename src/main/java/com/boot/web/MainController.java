package com.boot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wyn on 2019/1/23.
 */
@Controller
public class MainController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    @ResponseBody
    String home() {
        System.out.println("home");
        return "Hello World!";
    }
}
