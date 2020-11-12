package com.cybertek.tests.day5_testNG_intro_dropdown;
/*
BU BAK BAK MUHIM testNG NI ESHLITISHTA QUKUM MUSHUNI DEPANDESY KILIP POM.XML.FILE ga
 kushuximiz kerak anden code magidu

STEPS TO IMPLEMENT TESTNG
	1- Go to mvnrepository
	2- Search for testng
	3- Click to first result: TestNG
	4- Get the most update TestNG dependency
	5- Add it into your project pom.xml file

for this clas we must add TESTNG depandesy for POM.XML.file insait
we add this from webn
 */

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class P05_SeleniumEasy_Task1 {

    public static void main(String[] args) throws InterruptedException{
        //TC #2: SeleniumEasy Checkbox Verification – Section 1
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //Locate success message and checkbox under 'single checkbox demo'
        WebElement successCheckbox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));

        //locate the success message
        //create a locator to success message and share it in class-chat
        //div[@style='display: block;']
        //div[.='Success - Check box is checked']
        WebElement successMessage = driver.findElement(By.xpath("//div[@id='txtAge']"));

        //3. Verify “Success – Check box is checked” message is NOT displayed.
        if (!successCheckbox.isSelected() && !successMessage.isDisplayed()){
            System.out.println("Success message is not displayed. Verification PASSED!");
        }else{
            System.out.println("Success message is displayed. Verification FAILED!!!");
        }

        //4. Click to checkbox under “Single Checkbox Demo” section
        successCheckbox.click();

        //5. Verify “Success – Check box is checked” message is displayed.

        if (successCheckbox.isSelected() && successMessage.isDisplayed()){
            System.out.println("Success message is displayed. Verification PASSED!");
        }else{
            System.out.println("Success message is NOT displayed. Verification FAILED!!!");
        } //BREAK UNTIL 11.05AM CST - 12.05AM EST


        Thread.sleep(3000);
        driver.close();
    }
}
