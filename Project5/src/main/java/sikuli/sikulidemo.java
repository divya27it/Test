package sikuli;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.sikuli.script.Pattern;
//import org.sikuli.script.Screen;

import java.util.concurrent.TimeUnit;
//import org.sikuli.script.Pattern;
//import org.sikuli.script.Screen;

//limitations -not able to open browser
//it will interact with elements by using image
//it will read the image and it will perform the action
//need ot user screen class
// <dependency>
//            <groupId>com.sikulix</groupId>
//            <artifactId>sikulixapi</artifactId>
//            <version>2.0.5</version> <!-- You can check for the latest version on Maven Central -->
//        </dependency>
//QTP-
public class sikulidemo {
    public static void main(String args[]) throws InterruptedException {
//        System.setProperty("WebDriver.chrome.Driver", "C:\\Users\\admin\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromdriver.exe");
//        WebDriver driver=new ChromeDriver();
        ChromeOptions headless=new ChromeOptions();
        headless.setHeadless(true);
        WebDriver driver=WebDriverManager.chromedriver().capabilities(headless).create();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.youtube.com/watch?v=FRn5J31eAMw");
        System.out.println("test executed");
//        //need to create object for screen class
//        Screen s = new Screen();//default methods-click double click
//        Pattern play = new Pattern("C:\\Users\\admin\\IdeaProjects\\Project5\\src\\main\\java\\sikuli\\screenshot\\playbutton.png");//it will read the image and it will find the element
//        s.click();
//        s.click();
//    }


    }}


