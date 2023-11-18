package Testcases;

import POM.Object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Login extends Object {
  WebDriver driver;
  Object obj=new Object();
    @BeforeTest
    public void setdriver(){
        System.setProperty("WebDriver.chrome.Driver","C:\\Users\\admin\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromdriver.exe");
        String URL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
         driver=new ChromeDriver();
         driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void TC1_Validuser_name_and_password(){
        obj.userlogin(driver,"Admin", "admin123");
    }
    @Test
    public void TC3_Verify_that_the_Username_field_is_blank_also_search_user_details(){
        obj.userlogin(driver,"Admin", "admin123");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        driver.findElement(By.xpath("//*[text()=' (44) Records Found']")).click();;
    }

    @Test
    public void TC5_Verify_that_Employee_Name_field_contain_with_Type_for_hinds(){
        obj.userlogin(driver,"Admin", "admin123");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Paul Collings");
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        driver.findElement(By.xpath("//*[text()='Paul Collings']")).isDisplayed();


    }
    @Test
    public void TC1_Verify_that_user_role_contain_with_field_value_Admin() throws InterruptedException {
        obj.userlogin(driver,"Admin", "admin123");
        obj.adduser(driver,0,"Ravi M",0,"12345","Btech&2019","Btech&2019");
    }
    @Test
    public void TC2_Verify_that_user_role_contain_with_field_value_ESS() throws InterruptedException {
        obj.userlogin(driver,"Admin", "admin123");
        obj.adduser(driver,1,"Ravi M",0,"12345","Btech&2019","Btech&2019");
    }

}
