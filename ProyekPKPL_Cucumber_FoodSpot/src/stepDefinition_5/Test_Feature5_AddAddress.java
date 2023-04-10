package stepDefinition_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Feature5_AddAddress {
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
	@Then("I click pengaturan alamat")
	public void i_click_pengaturan_alamat() {
		driver.findElement(By.xpath("//*[@id=\"datauser01\"]/div[2]/div[2]/a[2]/div")).click();
	}
	
	@Given("I click button tambah")
	public void i_click_button_tambah() throws InterruptedException {
		driver.findElement(By.id("tambah_alamat")).click();
		Thread.sleep(1000);
	}
	
	@When("I input to all field")
	public void i_input_to_all_field() throws InterruptedException {
	    driver.findElement(By.name("addr_tag")).sendKeys("Kantor");
	    driver.findElement(By.name("addr_phone")).sendKeys("+62 01234");
	    driver.findElement(By.name("addr_contact_name")).sendKeys("Agust D");
	    driver.findElement(By.name("addr_building")).sendKeys("Jalan Nasution");
	    driver.findElement(By.name("addr_content")).sendKeys("Jalan Nasution, Jakarta Barat, Jakarta");
	    Thread.sleep(1000);
	}
		
	@Then("I can add new address")
	public void i_can_add_new_address() throws InterruptedException {
	    driver.findElement(By.id("tambahalamatbtn")).click();
	    Thread.sleep(1000);
	}
	
	@When("I dont input to tipe alamat field")
	public void i_dont_input_to_tipe_alamat_field() throws InterruptedException {
	    driver.findElement(By.name("addr_phone")).sendKeys("+62 01234");
	    driver.findElement(By.name("addr_contact_name")).sendKeys("Agust D");
	    driver.findElement(By.name("addr_building")).sendKeys("Jalan Nasution");
	    driver.findElement(By.name("addr_content")).sendKeys("Jalan Nasution, Jakarta Barat, Jakarta");
	    Thread.sleep(1000);
	}
	
	@When("I dont input to nomor telepon field")
	public void i_dont_input_to_nomor_telepon_field() throws InterruptedException {
	    driver.findElement(By.name("addr_tag")).sendKeys("Kantor");
	    driver.findElement(By.name("addr_contact_name")).sendKeys("Agust D");
	    driver.findElement(By.name("addr_building")).sendKeys("Jalan Nasution");
	    driver.findElement(By.name("addr_content")).sendKeys("Jalan Nasution, Jakarta Barat, Jakarta");
	    Thread.sleep(1000);
	}

	@When("I dont input to nama penerima field")
	public void i_dont_input_to_nama_penerima_field() throws InterruptedException {
	    driver.findElement(By.name("addr_tag")).sendKeys("Kantor");
	    driver.findElement(By.name("addr_phone")).sendKeys("+62 01234");
	    driver.findElement(By.name("addr_building")).sendKeys("Jalan Nasution");
	    driver.findElement(By.name("addr_content")).sendKeys("Jalan Nasution, Jakarta Barat, Jakarta");
	    Thread.sleep(1000);
	}
	
	@When("I dont input to nama gedung field")
	public void i_dont_input_to_nama_gedung_field() throws InterruptedException {
	    driver.findElement(By.name("addr_tag")).sendKeys("Kantor");
	    driver.findElement(By.name("addr_phone")).sendKeys("+62 01234");
	    driver.findElement(By.name("addr_contact_name")).sendKeys("Agust D");
	    driver.findElement(By.name("addr_content")).sendKeys("Jalan Nasution, Jakarta Barat, Jakarta");
	    Thread.sleep(1000);
	}
	
	@When("I dont input to alamat lengkap field")
	public void i_dont_input_to_alamat_lengkap_field() throws InterruptedException {
	    driver.findElement(By.name("addr_tag")).sendKeys("Kantor");
	    driver.findElement(By.name("addr_phone")).sendKeys("+62 01234");
	    driver.findElement(By.name("addr_contact_name")).sendKeys("Agust D");
	    driver.findElement(By.name("addr_building")).sendKeys("Jalan Nasution");
	    Thread.sleep(1000);
	}
	
	@Then("I cannot add new address")
	public void i_cannot_add_new_address() throws InterruptedException {
		driver.findElement(By.id("tambahalamatbtn")).click();
	    Thread.sleep(1000);
	}

}
