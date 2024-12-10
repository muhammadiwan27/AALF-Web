package org.example;

import io.cucumber.java.en.And;
import org.example.pages.GaPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;


public class TestGa {
    static WebDriver driver;
    static ExtentTest extentTest;
    static GaPage gaPage = new GaPage();

    public TestGa() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

//Enter GA Dashboard Page
    @When("User click tab ga")
    public void user_click_tab_ga() {
        Hooks.delay(1);
        gaPage.TabGa();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab ga");
    }

    @Then("User get text title page ga dashboard")
    public void user_get_text_title_page_ga_dashboard() {
        Hooks.delay(1);
        Assert.assertEquals(gaPage.getTxtGa(), "General Affair");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page ga dashboard");
    }

//Enter GA Dashboard Report
    @When("User click tab ga report")
    public void user_click_tab_ga_report() {
        Hooks.delay(1);
        gaPage.TabGaReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab ga report");
    }

    @Then("User get text title page ga report")
    public void user_get_text_title_page_ga_report() {
        Hooks.delay(1);
        Assert.assertEquals(gaPage.getTxtGaReport(), "GA Report");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page ga report");
    }

//Download Maintenance Report
    @When("User select month maintenance report")
    public void user_select_month_maintenance_report() {
        Hooks.delay(1);
        gaPage.BtnMonthMaintenanceReport("September 2024");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select month maintenance report");
    }

    @Then("User click button excel maintenance report")
    public void user_click_button_excel_maintenance_report() {
        Hooks.delay(1);
        gaPage.BtnDownloadMaintenanceReport();
        Hooks.delay(3);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button excel maintenance report");
    }

//Download Asset Report
    @When("User click tab asset report")
    public void user_click_tab_asset_report() {
        Hooks.delay(1);
        gaPage.TabAssetReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab asset report");
    }

    @Then("User click button excel asset report")
    public void user_click_button_excel_asset_report() {
        Hooks.delay(1);
        gaPage.BtnDownloadAssetReport();
        Hooks.delay(3);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button excel asset report");
    }

//Download Stock Consumable Report
    @When("User click tab stock consumable report")
    public void user_click_tab_stock_consumable_report() {
        Hooks.delay(1);
        gaPage.TabStockConsumableReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab stock consumable report");
    }

    @Then("User click button excel stock consumable report")
    public void user_click_button_excel_stock_consumable_report() {
        Hooks.delay(1);
        gaPage.BtnDownloadStockConsumableReport();
        Hooks.delay(3);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button excel stock consumable report");
    }

//Download Moving Stock Report
    @When("User click tab moving stock report")
    public void user_click_tab_moving_stock_report() {
        Hooks.delay(1);
        gaPage.TabMovingStockReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab moving stock report");
    }

    @Then("User click button excel moving stock report")
    public void user_click_button_excel_moving_stock_report() {
        Hooks.delay(1);
        gaPage.BtnDownloadMovingStockReport();
        Hooks.delay(3);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button excel moving stock report");
    }

//Download GA Master Document Number Report
    @When("User click tab ga master document number report")
    public void user_click_tab_ga_master_document_number_report() {
        Hooks.delay(1);
        gaPage.TabGaMasterDocumentNumber();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab GA master document number report");
    }

    @And("User select month ga master document number report")
    public void user_select_month_ga_master_document_number_report() {
        Hooks.delay(1);
        gaPage.InputMonthGaMasterDocumentNumber("September 2024");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select month GA master document number report");
    }

    @Then("User click button excel ga master document number report")
    public void user_click_button_excel_ga_master_document_number_report() {
        Hooks.delay(1);
        gaPage.BtnDownloadGaMasterDocumentNumber();
        Hooks.delay(3);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button excel ga master document number report");
    }

//Enter Master GA Report
    @When("User click tab master ga")
    public void user_click_tab_master_ga() {
        Hooks.delay(1);
        gaPage.TabMasterGa();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab master ga");
    }

    @Then("User get text title page master ga")
    public void user_get_text_title_page_master_ga() {
        Hooks.delay(1);
        Assert.assertEquals(gaPage.getTxtMasterGa(), "Master GA");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page master ga");
    }

//Create Master GA Category
    @When("User click button create master ga category")
    public void user_click_button_create_master_ga_category() {
        Hooks.delay(1);
        gaPage.BtnCreateCategoryMasterGa();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create master ga category");
    }

    @And("User input category name master ga category")
    public void user_input_category_name_master_ga_category() {
        Hooks.delay(1);
        gaPage.InputCategoryNameMasterGa("Gadget");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input category name master ga category");
    }

    @And("User input prefix master ga category")
    public void user_input_prefix_master_ga_category() {
        Hooks.delay(1);
        gaPage.InputPrefixCategoryMasterGA("qty");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input prefix master ga category");
    }

