package com.yet.met.moca;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Class1 
{
	Properties pro;
	public Class1() throws Exception
	{
		File src=new File("C:\\Users\\ACCER\\Desktop\\MyEclipse1\\moca\\src\\test\\java\\Configuration\\Config.property");
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
	}
	public String getDriver()
	{
		return pro.getProperty("Chrome");
	}
	public String getBrowser()
	{
		return pro.getProperty("Url");
	}
}
