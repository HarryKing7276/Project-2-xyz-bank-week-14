package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By bankManagerLoginLink = By.xpath("//button[contains(text(),'Bank Manager Login')]");

    public void clickOnBankManagerLogin(){
  clickOnElement(bankManagerLoginLink);
    }
}