    @Then("User save master ga category data")
    public void user_save_master_ga_category_data() {
        Hooks.delay(1);
        gaPage.BtnSaveCategoryMasterGa();
        Hooks.delay(2);
        gaPage.BtnConfirmSaveCategoryMasterGa();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save master ga category data");
    }

//Edit Master GA Category Data
    @When("User click button edit master ga category")
    public void user_click_button_edit_master_ga_category() {
        Hooks.delay(2);
        gaPage.BtnEditMasterGaCategory();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit master ga category");
    }

    @And("User edit prefix category master ga category")
    public void user_edit_prefix_category_master_ga_category() {
        Hooks.delay(2);
        gaPage.ClearInputPrefixCategoryMasterGA();
        Hooks.delay(2);
        gaPage.InputPrefixCategoryMasterGA("pcs");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit prefix category master ga category");
    }

    @Then("User save edit master ga category data")
    public void user_save_edit_master_ga_category_data() {
        Hooks.delay(2);
        gaPage.BtnSaveEditMasterGaCategory();
        Hooks.delay(2);
        gaPage.BtnConfirmSaveEditMasterGaCategory();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit master ga category data");
    }

//View Master GA Category
    @When("User click button view master ga category")
    public void user_click_button_view_master_ga_category() {
        Hooks.delay(1);
        gaPage.BtnViewMasterGaCategory();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button view master ga category");
    }

    @And("User get text title page master ga category")
    public void user_get_text_title_page_master_ga_category() {
        Hooks.delay(1);
        Assert.assertEquals(gaPage.getTxtViewMasterGaCategory(), "View Category");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User get text title page master ga category");
    }

    @Then("User back to master ga page one")
    public void user_back_to_master_ga_page_one() {
        Hooks.delay(1);
        gaPage.BtnBackMasterGaPage();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User back to master ga page one");
    }

//Delete Master GA Category
    @When("User click button delete master ga category")
    public void user_click_button_delete_master_ga_category() {
        Hooks.delay(2);
        gaPage.BtnDeleteMasterGaCategory();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button delete master ga category");
    }

    @Then("User click button confirm delete master ga category")
    public void user_click_button_confirm_delete_master_ga_category() {
        Hooks.delay(2);
        gaPage.BtnConfirmDeleteMasterGaCategory();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete master ga category");
    }

//Create Master GA Brand
    @When("User click tab brand master ga")
    public void user_click_tab_brand_master_ga() {
        Hooks.delay(1);
        gaPage.TabBrandMasterGa();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab brand master ga");
    }

    @And("User click button create master ga brand")
    public void user_click_button_create_master_ga_brand() {
        Hooks.delay(1);
        gaPage.BtnCreateBrandMasterGa();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create master ga brand");
    }

    @And("User input brand name master ga brand")
    public void user_input_brand_name_master_ga_brand() {
        Hooks.delay(1);
        gaPage.InputBrandNameMasterGa("Maspion");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input brand name master ga brand");
    }

    @Then("User save master ga brand data")
    public void user_save_master_ga_brand_data() {
        Hooks.delay(1);
        gaPage.BtnSaveBrandMasterGa();
        Hooks.delay(2);
        gaPage.BtnConfirmSaveBrandMasterGa();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save master ga brand data");
    }

//Edit Master GA Brand
    @When("User click button edit master ga brand")
    public void user_click_button_edit_master_ga_brand() {
        Hooks.delay(2);
        gaPage.BtnEditMasterGaBrand();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit master ga brand");
    }

    @And("User edit brand name master ga brand")
    public void user_edit_brand_name_master_ga_brand() {
        Hooks.delay(2);
        gaPage.ClearInputBrandNameMasterGa();
        Hooks.delay(2);
        gaPage.InputBrandNameMasterGa("Miyako");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit prefix category master ga brand");
    }

    @Then("User save edit master ga brand data")
    public void user_save_edit_master_ga_brand_data() {
        Hooks.delay(2);
        gaPage.BtnSaveEditMasterGaBrand();
        Hooks.delay(2);
        gaPage.BtnConfirmSaveEditMasterGaBrand();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit master ga brand data");
    }

//View Master GA Brand
    @When("User click button view master ga brand")
    public void user_click_button_view_master_ga_brand() {
        Hooks.delay(1);
        gaPage.BtnViewMasterGaBrand();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button view master ga brand");
    }

    @And("User get text title page master ga brand")
    public void user_get_text_title_page_master_ga_brand() {
        Hooks.delay(1);
        Assert.assertEquals(gaPage.getTxtViewMasterGaBrand(), "View Brand");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User get text title page master ga brand");
    }

    @Then("User back to master ga page two")
    public void user_back_to_master_ga_page_two() {
        Hooks.delay(1);
        gaPage.BtnBackMasterGaPage();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User back to master ga page");
    }

//Delete Master GA Brand
    @When("User click button delete master ga brand")
    public void user_click_button_delete_master_ga_brand() {
        Hooks.delay(2);
        gaPage.BtnDeleteMasterGaBrand();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button delete master ga category");
    }

