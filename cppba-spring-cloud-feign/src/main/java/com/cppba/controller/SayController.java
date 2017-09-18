package com.cppba.controller;

import com.cppba.service.SayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zou on 2017/8/10.
 */
@RestController
@RequestMapping("/say")
public class SayController {

    @Autowired
    private SayService sayService;

    @RequestMapping("/hi")
    public String sayHi(@RequestParam(value = "name") String name) {
        return sayService.sayHi(name);
    }

}
