package com.briup.sb.web.controller;

import com.briup.sb.bean.Message;
import com.briup.sb.bean.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ResponseController {
    @GetMapping("/test1")
    public Map<String,String> test1(){
        Map<String,String> map=new HashMap<>();
        map.put("name","lisi");
        map.put("desc","very nice");
        return map;
    }
    @GetMapping("/test2")
    public List<Map<String,String>> test2(){
        Map<String,String> map=new HashMap<>();
        Map<String,String> map1=new HashMap<>();
        map.put("name","mazd");
        map1.put("name","ztt");

        List<Map<String,String>> list=new ArrayList<>();
        list.add(map);
        list.add(map1);
        return list;
    }
    @GetMapping("/test3")
    public Message test3(){
        Message message=new Message();
        message.setCode(22);
        message.setStatus("xiaoql");
        return message;
    }
    @GetMapping("/test4")
    public String test4(String name,int age,String desc){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("desc:"+desc);
        return "ashdjasfjash";
    }
    @GetMapping("/test5")
    public String test5(Person person){
        System.out.println(person);
        return "asdasfasf124";
    }
    @GetMapping("/add")
    public String add(){
        return "添加学生成功";
    }
}
