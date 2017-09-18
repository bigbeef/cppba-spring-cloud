package com.cppba.controller;

import com.cppba.service.SayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zou on 2017/8/10.
 */
@Controller
@RequestMapping("/say")
public class SayController {

    @Autowired
    private SayService sayService;

    @RequestMapping("/hi")
    @ResponseBody
    public String sayHi(@RequestParam(value = "name") String name) {
        return sayService.sayHi(name);
    }

}
