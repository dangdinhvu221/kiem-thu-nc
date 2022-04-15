import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Bai2 {
    WebDriver driver;

    @BeforeTest

    public void BeforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("Check login Guru99");
        driver.get("https://live.techpanda.org/");
    }
    @AfterTest
    public void AfterTest() {
        driver.close();
    }

    @Test(priority = 1)
    public void testPricePhone() {
        driver.findElement(By.cssSelector(".nav-1 > .level0")).click();
        String price =driver.findElement(By.cssSelector("#product-price-1 > span")).getText();
        driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > a")).click();
        Assert.assertEquals(price,driver.findElement(By.cssSelector("#product-price-1 > span")).getText());
    }
}
