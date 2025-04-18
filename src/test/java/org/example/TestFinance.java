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

//Download Excel & PDF HO Report Finance
    @When("User click button download excel ho report")
    public void user_click_button_download_excel_ho_report() {
        Hooks.delay(1);
        financePage.BtnDownloadExcelHoReport();
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
        extentTest.log(LogStatus.PASS, "User click button download excel ho report");
    }

    @Then("User click button download pdf ho report")
    public void user_click_button_download_pdf_ho_report() {
        Hooks.delay(1);
        financePage.BtnDownloadPdfHoReport();
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
        extentTest.log(LogStatus.PASS, "User click button download pdf ho report");
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

//Download Excel & PDF Task & Activity Report Finance
    @When("User click button download excel task activity report finance")
    public void user_click_button_download_excel_task_activity_report_finance() {
        Hooks.delay(1);
        financePage.BtnDownloadExcelTaskActivityReport();
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
        extentTest.log(LogStatus.PASS, "User click button download excel task activity report finance");
    }

    @Then("User click button download pdf task activity report finance")
    public void user_click_button_download_pdf_task_activity_report_finance() {
        Hooks.delay(1);
        financePage.BtnDownloadPdfTaskActivityReport();
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
        extentTest.log(LogStatus.PASS, "User click button download pdf task activity report finance");
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

//Download Excel & PDF Task Activity Summary Report Finance
    @When("User click button download excel task activity summary report finance")
    public void user_click_button_download_excel_task_activity_summary_report_finance() {
        Hooks.delay(1);
        financePage.BtnDownloadExcelTaskActivitySummaryReport();
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
        extentTest.log(LogStatus.PASS, "User click button download excel task activity summary report finance");
    }

    @Then("User click button download pdf task activity summary report finance")
    public void user_click_button_download_pdf_task_activity_summary_report_finance() {
        Hooks.delay(1);
        financePage.BtnDownloadPdfTaskActivitySummaryReport();
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
        extentTest.log(LogStatus.PASS, "User click button download pdf task activity summary report finance");
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

//Download Excel & PDF Client Report Finance
    @When("User click button download excel client report finance")
    public void user_click_button_download_excel_client_report_finance() {
        Hooks.delay(1);
        financePage.BtnDownloadExcelClientReport();
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
        extentTest.log(LogStatus.PASS, "User click button download excel client report finance");
    }

    @Then("User click button download pdf client report finance")
    public void user_click_button_download_pdf_client_report_finance() {
        Hooks.delay(1);
        financePage.BtnDownloadPdfClientReport();
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
        extentTest.log(LogStatus.PASS, "User click button download pdf client report finance");
    }

//Enter Administrative Report Finance Page
    @When("User click sub tab administrative report finance")
    public void user_click_sub_tab_administrative_report_finance() {
        Hooks.delay(1);
        financePage.TabAdministrativeReport();
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

//Download Excel & PDF Administrative Report Finance
    @When("User click button download excel administrative report finance")
    public void user_click_button_download_excel_administrative_report_finance() {
        Hooks.delay(1);
        financePage.BtnDownloadExcelAdministrativeReport();
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
        extentTest.log(LogStatus.PASS, "User click button download excel administrative report finance");
    }

    @Then("User click button download pdf administrative report finance")
    public void user_click_button_download_pdf_administrative_report_finance() {
        Hooks.delay(1);
        financePage.BtnDownloadPdfAdministrativeReport();
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
        extentTest.log(LogStatus.PASS, "User click button download pdf administrative report finance");
    }

    //Enter Administrative Summary Report Finance Page
    @When("User click sub tab administrative summary report finance")
    public void user_click_sub_tab_administrative_summary_report_finance() {
        Hooks.delay(1);
        financePage.TabAdministrativeSummaryReport();
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

    //Download Excel & PDF Administrative Summary Report Finance
    @When("User click button download excel administrative summary report finance")
    public void user_click_button_download_excel_administrative_summary_report_finance() {
        Hooks.delay(1);
        financePage.BtnDownloadExcelAdministrativeSummaryReport();
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
        extentTest.log(LogStatus.PASS, "User click button download excel administrative summary report finance");
    }

    @Then("User click button download pdf administrative summary report finance")
    public void user_click_button_download_pdf_administrative_summary_report_finance() {
        Hooks.delay(1);
        financePage.BtnDownloadPdfAdministrativeSummaryReport();
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
        extentTest.log(LogStatus.PASS, "User click button download pdf administrative summary report finance");
    }

    //Enter Administrative Approval Report Finance Page
    @When("User click sub tab administrative approval report finance")
    public void user_click_sub_tab_administrative_approval_report_finance() {
        Hooks.delay(1);
        financePage.TabAdministrativeApprovalReport();
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

    //Download Excel & PDF Administrative Approval Report Finance
    @When("User click button download excel administrative approval report finance")
    public void user_click_button_download_excel_administrative_approval_report_finance() {
        Hooks.delay(1);
        financePage.BtnDownloadExcelAdministrativeApprovalReport();
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
        extentTest.log(LogStatus.PASS, "User click button download excel administrative approval report finance");
    }

    @Then("User click button download pdf administrative approval report finance")
    public void user_click_button_download_pdf_administrative_approval_report_finance() {
        Hooks.delay(1);
        financePage.BtnDownloadPdfAdministrativeApprovalReport();
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
        extentTest.log(LogStatus.PASS, "User click button download pdf administrative approval report finance");
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
    public void user_get_text_title_page_ho_reimbursement_report_finance() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtHoReimbursementReport(), "HO Reimbursement");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page ho reimbursement report finance");
    }

    //Download Excel HO Reimbursement Report Finance
    @When("User click button download excel ho reimbursement report finance")
    public void user_click_button_download_excel_ho_reimbursement_report_finance() {
        Hooks.delay(1);
        financePage.BtnDownloadExcelHoReimbursementReport();
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
        extentTest.log(LogStatus.PASS, "User click button download excel ho reimbursement report finance");
    }

    //Enter Finance Report Page
    @When("User click tab finance report")
    public void user_click_tab_finance_report() {
        Hooks.delay(1);
        financePage.TabFinanceReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab finance report");
    }

    @Then("User get text title page finance report")
    public void user_get_text_title_page_finance_report() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtFinanceReportPage(), "Finance Report");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page finance report");
    }

    //Download Excel Finance Reimbursement Report
    @When("User click button download excel finance reimbursement report")
    public void user_click_button_download_excel_finance_reimbursement_report() {
        Hooks.delay(1);
        financePage.BtnDownloadExcelFinanceReimbursementReport();
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
        extentTest.log(LogStatus.PASS, "User click button download excel finance reimbursement report");
    }

    //Enter Finance Master Document Number Report Page
    @When("User click sub tab finance master document number report")
    public void user_click_sub_tab_finance_master_document_number_report() {
        Hooks.delay(1);
        financePage.TabFinanceMasterDocumentNumberReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click sub tab finance master document number report");
    }

    @Then("User get text title page finance master document number report")
    public void user_get_text_title_page_finance_master_document_number_report() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtFinanceMasterDocumentNumberReportPage(), "Finance Report");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page finance master document number report");
    }

    //Download Excel Finance Master Document Number Report
    @When("User click button download excel finance master document number report")
    public void user_click_button_download_excel_finance_master_document_number_report() {
        Hooks.delay(1);
        financePage.BtnDownloadExcelFinanceMasterDocumentNumberReport();
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
        extentTest.log(LogStatus.PASS, "User click button download excel finance master document number report");
    }

    //Enter Finance Payroll Report Page
    @When("User click sub tab finance payroll report")
    public void user_click_sub_tab_finance_payroll_report() {
        Hooks.delay(1);
        financePage.TabFinancePayrollReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click sub tab finance payroll report");
    }

    @Then("User get text title page finance payroll report")
    public void user_get_text_title_page_finance_payroll_report() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtFinancePayrollReportPage(), "Payroll");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page finance payroll report");
    }

    //Download Excel Finance Payroll Report
    @When("User click button download excel finance payroll report")
    public void user_click_button_download_excel_finance_payroll_report() {
        Hooks.delay(1);
        financePage.BtnDownloadExcelFinancePayrollReport();
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
        extentTest.log(LogStatus.PASS, "User click button download excel finance payroll report");
    }

    //Enter HO Deposit Report Page
    @When("User click sub tab ho deposit report")
    public void user_click_sub_tab_ho_deposit_report() {
        Hooks.delay(1);
        financePage.TabHoDepositReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click sub tab ho deposit report");
    }

    @Then("User get text title page ho deposit report")
    public void user_get_text_title_page_ho_deposit_report() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtHoDepositReportPage(), "Deposit");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page ho deposit report");
    }

    //Download Excel HO Deposit Report
    @When("User click button download excel ho deposit report")
    public void user_click_button_download_excel_ho_deposit_report() {
        Hooks.delay(1);
        financePage.BtnDownloadExcelHoDepositReport();
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
        extentTest.log(LogStatus.PASS, "User click button download excel ho deposit report");
    }

    //Enter HO Deposit Receipt Report Page
    @When("User click sub tab ho deposit receipt report")
    public void user_click_sub_tab_ho_deposit_receipt_report() {
        Hooks.delay(1);
        financePage.TabHoDepositReceiptReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click sub tab ho deposit receipt report");
    }

    @Then("User get text title page ho deposit receipt report")
    public void user_get_text_title_page_ho_deposit_receipt_report() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtHoDepositReceiptReportPage(), "Deposit Receipt");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page ho deposit receipt report");
    }

    //Download Excel HO Deposit Receipt Report
    @When("User click button download excel ho deposit receipt report")
    public void user_click_button_download_excel_ho_deposit_receipt_report() {
        Hooks.delay(1);
        financePage.BtnDownloadExcelHoDepositReceiptReport();
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
        extentTest.log(LogStatus.PASS, "User click button download excel ho deposit receipt report");
    }

    //Enter HO Business Trip Reimbursement Report Page
    @When("User click sub tab ho business trip reimbursement report")
    public void user_click_sub_tab_ho_business_trip_reimbursement_report() {
        Hooks.delay(1);
        financePage.TabHoBusinessTripReimbursementReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click sub tab ho business trip reimbursement report");
    }

    @Then("User get text title page ho business trip reimbursement report")
    public void user_get_text_title_page_ho_business_trip_reimbursement_report() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtHoBusinessTripReimbursementReportPage(), "Business Trip Reimburst");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page ho business trip reimbursement report");
    }

    //Download Excel HO Business Trip Reimbursement Report
    @When("User click button download excel ho business trip reimbursement report")
    public void user_click_button_download_excel_ho_business_trip_reimbursement_report() {
        Hooks.delay(1);
        financePage.BtnDownloadExcelHoBusinessTripReimbursementReport();
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
        extentTest.log(LogStatus.PASS, "User click button download excel ho business trip reimbursement report");
    }

    //Enter Finance General Ledger Report Page
    @When("User click sub tab finance general ledger report")
    public void user_click_sub_tab_finance_general_ledger_report() {
        Hooks.delay(1);
        financePage.TabFinanceGeneralLedgerReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click sub tab finance general ledger report");
    }

    @Then("User get text title page finance general ledger report")
    public void user_get_text_title_page_finance_general_ledger_report() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtFinanceGeneralLedgerReportPage(), "Business Trip Reimburst");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page finance general ledger report");
    }

    //Download Excel Finance General Ledger Report
    @When("User click button download excel finance general ledger report")
    public void user_click_button_download_excel_finance_general_ledger_report() {
        Hooks.delay(1);
        financePage.BtnDownloadExcelFinanceGeneralLedgerReport();
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
        extentTest.log(LogStatus.PASS, "User click button download excel finance general ledger report");
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

    //Restore Completed HO
    @When("User click button restore completed ho")
    public void user_click_button_restore_completed_ho() {
        Hooks.delay(1);
        financePage.BtnRestoreHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button restore completed ho");
    }

    @Then("User click button confirm restore completed ho")
    public void user_click_button_confirm_restore_completed_ho() {
        Hooks.delay(1);
        financePage.BtnConfirmRestoreHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm restore completed ho");
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

//Create Finance Reimbursement
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
        Hooks.delay(4);
        extentTest.log(LogStatus.PASS, "User save data finance reimbursement");
    }

//Edit Finance Reimbursement
    @When("User click icon edit finance reimbursement")
    public void user_click_icon_edit_finance_reimbursement() {
        Hooks.delay(1);
        financePage.BtnEditFinanceReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click icon edit finance reimbursement");
    }

    @And("User edit note finance reimbursement")
    public void user_edit_note_finance_reimbursement() {
        Hooks.delay(2);
        financePage.ClearNoteFinanceReimbursement();
        Hooks.delay(2);
        financePage.InputEditNoteFinanceReimbursement("Rembes makan");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit note finance reimbursement");
    }

    @Then("User save edit data finance reimbursement")
    public void user_save_edit_data_finance_reimbursement() {
        Hooks.delay(1);
        financePage.BtnSaveEditFinanceReimbursement();
        Hooks.delay(2);
        financePage.BtnConfirmSaveEditFinanceReimbursement();
        Hooks.delay(4);
        extentTest.log(LogStatus.PASS, "User save edit data finance reimbursement");
    }

//View Finance Reimbursement
    @When("User click button view finance reimbursement")
    public void user_click_button_view_finance_reimbursement() {
        Hooks.delay(2);
        financePage.BtnViewFinanceReimbursement();
        Hooks.delay(2);
        financePage.BtnBackViewFinanceReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button view finance reimbursement");
    }

//Approval Finance Reimbursement
    @When("User click button approval finance reimbursement")
    public void user_click_button_approval_finance_reimbursement() {
        Hooks.delay(2);
        financePage.BtnViewFinanceReimbursement();
        Hooks.delay(2);
        financePage.BtnBackViewFinanceReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button approval finance reimbursement");
    }

    @And("User select approval finance reimbursement")
    public void user_select_approval_finance_reimbursement() {
        Hooks.delay(2);
        financePage.ClearNoteFinanceReimbursement();
        Hooks.delay(2);
        financePage.InputEditNoteFinanceReimbursement("Rembes makan");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select approval finance reimbursement");
    }

    @Then("User click button save approval finance reimbursement")
    public void user_click_button_save_approval_finance_reimbursement() {
        Hooks.delay(1);
        financePage.BtnSaveEditFinanceReimbursement();
        Hooks.delay(2);
        financePage.BtnConfirmSaveEditFinanceReimbursement();
        Hooks.delay(4);
        extentTest.log(LogStatus.PASS, "User click button save approval finance reimbursement");
    }

 //Delete Finance Reimbursement
    @When("User click button delete finance reimbursement")
    public void user_click_button_delete_finance_reimbursement() {
        Hooks.delay(1);
        financePage.BtnDeleteFinanceReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button delete finance reimbursement");
    }

    @Then("User click button confirm delete finance reimbursement")
    public void user_click_button_confirm_delete_finance_reimbursement() {
        Hooks.delay(2);
        financePage.BtnConfirmDeleteFinanceReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete finance reimbursement");
    }

//Enter HO Reimbursement Payment Page
    @When("User click tab finance payment")
    public void user_click_tab_finance_payment() {
        Hooks.delay(1);
        financePage.TabFinancePayment();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab finance payment");
    }

    @Then("User get text title page ho reimbursement payment")
    public void user_get_text_title_page_ho_reimbursement_payment() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtFinancePaymentPage(), "HO Reimbursement");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page ho reimbursement payment");
    }

