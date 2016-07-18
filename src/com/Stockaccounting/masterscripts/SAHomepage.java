package com.Stockaccounting.masterscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SAHomepage 
{
 @FindBy(xpath="html/body/div[2]/div[2]/div/div/ul[1]/li[2]/a")
 WebElement stockitemlink;
 @FindBy(xpath="html/body/div[2]/div[2]/div/div/ul[1]/li[3]/a")
 WebElement supplierslink;
 @FindBy(xpath="html/body/div[2]/div[2]/div/div/ul[1]/li[4]/a")
 WebElement purchaseslink;
 @FindBy(xpath="html/body/div[2]/div[2]/div/div/ul[1]/li[5]/a")
 WebElement customerlink;
 @FindBy(xpath="html/body/div[2]/div[2]/div/div/ul[1]/li[6]/a")
 WebElement saleslink;
 @FindBy(xpath="html/body/div[2]/div[1]/div[3]/div/font/a")
 WebElement logoutlink;
 
 public void sitems()
 {
 stockitemlink.click();
 }
public void suppliers()
{
supplierslink.click();
	}
public void purchases()
{
purchaseslink.click();	
}
public void customers()
{
customerlink.click();	
}
public void sales()
{
saleslink.click();
}
public void logout()
{
logoutlink.click();	
}


}
