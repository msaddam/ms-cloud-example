package com.ms.apigateway.controller;

import com.ms.apigateway.clint.ReservationClint;
import com.ms.resource.reservation.Reservation;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api/rest/reservation")
public class ReservationAdapterController {

    @Autowired
    private ReservationClint reservationClint;

    public Collection<String> fallback(){
        return new ArrayList<>();
    }

    @HystrixCommand(fallbackMethod = "fallback")
    @GetMapping("/name")
    public Collection<String> getReservationName(){
        return reservationClint.getReservation()
                .stream()
                .map(Reservation::getReservationName)
                .collect(Collectors.toList());
    }


    public Collection<Reservation> fallbackReservation(){
        return new ArrayList<>();
    }

    @HystrixCommand(fallbackMethod = "fallbackReservation")
    @GetMapping
    public Collection<Reservation> getReservation(){
        return reservationClint.getReservation();
    }

}
