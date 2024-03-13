package com.customqueries01.customqueries01.services;

import com.customqueries01.customqueries01.entities.Flight;
import com.customqueries01.customqueries01.entities.enums.StatusEnum;
import com.customqueries01.customqueries01.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.stream.IntStream;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    /* DEPRECATO
    private String generateRandomString() {
        return String.valueOf(new Random().nextInt(1000));
    }

    public Random provisionFlights() {
        Random random = new Random();
        IntStream.range(0, 50).forEach(i -> {
            Flight flight = new Flight();
            flight.setDescription(generateRandomString());
            flight.setFromAirport(generateRandomString());
            flight.setToAirport(generateRandomString());
            flight.setStatusEnum(StatusEnum.ONTIME);

            flightRepository.save(flight);
        });

        return random;
    } */

    public List<Flight> provFlights() {
        for (int i = 0; i < 50; i++) {
            Flight flight = new Flight();
            flight.setDescription("Flight " + i);
            flight.setFromAirport("Airport " + i);
            flight.setToAirport("Airport " + (i + 1));
            flight.setStatusEnum(StatusEnum.ONTIME);
            flightRepository.save(flight);
        }
        return flightRepository.findAll();
    }


    public List<Flight> getAllFlights(){
        List<Flight> flights = flightRepository.findAll();
        return flights;
    }


}
