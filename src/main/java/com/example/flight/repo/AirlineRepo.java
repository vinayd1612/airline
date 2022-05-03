package com.example.flight.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.flight.model.Airline;

@Repository
@Transactional
public interface AirlineRepo extends JpaRepository<Airline,Integer> 
{

	@Query("select a from Airline a where a.source=?1 and a.dest=?2 ")
	public List<Airline> fromTo(String from,String to);
	
	
}


