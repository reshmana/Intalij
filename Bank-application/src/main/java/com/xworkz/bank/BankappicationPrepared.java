package com.xworkz.bank;

import java.sql.*;

public class BankappicationPrepared {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String userUrl="jdbc:mysql://localhost:3306/Bankapplication";
        String userName="root";
        String password="Xworkzodc@123" ;

        String insertQuery="INSERT INTO Bank1 VALUES(?,?,?,?,?)";//?(placeholder)
//        String updateQuery="update bank1 set branck='?' where name=?";

        try {
            Connection connection=DriverManager.getConnection(userUrl,userName,password);
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
//        preparedStatement.setString(1,"Malleshwaram");
//        preparedStatement.setString(2,"SBI");
//        preparedStatement.execute();
//        preparedStatement.setInt(1,12);
//        preparedStatement.setString(2,"ICICI");m
//        preparedStatement.setString(3,"Kormangala");
//        preparedStatement.setString(4,"ICICI00168");
//        preparedStatement.setString(5,"Bengalore");
//        preparedStatement.execute();
//            preparedStatement.setInt(1,11);
//            preparedStatement.setString(2,"Axis");
//            preparedStatement.setString(3,"BTM");
//            preparedStatement.setString(4,"AXIS00123");
//            preparedStatement.setString(5,"Bengalore");
//            preparedStatement.execute();

            preparedStatement.setInt(1,13);
            preparedStatement.setString(2,"fedaral");
            preparedStatement.setString(3,"shantinagar");
            preparedStatement.setString(4,"FEDR00578");
            preparedStatement.setString(5,"Bengalore");
            preparedStatement.execute();
            System.out.println("insert data using preparedstatement!!!!!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
