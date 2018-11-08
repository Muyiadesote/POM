package com.CucumberPrac;

import org.openqa.selenium.WebElement;

/**
 * Created by Musti on 15/09/2018.
 */
public class Data {
    // **** TextFields ******
    private String firstName;
    private String lastName;
    private String email;
    private String confirmEmail;
    private String phoneNumber;
    private String maidenName;
    private WebElement createAcc;

    // ***** Getters for TextFields *****

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getConfirmEmail() {
        return confirmEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public Data(String firstName, String lastName, String email, String confirmEmail, String phoneNumber, String maidenName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.confirmEmail = confirmEmail;
        this.phoneNumber = phoneNumber;
        this.maidenName = maidenName;
    }

    public Data(String firstName, String lastName, String email, String confirmEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.confirmEmail = confirmEmail;

    }

}
