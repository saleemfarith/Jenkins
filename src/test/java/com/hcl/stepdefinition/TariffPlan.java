package com.hcl.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TariffPlan {
	public static WebDriver driver;

	@Given("Customer opens tarrif plan page")
	public void customer_opens_tarrif_plan_page() {
	   System.setProperty("webdriver.chrome.driver", "F:\\Velmurugan\\JAVA\\eclipse-java-oxygen-3a-win32-x86_64\\eclipse\\GitThirdDay\\CucumberDay1\\drivers\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("http://demo.guru99.com/telecom/index.html");
	   driver.manage().window().maximize();
	   driver.findElement(By.xpath("(//a[text()=\"Add Customer\"])[1]")).click();;
	}
	@When("Customer enters all the details")
	public void customer_enters_all_the_details() throws InterruptedException {
	   driver.findElement(By.xpath("//label[text()='Done']")).click();
	   driver.findElement(By.id("fname")).sendKeys("Renu");
	   driver.findElement(By.id("lname")).sendKeys("pavi");
	   driver.findElement(By.id("email")).sendKeys("renugft@gmail.com");
	   driver.findElement(By.id("telephoneno")).sendKeys("9876543212");
	}

	@When("Customer clicks submit button")
	public void customer_clicks_submit_button() {
	   driver.findElement(By.name("submit")).click();
	}

	@Then("Customers gets the ID")
	public void customers_gets_the_ID() {
	  
	}


}
