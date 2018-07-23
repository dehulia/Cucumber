package com.vi.cucumber.Test;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	
	@Given("^A user is on google\\.com$")
	public void a_user_is_on_google_com() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("1");
	}
	
	@When("^User clicks on MyAccount link$")
	public void user_clicks_on_MyAccount_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("2");
	}
	
	@Then("^User is taken to Login page$")
	public void user_is_taken_to_Login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("3");
	}
	
	@When("^User enters a valid username and password$")
	public void user_enters_a_valid_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("4");
	}
	
	@Then("^User is able to login sucessfully$")
	public void user_is_able_to_login_sucessfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("5");
	}
	
}
