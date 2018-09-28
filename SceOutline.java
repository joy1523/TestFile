package org.cucum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SceOutline {
	static WebDriver driver;

@Given("^The user in guru home page$")
public void the_user_in_guru_home_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ebenezer\\workspace\\NewCucumber\\CucumberNew\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://www.demo.guru99.com/v4/");
		
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);	    throw new PendingException();
	}

	@When("^The user logged in as manager with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_logged_in_as_manager_with_and(String manid, String manpass) {
		driver.findElement(By.name("uid")).sendKeys(manid);
		driver.findElement(By.name("password")).sendKeys("pass");
		driver.findElement(By.name("btnReset")).click();
	     throw new PendingException();
	}

	@When("^The user enters add customer page$")
	public void the_user_enters_add_customer_page() {
		driver.findElement(By.xpath("//a[text()='New Customer']")).click();
	    throw new PendingException();
	}

	@When("^The user enters the customer details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_the_customer_details_and(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10) {
		driver.findElement(By.name("name"));
		driver.findElement(By.xpath("//input[@value='f']"));
		driver.findElement(By.name("dob"));
		driver.findElement(By.xpath("//textarea[@name='addr']"));
		driver.findElement(By.name("city"));
		driver.findElement(By.name("state"));
		driver.findElement(By.name("pinno")); 
		driver.findElement(By.name("telephoneno"));
		driver.findElement(By.name("emailid"));
		driver.findElement(By.name("password"));
			
		throw new PendingException();
	}

	@When("^The user clicks submit button$")
	public void the_user_clicks_submit_button() {
		driver.findElement(By.name("sub")).click();
		throw new PendingException();
	}

	@Then("^The user is successfully registered$")
	public void the_user_is_successfully_registered() {
		String s=driver.findElement(By.className("heading3")).getText();
		System.out.println(s);
	    throw new PendingException();
	}

	@When("^The user clicks Edit Customer option and enter custid$")
	public void the_user_clicks_Edit_Customer_option_and_enter_custid() {
driver.findElement(By.xpath("//a[text()='Edit Customer']")).click();
WebElement r=driver.findElement(By.name("cusid"));
r.sendKeys("joy");
System.out.println("Characters not allowed");


throw new PendingException();
	}

	@Then("^The user can edit the details$")
	public void the_user_can_edit_the_details() {
driver.findElement(By.name("AccSubmit")).click();
throw new PendingException();
	}

	@When("^The user clicks delete customer option and enter custid$")
	public void the_user_clicks_delete_customer_option_and_enter_custid() {
driver.findElement(By.xpath("//a[text()='Delete Customer']")).click();
WebElement r1=driver.findElement(By.name("cusid"));
r1.sendKeys("joy");
System.out.println("Characters not allowed");

throw new PendingException();
	}

	@Then("^The user details can be deleted$")
	public void the_user_details_can_be_deleted() {
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
System.out.println("user is deleted");   
throw new PendingException();


	}


	

}
