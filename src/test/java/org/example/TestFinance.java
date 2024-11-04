package org.example;

import io.cucumber.java.en.And;
import org.example.pages.FinancePage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;


public class TestFinance {
    static WebDriver driver;
    static ExtentTest extentTest;
    static FinancePage financePage = new FinancePage();

    public TestFinance() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

//Enter Finance Page
    @When("User click tab finance")
    public void User_click_tab_finance() {
        Hooks.delay(1);
        financePage.TabFinance();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab finance");
    }

    @Then("User get text title page finance")
    public void user_get_text_title_page_finance() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtFinance(), "Finance");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page finance");
    }

//Enter HO Report Finance Page
    @When("User click tab ho report finance")
    public void User_click_tab_ho_report_finance() {
        Hooks.delay(1);
        financePage.TabHoReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab ho report finance");
    }

    @Then("User get text title page ho report finance")
    public void user_get_text_title_page_ho_report_finance() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtHoReport(), "HO Report");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page ho report finance");
    }

//Enter Task & Activity Report Finance Page
    @When("User click sub tab task activity report finance")
    public void user_click_sub_tab_task_activity_report_finance() {
        Hooks.delay(1);
        financePage.TabTaskActivityReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click sub tab task activity report finance");
    }

    @Then("User get text title page task activity report finance")
    public void user_get_text_title_page_task_activity_report_finance() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtTaskActivityReport(), "Task & Activity");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page task activity report finance");
    }

//Enter Task & Activity Summary Report Finance Page
    @When("User click sub tab task activity summary report finance")
    public void User_click_sub_tab_task_activity_summary_report_finance() {
        Hooks.delay(1);
        financePage.TabTaskActivitySummaryReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click sub tab task activity summary report finance");
    }

    @Then("User get text title page task activity summary report finance")
    public void user_get_text_title_page_task_activity_summary_report_finance() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtTaskActivitySummaryReport(), "Task & Activity Summary");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page task activity summary report finance");
    }

//Enter Client Report Finance Page
    @When("User click sub tab client report finance")
    public void user_click_sub_tab_client_report_finance() {
        Hooks.delay(1);
        financePage.TabClientReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click sub tab client report finance");
    }

    @Then("User get text title page client report finance")
    public void user_get_text_title_page_client_report_finance() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtClientReport(), "Client");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page client report finance");
    }

//Enter Administrative Report Finance Page
    @When("User click sub tab administrative report finance")
    public void user_click_sub_tab_administrative_report_finance() {
        Hooks.delay(1);
        financePage.TabAdminstrativeReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click sub tab administrative report finance");
    }

    @Then("User get text title page administrative report finance")
    public void user_get_text_title_page_administrative_report_finance() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtAdministrativeReport(), "Admisnistrative");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page administrative report finance");
    }

//Enter Administrative Summary Report Finance Page
    @When("User click sub tab administrative summary report finance")
    public void user_click_sub_tab_administrative_summary_report_finance() {
        Hooks.delay(1);
        financePage.TabAdminstrativeSummaryReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click sub tab administrative summary report finance");
    }

    @Then("User get text title page administrative summary report finance")
    public void user_get_text_title_page_administrative_summary_report_finance() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtAdministrativeSummaryReport(), "Administrative Summary");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page administrative summary report finance");
    }

//Enter Administrative Approval Report Finance Page
    @When("User click sub tab administrative approval report finance")
    public void user_click_sub_tab_administrative_approval_report_finance() {
        Hooks.delay(1);
        financePage.TabAdminstrativeApprovalReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click sub tab administrative approval report finance");
    }

    @Then("User get text title page administrative approval report finance")
    public void user_get_text_title_page_administrative_approval_report_finance() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtAdministrativeApprovalReport(), "Administrative Approval");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page administrative approval report finance");
    }

//Enter HO Reimbursement Finance Page
    @When("User click sub tab ho reimbursement report finance")
    public void user_click_sub_tab_ho_reimbursement_report_finance() {
        Hooks.delay(1);
        financePage.TabHoReimbursementReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click sub tab ho reimbursement report finance");
    }

    @Then("User get text title page ho reimbursement report finance")
    public void user_get_text_title_page_ho_reimbursement_report_finace() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtHoReimbursementReport(), "Admisnistrative");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page ho reimbursement report finance");
    }

//Enter Client Page
    @When("User click tab client")
    public void user_click_tab_client() {
        Hooks.delay(1);
        financePage.TabClient();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab client");
    }

    @Then("User get text title page client")
    public void user_get_text_title_page_client() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtClientPage(), "Client");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page client");
    }

