package ObjectData;

import java.util.List;
import java.util.Map;

public class PracticeFormsObject extends GeneralObject {
    private String firstNameFieldValue;
    private String lastNameFieldValue;
    private String emailFieldValue;
    private String genderValue;
    private String mobileNoFieldValue;
    private String dobMonthValue;
    private String yearValue;
    private String dayValue;
    private String userSubjectsValue;
    private List<String> hobbies;
    private String filePath;
    private String addressValue;
    private String stateLoc;
    private String cityLoc;


    public PracticeFormsObject(Map<String, String> testData) {
        prepareObject(testData);
    }

    private void prepareObject(Map<String, String> testData) {
        for (String key : testData.keySet()) {
            switch (key) {
                case "firstNameFieldValue":
                    setFirstNameFieldValue(testData.get(key));
                    break;
                case "lastNameFieldValue":
                    setLastNameFieldValue(testData.get(key));
                    break;
                case "emailFieldValue":
                    setEmailFieldValue(testData.get(key));
                    break;
                case "genderValue":
                    setGenderValue(testData.get(key));
                    break;
                case "mobileNoFieldValue":
                    setMobileNoFieldValue(testData.get(key));
                    break;
                case "dobMonthValue":
                    setDobMonthValue(testData.get(key));
                    break;
                case "yearValue":
                    setYearValue(testData.get(key));
                    break;
                case "dayValue":
                    setDayValue(testData.get(key));
                    break;
                case "userSubjectsValue":
                    setUserSubjectsValue(testData.get(key));
                    break;
                case "hobbies":
                    hobbies = getPreparedValue(testData.get(key));
                    break;
                case "filePath":
                    setFilePath(testData.get(key));
                    break;
                case "addressValue":
                    setAddressValue(testData.get(key));
                    break;
                case "stateLoc":
                    setStateLoc(testData.get(key));
                    break;
                case "cityLoc":
                    setCityLoc(testData.get(key));
                    break;
            }
        }
    }

    public String getFirstNameFieldValue() {
        return firstNameFieldValue;
    }

    public String getLastNameFieldValue() {
        return lastNameFieldValue;
    }

    public String getEmailFieldValue() {
        return emailFieldValue;
    }

    public String getGenderValue() {
        return genderValue;
    }

    public String getMobileNoFieldValue() {
        return mobileNoFieldValue;
    }

    public String getDobMonthValue() {
        return dobMonthValue;
    }

    public String getYearValue() {
        return yearValue;
    }

    public String getDayValue() {
        return dayValue;
    }

    public String getUserSubjectsValue() {
        return userSubjectsValue;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getAddressValue() {
        return addressValue;
    }

    public String getStateLoc() {
        return stateLoc;
    }

    public String getCityLoc() {
        return cityLoc;
    }


    public void setFirstNameFieldValue(String firstNameFieldValue) {
        this.firstNameFieldValue = firstNameFieldValue;
    }

    public void setLastNameFieldValue(String lastNameFieldValue) {
        this.lastNameFieldValue = lastNameFieldValue;
    }

    public void setEmailFieldValue(String emailFieldValue) {
        this.emailFieldValue = emailFieldValue;
    }

    public void setGenderValue(String genderValue) {
        this.genderValue = genderValue;
    }

    public void setMobileNoFieldValue(String mobileNoFieldValue) {
        this.mobileNoFieldValue = mobileNoFieldValue;
    }

    public void setDobMonthValue(String dobMonthValue) {
        this.dobMonthValue = dobMonthValue;
    }

    public void setYearValue(String yearValue) {
        this.yearValue = yearValue;
    }

    public void setDayValue(String dayValue) {
        this.dayValue = dayValue;
    }

    public void setUserSubjectsValue(String userSubjectsValue) {
        this.userSubjectsValue = userSubjectsValue;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setAddressValue(String addressValue) {
        this.addressValue = addressValue;
    }

    public void setStateLoc(String stateLoc) {
        this.stateLoc = stateLoc;
    }

    public void setCityLoc(String cityLoc) {
        this.cityLoc = cityLoc;
    }
}