    @Then("User click button confirm delete master ga brand")
    public void user_click_button_confirm_delete_master_ga_brand() {
        Hooks.delay(2);
        gaPage.BtnConfirmDeleteMasterGaBrand();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete master ga brand");
    }

//Create Master GA Type
    @When("User click tab type master ga")
    public void user_click_tab_type_master_ga() {
        Hooks.delay(1);
        gaPage.TabTypeMasterGa();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab type master ga");
    }

    @And("User click button create master ga type")
    public void user_click_button_create_master_ga_type() {
        Hooks.delay(1);
        gaPage.BtnCreateTypeMasterGa();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create master ga type");
    }

    @And("User input type name master ga type")
    public void user_input_brand_name_master_ga_type() {
        Hooks.delay(1);
        gaPage.InputTypeNameMasterGa("Spidol");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input type name master ga type");
    }

    @Then("User save master ga type data")
    public void user_save_master_ga_type_data() {
        Hooks.delay(1);
        gaPage.BtnSaveTypeMasterGa();
        Hooks.delay(2);
        gaPage.BtnConfirmSaveTypeMasterGa();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save master ga type data");
    }

//Edit Master GA Type
    @When("User click button edit master ga type")
    public void user_click_button_edit_master_ga_type() {
        Hooks.delay(2);
        gaPage.BtnEditMasterGaType();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit master ga type");
    }

    @And("User edit type name master ga type")
    public void user_edit_brand_name_master_ga_type() {
        Hooks.delay(2);
        gaPage.ClearInputTypeNameMasterGa();
        Hooks.delay(2);
        gaPage.InputTypeNameMasterGa("Board Marker");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit type name master ga type");
    }

    @Then("User save edit master ga type data")
    public void user_save_edit_master_ga_type_data() {
        Hooks.delay(2);
        gaPage.BtnSaveEditMasterGaType();
        Hooks.delay(2);
        gaPage.BtnConfirmSaveEditMasterGaType();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit master ga type data");
    }

//View Master GA Type
    @When("User click button view master ga type")
    public void user_click_button_view_master_ga_type() {
        Hooks.delay(1);
        gaPage.BtnViewMasterGaType();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button view master ga type");
    }

    @And("User get text title page master ga type")
    public void user_get_text_title_page_master_ga_type() {
        Hooks.delay(1);
        Assert.assertEquals(gaPage.getTxtViewMasterGaType(), "Edit Type");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User get text title page master ga type");
    }

    @Then("User back to master ga page three")
    public void user_back_to_master_ga_page_three() {
        Hooks.delay(1);
        gaPage.BtnBackMasterGaPage();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User back to master ga page three");
    }

//Delete Master GA Brand
    @When("User click button delete master ga type")
    public void user_click_button_delete_master_ga_type() {
        Hooks.delay(2);
        gaPage.BtnDeleteMasterGaType();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button delete master ga type");
    }

    @Then("User click button confirm delete master ga type")
    public void user_click_button_confirm_delete_master_ga_type() {
        Hooks.delay(2);
        gaPage.BtnConfirmDeleteMasterGaType();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete master ga type");
    }

//Enter Asset Data Page
    @When("User click tab asset data")
    public void user_click_tab_asset_data() {
        Hooks.delay(1);
        gaPage.TabAssetData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab asset data");
    }

    @Then("User get text title page asset data")
    public void user_get_text_title_page_asset_data() {
        Hooks.delay(1);
        Assert.assertEquals(gaPage.getTxtAssetData(), "Asset Data");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page asset data");
    }

//Create Asset Data
    @When("User click button create asset data")
    public void user_click_button_create_asset_data() {
        Hooks.delay(1);
        gaPage.BtnCreateAssetData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create asset data");
    }

    @And("User select type asset asset data")
    public void user_select_type_asset_asset_data() {
        Hooks.delay(1);
        gaPage.ChecklistTypeAssetAssetData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select type asset asset data");
    }

    @And("User input asset name asset data")
    public void user_input_asset_name_asset_data() {
        Hooks.delay(1);
        gaPage.InputAssetNameAssetData("Samsung S24 Ultra");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input asset name asset data");
    }

    @And("User select category asset data")
    public void user_select_category_asset_data() {
        Hooks.delay(1);
        gaPage.BtnSelectCategoryAssetData();
        Hooks.delay(2);
        gaPage.SelectCategoryAssetData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select category asset data");
    }

    @And("User select merk asset data")
    public void user_select_merk_asset_data() {
        Hooks.delay(1);
        gaPage.BtnSelectMerkAssetData();
        Hooks.delay(2);
        gaPage.SelectMerkAssetData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select merk asset data");
    }

    @And("User select type asset data")
    public void user_select_type_asset_data() {
        Hooks.delay(1);
        gaPage.BtnSelectTypeAssetData();
        Hooks.delay(2);
        gaPage.SelectTypeAssetData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select type asset data");
    }

