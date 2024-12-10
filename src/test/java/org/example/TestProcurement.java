package org.example;

import io.cucumber.java.en.And;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.ProcurementPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;


public class TestProcurement {
    static WebDriver driver;
    static ExtentTest extentTest;
    static ProcurementPage procurementPage = new ProcurementPage();

    public TestProcurement() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

//Enter Document Dashboard Page
    @When("User click tab procurement")
    public void user_click_tab_procurement() {
        Hooks.delay(1);
        procurementPage.TabProcurement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab procurement");
    }

    @Then("User get text title page procurement dashboard")
    public void user_get_text_title_page_procurement_dashboard() {
        Hooks.delay(1);
        Assert.assertEquals(procurementPage.getTxtProcurementDashboardPage(), "Purchase Requisition");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page procurement dashboard");
    }

//Enter Procurement Report Page
    @When("User click tab procurement report")
    public void user_click_tab_procurement_report() {
        Hooks.delay(1);
        procurementPage.TabProcurementReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab procurement report");
    }

    @Then("User get text title page procurement report")
    public void user_get_text_title_page_procurement_report() {
        Hooks.delay(1);
        Assert.assertEquals(procurementPage.getTxtProcurementReportPage(), "PR Report");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page procurement report");
    }

//Download Request Order Report
    @When("User select month request order report")
    public void user_select_month_request_order_report() {
        Hooks.delay(1);
        procurementPage.BtnMonthRoReport("October 2024");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select month request order report");
    }

    @Then("User click button excel request order report")
    public void user_click_button_excel_request_order_report() {
        Hooks.delay(1);
        procurementPage.BtnDownloadRoReport();
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
        extentTest.log(LogStatus.PASS, "User click button excel request order report");
    }

//Download Request Order Complete Report
    @When("User click tab request order complete report")
    public void user_click_tab_request_order_complete_report() {
        Hooks.delay(1);
        procurementPage.TabRoCompleteReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab request order complete report");
    }

    @And("User select month request order complete report")
    public void user_select_month_request_order_complete_report() {
        Hooks.delay(1);
        procurementPage.BtnMonthRoCompleteReport("October 2024");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select month request order complete report");
    }

    @Then("User click button excel request order complete report")
    public void user_click_button_excel_request_order_complete_report() {
        Hooks.delay(1);
        procurementPage.BtnDownloadRoCompleteReport();
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
        extentTest.log(LogStatus.PASS, "User click button excel request order complete report");
    }

//Enter Request Order Page
    @When("User click tab request order")
    public void user_click_tab_request_order() {
        Hooks.delay(1);
        procurementPage.TabRequestOrder();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab request order");
    }

    @Then("User get text title page request order")
    public void user_get_text_title_page_request_order() {
        Hooks.delay(1);
        Assert.assertEquals(procurementPage.getTxtRequestOrderPage(), "Request Order");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page request order");
    }

//Create Request Order
    @When("User click button create request order")
    public void user_click_button_create_request_order() {
        Hooks.delay(1);
        procurementPage.BtnCreateRequestOrder();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create request order");
    }

    @And("User select vendor name request order")
    public void user_select_vendor_name_request_order() {
        Hooks.delay(1);
        procurementPage.BtnSelectVendorNameRequestOrder();
        Hooks.delay(2);
        procurementPage.SelectVendorNameRequestOrder();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select vendor name request order");
    }

    @And("User select office location name request order")
    public void user_select_office_location_name_request_order() {
        Hooks.delay(1);
        procurementPage.BtnSelectOfficeLocationNameRequestOrder();
        Hooks.delay(2);
        procurementPage.SelectOfficeLocationNameRequestOrder();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select office location name request order");
    }

    @And("User input description request order")
    public void user_input_description_request_order() {
        Hooks.delay(1);
        procurementPage.InputDescriptionRequestOrder("Pembelian Pena & Pensil Joyko");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input description request order");
    }

    @And("User input remark request order")
    public void user_input_remark_request_order() {
        Hooks.delay(1);
        procurementPage.InputRemarkRequestOrder("Gaskeun");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input remark request order");
    }

