package com.rank.entity;

import org.springframework.jdbc.core.RowMapper;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by ALISURE on 2017/3/14.
 */
public class TestEntity implements RowMapper<TestEntity>,Serializable{
    private String name;
    private int age;

    public TestEntity() {

    }

    public TestEntity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public TestEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        TestEntity testEntity = new TestEntity();
        testEntity.setAge(resultSet.getInt("age"));
        testEntity.setName(resultSet.getString("name"));
        return testEntity;
    }
}
