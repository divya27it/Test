package POM.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//used to initialize Page class elements without using “FindElement/s.
//we use annotations @FindBy to find WebElement.
// We use initElements method to initialize web elements
    public class pagef {
        WebDriver driver;
        public pagef(WebDriver driver){
            this.driver=driver;
            PageFactory.initElements(driver, this);
        }
        @FindBy(how= How.XPATH,using = "//*[@name='username']")
        @CacheLookup
        WebElement username;
        @FindBy(how=How.XPATH,using = "//*[@name='password']")
        @CacheLookup
        WebElement password;
        @FindBy(how=How.XPATH,using="//*[@type='submit']")
        @CacheLookup
        WebElement Submitbutton;

        public void  hrmlogin(String name,String pwd){
            username.sendKeys(name);
            password.sendKeys(pwd);
            Submitbutton.click();
        }
    }


