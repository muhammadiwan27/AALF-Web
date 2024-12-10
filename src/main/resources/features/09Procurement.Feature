Feature: Document Page Test
  Scenario: Enter Procurement Dashboard Page
    When User click tab procurement
    Then User get text title page procurement dashboard

  Scenario: Enter Procurement Report Page
    When User click tab procurement report
    Then User get text title page procurement report

  Scenario: Download Request Order Report
    When User select month request order report
    When User click button excel request order report

  Scenario: Download Request Order Complete Report
    When User click tab request order complete report
    And User select month request order complete report
    Then User click button excel request order complete report

  Scenario: Enter Request Order Page
    When User click tab request order
    Then User get text title page request order

  Scenario: Create Request Order
    When User click button create request order
    And User select vendor name request order
    And User select office location name request order
    And User input description request order
    And User input remark request order
    And User select submitted by request order
    And User select item request order
    And User upload documents quotation request order
    Then User save request order data

  Scenario: Edit Request Order Data
    When User click button edit request order
    And User edit description request order
    Then User save edit request order data

  Scenario: Approval Financial Director Request Order
    When User click button approval fd request order
    And User choose approval fd request order
    Then User save approval fd request order

  Scenario: Approval Director Request Order
    When User click button approval director request order
    And User choose approval director request order
    Then User save approval director request order

  Scenario: Upload Receipt Payment Request Order
    When User click button upload receipt request order
    And User upload receipt request order
    Then User save upload receipt request order

  Scenario: Upload Receipt Paid Payment Request Order
    When User click button paid payment request order
    And User upload receipt paid payment request order
    Then User save upload receipt paid payment request order

  Scenario: Complete Request Order
    When User click button delivered request order
    Then User click button complete delivered request order

  Scenario: Enter Request Order Complete Page
    When User click tab ro complete
    Then User get text title page ro complete

  Scenario: View Request Order Completed
    When User click button view completed request order
    And User get text title page completed request order
    Then User back to procurement completed request order list page