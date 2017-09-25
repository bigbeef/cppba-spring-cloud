package com.cppba.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author winfed
 * @create 2017-09-18 15:48
 */
@FeignClient(value = "service-say")
@Api(value = "打印服务")
public interface SayService {

    @ApiOperation(value = "打印欢迎语句", notes = "简单SpringMVC请求")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "你的名字", required = true, paramType = "query", dataType = "String"),
    })
    @RequestMapping(value = "/hi", method = RequestMethod.POST)
    String sayHi(String name);

}
