package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Testcase  {
WebDriver driver;

  @Test(dataProvider="login")
    public void userlogin_with_different_userid(String username,String pwd){
      System.setProperty("WebDriver.chrome.Driver","C:\\Users\\admin\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromdriver.exe");
      String URL="http://localhost:8080/NSmartUI/login";
      driver=new ChromeDriver();
      driver.get(URL);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.findElement(By.id("USR_Login_UserID")).sendKeys(username);
      driver.findElement(By.id("USR_Login_UserPassword")).sendKeys(pwd);
      driver.findElement(By.name("LGN_UserLogin")).click();
      driver.close();
  }
}
