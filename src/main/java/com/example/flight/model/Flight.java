package com.example.flight.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flights")
public class Flight {

	@Id
	int fid;
	int aid;
	Date dtime;
	Date atime;
	
	Flight()
	{
		
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public Date getDtime() {
		return dtime;
	}

	public void setDtime(Date dtime) {
		this.dtime = dtime;
	}

	public Date getAtime() {
		return atime;
	}

	public void setAtime(Date atime) {
		this.atime = atime;
	}

	@Override
	public String toString() {
		return "flight [fid=" + fid + ", aid=" + aid + ", dtime=" 
	+ dtime + ", atime=" + atime + "]";
	}

	public Flight(int fid, int aid, Date dtime, Date atime) {
		super();
		this.fid = fid;
		this.aid = aid;
		this.dtime = dtime;
		this.atime = atime;
	}
	
}
