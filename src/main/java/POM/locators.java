package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class locators {

    WebDriver driver;

    static By username=By.id("USR_Login_UserID");
    static By pwd1=By.id("USR_Login_UserPassword");
    public static void Login(WebDriver driver,String user,String pwd){
        driver.findElement(username).sendKeys(user);
        driver.findElement(pwd1).sendKeys(pwd);
        driver.findElement(By.name("LGN_UserLogin")).click();
    }

}
