package com.xworkz.flight.repository;

import com.xworkz.flight.dto.FlightBooking;

import java.util.List;

public interface FlightBookingRepository {

    public void saveFlightBookingDitails(FlightBooking booking);

    public  void saveAll(List<FlightBooking> bookings);

    public void update(String FlightName,String Source,String Destination);

    public void deleteBYFlightName(String flightName);




}
