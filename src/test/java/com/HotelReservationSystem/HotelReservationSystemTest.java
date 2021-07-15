package com.HotelReservationSystem;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HotelReservationSystemTest {
	
	HotelReservationSystem Obj = new HotelReservationSystem();
	
	@Test
    public void addedList_toCheck_bySize() {
        Obj.addHotelDetails();
        assertEquals("Adding 3 Hotels into the list", 3, Obj.hotelList.size());
    }
}
