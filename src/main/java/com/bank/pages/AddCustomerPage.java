package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    By firstNameField = By.xpath("//input[@placeholder='First Name']");
    By lastNameField = By.xpath("//input[@placeholder='Last Name']");
    By postCodeField = By.xpath("//input[@placeholder='Post Code']");
    By addCustomerButton = By.xpath("//button[@type='submit']");
    public void enterFirstName(String firstname){
        sendTextToElement(firstNameField,firstname);
    }
    public void enterLastName(String lastname){
        sendTextToElement(lastNameField,lastname);
    }
    public void enterPostCodeField(String postcode){
        sendTextToElement(postCodeField,postcode);
    }
    public void clickOnAddCustomerButton(){
        clickOnElement(addCustomerButton);
    }
}
