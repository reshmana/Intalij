package com.xworkz.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BankappicationDelete {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl="jdbc:mysql://localhost:3306/Bankapplication";
        String userName="root";
        String password="Xworkzodc@123";
        String deleteQuery="delete from Bank1 where name='HDFC'";
        Connection connection=null;//instance creating to call method in finally block
        Statement statement=null;


        try {
             connection=DriverManager.getConnection(jdbcUrl,userName,password);
          statement= connection.createStatement();
         int result= statement.executeUpdate(deleteQuery);
            System.out.println(result);
            System.out.println("deleted a record from bank");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