    @And("User select submitted by request order")
    public void user_select_submitted_by_request_order() {
        Hooks.delay(1);
        procurementPage.BtnSelectSubmittedByRequestOrder();
        Hooks.delay(2);
        procurementPage.SelectSubmittedByRequestOrder();
        Hooks.delay(2);
        procurementPage.BtnConfirmSelectedSubmittedByRequestOrder();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select submitted by request order");
    }

    @And("User select item request order")
    public void user_select_item_request_order() {
        Hooks.delay(1);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        procurementPage.BtnSelectItemRequestOrder();
        Hooks.delay(2);
        procurementPage.SelectItemRequestOrder();
        Hooks.delay(2);
        procurementPage.BtnConfirmSelectedItemRequestOrder();
        Hooks.delay(2);
        procurementPage.InputQtyItemRequestOrder("33");
        Hooks.delay(2);
        procurementPage.InputPriceItemRequestOrder("7800");
        Hooks.delay(2);
        procurementPage.InputRemarkItemRequestOrder("Beli Segera");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select item request order");
    }

    @And("User upload documents quotation request order")
    public void user_upload_documents_quotation_request_order() {
        Hooks.delay(1);
        procurementPage.BtnUploadDocumentsQuotationRequestOrder("C:\\Users\\M1403QA\\Downloads\\Document RKPD 17-07-2024.pdf");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User upload documents quotation request order");
    }

    @Then("User save request order data")
    public void user_save_request_order_data() {
        Hooks.delay(1);
        procurementPage.BtnSaveRequestOrderData();
        Hooks.delay(2);
        procurementPage.BtnConfirmSaveRequestOrderData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save request order data");
    }

//Edit Request Order Data
    @When("User click button edit request order")
    public void user_click_button_edit_request_order() {
        Hooks.delay(2);
        procurementPage.BtnEditRequestOrder();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit request order");
    }

    @And("User edit description request order")
    public void user_edit_description_request_order() {
        Hooks.delay(2);
        procurementPage.ClearInputDescriptionRequestOrder();
        Hooks.delay(2);
        procurementPage.InputDescriptionRequestOrder("Input321");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit description request order");
    }

    @Then("User save edit request order data")
    public void user_save_edit_request_order_data() {
        Hooks.delay(2);
        procurementPage.BtnSaveEditRequestOrderData();
        Hooks.delay(2);
        procurementPage.BtnConfirmSaveEditRequestOrderData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit request order data");
    }

//Approval Financial Director Request Order
    @When("User click button approval fd request order")
    public void user_click_button_approval_fd_request_order() {
        Hooks.delay(2);
        procurementPage.BtnApprovalFdRequestOrder();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button approval fd request order");
    }

    @And("User choose approval fd request order")
    public void user_choose_approval_fd_request_order() {
        Hooks.delay(1);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        procurementPage.BtnSelectApprovalFdRequestOrder();
        Hooks.delay(2);
        procurementPage.SelectApprovalFdRequestOrder();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User choose approval fd request order");
    }

    @Then("User save approval fd request order")
    public void user_save_approval_fd_request_order() {
        Hooks.delay(3);
        procurementPage.BtnSaveApprovalFdRequestOrder();
        Hooks.delay(2);
        procurementPage.BtnConfirmSaveApprovalFdRequestOrder();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save approval fd request order");
    }

//Approval Director Request Order
    @When("User click button approval director request order")
    public void user_click_button_approval_director_request_order() {
        Hooks.delay(2);
        procurementPage.BtnApprovalDirectorRequestOrder();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button approval director request order");
    }

    @And("User choose approval director request order")
    public void user_choose_approval_director_request_order() {
        Hooks.delay(1);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        procurementPage.BtnSelectApprovalDirectorRequestOrder();
        Hooks.delay(2);
        procurementPage.SelectApprovalDirectorRequestOrder();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User choose approval director request order");
    }

