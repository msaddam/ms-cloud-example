package com.ms.reservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ReservationStarter {

    public static void main(String[] args) {
        SpringApplication.run(ReservationStarter.class, args);
    }

}
