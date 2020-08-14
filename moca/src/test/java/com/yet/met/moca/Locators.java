package com.yet.met.moca;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Locators 
{
	
	@FindBy(how=How.NAME,using="q")WebElement username;
	
public void Login(String SearchText)
{
	username.sendKeys(SearchText);
	username.submit();
}
}
