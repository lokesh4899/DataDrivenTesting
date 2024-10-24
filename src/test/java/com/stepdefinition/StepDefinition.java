package com.stepdefinition;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.BaseClass;
import com.datadriventesting.Register;

import io.cucumber.java.en.*;

public class StepDefinition extends BaseClass{
	
	Register objreg;
	
	@Given("Launch the url")
	public void launch_the_url() {
	    try {
			setUp();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user click on CreateAccount link")
	public void user_click_on_create_account_link() {
	   objreg=new Register(driver);
	   objreg.signOn();
	}

	@When("User enters {string} and {string}")
	public void user_enters_(String fname,String lname) {
		objreg=new Register(driver);
		objreg.setFirstName(fname);
		objreg.setLastName(lname);
	}

	@When("User enters {string},{string} and {string}")
	public void user_enters_and(String email, String pwd, String rep_pwd) {
	    objreg=new Register(driver);
	    objreg.setEmail(email);
	    objreg.setPassword(pwd);
	    objreg.confirmPassword(rep_pwd);
	}

	@Then("user click on create account and validate the success message and logout")
	public void user_click_on_create_account_and_validate_the_success_message_and_logout() {
		 objreg=new Register(driver);
		 objreg.cresteAccount();
		 new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Thanks you for registering with Main Website Store.')]")));
		 objreg.signOut();
	}

	
}
