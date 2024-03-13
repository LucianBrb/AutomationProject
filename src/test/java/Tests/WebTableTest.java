package Tests;

import HelperMethods.ElementMethods;
import Pages.ElementsPage;
import Pages.HomePage;
import Pages.WebTablePage;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest extends SharedData {


    @Test
    public void metodaTest(){

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToElementsPage();

        ElementsPage elementsPage = new ElementsPage(getWebDriver());
        elementsPage.navigateToWebTablePage();

        String firstNameValue="Lucian";
        String lastNameValue="Brebu";
        String emailFieldValue="brebu_lucian06@yahoo.com";
        String ageFieldValue= "36";
        String salaryFieldValue="999999";
        String departmentFieldValue="Testing";

        String firstNameModifyValue="Vlad";
        String lastNameModifyValue="Popescu";
        String ageModifyFieldValue= "20";

        WebTablePage webTablePage = new WebTablePage(getWebDriver());
        webTablePage.addNewEntry(firstNameValue, lastNameValue, emailFieldValue, ageFieldValue, salaryFieldValue,departmentFieldValue);
        webTablePage.editEntry(firstNameModifyValue, ageModifyFieldValue);
        webTablePage.deleteEntry();

    }
}
