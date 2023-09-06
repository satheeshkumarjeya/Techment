@Booking
Feature: 
  Testcases for Blazedemo flight booking

  Background: 
    Given User launch the application

  Scenario Outline: Verifying city select
    And User validate the title of the page "Welcome to the Simple Travel Agency!"
    Given User enter the "<srcCity>" and "<DestinationCity>"
    Then User verifying success message for select city "Flights from Mexico City to London:"
    Given User should choose the flight lowest price
    Then User should verify after choosing flight success message "Your flight from TLV to SFO has been reserved."
    Given User should perform booking flight
    Then User should verify after booking success message "Thank you for your purchase today!"

    Examples: 
      | srcCity     | DestinationCity |
      | Mexico City | London          |
