package Keyword.Test;

import Keyword.base.base;
import Keyword.keywords.readexcel;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class Testcase {
public readexcel  read;

    @Test
    public void launch_url() throws IOException {
        WebDriver driver = new base().init_driver("Chrome");
        readexcel excel = new readexcel();
        excel.setDriver(driver); // Pass the driver to the readexcel instance
        excel.startexecution("login");
    }
}
