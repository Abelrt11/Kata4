package software.Miulpgc.es.control.IO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {
    private  static final String DB_URL = "jdbc_sqlite:titleRatings.sqlite";

    public static Connection Connect() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }
}
