package Tests;

import HelperMethods.ElementMethods;
import Pages.ElementsPage;
import Pages.HomePage;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebtableTest extends SharedData {


    @Test
    public void metodaTest(){

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToElementsPage();

        ElementMethods elementPage = new ElementsPage(getWebDriver());
        elementPage.



        WebElement webTablesField=getWebDriver().findElement(By.xpath("//span[text()='Web Tables']"));
        webTablesField.click();

        WebElement addField= getWebDriver().findElement(By.id("addNewRecordButton"));
        elementMethods.clickElement(addField);

        WebElement firstnameField=getWebDriver().findElement(By.id("firstName"));
        String firstnameValue="Lucian";
        elementMethods.fillElement(firstnameField, firstnameValue);
        //firstnameField.sendKeys(firstnameValue);

        WebElement lastnameField=getWebDriver().findElement(By.id("lastName"));
        String lastnameValue="Brebu";
        elementMethods.fillElement(lastnameField,lastnameValue);
        //lastnameField.sendKeys(lastnameValue);

        WebElement emailField=getWebDriver().findElement(By.id("userEmail"));
        String emailValue="brebu_lucian06@yahoo.com";
        elementMethods.fillElement(emailField,emailValue);
        //emailField.sendKeys(emailValue);

        WebElement ageField=getWebDriver().findElement(By.id("age"));
        String ageValue= "36";
        elementMethods.fillElement(ageField,ageValue);
        //ageField.sendKeys(ageValue);

        WebElement salaryField=getWebDriver().findElement(By.id("salary"));
        String salaryValue="999999";
        elementMethods.fillElement(salaryField,salaryValue);
        //salaryField.sendKeys(salaryValue);

        WebElement departmentField=getWebDriver().findElement(By.id("department"));
        String departmentValue="Testing";
        elementMethods.fillElement(departmentField,departmentValue);
        //departmentField.sendKeys(departmentValue);

        WebElement submitButton=getWebDriver().findElement(By.id("submit"));
        elementMethods.clickElement(submitButton);

        //modificam entryurile adaugate mai sus

        WebElement editField=getWebDriver().findElement(By.id("edit-record-4"));
        elementMethods.clickElement(editField);

        WebElement firstnamemodifyField=getWebDriver().findElement(By.id("firstName"));
        String firstnamemodifyValue="Vlad";
        //firstnamemodifyField.clear(); //sterg vechea valoare
        //firstnamemodifyField.sendKeys(firstnamemodifyValue);
        elementMethods.refillElement(firstnamemodifyField,firstnamemodifyValue);

        WebElement lastNameModifyField=getWebDriver().findElement(By.id("lastName"));
        String lastNameModifyValue="Popescu";
        elementMethods.refillElement(lastNameModifyField,lastNameModifyValue);

        WebElement agemodifyField=getWebDriver().findElement(By.id("age"));
        String agemodifyValue= "20";
        elementMethods.refillElement(agemodifyField,agemodifyValue);

        WebElement submitModifyButton=getWebDriver().findElement(By.id("submit"));
        elementMethods.clickElement(submitModifyButton);

        //stergem noul entry
        WebElement deleteButton=getWebDriver().findElement(By.id("delete-record-4"));
        elementMethods.clickElement(deleteButton);

        //inchidem un browser=quit()
        //inchidem un tab=close()

    }
}
