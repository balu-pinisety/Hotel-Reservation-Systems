package com.HotelReservationSystem;

import java.util.ArrayList;

/**
 * @author BALU
 * Implementing Hotel Reservation System Program
 */
public class HotelReservationSystem {
	
	//ArrayList to store Hotel List
	ArrayList<Hotel> hotelList = new ArrayList<>();
		
	public void welcomeMessage() {
		//Welcome Message
		System.out.println("Welcome to the Hotel Reservation System");
	}
			
	/**
	 * Created a method addHotelDetails to add the hotels in the array list
	 */
	public void addHotelDetails() {
		
		//Call Values in constructor
		hotelList.add(new Hotel("Lakewood", 110));
	    hotelList.add(new Hotel("Bridgewood", 150));
	    hotelList.add(new Hotel("Ridgewood", 220));

	}
		
}