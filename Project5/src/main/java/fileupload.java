import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class fileupload {
    static WebDriver driver;
    public static void main(String args[]) throws IOException {
       fileupload();
    }
    public static void fileupload() throws IOException {
    driver=WebDriverManager.chromedriver().create();
    driver.get("https://demo.guru99.com/test/upload/");
    driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
    driver.findElement(By.id("uploadfile_0")).click();
    Runtime.getRuntime().exec("C:\\Users\\admin\\Documents\\Divya\\Sample1.exe");
}}
