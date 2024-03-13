package com.customqueries01.customqueries01.controllers;

import com.customqueries01.customqueries01.entities.Flight;
import com.customqueries01.customqueries01.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    /* DEPRECATO
    @PostMapping("/provision")
    public ResponseEntity<Random> provisionFlights(){
        Random random = flightService.provisionFlights();
        return ResponseEntity.ok().body(random);
    }
      */


    @GetMapping("/provision")
    public ResponseEntity<List<Flight>>provFlights(){
        List<Flight> flights = flightService.provFlights();
        return ResponseEntity.ok().body(flights);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Flight>> selectAllFlights(){
        List<Flight> allFlights = flightService.getAllFlights();
        return ResponseEntity.ok().body(allFlights);
    }
}
