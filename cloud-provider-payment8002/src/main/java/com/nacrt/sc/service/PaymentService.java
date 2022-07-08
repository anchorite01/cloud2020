package com.nacrt.sc.service;

import com.nacrt.sc.common.entities.Payment;

import java.util.List;

public interface PaymentService {
    boolean add(Payment payment);

    boolean del(Long id);

    boolean edit(Payment payment);

    Payment findById(Long id);

    List<Payment> findAll();
}
