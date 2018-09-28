package org.cucum;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazon {
static WebDriver driver;
	
	@Given("^The user is in Amazon home page$")
	public void the_user_is_in_Amazon_home_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ebenezer\\workspace\\NewCucumber\\CucumberNew\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	   
	}

	@When("^The user select dropdown list and choose book option$")
	public void the_user_select_dropdown_list_and_choose_book_option() throws InterruptedException {
		Thread.sleep(3000);
		WebElement book=driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(book);
		s.selectByVisibleText("Books");
    
	}

	@When("^The user search data catalog$")
	public void the_user_search_data_catalog() {
		WebElement r=driver.findElement(By.id("twotabsearchtextbox"));
		r.sendKeys("data catalog");
	    r.click();
	   
	}

	@When("^The user selects the first book displayed$")
	public void the_user_selects_the_first_book_displayed() {
		WebElement r1=driver.findElement(By.xpath("(//img[@class='s-access-image cfMarker'])[1]"));
	    System.out.println(r1);
   
	}

	@Then("^The user prints the details of the book$")
	public void the_user_prints_the_details_of_the_book() {
		WebElement web1=driver.findElement(By.xpath("(//h3[text()='Paperback'])[1]"));
		System.out.println(web1);
		WebElement web2=driver.findElement(By.xpath("(//span[@class='sx-price-whole'])[1]"));
		System.out.println(web2);
		WebElement web3=driver.findElement(By.xpath("(//h3[@class='a-size-small s-inline  a-text-normal'])[1]"));
		System.out.println(web3);
	    
	}


}
