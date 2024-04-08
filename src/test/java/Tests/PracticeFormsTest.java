package Tests;
import ObjectData.PracticeFormsObject;
import Pages.FormsPage;
import Pages.HomePage;
import Pages.PracticeFormsPage;
import PropertyUtility.PropertyUtility;
import SharedData.SharedData;
import org.testng.annotations.Test;

public class PracticeFormsTest extends SharedData {


    @Test
    public void metodaTest() {
        PropertyUtility propertyUtility = new PropertyUtility("practiceFormsData");
        PracticeFormsObject practiceFormsObject= new PracticeFormsObject(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getGetwebDriver());
        homePage.navigateToFormsPage();

        FormsPage formsPage = new FormsPage(getGetwebDriver());
        formsPage.navigateToPracticeForm();

        PracticeFormsPage practiceFormsPage = new PracticeFormsPage(getGetwebDriver());

        practiceFormsPage.fillEntireForm(practiceFormsObject);
        practiceFormsPage.validatePracticeFormTable(practiceFormsObject);
    }
}