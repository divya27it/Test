package DatadrivenXL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Datadrivenlogin{
    WebDriver driver;


    @Test(dataProvider="LoginData")
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


    @DataProvider(name="LoginData")
    public Object[][] login_getData() throws IOException{
        //get the data from excel
        String path="C:\\Users\\admin\\Downloads\\login.xlsx";
        Utility xlutil=new Utility(path);

        int totalrows=xlutil.getRowCount("Sheet1");
        int totalcols=xlutil.getCellCount("Sheet1",1);

        String loginData[][]=new String[totalrows][totalcols];
        for(int i=1;i<=totalrows;i++) //5

        {
            for(int j=0;j<totalcols;j++)

            {
                loginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);

            }

        }
        return loginData;
    }
}
