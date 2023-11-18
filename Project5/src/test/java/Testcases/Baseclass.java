package Testcases;


import Utility.Screenshotclass;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;


import java.io.File;
import java.util.concurrent.TimeUnit;

public class Baseclass {
    WebDriver driver;
    String url="http://localhost:8080/NSmartUI/login";


    @BeforeMethod
    public WebDriver setdriver(){
        System.setProperty("WebDriver.Chrome.Driver","./Drivers/chromdriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
    @AfterMethod
        public void takescreenshot(@NotNull ITestResult result){

            if(ITestResult.FAILURE==result.getStatus()) {
                Screenshotclass.captureScreenshot(driver, result.getName());
            }
            driver.close();
    }
    @BeforeTest()
    public void Beforetest(){
        System.out.println("All test case executed");
    }

    }