//Add Client
    @When("User click button add client")
    public void user_click_button_add_client() {
        Hooks.delay(1);
        financePage.BtnAddClient();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button add client");
    }

    @And("User input name of client")
    public void user_input_name_of_client() {
        Hooks.delay(1);
        financePage.InputNameOfClient("Pak Yoyok");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input name of client");
    }

    @And("User input email client")
    public void user_input_email_client() {
        Hooks.delay(1);
        financePage.InputEmailClient("pakyoyok@gmail.com");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input email client");
    }

    @And("User input telephone client")
    public void user_input_telephone_client() {
        Hooks.delay(1);
        financePage.InputTelephoneClient("082238499542");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input telephone client");
    }

    @And("User input fax client")
    public void user_input_fax_client() {
        Hooks.delay(1);
        financePage.InputFaxClient("02183912");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input fax client");
    }

    @And("User input npwp client")
    public void user_input_npwp_client() {
        Hooks.delay(1);
        financePage.InputNpwpClient("831984050192839");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input npwp client");
    }

    @And("User input address client")
    public void user_input_address_client() {
        Hooks.delay(1);
        financePage.InputAddressClient("Jl Aru No.18");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input address client");
    }

    @And("User select province client")
    public void user_select_province_client() {
        Hooks.delay(1);
        financePage.BtnSelectProvinceClient();
        Hooks.delay(2);
        financePage.SelectProvinceClient();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select province client");
    }

    @And("User select city client")
    public void user_select_city_client() {
        Hooks.delay(1);
        financePage.BtnSelectCityClient();
        Hooks.delay(2);
        financePage.SelectCityClient();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select city client");
    }

    @And("User select district client")
    public void user_select_district_client() {
        Hooks.delay(1);
        financePage.BtnSelectDistrictClient();
        Hooks.delay(2);
        financePage.SelectDistrictClient();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select district client");
    }

    @And("User select subdistrict client")
    public void user_select_subdistrict_client() {
        Hooks.delay(1);
        financePage.BtnSelectSubdistrictClient();
        Hooks.delay(2);
        financePage.SelectSubdistrictClient();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select subdistrict client");
    }

    @And("User input pic name client")
    public void User_input_pic_name_client() {
        Hooks.delay(2);
        financePage.InputPicNameClient("Adriano");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input pic name client");
    }

    @And("User input telephone pic client")
    public void user_input_telephone_pic_client() {
        Hooks.delay(2);
        financePage.InputTelephonePicClient("081283944859");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input telephone pic client");
    }

    @And("User input email pic client")
    public void user_input_email_pic_client() {
        Hooks.delay(2);
        financePage.InputEmailPicClient("adrianoarnaldo@gmail.com");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input email pic client");
    }

    @Then("User save data client")
    public void user_save_data_client() {
        Hooks.delay(1);
        financePage.BtnSaveDataClient();
        Hooks.delay(2);
        financePage.BtnConfirmSaveDataClient();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save data client");
    }

 //Edit Client
    @When("User click button edit client")
    public void user_click_button_edit_client() {
        Hooks.delay(1);
        financePage.BtnEditClient();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit client");
    }

    @And("User edit email client")
    public void user_edit_email_client() {
        Hooks.delay(2);
        financePage.ClearEmailClient();
        Hooks.delay(2);
        financePage.InputEmailClient("pakyoyok@gmail.com");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit email client");
    }

    @Then("User save edit data client")
    public void user_save_edit_data_client() {
        Hooks.delay(1);
        financePage.BtnSaveDataClient();
        Hooks.delay(2);
        financePage.BtnConfirmSaveDataClient();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit data client");
    }

//Delete Client
    @When("User click button delete client")
    public void user_click_button_delete_client() {
        Hooks.delay(1);
        financePage.BtnDeleteClient();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button delete client");
    }

    @Then("User click button confirm delete client")
    public void user_click_button_confirm_delete_client() {
        Hooks.delay(2);
        financePage.BtnConfirmDeleteClient();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete client");
    }

//Enter HO Completed Page
    @When("User click tab ho completed")
    public void user_click_tab_ho_completed() {
        Hooks.delay(1);
        financePage.TabHoCompleted();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab ho completed");
    }

    @Then("User get text title page ho completed")
    public void user_get_text_title_page_ho_completed() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtHoCompletedPage(), "HO Completed");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page ho completed");
    }

