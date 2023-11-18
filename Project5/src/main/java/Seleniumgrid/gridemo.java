package Seleniumgrid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class gridemo {
//    public static void main(String args[]) throws MalformedURLException {
    @Test
        public void test1() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WIN11);

        ChromeOptions options = new ChromeOptions();
        options.merge(cap);

        String url = "http://localhost:4444/wd/hub";
        WebDriver driver = new RemoteWebDriver(new URL(url), options);

        driver.get("http://localhost:8080/NSmartUI/login");
        //test case code
        System.out.println("browser launched");
    }
@Test
    public void test2() throws MalformedURLException {
    DesiredCapabilities cap = new DesiredCapabilities();
    cap.setBrowserName("firefox");


    cap.setPlatform(Platform.WIN11);
    FirefoxOptions options=new FirefoxOptions();
    options.merge(cap);

    String url = "http://localhost:4444/wd/hub";
    WebDriver driver = new RemoteWebDriver(new URL(url), options);
    driver.get("http://localhost:8080/NSmartUI/login");
    System.out.println("browser launched");

}
    @Test
    public void test3() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");


        cap.setPlatform(Platform.WIN11);
        ChromeOptions options = new ChromeOptions();
        options.merge(cap);

        String url = "http://localhost:4444/wd/hub";
        WebDriver driver = new RemoteWebDriver(new URL(url), options);
        driver.get("http://localhost:8080/NSmartUI/login");
        System.out.println("browser launched");
    }

    }


