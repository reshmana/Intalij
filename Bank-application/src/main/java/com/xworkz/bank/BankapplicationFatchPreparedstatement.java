package com.xworkz.bank;

import java.sql.*;

public class BankapplicationFatchPreparedstatement {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/Bankapplication";
        String userName = "root";
        String password = "Xworkzodc@123";
        String Query = "select *from bank1 where name=? or branch=?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(jdbcUrl, userName, password);
            preparedStatement = connection.prepareStatement(Query);
            preparedStatement.setString(1, "ICICI");
            preparedStatement.setString(2, "Shantinagar");
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println(resultSet);
            while (resultSet.next()) {
                System.out.println("Bank Details!!!!!!!!!!!!!!!!!");
                System.out.println("Brank name_________" + resultSet.getString(2));
                System.out.println("Branch_________" + resultSet.getString(3));
                System.out.println("location______" + resultSet.getString(5));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                if (preparedStatement != null) {
                    try {
                        preparedStatement.close();
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }
}
