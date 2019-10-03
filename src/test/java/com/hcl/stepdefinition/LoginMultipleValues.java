package com.hcl.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginMultipleValues {
	public static WebDriver driver;
	@Given("The user is in FB  login page")
	public void the_user_is_in_FB_login_page() {
		System.setProperty("webdriver.chrome.driver", "F:\\Velmurugan\\JAVA\\eclipse-java-oxygen-3a-win32-x86_64\\eclipse\\GitThirdDay\\CucumberDay1\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@When("The user enters the username and password {string},{string}")
	public void the_user_enters_the_username_and_password(String a, String a1) {
		driver.findElement(By.id("email")).sendKeys(a);
		  driver.findElement(By.id("pass")).sendKeys(a1);
	}

	@When("The user clicks the login button")
	public void the_user_clicks_the_login_button() {
		 driver.findElement(By.xpath("//input[@value='Log In']")).click();

	}
	@Then("The user navigates into home page")
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
