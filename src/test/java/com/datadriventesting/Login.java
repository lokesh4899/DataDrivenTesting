package com.datadriventesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.utilities.JsonData;


public class Login extends BaseClass{
	
	SignIn objsignin;
	Product obj1;
	
//	@BeforeMethod
//	public void Before() {
//		driver.get(config.getProperty("url"));
//	}
	
//	@Test
//	public void VerifySignInLink() {
//		objsignin=new SignIn(driver);
//		objsignin.clickOnSignIn();
//		Assert.assertEquals("Customer Login",objsignin.CutomerLogin());
//	}
	
	@Test(dataProvider="SignIn",dataProviderClass=JsonData.class)
	public void validCredentials(String scenario,String mail,String pwd) {
		objsignin=new SignIn(driver);
		objsignin.clickOnSignIn();
		objsignin.Email(mail);
		objsignin.setPassword(pwd);
		objsignin.signInBtn();
		new WebDriverWait(driver,Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Welcome')]")));
		Assert.assertEquals("Welcome, rick grimes!",objsignin.Welcome());
	}
	
	@Test
	public void ResetPwd(String email) {
		objsignin=new SignIn(driver);
		objsignin.ForgotPwd();
		objsignin.ResetPwd(email);
	}
		
	
	
	
	
	
	
	

}