//Proceed Payment HO Reimbursement
    @When("User click button payment ho reimbursement")
    public void user_click_button_payment_ho_reimbursement() {
        Hooks.delay(1);
        financePage.BtnPaymentNeedToPaymentHoReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button payment ho reimbursement");
    }

    @And("User upload document payment ho reimbursement")
    public void user_upload_document_payment_ho_reimbursement() {
        Hooks.delay(2);
        financePage.BtnUploadDocumentPaymentHoReimbursement("C:\\Users\\M1403QA\\Downloads\\Document Rekap Sakit User.xlsx");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User upload document payment ho reimbursement");
    }

    @And("User input amount approve payment ho reimbursement")
    public void User_input_amount_approve_payment_ho_reimbursement() {
        Hooks.delay(2);
        financePage.InputAmountApprovePaymentHoReimbursement("25000");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input amount approve payment ho reimbursement");
    }

    @Then("User create payment ho reimbursement")
    public void user_create_payment_ho_reimbursement() {
        Hooks.delay(1);
        financePage.BtnCreatePaymentHoReimbursement();
        Hooks.delay(1);
        financePage.BtnConfirmCreatePaymentHoReimbursement();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User create payment ho reimbursement");
    }

//Edit Payment HO Reimbursement
    @When("User click icon edit payment ho reimbursement")
    public void user_click_icon_edit_payment_ho_reimbursement() {
        Hooks.delay(1);
        financePage.TabPaymentHoReimbursement();
        Hooks.delay(2);
        financePage.BtnPencilPaymentHoReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click icon edit payment ho reimbursement");
    }

    @And("User edit amount approve payment ho reimbursement")
    public void user_edit_amount_approve_payment_ho_reimbursement() {
        Hooks.delay(2);
        financePage.ClearInputAmountApprovePaymentHoReimbursement();
        Hooks.delay(2);
        financePage.InputAmountApprovePaymentHoReimbursement("62800");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit amount approve payment ho reimbursement");
    }

    @Then("User save edit data payment ho reimbursement")
    public void user_save_edit_data_payment_ho_reimbursement() {
        Hooks.delay(1);
        financePage.BtnSaveEditPaymentHoReimbursement();
        Hooks.delay(2);
        financePage.BtnConfirmSaveEditPaymentHoReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit data payment ho reimbursement");
    }

