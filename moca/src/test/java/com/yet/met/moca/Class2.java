package com.yet.met.moca;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

	public static void main(String[] args) throws Exception 
	{
		Class1 c1=new Class1();
	System.setProperty("webdriver.chrome.driver",c1.getDriver());
	WebDriver driver=new ChromeDriver();
	driver.get(c1.getBrowser());

	}

}
