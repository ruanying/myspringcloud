package com.atry.springcloud.service;

import com.atry.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {
    public Payment get(@Param("id") long id);
    public Integer insert(Payment payment);
}