//Approval Payment HO Reimbursement
    @When("User click button approval payment ho reimbursement")
    public void user_click_button_approval_payment_ho_reimbursement() {
        Hooks.delay(2);
        financePage.BtnApprovalPaymentHoReimbursement();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button approval payment ho reimbursement");
    }

    @And("User select approval payment ho reimbursement")
    public void user_select_approval_payment_ho_reimbursement() {
        Hooks.delay(2);
        financePage.BtnSelectPartnerApprovalPaymentHoReimbursement();
        Hooks.delay(2);
        financePage.SelectPartnerApprovalPaymentHoReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select approval payment ho reimbursement");
    }

    @Then("User click button save approval payment ho reimbursement")
    public void user_click_button_save_approval_payment_ho_reimbursement() {
        Hooks.delay(3);
        financePage.BtnSavePartnerApprovalPaymentHoReimbursement();
        Hooks.delay(2);
        financePage.BtnConfirmPartnerApprovalPaymentHoReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save approval payment ho reimbursement");
    }

//View Approved Payment HO Reimbursement
    @When("User click button view approved payment ho reimbursement")
    public void user_click_button_view_approved_payment_ho_reimbursement() {
        Hooks.delay(1);
        financePage.BtnViewApprovedPaymentHoReimbursement();
        Hooks.delay(2);
        financePage.BtnBackViewApprovedPaymentHoReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button view approved payment ho reimbursement");
    }

