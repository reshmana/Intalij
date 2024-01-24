package com.xworkz.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BankApplication {
    public static void main(String[] args) {


            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            String jdbcUrl="jdbc:mysql://localhost:3306/Bankapplication";
            String UserName="root";
            String password="Xworkzodc@123";

            String insertQuery="INSERT INTO Bank1 VALUES(1,'SBI','BTM','SBI000170','Bangalore')";
            String insertQuery1="INSERT INTO Bank1 VALUES(2,'ICICI','Jaynagar','CIC00510','Bangalore')";
            String insertQuery2="INSERT INTO Bank1 VALUES(3,'HDFC','JP nagar','HDF000800','Bangalore')";
            String insertQuery3="INSERT INTO Bank1 VALUES(4,'Axis','Vijaynagar','AXI000902','Bangalore')";
            String insertQuery4="INSERT INTO Bank1 VALUES(5,'Canara','BTM','CAN0008520','Bangalore')";
            String insertQuery5="INSERT INTO Bank1 VALUES(6,'Union','Hebbal','BTM','UNI000632','Bangalore')";
            String insertQuery6="INSERT INTO Bank1 VALUES(7,'IDBI','Yalhanka','IDB000503','Bangalore')";
            String insertQuery7="INSERT INTO Bank1 VALUES(8,'Yes Bank','BTM','YES000740','Bangalore')";
            String insertQuery8="INSERT INTO Bank1 VALUES(9,'Indian Bank','Gandinagar','IND000615','Bangalore')";
            String insertQuery9="INSERT INTO Bank1 VALUES(10,'Federal ','BTM','FED000805','Bangalore')";

        try {
            Connection connection=DriverManager.getConnection(jdbcUrl,UserName,password);
            Statement statement=connection.createStatement();
            boolean result=statement.execute(insertQuery);
            System.out.println(result);
            boolean result1=statement.execute(insertQuery1);
            System.out.println(result1);
            boolean result2=statement.execute(insertQuery2);
            System.out.println(result2);
            boolean result3=statement.execute(insertQuery3);
            System.out.println(result3);
            boolean result4=statement.execute(insertQuery4);
            System.out.println(result4);
            boolean result5=statement.execute(insertQuery5);
            System.out.println(result5);
            boolean result6=statement.execute(insertQuery6);
            System.out.println(result6);
            boolean result7=statement.execute(insertQuery7);
            System.out.println(result7);
            boolean result8=statement.execute(insertQuery8);
            System.out.println(result8);
            boolean result9=statement.execute(insertQuery9);
            System.out.println(result9);
            System.out.println("inserted data into bank");

            System.out.println("Connection to Database is sucessfull");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    }

