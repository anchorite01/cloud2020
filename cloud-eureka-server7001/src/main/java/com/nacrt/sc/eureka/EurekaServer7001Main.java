package com.nacrt.sc.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7001Main {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001Main.class, args);
    }
}