//Enter Finance Reimbursement Payment Page
    @When("User click tab finance reimbursement payment")
    public void user_click_tab_finance_reimbursement_payment() {
        Hooks.delay(1);
        financePage.TabFinanceReimbursementPayment();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab finance reimbursement payment");
    }

    @Then("User get text title page finance reimbursement payment")
    public void user_get_text_title_page_finance_reimbursement_payment() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.geTxtFinanceReimbursementPaymentPage(), "Finance Reimbursement");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page finance reimbursement payment");
    }

//Proceed Payment Finance Reimbursement
    @When("User click button payment finance reimbursement")
    public void user_click_button_payment_finance_reimbursement() {
        Hooks.delay(1);
        financePage.BtnPaymentNeedToPaymentFinanceReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button payment finance reimbursement");
    }

    @And("User upload document payment finance reimbursement")
    public void user_upload_document_payment_finance_reimbursement() {
        Hooks.delay(2);
        financePage.BtnUploadDocumentPaymentFinanceReimbursement("C:\\Users\\M1403QA\\Downloads\\Document Rekap Sakit User.xlsx");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User upload document payment finance reimbursement");
    }

    @And("User input amount approve payment finance reimbursement")
    public void User_input_amount_approve_payment_finance_reimbursement() {
        Hooks.delay(2);
        financePage.InputAmountApprovePaymentFinanceReimbursement("725000");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input amount approve payment finance reimbursement");
    }

    @Then("User create payment finance reimbursement")
    public void user_create_payment_finance_reimbursement() {
        Hooks.delay(1);
        financePage.BtnCreatePaymentFinanceReimbursement();
        Hooks.delay(1);
        financePage.BtnConfirmCreatePaymentFinanceReimbursement();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User create payment finance reimbursement");
    }

