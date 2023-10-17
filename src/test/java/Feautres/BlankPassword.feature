Feature: User login with blank password

  Scenario: User tries to log in with a blank password
    Given the user is on the login page
    When the user enters the email 
    And the user leaves the password field blank
    And the user submits the form
    Then the system should validate the password field

