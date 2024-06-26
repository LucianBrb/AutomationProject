package Database.Queries;

import ObjectData.PracticeFormObject;
import Database.DatabaseConnection;
import loggerUtility.LoggerUtility;

import java.sql.SQLException;
import java.sql.Statement;

public class PracticeFormTable {
    //clasa care reprezinta un tabel specific
    private DatabaseConnection dbConnection;
    public PracticeFormTable () {
        dbConnection = new DatabaseConnection();
    }

    //definim metode pentru interactiunea cu un tabel
    public void insertIntoPracticeFormTable (PracticeFormObject testdata){
        try {
            Statement statement = dbConnection.getConnection().createStatement();
            String query = "insert into PracticeFormTable (firstNameFieldValue, lastNameFieldValue, emailFieldValue," +
                    " mobileNoFieldValue, dobMonthValue, yearValue, dayValue, genderValue, hobbies, userSubjectsValue, " +
                    "filePath, addressValue, stateLoc, cityLoc, " +
                    " values('"+testdata.getFirstNameFieldValue()+"', '"+testdata.getLastNameFieldValue()+"', '"+testdata.getEmailFieldValue()+"', '"+testdata.getMobileNoFieldValue()+"'" +
                    ", '"+testdata.getDayValue()+"', '"+testdata.getDobMonthValue()+"', '"+testdata.getYearValue()+"', '"+testdata.getGenderValue()+"', " +
                            "'"+testdata.getHobbies()+"', '"+testdata.getUserSubjectsValue()+"', '"+testdata.getFilePath()+"', '"+testdata.getAddressValue()+"'," +
                            "'"+testdata.getStateLoc()+"', '"+testdata.getCityLoc()+"');";
        } catch (SQLException e) {
            LoggerUtility.infoTest(e.getMessage());
        }
    }
}
