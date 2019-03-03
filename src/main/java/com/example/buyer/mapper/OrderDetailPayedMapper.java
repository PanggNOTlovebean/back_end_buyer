package com.example.buyer.mapper;

import com.example.buyer.object.Order;
import com.example.buyer.object.OrderDetailPayed;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDetailPayedMapper {
    @Insert("insert into order_detail_paid(id,name,price,time)" +
            "values(#{id},#{name},#{price},#{date})")
    void save(OrderDetailPayed order);
}
