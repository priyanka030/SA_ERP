package com.Stockaccounting.masterscripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import org.testng.annotations.AfterSuite;

public class Testngbase {
	StockAccounting_Library sl=new StockAccounting_Library();
  @BeforeTest
  public void AdminLogin() 
  {
	  sl.AdminLogin("admin", "master");
  }

  @AfterTest
  public void Logout() throws InterruptedException
  {
	  sl.logout();
  }

  @BeforeSuite
  public void launchApp() throws IOException
{
  sl.openapp("http://webapp.qedgetech.com");
  }

  @AfterSuite
  public void CloseApp()
  {
	  sl.closeApp();
  }

}
