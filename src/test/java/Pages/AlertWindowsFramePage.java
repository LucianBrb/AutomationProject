package Pages;

import HelperMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertWindowsFramePage extends BasePage{

    public AlertWindowsFramePage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy (xpath = "//span[text()='Alerts']")
    public WebElement alertField;

    public void navigateToAlertPage (){
        elementMethods.scrollElementByPixel(0,450);
        elementMethods.clickElement(alertField);

    }




}
