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
    public void User_click_sub_tab_task_activity_report_finance() {
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
}
