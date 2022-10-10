package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Anupa Amawarni
 */
public class DBConnection {

    private static DBConnection dbConnection;
    private Connection connection;

    private DBConnection() throws Exception {
        Class.forName("org.sqlite.JDBC");
        String dbUrl = "jdbc:sqlite:src/database/TTTUltimateDatabase.sqlite";
        connection = DriverManager.getConnection(dbUrl);
    }

    public static DBConnection getInstance() throws Exception {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

    public Connection getConnection() {
        return connection;
    }

}
