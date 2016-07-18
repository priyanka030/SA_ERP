package com.Stockaccounting.masterscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage
{
@FindBy(id="btnreset")
WebElement Reset;
@FindBy(id="username")
WebElement uid;
@FindBy(id="password")
WebElement pwd;
@FindBy(id="btnsubmit")
WebElement login;

public void Adminlogin(String username,String pasword)
{
Reset.click();
uid.sendKeys(username);
pwd.sendKeys(pasword);
login.click();
	
}
}

