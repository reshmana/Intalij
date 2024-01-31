package com.xworkz.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BankapplicationPreparedStatementUpdate {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl="jdbc:mysql://localhost:3306/Bankapplication";
        String userName="root";
        String password="Xworkzodc@123";
        String updateQuery="update bank1 set branch=? , location=?,name=?";

        try {
          Connection connection= DriverManager.getConnection(jdbcUrl,userName,password);
            PreparedStatement preparedStatement=connection.prepareStatement(updateQuery);
            preparedStatement.setString(1,"Malleshwarm");
            preparedStatement.setString(2,"Mangalore");
            preparedStatement.setString(3,"SBI");
            preparedStatement.execute();
            preparedStatement.setString(1,"shantinagr");
            preparedStatement.setString(2,"bengalore");
            preparedStatement.setString(3,"ICICI");
            preparedStatement.execute();

            preparedStatement.addBatch();
//            delete bank by branch and location using preparestatment
//            update branchname by location and idfc
//
//            select PS
//            methods
//            inherietance resuability
//            folder methods use resuability
//            equal hashcode
//            this,supre intanceof

            System.out.println("update bank using preparedStatement");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
