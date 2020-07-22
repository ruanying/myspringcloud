package com.atry.springcloud.controller;

import com.atry.springcloud.entities.CommonResult;
import com.atry.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderConrtoller {
    @Resource
    private RestTemplate restTemplate;
    //private static final String Payment_URL="http://127.0.0.1:8001";
    private static final String Payment_URL="http://CLOUD-PAYMENT-SERVICE";

    @GetMapping(value = "/getPaymentById/byOrder/{id}")
    public CommonResult getPaymentById(@PathVariable("id") long id){
        return restTemplate.getForObject(Payment_URL + "/get/" + id, CommonResult.class);
    }

    @GetMapping(value = "/insert/byOrder")
    public CommonResult insert(Payment payment){
        return restTemplate.postForObject(Payment_URL + "/insert/", payment, CommonResult.class);
    }
}
