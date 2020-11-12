package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {


        //1-set up the web driver
        WebDriverManager.chromedriver().setup();

        // 2-create the instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        // this is a when i open my web browther biger page i can using this mathod
        driver.manage().window().maximize();

        //3-teat if the driver is working or no ?
        // use the driver instance to test selenium

        driver.get("https://www.google.com");
        // exm
        System.out.println("the title of the page is:" + driver.getTitle());

        String actualTitle = driver.getTitle();

        System.out.println("ACTUAL TITLE STRING :" + actualTitle);

        // IS up this line 21 and line 25 using get title write code is same result .we can using eny or one

        // if we creat  like this we can get original url address
        String actualUrl = driver.getCurrentUrl();
         System.out.println("actualUrl" +actualUrl);

         // fi we put this sleep ,,web page is opening is as we need time after
        Thread.sleep(1000);

        driver.navigate().back();
        // heir browther is leit 3 secount
        Thread.sleep(1000);
        // their refrash brother
        driver.navigate().forward();

        Thread.sleep(1000);

        driver.navigate().refresh();

        Thread.sleep(1000);

        driver.navigate().to("https://www.facebook.com");
        driver.navigate().to("https://www.youtube.com");
        driver.navigate().to("https://www.gmail.com");
        driver.navigate().to("https://www.yahoo.com");
        driver.navigate().to("https://www.cybertekschool.com");

        driver.close();




    }
}
