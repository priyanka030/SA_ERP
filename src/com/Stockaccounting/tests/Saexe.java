package com.Stockaccounting.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Stockaccounting.masterscripts.SAHomepage;
import com.Stockaccounting.masterscripts.loginpage;
import com.Stockaccounting.masterscripts.pomstockcategorycreation;

public class Saexe
{ 
	@Test
	public void exe() throws IOException
	{
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://webapp.qedgetech.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	loginpage LP=PageFactory.initElements(driver, loginpage.class);
	LP.Adminlogin("admin","master");
	


	
	//SAHomepage HP=PageFactory.initElements(driver, SAHomepage.class);
	
	SAHomepage ahp=PageFactory.initElements(driver, SAHomepage.class);
	
	/*HP.sitems();
	HP.suppliers();
	HP.purchases();
	HP.customers();
	HP.sales();
	HP.logout();*/
	
	
	
	

	
   
   
   FileInputStream fi=new FileInputStream("C:\\Users\\priyanka03\\Documents\\stockcategorydata.xlsx");
   XSSFWorkbook wb=new XSSFWorkbook(fi);
   XSSFSheet ws=wb.getSheet("stockdata");
   int rc=ws.getLastRowNum();
   for (int i = 1; i <=rc; i++) 
   {
    XSSFRow row=ws.getRow(i);
    XSSFCell c1=row.getCell(0);
    XSSFCell c2=row.createCell(1);
    String catname=c1.getStringCellValue();
    
    Actions act=new Actions(driver);
    act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
    
    pomstockcategorycreation sc=PageFactory.initElements(driver, pomstockcategorycreation.class);
  String res= sc.categorycrea(catname);
  
  c2.setCellValue(res);
   
   
   
   
   
   }
   
   FileOutputStream fo=new FileOutputStream("D:\\priyanka03\\StockAccounting\\src\\com\\Stockaccounting\\results\\stockcategoryResult.xlsx");
   
   wb.write(fo);
   wb.close();
   
   
	}
}

