Feature: Hr Page Test
  Scenario: Enter HR Page
    When User click tab hr
    Then User get text title page hr

  Scenario: Enter Attendance Page
    When User click tab attendance
    Then User get text title page attendance

  Scenario: Search Employee Attendance by Name
    When User input employee name attendance
    And User enter employee attendance page
    Then User get text title page employee name attendance

  Scenario: Enter Monitoring Page
    When User click tab monitoring
    Then User get text title page monitoring

  Scenario: Search Employee Monitoring by Name
    When User input employee name monitoring
    And User enter employee monitoring page
    Then User get text title page employee name monitoring

  Scenario: Enter HR Report Page
    When User click tab hr report
    Then User get text title page hr report

  Scenario: Download KPI HO Report
    When User click button excel kpi ho report

  Scenario: Download KPI HO Detail Report
    When User click tab kpi ho detail report
    Then User click button excel kpi ho detail report

  Scenario: Download Resume Daily Report
    When User click tab resume daily report
    Then User click button pdf resume daily report

  Scenario: Download HR Master Document Number Report
    When User click tab hr master document number report
    And User select month hr master document number report
    Then User click button excel hr master document number report

  Scenario: Enter Overtime Page
    When User click tab overtime
    Then User get text title page overtime

  Scenario: Create Overtime
    When User click button create overtime
    And User select start date end date overtime
    And User select author overtime
    And User upload document overtime
    And User input note overtime
    Then User save overtime

  Scenario: Edit Overtime
    When User click button edit overtime
    And User edit note overtime
    Then User save edit overtime

  Scenario: Approval Overtime
    When User click button approval overtime
    And User select approval overtime
    Then User click button save approval overtime

  Scenario: View Approved Overtime Page
    When User click button view approved overtime
    And User get text title page view approved overtime
    Then User back to overtime page

  Scenario: Enter Log User Page
    When User click tab log user
    Then User get text title page log user

  Scenario: Search Log User by Employee Name
    When User select employee name on filter by
    Then User get text employee name log user

  Scenario: Download Excel & PDF Log User Report
    When User click button download excel log user
    Then User click button download pdf log user

  Scenario: Enter Workload Page
    When User click tab workload
    Then User get text title page workload

  Scenario: Download Excel & PDF Workload Report
    When User click button download excel workload
    Then User click button download pdf workload

  Scenario: Enter Leave Permission Page
    When User click tab leave permission
    Then User get text title page leave permission

  Scenario: Create Leave Permission
    When User click button create leave permission
    And User select type of leave
    And User select author leave permission
    And User select start date end date leave permission
    And User upload document leave permission
    And User input note leave permission
    Then User save leave permission

  Scenario: Edit Leave Permission
    When User click button edit leave permission
    And User edit note leave permission
    Then User save edit leave permission

  Scenario: Approval Leave Permission
    When User switch account to first reviewer account
    And User click button first approval leave permission
    And User select first approval leave permission
    And User click button save first approval leave permission
    And User switch account to second reviewer account
    And User click button second approval leave permission
    And User select second approval leave permission
    Then User click button save second approval leave permission

  Scenario: View Approved Leave Permission Page
    When User switch account to master account
    And User click button view approved leave permission
    And User get text title page view approved leave permission
    Then User back to leave permission page

  Scenario: Enter Joint Holiday Page
    When User click tab joint holiday
    Then User get text title page joint holiday

  Scenario: Create Joint Holiday
    When User click button create joint holiday
    And User select date joint holiday
    And User input title joint holiday
    And User click reduce balance joint holiday
    Then User save joint holiday

  Scenario: Edit Joint Holiday
    When User click button edit joint holiday
    And User edit title joint holiday
    Then User save edit joint holiday

  Scenario: Enter Employee Page
    When User click tab employee
    Then User get text title page employee

  Scenario: Search Employee by Name
    When User input employee name on search bar
    Then User get text employee name