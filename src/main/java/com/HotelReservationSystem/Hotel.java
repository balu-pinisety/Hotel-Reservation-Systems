package com.HotelReservationSystem;

/**
 * @author BALU
 * Constructor Class for the Hotel Reservation system
 */
public class Hotel {
	
	// Parameters Instance Variable
	private String hotelName;
	private int regularPrice;

	// Parameterized Constructor
	public Hotel(String hotelName, int regularPrice) {
		this.setHotelName(hotelName);
	    this.setRegularPrice(regularPrice);
	}

	public int getRegularPrice() {
		return regularPrice;
	}

	public void setRegularPrice(int regularPrice) {
		this.regularPrice = regularPrice;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

}
