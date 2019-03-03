package com.example.buyer.mapper;

import com.example.buyer.object.OrderPaid;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderPaidMapper {
    @Insert("insert into order_paid(id,price,date)" +
            "values(#{id},#{price},#{date})")
    void save(OrderPaid order);
}
