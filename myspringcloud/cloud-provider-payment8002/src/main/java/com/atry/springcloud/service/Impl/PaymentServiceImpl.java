package com.atry.springcloud.service.Impl;

import com.atry.springcloud.dao.PaymentDao;
import com.atry.springcloud.entities.Payment;
import com.atry.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    public Payment get(long id) {
        return paymentDao.get(id);
    }
    public Integer insert(Payment payment) {
        return paymentDao.insert(payment);
    }
}
