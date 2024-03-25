package com.datadriventesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	
	WebDriver driver;
	
	@FindBy(linkText="Create an Account")
	WebElement create_Account;
	@FindBy(id="firstname")
	WebElement first_name;
	@FindBy(id="lastname")
	WebElement last_name;
	@FindBy(id="email_address")
	WebElement Email_Address;
	@FindBy(id="password")
	WebElement pwd;
	@FindBy(id="password-confirmation")
	WebElement confirm_pwd;
	@FindBy(xpath="//*[@id='form-validate']/div/div[1]/button")
	WebElement Create_button;
	@FindBy(xpath="//*[@class='panel header']/ul/li[2]/span/button")
	WebElement dropdown_button;
	@FindBy(linkText="Sign Out")
	WebElement sign_out;
	@FindBy(xpath="//*[@class='messages']/div/div")
	WebElement Welcome_msg;
	
	
	public Register(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void signOn() {
		create_Account.click();
	}
	public void setFirstName(String fname) {
		first_name.sendKeys(fname);
	}
	public void setLastName(String lname) {
		last_name.sendKeys(lname);
	}
	public void setEmail(String Email) {
		Email_Address.sendKeys(Email);
	}
	public void setPassword(String password) {
		pwd.sendKeys(password);
	}
	public void confirmPassword(String confirm_password) {
		confirm_pwd.sendKeys(confirm_password);
	}
	public void cresteAccount() {
		Create_button.click();
	}
	public void signOut() {
		dropdown_button.click();
		sign_out.click();
	}
	public String Msg() {
		return Welcome_msg.getText();
	}

}
