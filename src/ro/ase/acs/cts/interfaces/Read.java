package ro.ase.acs.cts.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface Read {
     void readDB(Connection connection) throws SQLException;
}
