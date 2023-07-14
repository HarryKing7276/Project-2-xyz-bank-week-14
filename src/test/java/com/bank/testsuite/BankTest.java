package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomer = new AddCustomerPage();
    OpenAccountPage openAccount = new OpenAccountPage();
    CustomersPage customersPage = new CustomersPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    AccountPage accountPage = new AccountPage();
    @Test
    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {


        // *  click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLogin();
        Thread.sleep(5000);
        // * 	click On "Add Customer" Tab
        bankManagerLoginPage.clickOnAddCustomer();
        //  * 	enter FirstName
        addCustomer.enterFirstName("Prime");
        // * 	enter LastName
        addCustomer.enterLastName("Testing");
        // * 	enter PostCode
        addCustomer.enterPostCodeField("SS1 3SD");
        // * 	click On "Add Customer" Button
        addCustomer.clickOnAddCustomerButton();
        // * 	popup display
        //  * 	verify message "Customer added successfully"
        Alert alert1 = driver.switchTo().alert();
        String expectedText = "Customer added successfully with customer id :6";
        String actualText = alert1.getText();
        Assert.assertEquals(actualText, expectedText);

        //  * 	click on "ok" button on popup.
        // * 	popup display
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }

    /**
     * 2. bankManagerShouldOpenAccountSuccessfully.
     * <p>
     * <p>
     * Search customer that created in first test
     * Select currency "Pound"
     * click on "process" button
     * popup displayed
     * verify message "Account created successfully"
     * click on "ok" button on popup.
     */
    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        /**
         * 	click On "Open Account" Tab
         * 	Search customer that created in first test
         * 	Select currency "Pound"
         * 	click on "process" button
         * 	popup displayed
         * 	verify message "Account created successfully"
         * 	click on "ok" button on popup.
         */
        //  * 	click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLogin();
        //  * 	click On "Open Account" Tab
        openAccount.clickOnOpenAccount();
        //* 	Search customer that created in first test
        openAccount.searchCustomerFromDropdown("Prime Testing");
        //    * 	Select currency "Pound"
            openAccount.selectPoundCurrency();
        //    * 	click on "process" button
       openAccount.clickOnProcessLink();

        //    * 	popup displayed
        //    * 	verify message "Account created successfully"
        openAccount.verifyMessageDisplayed();
        //    * 	click on "ok" button on popup.
        openAccount.acceptAlertPopUp();

    }
    @Test
    //3. customerShouldLoginAndLogoutSuccessfully.
    public void customerShouldLoginAndLogoutSuccessfully() {
        //	click on "Customer Login" Tab
customersPage.clickOnCustomerLogin();
        //	search customer that you created.
customerLoginPage.ClickOnCustomerNameCreatedByYou();
        //	click on "Login" Button
customerLoginPage.ClickOnLoginCustomerLink();
        //	verify "Logout" Tab displayed.
//accountPage.verifyLogOutLinkIsDisplayed();
        //	click on "Logout"
accountPage.clickOnLogout();
        //	verify "Your Name" text displayed.

    }
    @Test
    public void customerShouldDepositMoneySuccessfully(){
    //4. customerShouldDepositMoneySuccessfully.
        //	click on "Customer Login" Tab
        customersPage.clickOnCustomerLogin();
    //	search customer that you created.
        customerLoginPage.ClickOnCustomerNameCreatedByYou();
        //	click on "Login" Button
        customerLoginPage.ClickOnLoginCustomerLink();
        //	click on "Deposit" Tab
        accountPage.clickOnDepositTab();
    //	Enter amount 100
        accountPage.enterDepositAmount("100");
        //	click on "Deposit" Button
accountPage.clickToAcceptDepositAmount();
    //	verify message "Deposit Successful"
accountPage.verifyDepositAmountTextMessage();
    }
    @Test
//5. customerShouldWithdrawMoneySuccessfully
    public void customerShouldWithdrawMoneySuccessfully(){
//	click on "Customer Login" Tab
        customersPage.clickOnCustomerLogin();
//	search customer that you created.
        customerLoginPage.ClickOnCustomerNameCreatedByYou();
//	click on "Login" Button
        customerLoginPage.ClickOnLoginCustomerLink();
//	click on "Withdrawal" Tab
        accountPage.clickOnWithdrawalLink();
//	Enter amount 50
        accountPage.enterWithdrawalAmount("50");
//	click on "Withdrawal" Button
         accountPage.clickToAcceptWithdrawalAmount();
//	verify message "Transaction Successful"

}
}