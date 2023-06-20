package com.itheima.controller;

import com.itheima.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Printable;

/**
 * @Description
 * @Author linhongqi
 * @Data 2023/6/13 21:19
 */

@Controller
public class HelloController {
    @Autowired
    private Person person;
    @RequestMapping("/hello")
    public String hello() {
        return "hello SpringBoot!";
    }



    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/index2")
    public String index2(){
        System.out.println(person);
        return "index2";
    }

    @GetMapping("/index3")
    public String index3(){
        System.out.println(person);
        return "index2";
    }

}
