package com.CucumberPrac;

import javafx.scene.control.TextField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.CucumberPrac.DriverInstance.driver;

/**
 * Created by musti on 22/06/2017.
 */
public class createAccountPage {
    // **** TextFields ******
    private WebElement firstName;
    private WebElement lastName;
    private WebElement email;
    private WebElement confirmEmail;
    private WebElement phoneNumber;
    private WebElement maidenName;


    // ***** Create Account *****
    private WebElement createAcc;

    // ***** Getters for TextFields *****

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getConfirmEmail() {
        return confirmEmail;
    }

    public WebElement getPhoneNumber() {
        return phoneNumber;
    }

    public WebElement getMaidenName() {
        return maidenName;
    }

    // ***** Getters for TextFields *****

    public WebElement getCreateAcc() {
        return createAcc;
    }


    // ****** TextField locators ******

    public createAccountPage() {
        firstName = driver.findElement(By.xpath("//*[@id='sisiforename']"));
        lastName = driver.findElement(By.xpath("//*[@id='sisisurname']"));
        email = driver.findElement(By.xpath("//*[@id='sisiemail']"));
        confirmEmail = driver.findElement(By.xpath("//*[@id=\"sisiconfirmemail\"]"));
        phoneNumber = driver.findElement(By.xpath("//*[@id=\"sisicontactno\"]"));
        maidenName = driver.findElement(By.xpath("//*[@id=\"sisimothersmaidenname\"]"));
        createAcc = driver.findElement(By.xpath("//*[text()='Get your free score']"));
        //createAcc = driver.findElement(By.xpath("//*[@id=\"local-navigation\"]/div[1]/div/a[2]"));
    }

    public void clickCreatAcc(){
        createAcc.click();
    }
}


