Feature: Finance Page Test
  Scenario: Enter Finance Page
    When User click tab finance
    Then User get text title page finance

  Scenario: Enter HO Report Finance Page
    When User click tab ho report finance
    Then User get text title page ho report finance

  Scenario: Enter Task & Activity Report Finance Page
    When User click sub tab task activity report finance
    Then User get text title page task activity report finance

  Scenario: Enter Client Report Finance Page
    When User click sub tab client report finance
    Then User get text title page client report finance