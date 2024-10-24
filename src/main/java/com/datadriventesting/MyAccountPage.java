package com.datadriventesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@class=\"box box-information\"]/descendant::a[1]")
	WebElement edit;
	@FindBy(xpath="//*[@class=\"box box-information\"]/descendant::a[2]")
	WebElement change_pwd;
	@FindBy(xpath="//*[@class=\"block block-dashboard-addresses\"]/descendant::a[1]")
	WebElement manage_address;
	@FindBy(xpath="//*[@class=\"block block-dashboard-addresses\"]/descendant::a[3]")
	WebElement edit_billing_address;
	@FindBy(xpath="//*[@class=\"block block-dashboard-addresses\"]/descendant::a[5]")
	WebElement edit_shipping_address;
	@FindBy(xpath="//*[@class=\"block block-dashboard-orders\"]/descendant::a[1]")
	WebElement view_all_orders;
	
	public MyAccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void ClickOnEdit() {
		edit.click();
	}
	public void ClickOnChangePwd() {
		change_pwd.click();
	}
	public void ClickOnManageAddress() {
		manage_address.click();
	}
	public void EditBillingAddress() {
		edit_billing_address.click();
	}
	public void EditShippingAddress() {
		edit_shipping_address.click();
	}
	public void ClickOnAllOrders() {
		view_all_orders.click();
	}

}
