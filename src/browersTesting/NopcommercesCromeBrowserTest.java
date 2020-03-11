package browersTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NopcommercesCromeBrowserTest {

    public static void main(String[] args) {
        String baseUrl1 = "https://www.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl1);
        String title = driver.getTitle();
        System.out.println("Main page"+ title);
        driver.quit();
    }
}