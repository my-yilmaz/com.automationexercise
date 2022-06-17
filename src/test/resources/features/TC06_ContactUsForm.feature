Feature: Contact Us Form
@contact
  Scenario: TC06 Contact us form

    Given Navigate to url "automationexerciseUrl"
    Then Verify that home page is visible successfully
    When Click on Contact Us button
    And Verify GET IN TOUCH is visible
    And Enter name, email, subject and message
    And Upload file
    Then Click Submit button
    Then Click OK button
    Then Verify success message Success! Your details have been submitted successfully. is visible
    Then Click Home button and verify that landed to home page successfully






