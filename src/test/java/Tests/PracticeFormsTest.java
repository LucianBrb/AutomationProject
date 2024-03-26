package Tests;
import ObjectData.PracticeFormsObject;
import Pages.FormsPage;
import Pages.HomePage;
import Pages.PracticeFormsPage;
import PropertyUtility.PropertyUtility;
import SharedData.SharedData;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PracticeFormsTest extends SharedData {


    @Test
    public void metodaTest() {
        PropertyUtility propertyUtility = new PropertyUtility("practiceFormsData");
        PracticeFormsObject practiceFormsObject= new PracticeFormsObject(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToFormsPage();

        FormsPage formsPage = new FormsPage(getWebDriver());
        formsPage.navigateToPracticeForm();

        PracticeFormsPage practiceFormsPage = new PracticeFormsPage(getWebDriver());

        practiceFormsPage.fillEntireForm(practiceFormsObject);
        practiceFormsPage.validatePracticeFormTable(practiceFormsObject);

    }
}