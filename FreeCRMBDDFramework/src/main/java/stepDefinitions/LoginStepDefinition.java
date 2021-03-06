package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	public static WebDriver driver;

	@Given("^user is already on login page$")

	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suresh\\Downloads\\chromedriver_win64\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/");
	}

	@When("^title of login page is Free_CRM$")
	public void title_of_login_page_is_Free_CRM() {

		String title = driver.getTitle();
		Assert.assertEquals("Cogmento CRM", title);

	}
		
	//Reg Exp:
	//1. \"([^\"]*)\"
	//2. \"(.*)\"

	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);

	}

	@Then("^user clicks the login button$")
	public void user_clicks_the_login_button() {
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

	}
	
	 @Then("^user is on home page$") public void user_is_on_home_page() { 
		 String title = driver.getTitle(); Assert.assertEquals("Cogmento CRM",title); 
		 
	 }
	 
	 
	 @Then("^user moves to new contact page$")
	 public void user_moves_to_new_contact_page()  {
	     // Write code here that turns the phrase above into concrete actions
		
		 driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
	 }

	 @Then("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	 public void user_enters_contact_details(String FN, String LN, String Postion) {
	     // Write code here that turns the phrase above into concrete actions
	  
		 driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(FN);
		 driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(LN);
		 driver.findElement(By.xpath("//input[@name='position']")).sendKeys(Postion);
		 driver.findElement(By.xpath("//i[@class='save icon']")).click();
		 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		 
		 
	 }
	
		@Then("^close the browser$")
		public void close_the_browser() {
		    // Write code here that turns the phrase above into concrete actions
			driver.quit();
		}
	 
}
