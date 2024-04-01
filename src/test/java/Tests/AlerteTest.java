package Tests;
import ObjectData.AlerteTestObject;
import ObjectData.PracticeFormsObject;
import Pages.AlertPage;
import Pages.AlertWindowFramePage;
import Pages.HomePage;
import PropertyUtility.PropertyUtility;
import SharedData.SharedData;
import org.testng.annotations.Test;
public class AlerteTest extends SharedData {
    @Test
    public void windowMethod() {

        PropertyUtility propertyUtility = new PropertyUtility("AlerteTestData");
        AlerteTestObject alerteTestObject = new AlerteTestObject(propertyUtility.getAllData());


        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowFramePage alertWindowFramePage = new AlertWindowFramePage(getWebDriver());
        alertWindowFramePage.navigateToAlertPage();

        AlertPage alertPage = new AlertPage(getWebDriver());

        alertPage.dealWithAcceptAlert();
        alertPage.dealWithDelayAlert();
        alertPage.dealWithCancelButton();
        alertPage.dealWithPromptButton(alerteTestObject);
    }


//        WebElement clickMeBtn = getWebDriver().findElement(By.id("alertButton"));
//        elementMethods.clickElement(clickMeBtn);
//        alertMethods.acceptAlert();
//
//        WebElement clickMeBtn2 = getWebDriver().findElement(By.id("timerAlertButton"));
//        elementMethods.clickElement(clickMeBtn2);
//
//        // wait explicit
//        alertMethods.acceptAlert();
//
//        WebElement clickMeBtn3 = getWebDriver().findElement(By.id("confirmButton"));
//        elementMethods.clickElement(clickMeBtn3);
//        alertMethods.acceptAlert();
//
//        WebElement promptAlert = getWebDriver().findElement(By.id("promtButton"));
//        elementMethods.clickElement(promptAlert);
//        alertMethods.fillAlert("Test");

//        List<WebElement> alertText = getWebDriver().findElements(By.xpath("//div/div/span[@class='mr-3']"));
//        List<WebElement> alertConfirmation = getWebDriver().findElements(By.xpath("//div/div/span[@class='text-success']"));
//
//        Assert.assertEquals(alertText.get(2).getText(), "On button click, confirm box will appear");
//        Assert.assertEquals(alertConfirmation.get(0).getText(), "You selected Ok");
//
//        Assert.assertEquals(alertText.get(3).getText(), "On button click, prompt box will appear");
//        Assert.assertEquals(alertConfirmation.get(1).getText(), "You entered Test");

}