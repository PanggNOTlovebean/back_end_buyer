package com.example.buyer.mapper;

import com.example.buyer.object.Order;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface OrderMapper {
    @Select("select * from order_list where buyer_id = #{buyerId}")
    @Results(
            @Result(column = "buyer_id" ,property = "buyerId")
    )
    List<Order> findByBuyerId(Integer buyerId);

    @Insert("insert into order_list(id,name,price,buyer_id)" +
            "values(#{id},#{name},#{price},#{buyerId})")
    void save(Order order);

    @Delete("delete from order_list where id = #{id}")
    void deleteById(String id);

    @Delete("delete from order_list where buyer_id = #{buyerId}")
    void deleteByBuyerId(String buyerId);

}
