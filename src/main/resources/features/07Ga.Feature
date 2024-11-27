Feature: Ga Page Test
  Scenario: Enter GA Dashboard Page
    When User click tab ga
    Then User get text title page ga dashboard

  Scenario: Enter GA Report Page
    When User click tab ga report
    Then User get text title page ga report

  Scenario: Download Maintenance Report
    When User select month maintenance report
    When User click button excel maintenance report

  Scenario: Download Asset Report
    When User click tab asset report
    Then User click button excel asset report

  Scenario: Download Stock Consumable Report
    When User click tab stock consumable report
    Then User click button excel stock consumable report

  Scenario: Download Moving Stock Report
    When User click tab moving stock report
    Then User click button excel moving stock report

  Scenario: Download GA Master Document Number Report
    When User click tab ga master document number report
    And User select month ga master document number report
    Then User click button excel ga master document number report

  Scenario: Enter Master GA Page
    When User click tab master ga
    Then User get text title page master ga

  Scenario: Create Master GA Category
    When User click button create master ga category
    And User input category name master ga category
    And User input prefix master ga category
    Then User save master ga category data

  Scenario: Edit Master GA Category Data
    When User click button edit master ga category
    And User edit prefix category master ga category
    Then User save edit master ga category data

  Scenario: View Master GA Category
    When User click button view master ga category
    And User get text title page master ga category
    Then User back to master ga page one

  Scenario: Delete Master GA Category
    When User click button delete master ga category
    Then User click button confirm delete master ga category

  Scenario: Create Master GA Brand
    When User click tab brand master ga
    And User click button create master ga brand
    And User input brand name master ga brand
    Then User save master ga brand data

  Scenario: Edit Master GA Brand Data
    When User click button edit master ga brand
    And User edit brand name master ga brand
    Then User save edit master ga brand data

  Scenario: View Master GA Brand
    When User click button view master ga brand
    And User get text title page master ga brand
    Then User back to master ga page two

  Scenario: Delete Master GA Brand
    When User click button delete master ga brand
    Then User click button confirm delete master ga brand

  Scenario: Create Master GA Type
    When User click tab type master ga
    And User click button create master ga type
    And User input type name master ga type
    Then User save master ga type data

  Scenario: Edit Master GA Type Data
    When User click button edit master ga type
    And User edit type name master ga type
    Then User save edit master ga type data

  Scenario: View Master GA Type
    When User click button view master ga type
    And User get text title page master ga type
    Then User back to master ga page three

  Scenario: Delete Master GA Type
    When User click button delete master ga type
    Then User click button confirm delete master ga type

  Scenario: Enter Asset Data Page
    When User click tab asset data
    Then User get text title page asset data

  Scenario: Create Asset Data
    When User click button create asset data
    And User select type asset asset data
    And User input asset name asset data
    And User select category asset data
    And User select merk asset data
    And User select type asset data
    And User input serial asset data
    And User select location asset data
    And User select status asset data
    And User select user asset data
    And User input purchase price asset data
    And User select purchase date asset data
    Then User save asset data

  Scenario: Edit Asset Data
    When User click button edit asset data
    And User edit serial asset data
    Then User save edit asset data

  Scenario: View Asset Data
    When User click button view asset data
    And User get text title page view asset data
    Then User back to asset data page

  Scenario: Delete Asset Data
    When User click button delete asset data
    Then User click button confirm delete asset data

  Scenario: Enter Asset Maintenance Page
    When User click tab asset maintenance
    Then User get text title page asset maintenance

  Scenario: Create Asset Maintenance
    When User click button create asset maintenance
    And User select asset id asset maintenance
    And User select date asset maintenance
    And User input information asset maintenance
    And User input vendor location asset maintenance
    And User input estimated costs asset maintenance
    And User upload proof of payment asset maintenance
    Then User save asset maintenance data

  Scenario: Edit Asset Maintenance
    When User click button edit asset maintenance
    And User edit information asset maintenance
    Then User save edit asset maintenance data

  Scenario: Delete Asset Maintenance
    When User click button delete asset maintenance
    Then User click button confirm delete asset maintenance

  Scenario: Enter Master Consumable Page
    When User click tab master consumable
    Then User get text title page master consumable

  Scenario: Add Master Consumable
    When User click button add master consumable
    And User input item name master consumable
    And User input item unit master consumable
    And User select category master consumable
    And User select type master consumable
    Then User save master consumable data

  Scenario: View Master Consumable
    When User click button view master consumable
    And User get text title page view master consumable
    Then User back to master consumable page

  Scenario: Enter Consumable Page
    When User click tab consumable
    Then User get text title page consumable

  Scenario: Add Stock Consumable
    When User click button add stock consumable
    And User select purchase date add stock consumable
    And User select item add stock consumable
    And User upload invoice add stock consumable
    And User select location add stock consumable
    And User input note add stock consumable
    Then User save add stock consumable

  Scenario: Edit Add Stock Consumable Data
    When User click button edit add stock
    And User edit total add stock
    Then User save edit asset add stock data

  Scenario: Add Consume Data
    When User click button consume
    And User select date of item departure consume
    And User select item consume
    And User select pic consume
    And User select location consume
    And User input note consume
    Then User save consume data

  Scenario: Add Moving Stock Data
    When User click moving stock
    And User select date moving stock
    And User select intial location moving stock
    And User select item moving stock
    And User select relocation location moving stock
    And User input note moving stock
    Then User save moving stock data

  Scenario: Enter GA Document Page
    When User click tab ga document
    Then User get text title page ga document

  Scenario: Create GA Document Number
    When User click button create ga document number
    And User input master document name ga document number
    And User input format document number ga document number
    Then User save ga document number data

  Scenario: Edit GA Document Number Data
    When User click button edit ga document number
    And User edit master document name ga document number
    Then User save edit ga document number data

  Scenario: Delete GA Document Number
    When User click button delete ga document number
    Then User click button confirm delete ga document number

  Scenario: Enter GA List Document Page
    When User click tab ga list document
    Then User get text title page ga list document page

  Scenario: Create GA List Document
    When User click button create ga list document
    And User choose master document name ga list document
    And User input document name ga list document
    Then User save ga list document data

  Scenario: Upload document GA List Document
    When User click button upload ga list document
    And User choose file upload document ga list document
    Then User upload document ga list document

  Scenario: Edit GA List Document Data
    When User click button edit ga list document
    And User edit document name ga list document
    Then User save edit ga list document data

  Scenario: Delete GA List Document
    When User click button delete ga list document
    Then User click button confirm delete ga list document
