Feature:Login Functionality

  Scenario:Login with valid email and password
    Given I open the NopCommerce application
    When I enter a valid email and password
    And I click the login button
    Then I should be able to log in without any errors

  Scenario:Login with an invalid email and password
    Given I open the NopCommerce application
    When I enter a non-registered email and an invalid password
    And I click the login button
    Then I should see an error message "Email not found"

  Scenario:Login without entering an email and password
    When I open the NopCommerce application
    And I click the login button without entering an email and password
    Then I should see a validation error message