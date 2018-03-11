package com.ms.airline.controller;

import com.ms.airline.domain.Airport;
import com.ms.airline.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class AirportController {

    @Autowired
    private AirportRepository airportRepository;


    @GetMapping("/airport")
    public Collection<Airport> getAirports(){
        return airportRepository.findAll();
    }
}
