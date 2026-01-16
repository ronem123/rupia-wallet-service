package com.ronem.walletservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RupiaWalletServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RupiaWalletServiceApplication.class, args);
    }

}
