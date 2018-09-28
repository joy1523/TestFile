package org.cucum;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {
	static WebDriver driver;
	@Given("^The user is in guru homepage$")
	public void the_user_is_in_guru_homepage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ebenezer\\workspace\\NewCucumber\\CucumberNew\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://www.demo.guru99.com/v4/");
		
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@When("^the user enters username$")
	public void the_user_enters_username() {
		driver.findElement(By.name("uid")).sendKeys("test");
	   
	}

	@When("^the user enter password$")
	public void the_user_enter_password() {
		driver.findElement(By.name("password")).sendKeys("pass");

	}

	@When("^the user click rset button$")
	public void the_user_click_rset_button() {
		WebElement btnReset=driver.findElement(By.name("btnReset"));
		btnReset.click();
 
	}

	@Then("^The user see the fields are empty$")
	public void the_user_see_the_fields_are_empty() {
	   System.out.println("hello");
	}



}
