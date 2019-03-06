package com.example.buyer.mapper;

import com.example.buyer.object.Food;
import com.example.buyer.object.FoodRaw;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FoodMapper {
    @Select("select * from food where name = #{name}")

    Food findByName(String name);
}
