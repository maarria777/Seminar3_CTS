package ro.ase.acs.cts.main;

import ro.ase.acs.cts.classes.CreateTable;
import ro.ase.acs.cts.classes.DatabaseConnection;
import ro.ase.acs.cts.classes.DatabaseInsert;
import ro.ase.acs.cts.classes.DatabaseRead;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        DatabaseConnection connection = new DatabaseConnection();


        CreateTable table = new CreateTable();
        DatabaseInsert insert = new DatabaseInsert();
        DatabaseRead reader = new DatabaseRead();
    }

//    private static void createTable(Connection connection) throws SQLException {
//        String sqlDrop = "DROP TABLE IF EXISTS employees";
//        String sqlCreate = "CREATE TABLE employees(id INTEGER PRIMARY KEY,"
//                + "name TEXT, address TEXT, salary REAL)";
//
//        Statement statement = connection.createStatement();
//        statement.executeUpdate(sqlDrop);
//        statement.executeUpdate(sqlCreate);
//        statement.close();
//        connection.commit();
//    }
//
//    private static void insertData(Connection connection) throws SQLException {
//        String sqlInsert = "INSERT INTO employees VALUES(1, 'Popescu Ion', 'Bucharest', 4000)";
//        Statement statement = connection.createStatement();
//        statement.executeUpdate(sqlInsert);
//        statement.close();
//
//        String sqlInsertWithParams = "INSERT INTO employees VALUES (?,?,?,?)";
//        PreparedStatement preparedStatement =
//                connection.prepareStatement(sqlInsertWithParams);
//        preparedStatement.setInt(1, 2);
//        preparedStatement.setString(2, "Ionescu Vasile");
//        preparedStatement.setString(3, "Brasov");
//        preparedStatement.setDouble(4, 4500);
//        preparedStatement.executeUpdate();
//        preparedStatement.close();
//
//        connection.commit();
//    }
//
//    private static void readData(Connection connection) throws SQLException {
//        String sqlSelect = "SELECT * FROM employees";
//        Statement statement = connection.createStatement();
//        ResultSet rs = statement.executeQuery(sqlSelect);
//        while(rs.next()) {
//            int id = rs.getInt("id");
//            System.out.println("id: " + id);
//            String name = rs.getString(2);
//            System.out.println("name: " + name);
//            String address = rs.getString("address");
//            System.out.println("address: " + address);
//            double salary = rs.getDouble("salary");
//            System.out.println("salary: " + salary);
//        }
//        rs.close();
//        statement.close();
//    }
}
