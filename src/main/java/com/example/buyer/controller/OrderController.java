package com.example.buyer.controller;

import com.example.buyer.object.Order;
import com.example.buyer.object.OrderDetailPaid;
import com.example.buyer.object.OrderPaid;
import com.example.buyer.objectVO.BuyerIdVO;
import com.example.buyer.objectVO.IdVO;
import com.example.buyer.result.Result;
import com.example.buyer.result.ResultCode;
import com.example.buyer.result.ResultFactory;
import com.example.buyer.service.OrderDetailPayedService;
import com.example.buyer.service.OrderPaidService;
import com.example.buyer.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.Timestamp;
import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderServiceImpl orderService;
    @Autowired
    OrderDetailPayedService orderDetailPayedService;
    @Autowired
    OrderPaidService orderPaidService;
    @CrossOrigin
    @PostMapping("/create")
    @ResponseBody
    public Result chooseFood(@Valid @RequestBody Order order, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
                return ResultFactory.buildFailResult("失败");
        }
        try{
            orderService.save(order);
        }catch (Exception e){
            return ResultFactory.buildFailResult("失败");
        }
        return ResultFactory.buildSuccessResult("购买成功");
    }
    @CrossOrigin
    @PostMapping("/cancel")
    @ResponseBody
    public Result cancel(@Valid @RequestBody IdVO id){
        try{
            orderService.deleteById(id.getId());
        }catch (Exception e){
            return ResultFactory.buildFailResult("失败");
        }
        return ResultFactory.buildSuccessResult("取消成功");
    }
    @CrossOrigin
    @PostMapping("/clear")
    @ResponseBody
    public Result clear(@Valid @RequestBody BuyerIdVO buyerId){
        try{
            String order_id=String.valueOf(System.currentTimeMillis());
            List<Order> orderList;
            orderList=orderService.findByBuyerId(Integer.parseInt(buyerId.getBuyerId()));
            orderService.deleteByBuyerId(buyerId.getBuyerId());
            Integer allprice=0;
            for(int i=0;i<orderList.size();i++){
                OrderDetailPaid orderDetailPaid =new OrderDetailPaid();
                orderDetailPaid.setName(orderList.get(i).getName());
                orderDetailPaid.setPrice(orderList.get(i).getPrice());
                orderDetailPaid.setDate(new Timestamp(System.currentTimeMillis()));
                orderDetailPaid.setId(orderList.get(i).getId());
                orderDetailPaid.setOrderId(order_id);
                orderDetailPayedService.save(orderDetailPaid);
                allprice+=orderList.get(i).getPrice();

            }
            OrderPaid orderPaid=new OrderPaid();
            orderPaid.setPrice(allprice);
            orderPaid.setId(order_id);
            orderPaid.setDate(new Timestamp(System.currentTimeMillis()));

            orderPaidService.save(orderPaid);
        }catch (Exception e){
            return ResultFactory.buildFailResult("失败");
        }
        return ResultFactory.buildSuccessResult("清除成功");
    }

    @CrossOrigin
    @PostMapping("/list")
    @ResponseBody
    public Result getAllFood(@Valid @RequestBody BuyerIdVO buyerId){
        List<Order> orderList;
        try{
            orderList=orderService.findByBuyerId(Integer.parseInt(buyerId.getBuyerId()));
        }catch (Exception e){
            return ResultFactory.buildFailResult("失败");
        }
        return ResultFactory.buidResult(ResultCode.SUCCESS,"success",orderList);
    }
}
