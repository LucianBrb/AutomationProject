package SharedData;

import SharedData.browser.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SharedData {
    private WebDriver getwebDriver;

    @BeforeMethod
    public void prepareDriver() {
        getwebDriver = new BrowserFactory().getBrowserInstance();

    }

    @AfterMethod
    public void clearDriver() {
        //webDriver.quit();
    }

    public WebDriver getGetwebDriver(){
        return getwebDriver;
    }

}
