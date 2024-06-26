package Database.Queries;

import Database.DatabaseConnection;
import ObjectData.AlertObject;
import loggerUtility.LoggerUtility;

import java.sql.SQLException;
import java.sql.Statement;

public class AlertTable {
    //clasa care reprezinta un tabel specific
    private DatabaseConnection dbConnection;
    public AlertTable () {
            dbConnection = new DatabaseConnection();
    }

    //definim metode pentru interactiunea cu un tabel
    public void insertIntoAlert (AlertObject testdata){
        try {
            Statement statement = dbConnection.getConnection().createStatement();
            String query = "insert into alertTable(alertPromt, entryDate)\n" +
                    "values('"+testdata.getInputAlert()+"', 'luni, 17 iunie');";
            statement.execute(query);
        } catch (SQLException e) {
                LoggerUtility.errorTest(e.getMessage());
        }
    }
}

