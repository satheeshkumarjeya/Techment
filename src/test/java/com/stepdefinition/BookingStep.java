package com.stepdefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.pages.BookingPage;

import io.cucumber.java.en.*;

public class BookingStep {
	
	BookingPage book = new BookingPage();

	@Given("User should perform booking flight")
	public void user_should_perform_booking_flight() throws IOException {
		book.BookFlight();
		
	}
	
	@Then("User should verify after booking success message {string}")
	public void user_should_verify_after_booking_success_message(String expSuccessMsg) {
		WebElement txtBookingSuccess = book.getTxtBookingSuccess();
		String actSuccessMsg = txtBookingSuccess.getText();
		Assert.assertEquals("Thank you for your purchase today!", expSuccessMsg, actSuccessMsg);
		
	}




}
