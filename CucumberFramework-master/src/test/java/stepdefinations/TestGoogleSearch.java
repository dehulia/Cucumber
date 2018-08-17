package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Hook;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class TestGoogleSearch {

	//private WebDriver driver;
	
	public TestGoogleSearch() {
		//this.driver = Hook.getDriver();
	}

@Given("^I open a browser$")
public void i_open_a_browser() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Testing Scenario 1 Test 1 " );
	Response resp = RestAssured.get("http://localhost:8080/mock/webapi/messages");
	
	int code=resp.getStatusCode();
	
	Assert.assertEquals(code, 200);
	
	System.out.println("JSON Output : "+resp.jsonPath().get().toString());
	
	System.out.println("Assert Response code : " + code);
	
}

@When("^I navigate to google page$")
public void i_navigate_to_google_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println("Testing Scenario 1 Test 2 " );
	
	Response resp = RestAssured.get("http://localhost:8080/rest/");
	
	int code=resp.getStatusCode();
	
	Assert.assertEquals(code, 200);
	
	
	System.out.println("Assert Response code : " + code);
}

@Then("^I validate the search text field$")
public void i_validate_the_search_text_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Testing Scenario 1 Test 3 " );
	int code=0;
	
	try{
		Response resp = RestAssured.get("http://localhost:8080/rest1/");
	    code=resp.getStatusCode();
	    Assert.assertEquals(code, 200);
	}/*catch(java.lang.AssertionError e){
		Assert.assertEquals(code, 404);
		System.out.println("Assert Response AssertionError code : " + code);
	}*/
	catch(cucumber.runtime.CucumberException e){
		Assert.assertEquals(code, 404);
		System.out.println("Assert Response code CucumberException code : " + code);
	}catch (Exception e){
		System.out.println("Assert Response code Error code : " + code);
	}
	
	System.out.println("Assert Response code : " + code);
}



@Given("^I found browser with x data$")
public void i_found_browser_with_x_data() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Testing Scenario 2 step 1 : Success ");
}

@When("^I navigate to google page to find y site$")
public void i_navigate_to_google_page_to_find_y_site() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Testing Scenario 2 step 2 : Success ");
}

@Then("^I validate the search text field with z input$")
public void i_validate_the_search_text_field_with_z_input() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Testing Scenario 2 step 3 : Success ");
}




}
