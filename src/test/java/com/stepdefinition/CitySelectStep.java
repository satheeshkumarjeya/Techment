package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.pages.CitySelectPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CitySelectStep {

	CitySelectPage city = new CitySelectPage();

	@Given("User launch the application")
	public void user_launch_the_application() {

	}

	@Given("User validate the title of the page {string}")
	public void user_validate_the_title_of_the_page(String expSuccessMsg) {
		WebElement txtWelcome = city.getTxtWelcome();
		String actSuccessMsg = txtWelcome.getText();
		Assert.assertEquals("Welcome to the Simple Travel Agency!", expSuccessMsg, actSuccessMsg);
	}

	@Given("User enter the {string} and {string}")
	public void user_enter_the_and(String from, String to) {
		city.selectCity(from, to);
	}

	@Then("User verifying success message for select city {string}")
	public void user_verifying_success_message_for_select_city(String expSuccessFlightMsg) {
		WebElement txtSelectFlight = city.getTxtSelectFlight();
		String actSuccessFlightMsg = txtSelectFlight.getText();
		Assert.assertEquals("Flights from Mexico City to New York: ", expSuccessFlightMsg, actSuccessFlightMsg);
	}

	@Given("User should choose the flight lowest price")
	public void user_should_choose_the_flight_lowest_price() {
		city.getBtnFlight().click();
		
	}

	@Then("User should verify after choosing flight success message {string}")
	public void user_should_verify_after_choosing_flight_success_message(String expFlightSuccessMsg) {
		WebElement txtFlight = city.getTxtFlight();
		String actFlightSuccessMsg = txtFlight.getText();
		Assert.assertEquals("Your flight from TLV to SFO has been reserved.", expFlightSuccessMsg, actFlightSuccessMsg);
	}





}
