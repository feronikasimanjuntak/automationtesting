package stepDefinition_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Feature1_Login {
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
		driver.findElement(By.id("username")).sendKeys("suga@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("12345678");
	}
	
	@Then("I can login successfully")
	public void i_can_login_successfully() {
		driver.findElement(By.id("submit")).click();
	}

	@When("I enter invalid email and valid password")
	public void i_enter_invalid_email_and_valid_password() {
		driver.findElement(By.id("username")).sendKeys("massuga@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("12345678");
	}
	
	@When("I enter valid email and invalid password")
	public void i_enter_valid_email_and_invalid_password() {
		driver.findElement(By.id("username")).sendKeys("suga@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("12345678abcde");
	}
	
	@When("I enter valid email and empty password")
	public void i_enter_valid_email_and_empty_password() {
		driver.findElement(By.id("username")).sendKeys("massuga@gmail.com");
	}

	@Then("I cannot login succesfully")
	public void i_cannot_login_succesfully() {
		driver.findElement(By.id("submit")).click();
	}
}
