package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step1 {
	
	
	WebDriver d1;
	
	@Given("Open the application in chrome browser")
	public void open_the_application_in_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	
		d1=new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver","");
		
		d1.get("");
		
		//throw new io.cucumber.java.PendingException();
	}
	@When("Enter username and password")
	public void enter_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Login to account successfully")
	public void login_to_account_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
