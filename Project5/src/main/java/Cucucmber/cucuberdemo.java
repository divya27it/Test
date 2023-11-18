
  package Cucucmber;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

  public class cucuberdemo {
    WebDriver driver;
    @Given("open chrome browser and application")
    public void open_chrome_browser_and_application() {
        driver=WebDriverManager.chromedriver().create();
        driver.get("http://localhost:8080/NSmartUI/login");
    }

    @When("I enter password and username")
    public void i_enter_password_and_username() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("USR_Login_UserID")).sendKeys("user1");
        driver.findElement(By.id("USR_Login_UserPassword")).sendKeys("Abcd@1234@1234@");
    }

    @When("click login button")
    public void click_login_button() {
        driver.findElement(By.name("LGN_UserLogin")).click();

    }

    @Then("user    should able to login")
    public void user_should_able_to_login() {
     System.out.println("The user loggedin");
    }



}