    @Then("User save approval director request order")
    public void user_save_approval_director_request_order() {
        Hooks.delay(3);
        procurementPage.BtnSaveApprovalDirectorRequestOrder();
        Hooks.delay(2);
        procurementPage.BtnConfirmSaveApprovalDirectorRequestOrder();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save approval director request order");
    }

//Upload Receipt Payment Request Order
    @When("User click button upload receipt request order")
    public void user_click_button_upload_receipt_request_order() {
        Hooks.delay(2);
        procurementPage.BtnUploadReceiptRequestOrder();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button upload receipt request order");
    }

    @And("User upload receipt request order")
    public void user_upload_receipt_request_order() {
        Hooks.delay(1);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        procurementPage.BtnUploadDocumentsFakturPaymentRequestOrder("C:\\Users\\M1403QA\\Downloads\\MOGI-MAULID-2024.png");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User upload receipt request order");
    }

    @Then("User save upload receipt request order")
    public void user_save_upload_receipt_request_order() {
        Hooks.delay(3);
        procurementPage.BtnSaveUploadReceiptRequestOrder();
        Hooks.delay(2);
        procurementPage.BtnConfirmSaveUploadReceiptRequestOrder();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save upload receipt request order");
    }

//Upload Receipt Paid Payment Request Order
    @When("User click button paid payment request order")
    public void user_click_button_paid_payment_request_order() {
        Hooks.delay(2);
        procurementPage.BtnPaidPaymentReceiptRequestOrder();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button paid payment request order");
    }

    @And("User upload receipt paid payment request order")
    public void user_upload_receipt_paid_payment_request_order() {
        Hooks.delay(1);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        procurementPage.BtnUploadDocumentsFakturDeliveryRequestOrder("C:\\Users\\M1403QA\\Downloads\\MOGI-MAULID-2024.png");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User upload receipt paid payment request order");
    }

    @Then("User save upload receipt paid payment request order")
    public void user_save_upload_receipt_paid_payment_request_order() {
        Hooks.delay(3);
        procurementPage.BtnSaveUploadReceiptPaidPaymentRequestOrder();
        Hooks.delay(2);
        procurementPage.BtnConfirmSaveUploadReceiptPaidPaymentRequestOrder();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save upload receipt paid payment request order");
    }

//Complete Request Order
    @When("User click button delivered request order")
    public void user_click_button_delivered_request_order() {
        Hooks.delay(2);
        procurementPage.BtnDeliveredRequestOrder();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button delivered request order");
    }

    @Then("User click button complete delivered request order")
    public void user_click_button_complete_delivered_request_order() {
        Hooks.delay(1);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        procurementPage.BtnCompleteDeliveredRequestOrder();
        Hooks.delay(2);
        procurementPage.BtnConfirmCompleteDeliveredRequestOrder();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button complete delivered request order");
    }

//Enter Request Order Complete Page
    @When("User click tab ro complete")
    public void user_click_tab_ro_complete() {
        Hooks.delay(1);
        procurementPage.TabRoCompleteProcurement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab ro complete");
    }

    @Then("User get text title page ro complete")
    public void user_get_text_title_page_ro_complete() {
        Hooks.delay(1);
        Assert.assertEquals(procurementPage.getTxtRoCompletedProcurementPage(), "Request Order Complete");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page ro complete");
    }

//View Request Order Completed
    @When("User click button view completed request order")
    public void user_click_button_view_completed_request_order() {
        Hooks.delay(1);
        procurementPage.BtnViewCompletedRequestOrder();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button view completed request order");
    }

    @And("User get text title page completed request order")
    public void user_get_text_title_page_completed_request_order() {
        Hooks.delay(1);
        Assert.assertEquals(procurementPage.getTxtViewCompletedRequestOrderPage(), "View Request Order PR2408120001");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User get text title page completed request order");
    }

    @Then("User back to procurement completed request order list page")
    public void user_back_to_procurement_completed_request_order_list_page() {
        Hooks.delay(1);
        procurementPage.BtnBackProcurementCompletedRequestOrderList();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User back to procurement completed request order list page");
    }
}