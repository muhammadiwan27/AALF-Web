Feature: Ho Page Test
  Scenario: Enter HO Page
    When User click tab ho
    Then User get text title page ho

  Scenario: Create HO
    When User click button create ho
    And User select handling company ho
    And User upload document quotation client ho
    And User upload document confirmation letter client ho
    And User select name of client ho
    And User upload document scope of work client ho
    And User input case name client ho
    And Input address client ho
    And User select province client ho
    And User select city client ho
    And User input postal code client ho
    And User input recommendation client ho
    And User input telephone client ho
    And User input email client ho
    And User input npwp client ho
    And User select type of client ho
    And User input case summary client ho
    And User input total hours client ho
    And User add handling team client ho
    Then User save ho

  Scenario: User Search Valid Data Based ID HO
    When User click on the search bar under the words ho berjalan
    Then User input valid id ho

  Scenario: Enter HO Working Plan Page
    When User click button ho working plan
    Then User get text title page ho working plan

  Scenario: Edit HO
    When User click button edit type of contract
    And User edit case summary data ho
    Then User save edit ho

  Scenario: Enter Detail Client Balance
    When User click detail cost ho working plan
    And User get text title page detail cost
    Then User close detail cost

  Scenario: Add Task
    When User click button add task
    And User select scope of work task
    And User select deadline task
    And User select pic task
    And User select task photos
    And User select task documents
    And User input note task
    Then User save task

  Scenario: Add Activity
    When User click button add activity
    And User select scope of work activity
    And User select start date activity
    And User select end date activity
    And User select pic activity
    And User upload activity photos
    And User upload activity documents
    And User input note activity
    Then User save activity

  Scenario: Edit Task
    When User click button edit task
    And User edit data task
    Then User save edit task

  Scenario: View Task
    When User click button view task

  Scenario: Proceed The Task
    When User click button proceed the task
    And User select start date proceed the task
    And User select end date proceed the task
    And User upload activity photos proceed the task
    And User upload activity documents proceed the task
    And User input note proceed the task
    Then User save proceed the task

  Scenario: JP Approval Task
    When User click button jp approval task
    And User select jp approval task
    And User input note jp approval task
    Then User click button save jp approval task

  Scenario: Revision Task
    When User click button partner for revision task
    And User select partner for revision task
    And User input note partner for revision task
    And User click button save partner for revision task
    And User click button revisi
    And User input note revisi complete the task
    And User save revisi complete the task
    And User click button jp approval for revision task
    And User select jp approval for revision task
    And User input note jp approval for revision task
    Then User click button save jp approval for revision task

  Scenario: Partner Approval Task
    When User click button partner approval task
    And User select partner approval task
    And User input note partner approval task
    Then User click button save partner approval task

  Scenario: Delete Task
    When User click icon delete task
    Then User click button confirm delete task

  Scenario: JP Approval Activity
    When User click button jp approval activity
    And User select jp approval activity
    And User input note jp approval activity
    Then User click button save jp approval activity

  Scenario: Revision Activity
    When User click button partner for revision activity
    And User select partner for revision activity
    And User input note partner for revision activity
    And User click button save partner for revision activity
    And User click button revisi activity
    And User edit activity for revision
    And User save activity for revision
    And User click button jp approval for revision activity
    And User select jp approval for revision activity
    And User input note jp approval for revision activity
    Then User click button save jp approval for revision activity

  Scenario: Partner Approval Activity
    When User click button partner approval activity
    And User select partner approval activity
    And User input note partner approval activity
    Then User click button save partner approval activity

  Scenario: Delete Activity
    When User click icon delete activity
    Then User click button confirm delete activity

  Scenario: Create Document RKPD
    When User click button create administrative documents for rkpd
    And User select document rkpd
    And User select start date rkpd
    And User select end date rkpd
    And User select scope of work rkpd
    And User select region rkpd
    And User input location rkpd
    And User input scope of work details rkpd
    And User select assigned member rkpd
    And User upload document rkpd
    Then User click button create document rkpd

  Scenario: JP Approval Document RKPD
    When User click button jp approval document rkpd
    And User select jp approval document rkpd
    And User input note jp approval rkpd
    Then User click button save jp approval rkpd

  Scenario: Partner Approval Document RKPD
    When User click button partner approval document rkpd
    And User select partner approval document rkpd
    And User input note partner approval rkpd
    Then User click button save partner approval rkpd

  Scenario: Create Document Surat Tugas
    When User click button create administrative documents for surat tugas
    And User select document surat tugas
    And User select id rkpd surat tugas
    And User checklist list of expenses surat tugas
    Then User click button create document surat tugas
    
  Scenario: Create Document LKPD
    When User click button create administrative documents for lkpd
    And User select document lkpd
    And User select id st lkpd
    And User choose activity lkpd
    And User select sow for next agenda lkpd
    And User select deadline for next agenda lkpd
    And User select pic for next agenda lkpd
    And User input note for next agenda lkpd
    Then User click button create document lkpd

  Scenario: JP Approval Document LKPD
    When User click button jp approval document lkpd
    And User select jp approval document lkpd
    And User input note jp approval lkpd
    Then User click button save jp approval lkpd

  Scenario: Partner Approval Document LKPD
    When User click button partner approval document lkpd
    And User select partner approval document lkpd
    And User input note partner approval lkpd
    Then User click button save partner approval lkpd

  Scenario: Create Document Reimbursement RKPD
    When User click button create administrative documents for reimbursement rkpd
    And User select document reimbursement rkpd
    And User select id lkpd reimbursement rkpd
    And User checklist reimbursement reimbursement rkpd
    Then User click button create document reimbursement rkpd

  Scenario: JP Approval Document Reimbursement RKPD
    When User click button jp approval document reimbursement rkpd
    And User select jp approval document reimbursement rkpd
    And User input note jp approval reimbursement rkpd
    Then User click button save jp approval reimbursement rkpd

  Scenario: Partner Approval Document Reimbursement RKPD
    When User click button partner approval document reimbursement rkpd
    And User select partner approval document reimbursement rkpd
    And User input note partner approval reimbursement rkpd
    Then User click button save partner approval reimbursement rkpd

  Scenario: Create Document Trip Accomodation
    When User click button create finance documents for trip accomodation
    And User select document trip accomodation
    And User select id st trip accomodation
    And User input amount trip expenses trip accomodation
    And User input note trip expenses trip accomodation
    And User upload recipient trip expenses trip accomodation
    Then User click button create document trip accomodation

  Scenario: JP Approval Document Trip Accomodation
    When User click button jp approval document trip accomodation
    And User select jp approval document trip accomodation
    And User input note jp approval trip accomodation
    Then User click button save jp approval trip accomodation

  Scenario: Partner Approval Document Trip Accomodation
    When User click button partner approval document trip accomodation
    And User select partner approval document trip accomodation
    And User input note partner approval trip accomodation
    Then User click button save partner approval trip accomodation

  Scenario: Create Document Disbursement Trip
    When User click button create finance documents for disbursement trip
    And User select document disbursement trip
    And User select id reimbursement rkpd disbursement trip
    And User checklist team incurred expenses reimbursement disbursement trip
    Then User click button create document disbursement trip

  Scenario: JP Approval Document Disbursement Trip
    When User click button jp approval document disbursement trip
    And User select jp approval document disbursement trip
    And User input note jp approval disbursement trip
    Then User click button save jp approval disbursement trip

  Scenario: Partner Approval Document Disbursement Trip
    When User click button partner approval document disbursement trip
    And User select partner approval document disbursement trip
    And User input note partner approval disbursement trip
    Then User click button save partner approval disbursement trip

  Scenario: Create Document Deposit Receipt
    When User click button create finance documents for deposit receipt
    And User select document deposit receipt
    And User input description deposit receipt
    And User select receipt date deposit receipt
    And User input account number deposit receipt
    And User input amount received deposit receipt
    And User input final value deposit receipt
    Then User click button create document deposit receipt

  Scenario: View Document RKPD
    When User click id rkpd

  Scenario: View Document Surat Tugas
    When User click id surat tugas

  Scenario: View Document Trip Accomodation
    When User click id trip accomodation

  Scenario: View Document LKPD
    When User click id lkpd

  Scenario: View Document reimbursement rkpd
    When User click id reimbursement rkpd

  Scenario: View Document Disbursement Trip
    When User click id disbursement trip

  Scenario: View Business Trip Recap
    When User click button view business trip recap 1

  Scenario: View Business Trip Expenses Recap
    When User click button view business trip expenses recap

  Scenario: Edit Document Disbursement Trip
    When User click button view business trip expenses recap for edit disbursement trip
    And User click button edit document disbursement trip
    And User edit data document disbursement trip
    Then User save edit document disbursement trip

  Scenario: Delete Document Disbursement Trip
    When User click button delete document disbursement trip
    Then User click button confirm delete document disbursement trip

  Scenario: Edit Document reimbursement rkpd
    When User click button edit document reimbursement rkpd
    And User edit data document reimbursement rkpd
    Then User save edit document reimbursement rkpd

  Scenario: Delete Document reimbursement rkpd
    When User click button delete document reimbursement rkpd
    Then User click button confirm delete document reimbursement rkpd

  Scenario: Edit Document Trip Accomodation
    When User click button edit document trip accomodation
    And User edit data document trip accomodation
    Then User save edit document trip accomodation

  Scenario: Delete Document Trip Accomodation
    When User click button delete document trip accomodation
    Then User click button confirm delete document trip accomodation

  Scenario: Edit Document LKPD
    When User click button view business trip recap for edit administrative document
    And User click button edit document lkpd
    And User edit data document lkpd
    Then User save edit document lkpd

  Scenario: Delete Document LKPD
    When User click button delete document lkpd
    Then User click button confirm delete document lkpd

  Scenario: Edit Document Surat Tugas
    When User click button edit document surat tugas
    And User edit data document surat tugas
    Then User save edit document surat tugas

  Scenario: Delete Document Surat Tugas
    When User click button delete document surat tugas
    Then User click button confirm delete document surat tugas

  Scenario: Edit Document RKPD
    When User click button edit document rkpd
    And User edit data document rkpd
    Then User save edit document rkpd

  Scenario: Delete Document RKPD
    When User click button delete document rkpd
    Then User click button confirm delete document rkpd

  Scenario: Upload Document HO Working Plan
    When User click button upload document
    And User attach document for upload
    Then User click button upload

  Scenario: Delete Upload Document HO Working Plan
    When User click button delete upload document ho working plan
    Then User click button confirm delete upload document ho working plan

  Scenario: Create Notulen HO Working Plan
    When User click button notulen
    And User select name of team notulen
    And User input meeting leader
    And User input address notulen
    And User input meeting participants notulen
    And User select date notulen
    And User input meeting opened by notulen
    And User input meeting topic notulen
    And User input note notulen
    And User input meeting results notulen
    Then User click button create notulen

  Scenario: Create HO Reimbursement HO Working Plan
    When User click button create reimbursement
    And User select date ho reimbursement
    And User input note ho reimbursement
    And User select member on duty ho reimbursement
    And User input list of expenses reimbursement ho reimbursement
    And User input amount reimbursement ho reimbursement
    And User input note reimbursement ho reimbursement
    And User attach receipt reimbursement ho reimbursement
    Then User click button create ho reimbursement

  Scenario: Edit HO Reimbursement HO Working Plan
    When User click button edit ho reimbursement
    And User edit note ho reimbursement
    Then User click button save edit ho reimbursement

  Scenario: View HO Reimbursement HO Working Plan
    When User click button view ho reimbursement
    Then User click button back view ho reimbursement

  Scenario: JP Approval HO Reimbursement HO Working Plan
    When User click button approval ho reimbursement
    And User select jp approval ho reimbursement
    Then User click button save jp approval ho reimbursement

  Scenario: Delete HO Reimbursement HO Working Plan
    When User click button delete ho reimbursement
    Then User click button confirm delete ho reimbursement

  Scenario: Create HO Overtime HO Working Plan
    When User click button create reimbursement
    And User select date ho reimbursement
    And User input note ho reimbursement
    And User select member on duty ho reimbursement
    And User input list of expenses reimbursement ho reimbursement
    And User input amount reimbursement ho reimbursement
    And User input note reimbursement ho reimbursement
    And User attach receipt reimbursement ho reimbursement
    Then User click button create ho reimbursement

  Scenario: View HO Activities HO Working Plan
    When User click button view ho activities
    Then User click button back view ho activities

  Scenario: Complete HO
    When User click button tab dashboard ho
    And User search valid data based id ho
    And User click button complete ho
    Then User click confirm complete ho

  Scenario: Enter List Approval Page
    When User click tab list approval
    Then User get text title page list approval

  Scenario: JP Approval Task List Approval
    When User click button approval jp task list approval
    And User click button approve jp document task list approval
    Then User click button save jp approval task list approval

  Scenario: Partner Approval Task List Approval
    When User select filter partner approval task list approval
    And User click button approval partner task list approval
    And User click button approve partner approval document task list approval
    Then User click button save partner approval task list approval

  Scenario: JP Approval RKPD List Approval
    When User select filter jp approval rkpd list approval
    And User select sort by rkpd list approval
    And User click button approval jp rkpd list approval
    And User click button approve jp document rkpd list approval
    Then User click button save jp approval rkpd list approval

  Scenario: Partner Approval RKPD List Approval
    When User select filter partner approval rkpd list approval
    And User click button approval partner rkpd list approval
    And User click button approve partner document rkpd list approval
    Then User click button save partner approval rkpd list approval

  Scenario: JP Approval LKPD List Approval
    When User select filter jp approval lkpd list approval
    And User select sort by lkpd list approval
    And User click button approval jp lkpd list approval
    And User click button approve jp document lkpd list approval
    Then User click button save jp approval lkpd list approval

  Scenario: Partner Approval LKPD List Approval
    When User select filter partner approval lkpd list approval
    And User click button approval partner lkpd list approval
    And User click button approve partner document lkpd list approval
    Then User click button save partner approval lkpd list approval

  Scenario: JP Approval Reimbursement RKPD List Approval
    When User select filter jp approval reimbursement rkpd list approval
    And User select sort by reimbursement rkpd list approval
    And User click button approval jp reimbursement rkpd list approval
    And User click button approve jp document reimbursement rkpd list approval
    Then User click button save jp approval reimbursement rkpd list approval

  Scenario: Partner Approval Reimbursement RKPD List Approval
    When User select filter partner approval reimbursement rkpd list approval
    And User click button approval partner reimbursement rkpd list approval
    And User click button approve partner document reimbursement rkpd list approval
    Then User click button save partner approval reimbursement rkpd list approval

  Scenario: JP Approval Disbursement Trip List Approval
    When User select filter jp approval disbursement trip list approval
    And User select sort by disbursement trip list approval
    And User click button approval jp disbursement trip list approval
    And User click button approve jp document disbursement trip list approval
    Then User click button save jp approval disbursement trip list approval


  Scenario: Partner Approval Disbursement Trip List Approval
    When User select filter partner approval disbursement trip list approval
    And User click button approval partner disbursement trip list approval
    And User click button approve partner document disbursement trip list approval
    Then User click button save partner approval disbursement trip list approval

  Scenario: JP Approval Trip Accommodation List Approval
    When User select filter jp approval trip accommodation list approval
    And User select sort by trip accommodation list approval
    And User click button approval jp trip accommodation list approval
    And User click button approve jp document trip accommodation list approval
    Then User click button save jp approval trip accommodation list approval

  Scenario: Partner Approval Trip Accommodation List Approval
    When User select filter partner approval trip accommodation list approval
    And User click button partner approval trip accommodation list approval
    And User click button approve partner document trip accommodation list approval
    Then User click button save partner approval trip accommodation list approval

  Scenario: JP Approval HO Reimbursement List Approval
    When User select filter jp approval ho reimbursement list approval
    And User select sort by ho reimbursement list approval
    And User click button approval jp ho reimbursement list approval
    And User click button approve jp document ho reimbursement list approval
    Then User click button save jp approval ho reimbursement list approval

  Scenario: FD Approval HO Reimbursement List Approval
    When User select filter fd approval ho reimbursement list approval
    And User click button approval fd ho reimbursement list approval
    And User click button approve fd document ho reimbursement list approval
    Then User click button save fd approval ho reimbursement list approval

  Scenario: Partner Approval HO Overtime List Approval
    When User select sort by ho overtime list approval
    And User click button partner approval ho overtime list approval
    And User click button approve partner document ho overtime list approval
    Then User click button save partner approval ho overtime list approval