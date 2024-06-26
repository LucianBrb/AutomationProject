package Database;

import loggerUtility.LoggerUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    //clasa care are ca scop sa faciliteze conexiunea cu o baza de date
    private Connection connection;


    public DatabaseConnection() {
        prepareConnection();
    }


    //metoda care face conexiunea la baza de date
    private void prepareConnection () {
        String url = "jdbc:mysql://localhost:3306/automationDB";
        try {
            connection = DriverManager.getConnection(url, "root", "Rxy02061990!");
            LoggerUtility.infoTest("Connected to database");
        } catch (SQLException e) {
            LoggerUtility.errorTest(e.getMessage());
        }
    }

    public void closeConnection () {
        try {
            connection.close();
            LoggerUtility.infoTest("Connection closed");
        } catch (SQLException e) {
            LoggerUtility.errorTest(e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }
}