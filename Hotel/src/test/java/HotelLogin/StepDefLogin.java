package HotelLogin;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.HotelLoginPageFactory;

public class StepDefLogin {
	
	private WebDriver driver;
	private HotelLoginPageFactory objhlpg;
	

@Given("^User is on login page$")
public void user_is_on_login_page() throws Exception {
		driver = new FirefoxDriver();
	   //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   Thread.sleep(1000);
	   objhlpg = new HotelLoginPageFactory(driver);
	   driver.get("file:///D:/hotelBooking/login.html");
}

@Then("^check the heading of the page$")
public void check_the_heading_of_the_page() throws Exception {
	String strheading = driver.findElement(By.xpath("//*[@id='mainCnt']/div[1]/div[1]/h1")).getText();
	if(strheading.contentEquals("Hotel Booking Application")) {
		System.out.println("Heading matches");
	}
	else {
		System.out.println("Heading does not match");
	}
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 Thread.sleep(1000);
	driver.close();
}

@When("^user enters valid username,valid password$")
public void user_enters_valid_username_valid_password() throws Throwable {
	Thread.sleep(1000);
	objhlpg.setUname("capgemini");
	Thread.sleep(1000);
   objhlpg.setPfpwd("capg1234");
   //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   Thread.sleep(1000);
   objhlpg.serPflogin();
   Thread.sleep(1000);
   driver.close();
}

@Then("^navigate to hotelBooking$")
public void navigate_to_hotelBooking() throws Throwable {
	
    driver.navigate().to("file:///D:/hotelBooking/hotelbooking.html");
    //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
    driver.close();
}

@When("^user does not enter either username or password$")
public void user_does_not_enter_either_username_or_password() throws Throwable {
	
	objhlpg.setUname("");
    Thread.sleep(1000);
}

@When("^clicks the login Button$")
public void clicks_the_login_Button() throws Throwable {
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	objhlpg.serPflogin();
   
}

@Then("^display appropriate message$")
public void display_appropriate_message() throws Throwable {
	String strheading = driver.findElement(By.xpath("//*[@id='userErrMsg']")).getText();
    
    assertEquals(strheading,"* Please enter userName.");
    
    
}

@When("^user enters incorrect username or password$")
public void user_enters_incorrect_username_or_password() throws Throwable {
	
	objhlpg.setUname("capg");
	Thread.sleep(1000);
    objhlpg.setPfpwd("capg123");
    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    objhlpg.serPflogin();
    
    
}

@Then("^display login failed message$")
public void display_login_failed_message() throws Throwable {
	driver.switchTo().alert();
	   Thread.sleep(1000);
	   driver.switchTo().alert().accept();
	   
	   driver.close();
}


	}