//View HO Completed Page
    @When("User click button view ho completed")
    public void user_click_button_view_ho_completed() {
        Hooks.delay(1);
        financePage.BtnViewHoCompletedPage();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button view ho completed");
    }

    @And("User get text title page view ho completed")
    public void user_get_text_title_page_view_ho_completed() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtViewHoCompletedPage(), "View Completed HO");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User get text title page view ho completed");
    }

    @Then("User back to ho completed page")
    public void user_back_to_ho_completed_page() {
        Hooks.delay(1);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        financePage.BtnBackHoCompletedPage();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User back to ho completed page");
    }

//Enter Finance Document Page
    @When("User click tab finance document")
    public void user_click_tab_finance_document() {
        Hooks.delay(1);
        financePage.TabFinanceDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab finance document");
    }

    @Then("User get text title page finance document")
    public void user_get_text_title_page_finance_document() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtFinanceDocumentPage(), "Document");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page finance document");
    }

 //Create Finance Document Number
    @When("User click button create finance document number")
    public void user_click_button_create_finance_document_number() {
        Hooks.delay(1);
        financePage.BtnCreateFinanceDocumentNumber();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create finance document number");
    }

    @And("User input finance master document name")
    public void user_input_finance_master_document_name() {
        Hooks.delay(1);
        financePage.InputFinanceMasterDocumentName("Surat Pembelian");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input finance master document name");
    }

    @And("User input finance format document number")
    public void user_input_finance_format_document_number() {
        Hooks.delay(1);
        financePage.InputFinanceFormatDocumentNumber("xxxx/PMB/MM/YYYY");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input finance format document number");
    }

    @Then("User save data finance document number")
    public void user_save_data_finance_document_number() {
        Hooks.delay(1);
        financePage.BtnSaveFinanceDocumentNumber();
        Hooks.delay(2);
        financePage.BtnConfirmSaveFinanceDocumentNumber();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save data finance document number");
    }

//Edit Finance Document Number
    @When("User click icon edit finance document number")
    public void user_click_icon_edit_finance_document_number() {
        Hooks.delay(1);
        financePage.BtnEditFinanceDocumentNumber();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click icon edit finance document number");
    }

    @And("User edit finance master document name")
    public void user_edit_finance_master_document_name() {
        Hooks.delay(2);
        financePage.ClearFinanceMasterDocumentName();
        Hooks.delay(2);
        financePage.InputFinanceFormatDocumentNumber("Surat Pembayaran");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit finance master document name");
    }

    @Then("User save edit data finance document number")
    public void user_save_edit_data_finance_document_number() {
        Hooks.delay(1);
        financePage.BtnSaveEditFinanceDocumentNumber();
        Hooks.delay(2);
        financePage.BtnConfirmSaveEditFinanceDocumentNumber();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit data finance document number");
    }

//Delete Finance Document Number
    @When("User click button delete finance document number")
    public void user_click_button_delete_finance_document_number() {
        Hooks.delay(1);
        financePage.BtnDeleteFinanceFormatDocumentNumber();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button delete finance document number");
    }

    @Then("User click button confirm delete finance document number")
    public void User_click_button_confirm_delete_finance_document_number() {
        Hooks.delay(2);
        financePage.BtnConfirmDeleteFinanceFormatDocumentNumber();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete finance document number");
    }

//Enter Finance List Document Page
    @When("User click tab finance list document")
    public void user_click_tab_finance_list_document() {
        Hooks.delay(1);
        financePage.TabFinanceListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab finance list document");
    }

    @Then("User get text title page finance list document")
    public void user_get_text_title_page_finance_list_document() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtFinanceListDocumentPage(), "List Document");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page finance list document");
    }

//Create Finance List Document
    @When("User click button create finance list document")
    public void user_click_button_create_finance_list_document() {
        Hooks.delay(1);
        financePage.BtnCreateFinanceListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create finance list document");
    }

    @And("User select master document name finance list document")
    public void user_select_master_document_name_finance_list_document() {
        Hooks.delay(1);
        financePage.BtnSelectMasterDocumentNameFinanceListDocument();
        Hooks.delay(2);
        financePage.SelectMasterDocumentNameFinanceListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select master document name finance list document");
    }

    @And("User input document name finance list document")
    public void user_input_document_name_finance_list_document() {
        Hooks.delay(1);
        financePage.InputDocumentNameFinanceListDocument("Surat Finance untuk atasan");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input document name finance list document");
    }

    @Then("User save data finance list document")
    public void user_save_data_finance_list_document() {
        Hooks.delay(1);
        financePage.BtnSaveFinanceListDocument();
        Hooks.delay(2);
        financePage.BtnConfirmSaveFinanceListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save data finance list document");
    }

