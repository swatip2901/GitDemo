package stepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class LoginstepDefination {
	
	@Given("^user credes are proper$")
	public void testfunc() {
		System.out.println("testfunc Given");
	}
	
	@When("^credes are enetered$")
	public void testfunc1() {
		System.out.println("testfunc1 When");
	}
	
	@Then("^user login is successful$")
	public void testfunc2() {
		System.out.println("testfunc2 Then");
	}

}
