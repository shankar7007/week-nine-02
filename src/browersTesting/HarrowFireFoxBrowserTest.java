package browersTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class HarrowFireFoxBrowserTest {

    public static void main(String[] args) {
            String baseUrl1 = "https://www.harrow.gov.uk/";
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe/");
            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(baseUrl1);
            String title = driver.getTitle();
            System.out.println("Main page"+ title);
            driver.quit();


        }
    }