//Upload document Finance List Document
    @When("User click button upload document finance list Document")
    public void user_click_button_upload_document_finance_list_Document() {
        Hooks.delay(1);
        financePage.BtnUploadFinanceListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button upload document finance list Document");
    }

    @And("User click button choose file finance list document")
    public void user_click_button_choose_file_finance_list_document() {
        Hooks.delay(2);
        financePage.BtnChooseFileDocumentFinanceListDocument("C:\\Users\\M1403QA\\Downloads\\KPI HO.xlsx");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button choose file finance list document");
    }

    @Then("User save upload document finance list document")
    public void user_save_upload_document_finance_list_document() {
        Hooks.delay(1);
        financePage.BtnSaveUploadFinanceListDocument();
        Hooks.delay(2);
        financePage.BtnConfirmSaveUploadFinanceListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save upload document finance list document");
    }

//Edit Finance List Document
    @When("User click icon edit finance list document")
    public void user_click_icon_edit_finance_list_document() {
        Hooks.delay(1);
        financePage.BtnEditFinanceListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click icon edit finance list document");
    }

    @And("User edit document name finance list document")
    public void user_edit_document_name_finance_list_document() {
        Hooks.delay(2);
        financePage.ClearDocumentNameFinanceListDocument();
        Hooks.delay(2);
        financePage.InputDocumentNameFinanceListDocument("Surat Pembayaran kantor");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit document name finance list document");
    }

    @Then("User save edit data finance list document")
    public void user_save_edit_data_finance_list_document() {
        Hooks.delay(1);
        financePage.BtnSaveEditFinanceListDocument();
        Hooks.delay(2);
        financePage.BtnConfirmSaveEditFinanceListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit data finance list document");
    }

//Delete Finance List Document
    @When("User click button delete finance list document")
    public void user_click_button_delete_finance_list_document() {
        Hooks.delay(1);
        financePage.BtnDeleteFinanceListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button delete finance list document");
    }

    @Then("User click button confirm delete finance list document")
    public void User_click_button_confirm_delete_finance_list_document() {
        Hooks.delay(2);
        financePage.BtnConfirmDeleteFinanceListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete finance list document");
    }

//Enter Finance Payroll Page
    @When("User click tab finance payroll")
    public void user_click_tab_finance_payroll() {
        Hooks.delay(1);
        financePage.TabFinancePayroll();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab finance payroll");
    }

    @Then("User get text title page finance payroll")
    public void user_get_text_title_page_finance_payroll() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtFinancePayrollPage(), "Payroll");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page finance payroll");
    }

//Create Finance Payroll Periode
    @When("User click button create finance payroll periode")
    public void user_click_button_create_finance_payroll_periode() {
        Hooks.delay(1);
        financePage.BtnCreateFinancePayrollPeriode();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create finance payroll priode");
    }

    @And("User select month finance payroll periode")
    public void user_select_month_finance_payroll_periode() {
        Hooks.delay(1);
        financePage.InputMonthFinancePayrollPeriode("August");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select month finance payroll periode");
    }

    @And("User input first date finance payroll periode")
    public void user_input_first_date_finance_payroll_periode() {
        Hooks.delay(1);
        financePage.InputFirstDateFinancePayrollPeriode("2024-08-01");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input first date finance payroll periode");
    }

    @And("User input end date finance payroll periode")
    public void user_input_end_date_finance_payroll_periode() {
        Hooks.delay(1);
        financePage.InputEndDateFinancePayrollPeriode("2024-08-31");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input end date finance payroll periode");
    }

    @And("User input work days finance payroll periode")
    public void user_input_work_days_finance_payroll_periode() {
        Hooks.delay(1);
        financePage.InputWorkDaysFinancePayrollPeriode("21");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input work days finance payroll periode");
    }

    @Then("User save data finance payroll periode")
    public void user_save_data_finance_payroll_periode() {
        Hooks.delay(1);
        financePage.BtnSaveFinancePayrollPeriode();
        Hooks.delay(2);
        financePage.BtnConfirmSaveFinancePayrollPeriode();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save data finance list document");
    }

//Enter Finance Detail Periode Payroll
    @When("User click icon edit payroll periode")
    public void user_click_icon_edit_payroll_periode() {
        Hooks.delay(1);
        financePage.BtnEditFinanceDetailPayrollPeriode();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click icon edit payroll periode");
    }

    @Then("User get text title page detail periode payroll")
    public void user_get_text_title_page_detail_periode_payroll() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtFinanceDetailPayrollPeriode(), "Detail Periode Payroll 2024-08");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page detail periode payroll");
    }