    @And("User input serial asset data")
    public void user_input_serial_asset_data() {
        Hooks.delay(1);
        gaPage.InputSerialAssetData("SM-2834918");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input serial asset data");
    }

    @And("User select location asset data")
    public void user_select_location_asset_data() {
        Hooks.delay(1);
        gaPage.BtnSelectLocationAssetData();
        Hooks.delay(2);
        gaPage.SelectLocationAssetData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select location asset data");
    }

    @And("User select status asset data")
    public void user_select_status_asset_data() {
        Hooks.delay(1);
        gaPage.BtnStatusAssetData();
        Hooks.delay(2);
        gaPage.SelectStatusAssetData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select status asset data");
    }

    @And("User select user asset data")
    public void user_select_user_asset_data() {
       Hooks.delay(1);
        try {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        robot.delay(200);
    } catch (AWTException e) {
        throw new RuntimeException(e);
    }
        gaPage.BtnSearchUserAssetData();
        Hooks.delay(2);
        gaPage.BtnSelectUserAssetData();
        Hooks.delay(2);
        gaPage.SelectUserAssetData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select user asset data");
    }

    @And("User input purchase price asset data")
    public void user_input_purchase_price_asset_data() {
        Hooks.delay(1);
        gaPage.InputPurchasePriceAssetData("16700000");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input purchase price asset data");
    }

    @And("User select purchase date asset data")
    public void user_select_purchase_date_asset_data() {
        Hooks.delay(1);
        gaPage.BtnPurchaseDateAssetData();
        Hooks.delay(2);
        gaPage.BtnTodayPurchaseDateAssetData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select purchase date asset data");
    }

    @Then("User save asset data")
    public void user_save_asset_data() {
        Hooks.delay(1);
        gaPage.BtnSaveAssetData();
        Hooks.delay(2);
        gaPage.BtnConfirmSaveAssetData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save asset data");
    }

//Edit Asset Data
    @When("User click button edit asset data")
    public void user_click_button_edit_asset_data() {
        Hooks.delay(2);
        gaPage.BtnEditAssetData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit master asset data");
    }

    @And("User edit serial asset data")
    public void user_edit_serial_asset_data() {
        Hooks.delay(2);
        gaPage.ClearInputSerialAssetData();
        Hooks.delay(2);
        gaPage.InputSerialAssetData("MR-928381");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit serial asset data");
    }

    @Then("User save edit asset data")
    public void user_save_edit_asset_data() {
       Hooks.delay(1);
        try {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        robot.delay(200);
    } catch (AWTException e) {
        throw new RuntimeException(e);
    }
        gaPage.BtnSaveEditAssetData();
        Hooks.delay(2);
        gaPage.BtnConfirmSaveEditAssetData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit asset data");
    }

//View Asset Data
    @When("User click button view asset data")
    public void user_click_button_view_asset_data() {
        Hooks.delay(1);
        gaPage.BtnViewAssetData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button view asset data");
    }

    @And("User get text title page view asset data")
    public void user_get_text_title_page_view_asset_data() {
        Hooks.delay(1);
        Assert.assertEquals(gaPage.getTxtViewAssetData(), "View Asset Data");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User get text title page view asset data");
    }

    @Then("User back to asset data page")
    public void user_back_to_asset_data_page() {
       Hooks.delay(1);
        try {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        robot.delay(200);
    } catch (AWTException e) {
        throw new RuntimeException(e);
    }
        gaPage.BtnBackViewAssetData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User back to asset data page");
    }

//Delete Asset Data
    @When("User click button delete asset data")
    public void user_click_button_delete_asset_data() {
        Hooks.delay(2);
        gaPage.BtnDeleteAssetData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button delete asset data");
    }

    @Then("User click button confirm delete asset data")
    public void user_click_button_confirm_delete_asset_data() {
        Hooks.delay(2);
        gaPage.BtnConfirmDeleteAssetData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete asset data");
    }

//Enter Asset Maintenance Page
    @When("User click tab asset maintenance")
    public void user_click_tab_asset_maintenance() {
        Hooks.delay(1);
        gaPage.TabAssetMaintenance();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab asset maintenance");
    }

    @Then("User get text title page asset maintenance")
    public void user_get_text_title_page_asset_maintenance() {
        Hooks.delay(1);
        Assert.assertEquals(gaPage.getTxtAssetMaintenance(), "Asset Maintenance");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page asset maintenance");
    }

//Create Asset Maintenance
    @When("User click button create asset maintenance")
    public void user_click_button_create_asset_maintenance() {
        Hooks.delay(1);
        gaPage.BtnCreateAssetMaintenance();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create asset maintenance");
    }

    @And("User select asset id asset maintenance")
    public void user_select_asset_id_asset_maintenance() {
        Hooks.delay(1);
        gaPage.BtnSearchAssetMaintenance();
        Hooks.delay(2);
        gaPage.SelectAssetForMaintenance();
        Hooks.delay(2);
        gaPage.BtnSelectAssetForMaintenance();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select asset id asset maintenance");
    }

