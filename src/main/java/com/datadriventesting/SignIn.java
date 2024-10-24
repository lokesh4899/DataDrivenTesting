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
	@FindBy(className="base")
	WebElement customer_login;
	@FindBy(xpath="//*[contains(text(),'Welcome')]")
	WebElement welcome;
	@FindBy(xpath="//*[contains(text(),\"The account sign-in was incorrect or your account is disabled temporarily.\")]")
	WebElement sign_in_error;
	@FindBy(xpath="//*[@id=\"login-form\"]/fieldset/div[4]/div[2]/a/span")
	WebElement forgot_pwd;
	@FindBy(id="email_address")
	WebElement forgot_mail;
	@FindBy(xpath="//*[@id=\"form-validate\"]/div/div[1]/button/span")
	WebElement reset;

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
	public void ForgotPwd() {
		forgot_pwd.click();
	}
	public void ResetPwd(String mail) {
		forgot_mail.sendKeys(mail);
		reset.click();
	}
	
	public String CutomerLogin() {
		return customer_login.getText();
	}
	
	public String Welcome() {
		return welcome.getText();
	}
	

}