//Edit Finance Payroll Employee
    @When("User click icon edit finance payroll employee")
    public void user_click_icon_edit_finance_payroll_employee() {
        Hooks.delay(1);
        financePage.BtnEditFinancePayrollEmployee();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click icon edit finance payroll employee");
    }

    @And("User add document other allowances finance payroll employee")
    public void user_add_document_other_allowances_finance_payroll_employee() {
        Hooks.delay(2);
        financePage.InputOtherAllowancesFinancePayrollEmployee("2310000");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User add document other allowances finance payroll employee");
    }

    @Then("User save edit data finance payroll employee")
    public void user_save_edit_data_finance_payroll_employee() {
        Hooks.delay(1);
        financePage.BtnSaveEditFinancePayrollEmployee();
        Hooks.delay(2);
        financePage.BtnConfirmSaveEditFinancePayrollEmployee();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit data finance payroll employee");
    }

//Delete Finance Payroll Periode
    @When("User click button delete payroll periode")
    public void user_click_button_delete_payroll_periode() {
        Hooks.delay(1);
        financePage.BtnDeletePayrollPeriode();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button delete payroll periode");
    }

    @Then("User click button confirm delete payroll periode")
    public void User_click_button_confirm_delete_payroll_periode() {
        Hooks.delay(2);
        financePage.BtnConfirmDeletePayrollPeriode();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete payroll periode");
    }

//Enter Finance Reimbursement Page
    @When("User click tab finance reimbursement")
    public void user_click_tab_finance_reimbursement() {
        Hooks.delay(1);
        financePage.TabFinanceReibursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab finance reimbursement");
    }

    @Then("User get text title page finance reimbursement")
    public void user_get_text_title_page_finance_reimbursement() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtFinanceReimbursementPage(), "Finance Reimbursement");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page finance reimbursement");
    }

//Create Finance Payroll Reimbursement
    @When("User click button create finance reimbursement")
    public void user_click_button_create_finance_reimbursement() {
        Hooks.delay(1);
        financePage.BtnCreateFinanceReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create finance reimbursement");
    }

    @And("User select date finance reimbursement")
    public void user_select_date_finance_reimbursement() {
        Hooks.delay(1);
        financePage.BtnDateFinanceReimbursement();
        Hooks.delay(2);
        financePage.BtnSelectTodayDateFinanceReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select date finance reimbursement");
    }

    @And("User input note finance reimbursement")
    public void user_input_note_finance_reimbursement() {
        Hooks.delay(1);
        financePage.InputNoteFinanceReimbursement("Pembelian Makanan");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note finance reimbursement");
    }

    @And("User select member on duty finance reimbursement")
    public void user_select_member_on_duty_finance_reimbursement() {
        Hooks.delay(1);
        financePage.BtnSelectTeamMemberOnDutyFinanceReimbursement();
        Hooks.delay(2);
        financePage.SelectMemberOnDutyFinanceReimbursement1();
        Hooks.delay(2);
        financePage.SelectMemberOnDutyFinanceReimbursement2();
        Hooks.delay(2);
        financePage.BtnSelectMemberOnDutyFinanceReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select member on duty finance reimbursement");
    }

    @And("User input list of expenses finance reimbursement")
    public void user_input_list_of_expenses_finance_reimbursement() {
        Hooks.delay(1);
        financePage.InputListOfExpensesFinanceReimbursement("Hoka-Hoka Bento");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input list of expenses finance reimbursement");
    }

    @And("User input amount finance reimbursement")
    public void user_input_amount_finance_reimbursement() {
        Hooks.delay(1);
        financePage.InputAmountFinanceReimbursement("56000");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input amount reimbursement");
    }

    @And("User add receipt finance reimbursement")
    public void user_add_receipt_finance_reimbursement() {
        Hooks.delay(1);
        financePage.BtnUploadReceiptFinanceReimbursement("C:\\Users\\M1403QA\\Downloads\\Report Master Document.xlsx");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User add receipt reimbursement");
    }

    @Then("User save data finance reimbursement")
    public void user_save_data_finance_reimbursement() {
        Hooks.delay(1);
        financePage.BtnSaveFinanceReimbursement();
        Hooks.delay(2);
        financePage.BtnConfirmSaveFinanceReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save data finance reimbursement");
    }
}

