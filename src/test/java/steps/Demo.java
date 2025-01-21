package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo 
{
	@Given("User on landing page")
	public void user_on_landing_page() {
	   System.out.println("User Should on the landing page");
	}

	@When("Verify the input field")
	public void verify_the_input_field() {
		System.out.println("Enter the mobile no ");
	    
	}

	@Then("The otp page should be displayed")
	public void the_otp_page_should_be_displayed() {
	    System.out.println("Otp Screen Should be displayed");
	}


}
