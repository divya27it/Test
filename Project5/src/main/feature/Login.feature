@Test1
  Feature: Test login functionality in our application
    Scenario: Test login with valid user name and passwor
      Given open chrome browser and application
  When I enter password and username
  When click login button
  Then user    should able to login

Feature: Test login functionality in our application
      Scenario Outline: Test login with valid user name and password
        Given open chrome browser and application
        When I enter password and username
        When click login button
        Then user    should able to login

        Examples:
          |Email|Password|
          |divya@gmail.com|Btech&2019|
          |divya@gmail.com|Btech&2019|
          |divya@gmail.com|Btech&2019|
          |divya@gmail.com|Btech&2019|
          |divya@gmail.com|Btech&2019|
          |divya@gmail.com|Btech&2019|


