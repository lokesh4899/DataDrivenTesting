package com.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties config=new Properties();
	public static FileInputStream input;
	
	@BeforeSuite
	public void setUp() {
		
		try {
			input=new FileInputStream(System.getProperty("user.dir")+"//config//config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			config.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(config.getProperty("browse").equals("edge")) {
			
			WebDriverManager.edgedriver().setup();
			EdgeOptions options=new EdgeOptions();
			options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
			driver=new EdgeDriver(options);
			driver.manage().window().maximize();
			//driver.get(config.getProperty("url"));

		}
	}
	
	@AfterSuite
	public void TearUp() {
		//driver.close();
	}


}
