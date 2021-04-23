package com.example.dockerimagejar.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("title", "你好，这是一个web项目，这是前端显示！");
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "你好!这是测试";
    }
}