//Edit Payment Finance Reimbursement
    @When("User click icon edit payment finance reimbursement")
    public void user_click_icon_edit_payment_finance_reimbursement() {
        Hooks.delay(1);
        financePage.TabPaymentFinanceReimbursement();
        Hooks.delay(2);
        financePage.BtnPencilPaymentFinanceReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click icon edit payment finance reimbursement");
    }

    @And("User edit amount approve payment finance reimbursement")
    public void user_edit_amount_approve_payment_finance_reimbursement() {
        Hooks.delay(2);
        financePage.ClearInputAmountApprovePaymentFinanceReimbursement();
        Hooks.delay(2);
        financePage.InputAmountApprovePaymentFinanceReimbursement("25000");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit amount approve payment finance reimbursement");
    }

    @Then("User save edit data payment finance reimbursement")
    public void user_save_edit_data_payment_finance_reimbursement() {
        Hooks.delay(1);
        financePage.BtnSaveEditPaymentFinanceReimbursement();
        Hooks.delay(2);
        financePage.BtnConfirmSaveEditPaymentFinanceReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit data payment finance reimbursement");
    }

//Approval Payment Finance Reimbursement
    @When("User click button approval payment finance reimbursement")
    public void user_click_button_approval_payment_finance_reimbursement() {
        Hooks.delay(2);
        financePage.BtnApprovalPaymentFinanceReimbursement();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button approval payment finance reimbursement");
    }

    @And("User select approval payment finance reimbursement")
    public void user_select_approval_payment_finance_reimbursement() {
        Hooks.delay(2);
        financePage.BtnSelectPartnerApprovalPaymentFinanceReimbursement();
        Hooks.delay(2);
        financePage.SelectPartnerApprovalPaymentFinanceReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select approval payment finance reimbursement");
    }

    @Then("User click button save approval payment finance reimbursement")
    public void user_click_button_save_approval_payment_finance_reimbursement() {
        Hooks.delay(3);
        financePage.BtnSavePartnerApprovalPaymentFinanceReimbursement();
        Hooks.delay(2);
        financePage.BtnConfirmPartnerApprovalPaymentFinanceReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save approval payment finance reimbursement");
    }

