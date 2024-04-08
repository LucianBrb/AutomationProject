package Tests;
import ObjectData.AlertObject;
import Pages.AlertPage;
import Pages.AlertWindowFramePage;
import Pages.HomePage;
import PropertyUtility.PropertyUtility;
import SharedData.Hooks;
import org.testng.annotations.Test;
public class AlertTest extends Hooks {
    @Test
    public void windowMethod() {

        PropertyUtility propertyUtility = new PropertyUtility("AlertTestData");
        AlertObject alertObject = new AlertObject(propertyUtility.getAllData());


        HomePage homePage = new HomePage(getGetwebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowFramePage alertWindowFramePage = new AlertWindowFramePage(getGetwebDriver());
        alertWindowFramePage.navigateToAlertPage();

        AlertPage alertPage = new AlertPage(getGetwebDriver());

        alertPage.dealWithAcceptAlert();
        alertPage.dealWithDelayAlert();
        alertPage.dealWithCancelButton();
        alertPage.dealWithPromptButton(alertObject);
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