package com.ksg.airlines;

import java.util.ArrayList;

public class Airport 
{
	private Address address;
	private static ArrayList<Flight> flights;
	private static ArrayList<Traveller> travellers;
	
	
	public Airport() {}


	public Airport(Address address, ArrayList<Flight> flights, ArrayList<Traveller> travellers) 
	{
		
		this.address = address;
		this.flights = flights;
		this.travellers = travellers;
	}
	


	public Address getAddress() 
	{
		return address;
	}


	public void setAddress(Address address)
	{
		this.address = address;
	}


	public ArrayList<Flight> getFlights() 
	{
		return flights;
	}


	public void setFlights(ArrayList<Flight> flights) 
	{
		this.flights = flights;
	}


	public ArrayList<Traveller> getTravellers()
	{
		return travellers;
	}


	public void setTravellers(ArrayList<Traveller> travellers) 
	{
		this.travellers = travellers;
	}


	public static boolean addFlight(Flight flights)
	{
		ArrayList<Flight> flights = new ArrayList<Flight>();
		
		flights.add(flights);
		
	}
	
	
	public static Traveller bookTicket(String flightId,Traveller traveller)
	{
		if(Flight.availableSeats>0)
		{
			Flight.availableSeats--;
			return traveller;
			
		}
		else
		{
			System.out.println("No seats available");
		}
	}
	
	
	
	 public static void searchFlight(String src,String des)
	 {
		 for(int i=0;;i++)
		 {
			 if(flights[i].source==src&& flights[i].destination==des)
			 {
				 return flights[i];
			 }
		 }
	 }
	
	
}
