package configs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverManager
{
    public static WebDriver driver;

    public static WebDriver getDriver()
    {
        if(driver == null)
        {
            System.setProperty("webdriver.chrome.driver", "src\\IMMFLY\\resources\\webdrivers\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            //options.addArguments("--window-size=1300,600");
            options.addArguments("--start-maximized");
            //options.addArguments("--headless");
            //options.addArguments("--no-sandbox");
            //options.addArguments("start-fullscreen");
            driver =  new ChromeDriver(options);

        }
        return driver;
    }

}