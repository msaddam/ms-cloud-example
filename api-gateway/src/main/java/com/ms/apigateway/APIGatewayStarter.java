package com.ms.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableFeignClients
@EnableCircuitBreaker
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class APIGatewayStarter {

    /**
     * this bean for load balance restTemplate or use Feign clint
     * @return
     */
    /*@Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }*/

    public static void main(String ar[]){
        SpringApplication.run(APIGatewayStarter.class, ar);
    }
}
