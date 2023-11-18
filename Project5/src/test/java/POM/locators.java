package POM;
//import Utility.Browserfactory;
import Testcases.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class locators {
    WebDriver driver;

    public locators(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="USR_Login_UserID")
    WebElement username;
    @FindBy(id="USR_Login_UserPassword")
    WebElement password;
    @FindBy(name="LGN_UserLogin")
    WebElement submit;

    public void Login(String userid,String pwd){
        username.sendKeys(userid);
        password.sendKeys(pwd);
        submit.click();
    }
}




