package com.hcl.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage {
	public static WebDriver driver;

	@Given("customer is in FB login page")
	public void customer_is_in_FB_login_page() {
		System.setProperty("webdriver.chrome.driver", "F:\\Velmurugan\\JAVA\\eclipse-java-oxygen-3a-win32-x86_64\\eclipse\\GitThirdDay\\CucumberDay1\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@When("customer enters username and password")
	public void customer_enters_username_and_password() {
	  driver.findElement(By.id("email")).sendKeys("renu123@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("pavi123");
	}

	@When("Customer click submit button")
	public void customer_click_submit_button() {
	   driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}

	@Then("customer gets the message")
	public void customer_gets_the_message() {
	    String currentUrl = driver.getCurrentUrl();
	    if(currentUrl.contains("login_attempt"))
	    {
	    	System.out.println("success");
	    }
	    else
	    {
	    	System.out.println("Failure");
	    }
	    driver.close();
	}


}
