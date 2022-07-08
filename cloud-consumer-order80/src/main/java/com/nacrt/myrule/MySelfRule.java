package com.nacrt.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MySelfRule
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule getMyRule() {
        return new RandomRule(); // 定义随机负载均衡规则
    }

}
