package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BrowserFactory {

    private static WebDriver driver;

    @BeforeTest
    public static WebDriver startBrowser(String url, String browser){

        if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
        } else {
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.get(url);
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        return  driver;
    }

    //@AfterTest
    public void tearDown(){
        driver.quit();
    }
}