//View Approved Payment Finance Reimbursement
    @When("User click button view approved payment finance reimbursement")
    public void user_click_button_view_approved_payment_finance_reimbursement() {
        Hooks.delay(1);
        financePage.BtnViewApprovedPaymentFinanceReimbursement();
        Hooks.delay(2);
        financePage.BtnBackViewApprovedPaymentFinanceReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button view approved payment finance reimbursement");
    }

//Enter Disbursement Trip Payment Page
    @When("User click tab disbursement trip payment")
    public void user_click_tab_finance_disbursement_trip_payment() {
        Hooks.delay(1);
        financePage.TabFinanceDisbursementTripPayment();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab finance disbursement trip payment");
    }

    @Then("User get text title page finance disbursement trip payment")
    public void user_get_text_title_page_finance_disbursement_trip_payment() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtFinanceDisbursementTripPaymentPage(), "Disbursement Trip");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page finance disbursement trip payment");
    }

//Proceed Payment Disbursement Trip
    @When("User click button payment disbursement trip")
    public void user_click_button_payment_disbursement_trip() {
        Hooks.delay(1);
        financePage.BtnPaymentNeedToPaymentDisbursementTrip();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button payment disbursement trip");
    }

    @And("User input amount approve payment disbursement trip")
    public void User_input_amount_approve_payment_disbursement_trip() {
        Hooks.delay(2);
        financePage.ClearInputAmountApprovePaymentDisbursementTrip();
        Hooks.delay(2);
        financePage.InputAmountApprovePaymentDisbursementTrip("1725000");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input amount approve payment disbursement trip");
    }

    @And("User upload document payment disbursement trip")
    public void user_upload_document_payment_disbursement_trip() {
        Hooks.delay(2);
        financePage.BtnUploadDocumentPaymentDisbursementTrip("C:\\Users\\M1403QA\\Downloads\\Document Rekap Sakit User.xlsx");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User upload document payment disbursement trip");
    }

    @Then("User create payment disbursement trip")
    public void user_create_payment_disbursement_trip() {
        Hooks.delay(1);
        financePage.BtnCreatePaymentDisbursementTrip();
        Hooks.delay(1);
        financePage.BtnConfirmCreatePaymentDisbursementTrip();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User create payment disbursement trip");
    }

