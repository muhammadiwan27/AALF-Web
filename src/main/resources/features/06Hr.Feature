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

  Scenario: Create Employee
    When User click button create employee
    And User input username employee
    And User input password employee
    And User select company employee
    And User choose role employee
    Then User save data employee

  Scenario: Edit Personal Data Employee
    When User click button edit employee
    And User click tab personal data employee
    And User edit personal data employee
    Then User save edit personal data employee

  Scenario: Edit Family Data Employee
    When User click tab family data employee
    And User edit family data employee
    Then User save edit family data employee

  Scenario: Edit Employee Data Employee
    When User click tab employee data employee
    And User edit employee data employee
    Then User save edit employee data employee

  Scenario: Edit Operational Data Employee
    When User click tab operational data employee
    And User edit operational data employee
    Then User save edit operational data employee

  Scenario: Enter Master Input Page
    When User click tab master input
    Then User get text title page master input

  Scenario: Create Company
    When User click button create company
    And User upload letterhead company
    And User upload footer company
    And User input company name
    And User input company address
    And User input company rt
    And User input company rw
    And User select company province
    And User select company city
    And User select company district
    And User select company sub district
    And User input company postal code
    And User input company phone number
    And User input company fax number
    And User input company email
    And User input company npwp
    And User input company bpjs kesehatan
    And User input company bpjs tk
    And User input company bank name
    And User input company account number
    Then User save company data

  Scenario: Search Company by ID Company
    When User input id company on search bar
    Then User get text id company

  Scenario: Edit Company Data
    When User click button edit company
    And User edit npwp company
    Then User save edit company data

  Scenario: Create Office Location
    When User click tab office location
    And User click button create office location
    And User input office location name
    And User input office address
    And User input office rt
    And User input office rw
    And User select office province
    And User select office city
    And User select office district
    And User select office sub district
    And User input office latitude longitude
    And User input office radius
    And User input office postal code
    And User input office phone number
    And User input office fax number
    And User input office email
    Then User save office location data

  Scenario: Search Office Location by ID Office Location
    When User input id office location on search bar
    Then User get text id office location

  Scenario: Edit Office Location Data
    When User click button edit office location
    And User edit office phone number
    Then User save edit office location data

  Scenario: Create Department
    When User click tab department
    And User click button create department
    And User input department name
    Then User save department data

  Scenario: Search Department by ID Department
    When User input id department on search bar
    Then User get text id department

  Scenario: Edit Department Data
    When User click button edit department
    And User edit department name
    Then User save edit department data

  Scenario: Create Position
    When User click tab position
    And User click button create position
    And User input position name
    Then User save position data

  Scenario: Search Position by ID Position
    When User input id position on search bar
    Then User get text id position

  Scenario: Edit Position Data
    When User click button edit position
    And User edit position name
    Then User save edit position data

  Scenario: Create Region
    When User click tab region
    And User click button create region
    And User input region name
    Then User save region data

  Scenario: Search Region by ID Region
    When User input id region on search bar
    Then User get text id region

  Scenario: Edit Region Data
    When User click button edit region
    And User edit region name
    Then User save edit region data

  Scenario: Create SOW
    When User click tab sow
    And User click sub tab sow
    And User click button create sow
    And User input sow name
    Then User save sow data

  Scenario: Search SOW by SOW Name
    When User input sow name on search bar
    Then User get text sow name

  Scenario: Edit SOW Data
    When User click button edit sow
    And User edit sow name
    Then User save edit sow data

  Scenario: Create SOW Tree & Score
    When User click sub tab sow tree & score
    And User click button create sow tree & score
    And User select sow level
    And User select sow parent
    And User select sow name
    And User input sow score
    Then User save sow tree & score data

  Scenario: Edit SOW Tree & Score Data
    When User click sow tree & score
    And User edit sow score
    Then User submit edit sow tree & score data

  Scenario: Create Type of Client
    When User click tab type of client
    And User click button create type of client
    And User input type of client name
    Then User save type of client data

  Scenario: Search Type of Client by Type of Client Name
    When User input type of client name on search bar
    Then User get text type of client name

  Scenario: Edit Type of Client
    When User click button edit type of client
    And User edit type of client name
    Then User save edit type of client data

  Scenario: Create Grade
    When User click tab grade
    And User click button create grade
    And User input grade name
    Then User save grade data

  Scenario: Search Grade by ID Grade
    When User input id grade on search bar
    Then User get text id grade

  Scenario: Edit Court Money Grade
    When User click button edit grade
    And User edit court money grade
    Then User save edit court money grade data

  Scenario: Edit Allowance Grade
    When User click tab allowance grade
    And User edit allowance grade
    Then User save edit allowance grade data

  Scenario: Edit Meal Allowance Grade
    When User click tab meal allowance grade
    And User edit meal allowance grade
    Then User save edit meal allowance grade data

  Scenario: Edit Professional Fee Grade
    When User click tab professional fee grade
    And User edit professional fee grade
    Then User save edit professional fee grade data

  Scenario: Edit Hotel Grade
    When User click tab hotel grade
    And User edit hotel grade
    Then User save edit hotel grade data

  Scenario: Edit Flight Grade
    When User click tab flight grade
    And User edit flight grade
    Then User save edit flight grade data

  Scenario: Edit Working Hours Data
    When User click tab working hours
    And User edit late fee amount
    Then User save edit working hours data

  Scenario: Create Type of Leave
    When User click tab type of leave
    And User click button create type of leave
    And User input type of leave name
    And User input type of leave description
    And User input type of leave maximum days
    And User select reviewer type of leave
    And User checklist condition type of leave
    Then User save type of leave data

  Scenario: Search Type of Leave by Type of Leave Name
    When User input name type of leave on search bar
    Then User get text name type of leave

  Scenario: Edit Type of Leave Data
    When User click button edit type of leave
    And User edit type of leave description
    Then User save edit type of leave data

  Scenario: Edit Overtime Data
    When User click tab master input overtime
    And User edit overtime expenses
    Then User save edit overtime data

  Scenario: Create Mandatory Deductions
    When User click tab mandatory deductions
    And User click button create mandatory deductions
    And User input name mandatory deductions
    And User select mandatory deductions deduction type
    And User choose where mandatory deductions will be deducted from
    And User add mandatory deductions data
    Then User save mandatory deductions data

  Scenario: Search Mandatory Deductions by ID Mandatory Deductions
    When User input id mandatory deductions on search bar
    Then User get text id mandatory deductions

  Scenario: Add Employee Mandatory Deductions
    When User click button add employee mandatory deductions
    And User select employee mandatory deductions
    Then User save add employee mandatory deductions

  Scenario: Edit Mandatory Deductions Data
    When User click button edit mandatory deductions
    And User edit name mandatory deductions
    Then User save edit mandatory deductions data

  Scenario: Create PPH21
    When User click tab pph21
    And User click button create pph21
    And User input category pph21
    And User choose where pph21 will be deducted from
    And User input income range pph21
    Then User save pph21 data

  Scenario: Search PPH21 by Name PPH21
    When User input name pph21 on search bar
    Then User get text name pph21

  Scenario: Add Employee PPH21
    When User click button add employee pph21
    And User select employee pph21
    Then User save add employee pph21

  Scenario: Edit PPH21 Data
    When User click button edit pph21
    And User edit category pph21
    Then User save edit pph21 data

  Scenario: Enter HR Document Page
    When User click tab hr document
    Then User get text title page hr document number

  Scenario: Create HR Document Number
    When User click button create hr document number
    And User input master document name hr document number
    And User input format document number hr document number
    Then User save hr document number data

  Scenario: Edit HR Document Number Data
    When User click button edit hr document number
    And User edit master document name hr document number
    Then User save edit hr document number data

  Scenario: Delete HR Document Number
    When User click button delete hr document number
    Then User click button confirm delete hr document number

  Scenario: Enter HR List Document Page
    When User click tab hr list document
    Then User get text title page hr list document page

  Scenario: Create HR List Document
    When User click button create hr list document
    And User choose master document name hr list document
    And User input document name hr list document
    Then User save hr list document data

  Scenario: Upload document HR List Document
    When User click button upload hr list document
    And User choose file upload document hr list document
    Then User upload document hr list document

  Scenario: Edit HR List Document Data
    When User click button edit hr list document
    And User edit document name hr list document
    Then User save edit hr list document data

  Scenario: Delete HR List Document
    When User click button delete hr list document
    Then User click button confirm delete hr list document

  Scenario: Enter HR Request Letter Page
    When User click tab hr request letter
    Then User get text title page hr request letter page

  Scenario: Create HR Request Letter
    When User click button create hr request letter
    And User input start date hr request letter
    And User input end date hr request letter
    And User select region hr request letter
    And User input location hr request letter
    And User input note hr request letter
    And User select member on duty hr request letter
    And User checklist estimated expenditures hr request letter
    Then User save hr request letter data

  Scenario: Edit HR Request Letter
    When User click button edit hr request letter
    And User edit note hr request letter
    Then User save edit hr request letter data

  Scenario: Approval HR Request Letter
    When User click button approval hr request letter
    And User choose approval hr request letter
    And User input note approval hr request letter
    Then User save approval hr request letter

  Scenario: View Approved HR Request Letter
    When User click button view approved hr request letter
    And User get text title page approved hr request letter
    Then User back to hr request letter page