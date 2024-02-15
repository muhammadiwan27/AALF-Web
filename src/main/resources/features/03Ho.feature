Feature: Ho Page Test
  Scenario: Enter HO Page
    When User click tab ho
    Then User get text title page ho

  Scenario: User Search Valid Data Based ID HO
    When User click on the search bar under the words ho berjalan
    Then User input valid id ho

  Scenario: Enter HO Working Plan Page
    When User click button ho working plan
    Then User get text title page ho working plan

  Scenario: Add Task
    When User click button add task
    And User select scope of work task
    And User select deadline
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

  Scenario: Complete The Task
    When User click button complete the task
    And User select start date complete the task
    And User select end date complete the task
    And User upload activity photos complete the task
    And User upload activity documents complete the task
    And User input note complete the task
    Then User save complete the task

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

  Scenario: Create Document RKPD
    When User click button create administrative documents for rkpd
    And User select document rkpd
    And User select scope of work rkpd
    And User select region rkpd
    And User select start date rkpd
    And User select end date rkpd
    And User input scope of work details rkpd
    And User select assigned member rkpd
    Then User click button create document rkpd

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

  Scenario: Create Document Bon Putih
    When User click button create administrative documents for bon putih
    And User select document bon putih
    And User select id lkpd bon putih
    And User checklist reimbursement bon putih
    Then User click button create document bon putih

  Scenario: Create Document Bon Hijau
    When User click button create finance documents for bon hijau
    And User select document bon hijau
    And User select id st bon hijau
    And User input amount trip expenses bon hijau
    And User input note trip expenses bon hijau
    And User upload recipient trip expenses bon hijau
    Then User click button create document bon hijau