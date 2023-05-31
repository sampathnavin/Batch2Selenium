package Cucumber;


import Base.TestBase;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefintion extends TestBase {
	
	LoginPage lp ; 
	
	@Given("Initialize the Browser")
	public void initialize_the_browser() {
		intilize();
	}

	@And("Launches the Appication")
	public void launches_the_appication() {
		lp = new LoginPage();
	    lp.launchapp();
	}

	@When("User Tries to Login with proper credentials")
	public void user_tries_to_login_with_proper_credentials() {
	    lp.loginvalidation();
	}

	@Then("validate user is presented in home page")
	public void validate_user_is_presented_in_home_page() {
	    lp.successvaliation();
	}

	
	

}
