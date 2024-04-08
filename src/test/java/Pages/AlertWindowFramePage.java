package Pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertWindowFramePage extends BasePage {

    @FindBy(xpath = "//span[text()='Alerts']")
    private WebElement alertField;
    @FindBy(xpath = "//span[text()='Frames']")
    private WebElement framesField;
    @FindBy(xpath = "//span[text()='Browser Windows']")
    private WebElement browserWindowField;

    public AlertWindowFramePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void navigateToAlertPage() {
        elementMethods.scrollElementByPixel(0,350);
        LoggerUtility.infoTest("The user scroll down the page");
        elementMethods.clickElement(alertField);
        LoggerUtility.infoTest("The user clicks on alertFiled element");
    }

    public void navigateToFramePage() {
        elementMethods.clickElement(framesField);
        LoggerUtility.infoTest("The user clicks on frameFiled element");
    }

    public void navigateToWindowPage (){
        elementMethods.clickElement(browserWindowField);
        LoggerUtility.infoTest("The user clicks on browserWindowField element");
    }
}