    @And("User select date asset maintenance")
    public void user_select_date_asset_maintenance() {
        Hooks.delay(1);
        gaPage.BtnDateAssetMaintenance();
        Hooks.delay(2);
        gaPage.BtnTodayDateAssetMaintenance();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select date asset maintenance");
    }

    @And("User input information asset maintenance")
    public void user_input_information_asset_maintenance() {
        Hooks.delay(1);
        gaPage.InputInformationAssetMaintenance("Perbaikan meja");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input information asset maintenance");
    }

    @And("User input vendor location asset maintenance")
    public void user_input_vendor_location_asset_maintenance() {
        Hooks.delay(1);
        gaPage.InputVendorLocationAssetMaintenance("Tukang Kayu Jati Malin");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input vendor location asset maintenance");
    }

    @And("User input estimated costs asset maintenance")
    public void user_input_estimated_costs_asset_maintenance() {
        Hooks.delay(1);
        gaPage.BtnAddEstimatedCostsAssetMaintenance();
        Hooks.delay(2);
        gaPage.InputInformationEstimatedCostsAssetMaintenance("Jasa");
        Hooks.delay(2);
        gaPage.InputTotalCostEstimatedCostsAssetMaintenance("254000");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input estimated costs asset maintenance");
    }

    @And("User upload proof of payment asset maintenance")
    public void user_upload_proof_of_payment_asset_maintenance() {
        Hooks.delay(1);
        gaPage.UploadProofOfPaymentEstimatedCostsAssetMaintenance("C:\\Users\\M1403QA\\Downloads\\Document RKPD 17-07-2024.pdf");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User upload proof of payment asset maintenance");
    }

    @Then("User save asset maintenance data")
    public void user_save_asset_maintenance_data() {
        Hooks.delay(1);
        gaPage.BtnSaveAssetMaintenance();
        Hooks.delay(2);
        gaPage.BtnConfirmSaveAssetMaintenance();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save asset maintenance data");
    }

//Edit Asset Maintenance Data
    @When("User click button edit asset maintenance")
    public void user_click_button_edit_asset_maintenance() {
        Hooks.delay(2);
        gaPage.BtnEditAssetMaintenance();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit master asset maintenance");
    }

    @And("User edit information asset maintenance")
    public void user_edit_information_asset_maintenance() {
        Hooks.delay(2);
        gaPage.ClearInputInformationAssetMaintenance();
        Hooks.delay(2);
        gaPage.InputInformationAssetMaintenance("Jasa Perbaikan Meja");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit information asset maintenance");
    }

    @Then("User save edit asset maintenance data")
    public void user_save_edit_asset_maintenance_data() {
        Hooks.delay(2);
        gaPage.BtnSaveEditAssetMaintenance();
        Hooks.delay(2);
        gaPage.BtnConfirmSaveEditAssetMaintenance();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit asset maintenance data");
    }

//Delete Asset Maintenance
    @When("User click button delete asset maintenance")
    public void user_click_button_delete_asset_maintenance() {
        Hooks.delay(2);
        gaPage.BtnDeleteAssetMaintenance();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button delete asset maintenance");
    }

    @Then("User click button confirm delete asset maintenance")
    public void user_click_button_confirm_delete_asset_maintenance() {
        Hooks.delay(2);
        gaPage.BtnConfirmDeleteAssetMaintenance();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete asset maintenance");
    }

//Enter Master Consumable Page
    @When("User click tab master consumable")
    public void user_click_tab_master_consumable() {
        Hooks.delay(1);
        gaPage.TabMasterConsumable();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab master consumable");
    }

    @Then("User get text title page master consumable")
    public void user_get_text_title_page_master_consumable() {
        Hooks.delay(1);
        Assert.assertEquals(gaPage.getTxtMasterConsumable(), "Master Consumable");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page master consumable");
    }

//Add Master Consumable
    @When("User click button add master consumable")
    public void user_click_button_add_master_consumable() {
        Hooks.delay(1);
        gaPage.BtnAddMasterConsumable();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button add master consumable");
    }

    @And("User input item name master consumable")
    public void user_input_item_name_master_consumable() {
        Hooks.delay(1);
        gaPage.InputItemNameMasterConsumable("Pena");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input item name master consumable");
    }

    @And("User input item unit master consumable")
    public void user_input_item_unit_master_consumable() {
        Hooks.delay(1);
        gaPage.InputItemUnitMasterConsumable("pcs");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input item unit master consumable");
    }

    @And("User select category master consumable")
    public void user_select_category_master_consumable() {
        Hooks.delay(1);
        gaPage.BtnSelectCategoryMasterConsumable();
        Hooks.delay(2);
        gaPage.SelectCategoryMasterConsumable();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select category master consumable");
    }

    @And("User select type master consumable")
    public void user_select_type_master_consumable() {
        Hooks.delay(1);
        gaPage.BtnSelectTypeMasterConsumable();
        Hooks.delay(2);
        gaPage.SelectTypeMasterConsumable();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select type master consumable");
    }

