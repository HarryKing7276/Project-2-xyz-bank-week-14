package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {
    By searchCustomerNameLink = By.xpath("//select[@id='userSelect']");
    By loginCustomerLink = By.xpath("//button[normalize-space()='Login']");


    public void ClickOnCustomerNameCreatedByYou(){
        selectFromVisibleTextFromDropdown(searchCustomerNameLink,"Harry Potter");
    }
public void ClickOnLoginCustomerLink(){
        clickOnElement(loginCustomerLink);
}
}
