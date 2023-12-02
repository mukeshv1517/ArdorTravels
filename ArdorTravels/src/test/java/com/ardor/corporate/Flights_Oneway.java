package com.ardor.corporate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.utilities.AppUtilities;

public class Flights_Oneway extends AppUtilities {
@Test
public void openapp()throws Exception {
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to(url);
	  WebElement loginLink = driver.findElement(By.linkText("Login"));
	    loginLink.click();
	     
	    WebElement corporateLoginButton = driver.findElement(By.linkText("Corporate Login"));
	    corporateLoginButton.click();	 
		System.out.println("Corporate login selected");
		Thread.sleep(2000);
		 JavascriptExecutor Js1 = (JavascriptExecutor)driver;
		 	Js1.executeScript("window.scrollBy(0,500)");
		 	Thread.sleep(2000);
		 	
}
}
