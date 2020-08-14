package com.yet.met.moca;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Appium1 {

	public static void main(String[] args) throws Exception 
	{
	DesiredCapabilities caps=new DesiredCapabilities();
	caps.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
	caps.setCapability(MobileCapabilityType.DEVICE_NAME,"R9ZN60WKQ6R");
	caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
	caps.setCapability("chromedriverExecutable","D:\\Desktop and Download Data\\Backup Data\\Chrome Driver New\\ChromeDriver83\\chromedriver_win32\\chromedriver.exe");
	AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
	driver.get("https://www.rbmionline.com");
	
	
	}

}
