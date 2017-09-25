package com.cppba.service.impl;

import com.cppba.service.SayService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author winfed
 * @create 2017-09-18 16:00
 */
@RestController
public class SayServiceImpl implements SayService {

    @Value("${server.port}")
    private String port;

    @Override
    public String sayHi(String name) {
        return "hi " + name + ",i am from port:" + port;
    }
}
