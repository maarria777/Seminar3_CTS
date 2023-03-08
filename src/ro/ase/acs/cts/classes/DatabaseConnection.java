package ro.ase.acs.cts.classes;

import ro.ase.acs.cts.interfaces.CreateTb;
import ro.ase.acs.cts.interfaces.Insert;
import ro.ase.acs.cts.interfaces.Read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db");
            connection.setAutoCommit(false);

//            createTable(connection);
//            insertDB(connection);
//            readData(connection);

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
