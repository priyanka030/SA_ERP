package com.Stockaccounting.masterscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pomaddbutton
{
	@FindBy(xpath="html/body/div[2]/div[3]/div/div/div[3]/div[1]/div[1]/div[1]/div/a")
	WebElement addlink;
	public void add()
	{
	addlink.click();
	}
}
