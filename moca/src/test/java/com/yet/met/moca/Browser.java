package com.yet.met.moca;


import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Browser {

	public static void main(String[] args) throws Exception 
	{
	DesiredCapabilities caps=new DesiredCapabilities();
	caps.setBrowserName("firefox");
	caps.setPlatform(Platform.WINDOWS);
	WebDriver driver=new RemoteWebDriver(new URL(" http://192.168.225.241:4444/wd/hub"),caps);
    driver.get("https://www.google.com");
	}

}
