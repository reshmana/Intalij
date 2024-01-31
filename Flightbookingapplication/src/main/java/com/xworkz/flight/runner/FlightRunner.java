package com.xworkz.flight.runner;

import com.xworkz.flight.dto.FlightBooking;
import com.xworkz.flight.service.FlightBookingService;
import com.xworkz.flight.service.FlightBookingServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class FlightRunner {

    public static void main(String[] args) {
        //
//        FlightBookingRepository flightBookingRepository
//                =new FlightBookingRepositoryImpl();
        FlightBooking flight=new FlightBooking("Airlines","dheli","bengalore",6000);
        //flightBookingRepository.saveFlightBookingDitails(flight);

        FlightBookingService flightBookingService=new FlightBookingServiceImpl();
        flightBookingService.save(flight);

        //list<flightBooking>

        List<FlightBooking> bookings=new ArrayList<>();
        FlightBooking flightBooking1=new FlightBooking("Indigo","Bengalore","Dehli",6000);
        FlightBooking flightBooking2=new FlightBooking("Indigo","Bengalore","chennai",7000);
        bookings.add(flightBooking1);
        bookings.add(flightBooking2);
        //flightBookingService.saveAll(bookings);

       // flightBookingService.update("Emrates","Bengalore","Assam");

        flightBookingService.deleteByFlightName("Indigo");
    }
}
