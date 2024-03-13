package com.customqueries01.customqueries01.repositories;

import com.customqueries01.customqueries01.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Long> {
}
