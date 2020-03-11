package browersTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class WchIEBrowersTest {


        public static void main (String[]args){
            String baseUrl1 = "https://www.wcht.org.uk/";
            System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");//
            WebDriver driver = new InternetExplorerDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            driver.get(baseUrl1);
            String title = driver.getTitle();
            System.out.println("Main page"+ title);
            driver.quit();
        }
    }





