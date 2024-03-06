package Tests;

import HelperMethods.AlertMethods;
import HelperMethods.ElementMethods;
import Pages.AlertPage;
import Pages.AlertWindowsFramePage;
import Pages.HomePage;
import SharedData.SharedData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AlertsTest extends SharedData {

    @Test
    public void alertMethod(){

        HomePage homePage =  new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowsFramePage alertWindowsFramePage = new AlertWindowsFramePage(getWebDriver());
        alertWindowsFramePage.navigateToAlertPage();

        AlertPage alertPage = new AlertPage(getWebDriver());
        alertPage.dealWithAcceptAlert();
        alertPage.dealWithDelayAlert();
        alertPage.dealWithPromtButtonAlert("test");
        alertPage.dealWithCancelButton();

//        elementMethods.scrollElementByPixel(0, 450);
//        WebElement consentField = getWebDriver().findElement(By.className("fc-button-label"));
//        elementMethods.clickElement(consentField);
//        WebElement AlertsFrameWindowsField = getWebDriver().findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
//        elementMethods.clickElement(AlertsFrameWindowsField);

//        elementMethods.scrollElementByPixel(0, 350);
//        WebElement alertField = getWebDriver().findElement(By.xpath("//span[text()='Alerts']"));
//        elementMethods.clickElement(alertField);

//        WebElement alert0k = getWebDriver().findElement(By.id("alertButton"));
//        elementMethods.clickElement(alert0k);
//        alertMethods.acceptAlert();

//        WebElement timmerButton = getWebDriver().findElement(By.id("timerAlertButton"));
//        elementMethods.clickElement(timmerButton);
//
//        //wait explicit
//        alertMethods.acceptAlert();
//
//
//        String cancelValue = "Cancel";
//        WebElement confirmButton = getWebDriver().findElement(By.id("confirmButton"));
//        elementMethods.clickElement(confirmButton);
//        alertMethods.cancelAlert();
//        //thirdAlert.accept();
//
//
//        WebElement promptButton = getWebDriver().findElement(By.id("promtButton"));
//        elementMethods.clickElement(promptButton);
//        String text = "CONFIRMARE";
//        alertMethods.fillAlert(text);
//
//        WebElement alert3TextArea = getWebDriver().findElement(By.id("confirmResult"));
//        elementMethods.validateElementText(alert3TextArea, "You selected " + cancelValue);
//
////            WebElement alert3TextArea = webDriver.findElement(By.id("confirmResult"));
////            System.out.println(alert3TextArea.getText());
////            Assert.assertEquals(alert3TextArea.getText(), "You selected OK");
//
//        WebElement alert4TextArea = getWebDriver().findElement(By.id("promptResult"));
//        elementMethods.validateElementText(alert4TextArea, "You entered " + text);

    }


}
