package com.ardor.corporate;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.utilities.AppUtilities;

import java.time.Duration;

public class Flights_in_corporate extends AppUtilities {
@Test	
public void login()throws Exception{
	
	// Assigning FirefoxDriver
	WebDriver driver =new FirefoxDriver();
	
	//Navigating to APP URL
	driver.navigate().to(url);
	System.out.print(driver.getTitle());
	
	//Select login on home page
    WebElement loginLink = driver.findElement(By.linkText("Login"));
    loginLink.click();
    //Select corporate login in Login
        
    WebElement corporateLoginButton = driver.findElement(By.linkText("Corporate Login"));
    corporateLoginButton.click();	 
	System.out.println("Corporate login selected");
	Thread.sleep(2000);
	
	//Scroll down page to accept cookies
	 JavascriptExecutor Js1 = (JavascriptExecutor)driver;
	 	Js1.executeScript("window.scrollBy(0,500)");
	 	Thread.sleep(2000);
	 	//Accept cookies
	WebElement  acceptCookieButton=(driver.findElement(By.xpath("//input[@value='Accept']")));
	 
     acceptCookieButton.click();
     
     System.out.println("Cookie Accepted");  
        //Enter id and password
		driver.findElement(By.name("ardoremail1")).sendKeys("admin@ardortravels.com");
		driver.findElement(By.name("ardorpassword2")).sendKeys("Ardor123!");
		driver.findElement(By.xpath("//button[normalize-space()='LOGIN']")).click();
		System.out.println("Login completed");
		Thread.sleep(2000);

		 JavascriptExecutor Js2 = (JavascriptExecutor)driver;
		 	Js2.executeScript("window.scrollBy(0,300)");
		 	
		 	Thread.sleep(4000);	
		 	//Click on flights
		driver.findElement(By.xpath("//span[contains(text(),'Flights')]")).click();
		driver.findElement(By.xpath("//"
				+ "div[@class='jp-flightautocomplete-from-container']"
				+ "//div[@role='presentation']")).click();
		 JavascriptExecutor Js3 = (JavascriptExecutor)driver;
		 	Js3.executeScript("window.scrollBy(0,300)");
		 	//Enter from address 
		driver.findElement(By.id("myTextField")).sendKeys("Mum");
        
            Thread.sleep(3000);
           driver.findElement(By.xpath("//div[@class='jp-airport-options']")).click();

		System.out.println("Mumbai selected");
		driver.findElement(By.xpath("//div[@class='jp-flightautocomplete-to-container']"
				+ "//div[@role='presentation']")).click();
		//Enter to address
		driver.findElement(By.xpath("//input[@id='myTextField']")).sendKeys("hyd");
		driver.findElement(By.xpath("//div[@class='jp-single-element-container']")).click();
		//Entering to Starting date	
		driver.findElement(By.xpath("//div[@class='jp-from-date']")).click();
		//Select starting date
		driver.findElement(By.xpath("//div[@aria-label='Mon Dec 04 2023']//div[@id='box']")).click();
		//Entering to return date
        driver.findElement(By.xpath("//div[@class='jp-main-div-from-date']")).click();
        //Select return date
        driver.findElement(By.xpath("//div[@aria-label='Thu Dec 07 2023']//div[@id='box']")).click();
        //Enter passenger details
        driver.findElement(By.xpath("//span[@class='traveller-title traveller-count']")).click();
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(2000);
	
		//Search flights
		driver.findElement(By.xpath("//input[@value='Search ']")).click();
		//driver.findElement(By.xpath("//input[@class='jp-button primary']//input[@value='Select']")).click();
		//driver.findElement(By.xpath("//div[@class='Duration']")).click();
		driver.findElement(By.xpath("//div[@class='round-trip international-flight']")).click();
		//driver.findElement(By.xpath("//input[@class='jp-button primary']//input[@value='Select']")).click();
	//	driver.findElement(By.xpath("//div[@class='Duration']")).click();
		
}

	
	}

