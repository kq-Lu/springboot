package com.briup.sb.web.controller;

import com.briup.sb.bean.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThreeController {
    @GetMapping("/show")
    public Message show(){
        Message message=new Message();
        message.setStatus("lkq");
        message.setCode(111);
        return message;
    }
}
