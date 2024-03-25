package com.datadriventesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	
	WebDriver driver;
	
	@FindBy(linkText="Sign In")
	WebElement sign_in;
	@FindBy(id="email")
	WebElement signin_mail;
	@FindBy(id="pass")
	WebElement signin_pwd;
	@FindBy(id="send2")
	WebElement signin_button;
	@FindBy(xpath="//*[@class='panel header]/ul/li[1]/span")
	WebElement welcome_msg;
	
	public SignIn(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnSignIn() {
		sign_in.click();	
	}
	
	public void Email(String email) {
		signin_mail.sendKeys(email);
	}
	
	public void setPassword(String pwd) {
		signin_pwd.sendKeys(pwd);
	}
	
	public void signInBtn() {
		signin_button.click();
	}

}
