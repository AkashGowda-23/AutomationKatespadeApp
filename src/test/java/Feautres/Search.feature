Feature: Search for a Product

  Scenario: User searches for a product
    Given the user is on the homepage
    When the user searches for a product 
    And the user selects a product from the search results
    Then the user should see the details of the selected product
