package com.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class searchTestGG {

    @Test
    public void searchInformationDHFPT(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com.vn");
        driver.findElement(By.name("q")).sendKeys("Đại Học FPT");
        WebElement name = driver.findElements(By.name("btnK")).get(1);
        Actions run = new Actions(driver).click(name);
        run.build().perform();
        driver.close();
    }

    @Test
    public void searchInformationCDFPT(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com.vn");
        driver.findElement(By.name("q")).sendKeys("cao đẳng fpt Polytechnic");
        WebElement name = driver.findElements(By.name("btnK")).get(1);
        Actions run = new Actions(driver).click(name);
        run.build().perform();
        driver.close();
    }

    @Test
    public void searchInformation(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com.vn");
        driver.findElement(By.name("q")).sendKeys("https://www.facebook.com/DangDinhVu221");
        WebElement name = driver.findElements(By.name("btnK")).get(1);
        Actions run = new Actions(driver).click(name);
        run.build().perform();
        driver.close();
    }


    @Test
    public void testSearch() {
        WebDriverManager.chromedriver().setup();
        WebDriver call = new ChromeDriver();
        String url = "https://github.com/login";
        call.get(url);
        call.findElement(By.id("login_field")).sendKeys("dangdinhvu221");
        call.findElement(By.id("password")).sendKeys("Vu06052002");
        WebElement name = call.findElement(By.name("commit"));
        Actions run = new Actions(call).click(name);
//        call.findElement(By.id("result-stats")).getText();
        run.build().perform();
        call.close();
    }

    @Test
    public void testSearchFailed() {
        WebDriverManager.chromedriver().setup();
        WebDriver call = new ChromeDriver();
        String url = "https://github.com/login";
        call.get(url);
        call.findElement(By.id("login_field")).sendKeys("dangdinhvu221");
        call.findElement(By.id("password")).sendKeys("Vu0605zxvcxczc");
        WebElement name = call.findElement(By.name("commit"));
        Actions run = new Actions(call).click(name);
//        call.findElement(By.id("result-stats")).getText();
        Assert.assertEquals(call.getTitle(), "Sign in or Register | FPT Polytechnic | Course Management System");
        run.build().perform();
        call.close();

    }
}
