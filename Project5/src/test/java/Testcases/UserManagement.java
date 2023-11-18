package Testcases;

import POM.locators;
//import Utility.Browserfactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

public class UserManagement extends Baseclass{
    WebDriver driver;

    @BeforeMethod
    public WebDriver setdriver(){
        WebDriverManager.chromedriver().setup();
        return driver;
    }

    @Test
    public void Testcase1_valid_username_and_password(){
        locators method=PageFactory.initElements(driver,locators.class);
        method.Login("category1","Abcd@1234@1234@");
        //Validation -Dashboard
    }

    @Test
    public void Testcase2_invalid_username_valid_password(){
        locators ls=PageFactory.initElements(driver,locators.class);
        ls.Login("category","Abcd@1234@1234@");
        //Validation
    }
    @Test
    public void Testcase3_invalid_username_invalid_password(){
        locators ls=PageFactory.initElements(driver,locators.class);
        ls.Login("category","Abcd@1234@1@");
        //
    }
    @Test
    public void Testcase4_valid_username_invalid_password(){
        locators ls=PageFactory.initElements(driver,locators.class);
        ls.Login("category4","Abcd@11234@");
       driver.findElement(By.id("value")).click();

    }
}
