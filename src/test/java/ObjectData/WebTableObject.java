package ObjectData;

import java.util.Map;

public class WebTableObject {
    private String firstNameValue;
    private String lastNameValue;
    private String emailFieldValue;
    private String ageFieldValue;
    private String salaryFieldValue;
    private String departmentFieldValue;

    //facem o metoda care sa mapeze datele din fisierul de resursa cu reprezentarea acestui obiect

    public WebTableObject (Map<String,String> testData){
        prepareObject(testData);

    }

    private void prepareObject (Map<String,String> testData){
        for (String key: testData.keySet()){
           switch (key){
               case "firstNameValue":
                   setFirstNameValue(testData.get(key));
                   break;
               case "lastNameValue":
                   setLastNameValue(testData.get(key));
                   break;
               case "emailFieldValue":
                   setEmailFieldValue(testData.get(key));
                   break;
               case "ageFieldValue":
                   setAgeFieldValue(testData.get(key));
                   break;
               case "salaryFieldValue":
                   setSalaryFieldValue(testData.get(key));
                   break;
               case "departmentFieldValue":
                   setDepartmentFieldValue(testData.get(key));
                   break;

           }
        }
    }

    public String getFirstNameValue() {
        return firstNameValue;
    }

    public String getLastNameValue() {
        return lastNameValue;
    }

    public String getEmailFieldValue() {
        return emailFieldValue;
    }

    public String getAgeFieldValue() {
        return ageFieldValue;
    }

    public String getSalaryFieldValue() {
        return salaryFieldValue;
    }

    public String getDepartmentFieldValue() {
        return departmentFieldValue;
    }
    public void setFirstNameValue(String firstNameValue) {
        this.firstNameValue = firstNameValue;
    }

    public void setLastNameValue(String lastNameValue) {
        this.lastNameValue = lastNameValue;
    }

    public void setEmailFieldValue(String emailFieldValue) {
        this.emailFieldValue = emailFieldValue;
    }

    public void setAgeFieldValue(String ageFieldValue) {
        this.ageFieldValue = ageFieldValue;
    }

    public void setSalaryFieldValue(String salaryFieldValue) {
        this.salaryFieldValue = salaryFieldValue;
    }

    public void setDepartmentFieldValue(String departmentFieldValue) {
        this.departmentFieldValue = departmentFieldValue;
    }
}
