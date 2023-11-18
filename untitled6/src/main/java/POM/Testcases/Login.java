package POM.Testcases;

import POM.locators;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//login with valid details
//login with invliad details
//login with invalid user
//login with empty details...
public class Login{
    WebDriver driver;

    @BeforeTest

    public void startbrowser(){
        driver=WebDriverManager.chromedriver().create();
        driver.get("http://localhost:8080/NSmartUI/login");
    }

    @Test
    public void login_with_valid_details(){
        locators.Login(driver,"divi","Abcd@1234@1234@");
    }

    @Test
    public void login_with_invliad_details()
    {
       locators.Login(driver,"test","test");
    }

    @AfterTest
    public void closebrower()
    {
    driver.close();
    }
}
