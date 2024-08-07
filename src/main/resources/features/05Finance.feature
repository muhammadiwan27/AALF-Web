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

  Scenario: Enter Administrative Report Finance Page
    When User click sub tab administrative report finance
    Then User get text title page administrative report finance

  Scenario: Enter Administrative Approval Report Finance Page
    When User click sub tab administrative approval report finance
    Then User get text title page administrative approval report finance

  Scenario: Enter Administrative Approval Report Finance Page
    When User click sub tab administrative approval report finance
    Then User get text title page administrative approval report finance

  Scenario: Enter Client Page
    When User click tab client
    Then User get text title page client

  Scenario: Add Client
    When User click button add client
    And User input name of client
    And User input email client
    And User input telephone client
    And User input fax client
    And User input npwp client
    And User input address client
    And User select province client
    And User select city client
    And User select district client
    And User select subdistrict client
    And User input pic name client
    And User input telephone pic client
    And User input email pic client
    Then User save data client