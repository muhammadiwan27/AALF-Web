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

  Scenario: Edit Client
    When User click button edit client
    And User edit email client
    Then User save edit data client

  Scenario: Delete Client
    When User click button delete client
    Then User click button confirm delete client

  Scenario: Enter HO Completed Page
    When User click tab ho completed
    Then User get text title page ho completed

  Scenario: View HO Completed Page
    When User click button view ho completed
    And User get text title page view ho completed
    Then User back to ho completed page

  Scenario: Enter Finance Document Page
    When User click tab finance document
    Then User get text title page finance document

  Scenario: Create Finance Document Number
    When User click button create finance document number
    And User input finance master document name
    And User input finance format document number
    Then User save data finance document number

  Scenario: Edit Finance Document Number
    When User click icon edit finance document number
    And User edit finance master document name
    Then User save edit data finance document number

  Scenario: Delete Finance Document Number
    When User click button delete finance document number
    Then User click button confirm delete finance document number

  Scenario: Enter Finance List Document Page
    When User click tab finance list document
    Then User get text title page finance list document

  Scenario: Create Finance List Document
    When User click button create finance list document
    And User select master document name finance list document
    And User input document name finance list document
    Then User save data finance list document

  Scenario: Upload document Finance List Document
    When User click button upload document finance list Document
    And User click button choose file finance list document
    Then User save upload document finance list document

  Scenario: Edit Finance List Document
    When User click icon edit finance list document
    And User edit document name finance list document
    Then User save edit data finance list document

  Scenario: Delete Finance List Document
    When User click button delete finance list document
    Then User click button confirm delete finance list document

  Scenario: Enter Finance Payroll Page
    When User click tab finance payroll
    Then User get text title page finance payroll

  Scenario: Create Finance Payroll Periode
    When User click button create finance payroll periode
    And User select month finance payroll periode
    And User input first date finance payroll periode
    And User input end date finance payroll periode
    And User input work days finance payroll periode
    Then User save data finance payroll periode

  Scenario: Enter Finance Detail Periode Payroll
    When User click icon edit payroll periode
    Then User get text title page detail periode payroll
