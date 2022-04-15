package com.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class kiemTraTieuDe {
    @Test
    public void kiemTraTieuDeAP(){
        WebDriverManager.chromedriver().setup();
        WebDriver call = new ChromeDriver();
        call.get("https://ap.poly.edu.vn");
        Assert.assertEquals(call.getTitle(), "Cao đẳng FPT Polytechnic");
        call.close();
    }

    @Test
    public void kiemTraTieuDeLMS(){
        WebDriverManager.chromedriver().setup();
        WebDriver call = new ChromeDriver();
        call.get("https://lms.poly.edu.vn");
        Assert.assertEquals(call.getTitle(), "Learning Management System | Hệ thống quản trị học tập | FPT Polytechnic Việt Nam");
        call.close();
    }

    @Test
    public void kiemTraTieuDeCMS(){
        WebDriverManager.chromedriver().setup();
        WebDriver call = new ChromeDriver();
        call.get("https://cms.poly.edu.vn/login?next=/dashboard");
        Assert.assertEquals(call.getTitle(), "Sign in or Register | FPT Polytechnic | Course Management System");
        call.close();
    }
}
