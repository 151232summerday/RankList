package com.rank.service;

import com.rank.dao.TestDao;
import com.rank.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ALISURE on 2017/3/15.
 */
@Service("testService")
public class TestService {

    @Autowired
    private TestDao testDao;

    public List<TestEntity> getAllTestEntity(){
        return  testDao.getEntity();
    }

}
