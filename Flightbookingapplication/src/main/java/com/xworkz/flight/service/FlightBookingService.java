package com.xworkz.flight.service;

import com.xworkz.flight.dto.FlightBooking;

import java.util.List;

public interface FlightBookingService {

    public void save(FlightBooking booking);
    public  void saveAll(List<FlightBooking> bookings);

    public void  update(String FlightName,String Source,String Destination);

    public  void deleteByFlightName(String FlightName);


}
