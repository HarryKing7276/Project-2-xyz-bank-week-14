package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By logoutLinkText = By.xpath("//button[normalize-space()='Logout']");
    By logoutClickLink = By.xpath("//button[normalize-space()='Logout']");
    By depositLink = By.xpath("//button[normalize-space()='Deposit']");
    By depositAmountLink = By.xpath("//input[@placeholder='amount']");
    By proceedDepositAmountLink = By.xpath("//button[@type='submit']");
    By verifyDepositAmount = By.xpath("//span[@class='error ng-binding']");
    By withdrawalLink = By.xpath("//button[normalize-space()='Withdrawl']");
    By proceedWithdrawalAmount = By.xpath("//button[normalize-space()='Withdraw']");

    public void verifyLogOutLinkIsDisplayed() {
        verifyTextElement("Logout", logoutLinkText);
    }

    public void clickOnLogout() {
        clickOnElement(logoutClickLink);
    }

    public void clickOnDepositTab() {
        clickOnElement(depositLink);
    }

    public void enterDepositAmount(String amount) {
       sendTextToElement(depositAmountLink,amount);
    }
    public void clickToAcceptDepositAmount(){
        clickOnElement(proceedDepositAmountLink);
    }
    public void verifyDepositAmountTextMessage(){
        verifyTextElement("Deposit Successful",verifyDepositAmount);
    }
    public void clickOnWithdrawalLink(){
        clickOnElement(withdrawalLink);
    }
    public void enterWithdrawalAmount(String value){
        sendTextToElement(withdrawalLink,value);
    }
    public void clickToAcceptWithdrawalAmount(){
        clickOnElement(proceedWithdrawalAmount);
    }
}