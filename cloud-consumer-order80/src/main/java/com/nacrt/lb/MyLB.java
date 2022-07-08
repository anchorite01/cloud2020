package com.nacrt.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * MyLB
 */
@Component
public class MyLB implements LoadBalancer {
    private AtomicInteger atomicInteger = new AtomicInteger();

    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger(Integer.MAX_VALUE);
        System.out.println("ai.get() = " + ai.get());
        int i = ai.incrementAndGet();
        System.out.println("i = " + i);
        System.out.println("i % 11 = " + i % 11);
    }

    public int getAndIncrement() {
        return atomicInteger.getAndIncrement();
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {

        return null;
    }
}
