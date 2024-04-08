package Pages;

import loggerUtility.LoggerUtility;
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
        LoggerUtility.infoTest("The user clicks on new tab button element");

        windowMethods.switchSpecificTabWindow(1);
        LoggerUtility.infoTest("The user switch the focus to a tab with index 1 ");

        windowMethods.closeCurrentTabWindow();
        LoggerUtility.infoTest("The user close the current tab");

        windowMethods.switchSpecificTabWindow(0);
        LoggerUtility.infoTest("The user switch the focus to a tab with index 0");

    }

    public void interactNewWindow(){
        elementMethods.clickElement(newWindowButton);
        LoggerUtility.infoTest("The user clicks on new window button");

        windowMethods.switchSpecificTabWindow(1);
        LoggerUtility.infoTest("The user switch the focus to a window with index 1");

        windowMethods.closeCurrentTabWindow();
        LoggerUtility.infoTest("The user close the current window element");

        windowMethods.switchSpecificTabWindow(0);
        LoggerUtility.infoTest("The user switch the focus to a window with index 0");

    }
//    public void interactWithNewWindowMsgButton(){
//
//        elementMethods.clickElement(newWindowMsgButton);
//        windowMethods.switchSpecificTabWindow(1);//sample window
//        windowMethods.closeCurrentTabWindow();
//        windowMethods.switchSpecificTabWindow(0);//browser window
//    }

}