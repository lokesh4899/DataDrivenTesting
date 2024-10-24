package com.datadriventesting;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;

public class brokenLinks extends BaseClass{
	
	@BeforeClass
	public void Before() {
		//Launch();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
	}
	
//	
//	@Test
//	public void Fileupload() throws InterruptedException {
//		Actions act=new Actions(driver);
//		WebElement file=driver.findElement(By.id("input-4"));
//		act.moveToElement(file).click().perform();
//		Thread.sleep(3000);
//		Runtime.getRuntime().exec("E:\\mavenbuild.txt");)
//	}
	
	@Test
	public void rwer() {
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			
			try {
			URL link1 = new URL(url);
			HttpURLConnection httpURLConnection = (HttpURLConnection) link1.openConnection();
			httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
			httpURLConnection.connect();


			if (httpURLConnection.getResponseCode() == 200) {
			System.out.println(url + " - " + httpURLConnection.getResponseMessage());
			} else {
			System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
			}
			} catch (Exception e) {
			System.out.println(url + " - " + "is a broken link");
			}
			}
		
	}

}
