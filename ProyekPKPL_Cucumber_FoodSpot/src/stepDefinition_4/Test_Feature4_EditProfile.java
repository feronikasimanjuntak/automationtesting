package stepDefinition_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Feature4_EditProfile {
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
	
	@Then("I click profile icon")
	public void i_click_profile_icon() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"dataUserLogin\"]/img")).click();
		Thread.sleep(1000);
	}
	
	@Then("I click pengaturan akun")
	public void i_click_pengaturan_akun() {
		driver.findElement(By.xpath("//*[@id=\"datauser01\"]/div[2]/div[2]/a[1]/div")).click();
	}
	
	@Given("I click ubah")
	public void i_click_ubah() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div/div[2]/div[1]/div/div[2]/span")).click();
		Thread.sleep(1000);
	}
	
	@When("I input valid name")
	public void i_input_valid_name() {
		driver.findElement(By.xpath("//*[@id=\"myModalAkuBio\"]/div/div/div[2]/form/div[2]/div[2]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"myModalAkuBio\"]/div/div/div[2]/form/div[2]/div[2]/input")).sendKeys("agustd");
	}
	
	@Then("I can edit the profile")
	public void i_can_edit_the_profile() throws InterruptedException {
	    driver.findElement(By.xpath("//*[@id=\"myModalAkuBio\"]/div/div/div[3]/button[2]")).click();
	    Thread.sleep(1000);
	}

	@When("I dont input name")
	public void i_dont_input_name() {
		driver.findElement(By.xpath("//*[@id=\"myModalAkuBio\"]/div/div/div[2]/form/div[2]/div[2]/input")).clear();
	}
	
	@Then("I cannot edit the profile")
	public void i_cannot_edit_the_profile() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"myModalAkuBio\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(1000);
	}
}
