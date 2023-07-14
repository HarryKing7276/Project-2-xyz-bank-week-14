package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
// * 	click On "Add Customer" Tab
    By addCustomerLink = By.xpath("//button[normalize-space()='Add Customer']");

    public void clickOnAddCustomer(){
        clickOnElement(addCustomerLink);
    }


}
