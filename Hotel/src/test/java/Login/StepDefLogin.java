package Login;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import LoginClass.BeanLogin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefLogin {
	
	private BeanLogin obj;
	
	@Given("^Login page is displayed and user already has login credentials$")
	public void login_page_is_displayed_and_user_already_has_login_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		obj = new BeanLogin("alpha","admin", 17);
	}

	@When("^User enters valid username and password and clicks on login button$")
	public void user_enters_valid_username_and_password_and_clicks_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(obj.getUname(), "alpha");
	}

	@Then("^Welcome message is displayed$")
	public void welcome_message_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}
	
	@When("^User enters valid username$")
	public void user_enters_valid_username() throws Throwable {
		assertEquals(obj.getUname(), "alpha");

	}

	@When("^User enters null password$")
	public void user_enters_null_password() throws Throwable {
	   assertNull(obj.getPass());
	}

	@Then("^error message is displayed$")
	public void error_message_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
	}
	
	@When("^user enters (\\d+)$")
	public void user_enters(int arg1) throws Throwable {
	    if(obj.getAge()>=18)
	    	System.out.println("valid age");
	    else
	    	System.out.println("invalid age");
	
	}

	@Then("^Check age and registration is possible if age > (\\d+)$")
	public void check_age_and_registration_is_possible_if_age(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}


}
