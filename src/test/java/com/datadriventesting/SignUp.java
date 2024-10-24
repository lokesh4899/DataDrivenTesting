package com.datadriventesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.utilities.JsonData;

public class SignUp extends BaseClass{
	
	Register objreg;
	
	
//	@Test
//	public void verifyCreateAccount() {
//		objreg=new Register(driver);
//		objreg.signOn();
//		Assert.assertEquals("Create New Customer Account",objreg.CreateCustomerAccount());
//	}
	
	
	@Test(dataProvider="CreateAccount",dataProviderClass=JsonData.class)
	public void validDetails(String fname,String lname,String email,String pwd,String conf_pwd) {
		objreg=new Register(driver);
		objreg.signOn();
		objreg.setFirstName(fname);
		objreg.setLastName(lname);
		objreg.setEmail(email);
		objreg.setPassword(pwd);
		objreg.confirmPassword(conf_pwd);
		objreg.cresteAccount();	
		new WebDriverWait(driver,Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Thanks you for registering with Main Website Store.')]")));
		objreg.signOut();
		
	
	
	
	}
	
	
}