//Edit Payment Disbursement Trip
    @When("User click icon edit payment disbursement trip")
    public void user_click_icon_edit_payment_disbursement_trip() {
        Hooks.delay(1);
        financePage.TabPaymentDisbursementTrip();
        Hooks.delay(2);
        financePage.BtnPencilPaymentDisbursementTrip();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click icon edit payment disbursement trip");
    }

    @And("User re upload document payment disbursement trip")
    public void user_re_upload_document_payment_disbursement_trip() {
        Hooks.delay(2);
        financePage.BtnEditUploadDocumentPaymentDisbursementTrip("C:\\Users\\M1403QA\\Downloads\\Document Rekap Sakit User.xlsx");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User re upload document payment disbursement trip");
    }

    @Then("User save edit data payment disbursement trip")
    public void user_save_edit_data_payment_disbursement_trip() {
        Hooks.delay(1);
        financePage.BtnSaveEditPaymentDisbursementTrip();
        Hooks.delay(2);
        financePage.BtnConfirmSaveEditPaymentDisbursementTrip();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit data payment disbursement trip");
    }

//Approval Payment Disbursement Trip
    @When("User click button approval payment disbursement trip")
    public void user_click_button_approval_payment_disbursement_trip() {
        Hooks.delay(2);
        financePage.BtnApprovalPaymentDisbursementTrip();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button approval payment disbursement trip");
    }

    @And("User select approval payment disbursement trip")
    public void user_select_approval_payment_disbursement_trip() {
        Hooks.delay(2);
        financePage.BtnSelectPartnerApprovalPaymentDisbursementTrip();
        Hooks.delay(2);
        financePage.SelectPartnerApprovalPaymentDisbursementTrip();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select approval payment disbursement trip");
    }

    @Then("User click button save approval payment disbursement trip")
    public void user_click_button_save_approval_payment_disbursement_trip() {
        Hooks.delay(3);
        financePage.BtnSavePartnerApprovalPaymentDisbursementTrip();
        Hooks.delay(2);
        financePage.BtnConfirmPartnerApprovalPaymentDisbursementTrip();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save approval payment disbursement trip");
    }

//View Approved Payment Disbursement Trip
    @When("User click button view approved payment disbursement trip")
    public void user_click_button_view_approved_payment_disbursement_trip() {
        Hooks.delay(1);
        financePage.BtnViewApprovedPaymentDisbursementTrip();
        Hooks.delay(2);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        Hooks.delay(2);
        financePage.BtnBackViewApprovedPaymentDisbursementTrip();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button view approved payment disbursement trip");
    }
}

