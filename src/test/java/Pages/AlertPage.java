package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage{
    public AlertPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy (id = "alertButton")
    private WebElement alert0k;

    @FindBy (id = "timerAlertButton")
    private WebElement buttonSimpleWaitAlert;
    @FindBy (id = "confirmButton")
    private WebElement confirmButton;
    @FindBy (id = "promtButton")
    private WebElement buttonSimpleAlertComp;
    @FindBy (id = "confirmResult")
    private WebElement buttonOKCancel;

    public void dealWithAcceptAlert (){
        elementMethods.clickElement(alert0k);
        alertMethods.acceptAlert();
    }
    public void dealWithDelayAlert (){
        elementMethods.clickElement(buttonSimpleWaitAlert);
        alertMethods.waitForAlert();
        alertMethods.acceptAlert();
    }
    public void dealWithPromtButtonAlert (){
        buttonSimpleAlertComp.click();
        alertMethods.fillAlert(text);
        elementMethods.validateElementText(promtResult, "You entered CONFIRMARE");
    }

    public void dealWithCancelButton (){
        elementMethods.clickElement(buttonOKCancel);
        alertMethods.cancelAlert();
        elementMethods.validateElementText(confirmResult, "You selected Cancel");
    }


}
