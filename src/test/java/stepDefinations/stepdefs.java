package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefs {

	@Given("^user logonto application$")
	public void userLogOn(){
		System.out.println("fasak");
	}
	@When("^user lands$")
	public void user_lands() throws Throwable {
	    
	}

	@Then("^views title$")
	public void views_title() throws Throwable {
	    
	}
}
