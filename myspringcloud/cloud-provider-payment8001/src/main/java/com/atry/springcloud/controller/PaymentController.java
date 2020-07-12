package com.atry.springcloud.controller;

import com.atry.springcloud.entities.CommonResult;
import com.atry.springcloud.entities.Payment;
import com.atry.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;


    @GetMapping(value = "/get/{id}")
    public CommonResult get(@PathVariable("id") Long id){
        Payment payment = paymentService.get(id);
        if(payment!=null){
            return new CommonResult(200,"有数据",payment);
        }else {
            return new CommonResult(444,"无数据",null);
        }
    }

    @PostMapping(value = "/insert")
    public CommonResult insert(@RequestBody Payment payment){
        Integer insert = paymentService.insert(payment);
        if(insert>0){
            return new CommonResult(200,"插入成功",insert);
        }else {
            return new CommonResult(444,"插入失败",null);
        }
    }
}
