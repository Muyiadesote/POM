package com.CucumberPrac;

import static com.CucumberPrac.DriverInstance.driver;

/**
 * Created by Musti on 15/09/2018.
 */
public class DataManager {


    public static Data getAccountDataMax() {
        return new Data("first","last","email",
                "confirm", "123456890", "maidenname");
    }

    public static Data getAccountData1() {
        return new Data("first","last","email",
                "confirm");
    }

}
