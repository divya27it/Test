package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Object {
WebDriver driver;

    public void userlogin(WebDriver driver,String Username,String pwd){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    driver.findElement(By.name("username")).sendKeys(Username);
    driver.findElement(By.name("password")).sendKeys(pwd);
    driver.findElement(By.xpath("//*[@type='submit']")).click();
    }
    public void adduser(WebDriver driver,int index,String name,int index1,String username,String pwd,String confirmpwd) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
        driver.findElement(By.xpath("//button[text()=' Add ']")).click();
        //to select role
     List<WebElement> role = driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i"));
     role.get(index);
     for(WebElement element:role){
         element.click();
     }
     Thread.sleep(4000);
    //to select employee
        WebElement employee=driver.findElement(By.xpath("//*[@placeholder=\"Type for hints...\"]"));
        employee.sendKeys(name);
        Actions action=new Actions(driver);
        action.sendKeys(Keys.ARROW_DOWN).perform();
        action.sendKeys(Keys.ENTER).perform();
//        action.sendKeys(Keys.DOWN, Keys.ENTER).perform();
        Thread.sleep(4000);
     //to select status
        List<WebElement> status=driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]"));
        status.get(index1).click();
        Thread.sleep(4000);
        //to enteruser name

        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")).sendKeys(username);
       //to enter pwd
        Thread.sleep(4000);
       driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys(pwd);
        //to enter confirm pwd
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys(confirmpwd);
         //to click save button
        driver.findElement(By.xpath("//*[text()=' Save ']")).click();
    }

}
