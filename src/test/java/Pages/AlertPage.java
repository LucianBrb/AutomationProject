
package Pages;
import ObjectData.AlerteTestObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class AlertPage extends BasePage {
    public AlertPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(id = "alertButton")
    private WebElement buttonAlerts;
    @FindBy(id = "timerAlertButton")
    private WebElement buttonAlertsDelay;
    @FindBy(id = "confirmButton")
    private WebElement thirdAlertButton;
    @FindBy(id = "promtButton")
    private WebElement buttonPrompt;
    @FindBy(xpath = "//span[@id='confirmResult']")
    private WebElement thirdAlertResult;
    @FindBy(xpath = "//span[@id='promptResult']")
    private WebElement fourthAlertResult;

    public void dealWithAcceptAlert() {
        elementMethods.clickElement(buttonAlerts);
        alertMethods.acceptAlert();
    }
    public void dealWithDelayAlert (){
        elementMethods.clickElement(buttonAlertsDelay);
        alertMethods.waitForAlert();
        alertMethods.acceptAlert();
    }
    public void dealWithCancelButton () {
        elementMethods.clickElement(thirdAlertButton);
        alertMethods.cancelAlert();
        elementMethods.validateElementText(thirdAlertResult,"You selected Cancel");
    }
    public void dealWithPromptButton (AlerteTestObject alerteTestObject) {
        elementMethods.clickElement(buttonPrompt);
        alertMethods.fillAlert(alerteTestObject.getInputAlert());
        elementMethods.validateElementText(fourthAlertResult,"You entered " + alerteTestObject.getInputAlert());
    }
}
 