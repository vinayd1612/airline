package com.example.flight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flight.model.Flight;
import com.example.flight.service.FlightService;

@RestController
@RequestMapping("/flights")
public class Controller {

	@Autowired 
	FlightService service;
	@GetMapping("/all")
	public List<Flight> showAll()
	{
		return service.displayAllFlights();
	}
	
	@PostMapping("/addflight")
	public String addFlight(@RequestBody Flight f)
	{
		return service.insertFlight(f);
	}
	
	@DeleteMapping("/deleteflight/{id}")
	public String delFlight(@PathVariable("id") int id)
	{
		service.deleteFlight(id);
		return "Flight deleted";
	}
	@DeleteMapping("/deletePassenger/{id}")
	public String delPassenger(@PathVariable("id") int id)
	{
		return service.deletePassenger(id);
		
		//return "Passenger deleted";
	}
	
	
}
