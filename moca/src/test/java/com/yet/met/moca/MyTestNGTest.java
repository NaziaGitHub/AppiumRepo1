package com.yet.met.moca;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MyTestNGTest
{
  @Test
  public void f() 
  {
	  BrowserHandling b1=new BrowserHandling();
	  WebDriver driver=b1.getBrowser("https://www.google.com","Chrome");
	  Locators l1=PageFactory.initElements(driver,Locators.class);
	  l1.Login("What is Protractor");
	  
	  
  }
}
