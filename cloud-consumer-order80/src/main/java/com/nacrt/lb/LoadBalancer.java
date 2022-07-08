package com.nacrt.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * LoadBalancer
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
