package com.ms.reservation.controller;

import com.ms.reservation.domain.Reservation;
import com.ms.reservation.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ReservationController {

    @Autowired
    private ReservationRepository reservationRepository;

    @GetMapping("/reservation")
    Collection<Reservation> getResrevations(){
        return reservationRepository.findAll();
    }
}
