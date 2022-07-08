package com.nacrt.sc.service.impl;

import com.nacrt.sc.common.entities.Payment;
import com.nacrt.sc.mapper.PaymentMapper;
import com.nacrt.sc.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public boolean add(Payment payment) {
        return paymentMapper.insert(payment) > 0;
    }

    @Override
    public boolean del(Long id) {
        return paymentMapper.delete(id) > 0;
    }

    @Override
    public boolean edit(Payment payment) {
        return paymentMapper.update(payment) > 0;
    }

    @Override
    public Payment findById(Long id) {
        return paymentMapper.selectById(id);
    }

    @Override
    public List<Payment> findAll() {
        return paymentMapper.selectAll();
    }
}
