package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
    public void googleTest(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver =new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Mobile");
        driver.findElement(By.name("btnK")).click();
    }
}
