
package Pages;
import ObjectData.AlertObject;
import loggerUtility.LoggerUtility;
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
        LoggerUtility.infoTest("The user clicks on button alert");
        alertMethods.acceptAlert();
        LoggerUtility.infoTest("The user accept the alert");

    }
    public void dealWithDelayAlert (){
        elementMethods.clickElement(buttonAlertsDelay);
        LoggerUtility.infoTest("The user clicks on timer field");
        alertMethods.waitForAlert();
        alertMethods.acceptAlert();
        LoggerUtility.infoTest("The user accepts the alert");

    }
    public void dealWithPromptButton (AlertObject alertObject) {
        elementMethods.clickElement(buttonPrompt);
        LoggerUtility.infoTest("The user clicks on buttonFiled element");

        alertMethods.fillAlert(alertObject.getInputAlert());
        LoggerUtility.infoTest("The user fills the alert with following text"+alertObject.getInputAlert());

        elementMethods.validateElementText(fourthAlertResult,"You entered " + alertObject.getInputAlert());
        LoggerUtility.infoTest("The user validate element text");

    }
    public void dealWithCancelButton () {
        elementMethods.clickElement(thirdAlertButton);
        LoggerUtility.infoTest("The user clicks on confirm Alert");

        alertMethods.cancelAlert();
        LoggerUtility.infoTest("The user clicks on cancel alert");

        elementMethods.validateElementText(thirdAlertResult,"You selected Cancel");
        LoggerUtility.infoTest("The user validates the cancel message");

    }

}
 