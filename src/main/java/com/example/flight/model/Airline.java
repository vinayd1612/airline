package com.example.flight.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="airlines")
public class Airline {

	@Id
	int aid;
	String name;
	String source;
	String dest;
	int seats;
	public Airline()
	{
		
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public Airline(int aid, String name, String source, String dest, int seats) {
		super();
		this.aid = aid;
		this.name = name;
		this.source = source;
		this.dest = dest;
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "Airline [aid=" + aid + ", name=" + name + ", source=" + 
	source + ", dest=" + dest + ", seats=" + seats
				+ "]";
	}
	
}
