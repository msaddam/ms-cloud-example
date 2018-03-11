package com.ms.configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigStarter {

    public static void main(String[] args) {
        SpringApplication.run(ConfigStarter.class, args);
    }
}
