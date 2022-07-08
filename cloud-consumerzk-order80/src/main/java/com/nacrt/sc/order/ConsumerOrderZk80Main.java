package com.nacrt.sc.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ConsumerOrderZk80Main
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerOrderZk80Main {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrderZk80Main.class, args);
    }
}
