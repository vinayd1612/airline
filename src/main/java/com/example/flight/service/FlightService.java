package com.example.flight.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.flight.model.Flight;
import com.example.flight.repo.FlightRepo;

@Service
public class FlightService {

	@Autowired
	FlightRepo repo;
	//@Autowired
	//FlightFeignProxy proxy;
	@Autowired
	RestTemplate template;
	
	public String insertFlight(Flight f)
	{
		repo.save(f);
		return "Flight Added";
	}
	public List<Flight> displayAllFlights()
	{
		
		return repo.findAll();
	}
	
	public void deleteFlight(int id)
	{
		repo.deleteById(id);
		
	}
	public String deletePassenger(int id)
	{
		return template.getForObject("http://localhost:8082/passengers/deletePassenger/"+id, String.class);
	}
}
