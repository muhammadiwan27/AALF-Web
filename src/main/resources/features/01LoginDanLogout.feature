Feature: Login Dan Logout Page Test
  Scenario: Login Valid Functionality Test
    Given User enter url AALF
    When User enter valid username
    And User enter valid password
    And User click button login
    Then User get text title page profile

  Scenario: Login Invalid Functionality Test
    When User enter invalid username
    And User enter invalid password
    And User click button login
    Then User get text invalid credentials