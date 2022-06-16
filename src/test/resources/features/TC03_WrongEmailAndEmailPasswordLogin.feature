@wrongs
Feature: TC03 Unable to login with wrong email and wrong password
  Scenario: TC03  Wrong email anda Wrong password
    Given Navigate to url "automationexerciseUrl"
    * Verify that home page is visible successfully
    * Click on Signup Login button
    * Verify Login to your account is visible
    * Enter "wrongEmail" and "wrongPassword"
    * Click login button
    * Verify Your email or password is incorrect! is visible