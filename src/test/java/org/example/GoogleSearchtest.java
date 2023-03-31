package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class GoogleSearchtest {
    //public void googleTest() throws InterruptedException
    /*{
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver =new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("Mobile");
        Thread.sleep(1000);

        driver.findElement(By.name("btnK")).click();
        Thread.sleep(1000);

        //System.out.println("Page title is : " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Mobile - Google Search");
        driver.close();
    }*/
    ChromeDriver driver;
    @BeforeClass
        void setupDriver () {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            driver.get("https://www.google.com/");
            driver.manage().window().maximize();
        }
        @Test
        void getTitleFromPage() throws InterruptedException{
        driver.findElement(By.name("q")).sendKeys("Mobile");
        Thread.sleep(1000);

        driver.findElement(By.name("btnK")).click();
        Thread.sleep(1000);

        Assert.assertEquals(driver.getTitle(),"Mobile - Google Search");
    }
    @AfterClass
        void closeDriver () {
            driver.close();
        }

}
