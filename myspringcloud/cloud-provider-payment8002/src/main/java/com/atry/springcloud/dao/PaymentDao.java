package com.atry.springcloud.dao;

import com.atry.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    public Payment get(@Param("id") long id);
    public Integer insert(Payment payment);
}
