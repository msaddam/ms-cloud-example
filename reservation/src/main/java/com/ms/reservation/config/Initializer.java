package com.ms.reservation.config;

import com.ms.reservation.domain.Reservation;
import com.ms.reservation.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;


@Component
public class Initializer implements ApplicationRunner{

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {

//        Stream.of("Saddam", "Sahil", "Samshad", "Sonu")
//                .forEach(name -> reservationRepository.save(new Reservation(null, name)));

        reservationRepository.findAll().forEach(System.out::println);

    }
}
