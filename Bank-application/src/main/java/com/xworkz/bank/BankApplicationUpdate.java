package com.xworkz.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BankApplicationUpdate {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUral="jdbc:mysql://localhost:3306/Bankapplication";
        String userName="root";
        String password="Xworkzodc@123";
        String updateQuery="update Bank1 set Branch='Rajajinagar' where Name='SBI'";
        String updateQuery1="update Bank1 set Location='Bijapur' where Branch='Jaynagar'";
        String updateQuery2="update Bank1 set name='HDFC' where Location='Bangalore'";
        String updateQuery3="update Bank1 set ifsc_code='AXI000902' where Name='SBI'";
        String updateQuery4="update Bank1 set Branch='BTM' where Name='Canara'";
        String updateQuery5="update Bank1 set Name='Union' where ifsc_code='UNI000632'";
        String updateQuery6="update Bank1 set Location='Bangalore' where Name='IDBI'";
        String updateQuery7="update Bank1 set Branch='Yalhanka' where Location='Bangalore'";
        String updateQuery8="update Bank1 set ifsc_code='IND000615' where Name='Indian Bank'";
        String updateQuery9="update Bank1 set Location='Bangalore' where ifsc_code='FED000805'";

        try {
           Connection connection= DriverManager.getConnection(jdbcUral,userName,password);
          Statement statement= connection.createStatement();
          boolean result=statement.execute(updateQuery);
            System.out.println(result);
            boolean result1=statement.execute(updateQuery1);
            System.out.println(result1);
            boolean result2=statement.execute(updateQuery2);
            System.out.println(result2);
            boolean result3=statement.execute(updateQuery3);
            System.out.println(result3);
            boolean result4=statement.execute(updateQuery4);
            System.out.println(result4);
            boolean result5=statement.execute(updateQuery5);
            System.out.println(result5);
            boolean result6=statement.execute(updateQuery6);
            System.out.println(result6);
            boolean result7=statement.execute(updateQuery7);
            System.out.println(result7);
            boolean result8=statement.execute(updateQuery8);
            System.out.println(result8);
            boolean result9=statement.execute(updateQuery9);
            System.out.println(result9);
            System.out.println("updated data into bank!!!!!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
