Feature: Dashboard Page Test

  Scenario: Dashboard Valid Functionality Test
    When User enter username
    And User enter password
    Then User get text title page dashboard

  Scenario: Check Total HO Overall Dashboard Aplikasi Sipanda-Unik
    When User click tab total ho overall
    Then User close tab total ho overall

  Scenario: Check HO On Progress Dashboard Aplikasi Sipanda-Unik
    When User click tab ho on progress
    Then User close tab total ho on progress

  Scenario: Check HO Completed Dashboard Aplikasi Sipanda-Unik
    When User click tab ho on completed
    Then User close tab ho on completed

  Scenario: Check Total Task Dashboard Aplikasi Sipanda-Unik
    When User click tab total task
    Then User close tab total task

  Scenario: Check Task Has Not Proceed Dashboard Aplikasi Sipanda-Unik
    When User click tab task has not proceed
    Then User close tab task has not proceed

  Scenario: Check Task Need Approval JP Dashboard Aplikasi Sipanda-Unik
    When User click tab task need approval jp
    Then User close tab task need approval jp

  Scenario: Check Task Need Approval Partner Dashboard Aplikasi Sipanda-Unik
    When User click tab task need approval partner
    Then User close tab task need approval partner

  Scenario: Check Task Finished Dashboard Aplikasi Sipanda-Unik
    When User click tab task finished
    Then User close tab task finished

  Scenario: Check Total Activity Dashboard Aplikasi Sipanda-Unik
    When User click tab total activity
    Then User close tab total activity

  Scenario: Check Activity Need Revision Dashboard Aplikasi Sipanda-Unik
    When User click tab activity need revision
    Then User close tab activity need revision

  Scenario: Check Activity Need Approval JP Dashboard Aplikasi Sipanda-Unik
    When User click tab activity need approval jp
    Then User close tab activity need approval jp

  Scenario: Check Activity Need Approval Partner Dashboard Aplikasi Sipanda-Unik
    When User click tab activity need approval partner
    Then User close tab activity need approval partner

  Scenario: Check Activity Finished Dashboard Aplikasi Sipanda-Unik
    When User click tab activity finished
    Then User close tab activity finished

  Scenario: Proceed overdue deadline task Dashboard Aplikasi Sipanda-Unik
    When User click on id ho overdue deadline task to proceed
    And User select approval overdue deadline task
    And User input note approval overdue deadline task
    Then User save approval overdue deadline task


  Scenario: Proceed upcoming deadline task Dashboard Aplikasi Sipanda-Unik
    When User click on id ho upcoming deadline task to proceed
    And User select start date proceed the task upcoming deadline
    And User select end date proceed the task upcoming deadline
    And User upload activity photos proceed the task upcoming deadline
    And User upload activity documents proceed the task upcoming deadline
    And User input note proceed the task upcoming deadline
    Then User save proceed the task upcoming deadline

  Scenario: Add event dashboard
    When User click button add event
    And User input title event
    And User select start date event
    And User select end date event
    And User select reminder event
    And User input note event
    Then User click button create event

  Scenario: Edit event dashboard
    When User click card event dashboard
    And User edit data event
    Then User save edit event
