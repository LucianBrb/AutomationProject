package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowPage extends BasePage{

    public WindowPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(id = "tabButton")
    private WebElement newTabButton;
    @FindBy(id = "windowButton")
    private WebElement newWindowButton;
    @FindBy(id = "messageWindowButton")
    private WebElement newWindowMsgButton;

    public void interactWithTabBrowser(){
        elementMethods.clickElement(newTabButton);
        windowMethods.switchSpecificTabWindow(1);
        windowMethods.closeCurrentTabWindow();
        windowMethods.switchSpecificTabWindow(0);
    }

    public void interactNewWindow(){
        elementMethods.clickElement(newWindowButton);
        windowMethods.switchSpecificTabWindow(1);
        windowMethods.closeCurrentTabWindow();
        windowMethods.switchSpecificTabWindow(0);
    }
//    public void interactWithNewWindowMsgButton(){
//
//        elementMethods.clickElement(newWindowMsgButton);
//        windowMethods.switchSpecificTabWindow(1);//sample window
//        windowMethods.closeCurrentTabWindow();
//        windowMethods.switchSpecificTabWindow(0);//browser window
//    }

}