    @Then("User save master consumable data")
    public void user_save_master_consumable_data() {
        Hooks.delay(1);
        gaPage.BtnSaveMasterConsumable();
        Hooks.delay(2);
        gaPage.BtnConfirmSaveMasterConsumable();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save master consumable data");
    }

//View Master Consumable
    @When("User click button view master consumable")
    public void user_click_button_view_master_consumable() {
        Hooks.delay(1);
        gaPage.BtnViewMasterConsumable();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button view master consumable");
    }

    @And("User get text title page view master consumable")
    public void user_get_text_title_page_view_master_consumable() {
        Hooks.delay(1);
        Assert.assertEquals(gaPage.getTxtViewMasterConsumable(), "View Master Consumable");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User get text title page view master consumable");
    }

    @Then("User back to master consumable page")
    public void user_back_to_master_consumable_page() {
       Hooks.delay(1);
        try {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        robot.delay(200);
    } catch (AWTException e) {
        throw new RuntimeException(e);
    }
        gaPage.BtnBackViewMasterConsumable();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User back to master consumable page");
    }

//Enter Consumable Page
    @When("User click tab consumable")
    public void user_click_tab_consumable() {
        Hooks.delay(1);
        gaPage.TabConsumable();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab consumable");
    }

    @Then("User get text title page consumable")
    public void user_get_text_title_page_consumable() {
        Hooks.delay(1);
        Assert.assertEquals(gaPage.getTxtConsumablePage(), "Consumable");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page consumable");
    }

//Add Stock Consumable
    @When("User click button add stock consumable")
    public void user_click_button_add_stock_consumable() {
        Hooks.delay(1);
        gaPage.BtnAddStockConsumable();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button add stock consumable");
    }

    @And("User select purchase date add stock consumable")
    public void user_select_purchase_date_add_stock_consumable() {
        Hooks.delay(1);
        gaPage.BtnPurchaseDateAddStock();
        Hooks.delay(2);
        gaPage.BtnTodayDateAddStock();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User select purchase date add stock consumable");
    }

    @And("User select item add stock consumable")
    public void user_select_item_add_stock_consumable() {
        Hooks.delay(1);
        gaPage.BtnSelectItemConsumable();
        Hooks.delay(2);
        gaPage.SelectItemConsumable();
        Hooks.delay(2);
        gaPage.BtnSelectAddItemConsumable();
        Hooks.delay(2);
        gaPage.InputTotalAddStockConsumable("4");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User select item add stock consumable");
    }

    @And("User upload invoice add stock consumable")
    public void user_upload_invoice_add_stock_consumable() {
        Hooks.delay(1);
        gaPage.BtnUploadInvoiceAddStockConsumable("C:\\Users\\M1403QA\\Downloads\\Document RKPD 17-07-2024.pdf");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User upload invoice add stock consumable");
    }

    @And("User select location add stock consumable")
    public void user_select_location_add_stock_consumable() {
        Hooks.delay(1);
        gaPage.BtnChooseLocationAddStock();
        Hooks.delay(2);
        gaPage.SelectLocationAddStockConsumable();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select location add stock consumable");
    }

    @And("User input note add stock consumable")
    public void user_input_note_add_stock_consumable() {
        Hooks.delay(1);
        gaPage.InputNoteAddStockConsumable("Penambahan Barang");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note add stock consumable");
    }

    @Then("User save add stock consumable")
    public void user_save_add_stock_consumable() {
        Hooks.delay(1);
        gaPage.BtnSaveAddStockConsumable();
        Hooks.delay(2);
        gaPage.BtnConfirmSaveAddStockConsumable();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save add stock consumable");
    }

//Edit Add Stock Consumable Data
    @When("User click button edit add stock")
    public void user_click_button_edit_add_stock() {
        Hooks.delay(2);
        gaPage.BtnEditAddStock();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit add stock");
    }

    @And("User edit total add stock")
    public void user_edit_total_add_stock() {
        Hooks.delay(2);
        gaPage.ClearInputTotalAddStockConsumable();
        Hooks.delay(2);
        gaPage.InputTotalAddStockConsumable("6");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit total add stock");
    }

    @Then("User save edit asset add stock data")
    public void user_save_edit_asset_add_stock_data() {
        Hooks.delay(2);
        gaPage.BtnSaveEditAddStock();
        Hooks.delay(2);
        gaPage.BtnConfirmSaveEditAddStock();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit asset add stock data");
    }

    //Add Consume Data
    @When("User click button consume")
    public void user_click_button_consume() {
        Hooks.delay(1);
        gaPage.BtnConsume();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button consume");
    }

    @And("User select date of item departure consume")
    public void user_select_date_of_item_departure_consume() {
        Hooks.delay(1);
        gaPage.BtnDateOfItemDepartureConsume();
        Hooks.delay(2);
        gaPage.BtnTodayDateOfItemDeparture();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User select date of item departure consume");
    }

