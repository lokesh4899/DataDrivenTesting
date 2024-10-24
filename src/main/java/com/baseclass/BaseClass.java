package com.baseclass;

import java.io.FileInputStream;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.utilities.ExtentManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class BaseClass {
	
	public static WebDriver driver;
	public static Properties config=new Properties();
	public static FileInputStream input;
	
	
	/*@BeforeSuite
	public void loadConfig() throws IOException {
		ExtentManager.setExtent();
		//DOMConfigurator.configure("log4j.xml");

		try {
			config = new Properties();
			FileInputStream inputp = new FileInputStream(
					System.getProperty("user.dir") + "\\config\\config.properties");
			config.load(inputp);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void Launch(String browserName) {
		
		if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions options=new EdgeOptions();
			options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
			driver=new EdgeDriver(options);
			driver.manage().window().maximize();
			System.out.println(config.getProperty("url"));
			driver.get(config.getProperty("url"));
		}
			
	}
		
	@AfterSuite
	public void afterSuite() {
		ExtentManager.endReport();
	}*/
	@BeforeSuite
	public void setUp() throws IOException {
		
		input=new FileInputStream(System.getProperty("user.dir")+"//config//config.properties");
		config.load(input);
		
	}
	@BeforeTest
	public void browserLaunch() {
		
		if(config.getProperty("browse").equals("edge")) {
			
			WebDriverManager.edgedriver().setup();
			EdgeOptions options=new EdgeOptions();
			options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
			driver=new EdgeDriver(options);
			driver.manage().window().maximize();
			//driver.get(config.getProperty("url"));

		}
	}
	@BeforeMethod
	public void urllaunch() {
		driver.get(config.getProperty("url"));
	}
	
//	@AfterMethod
//	public void TearUp() {
//		//driver.close();
//	}


}
