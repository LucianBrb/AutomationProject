package Tests;

import HelperMethods.ElementMethods;
import SharedData.SharedDataforCED;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CarExpertDesign extends SharedDataforCED {

    @Test
    public void metodaTest1(){
        ElementMethods elementMethods = new ElementMethods(getWebDriver());

        for (int i = 0; i <1; i++) {
            // Your code here

        WebElement contactButton=getWebDriver().findElement(By.id("menu-item-216"));
        elementMethods.clickElement(contactButton);

        WebElement numeField=getWebDriver().findElement(By.cssSelector("input[placeholder='Nume']"));
        String numeFieldValue="Popescu";
        numeField.sendKeys(numeFieldValue);

        WebElement prenumeField=getWebDriver().findElement(By.cssSelector("input[placeholder='Prenume']"));
        String prenumeFieldValue="Cosmin";
        prenumeField.sendKeys(prenumeFieldValue);

        WebElement telefonField=getWebDriver().findElement(By.cssSelector("input[placeholder='Telefon']"));
        String telefonFieldValue="003754525455";
        telefonField.sendKeys(telefonFieldValue);

        //facem un scrool down sa se vada mesajul

        elementMethods.scrollElementByPixel(0,450);


        WebElement mesajulTauField=getWebDriver().findElement(By.className("wpcf7-textarea"));
        String mesajulTauValue="Polis";
        mesajulTauField.sendKeys(mesajulTauValue);

        WebElement emailField=getWebDriver().findElement(By.className("wpcf7-email"));
        String emailFieldValue="Ki@yahoo.com";
        emailField.sendKeys(emailFieldValue);

        WebElement modelMasinaField=getWebDriver().findElement(By.cssSelector("input[placeholder='Model masina']"));
        String modelMasinaValue="Volvo";
        modelMasinaField.sendKeys(modelMasinaValue);

        WebElement serviciuDoritField=getWebDriver().findElement(By.cssSelector("input[placeholder='Serviciu dorit']"));
        String serviciuDoritValue="Doresc programare in intervalul orar 17-20";
        serviciuDoritField.sendKeys(serviciuDoritValue);

        WebElement trimiteButton=getWebDriver().findElement(By.className("wpcf7-submit"));
//        trimiteButton.click();
//
//       webDriver.quit();

        }

    }

}
