package com.ms.apigateway.clint;

import com.ms.resource.reservation.Reservation;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient("reservation-service")
public interface ReservationClint {

    @GetMapping("/reservation")
    Collection<Reservation> getReservation();
}
