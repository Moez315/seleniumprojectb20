package com.cybertek.tests.day2_locators_getText_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class warupTesk {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        String expectedTitle = "Google";
        String actualTitle =  driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification Passed! ");
        }else{
            System.out.println("Title verification FAILED!");
        }



        driver.close();




    }
}
