package webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class table {
    WebDriver driver;

    @Test
    public void verifytable() {
        System.setProperty("WebDriver.chrome.Driver", "C:\\Users\\admin\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromdriver.exe");
        driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
        //headers

        List<WebElement> allHeaders = driver.findElements(By.xpath("//table[contains(@id, 'cust')]//th"));
        System.out.println(allHeaders.size());

        Assert.assertEquals(allHeaders.size(), 5, "header count is not same");
        boolean status = false;
        for (WebElement ele : allHeaders) {
//5 headers //Status//ele.Company//county
            String value = ele.getText();//Status///
            System.out.println(value);
            if (value.contains("Country")) {
                status = true;
                break;
            }}
            //rows
            List<WebElement> allrows = driver.findElements(By.xpath("//table[contains(@id, 'cust')]//td"));
            System.out.println(allrows.size());
            Boolean rowstatus=false;
            for (WebElement ele1 : allrows) {
                String value1 = ele1.getText();
                System.out.println(value1);
                if (value1.contains("Amazon")) {
                    rowstatus=true;
                    System.out.println("element matched");
                    driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[3]/td[1]/input")).click();
                    break;
                }
                }
            }
        }



