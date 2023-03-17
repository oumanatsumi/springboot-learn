package com.ouma.springboot02ideaspringbootcreate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @Value("${name}")
//    public String name;

//    @Autowired
//    private Environment env;

    @Autowired
    private Person person;

    @RequestMapping("hihi")
    public String hello2(){
        System.out.println(person.toString());
        return "hello name 2";
    }

    @RequestMapping("hi")
    public String hello(){
        return "hello22";
    }
}
