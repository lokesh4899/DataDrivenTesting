package com.datadriventesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Billing {
	
	WebDriver driver;
	
	@FindBy(name="street[0]")
	WebElement address;
	@FindBy(name="city")
	WebElement city;
	@FindBy(name="country_id")
	WebElement country_field;
	@FindBy(name="region_id")
	WebElement state;
	@FindBy(name="postcode")
	WebElement zipcode;
	@FindBy(name="telephone")
	WebElement mobile;
	@FindBy(name="ko_unique_1")
	WebElement shipping_method;
	@FindBy(xpath="//*[@id='shipping-method-buttons-container']/div/button")
	WebElement next;
	@FindBy(xpath="//*[@class='payment-group']/div[1]")
	WebElement payment_method;
	@FindBy(xpath="//*[@id='block-discount-heading']")
	WebElement discount;
	@FindBy(id="discount-code")
	WebElement discount_code_field;
	@FindBy(xpath="//*[@class='action action-apply']/span/span")
	WebElement apply_discount;
	@FindBy(xpath="//*[@class='message message-error error']/div")
	WebElement error_msg;
	@FindBy(xpath="//*[@class='action primary checkout']")
	WebElement place_order;
	@FindBy(xpath="//*[@class='checkout-success']/p[1]")
	WebElement order_id;
	@FindBy(linkText="My Account")
	WebElement my_account;
	@FindBy(linkText="My Orders")
	WebElement my_orders;
	@FindBy(xpath="//*[@class='data table table-order-items history']/tbody/tr[1]/td[6]/a[1]")
	WebElement view_order;
	@FindBy(xpath="//*[@class='panel header']/ul/li[2]/span/button")
	WebElement dropdown_button;
	@FindBy(linkText="Sign Out")
	WebElement sign_out;
	
	public Billing(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void addressField(String Address) {
		address.clear();
		address.sendKeys(Address);
	}
	public void cityField(String City) {
		city.clear();
		city.sendKeys(City);
	}
	public void setCountry(String strCountry) {
		Select new_country=new Select(country_field);
		new_country.selectByVisibleText(strCountry);
	}
	public void setState(String strState) {
		Select new_state=new Select(state);
		new_state.selectByVisibleText(strState);
	}
	public void zipCodeField(String zipcode2) {
		zipcode.clear();
		zipcode.sendKeys(zipcode2);
	}
	public void phoneNo(String phone) {
		mobile.clear();
		mobile.sendKeys(phone);
	}
	public void shippingMethod() {
		shipping_method.click();
	}
	public void nextButton() {
		next.click();
		new WebDriverWait(driver,Duration.ofSeconds(50)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Payment Method')]")));
		
	}
	public void discount(String disc_code) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",discount);
		discount_code_field.sendKeys(disc_code);
		js.executeScript("arguments[0].click();",apply_discount);

	}
	public String errorMsg() {
		return error_msg.getText();
	}
	public void placeOrder() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",place_order);
		new WebDriverWait(driver,Duration.ofSeconds(50)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Thank you for your purchase!')]")));

	}
	public String Order() {
		return order_id.getText();
	}
	public void myAccount() {
		dropdown_button.click();
		my_account.click();
	}
	public void myOrders() {
		my_orders.click();
	}
	public void viewOrder() {
		new WebDriverWait(driver,Duration.ofSeconds(50)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'My Orders')]")));
		view_order.click();
	}
	public void signOut() {
		dropdown_button.click();
		sign_out.click();
	}
	
	
	

}
