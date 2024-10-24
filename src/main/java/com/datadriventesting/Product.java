package com.datadriventesting;

import java.time.Duration;
import java.util.List;

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
	
	@FindBy(id="qty")
	WebElement quantiy;
	@FindBy(id="product-addtocart-button")
	WebElement add_to_cart;
	@FindBy(id="product-updatecart-button")
	WebElement update_cart;
	@FindBy(xpath="//*[class='product-addto-links']/a[1]/span")
	WebElement add_to_wish_list;
	@FindBy(xpath="//*[class='product-addto-links']/a[2]/span")
	WebElement add_to_compare;
	@FindBy(linkText="Details")
	WebElement details;
	@FindBy(linkText="More Information")
	WebElement more_inf;
	@FindBy(linkText="Reviews")
	WebElement reviews;
	@FindBy(xpath="//*[class='action viewcart']/span")
	WebElement view_and_edit_cart;
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div")
	WebElement add_to_cart_msg;
	
	public Product(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void SelectSize() {
		List<WebElement> size=driver.findElements(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div/div"));
		for(int i=1;i<=size.size();i++) {
			String text=driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div/div["+i+"]")).getText();
			if(text.equals("M")) {
				driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div/div["+i+"]")).click();
			}
		}
	}
	public void SelectColor() {
		List<WebElement> li=driver.findElements(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
		for(int i=1;i<=li.size();i++) {
			String text=driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div/div["+i+"]")).getAttribute("aria-label");
			if(text.equals("Grey")) {
				driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div/div["+i+"]")).click();
			}
		}
	}
	public void ClickOnAddToCart() {
		add_to_cart.click();
	}
	public String SuccessCartMsg() {
		return add_to_cart_msg.getText();
	}
	public void ClickOnAddToWishList() {
		add_to_wish_list.click();
	}
	public void ClcikOnAddToCompare() {
		add_to_compare.click();
	}
	public void clickOnReviews() {
		reviews.click();
	}
	public void ClickOnDetails() {
		details.click();
	}
	public void ClickOnInfo() {
		more_inf.click();
	}
	
	public void EditQtyInMiniCart() {
		List<WebElement> li=driver.findElements(By.xpath("//*[@id='mini-cart']/li"));
		for(int i=0;i<=li.size();i++){
			String text=driver.findElement(By.xpath("//*[@id=\"mini-cart\"]/li["+i+"]/div/div/strong/a")).getText();
			if(text.equals("Hero Hoodie")) {
				driver.findElement(By.xpath("//*[@id=\"mini-cart\"]/descendant::input["+i+"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"mini-cart\"]/descendant::input["+i+"]")).sendKeys("2");
			}
		}
	}
	public void EditDeleteInMiniCart() {
		List<WebElement> li=driver.findElements(By.xpath("//*[@id='mini-cart']/li"));
		for(int i=0;i<=li.size();i++){
			String text=driver.findElement(By.xpath("//*[@id=\"mini-cart\"]/li["+i+"]/div/div/strong/a")).getText();
			if(text.equals("Hero Hoodie")) {
				driver.findElement(By.xpath("//*[@id=\"mini-cart\"]/li["+i+"]/descendant::a[4]")).click();
			}
		}
	}
	public void EditItemInMiniCart() {
		List<WebElement> li=driver.findElements(By.xpath("//*[@id='mini-cart']/li"));
		for(int i=0;i<=li.size();i++){
			String text=driver.findElement(By.xpath("//*[@id=\"mini-cart\"]/li["+i+"]/div/div/strong/a")).getText();
			if(text.equals("Hero Hoodie")) {
				driver.findElement(By.xpath("//*[@id=\"mini-cart\"]/li["+i+"]/descendant::a[3]")).click();
			}
		}
	}
	
	
	
	
	
	
	
	/*@FindBy(xpath="//*[@class='navigation']/ul/li[3]")
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
		List<WebElement> li=driver.findElements(By.xpath("//*[@class='products list items product-items']/li"));
		for(int i=1;i<=li.size();i++) {
			String Text=driver.findElement(By.xpath("//*[@class=\"products list items product-items\"]/li["+i+"]/div/div/strong/a")).getText();
			System.out.println(Text);
			if(Text.equals("Strike Endurance Tee")) {
				driver.findElement(By.xpath("//*[@class=\\\"products list items product-items\\\"]/li[\"+i+\"]/div/div/strong/a")).click();
			}
		}
//		material.click();
//		cotton.click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		pattern.click();
//		solid.click();
//		climate.click();
//		allweather.click();
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
		/* bottle.click();
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
	}*/

}
