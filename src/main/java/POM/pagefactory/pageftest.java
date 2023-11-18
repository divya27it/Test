
package POM.pagefactory;

import POM.pagefactory.pagef;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class pageftest {
    String URL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";


    @Test
    public void verify_the_valid_login(){
        WebDriver driver = new ChromeDriver();
        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver");
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //login
        pagef method=PageFactory.initElements(driver,pagef.class);
        method.hrmlogin("Admin","admin123");
        driver.close();
    }
}
