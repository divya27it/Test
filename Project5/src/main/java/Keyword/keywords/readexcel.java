package Keyword.keywords;

import Keyword.base.base;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class readexcel {
    public base base;
    public WebDriver driver;
    public FileInputStream fi;
    public FileOutputStream fo;
    public XSSFWorkbook workbook;
    public XSSFSheet sheet;
    public XSSFRow row;
    public XSSFCell cell;

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
    public void startexecution(String sheetName) throws IOException {
         String locatorName=null;
         String locatorvalue=null;
        base=new base();
        fi = new FileInputStream("C:\\Users\\admin\\Downloads\\login_keywords.xlsx");
        workbook = new XSSFWorkbook(fi);
        sheet = workbook.getSheet(sheetName);
        int k=0;
      for(int i=0;i<sheet.getLastRowNum();i++) {
          String  locatorcolvaue = sheet.getRow(i + 1).getCell(k + 1).toString().trim();
          if (!locatorcolvaue.equalsIgnoreCase("NA")) {
              locatorName = locatorcolvaue.split("=")[0].trim();
              locatorvalue = locatorcolvaue.split("=")[1].trim();
          }
          String action = sheet.getRow(i + 1).getCell(k + 2).toString().trim();
          String value = sheet.getRow(i + 1).getCell(k + 3).toString().trim();

      switch(action) {
          case "open browser":
              base.init_driver(value);
              break;

          case "enter url":
              driver.get(value);
              break;


          default:
              break;
      }
      }
      }

}