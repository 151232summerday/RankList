package com.rank.controller;

import com.rank.entity.Result;
import com.rank.entity.TestEntity;
import com.rank.service.TestService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ALISURE on 2017/3/14.
 */
@Controller
@RequestMapping("/test")
@Api(value = "/test",description = "测试Swagger自动生产API文档")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value="name/{name}",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value="根据用户名获取该用户的数据",httpMethod="GET",
            response = TestEntity.class,notes = "这是我的第一个自动化API",nickname = "ALISURE")
    public TestEntity getEntity(@PathVariable String name){
        System.out.println(name + "........");
        TestEntity testEntity = new TestEntity(name,12);
        return testEntity;
    }

    @RequestMapping(value="all",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value="获取全部的数据",httpMethod="GET",
            response = Result.class,notes = "这是我的第一个自动化API",nickname = "ALISURE")
    public List<TestEntity> getEntity(){
        System.out.println("get all........");
        return testService.getAllTestEntity();
    }
}
