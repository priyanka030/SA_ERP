package com.Stockaccounting.masterscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class StockAccounting_Library
{
	
public static WebDriver driver;
public static String Eval,Aval;
public static   String uid,pwd,cname,SupplierName;
public static FileInputStream fis;
public static Properties pr;


public String openapp(String url) throws IOException
{

pr=new Properties();
fis=new FileInputStream("D:\\priyanka03\\StockAccounting\\src\\com\\Stockaccounting\\properties\\Repository.properties");
pr.load(fis);


Eval="Login";
driver=new FirefoxDriver();
driver.get(url);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
Aval=driver.findElement(By.id(pr.getProperty("submit"))).getText();


if(Eval.equalsIgnoreCase(Aval))
{
	//System.out.println("Application is launched"+"test Pass");
	
	return "Pass";
}
else
{
	//System.out.println("Application not launched"+"test Fail");
	
	
	return "Fail";
}
}



public String AdminLogin(String uid,String pwd)
{
	Eval="Administrator";
	driver.findElement(By.id(pr.getProperty("reset"))).click();
	driver.findElement(By.id(pr.getProperty("uid"))).sendKeys(uid);
	driver.findElement(By.id(pr.getProperty("pwd"))).sendKeys(pwd);
	driver.findElement(By.id(pr.getProperty("submit"))).click();
	Aval=driver.findElement(By.xpath(pr.getProperty("administrator"))).getText();
	if (Eval.equalsIgnoreCase(Aval))
{
		//System.out.println("Admin Login Successfully"+"Test Pass");
		
		return"pass";
		                                           
	}
	
	else {
		//System.out.println("Admin did not Login"+"Test Fail");
        return"Fail";	
	}
	
}

public  String supplierscreation(String SupplierName,String saddress,String scity,String scountry,String scontactperson,String sphnum,String semail,String smobnum,String snotes)
{
  Eval="Add succeeded";
  driver.findElement(By.xpath(pr.getProperty("suppliers"))).click();
  driver.findElement(By.xpath(pr.getProperty("sadd"))).click();
  driver.findElement(By.id(pr.getProperty("supplierName"))).sendKeys(SupplierName);
  driver.findElement(By.id(pr.getProperty("Adress"))).sendKeys(saddress);
  driver.findElement(By.id(pr.getProperty("City") )).sendKeys(scity);
  driver.findElement(By.id(pr.getProperty("Country") )).sendKeys(scountry);
  driver.findElement(By.id(pr.getProperty("ContactPerson") )).sendKeys(scontactperson);
  driver.findElement(By.id(pr.getProperty("Phnum") )).sendKeys(sphnum);
  driver.findElement(By.id(pr.getProperty("Email") )).sendKeys(semail);
  driver.findElement(By.id(pr.getProperty("mobnum") )).sendKeys(smobnum);
  driver.findElement(By.id(pr.getProperty("Notes") )).sendKeys(snotes);
  driver.findElement(By.id(pr.getProperty("Add1"))).click();
  Sleeper.sleepTightInSeconds(2);
  driver.findElement(By.xpath(pr.getProperty("sconfm"))).click();
  Aval=driver.findElement(By.xpath(pr.getProperty("salert"))).getText();
  Sleeper.sleepTightInSeconds(4);
  driver.findElement(By.xpath(pr.getProperty("scondition"))).click();
  if (Eval.equals(Aval)) 
  {
	//  System.out.println("Suppliers created successfully");
	  return"Pass";
	
}
  else {
	//return"Fail"System.out.println("Suppliers not created");
	  return"Fail";
  }
}
public String stockcategorycreation(String cname)
{
	Eval="Add succeeded";
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath(pr.getProperty("stocitem")))).build().perform();
	driver.findElement(By.xpath(pr.getProperty("stoccategory"))).click();
	driver.findElement(By.xpath(pr.getProperty("cadd"))).click();
	driver.findElement(By.id(pr.getProperty("categyName") )).sendKeys(cname);
	driver.findElement(By.id(pr.getProperty("add2"))).click();
	Sleeper.sleepTightInSeconds(4);
	driver.findElement(By.xpath(pr.getProperty("cconfrm"))).click();
	
	Aval=driver.findElement(By.xpath(pr.getProperty("ccondition"))).getText();
	System.out.println("stockcategorycreation  :"+Aval);
	Sleeper.sleepTightInSeconds(4);
	
    
	
	//driver.findElement(By.xpath(pr.getProperty("calert"))).click();
    
    List<WebElement> okb=driver.findElements(By.xpath(pr.getProperty("calert")));
    for (int i = 0; i < okb.size(); i++) 
    {
    	if (okb.get(i).getText().equalsIgnoreCase("OK"))
    	{
    		okb.get(i).click();
    		break;
  		}
  		
  	}
    
    if (Eval.equalsIgnoreCase(Aval)) 
    {
    	//System.out.println("Stock Category Created sucessfully");
		return"pass";
	}
    else {
	//System.out.println("Stock Category not Created ");
	return"Fail";
	
    }
  
    

}

