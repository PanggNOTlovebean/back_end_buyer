package com.example.buyer.mapper;

import com.example.buyer.object.Food;
import org.apache.ibatis.annotations.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class FoodMapperTest {
    @Autowired
    FoodMapper foodMapper;
    @Test
    public void findByName() {
        Food food=foodMapper.findByName("鲶鱼");
        System.out.println(food);
    }
}