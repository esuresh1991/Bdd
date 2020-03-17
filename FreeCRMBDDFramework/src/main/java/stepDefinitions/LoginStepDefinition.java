package stepDefinitions;

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
	
	public void user_is_already_on_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh\\Downloads\\chromedriver_win64\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://ui.freecrm.com/");
	}
	
	
	@When("^title of login page is Free_CRM$")
	public void title_of_login_page_is_Free_CRM()
	{
	
	String title  = driver.getTitle();
	Assert.assertEquals("Cogmento CRM",title);
	
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password()  {
		driver.findElement(By.name("email")).sendKeys("esuresh1991@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("Wersdf123");
		 
	}
	
	@Then("^user clicks the login button$")
	public void user_clicks_the_login_button()  {
		 driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
	}
	@Then("^user is on home page$")
	public void user_is_on_home_page()  {
		String title  = driver.getTitle();
		Assert.assertEquals("Cogmento CRM",title);
	}  

}
