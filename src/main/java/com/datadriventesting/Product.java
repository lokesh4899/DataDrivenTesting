package com.datadriventesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@class='navigation']/ul/li[3]")
	WebElement men;
	@FindBy(xpath="//*[@class='navigation']/ul/li[3]/ul/li[1]")
	WebElement tops;
	@FindBy(xpath="//*[@class='navigation']/ul/li[3]/ul/li[1]/ul/li[3]")
	WebElement tees;
	@FindBy(xpath="//*[@id='narrow-by-list']/div[5]/div[1]")
	WebElement material;
	@FindBy(xpath="//*[@id='narrow-by-list']/div[5]/div[2]/ol/li[2]/a")
	WebElement cotton;
	@FindBy(xpath="//*[@id='narrow-by-list']/div[9]/div[1]")
	WebElement pattern;
	@FindBy(xpath="//*[@id='narrow-by-list']/div[9]/div[2]/ol/li/a")
	WebElement solid;
	@FindBy(xpath="//*[@id='narrow-by-list']/div[9]/div[1]")
	WebElement climate;
	@FindBy(xpath="//*[@id='narrow-by-list']/div[9]/div[2]/ol/li")
	WebElement allweather;
	@FindBy(xpath="//*[@id='maincontent']/div[3]/div[1]/div[4]/ol/li[2]/div/a/span/span/img")
	WebElement tshirt;
	@FindBy(id="option-label-size-143-item-167")
	WebElement size;
	@FindBy(id="option-label-color-93-item-52")
	WebElement color;
	@FindBy(xpath="//*[@class='product-addto-links']/a/span")
	WebElement addtofav;
	@FindBy(xpath="//*[@class='minicart-wrapper']/a")
	WebElement cartimg;
	@FindBy(xpath="//*[@id='minicart-content-wrapper']/div[2]/div[5]/div/a/span")
	WebElement view_edit_cart;
	@FindBy(xpath="//*[@class='products list items product-items']/li[3]/div/a/span/span/img")
	WebElement bottle;
	@FindBy(xpath="//*[@class='product data items']/div[5]/a")
	WebElement review;
	@FindBy(xpath="//*[@class='product data items']/div[6]/div[1]/div/div[2]/ol/li/div[3]")
	WebElement comment;
	@FindBy(id="product-addtocart-button")
	WebElement tees_Addtocart;
	@FindBy(id="product-addtocart-button")
	WebElement bottle_Addtocart;
	@FindBy(id="top-cart-btn-checkout")
	WebElement proceed_to_checkout;
	
	public Product(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void Tees() {
		Actions action=new Actions(driver);
		action.moveToElement(men).perform();
		action.moveToElement(tops).perform();
		action.moveToElement(tees);
		action.click().build().perform();
		material.click();
		cotton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		pattern.click();
		solid.click();
		climate.click();
		allweather.click();
	}
	
	public void Tshirts() {
		tshirt.click();
		size.click();
		color.click();
	}
	public void TeesAddToCart() {
		tees_Addtocart.click();
	}
	public void cartImg() {
		cartimg.click();
	}
	public void editCart() {
		view_edit_cart.click();
	}
	public void bottle() {
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();", bottle);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		bottle.click();
		review.click();
	}
	public String bottleComment() {
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Wide mouth opening makes it easy to clean!')]")));
		return comment.getText();
	}
	public void bottleAddToCart() {
		bottle_Addtocart.click();
	}
	public void checkOut() {
		proceed_to_checkout.click();
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Order Summary')]")));
	}

}
