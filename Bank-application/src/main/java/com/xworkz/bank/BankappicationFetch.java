package com.xworkz.bank;

import java.sql.*;

public class BankappicationFetch {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl="jdbc:mysql://localhost:3306/Bankapplication";
        String userName="root";
        String password="Xworkzodc@123";

        String fetchQuery="select * from Bank1";

        Connection connection=null;
        Statement statement=null;

        try {
          connection= DriverManager.getConnection(jdbcUrl,userName,password);
           statement= connection.createStatement();
           ResultSet resultSet=statement.executeQuery(fetchQuery);
            System.out.println(resultSet);
            while(resultSet.next()){
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("branch"));
                System.out.println(resultSet.getString("ifsc_code"));
                System.out.println(resultSet.getString("location"));
            }

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
