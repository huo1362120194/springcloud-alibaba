package com.spring.cloud.alibaba.controller;

import com.spring.cloud.alibaba.entity.User;
import com.spring.cloud.alibaba.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/provider")
public class AlibabaProviderController {

    @Autowired
    UserService userService;

    @RequestMapping("/query")
    @ResponseBody
    public Map query(@RequestParam("id") Integer id){
        Map map = new HashMap();
        User u = userService.findUserById(id);
        map.put("result", UUID.randomUUID().toString());
        map.put("user", u);
        return map;
    }

    @RequestMapping("/user")
    @ResponseBody
    public Map user(){
        //int i = 1/0;
        Map map = new HashMap();
        map.put("user", "xiaoxiao: " + UUID.randomUUID().toString());
        return map;
    }

    @RequestMapping("/create")
    @ResponseBody
    public Map saveUser(@RequestParam String name, @RequestParam Integer age){
        Map map = new HashMap();
        int lines = userService.create(new User(name,age));
        map.put("lines",lines);
        return map;
    }

    @RequestMapping("/del/{id}")
    @ResponseBody
    public Map deleteUser(@PathVariable Integer id){
        int i = 1 / 0;
        Map map = new HashMap();
        int lines = userService.deleteUserById(id);
        map.put("lines",lines);
        return map;
    }
}
