package com.Stockaccounting.masterscripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import org.openqa.selenium.support.FindBy;

public class pomsuppliercreation
{
@FindBy(id="x_Supplier_Name")
WebElement suppliername;
@FindBy(id="x_Address")
WebElement supplieradress;
@FindBy(id="x_City")
WebElement suppliercity;
@FindBy(id="x_Country")
WebElement suppliercountry;
@FindBy(id="x_Contact_Person")
WebElement suppliercperson;
@FindBy(id="x_Phone_Number")
WebElement supplierpnum;
@FindBy(id="x__Email")
WebElement supplieremail;
@FindBy(id="x_Mobile_Number")
WebElement suppliermnum;
@FindBy(id="x_Notes")
WebElement suppliernotes;
@FindBy(id="btnAction")
WebElement sadd;
@FindBy(xpath="html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")
WebElement conadd;
@FindBy (xpath="html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")
List<WebElement> Cok;

@FindBy(xpath="html/body/div[.]/div[2]/div/div[4]/div[2]/button")
WebElement lok;
 public void supplier(String sname,String sadress,String scity,String scountry,String scperson,String spnum,String semail,String smnum,String snotes)
 {
  
  suppliername.sendKeys(sname);
  supplieradress.sendKeys(sadress);
  suppliercity.sendKeys(scity);
  suppliercountry.sendKeys(scountry);
  suppliercperson.sendKeys(scperson);
  supplierpnum.sendKeys(spnum);
  supplieremail.sendKeys(semail);
  suppliermnum.sendKeys(smnum);
  suppliernotes.sendKeys(snotes);
  sadd.click();
  for (int i = 0; i < Cok.size(); i++)
  {
	  if (Cok.get(i).getText().equalsIgnoreCase("OK!"))
  	{
  		Cok.get(i).click();
  		break;
		}
		
	
	  
}
  Sleeper.sleepTightInSeconds(3);
  
  lok.click();
  
  
  
  
 }
 }


