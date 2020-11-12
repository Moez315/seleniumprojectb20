package com.cybertek.tests.day2_locators_getText_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTitleVerification {

    public static void main(String[] args) {
//TC #1: Facebook title verification1.
// Open Chrome browser2.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();

        // Go to https://www.facebook.com
          driver.get("https://www.facebook.com");

// 3.Verify title:
        //Expected: “Facebook -Log In or Sign Up”
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();
        System.out.println("title: "+actualTitle);

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification Passed! ");
        }else{
            System.out.println("Title verification FAILED!");
        }


       driver.close();



    }

}
