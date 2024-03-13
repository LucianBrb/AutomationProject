package Tests;

import HelperMethods.ElementMethods;
import Pages.FormsPage;
import Pages.HomePage;
import Pages.PracticeFormsPage;
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

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToFormsPage();

        FormsPage formsPage = new FormsPage(getWebDriver());
        formsPage.navigateToPracticeForm();

        String firstNameFieldValue="Teo";
        String lastNameFieldValue="Virjoghe";
        String emailFieldValue= "test@test.test";
        String mobileNoFieldValue= "0123456789";
        String dobMonthValue = "July";
        String yearValue = "1998";
        String dayValue = "6";
        String genderValue = "Male";
        List<String> hobbies = Arrays.asList("Sports", "Music");
        String userSubjectsValue = "comp";
        String filePath = "src/test/resources/blur.png";
        String addressValue = "oras, strada, numar";
        String subjectValue = "Computer Science";
        String stateLoc = "NCR";
        String cityLoc = "Delhi";


        PracticeFormsPage practiceFormsPage = new PracticeFormsPage(getWebDriver());
        practiceFormsPage.fillFirstName(firstNameFieldValue);
        practiceFormsPage.fillLastName(lastNameFieldValue);
        practiceFormsPage.fillEmailField(emailFieldValue);
        practiceFormsPage.fillMobileNoField(mobileNoFieldValue);
        practiceFormsPage.pickBirthDate(dobMonthValue, yearValue, dayValue);
        practiceFormsPage.pickGender(genderValue);
        practiceFormsPage.pickHobbies(hobbies);
        practiceFormsPage.pickSubjects(userSubjectsValue);
//        practiceFormsPage.uploadPicture(filePath);
        practiceFormsPage.pickAddress(addressValue);
        practiceFormsPage.pickState(stateLoc);
        practiceFormsPage.pickCity(cityLoc);
        practiceFormsPage.clickSubmit();
        practiceFormsPage.validatePracticeFormTable(firstNameFieldValue,lastNameFieldValue,emailFieldValue,genderValue,mobileNoFieldValue,subjectValue,addressValue,
                stateLoc,cityLoc, hobbies,filePath);

    }
}