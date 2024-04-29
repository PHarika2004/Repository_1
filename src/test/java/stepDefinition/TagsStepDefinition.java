package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsStepDefinition {
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
	    // Write code here that turns the phrase aboveinto concrete actions
	   System.out.println("user is on login page");
	
	}
	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String un, String pass) {
	   System.out.println("user enter the valid data");
	}
	@And("Click on login button")
	public void click_on_login_button() {
	System.out.println("user click on login button");
	}
	@Then("user should navigate to homepage")
	public void user_should_navigate_to_homepage() {
	   System.out.println("user is on Home page");
	}
	}


	
}
