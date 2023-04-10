package stepDefinition_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Feature3_SearchByCategory {
	WebDriver driver;

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
	
  	@Then("I click icon {string}")
  	public void i_click_icon(String string) {
		driver.findElement(By.xpath("/html/body/section[1]/div[3]/div[1]/div/div/div[1]/div/div/div/a[2]/div/div/div/div[1]/img")).click();
	}
	
  	@When("I click {string} field")
  	public void i_click_field(String string) {
		driver.findElement(By.xpath("//*[@id=\"filterhide\"]/form/div[3]/div[2]")).click();
	}
	
  	@Then("I choose {string} and {string} destination")
  	public void i_choose_and_destination(String string, String string2) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"10\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"138\"] ")).click();
	}
	
  	@Then("I click {string} to sort the product")
  	public void i_click_to_sort_the_product(String string) {
		driver.findElement(By.xpath("//*[@id=\"sortby\"]/option[3]")).click();
	}
  	
  	@Then("I can search by category successfully")
  	public void i_can_search_by_category_successfully() {
		driver.findElement(By.name("sidecaribtn")).click();
	}
  	
}
