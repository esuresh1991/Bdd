//package stepDefinitions;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class DealsStepDefinition {
//
//	public static WebDriver driver;
//
//	@Given("^user is Already on login page$")
//
//	public void user_is_Already_on_login_page() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Suresh\\Downloads\\chromedriver_win64\\chromedriver.exe");
//		driver = new ChromeDriver();
//
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.get("https://ui.freecrm.com/");
//	}
//
//	@When("^Title of login page is Free_CRM$")
//	public void Title_of_login_page_is_Free_CRM() {
//
//		String title = driver.getTitle();
//		Assert.assertEquals("Cogmento CRM", title);
//
//	}
//	
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password(DataTable credentials){
//		List<List<String>> data = credentials.raw();
//	 driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
//	 driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//	 
//	
//	}
//	
//	@Then("^user clicks on login button$")
//	public void user_clicks_the_login_button() {
//		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
//
//	}
//	
//	 @Then("^user is on Home page$") 
//	 public void user_is_on_Home_page() { 
//		 String title = driver.getTitle(); Assert.assertEquals("Cogmento CRM",title); 
//		 
//	 }
//	 
//	 @Then("^user moves to new deal page$")
//	 public void user_moves_to_new_deal_page()  {
//	     // Write code here that turns the phrase above into concrete actions
//		
//		 driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
//		driver.findElement(By.xpath("//i[@class='edit icon']")).click();
//	 }
//	
//	 @Then("^user enters deal details")
//	 public void user_enters_deal_details(DataTable dealData){
//			List<List<String>> dealValues = dealData.raw();
//			 driver.findElement(By.name("title")).sendKeys(dealValues.get(0).get(0));
//			 driver.findElement(By.name("amount")).sendKeys(dealValues.get(0).get(1));
//			 driver.findElement(By.name("probability")).sendKeys(dealValues.get(0).get(2));
//			 driver.findElement(By.name("commission")).sendKeys(dealValues.get(0).get(3));
//			 driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
//			 
//		 
//		 
//	 }
//	
//		@Then("^Close the browser$")
//		public void Close_the_browser() {
//		    // Write code here that turns the phrase above into concrete actions
//			driver.quit();
//		}
//	 
//	
//}
