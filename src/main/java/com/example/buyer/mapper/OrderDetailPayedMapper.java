package com.example.buyer.mapper;

import com.example.buyer.object.OrderDetailPaid;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderDetailPayedMapper {
    @Insert("insert into order_detail_paid(id,name,price,time,order_id)" +
            "values(#{id},#{name},#{price},#{date},#{orderId})")
    void save(OrderDetailPaid order);
    @Select("select * from order_detail_paid where order_id=#{orderId}")
    @Results(
            @Result(column = "order_id" ,property = "orderId")
    )
    List<OrderDetailPaid> getByOrderId(String orderId);

    @Select("select * from order_detail_paid")
    @Results(
            @Result(column = "order_id" ,property = "orderId")
    )
    List<OrderDetailPaid> getAll();
}
