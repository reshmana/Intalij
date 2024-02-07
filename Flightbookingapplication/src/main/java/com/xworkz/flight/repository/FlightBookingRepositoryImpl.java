package com.xworkz.flight.repository;

import com.xworkz.flight.dto.FlightBooking;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlightBookingRepositoryImpl implements FlightBookingRepository {
    @Override
    public void saveFlightBookingDetails(FlightBooking booking) {
        String userUrl = "jdbc:mysql://localhost:3306/bankapplication";
        String username = "root";
        String password = "Xworkzodc@123";
        String insertQuery = "insert into airticket " + "(flight_name,source,destination,price)"
                + "VALUES(?,?,?,?)";

        try {
            Connection connection = DriverManager.getConnection(userUrl, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, booking.getFlightName());
            preparedStatement.setString(2, booking.getSource());
            preparedStatement.setString(3, booking.getDestination());
            preparedStatement.setInt(4, booking.getPrice());
            preparedStatement.execute();
            System.out.println("inserted values into table");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void saveAll(List<FlightBooking> bookings) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String userUral = "jdbc:mysql://localhost:3306/bankapplication";
        String userName = "root";
        String password = "Xworkzodc@123";
        String insertQuery = "insert into airticket(Flight_name,source,destination,price)" + "values(?,?,?,?)";

        try {
            Connection connection = DriverManager.getConnection(userUral, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            for (FlightBooking ref : bookings) {
                preparedStatement.setString(1, ref.getFlightName());
                preparedStatement.setString(2, ref.getDestination());
                preparedStatement.setString(3, ref.getSource());
                preparedStatement.setInt(4, ref.getPrice());
                preparedStatement.execute();
                System.out.println("inserted values into table" + ref.getFlightName());

            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void update(String FlightName, String Source, String Destination) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUral = "jdbc:mysql://localhost:3306/Bankapplication";
        String userName = "root";
        String password = "Xworkzodc@123";
        String updatequery = "update airticket set source=?, destination=? where flight_name=?";

        try {
            Connection connection = DriverManager.getConnection(jdbcUral, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(updatequery);
            preparedStatement.setString(1, Source);
            preparedStatement.setString(2, Destination);
            preparedStatement.setString(3, FlightName);
            preparedStatement.executeUpdate();
            System.out.println("update data!!!!!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteBYFlightName(String flightName) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUral = "jdbc:mysql://localhost:3306/Bankapplication";
        String userName = "root";
        String password = "Xworkzodc@123";
        String deletequery = "DELETE from airticket where flight_name=?";

        try {
            Connection connection = DriverManager.getConnection(jdbcUral, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(deletequery);
            preparedStatement.setString(1, flightName);
            preparedStatement.executeUpdate();
            System.out.println("deleted !!!1");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public FlightBooking FindByName(String flightName) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUral = "jdbc:mysql://localhost:3306/Bankapplication";
        String userName = "root";
        String password = "Xworkzodc@123";
        String query = "select * from airticket where flight_name=?";

        FlightBooking booking=null;
        try {
           Connection connection= DriverManager.getConnection(jdbcUral,userName,password);
           PreparedStatement preparedStatement = connection.prepareStatement(query);
           preparedStatement.setString(1,flightName);
            ResultSet resultSet=preparedStatement.executeQuery();
            if (resultSet.next()){
                System.out.println(resultSet.getString("source"));
                System.out.println(resultSet.getString("destination"));
                booking=new FlightBooking();
                booking .setFlightName(resultSet.getString("flight_name"));
                booking .setSource(resultSet.getString("source"));
                booking .setDestination(resultSet.getString("destination"));
                booking.setPrice(resultSet.getInt("price"));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return booking;
    }

    @Override
    public List<FlightBooking> findAll() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUral = "jdbc:mysql://localhost:3306/Bankapplication";
        String userName = "root";
        String password = "Xworkzodc@123";
        String query = "select * from airticket ";
        List<FlightBooking> bookings=new ArrayList<>();

        try {
          Connection connection=  DriverManager.getConnection(jdbcUral,userName,password);
            PreparedStatement preparedStatement= connection.prepareStatement(query);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString("source"));
                FlightBooking booking=new FlightBooking();
                booking.setFlightName(resultSet.getString("flight_Name"));
                booking.setSource(resultSet.getString("source"));
                booking.setDestination(resultSet.getString("destination"));
                booking.setPrice(resultSet.getInt("price"));
                bookings.add(booking);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return bookings;
    }
}





