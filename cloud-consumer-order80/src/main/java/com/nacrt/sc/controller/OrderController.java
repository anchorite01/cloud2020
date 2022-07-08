package com.nacrt.sc.controller;

import com.nacrt.sc.common.entities.CommonResult;
import com.nacrt.sc.common.entities.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * PaymentController
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private RestTemplate restTemplate;
//    private static final String URL = "http://localhost:8001/payment";
    private static final String URL = "http://PROVIDER-PAYMENT/payment";

    @RequestMapping("/{id}")
    public CommonResult<Payment> findById(@PathVariable Long id) {
        return restTemplate.getForObject(URL + "/" + id, CommonResult.class);
    }

    @PostMapping
    public CommonResult<Boolean> add(@RequestBody Payment payment) {
        return restTemplate.postForObject(URL, payment, CommonResult.class);
    }


    @RequestMapping("/getForEntity/{id}")
    public CommonResult<Payment> getForEntity(@PathVariable Long id) {
        ResponseEntity<CommonResult> res = restTemplate.getForEntity(URL + "/" + id, CommonResult.class);
        if (res.getStatusCode().is2xxSuccessful()) {
            return res.getBody();
        } else {
            return new CommonResult<>(400, "请求失败", null);
        }
    }

    @RequestMapping("/postForEntity/{id}")
    public CommonResult<Boolean> postForEntity(@RequestBody Payment payment) {
        ResponseEntity<CommonResult> res = restTemplate.postForEntity(URL, payment, CommonResult.class);
        if (res.getStatusCode().is2xxSuccessful()) {
            return res.getBody();
        } else {
            return new CommonResult<>(400, "请求失败", null);
        }
    }

}
