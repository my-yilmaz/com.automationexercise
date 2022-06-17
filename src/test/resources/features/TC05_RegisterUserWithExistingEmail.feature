Feature: Register User with existing email
  @try
  Scenario: TC05 Already register try to sign-up


    Given Navigate to url "automationexerciseUrl"
    And Verify that home page is visible successfully
    And Click on Signup Login button
    And Verify New User Signup! is visible
    And Enter "username" and already registered "e-mail"
    And Click Signup button
    Then Verify error Email Address already exist! is visible
