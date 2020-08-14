package com.yet.met.moca;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserHandling 
{
WebDriver driver;
public WebDriver getBrowser(String url,String browser)
{
	if(browser.contains("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver","D:\\Desktop and Download Data\\Backup Data\\Chrome Driver New\\ChromeDriver83\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	driver.get(url);
	return driver;
}
}