    @And("User select item consume")
    public void user_select_item_consume() {
        Hooks.delay(1);
        gaPage.BtnSelectItemConsume();
        Hooks.delay(2);
        gaPage.SelectItemConsume();
        Hooks.delay(2);
        gaPage.BtnSelectAddItemConsume();
        Hooks.delay(1);
        gaPage.ClearInputTotalConsume();
        Hooks.delay(1);
        gaPage.InputTotalConsume("3");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User select item consume");
    }

    @And("User select pic consume")
    public void user_select_pic_consume() {
        Hooks.delay(1);
        gaPage.BtnSelectPicConsume();
        Hooks.delay(2);
        gaPage.SelectPicConsume();
        Hooks.delay(2);
        gaPage.BtnConfirmSelectPicConsume();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select pic consume");
    }

    @And("User select location consume")
    public void user_select_location_consume() {
        Hooks.delay(1);
        gaPage.BtnSelectLocationConsume();
        Hooks.delay(2);
        gaPage.SelectLocationConsume();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select location consume");
    }

    @And("User input note consume")
    public void user_input_note_consume() {
        Hooks.delay(1);
        gaPage.InputNoteConsume("Pemakaian Barang");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note consume");
    }

    @Then("User save consume data")
    public void user_save_consume_data() {
        Hooks.delay(1);
        gaPage.BtnSaveConsumeData();
        Hooks.delay(2);
        gaPage.BtnConfirmSaveConsumeData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save consume data");
    }

//Add Moving Stock Data
    @When("User click moving stock")
    public void user_click_moving_stock() {
        Hooks.delay(1);
        gaPage.BtnMovingStock();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click moving stock");
    }

    @And("User select date moving stock")
    public void user_select_date_moving_stock() {
        Hooks.delay(1);
        gaPage.BtnDateMovingStock();
        Hooks.delay(2);
        gaPage.BtnTodayDateMovingStock();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User select date moving stock");
    }

    @And("User select intial location moving stock")
    public void user_select_intial_location_moving_stock() {
        Hooks.delay(1);
        gaPage.BtnSelectIntialLocationMovingStock();
        Hooks.delay(2);
        gaPage.SelectIntialLocationMovingStock();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select intial location moving stock");
    }

    @And("User select item moving stock")
    public void user_select_item_moving_stock() {
        Hooks.delay(1);
        gaPage.BtnSelectItemMovingStock();
        Hooks.delay(2);
        gaPage.SelectItemMovingStock();
        Hooks.delay(2);
        gaPage.BtnConfirmSelectItemMovingStock();
        Hooks.delay(2);
        gaPage.ClearInputTotalMovingStock();
        Hooks.delay(2);
        gaPage.InputTotalMovingStock("3");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select item moving stock");
    }

    @And("User select relocation location moving stock")
    public void user_select_relocation_location_moving_stock() {
        Hooks.delay(1);
        gaPage.BtnSelectRelocationMovingStock();
        Hooks.delay(2);
        gaPage.SelectRelocationMovingStock();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select relocation location moving stock");
    }

    @And("User input note moving stock")
    public void user_input_note_moving_stock() {
        Hooks.delay(1);
        gaPage.InputNoteMovingStock("Perpindahan barang");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note moving stock");
    }

    @Then("User save moving stock data")
    public void user_save_moving_stock_data() {
        Hooks.delay(1);
        gaPage.BtnSaveMovingStockData();
        Hooks.delay(2);
        gaPage.BtnConfirmSaveMovingStockData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save moving stock data");
    }

//Enter GA Document Page
    @When("User click tab ga document")
    public void user_click_tab_ga_document() {
        Hooks.delay(1);
        gaPage.TabGaDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab ga document");
    }

    @Then("User get text title page ga document")
    public void user_get_text_title_page_ga_document() {
        Hooks.delay(1);
        Assert.assertEquals(gaPage.getTxtGaDocumentPage(), "Consumable");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page ga document");
    }

//Create GA Document Number
    @When("User click button create ga document number")
    public void user_click_button_create_ga_document_number() {
        Hooks.delay(1);
        gaPage.BtnCreateGaDocumentNumber();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create ga document number");
    }

    @And("User input master document name ga document number")
    public void user_input_master_document_name_ga_document_number() {
        Hooks.delay(1);
        gaPage.InputGaMasterDocumentName("Surat izin kendaraan");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input master document name ga document number");
    }

    @And("User input format document number ga document number")
    public void user_input_format_document_number_ga_document_number() {
        Hooks.delay(1);
        gaPage.InputGaFormatDocumentNumber("xxxx/SIK/MM/YYYY");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input format document number ga document number");
    }

    @Then("User save ga document number data")
    public void user_save_ga_document_number_data() {
        Hooks.delay(1);
        gaPage.BtnSaveGaDocumentNumber();
        Hooks.delay(2);
        gaPage.BtnConfirmSaveGaDocumentNumber();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save ga document number data");
    }

//Edit GA Document Number Data
    @When("User click button edit ga document number")
    public void user_click_button_edit_ga_document_number() {
        Hooks.delay(2);
        gaPage.BtnEditGaDocumentNumber();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit ga document number");
    }

