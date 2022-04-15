import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC2_PH14036class {
    WebDriver webDriver;

    @BeforeTest

    public void BeforeTest() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        System.out.println("Check login Guru99");
        webDriver.get("https://live.techpanda.org/");
    }


    @Test
    public void KiemTraSoSanh2SP(){
        webDriver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a")).click();
        webDriver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/ul/li[2]/a")).click();
        webDriver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[3]/div[1]/div[2]/div/button")).click();
        try{
            webDriver.switchTo().alert();
            String ulr = webDriver.getCurrentUrl();
            Assert.assertEquals(ulr,"http://live.techpanda.org/index.php/catalog/product_compare/index/");

            webDriver.close();

        } catch(NoAlertPresentException e){

        }

    }
    @AfterTest
    public void afterTest() {
        webDriver.close();
    }
}
