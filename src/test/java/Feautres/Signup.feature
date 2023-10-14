Feature: Sign Up

  Scenario: User can sign up with valid information
    Given the user is on the signup page
    When the user provides valid first name, last name, email, password, phone number, and captcha
    And clicks the Submit button
    Then the user should be successfully registered