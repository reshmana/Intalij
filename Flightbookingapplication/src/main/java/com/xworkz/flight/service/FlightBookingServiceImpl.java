package com.xworkz.flight.service;

import com.xworkz.flight.dto.FlightBooking;
import com.xworkz.flight.repository.FlightBookingRepository;
import com.xworkz.flight.repository.FlightBookingRepositoryImpl;

import java.util.List;

public class FlightBookingServiceImpl implements FlightBookingService{

    FlightBookingRepository flightBookingRepository= new FlightBookingRepositoryImpl();

    @Override
    public void save(FlightBooking booking) {
        //validation logic
        if (booking.getFlightName().isEmpty()){
            System.out.println("please enter valid flight name");
        }
        else {
            // repository  method save
            flightBookingRepository.saveFlightBookingDetails(booking);
        }
    }
    @Override
    public void saveAll(List<FlightBooking> bookings) {
        boolean validBooking=true;
        for (FlightBooking booking:bookings){
            if (booking.getFlightName().isEmpty()){
                System.out.println("please enter valid flight name");
                validBooking=false;
            }
            if (!validBooking){
                return;
            }
        }
       flightBookingRepository.saveAll(bookings);
    }

    @Override
    public void update(String FlightName, String Source, String Destination) {
        //validation logic
        if (FlightName==null || FlightName.isEmpty() ){
            System.out.println("plese enter valid name");
        }else{
            flightBookingRepository.update(FlightName,Source,Destination);
        }
    }
    @Override
    public void deleteByFlightName(String flightName) {
        if (flightName==null || flightName.isEmpty()){
            System.out.println("please enter valid flightname");
        }else {
            flightBookingRepository.deleteBYFlightName(flightName);
        }
    }
    @Override
    public FlightBooking FindByName(String flightName) {

            if(flightName == null){
                System.out.println("please entre the valid fligth nmae");
            }
            else{
                flightBookingRepository.FindByName(flightName);
            }
        return null;
    }
    @Override
    public List<FlightBooking> findAll() {
       List<FlightBooking> bookings= flightBookingRepository.findAll();
        return bookings;
    }


}
