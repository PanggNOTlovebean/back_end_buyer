package com.example.buyer.controller;

import com.example.buyer.object.Food;
import com.example.buyer.objectVO.BuyerIdVO;
import com.example.buyer.objectVO.FoodNameVO;
import com.example.buyer.result.Result;
import com.example.buyer.result.ResultCode;
import com.example.buyer.result.ResultFactory;
import com.example.buyer.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class FoodContrller {
    @Autowired
    FoodService foodService;
    @CrossOrigin
    @PostMapping("/getfood")
    @ResponseBody
    public Result clear(@Valid @RequestBody FoodNameVO foodNameVO){
        Food food;
        try{
            food=foodService.findByName(foodNameVO.getName());
        }catch (Exception e){
            return ResultFactory.buildFailResult("失败");
        }
        return ResultFactory.buidResult(ResultCode.SUCCESS,"success",food);
    }

}
