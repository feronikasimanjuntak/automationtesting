package stepDefinition_2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Feature2_Search {
	WebDriver driver;
	JavascriptExecutor js;
	
	@Given("open chrome and start application")
	public void open_chrome_and_start_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	    
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://foodspot.co.id/login");
	}
	
	@When("I enter valid email and valid password")
  	public void i_enter_valid_email_and_valid_password() {
  		driver.findElement(By.id("username")).sendKeys("testingpkpl@gmail.com");
  	    driver.findElement(By.id("password")).sendKeys("12345678");
  	}
  	
  	@Then("I can login successfully")
  	public void i_can_login_successfully() {
  		driver.findElement(By.id("submit")).click();
  	}
	
  	@When("I type the keyword to be search")
  	public void i_type_the_keyword_to_be_search() {
		driver.findElement(By.xpath("//*[@id=\"click_input_menu1\"]")).sendKeys("kopi");
	}
	
  	@When("click {string} bar to choose range price")
  	public void click_bar_to_choose_range_price(String string) {
		driver.findElement(By.xpath("//*[@id=\"price_range\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"price_range\"]/option[3]")).click();
	}
	
  	@Then("I can search successfully")
  	public void i_can_search_successfully() {
		driver.findElement(By.id("dontmove")).click();
	}
	
  	@When("I dont type the keyword to be search")
  	public void i_dont_type_the_keyword_to_be_search() {
		
	}
  	
  	@Then("I cannot search successfully")
  	public void i_cannot_search_successfully() {
  		driver.findElement(By.id("dontmove")).click();
	}

}
