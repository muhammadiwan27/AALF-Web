Feature: Document Page Test
  Scenario: Enter Document Dashboard Page
    When User click tab document
    Then User get text title page document dashboard

  Scenario: Enter Document Report Page
    When User click tab document report
    Then User get text title page document report

  Scenario: Download Document Master Document Number Report
    When User select month document master document number report
    Then User click button excel document master document number report

  Scenario: Enter Document Number Page
    When User click tab document number
    Then User get text title page document number

  Scenario: Create Document Number
    When User click button create document number
    And User input master document name document number
    And User input format document number document number
    Then User save document number data

  Scenario: Edit Document Number Data
    When User click button edit document number
    And User edit master document name document number
    Then User save edit document number data

  Scenario: Delete Document Number
    When User click button delete document number
    Then User click button confirm delete document number

  Scenario: Enter List Document Page
    When User click tab list document
    Then User get text title page list document page

  Scenario: Create List Document
    When User click button create list document
    And User choose master document name list document
    And User input document name list document
    Then User save list document data

  Scenario: Upload document List Document
    When User click button upload list document
    And User choose file upload document list document
    Then User upload document list document

  Scenario: Edit List Document Data
    When User click button edit list document
    And User edit upload new document list document
    Then User save edit list document data

  Scenario: Delete List Document
    When User click button delete list document
    Then User click button confirm delete list document