    @And("User edit master document name ga document number")
    public void user_edit_master_document_name_ga_document_number() {
        Hooks.delay(2);
        gaPage.ClearInputGaFormatDocumentNumber();
        Hooks.delay(2);
        gaPage.InputGaFormatDocumentNumber("xxxx/PR/MM/YYYY");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit master document name ga document number");
    }

    @Then("User save edit ga document number data")
    public void user_save_edit_ga_document_number_data() {
        Hooks.delay(2);
        gaPage.BtnSaveEditGaDocumentNumberData();
        Hooks.delay(2);
        gaPage.BtnConfirmSaveEditGaDocumentNumberData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit ga document number data");
    }

//Delete GA Document Number
    @When("User click button delete ga document number")
    public void user_click_button_delete_ga_document_number() {
        Hooks.delay(2);
        gaPage.BtnDeleteGaDocumentNumber();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button delete ga document number");
    }

    @Then("User click button confirm delete ga document number")
    public void user_click_button_confirm_delete_ga_document_number() {
        Hooks.delay(2);
        gaPage.BtnConfirmDeleteGaDocumentNumber();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete ga document number");
    }

//Enter GA List Document Page
    @When("User click tab ga list document")
    public void user_click_tab_ga_list_document() {
        Hooks.delay(1);
        gaPage.TabGaListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab ga list document");
    }

    @Then("User get text title page ga list document page")
    public void user_get_text_title_page_ga_list_document_page() {
        Hooks.delay(1);
        Assert.assertEquals(gaPage.getTxtGaListDocumentPage(), "List Document");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page ga list document page");
    }

//Create GA List Document
    @When("User click button create ga list document")
    public void user_click_button_create_ga_list_document() {
        Hooks.delay(1);
        gaPage.BtnCreateGaListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create ga list document");
    }

    @And("User choose master document name ga list document")
    public void user_choose_master_document_name_ga_list_document() {
        Hooks.delay(1);
        gaPage.BtnSelectMasterDocumentNameGaListDocument();
        Hooks.delay(2);
        gaPage.SelectMasterDocumentNameGaListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User choose master document name ga list document");
    }

    @And("User input document name ga list document")
    public void user_input_document_name_ga_list_document() {
        Hooks.delay(1);
        gaPage.InputDocumentNameGaListDocument("Surat Keputusan MK");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input document name ga list document");
    }

    @Then("User save ga list document data")
    public void user_save_ga_list_document_data() {
        Hooks.delay(1);
        gaPage.BtnSaveGaListDocument();
        Hooks.delay(2);
        gaPage.BtnConfirmSaveGaListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save ga list document data");
    }

//Upload document GA List Document
    @When("User click button upload ga list document")
    public void user_click_button_upload_ga_list_document() {
        Hooks.delay(1);
        gaPage.BtnUploadGaListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button upload ga list document");
    }

    @And("User choose file upload document ga list document")
    public void user_choose_file_upload_document_GA_list_document() {
        Hooks.delay(1);
        gaPage.BtnChooseFileGaListDocument("C:\\Users\\M1403QA\\Downloads\\Document RKPD 17-07-2024.pdf");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User choose file upload document ga list document");
    }

    @Then("User upload document ga list document")
    public void user_upload_document_ga_list_document() {
        Hooks.delay(1);
        gaPage.BtnSaveUploadGaListDocument();
        Hooks.delay(1);
        gaPage.BtnConfirmSaveUploadGaListDocument();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User upload document ga list document");
    }

//Edit GA List Document Data
    @When("User click button edit ga list document")
    public void user_click_button_edit_ga_list_document() {
        Hooks.delay(2);
        gaPage.BtnEditGaListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit ga list document");
    }

    @And("User edit document name ga list document")
    public void user_edit_document_name_ga_list_document() {
        Hooks.delay(2);
        gaPage.ClearInputDocumentNameGaListDocument();
        Hooks.delay(2);
        gaPage.InputDocumentNameGaListDocument("Test bung");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit document name ga list document");
    }

    @Then("User save edit ga list document data")
    public void user_save_edit_ga_list_document_data() {
        Hooks.delay(2);
        gaPage.BtnSaveEditGaListDocumentData();
        Hooks.delay(2);
        gaPage.BtnConfirmSaveEditGaListDocumentData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit ga list document data");
    }

//Delete GA List Document
    @When("User click button delete ga list document")
    public void user_click_button_delete_ga_list_document() {
        Hooks.delay(2);
        gaPage.BtnDeleteGaListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button delete ga list document");
    }

    @Then("User click button confirm delete ga list document")
    public void user_click_button_confirm_delete_ga_list_document() {
        Hooks.delay(2);
        gaPage.BtnConfirmDeleteGaListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete ga list document");
    }
}