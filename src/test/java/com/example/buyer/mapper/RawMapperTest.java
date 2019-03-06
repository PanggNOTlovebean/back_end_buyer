package com.example.buyer.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class RawMapperTest {
    @Autowired
    RawMapper rawMapper;
    @Test
    public void findById() {
        System.out.println(rawMapper.findById(1));
    }

    @Test
    public void changeNumById() {
        rawMapper.changeNumById(Float.parseFloat("10"),1);
    }
}