package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {
    By customerLoginLink = By.xpath("//button[normalize-space()='Customer Login']");



 public void clickOnCustomerLogin(){
     clickOnElement(customerLoginLink);
 }








}

