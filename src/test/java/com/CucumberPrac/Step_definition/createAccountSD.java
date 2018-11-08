package com.CucumberPrac.Step_definition;

import com.CucumberPrac.Data;
import com.CucumberPrac.DataManager;
import com.CucumberPrac.DriverInstance;
import com.CucumberPrac.createAccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;


/**
 * Created by musti on 12/10/2017.
 */
public class createAccountSD extends DriverInstance{

    createAccountPage createAccountPage = new createAccountPage();
    private Data accountData = DataManager.getAccountData1();

    @Given("^I navigate to the Landing page$")
    public void i_navigate_to_the_Landing_page() throws Throwable {

        System.out.println("test1111");
        createAccountPage.clickCreatAcc();

        System.out.println("test1");
    }

    @When("^I enter login successfully$")
    public void i_enter_login_successfully() throws Throwable {
        System.out.println("test2");
    }

    @Then("^I should login successfully$")
    public void i_should_login_successfully() throws Throwable {
        createAccountPage.getFirstName().sendKeys(accountData.getFirstName());
        createAccountPage.getLastName().sendKeys(accountData.getLastName());
    }
}
