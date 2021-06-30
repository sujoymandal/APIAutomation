package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	
	
	@Given("User on login page")
	public void user_on_login_page() {
	    
		System.out.println("User on login page!!");
	}

	@When("User enters user {string} and {string}")
	public void user_enters_user_and(String string, String string2) {
	  
		System.out.println(string);
		System.out.println(string2);
	}

	@When("click on login button")
	public void click_on_login_button() {
	    
		System.out.println("Click on the login button!!");
	}

	@Then("User logged in {string}")
	public void user_logged_in(String string) {
	   
		System.out.println(string);
	}

}
