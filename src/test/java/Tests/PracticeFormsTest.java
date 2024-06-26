package Tests;
import ObjectData.PracticeFormObject;
import Pages.FormsPage;
import Pages.HomePage;
import Pages.PracticeFormPage;
import PropertyUtility.PropertyUtility;
import SharedData.SharedData;
import org.testng.annotations.Test;

public class PracticeFormsTest extends SharedData {


    @Test
    public void metodaTest() {
        PropertyUtility propertyUtility = new PropertyUtility("practiceFormsData");
        PracticeFormObject practiceFormsObject= new PracticeFormObject(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getGetwebDriver());
        homePage.navigateToFormsPage();

        FormsPage formsPage = new FormsPage(getGetwebDriver());
        formsPage.navigateToPracticeForm();

        PracticeFormPage practiceFormsPage = new PracticeFormPage(getGetwebDriver());

        practiceFormsPage.fillEntireForm(practiceFormsObject);
        practiceFormsPage.validatePracticeFormTable(practiceFormsObject);
    }
}