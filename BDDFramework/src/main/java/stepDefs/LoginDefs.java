package stepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginDefs {
	@Given("Launch application url")
	public void launch_application_url() {
		 System.out.println("launch_application_url");
	}

	@When("user enters the {int} and {int}")
	public void user_enters_the_and(int int1, int int2) {
	    System.out.println(int1+" - "+int2);
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("user_will_be_able_to_login_to_the_application");
	}

	@Then("user will be able to login to the application")
	public void user_will_be_able_to_login_to_the_application() {
	   System.out.println("user_will_be_able_to_login_to_the_application");
	}

}
