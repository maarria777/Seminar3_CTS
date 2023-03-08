package ro.ase.acs.cts.main;

import ro.ase.acs.cts.classes.CreateTable;
import ro.ase.acs.cts.classes.DatabaseConnection;
import ro.ase.acs.cts.classes.DatabaseInsert;
import ro.ase.acs.cts.classes.DatabaseRead;
import ro.ase.acs.cts.interfaces.CreateTb;
import ro.ase.acs.cts.interfaces.Insert;
import ro.ase.acs.cts.interfaces.Read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

public class Main {

    public static void main(String[] args) throws SQLException {
        DatabaseConnection connection = new DatabaseConnection();

        CreateTb Newtable = new CreateTable();
        Insert insert = new DatabaseInsert();
        Read reader = new DatabaseRead();

        Newtable.createTable((Connection) connection);
    }
}
