@Yahoo
Feature: Ensure user Log in to the Yahoo account and select the calender event

  As a customer
  I want to login to Yahoo with my credentials
  So I can select my calender event

  @yahoo
  Scenario: To Login the Yahoo account
    Given Launch the Yahoo web site
    When The user Signin with credentials
    Then Enter email and password
    And  Verify user has successfully login with the provided email
    And  Log out from the account

  @yahoo
  Scenario: To verify the Market data tab calender functionality
    Given Launch the Yahoo web site
    When The user Signin with credentials
    Then Enter email and password
    And Click on the Finance tab
    And then click on the MarketData tab
    And then Capture the calender event option
    And Verify the values for the date captured



