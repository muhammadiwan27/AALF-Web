Feature: Finance Page Test
  Scenario: Enter Finance Page
    When User click tab finance
    Then User get text title page finance

  Scenario: Enter HO Report Finance Page
    When User click tab ho report finance
    Then User get text title page ho report finance

  Scenario: Enter Task Activity Report Finance Page
    When User click sub tab task activity report finance
    Then User get text title page task activity report finance

  Scenario: Enter Task Activity Summary Report Finance Page
    When User click sub tab task activity summary report finance
    Then User get text title page task activity summary report finance

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

  Scenario: Enter HO Reimbursement Finance Page
    When User click sub tab ho reimbursement report finance
    Then User get text title page ho reimbursement report finance

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

  Scenario: Edit Finance Payroll Employee
    When User click icon edit finance payroll employee
    And User add document other allowances finance payroll employee
    Then User save edit data finance payroll employee

  Scenario: Delete Finance Payroll Periode
    When User click button delete payroll periode
    Then User click button confirm delete payroll periode

  Scenario: Enter Finance Reimbursement Page
    When User click tab finance reimbursement
    Then User get text title page finance reimbursement

  Scenario: Create Finance Reimbursement
    When User click button create finance reimbursement
    And User select date finance reimbursement
    And User input note finance reimbursement
    And User select member on duty finance reimbursement
    And User input list of expenses finance reimbursement
    And User input amount finance reimbursement
    And User add receipt finance reimbursement
    Then User save data finance reimbursement

  Scenario: Edit Finance Reimbursement
    When User click icon edit finance reimbursement
    And User edit note finance reimbursement
    Then User save edit data finance reimbursement

  Scenario: View Finance Payment
    When User click button view finance payment

  Scenario: Approval Finance Reimbursement
    When User click button approval finance reimbursement
    And User select approval finance reimbursement
    Then User click button save approval finance reimbursement

  Scenario: Delete Finance Reimbursement
    When User click button delete finance reimbursement
    Then User click button confirm delete finance reimbursement

  Scenario: Enter HO Reimbursement Payment Page
    When User click tab finance payment
    Then User get text title page ho reimbursement payment

  Scenario: Proceed Payment HO Reimbursement
    When User click button payment ho reimbursement
    And User upload document payment ho reimbursement
    And User input amount approve payment ho reimbursement
    Then User create payment ho reimbursement

  Scenario: Edit Payment HO Reimbursement
    When User click icon edit payment ho reimbursement
    And User edit amount approve payment ho reimbursement
    Then User save edit data payment ho reimbursement

  Scenario: Approval Payment HO Reimbursement
    When User click button approval payment ho reimbursement
    And User select approval payment ho reimbursement
    Then User click button save approval payment ho reimbursement

  Scenario: View Approved Payment HO Reimbursement
    When User click button view approved payment ho reimbursement

  Scenario: Enter Finance Reimbursement Payment Page
    When User click tab finance reimbursement payment
    Then User get text title page finance reimbursement payment

  Scenario: Proceed Payment Finance Reimbursement
    When User click button payment finance reimbursement
    And User upload document payment finance reimbursement
    And User input amount approve payment finance reimbursement
    Then User create payment finance reimbursement

  Scenario: Edit Payment Finance Reimbursement
    When User click icon edit payment finance reimbursement
    And User edit amount approve payment finance reimbursement
    Then User save edit data payment finance reimbursement

  Scenario: Approval Payment Finance Reimbursement
    When User click button approval payment finance reimbursement
    And User select approval payment finance reimbursement
    Then User click button save approval payment finance reimbursement

  Scenario: View Approved Payment Finance Reimbursement
    When User click button view approved payment finance reimbursement