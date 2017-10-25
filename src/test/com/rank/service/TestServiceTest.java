package com.rank.service;

import com.rank.entity.TestEntity;
import com.rank.test.BaseJunitTest;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by ALISURE on 2017/3/18.
 */
public class TestServiceTest extends BaseJunitTest {

    public static Logger logger = Logger.getLogger(TestServiceTest.class);

    @Autowired
    private TestService testService;

    @Test
    public void test1(){
        System.out.println("test1()");
    }

    @Test
    public void getAllTestEntity(){
        List<TestEntity> list = testService.getAllTestEntity();
        for (TestEntity testEntity : list) {
            System.out.println(testEntity.getName() + ":" + testEntity.getAge());
        }
    }
}
