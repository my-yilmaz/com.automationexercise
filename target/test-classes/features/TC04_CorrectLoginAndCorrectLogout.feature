@logout
Feature: TC04 Correct login and correct logout
  Scenario: TC04 Must be able to enter and exit correctly
    Given Navigate to url "automationexerciseUrl"
    * Verify that home page is visible successfully
    * Click on Signup Login button
    * Verify Login to your account is visible
    * Enter "e-mail" and "password"
    * Click login button
    * Verify that Logged in as username is visible
    *  Click Logout button
    * Verify that user is navigated to login page