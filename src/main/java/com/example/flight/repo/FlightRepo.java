package com.example.flight.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.flight.model.Flight;

@Repository
@Transactional
public interface FlightRepo extends JpaRepository<Flight,Integer> {

}
