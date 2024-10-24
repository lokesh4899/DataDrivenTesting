package com.datadriventesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[text()='Style']")
	WebElement style;
	@FindBy(xpath="//*[text()='Size']")
	WebElement size;
	@FindBy(xpath="//*[text()='Climate']")
	WebElement climate;
	@FindBy(xpath="//*[text()='Color']")
	WebElement color;
	@FindBy(xpath="//*[text()='Eco Collection']")
	WebElement eco_collection;
	@FindBy(xpath="//*[text()='Erin Recommends']")
	WebElement erin_recommends;
	@FindBy(xpath="//*[text()='Material']")
	WebElement material;
	@FindBy(xpath="//*[text()='New']")
	WebElement new_filter;
	@FindBy(xpath="//*[text()='Pattern']")
	WebElement pattern;
	@FindBy(xpath="//*[text()='Performance Fabric']")
	WebElement performance_fabric;
	@FindBy(xpath="//*[text()='Price']")
	WebElement price;
	@FindBy(xpath="//*[@id=\"narrow-by-list\"]/descendant::div[text()=\"Sale\"]")
	WebElement sale_filter;
	
	public ProductsPage(WebDriver Driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void ClickOnStyle() {
		style.click();
		List<WebElement> li=driver.findElements(By.xpath("//*[text()=\"Style\"]/following-sibling::div/ol/li"));
		for(int i=1;i<=li.size();i++) {
			if(li.get(i).equals("Insulated")){
				driver.findElement(By.xpath("//*[text()='Style']/following-sibling::div/ol/li["+i+"]")).click();
			}
		}
	}
	public void ClickOnSize() {
		size.click();
		List<WebElement> li=driver.findElements(By.xpath("//*[text()=\"Size\"]/following-sibling::div/ol/li"));
		for(int i=1;i<=li.size();i++) {
			if(li.get(i).equals("Insulated")){
				driver.findElement(By.xpath("//*[text()='Size']/following-sibling::div/ol/li["+i+"]")).click();
			}
		}
	}
	public void ClickOnClimate() {
		climate.click();
		List<WebElement> li=driver.findElements(By.xpath("//*[text()='Size']/following-sibling::div/div/div/a"));
		for(int i=1;i<=li.size();i++) {
			if(li.get(i).equals("XS")){
				driver.findElement(By.xpath("//*[text()='Size']/following-sibling::div/div/div/a["+i+"]")).click();
			}
		}
	}
	public void ClickOnColor() {
		color.click();
	}
	public void ClickOnEcoCollection() {
		eco_collection.click();
	}
	public void ClickOnErinRecommends() {
		erin_recommends.click();
	}
	public void ClickOnMaterial() {
		material.click();
	}
	public void ClickOnNew() {
		new_filter.click();
	}
	public void ClickOnPattern() {
		pattern.click();
	}
	public void ClickOnPerformanceFabric() {
		performance_fabric.click();
	}
	public void ClickOnPrice() {
		price.click();
	}
	public void ClickOnSale() {
		sale_filter.click();
	}
	

}
