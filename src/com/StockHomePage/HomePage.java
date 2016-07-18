package com.StockHomePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	public static void main(String[] args)
	{
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://webapp.qedgetech.com");
	driver.manage().window().maximize();
	driver.findElement(By.name("btnreset")).click();
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("master");
	driver.findElement(By.id("btnsubmit")).click();
	driver.findElement(By.linkText("Suppliers")).click();
	driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
	driver.findElement(By.id("x_Supplier_Name")).sendKeys("Venkat");
	driver.findElement(By.id("x_Address")).sendKeys("JNTU");
	driver.findElement(By.id("x_City")).sendKeys("HYD");
	driver.findElement(By.id("x_Country")).sendKeys("INDIA");
	driver.findElement(By.id("x_Contact_Person")).sendKeys("venky");
	driver.findElement(By.id("x_Phone_Number")).sendKeys("8979825026");
	driver.findElement(By.id("x__Email")).sendKeys("ven89@gmail.com");
	driver.findElement(By.id("x_Mobile_Number" )).sendKeys("8979825026");
	driver.findElement(By.id("x_Notes")).sendKeys("Stock Available Anytime");
	driver.findElement(By.id("btnAction")).click();
	driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
	Sleeper.sleepTightInSeconds(3);
	driver.findElement(By.xpath(".//button[@class='ajs-button btn btn-primary']")).click();
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
	Sleeper.sleepTightInSeconds(2);
	driver.findElement(By.linkText("Stock Categories")).click();
	Sleeper.sleepTightInSeconds(3);
	driver.findElement(By.xpath(".//*[@class='btn btn-default ewAddEdit ewAdd btn-sm']")).click();
	driver.findElement(By.id("x_Category_Name" )).sendKeys("wool");
	driver.findElement(By.id("btnAction")).click();
	Sleeper.sleepTightInSeconds(2);
	driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
	Sleeper.sleepTightInSeconds(2);
    driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
	act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
    driver.findElement(By.xpath(".//*[@id='mi_a_unit_of_measurement']/a")).click();
    driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
    driver.findElement(By.id("x_UOM_ID")).sendKeys("U67567");
    driver.findElement(By.id("x_UOM_Description")).sendKeys("500");
    driver.findElement(By.id("btnAction" )).click();
    driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
    Sleeper.sleepTightInSeconds(1);
    driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
    driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a")).click();
    driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
    Select cat=new Select(driver.findElement(By.id("x_Category")));
    cat.selectByVisibleText("woodland");
    Select supname=new Select(driver.findElement(By.id("x_Supplier_Number")));
    supname.selectByVisibleText("venkat");
    driver.findElement(By.id("x_Stock_Name")).sendKeys("woodland");
    Select uom=new Select(driver.findElement(By.id("x_Unit_Of_Measurement")));
    uom.selectByVisibleText("500");
    driver.findElement(By.id("x_Purchasing_Price")).sendKeys("5000000");
    driver.findElement(By.id("x_Selling_Price")).sendKeys("80000000");
    driver.findElement(By.id("x_Notes")).sendKeys("wool will be good");
    driver.findElement(By.id("btnAction")).click();
    Sleeper.sleepTightInSeconds(1);
    driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
    Sleeper.sleepTightInSeconds(1);
    driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
	driver.findElement(By.linkText("Purchases")).click();
	driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[2]/div/a ")).click();
	driver.findElement(By.id("x_Purchase_Date")).sendKeys("01/06/2016");
	Select sn=new Select(driver.findElement(By.id("x_Supplier_ID" )));
	sn.selectByVisibleText("venkat");
	driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div/form/div[3]/div/div[1]/div/div/a")).click();
	Select sa=new Select(driver.findElement(By.id("x1_Supplier_Number")));
	sa.selectByVisibleText("venkat");
	Select si=new Select(driver.findElement(By.id("x1_Stock_Item")));
	si.selectByVisibleText("woodland");
	driver.findElement(By.id("x1_Purchasing_Quantity")).sendKeys("100");


    
    
	
	}

}
