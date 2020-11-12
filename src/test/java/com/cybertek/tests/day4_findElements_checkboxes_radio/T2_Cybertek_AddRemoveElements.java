package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_Cybertek_AddRemoveElements {
    public static void main(String[] args) throws InterruptedException {
        // TC #2: PracticeCybertek.com_AddRemoveElements WebElement verification
        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to http://practice.cybertekschool.com/add_remove_elements/
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

        // 3. Click to “Add Element” button
        //button[.='Add Element']  this is element i find
        //tagName[.='text']  buyardeki addelement ni tipishta tag
        // esmi belan mushu kaediga qushurimiz asan bolidu
        WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']"));
        // buyarga wakitni sal astarak kilish uqun 1 minut den kiyin click kilidegan kushu
        // buni koshup kuyimiz
        Thread.sleep(1000);
        addElementButton.click();

        // 4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
        if (deleteButton.isDisplayed()) {
            System.out.println("Delete button is displayed.Verification PASSED!");
        } else {
            System.out.println("Delete button is Not displayed.Verification FAILED");
        }

        // 5. Click to “Delete” button.
        // deleteButton.click();
        // 6. qisida probilime bolmach ga 40-laine ga qushurup try arkilik bundak eshliduk


        // 6. Verify “Delete” button is NOT displayed after clicking.
        try {
            deleteButton.click();
            if (!deleteButton.isDisplayed()) {
                System.out.println("Delete button is Not displayed after clicking. PASS!");
            } else {
                System.out.println("Delete button is  displayed after clicking.FAILED!");
            }
        }catch (StaleElementReferenceException exception){
            System.out.println("StaleElementReferenceException has been thrown.");
            System.out.println("it means element has been completely deleted from HTML");
            System.out.println("Delete button is Not displayed.Verification is  PASSED!");
        }
        }
    }


        // USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS



