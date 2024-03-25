package com.datadriventesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.utilities.JsonData;

public class LumaTest extends BaseClass{
	
	Register ob;
	SignIn obj;
	Product obj1;
	Billing obj2;
	
	
	
	@BeforeClass
	public void Before() {
		driver.get(config.getProperty("url"));
	}
	
	@Test(dataProvider="CreateAccount",dataProviderClass=JsonData.class)
	public void test0(String fname,String lname,String email,String pwd,String conf_pwd) {
		ob=new Register(driver);
		ob.signOn();
		ob.setFirstName(fname);
		ob.setLastName(lname);
		ob.setEmail(email);
		ob.setPassword(pwd);
		ob.confirmPassword(conf_pwd);
		ob.cresteAccount();
		//new WebDriverWait(driver,Duration.ofSeconds(100)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(text(),'Thanks you for registering with Main Website Store.')]")));
		//ob.signOut();
	}


	@Ignore
	@Test(dataProvider="SignIn",dataProviderClass=JsonData.class)
	public void test1(String mail,String pwd) {
		obj=new SignIn(driver);
		obj.clickOnSignIn();
		obj.Email(mail);
		obj.setPassword(pwd);
		obj.signInBtn();
	}
	
	@Test
	public void test2() {
		obj1=new Product(driver);
		
		obj1.Tees();
		obj1.Tshirts();
		obj1.TeesAddToCart();
		new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'You added Ryker LumaTech')]")));
		obj1.cartImg();
		obj1.editCart();
		obj1.bottle();
		obj1.bottleComment();
		Assert.assertEquals("Wide mouth opening makes it easy to clean!",obj1.bottleComment());
		obj1.bottleAddToCart();
		obj1.cartImg();
		obj1.checkOut();
		
	}
	
	@Test(dataProvider="Address",dataProviderClass=JsonData.class)
	public void test3(String address,String city,String country,String state,String zipcode,String phone,String discountcode ) {
		
		obj2=new Billing(driver);
		obj2.addressField(address);
		obj2.cityField(city);
		obj2.setCountry(country);
		obj2.setState(state);
		obj2.zipCodeField(zipcode);
		obj2.phoneNo(phone);
		obj2.shippingMethod();
		obj2.nextButton();
		obj2.discount(discountcode);
		obj2.placeOrder();
		obj2.Order();
		obj2.myAccount();
		obj2.myOrders();
		obj2.viewOrder();
		
	}


}
