import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1_PH14036class {
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

    @Test
    public void UpdateQTY1000() {
        driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/button/span/span")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input")).sendKeys("1000");
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/button/span/span")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[2]/p")).getText().trim(), "* The maximum quantity allowed for purchase is 500.");
        driver.findElement(By.xpath("//*[@id=\"empty_cart_button\"]/span/span")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/div[1]/h1")).getText().trim(), "SHOPPING CART IS EMPTY");

    }

    @Test
    public void UpdateQTYAm() {
        driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/button/span/span")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input")).sendKeys("-1");
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/button/span/span")).click();
        WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        boolean isRequired = (Boolean) js.executeScript("return arguments[0].required;", inputElement);
        if (isRequired) {
            Assertions.assertEquals(inputElement, "Please match the requested format. Qty");
        }
    }
}