public String Uomcreation(String uomid,String uomdes)
{
	Eval="Add succeeded";
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath(pr.getProperty("stocitem")))).build().perform();
	
    driver.findElement(By.linkText(pr.getProperty("uomL"))).click();
    
    driver.findElement(By.xpath(pr.getProperty("uadd"))).click();
    
    driver.findElement(By.id(pr.getProperty("uomid"))).sendKeys(uomid);
    driver.findElement(By.id(pr.getProperty("uomdes") )).sendKeys(uomdes);
    driver.findElement(By.id(pr.getProperty("add3"))).click();
   Sleeper.sleepTightInSeconds(2);
   // driver.findElement(By.xpath(pr.getProperty("uconfrm"))).click();
    List<WebElement> okb=driver.findElements(By.xpath(pr.getProperty("uconfrm")));
    for (int i = 0; i < okb.size(); i++) 
    {
    	if (okb.get(i).getText().equalsIgnoreCase("OK!"))
    	{
    		okb.get(i).click();
    		break;
		}
		
	}
    
    Sleeper.sleepTightInSeconds(3);
   Aval=driver.findElement(By.xpath(pr.getProperty("ucondition"))).getText();
   Sleeper.sleepTightInSeconds(2);
   driver.findElement(By.xpath(pr.getProperty("ualert"))).click();
   if (Eval.equalsIgnoreCase(Aval))
   {
	   //System.out.println("Unit of Measurement created successfully");
	return"Pass";
}
   else {
	//System.out.println("Unit of Measurement not created");
	   return"Fail";
}

}

public String Stockitemcreation(String cname,String SupplierName,String stockname,String uomdes,String purchaspric,String salepric,String notes)
{
	Eval="Add succeeded";  
	driver.findElement(By.xpath(pr.getProperty("stocitem"))).click();
	driver.findElement(By.xpath(pr.getProperty("iadd"))).click();
	Select cat=new Select(driver.findElement(By.id(pr.getProperty("category"))));
	cat.selectByVisibleText(cname);
	Select sn=new Select(driver.findElement(By.id(pr.getProperty("suppliername"))));
	sn.selectByVisibleText(SupplierName);
	driver.findElement(By.id(pr.getProperty("stockName"))).sendKeys(stockname);
    Select uom=new Select(driver.findElement(By.id(pr.getProperty("uom"))));
    uom.selectByVisibleText(uomdes);
    driver.findElement(By.id(pr.getProperty("purchasingprice"))).sendKeys(purchaspric);
    driver.findElement(By.id(pr.getProperty("sellingprice") )).sendKeys(salepric);
    driver.findElement(By.id(pr.getProperty("notes"))).sendKeys(notes);
    driver.findElement(By.id(pr.getProperty("add4"))).click();
    Sleeper.sleepTightInSeconds(2);
    driver.findElement(By.xpath(pr.getProperty("iconfirm"))).click();
    Aval=driver.findElement(By.xpath(pr.getProperty("icondition"))).getText();
    Sleeper.sleepTightInSeconds(2);
    driver.findElement(By.xpath(pr.getProperty("ialert"))).click();
    if (Eval.equalsIgnoreCase(Aval)) 
    {
	 //System.out.println("stock item created sucessfully");
    	return"Pass";
	}
    else {
		//System.out.println("stock item not created");
    	return"Fail";
	}



}

public String logout() throws InterruptedException
{  
	Eval="Login";
	driver.findElement(By.id(pr.getProperty("logout"))).click();
	Thread.sleep(3000);
  //driver.findElement(By.xpath(pr.getProperty("lok2"))).click();
  
  
  List<WebElement> okb=driver.findElements(By.xpath(pr.getProperty("lok2")));
  for (int i = 0; i < okb.size(); i++) 
  {
  	if (okb.get(i).getText().equalsIgnoreCase("OK!"))
  	{
  		okb.get(i).click();
  		break;
		}
		
	}
  
       Aval=driver.findElement(By.id(pr.getProperty("condition"))).getText();
   
 if (Eval.equalsIgnoreCase(Aval))
    {
		return"pass";

		
	}
 else
 {
	 return"fail";
 }
 }



public void closeApp()
{
	driver.close();
	
	}



}







