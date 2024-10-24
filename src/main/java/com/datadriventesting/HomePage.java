package com.datadriventesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(id="search")
	WebElement search_box;
	@FindBy(xpath="//[@class='action search']")
	WebElement search_btn;
	@FindBy(xpath="//*[@class='minicart-wrapper']/a")
	WebElement cartimg;
	@FindBy(linkText="Support This Project")
	WebElement support;
	@FindBy(linkText="Sign In")
	WebElement sign_in;
	@FindBy(linkText="Create an Account")
	WebElement create_Account;
	@FindBy(xpath="//*[@class='logo']/img")
	WebElement logo;
	@FindBy(xpath="//*[text()='What's New']")
	WebElement whats_new;
	@FindBy(xpath="//*[text()='Women']")
	WebElement women;
	@FindBy(xpath="//*[text()='Women']/following::a[1]")
	WebElement w_tops;
	@FindBy(xpath="//*[text()='Women']/following::a[2]")
	WebElement w_jackets;
	@FindBy(xpath="//*[text()='Women']/following::a[3]")
	WebElement w_hoodies;
	@FindBy(xpath="//*[text()='Women']/following::a[4]")
	WebElement w_tees;
	@FindBy(xpath="//*[text()='Women']/following::a[5]")
	WebElement w_bras;
	@FindBy(xpath="//*[text()='Women']/following::a[6]")
	WebElement w_bottoms;
	@FindBy(xpath="//*[text()='Women']/following::a[7]")
	WebElement w_pants;
	@FindBy(xpath="//*[text()='Women']/following::a[8]")
	WebElement w_shorts;
	@FindBy(xpath="//*[text()='Men']")
	WebElement men;
	@FindBy(xpath="//*[text()='Men']/following::a[1]")
	WebElement m_tops;
	@FindBy(xpath="//*[text()='Men']/following::a[2]")
	WebElement m_jackets;
	@FindBy(xpath="//*[text()='Men']/following::a[3]")
	WebElement m_hoodies;
	@FindBy(xpath="//*[text()='Men']/following::a[4]")
	WebElement m_tees;
	@FindBy(xpath="//*[text()='Men']/following::a[5]")
	WebElement m_tanks;
	@FindBy(xpath="//*[text()='Men']/following::a[6]")
	WebElement m_bottoms;
	@FindBy(xpath="//*[text()='Men']/following::a[7]")
	WebElement m_pants;
	@FindBy(xpath="//*[text()='Men']/following::a[8]")
	WebElement m_shorts;
	@FindBy(xpath="//*[text()='Gear']")
	WebElement gear;
	@FindBy(xpath="//*[text()='Gear']/following::a[1]")
	WebElement bags;
	@FindBy(xpath="//*[text()='Gear']/following::a[2]")
	WebElement fitness_equip;
	@FindBy(xpath="//*[text()='Gear']/following::a[3]")
	WebElement watches;
	@FindBy(xpath="//*[text()='Training']")
	WebElement training;	
	@FindBy(xpath="//*[text()='Training']/following::a[1]")
	WebElement vid_down;
	@FindBy(xpath="//*[text()='Sale']")
	WebElement sale;
	@FindBy(xpath="//*[@class='blocks-promo']/a")
	WebElement yoga_promo;
	@FindBy(xpath="//*[@class='blocks-promo']/div/a[1]")
	WebElement pants_promo;
	@FindBy(xpath="//*[@class='blocks-promo']/div/a[2]")
	WebElement tees_promo;
	@FindBy(xpath="//*[@class='blocks-promo']/div/a[3]")
	WebElement erin_recommends_promo;
	@FindBy(xpath="//*[@class='blocks-promo']/div/a[4]")
	WebElement perfomance_fabrics_promo;
	@FindBy(xpath="//*[@class='blocks-promo']/div/a[5]")
	WebElement eco_friendly_promo;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void ClickOnLogo() {
		logo.click();
	}
	public void ClickOnSupport() {
		support.click();
	}
	public void ClickOnSignOn() {
		sign_in.click();
	}
	public void ClickOnCreateAccount() {
		create_Account.click();
	}
	public void SearchBox() {
		search_box.sendKeys("abcd");
		search_btn.click();
	}
	public void clickOnCart() {
		cartimg.click();
	}
	public void clickOnWhatsNew() {
		whats_new.click();
	}
	public void ClickOnWomen() {
		women.click();
	}
	public void clickOnWomenTops() {
		Actions act=new Actions(driver);
		act.moveToElement(women).perform();
		act.moveToElement(w_tops).click().build();
	}
	public void clickOnWomenBottoms() {
		Actions act=new Actions(driver);
		act.moveToElement(women).perform();
		act.moveToElement(w_bottoms).click().build();
	}
	
	public void ClickOnWomenJackets() {
		Actions act=new Actions(driver);
		act.moveToElement(women).perform();
		act.moveToElement(w_tops).perform();
		act.moveToElement(w_jackets).click().build();
	}
	public void clickOnWomenHoodies() {
		Actions act=new Actions(driver);
		act.moveToElement(women).perform();
		act.moveToElement(w_tops).perform();
		act.moveToElement(w_hoodies).click().build();
	}
	public void ClickOnWomenTees() {
		Actions act=new Actions(driver);
		act.moveToElement(women).perform();
		act.moveToElement(w_tops).perform();
		act.moveToElement(w_tees).click().build();
	}
	public void ClickOnWomenBras() {
		Actions act=new Actions(driver);
		act.moveToElement(women).perform();
		act.moveToElement(w_tops).perform();
		act.moveToElement(w_bras).click().build();
	}
	public void ClickOnWomenPants() {
		Actions act=new Actions(driver);
		act.moveToElement(women).perform();
		act.moveToElement(w_bottoms).perform();
		act.moveToElement(w_pants).click().build();
	}
	public void ClickOnWomenShorts() {
		Actions act=new Actions(driver);
		act.moveToElement(women).perform();
		act.moveToElement(w_bottoms).perform();
		act.moveToElement(w_shorts).click().build();
	}
	public void clickOnMens() {
		men.click();
	}
	public void clickOnMenTops() {
		Actions act=new Actions(driver);
		act.moveToElement(men).perform();
		act.moveToElement(m_tops).click().build();
	}
	public void clickOnMenBottoms() {
		Actions act=new Actions(driver);
		act.moveToElement(men).perform();
		act.moveToElement(m_bottoms).click().build();
	}
	
	public void ClickOnMenJackets() {
		Actions act=new Actions(driver);
		act.moveToElement(men).perform();
		act.moveToElement(m_tops).perform();
		act.moveToElement(m_jackets).click().build();
	}
	public void clickOnMenHoodies() {
		Actions act=new Actions(driver);
		act.moveToElement(men).perform();
		act.moveToElement(m_tops).perform();
		act.moveToElement(m_hoodies).click().build();
	}
	public void ClickOnMenTees() {
		Actions act=new Actions(driver);
		act.moveToElement(men).perform();
		act.moveToElement(m_tops).perform();
		act.moveToElement(m_tees).click().build();
	}
	public void ClickOnMenTanks() {
		Actions act=new Actions(driver);
		act.moveToElement(men).perform();
		act.moveToElement(m_tops).perform();
		act.moveToElement(m_tanks).click().build();
	}
	public void ClickOnMenPants() {
		Actions act=new Actions(driver);
		act.moveToElement(men).perform();
		act.moveToElement(m_bottoms).perform();
		act.moveToElement(m_pants).click().build();
	}
	public void ClickOnMenShorts() {
		Actions act=new Actions(driver);
		act.moveToElement(men).perform();
		act.moveToElement(m_bottoms).perform();
		act.moveToElement(m_shorts).click().build();
	}
	public void ClickOnGear() {
		gear.click();
	}
	public void clickOnBags() {
		Actions act=new Actions(driver);
		act.moveToElement(gear).perform();
		act.moveToElement(bags).click().build();
	}
	public void clickFitness() {
		Actions act=new Actions(driver);
		act.moveToElement(gear).perform();
		act.moveToElement(fitness_equip).click().build();
	}
	public void clickOnWatches() {
		Actions act=new Actions(driver);
		act.moveToElement(gear).perform();
		act.moveToElement(watches).click().build();
	}
	public void ClickOnTraining() {
		training.click();
	}
	public void ClickOnVideoDownload() {
		Actions act=new Actions(driver);
		act.moveToElement(training).perform();
		act.moveToElement(vid_down).click().build();
	}
	public void ClickOnSale() {
		sale.click();
	}
	public void ClickOnYogaImg() {
		yoga_promo.click();
	}
	public void ClickOnPantsImg() {
		pants_promo.click();
	}
	public void ClickOnTeesImg() {
		tees_promo.click();
	}
	public void ClickOnErinPromo() {
		erin_recommends_promo.click();
	}
	public void ClickOnPreformancePromo() {
		perfomance_fabrics_promo.click();
	}
	public void ClickOnEcoFriendly() {
		eco_friendly_promo.click();
	}

	
	
}
