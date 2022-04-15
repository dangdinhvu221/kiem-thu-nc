import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Bai1 {
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
    public void testWebsiteTitle() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,"Home page");
    }
    @Test(priority = 2)
    public void testPageTitle() {
        String title = driver.findElement(By.className("page-title")).getText();
        System.out.println(title);
        Assert.assertEquals(title.trim(),"THIS IS DEMO SITE FOR");
    }

    @Test(priority = 3)
    public void testPageMobileTitle() {
        driver.findElement(By.cssSelector(".nav-1 > .level0")).click();
        String title = driver.findElement(By.className("page-title")).getText();
        System.out.println(title);
        Assert.assertEquals(title,"MOBILE");
    }

    @Test(priority = 4)
    public void testSortByName() {
        driver.findElement(By.cssSelector(".nav-1 > .level0")).click();
        driver.findElement(By.cssSelector(".category-products > .toolbar > .sorter select")).click();
        driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > div.toolbar > div.sorter > div > select > option:nth-child(2)")).click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals(url,"http://live.techpanda.org/index.php/mobile.html?dir=asc&order=name");
    }
}