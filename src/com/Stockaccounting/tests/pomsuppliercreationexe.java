package com.Stockaccounting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Stockaccounting.masterscripts.SAHomepage;
import com.Stockaccounting.masterscripts.loginpage;
import com.Stockaccounting.masterscripts.pomaddbutton;
import com.Stockaccounting.masterscripts.pomsuppliercreation;

public class pomsuppliercreationexe 
{
@Test
public void screationexe()
{
WebDriver driver=new FirefoxDriver();
driver.get("http://webapp.qedgetech.com");
driver.manage().window().maximize();
loginpage LP=PageFactory.initElements(driver,loginpage.class);
LP.Adminlogin("admin", "master");
SAHomepage HP=PageFactory.initElements(driver, SAHomepage.class);
HP.suppliers();
pomaddbutton AD=PageFactory.initElements(driver,pomaddbutton.class);
AD.add();
pomsuppliercreation SC=PageFactory.initElements(driver, pomsuppliercreation.class);
SC.supplier("vani", "palkol", "bvrm", "india", "vani", "08814222522", "vani@gmail.com", "8909897867", "description");






}

	
}
