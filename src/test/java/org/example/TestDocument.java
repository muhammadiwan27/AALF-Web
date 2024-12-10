package org.example;

import io.cucumber.java.en.And;
import org.example.pages.DocumentPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;


public class TestDocument {
    static WebDriver driver;
    static ExtentTest extentTest;
    static DocumentPage documentPage = new DocumentPage();

    public TestDocument() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

//Enter Document Dashboard Page
    @When("User click tab document")
    public void user_click_tab_document() {
        Hooks.delay(1);
        documentPage.TabDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab document");
    }

    @Then("User get text title page document dashboard")
    public void user_get_text_title_page_document_dashboard() {
        Hooks.delay(1);
        Assert.assertEquals(documentPage.getTxtDocument(), "Dashboard Master Document");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page document dashboard");
    }

//Enter Document Report Page
    @When("User click tab document report")
    public void user_click_tab_document_report() {
        Hooks.delay(1);
        documentPage.TabDocumentReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab document report");
    }

    @Then("User get text title page document report")
    public void user_get_text_title_page_document_report() {
        Hooks.delay(1);
        Assert.assertEquals(documentPage.getTxtDocumentReport(), "Document Report");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page document report");
    }

//Download Document Master Document Number Report
    @When("User select month document master document number report")
    public void user_select_month_document_master_document_number_report() {
        Hooks.delay(1);
        documentPage.InputMonthDocumentMasterDocumentNumber("November 2024");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select month document master document number report");
    }

    @Then("User click button excel document master document number report")
    public void user_click_button_excel_document_master_document_number_report() {
        Hooks.delay(1);
        documentPage.BtnDownloadDocumentMasterDocumentNumber();
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
        extentTest.log(LogStatus.PASS, "User click button excel document master document number report");
    }

//Enter Document Number Page
    @When("User click tab document number")
    public void user_click_tab_document_number() {
        Hooks.delay(1);
        documentPage.TabDocumentNumber();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab document number");
    }

    @Then("User get text title page document number")
    public void user_get_text_title_page_document_number() {
        Hooks.delay(1);
        Assert.assertEquals(documentPage.getTxtDocumentNumberPage(), "Document Number");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page document number");
    }

//Create Document Number
    @When("User click button create document number")
    public void user_click_button_create_document_number() {
        Hooks.delay(1);
        documentPage.BtnCreateDocumentNumberDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create document number");
    }

    @And("User input master document name document number")
    public void user_input_master_document_name_document_number() {
        Hooks.delay(1);
        documentPage.InputMasterDocumentNameDocument("Surat izin kendaraan");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input master document name document number");
    }

    @And("User input format document number document number")
    public void user_input_format_document_number_document_number() {
        Hooks.delay(1);
        documentPage.InputFormatDocumentNumberDocument("xxxx/SIK/MM/YYYY");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input format document number document number");
    }

    @Then("User save document number data")
    public void user_save_document_number_data() {
        Hooks.delay(1);
        documentPage.BtnSaveDocumentNumberDocument();
        Hooks.delay(2);
        documentPage.BtnConfirmSaveDocumentNumberDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save document number data");
    }

//Edit Document Number Data
    @When("User click button edit document number")
    public void user_click_button_edit_document_number() {
        Hooks.delay(2);
        documentPage.BtnEditDocumentNumber();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit document number");
    }

    @And("User edit master document name document number")
    public void user_edit_master_document_name_document_number() {
        Hooks.delay(2);
        documentPage.ClearInputMasterDocumentNameDocument();
        Hooks.delay(2);
        documentPage.InputMasterDocumentNameDocument("Cover Email Kerja");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit master document name document number");
    }

    @Then("User save edit document number data")
    public void user_save_edit_document_number_data() {
        Hooks.delay(2);
        documentPage.BtnSaveEditDocumentNumberData();
        Hooks.delay(2);
        documentPage.BtnConfirmSaveEditDocumentNumberData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit document number data");
    }

//Delete Document Number
    @When("User click button delete document number")
    public void user_click_button_delete_document_number() {
        Hooks.delay(2);
        documentPage.BtnDeleteDocumentNumber();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button delete  document number");
    }

    @Then("User click button confirm delete document number")
    public void user_click_button_confirm_delete_document_number() {
        Hooks.delay(2);
        documentPage.BtnConfirmDeleteDocumentNumber();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete document number");
    }

//Enter List Document Page
    @When("User click tab list document")
    public void user_click_tab_list_document() {
        Hooks.delay(1);
        documentPage.TabListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab list document");
    }

    @Then("User get text title page list document page")
    public void user_get_text_title_page__list_document_page() {
        Hooks.delay(1);
        Assert.assertEquals(documentPage.getTxtListDocumentPage(), "List Document");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page list document page");
    }

//Create List Document
    @When("User click button create list document")
    public void user_click_button_create_list_document() {
        Hooks.delay(1);
        documentPage.BtnCreateListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create list document");
    }

    @And("User choose master document name list document")
    public void user_choose_master_document_name_list_document() {
        Hooks.delay(1);
        documentPage.BtnSelectMasterDocumentNameListDocument();
        Hooks.delay(2);
        documentPage.SelectMasterDocumentNameListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User choose master document name list document");
    }

    @And("User input document name list document")
    public void user_input_document_name_list_document() {
        Hooks.delay(1);
        documentPage.InputDocumentNameListDocument("Surat Keputusan MK");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input document name  list document");
    }

    @Then("User save list document data")
    public void user_save__list_document_data() {
        Hooks.delay(1);
        documentPage.BtnSaveListDocument();
        Hooks.delay(2);
        documentPage.BtnConfirmSaveListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save list document data");
    }

//Upload document List Document
    @When("User click button upload list document")
    public void user_click_button_upload_list_document() {
        Hooks.delay(1);
        documentPage.BtnUploadListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button upload list document");
    }

    @And("User choose file upload document list document")
    public void user_choose_file_upload_document_list_document() {
        Hooks.delay(1);
        documentPage.BtnChooseFileListDocument("C:\\Users\\M1403QA\\Downloads\\Document RKPD 17-07-2024.pdf");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User choose file upload document list document");
    }

    @Then("User upload document list document")
    public void user_upload_document_list_document() {
        Hooks.delay(1);
        documentPage.BtnSaveUploadListDocument();
        Hooks.delay(1);
        documentPage.BtnConfirmSaveUploadListDocument();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User upload document list document");
    }

//Edit List Document Data
    @When("User click button edit list document")
    public void user_click_button_edit_list_document() {
        Hooks.delay(2);
        documentPage.BtnEditListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit list document");
    }

    @And("User edit upload new document list document")
    public void user_edit_upload_new_document_list_document() {
        Hooks.delay(2);
        documentPage.BtnChooseFileUploadNewDocumentListDocument("C:\\Users\\M1403QA\\Downloads\\Document RKPD 17-07-2024.pdf");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit upload new document list document");
    }

    @Then("User save edit list document data")
    public void user_save_edit_list_document_data() {
        Hooks.delay(2);
        documentPage.BtnSaveEditListDocumentData();
        Hooks.delay(2);
        documentPage.BtnConfirmSaveEditListDocumentData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit list document data");
    }

//Delete List Document
    @When("User click button delete list document")
    public void user_click_button_delete_list_document() {
        Hooks.delay(2);
        documentPage.BtnDeleteListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button delete list document");
    }

    @Then("User click button confirm delete list document")
    public void user_click_button_confirm_delete_list_document() {
        Hooks.delay(2);
        documentPage.BtnConfirmDeleteListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete list document");
    }
}