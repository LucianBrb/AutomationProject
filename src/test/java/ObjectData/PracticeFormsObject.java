package ObjectData;

import java.util.List;
import java.util.Map;

public class PracticeFormObject extends GeneralObject{
    private String firstNameFieldValue;
    private String lastNameFieldValue;
    private String emailFieldValue;
    private String genderValue;
    private String mobileNoFieldValue;
    private String subjectValue;
    private List<String> hobbies;
    private String filePath;
    private String adressValue;
    private String stateLoc;
    private String cityLoc;

    public PracticeFormObject (Map<String,String> testData){
        prepareObject(testData);

    }
    private void prepareObject (Map<String,String> testData){
        for (String key: testData.keySet()){
            switch (key){
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
                case "subjectValue":
                    setSubjectValue(testData.get(key));
                    break;
                case "hobbies":
                    hobbies= getPreparedValue(testData.get(key));
                    setHobbies(testData.get(key));
                    break;
                case "filePath":
                    setFilePath(testData.get(key));
                    break;
                case "adressValue":
                    setAdressValue(testData.get(key));
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

    public void setSubjectValue(String subjectValue) {
        this.subjectValue = subjectValue;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setAdressValue(String adressValue) {
        this.adressValue = adressValue;
    }

    public void setStateLoc(String stateLoc) {
        this.stateLoc = stateLoc;
    }

    public void setCityLoc(String cityLoc) {
        this.cityLoc = cityLoc;
    }
}
de completat -rectificat