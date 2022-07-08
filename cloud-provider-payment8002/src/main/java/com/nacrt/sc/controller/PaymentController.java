package com.nacrt.sc.controller;

import com.nacrt.sc.common.entities.CommonResult;
import com.nacrt.sc.common.entities.Payment;
import com.nacrt.sc.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * PaymentController
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/{id}")
    public CommonResult<Payment> findById(@PathVariable Long id) {
        Payment payment = paymentService.findById(id);
        return new CommonResult<>(200, "query success:" + serverPort, payment);
    }

    @RequestMapping
    public CommonResult<List<Payment>> findAll() {
        List<Payment> payments = paymentService.findAll();
        return new CommonResult<>(200, "query success:" + serverPort, payments);
    }

    @PostMapping
    public CommonResult<Boolean> add(@RequestBody Payment payment) {
        boolean flag = paymentService.add(payment);
        return new CommonResult<>(200, "add success:" + serverPort, flag);
    }

    @PutMapping
    public CommonResult<Boolean> edit(@RequestBody Payment payment) {
        boolean flag = paymentService.edit(payment);
        return new CommonResult<>(200, "edit success:" + serverPort, flag);
    }

    @DeleteMapping("/{id}")
    public CommonResult<Boolean> del(@PathVariable Long id) {
        boolean flag = paymentService.del(id);
        return new CommonResult<>(200, "del success:" + serverPort, flag);
    }

    @GetMapping("/lb")
    public String lb() {
        return serverPort;
    }

}
