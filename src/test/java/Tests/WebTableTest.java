package Tests;

import ObjectData.WebTableObject;
import Pages.ElementsPage;
import Pages.HomePage;
import Pages.WebTablePage;
import PropertyUtility.PropertyUtility;
import SharedData.SharedData;
import org.testng.annotations.Test;

public class WebTableTest extends SharedData {


    @Test
    public void metodaTest(){

        PropertyUtility propertyUtility = new PropertyUtility("WebTableData");
        WebTableObject webTableObject = new WebTableObject(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getGetwebDriver());
        homePage.navigateToElementsPage();

        ElementsPage elementsPage = new ElementsPage(getGetwebDriver());
        elementsPage.navigateToWebTablePage();


        WebTablePage webTablePage = new WebTablePage(getGetwebDriver());
        webTablePage.addNewEntry(webTableObject);

        webTableObject.setFirstNameValue("Popa");
        webTableObject.setAgeFieldValue("45");
        webTablePage.editEntry(webTableObject);
        webTablePage.deleteEntry();

    }
}
