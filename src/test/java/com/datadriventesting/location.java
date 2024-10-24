package com.datadriventesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utilities.JsonData;

import io.github.bonigarcia.wdm.WebDriverManager;

public class location {
	
	WebDriver driver;
	SignIn obj;
	
	@BeforeClass
	public void tesss() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		driver=new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
	}
	
	@Test(dataProvider="SignIn",dataProviderClass=JsonData.class)
	public void te(String mail,String pwd) {
		obj=new SignIn(driver);
		obj.clickOnSignIn();
		obj.Email(mail);
		obj.setPassword(pwd);
		obj.Locations();
		obj.signInBtn();
	}

}
