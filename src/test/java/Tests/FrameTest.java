package Tests;

import Pages.AlertWindowFramePage;
import Pages.FramePage;
import Pages.HomePage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class FrameTest extends Hooks {

    @Test
    public void frameMethod(){

        HomePage homePage = new HomePage(getGetwebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowFramePage alertWindowFramePage = new AlertWindowFramePage(getGetwebDriver());
        alertWindowFramePage.navigateToFramePage();


        FramePage framePage = new FramePage(getGetwebDriver());
        framePage.dealWithIFrame();
    }
}
