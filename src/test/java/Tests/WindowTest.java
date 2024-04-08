package Tests;

import Pages.AlertWindowFramePage;
import Pages.HomePage;
import Pages.WindowPage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class WindowTest extends Hooks {

    @Test
    public void windowMethod() {
        HomePage homePage = new HomePage(getGetwebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowFramePage alertWindowFramePage = new AlertWindowFramePage(getGetwebDriver());
        alertWindowFramePage.navigateToWindowPage();

        WindowPage windowPage = new WindowPage(getGetwebDriver());
        windowPage.interactWithTabBrowser();
        windowPage.interactNewWindow();
//        windowPage.interactWithNewWindowMsgButton();
    }
}
