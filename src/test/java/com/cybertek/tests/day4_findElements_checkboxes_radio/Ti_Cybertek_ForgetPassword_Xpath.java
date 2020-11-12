package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ti_Cybertek_ForgetPassword_Xpath {
    public static void main(String[] args) {
        /*
        TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        1. Open Chrome browser
        */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to http://practice.cybertekschool.com/forgot_password

        driver.get("http://practice.cybertekschool.com/forgot_password");

       // 3. Locate all the WebElements on the page using XPATH locator only (total of 6)
       // a. “Home” link
        // tagName[@attribute='value'

        /*
        har ketem web element ni tapmakqi bolganda qukum // buni kuyewelip anden tag nam bolgan
        a harpini yezewelip kainiden la qukum [] buni eqiweling va eqiga @ ni kushup
        kuyip anden siz ezdemakqi bolgan web element ni ezdesigez bolidu
        */

        //a[@class = 'nav-link']    1) bu aldedini bir alimat
        //a[@href='/']    2) bushu kainedeki eliment
        // ustedeki bu ekki hil elimit ning kaisi bolsa boliweridu shu bir web elimatntka tawa
        //tagName[.='text'] 3)bu ussulda tax arkilik tapsakmu bolidu
        //a[.='Home']  3) mana bu uqunki taptuk
        WebElement homeLink = driver.findElement(By.xpath("//a[.='Home']"));


       // b. “Forgot password” header
        //h2[.='Forgot Password']
        WebElement forgetPasswordHeader = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        //c. “E-mail” text
        // tagName[@attribute='value' buningga karap tag name buyiqa tapsak mushu buyqa yazzsakqikid
        //label[@for='email'] 1)tak name arkilik tepish
        //label[.='E-mail']  2) taxt aekilik tepish usuli
        WebElement emailLabel = driver.findElement(By.xpath("//label[.='E-mail']"));


        //d. E-mail input box
       //input[@name='email']
        WebElement emailInput = driver.findElement(By.xpath(" //input[@name='email']"));

       // e. “Retrieve password” button
        //button[@id='form_submit']
        WebElement retrieveButton = driver.findElement(By.xpath("//button[@id='form_submit']"));

       // f. “Powered byCybertek School” text
        //a[.='Cybertek School']/..
         /*bizden buyarda talap kilgeni “Powered byCybertek School” text ni tepish amma awal biz
         cybertekschool textni tepip kiyin kainiga [] yani buetilganden kiyin /.. birdash va
         ekki qikit koisakla “Powered byCybertek School” tuluk taxt elmantini tapkan bolimiz
         */
        WebElement footerText = driver.findElement(By.xpath("//a[.='Cybertek School']/.."));

      //  4. Verify all WebElements are displayed.
        /*
        buni verify kilish uqun javadeki if statment ni yezip verify kilimiz
         */
        if(homeLink.isDisplayed() && forgetPasswordHeader.isDisplayed()
                && emailLabel.isDisplayed()&& emailInput.isDisplayed()&& retrieveButton.isDisplayed()
        && footerText.isDisplayed()){
            System.out.println("All of the webElements are displayed .Pass");
        }else{
            System.out.println("One of the more webElement are not displayed.FAIL");
        }



    }
}
