package com.example.flight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flight.model.Airline;
//import com.example.flight.model.Flight;
import com.example.flight.repo.AirlineRepo;

@Service
public class AirlineService {

	@Autowired 
	AirlineRepo arepo;
	
	public String insertAirline(Airline a)
	{
		arepo.save(a);
		return "Airline Added";
	}
	public List<Airline> displayAllAirlines()
	{
		return arepo.findAll();
	}
	public List<Airline> AirlinesFromTo(String from,String to)
	{
		return arepo.fromTo(from,to);
	}
	public String deleteAirline(int id)
	{
		arepo.deleteById(id);
		return "Airline Deleted";
	}
}
