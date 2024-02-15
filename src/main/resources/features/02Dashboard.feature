Feature: Dashboard Page Test
  Scenario: Dashboard Valid Functionality Test
    When User get text title page dashboard

  Scenario: Search Task & Team Activity Graphs By Date
    When User input on the search bar start date task activity
    And User input on the search bar end date task activity
    Then User click button apply search bar task activity graphs

  Scenario: Search HO Team Graphs By Date
    When User input on the search bar start date ho team
    And User input on the search bar end date ho team
    Then User click button apply search bar ho team graphs