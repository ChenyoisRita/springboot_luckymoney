package com.imooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

//@Controller + @ResponseBody = @RestControleer
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("/say")
//    @PostMapping("/say")
//    @RequestMapping("/say")
    public String say(@RequestParam(value = "id", required = false, defaultValue =  "0") Integer id) {
        return  "id:" + id;
    }

}
