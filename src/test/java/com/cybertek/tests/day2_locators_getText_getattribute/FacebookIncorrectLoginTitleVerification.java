package com.cybertek.tests.day2_locators_getText_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookIncorrectLoginTitleVerification {

    public static void main(String[] args) {
    //    TC #2: Facebook incorrect login title verification
        //    1.Open Chrome browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //    2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        //    3.Enter incorrect username

        //    4.Enter incorrect password
        //    5.Verify title changed to: Expected: “Log into Facebook | Facebook”

    }
}
