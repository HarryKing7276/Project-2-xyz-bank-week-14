package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;

public class OpenAccountPage extends Utility {
    By openAccountLink = By.xpath("//button[normalize-space()='Open Account']");
    By searchCustomerLink = By.xpath("//select[@id='userSelect']");
    By poundCurrencyLink = By.xpath("//select[@id='currency']");
    By processLink = By.xpath("//button[normalize-space()='Process']");
    public void clickOnOpenAccount(){
        clickOnElement(openAccountLink);
    }
   public void searchCustomerFromDropdown(String list) {
selectFromVisibleTextFromDropdown(searchCustomerLink,"Harry Potter");


       //   mouseHoverAndClickOnElement(By.xpath("//button[normalize-space()='Open Account']"));
       //  selectFromVisibleTextFromDropdown(searchCustomerLink,"Harry Potter");
   }
   public void selectPoundCurrency(){
        selectFromVisibleTextFromDropdown(poundCurrencyLink,"Pound");
   }
   public void clickOnProcessLink(){
        mouseHoverAndClickOnElement(processLink);
   }
   public void verifyMessageDisplayed(){
       Alert alert2 = driver.switchTo().alert();
       String expectedText = "Account created successfully with account Number :1016";
       String actualText = alert2.getText();
       Assert.assertEquals(actualText, expectedText);
   }
public void acceptAlertPopUp(){
        Alert alert3 = driver.switchTo().alert();
                alert3.accept();
}
}
