package com.example.flight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flight.model.Airline;
import com.example.flight.model.Flight;
import com.example.flight.service.AirlineService;
import com.example.flight.service.FlightService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/airlines")
public class AirController {

	@Autowired 
	AirlineService service;
	@GetMapping("/all")
	public List<Airline> showAll()
	{
		return service.displayAllAirlines();
	}
	
	@PostMapping("/add")
	public String addFlight(@RequestBody Airline a)
	{
		System.out.println(a);
		return service.insertAirline(a);
	}
	@GetMapping("/fromto/{from}/{to}")
	public List<Airline> fromTo(@PathVariable("from") String from,@PathVariable("to") String to)
	{
		return service.AirlinesFromTo(from, to);
	}
	@DeleteMapping("/delete/{id}")
	public String delAirline(@PathVariable("id") int id)
	{
		return service.deleteAirline(id);
		
		//return "Passenger deleted";
	}
}
