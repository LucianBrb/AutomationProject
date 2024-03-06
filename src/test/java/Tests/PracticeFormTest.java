package Tests;

import HelperMethods.ElementMethods;
import SharedData.SharedData;
import net.bytebuddy.asm.Advice;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;

public class PracticeFormTest extends SharedData {

    @Test
    public void metodaTest() {
        ElementMethods elementMethods = new ElementMethods(getWebDriver());

        //facem un scroll la pagina
        elementMethods.scrollElementByPixel(0,450);

        //identificam un element(ex buton)
        WebElement consentField = getWebDriver().findElement(By.className("fc-button-label"));
        elementMethods.clickElement(consentField);


        WebElement formsField = getWebDriver().findElement(By.xpath("//h5[text()='Forms']"));
        elementMethods.clickElement(formsField);

        elementMethods.scrollElementByPixel(0,450);

        WebElement webformsField = getWebDriver().findElement(By.xpath("//span[text()='Practice Form']"));
        elementMethods.clickElement(webformsField);

        WebElement firstnameField = getWebDriver().findElement(By.id("firstName"));
        String firstnameValue = "Lucian";
        //firstnameField.sendKeys(firstnameValue);
        elementMethods.fillElement(firstnameField,firstnameValue);

        WebElement lastName = getWebDriver().findElement(By.cssSelector("input[placeholder='Last Name']"));
        String lastNameValue = "Brebu";
        //lastName.sendKeys(lastNameValue);
        elementMethods.fillElement(lastName,lastNameValue);

        WebElement emailField = getWebDriver().findElement(By.xpath("//input[@placeholder='name@example.com']"));
        String emailValue = "k@yahoo.com";
        //emailField.sendKeys(emailValue);
        elementMethods.fillElement(emailField,emailValue);


        //WebElement userGender=webDriver.findElement(By.cssSelector("label[for='gender-radio-1']"));
        //userGender.click();
        //click pe una dintre cele trei optiuni:Male, Female, Other
        String usergenderValue = "Male";
        userGenderMethod(usergenderValue);  //l-am facut cu if la final


        WebElement userNumberField = getWebDriver().findElement(By.id("userNumber"));
        String userNumberValue = "0766666666";
        //userNumberField.sendKeys(userNumberValue);
        elementMethods.fillElement(userNumberField,userNumberValue);

        WebElement dateOfBirthField = getWebDriver().findElement(By.cssSelector(".react-datepicker__input-container"));
        elementMethods.clickElement(dateOfBirthField);

        WebElement monthDateOfBirth = getWebDriver().findElement(By.cssSelector(".react-datepicker__month-select"));
        //Select mothSelect = new Select(monthDateOfBirth);
        //monthSelect.selectByVisibleText("September");
        String monthValue = "September";
        elementMethods.selectTextElement(monthDateOfBirth, monthValue);

        WebElement yearDateofBirth = getWebDriver().findElement(By.cssSelector(".react-datepicker__year-select"));
        String yearValue = "1987";
        elementMethods.selectValueElement(yearDateofBirth,yearValue);
        //Select yearSelect = new Select(yearDateofBirth);
        //yearSelect.selectByValue("1987");


        List<WebElement> dayOfBirthieldFields = getWebDriver().findElements(
                By.xpath("//div[not(contains(@class, 'react-datepicker__day--outside-month')) " +
                        "and contains(@class, 'react-datepicker__day react-datepicker__day')]"));
        // sau se poate face folosind:
//              By.xpath("//div[not(contains(@class, 'outside-month')) and contains(@class, 'react-datepicker__day react-datepicker__day')]"));
        String dayValue = "12";
        for (Integer i = 0; i < dayOfBirthieldFields.size(); i++) {
            if (dayOfBirthieldFields.get(i).getText().equals(dayValue)) {
                //dayOfBirthieldFields.get(i).click();
                elementMethods.clickElement(dayOfBirthieldFields.get(i));
                //js.executeScript("arguments[0].click();", dayOfBirthieldFields);
                elementMethods.clickElementWithJavaScript(dateOfBirthField);
                break;
            }
        }
        String subjectFieldValue = "Economics";
        WebElement subjectField = getWebDriver().findElement(By.id("subjectsInput"));
        //subjectField.sendKeys(subjectFieldValue);
        //subjectField.sendKeys(Keys.ENTER);
        elementMethods.fillPressElement(subjectField,subjectFieldValue, Keys.ENTER);

        WebElement pictureField = getWebDriver().findElement(By.id("uploadPicture"));
        String filePath = "src/test/resources/WhatsApp Image 2023-04-01 at 09.45.07 (2).jpeg";
        elementMethods.fillElement(pictureField,new File(filePath).getAbsolutePath());
        //String filePath="src/test/resources/testFileUpload.txt";
        //pictureField.sendKeys(new File(filePath).getAbsolutePath());


        //facem un algoritm care sa mi selecteze valorile pe care i le specific
        List<String> Hobbies = Arrays.asList("Music", "Sports", "Reading"); //ce doresc sa selectez
        List<WebElement> HobbiesList = getWebDriver().findElements(
                By.xpath("//div[@id='hobbiesWrapper']//label[@class='custom-control-label']")); //ce e pe site

        for (Integer index = 0; index < HobbiesList.size(); index++) {
            String currentElementText = HobbiesList.get(index).getText();
            if (Hobbies.contains(currentElementText)) {
                elementMethods.clickElementWithJavaScript(HobbiesList.get(index));
                //HobbiesList.get(index).click();
                //js.executeScript("arguments[0].click();", HobbiesList.get(index));
            }
        }
//        WebElement userHobby = webDriver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']"));  //implementat mai sus
//        userHobby.click();


        WebElement currentAddressField = getWebDriver().findElement(By.cssSelector("textarea[placeholder='Current Address']"));
        String currentAddressValue = "strada, numar, localitate, judet ";
        elementMethods.fillElement(currentAddressField,currentAddressValue);
        //currentAddressField.sendKeys("strada, numar, localitate, judet ");

        elementMethods.scrollElementByPixel(0,450);

        //WebElement stateField = getWebDriver().findElement(By.xpath("//div[text()='Select State']"));
        //elementMethods.clickElement(stateField);

        String stateInputFieldValue = "NCR";
        WebElement stateInputField = getWebDriver().findElement(By.id("react-select-3-input"));
        elementMethods.fillPressElement(stateInputField,stateInputFieldValue, Keys.ENTER);
        //stateInputField.sendKeys(stateInputFieldValue);
        //stateInputField.sendKeys(Keys.ENTER);


        WebElement cityInputField = getWebDriver().findElement(By.id("react-select-4-input"));
        String cityValue = "Delphi";
        elementMethods.fillPressElement(cityInputField,cityValue,Keys.ENTER);
        //cityInputField.sendKeys("Delhi");
        //cityInputField.sendKeys(Keys.ENTER);

        WebElement submit = getWebDriver().findElement(By.id("submit"));
        elementMethods.clickElementWithJavaScript(submit);

        //validam tabelul cu valori
        List<WebElement> labelFields = getWebDriver().findElements(By.xpath("//table/tbody/tr/td[1]"));
        List<WebElement> valueFields = getWebDriver().findElements(By.xpath("//table/tbody/tr/td[2]"));

        //Assert.assertEquals(labelFields.get(0).getText(), "Student Name");
        //Assert.assertEquals(valueFields.get(0).getText(), firstnameValue + " " + lastNameValue);
        elementMethods.validateElementText(labelFields.get(0), "Student Name");
        elementMethods.validateElementText(valueFields.get(0),firstnameValue + " " + lastNameValue );

        //Assert.assertEquals(labelFields.get(1).getText(), "Student Email");
        //Assert.assertEquals(valueFields.get(1).getText(), emailValue);
        elementMethods.validateElementText(labelFields.get(1), "Student Email");
        elementMethods.validateElementText(valueFields.get(1), emailValue );

        //Assert.assertEquals(labelFields.get(2).getText(), "Gender");
        //Assert.assertEquals(valueFields.get(2).getText(), usergenderValue);
        elementMethods.validateElementText(labelFields.get(2),"Gender" );
        elementMethods.validateElementText(valueFields.get(2),usergenderValue);

        //Assert.assertEquals(labelFields.get(3).getText(), "Mobile");
        //Assert.assertEquals(valueFields.get(3).getText(), userNumberValue);
        elementMethods.validateElementText(labelFields.get(3),"Mobile");
        elementMethods.validateElementText(valueFields.get(3),userNumberValue );

        //Assert.assertEquals(labelFields.get(4).getText(), "Date of Birth");
        //Assert.assertEquals(valueFields.get(4).getText(), "12 September,1987");
        elementMethods.validateElementText(labelFields.get(4),"Date of Birth" );
        elementMethods.validateElementText(valueFields.get(4),"12 September,1987" );

        //Assert.assertEquals(labelFields.get(5).getText(), "Subjects");
        //Assert.assertEquals(valueFields.get(5).getText(), subjectFieldValue);
        elementMethods.validateElementText(labelFields.get(5),"Subjects" );
        elementMethods.validateElementText(valueFields.get(5),subjectFieldValue );


        Assert.assertEquals(labelFields.get(6).getText(), "Hobbies");
        for (Integer index = 0; index < Hobbies.size(); index++) {  //parcurg lista de elemente: Sport,Reading,etc
            Assert.assertTrue(valueFields.get(6).getText().contains(Hobbies.get(index))); //pe rand verific fiecare element daca e in lista
        }
        Assert.assertEquals(labelFields.get(7).getText(), "Picture");
        String[] arrayFile = filePath.split("/"); //extrag ultima parte din informatia: "src/test/resources/WhatsApp Image 2023-04-01 at 09.45.07 (2).jpeg"
        Integer desiredIndex = arrayFile.length - 1;    //aflam dimensiunea array-ului-luam ultima secventa
        Assert.assertEquals(valueFields.get(7).getText(), arrayFile[desiredIndex]);
    }

    public void userGenderMethod(String userGenderValue) {
        if (userGenderValue == "Male") {
            WebElement userGenderField = getWebDriver().findElement(By.cssSelector("label[for='gender-radio-1']"));
            userGenderField.click();
        } else {
            if (userGenderValue == "Female") {
                WebElement userGenderField = getWebDriver().findElement(By.cssSelector("label[for='gender-radio-2']"));
                userGenderField.click();
            } else {
                WebElement userGenderField = getWebDriver().findElement(By.cssSelector("label[for='gender-radio-3']"));
                userGenderField.click();
            }
        }
    }

}
