package com.Stockaccounting.masterscripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;

public class pomstockcategorycreation 
{
	@FindBy(xpath=".//*[@id='mi_a_stock_categories']/a")
	WebElement ScL;
	
	@FindBy(xpath=".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")
	WebElement AddB;
	
	
@FindBy(id="x_Category_Name")
WebElement catenamelink;
@FindBy(id="btnAction")
WebElement add1;
@FindBy(xpath="html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")
List<WebElement> cok;
@FindBy(xpath=".//button[@class='ajs-button btn btn-primary']")
List<WebElement> lok;
@FindBy(xpath="html/body/div[.]/div[2]/div/div[3]/div/div")
WebElement ctext;
public String categorycrea(String cname)
{
	String expval="Add succeeded";
	
	
	ScL.click();
	
	AddB.click();
	Sleeper.sleepTightInSeconds(2);
	
	

catenamelink.sendKeys(cname);
add1.click();
for (int i = 0; i < cok.size(); i++)
{
	  if (cok.get(i).getText().equalsIgnoreCase("OK!"))
	{
		cok.get(i).click();
		break;
		}
}

System.out.println("success msg   :"+lok.size());

Sleeper.sleepTightInSeconds(3);
String actval=ctext.getText();


for (int j = 0; j < lok.size(); j++)
{
	  if (lok.get(j).getText().equalsIgnoreCase("OK"))
	{
		lok.get(j).click();
		break;
		}
}

if (expval.equalsIgnoreCase(actval))
{
	return "pass";
}
else
{
	
	return "fail";
	}

//leeper.sleepTight(3);
//lok.click();

	
}
}


