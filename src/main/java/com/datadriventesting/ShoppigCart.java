package com.datadriventesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShoppigCart {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@name='update_cart_action']/span")
	WebElement update_cart;
	@FindBy(id="block-discount-heading")
	WebElement apply_disc;
	@FindBy(id="coupon_code")
	WebElement coupen_code;
	@FindBy(xpath="//*[@class=\"action apply primary\"]/span")
	WebElement apply_disc_btn;
	@FindBy(id="block-shipping-heading")
	WebElement estimation;
	@FindBy(name="country_id")
	WebElement country;
	@FindBy(name="region_id")
	WebElement region_id;
	@FindBy(name="postcode")
	WebElement zipcode;
	@FindBy(xpath="//*[@class=\"action primary checkout\"]/span")
	WebElement checkout;
	
	public ShoppigCart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void ClickOnUpdateCart() {
		update_cart.click();
	}
	public void clickOnApplyDiscount() {
		apply_disc.click();
	}
	public void ApplyDiscount() {
		coupen_code.sendKeys("agsfad");
		apply_disc_btn.click();
	}
	public void ClickOnEstimateShipping() {
		estimation.click();
	}
	public void SelectCountry() {
		Select cont=new Select(country);
		cont.selectByVisibleText("India");
	}
	public void SelectState() {
		Select state=new Select(region_id);
		state.selectByVisibleText("Telangana");
	}
	public void InputZipcode() {
		zipcode.sendKeys("23456");
	}
	public void ProcedCheckout() {
		checkout.click();
	}
	

}
