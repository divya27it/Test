package Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assert {
    public static void main(String args[]) {

        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("http://localhost:8080/NSmartUI/login");



    }
}