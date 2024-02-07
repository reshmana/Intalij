package com.xworkz.dam.repository;

import com.xworkz.dam.DTO.Dam;

import java.net.CookieHandler;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import static com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.XmlToken.Name;

public class DamRepositoryImpl implements DamRepository {
    @Override
    public void saveDetails(Dam dam) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl = "jdbc:mysql://localhost:3306/reservior";
        String userName = "root";
        String password = "Xworkzodc@123";
        String insertquery = "insert into Dam(name,place,state,height) values(?,?,?,?)";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(insertquery);
            preparedStatement.setString(1, dam.getName());
            preparedStatement.setString(2, dam.getPlace());
            preparedStatement.setString(3, dam.getState());
            preparedStatement.setDouble(4, dam.getHeight());
            preparedStatement.execute();
            System.out.println("inserted values into table");
            //System.out.println("insert value into table");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(String Name, String Place, String State, double Height) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl = "jdbc:mysql://localhost:3306/reservior";
        String userName = "root";
        String password = "Xworkzodc@123";
        String Updatequery = "update dam set place=?, State=? where Name=?";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(Updatequery);
            preparedStatement.setString(1, Name);
            preparedStatement.setString(2, Place);
            preparedStatement.setString(3, State);
            preparedStatement.executeUpdate();
            System.out.println("updated dam values");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void saveAll(List<Dam> dams) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl = "jdbc:mysql://localhost:3306/reservior";
        String userName = "root";
        String password = "Xworkzodc@123";
        String Updatequery = "update dam set place=?, State=? where Name=?";
        String insertquery = "insert into Dam(name,place,state,height) values(?,?,?,?)";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(insertquery);
            for (Dam ref : dams) {
                preparedStatement.setString(1, ref.getName());
                preparedStatement.setString(2, ref.getPlace());
                preparedStatement.setString(3, ref.getState());
                preparedStatement.setDouble(4, ref.getHeight());
                preparedStatement.execute();
                System.out.println("inserted all values into table");
                //System.out.println("insert value into table");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void updateAll(List<Dam> dams1) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl = "jdbc:mysql://localhost:3306/reservior";
        String userName = "root";
        String password = "Xworkzodc@123";
        String Updatequery1= "update dam set place=?, State=? where Name=?";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(Updatequery1);
            for (Dam ref2 : dams1) {
                preparedStatement.setString(1, ref2.getName());
                preparedStatement.setString(2, ref2.getPlace());
                preparedStatement.setString(3, ref2.getState());
                preparedStatement.executeUpdate();
                System.out.println("updated  all dam values");
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
