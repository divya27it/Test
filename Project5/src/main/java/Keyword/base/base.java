package Keyword.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class base {
    public  WebDriver driver;
    public  Properties prop;

    public WebDriver init_driver(String browser) {
        if (browser.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
            driver = new ChromeDriver();
            System.out.println("Chrome started");
        }
        return driver;
    }


}

