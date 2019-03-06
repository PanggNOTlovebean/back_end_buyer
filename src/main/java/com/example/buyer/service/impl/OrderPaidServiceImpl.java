package com.example.buyer.service.impl;

import com.example.buyer.mapper.*;
import com.example.buyer.object.*;
import com.example.buyer.service.OrderPaidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderPaidServiceImpl implements OrderPaidService {
    @Autowired
    OrderPaidMapper orderPaidMapper;
    @Autowired
    OrderDetailPayedMapper orderDetailPayedMapper;
    @Autowired
    RawMapper rawMapper;
    @Autowired
    FoodRawMapper foodRawMapper;
    @Autowired
    FoodMapper foodMapper;
    @Override
    public void save(OrderPaid order) {
        String orderId=order.getId();
        List<OrderDetailPaid> orderDetailPaidList=orderDetailPayedMapper.getByOrderId(orderId);
        for(int i=0;i<orderDetailPaidList.size();i++){
            String name=orderDetailPaidList.get(i).getName();
            Food food=foodMapper.findByName(name);
            List<FoodRaw> foodRaws=foodRawMapper.findByFoodId(food.getId());
            for(int j=0;j<foodRaws.size();j++){
                Raw raw=rawMapper.findById(foodRaws.get(j).getRawId());
                Float oldNum=raw.getNumber();
                Float newNum=oldNum-foodRaws.get(j).getNum();
                rawMapper.changeNumById(newNum,raw.getId());
            }
        }
        orderPaidMapper.save(order);

    }
}
