package org.example;

import io.cucumber.java.en.And;
import org.example.pages.HoPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


import java.awt.*;
import java.awt.event.KeyEvent;


public class TestHo {
    static WebDriver driver;
    static ExtentTest extentTest;
    static HoPage hoPage = new HoPage();

    public TestHo() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Enter HO Page
    @When("User click tab ho")
    public void user_click_tab_ho() {
        Hooks.delay(1);
        hoPage.TabHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab ho");
    }

    @Then("User get text title page ho")
    public void user_get_text_title_page_ho() {
        Hooks.delay(1);
        Assert.assertEquals(hoPage.getTxtHo(), "Monitoring HO");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page ho");
    }

    //Create HO
    @When("User click button create ho")
    public void user_click_button_create_ho() {
        Hooks.delay(1);
        hoPage.BtnCreateHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create ho");
    }

    @And("User select handling company ho")
    public void user_select_handling_company_ho() {
        Hooks.delay(1);
        hoPage.SelectHandlingCompanyHo();
        Hooks.delay(2);
        hoPage.ChooseHandlingCompanyHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select handling company ho");
    }

    @And("User upload document quotation client ho")
    public void user_upload_document_quotation_client_ho() {
        Hooks.delay(1);
        hoPage.BtnUploadDocumentQuotationHo("C:\\Users\\M1403QA\\Downloads\\Document RKPD 17-07-2024.pdf");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User upload document quotation client ho");
    }

    @And("User upload document confirmation letter client ho")
    public void user_upload_document_confirmation_letter_client_ho() {
        Hooks.delay(1);
        hoPage.BtnUploadDocumentConfirmationLetterHo("C:\\Users\\M1403QA\\Downloads\\Daily Report 15-07-2024.xlsx");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User upload document confirmation letter client ho");
    }

    @And("User select name of client ho")
    public void user_select_name_of_client_ho() {
        Hooks.delay(1);
        hoPage.BtnSearchNameOfClientHo();
        Hooks.delay(2);
        hoPage.ChooseNameOfClientHo();
        Hooks.delay(2);
        hoPage.BtnSelectSearchNameOfClientHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select name of client ho");
    }

    @And("User upload document scope of work client ho")
    public void user_upload_document_scope_of_work_client_ho() {
        Hooks.delay(1);
        hoPage.BtnUploadDocumentScopeOfWorkHo("C:\\Users\\M1403QA\\Downloads\\Daily Report 15-07-2024.xlsx");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User upload document scope of work client ho");
    }

    @And("User input case name client ho")
    public void user_input_case_name_client_ho() {
        Hooks.delay(1);
        hoPage.InputCaseNameClientHo("Kasus Pencemaran Nama Jahat");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input case name client ho");
    }

    @And("Input address client ho")
    public void input_address_client_ho() {
        Hooks.delay(1);
        hoPage.InputAddressClientHo("Jalan Dipenogoro No.5");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "Input address client ho");
    }

    @And("User select province client ho")
    public void user_select_province_client_ho() {
        Hooks.delay(1);
        hoPage.BtnSelectClientProvinceHo();
        Hooks.delay(2);
        hoPage.ChooseProvinceClientHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select province client ho");
    }

    @And("User select city client ho")
    public void user_select_city_client_ho() {
        Hooks.delay(1);
        hoPage.BtnSelectCityClientHo();
        Hooks.delay(2);
        hoPage.ChooseCityClientHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select city client ho");
    }

    @And("User input postal code client ho")
    public void user_input_postal_code_client_ho() {
        Hooks.delay(1);
        hoPage.InputPostalCodeClientHo("25223");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input postal code client ho");
    }

    @And("User input recommendation client ho")
    public void user_input_recommendation_client_ho() {
        Hooks.delay(1);
        hoPage.InputRecommendationClientHo("Pak Randy");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input recommendation client ho");
    }

    @And("User input telephone client ho")
    public void user_input_telephone_client_ho() {
        Hooks.delay(1);
        hoPage.InputClientTelephoneHo("082285477825");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input telephone client ho");
    }

    @And("User input email client ho")
    public void user_input_email_client_ho() {
        Hooks.delay(1);
        hoPage.InputClientEmailHo("kala27@yopmail.com");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input email client ho");
    }

    @And("User input npwp client ho")
    public void user_input_npwp_client_ho() {
        Hooks.delay(1);
        hoPage.InputClientNpwpHo("99826371893815");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input npwp client ho");
    }

    @And("User select type of client ho")
    public void user_select_type_of_client_ho() {
        Hooks.delay(1);
        hoPage.BtnSelectTypeOfClientHo();
        Hooks.delay(2);
        hoPage.ChooseTypeOfClientHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select type of client ho");
    }

    @And("User input case summary client ho")
    public void user_input_case_summary_client_ho() {
        Hooks.delay(1);
        hoPage.InputCaseSummaryClientHo("Kasus Pencemaran Nama Jahat oleh Pak Yoyok");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input case summary client ho");
    }

    @And("User input total hours client ho")
    public void user_input_total_hours_client_ho() {
        Hooks.delay(1);
        hoPage.InputTotalHoursClientHo("213");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input total hours client ho");
    }

    @And("User add handling team client ho")
    public void user_add_handling_team_client_ho() {
        Hooks.delay(1);
        hoPage.BtnAddHandlingTeamHo();
        Hooks.delay(2);
        hoPage.ChooseHandlingTeam1Ho();
        Hooks.delay(2);
        hoPage.ChooseHandlingTeam2Ho();
        Hooks.delay(2);
        hoPage.ChooseHandlingTeam3Ho();
        Hooks.delay(2);
        hoPage.BtnSelectHandlingTeamHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User add handling team client ho");
    }

    @Then("User save ho")
    public void user_save_ho() {
        Hooks.delay(1);
        hoPage.BtnSaveHo();
        Hooks.delay(2);
        hoPage.BtnConfirmSaveHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save ho");
    }

    //User Search Valid Data Based ID HO
    @When("User click on the search bar under the words ho berjalan")
    public void user_click_on_the_search_bar_under_the_words_ho_berjalan() {
        Hooks.delay(2);
        hoPage.BtnInputSearchHoBerjalan();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click on the search bar under the words ho berjalan");
    }

    @Then("User input valid id ho")
    public void user_input_valid_id_ho() {
        Hooks.delay(1);
        hoPage.InputSearchHoBerjalan("hodev001");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User input valid id ho");
    }

    //Enter HO Working Plan Page
    @When("User click button ho working plan")
    public void user_click_button_ho_working_plan() {
        Hooks.delay(1);
        hoPage.BtnHoWorkingPlan();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button ho working plan");
    }

    @Then("User get text title page ho working plan")
    public void user_get_text_title_page_ho_working_plan() {
        Hooks.delay(1);
        Assert.assertEquals(hoPage.getTxtHoWorkingPlan(), "HO Working Plan");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User get text title page ho working plan");
    }

    //Edit HO
    @When("User click button edit type of contract")
    public void user_click_button_edit_type_of_contract() {
        Hooks.delay(1);
        hoPage.BtnEditHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button edit type of contract");
    }

    @And("User edit case summary data ho")
    public void user_edit_case_summary_data_ho() {
        Hooks.delay(1);
        hoPage.InputDeleteCaseSummaryEditHo();
        Hooks.delay(1);
        hoPage.InputCaseSummaryEditHo("Pengecekan secara keseluruhan untuk hodev");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit case summary data ho");
    }

    @Then("User save edit ho")
    public void user_save_edit_ho() {
        Hooks.delay(1);
        hoPage.BtnSaveEditHo();
        Hooks.delay(1);
        hoPage.BtnConfirmSaveEditHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit ho");
    }

    //Enter Detail Client Balance
    @When("User click detail cost ho working plan")
    public void user_click_detail_cost_ho_working_plan() {
        Hooks.delay(1);
        hoPage.BtnDetailCost();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click detail cost ho working plan");
    }

    @And("User get text title page detail cost")
    public void user_get_text_title_page_detail_cost() {
        Hooks.delay(1);
        Assert.assertEquals(hoPage.getTxtDetailCost(), "Detail Cost hodev001");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User get text title page detail cost");
    }

    @Then("User close detail cost")
    public void user_close_detail_cost() {
        Hooks.delay(1);
        hoPage.BtnBackDetailCost();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User close detail cost");
    }

    //Add Task
    @When("User click button add task")
    public void user_click_button_add_task() {
        Hooks.delay(1);
        hoPage.BtnAddTask();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button add task");
    }

    @And("User select scope of work task")
    public void user_select_scope_of_work_task() {
        Hooks.delay(1);
        hoPage.BtnSowTask();
        Hooks.delay(1);
        hoPage.SelectSowLevel0Task();
        Hooks.delay(1);
        hoPage.SelectSowLevel1Task();
        Hooks.delay(1);
        hoPage.SelectSowLevel2Task();
        Hooks.delay(1);
        hoPage.BtnSelectSowTask();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User select scope of work task");
    }

    @And("User select deadline task")
    public void user_select_deadline_task() {
        Hooks.delay(1);
        hoPage.BtnDeadline();
        Hooks.delay(1);
        hoPage.BtnSelectTodayDeadline();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select deadline task");
    }

    @And("User select pic task")
    public void user_select_pic() {
        Hooks.delay(1);
        hoPage.BtnPicTask();
        Hooks.delay(1);
        hoPage.SelectPicTask();
        Hooks.delay(1);
        hoPage.BtnSelectPicTask();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select pic");
    }

    @And("User select task photos")
    public void user_select_task_photos() {
        Hooks.delay(1);
        hoPage.BtnUploadTaskPhotos("C:\\Users\\M1403QA\\Downloads\\WhatsApp Image 2023-11-22 at 16.25.36_70869345.jpg");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User select task photos");
    }

    @And("User select task documents")
    public void user_select_task_documents() {
        Hooks.delay(1);
        hoPage.BtnUploadTaskDocuments("C:\\Users\\M1403QA\\Downloads\\Document RKPD 2023-12-26.pdf");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User select task documents");
    }

    @And("User input note task")
    public void user_input_note_task() {
        Hooks.delay(1);
        hoPage.InputNoteTask("Ini adalah task baru yang akan dikerjakan oleh team yang telah ditunjuk");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note task");
    }

    @Then("User save task")
    public void user_save_task() {
        Hooks.delay(1);
        hoPage.BtnSaveTask();
        Hooks.delay(1);
        hoPage.BtnConfirmSaveTask();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save task");
    }

    //Add Activity
    @When("User click button add activity")
    public void user_click_button_add_activity() {
        Hooks.delay(2);
        hoPage.BtnAddActivity();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button add activity");
    }

    @And("User select scope of work activity")
    public void user_select_scope_of_work_activity() {
        Hooks.delay(1);
        hoPage.BtnSowActivity();
        Hooks.delay(1);
        hoPage.SelectSowLevel0Activity();
        Hooks.delay(1);
        hoPage.SelectSowLevel1Activity();
        Hooks.delay(1);
        hoPage.SelectSowLevel2Activity();
        Hooks.delay(1);
        hoPage.BtnSelectSowActivity();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User select scope of work activity");
    }

    @And("User select start date activity")
    public void user_select_start_date_activity() {
        Hooks.delay(1);
        hoPage.BtnStartDateActivity();
        Hooks.delay(1);
        hoPage.BtnSelectTodayStartDateActivity();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User select start date activity");
    }

    @And("User select end date activity")
    public void user_select_end_date_activity() {
        Hooks.delay(1);
        hoPage.BtnEndDateActivity();
        Hooks.delay(1);
        hoPage.BtnSelectTodayEndDateActivity();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User select end date activity");
    }

    @And("User select pic activity")
    public void user_select_pic_activity() {
        Hooks.delay(1);
        hoPage.BtnPicActivity();
        Hooks.delay(1);
        hoPage.SelectPicActivity();
        Hooks.delay(1);
        hoPage.BtnSelectPicActivity();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User select pic activity");
    }

    @And("User upload activity photos")
    public void user_upload_activity_photos() {
        Hooks.delay(1);
        hoPage.BtnUploadActivityPhotos("C:\\Users\\M1403QA\\Downloads\\WhatsApp Image 2023-11-22 at 10.09.29_6cb7d870.jpg");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User upload activity photos");
    }

    @And("User upload activity documents")
    public void user_upload_activity_documents() {
        Hooks.delay(1);
        hoPage.BtnUploadActivityDocuments("C:\\Users\\M1403QA\\Downloads\\Document RKPD 2023-12-26.pdf");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User upload activity documents");
    }

    @And("User input note activity")
    public void user_input_note_activity() {
        Hooks.delay(1);
        hoPage.InputNoteActivity("Activity telah dikerjakan sesuai dengan prosedur");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User input note activity");
    }

    @Then("User save activity")
    public void user_save_activity() {
        Hooks.delay(1);
        hoPage.BtnSaveActivity();
        Hooks.delay(1);
        hoPage.BtnConfirmSaveActivity();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save activity");
    }

    //Edit Task
    @When("User click button edit task")
    public void user_click_button_edit_task() {
        Hooks.delay(2);
        hoPage.BtnEditTask();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit task");
    }

    @And("User edit data task")
    public void user_edit_data_task() {
        Hooks.delay(2);
        hoPage.InputDeleteNoteTask();
        Hooks.delay(3);
        hoPage.InputEditNoteTask("Kerjakan segera dengan seluruh tim yang telah ditunjuk");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit data task");
    }

    @Then("User save edit task")
    public void user_save_edit_task() {
        Hooks.delay(3);
        hoPage.BtnSaveTask();
        Hooks.delay(2);
        hoPage.BtnConfirmSaveTask();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit task");
    }

    //View Task
    @When("User click button view task")
    public void user_click_button_view_task() {
        Hooks.delay(2);
        hoPage.BtnViewTask();
        Hooks.delay(2);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_UP);
            robot.keyRelease(KeyEvent.VK_PAGE_UP);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        Hooks.delay(2);
        hoPage.BtnBackViewTask();
        Hooks.delay(2);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        extentTest.log(LogStatus.PASS, "User click button view task");
    }

    //Proceed The Task
    @When("User click button proceed the task")
    public void user_click_button_proceed_the_task() {
        Hooks.delay(1);
        hoPage.BtnProceedTheTask();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button proceed the task");
    }

    @And("User select start date proceed the task")
    public void user_select_start_date_proceed_the_task() {
        Hooks.delay(1);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_UP);
            robot.keyRelease(KeyEvent.VK_PAGE_UP);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        Hooks.delay(2);
        hoPage.BtnStartDateProceedTheTask();
        Hooks.delay(2);
        hoPage.BtnSelectTodayStartDateProceedTheTask();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select start date proceed the task");
    }

    @And("User select end date proceed the task")
    public void user_select_end_date_proceed_the_task() {
        Hooks.delay(2);
        hoPage.BtnEndDateProceedTheTask();
        Hooks.delay(2);
        hoPage.BtnSelectTodayEndDateProceedTheTask();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select end date proceed the task");
    }

    @And("User upload activity photos proceed the task")
    public void user_upload_activity_photos_proceed_the_task() {
        Hooks.delay(1);
        hoPage.BtnUploadActivityPhotosProceedTheTask("C:\\Users\\M1403QA\\Downloads\\WhatsApp Image 2023-11-09 at 13.17.15_e44eaf04.jpg");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User upload activity photos proceed the task");
    }

    @And("User upload activity documents proceed the task")
    public void user_upload_activity_documents_proceed_the_task() {
        Hooks.delay(1);
        hoPage.BtnUploadActivityDocumentsProceedTheTask("C:\\Users\\M1403QA\\Downloads\\Daily Report 2024-01-26.pdf");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User upload activity documents proceed the task");
    }

    @And("User input note proceed the task")
    public void user_input_note_proceed_the_task() {
        Hooks.delay(2);
        hoPage.InputDeleteNoteProceedTheTask();
        Hooks.delay(3);
        hoPage.InputNoteProceedTheTask("Task telah selesai dikerjakan,menunggu approval dari JP");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note proceed the task");
    }

    @Then("User save proceed the task")
    public void user_save_proceed_the_task() {
        Hooks.delay(3);
        hoPage.BtnSaveProceedTheTask();
        Hooks.delay(2);
        hoPage.BtnConfirmSaveProceedTheTask();
        Hooks.delay(5);
        extentTest.log(LogStatus.PASS, "User save proceed the task");
    }

    //JP Approval Task
    @When("User click button jp approval task")
    public void user_click_button_jp_approval_task() {
        Hooks.delay(2);
        hoPage.BtnJpApprovalTask();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button jp approval task");
    }

    @And("User select jp approval task")
    public void user_select_jp_approval_task() {
        Hooks.delay(2);
        hoPage.BtnSelectJpApprovalTask();
        Hooks.delay(2);
        hoPage.SelectJpApprovalTask();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select jp approval task");
    }

    @And("User input note jp approval task")
    public void user_input_note_jp_approval_task() {
        Hooks.delay(2);
        hoPage.InputDeleteNoteJpApprovalTask();
        Hooks.delay(3);
        hoPage.InputNoteJpApprovalTask("Lanjut untuk Approval ke Partner");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note jp approval task");
    }

    @Then("User click button save jp approval task")
    public void user_click_button_save_jp_approval_task() {
        Hooks.delay(3);
        hoPage.BtnSaveJpApprovalTask();
        Hooks.delay(2);
        hoPage.BtnConfirmSaveJpApprovalTask();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save jp approval task");
    }

    //Revision Task
    @When("User click button partner for revision task")
    public void user_click_button_partner_for_revision_task() {
        Hooks.delay(2);
        hoPage.BtnPartnerApprovalTask();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button partner for revision task");
    }

    @And("User select partner for revision task")
    public void user_select_partner_for_revision_task() {
        Hooks.delay(2);
        hoPage.BtnSelectPartnerRevisionTask();
        Hooks.delay(2);
        hoPage.SelectPartnerRevisiApprovalTask();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select partner for revision task");
    }

    @And("User input note partner for revision task")
    public void user_input_note_partner_revision_task() {
        Hooks.delay(2);
        hoPage.InputDeleteNotePartnerApprovalTask();
        Hooks.delay(2);
        hoPage.InputNotePartnerApprovalTask("Revisi task yang sudah di submit karena ada data yang tidak sesuai");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note partner for revision task");
    }

    @And("User click button save partner for revision task")
    public void user_click_button_save_partner_for_revision_task() {
        Hooks.delay(2);
        hoPage.BtnSavePartnerApprovalTask();
        Hooks.delay(2);
        hoPage.BtnConfirmSavePartnerApprovalTask();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save partner for revision task");
    }

    @And("User click button revisi")
    public void user_click_button_revisi() {
        Hooks.delay(2);
        hoPage.BtnRevisiTask();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button revisi");
    }

    @And("User input note revisi complete the task")
    public void user_input_note_revisi_complete_the_task() {
        Hooks.delay(2);
        hoPage.InputDeleteNoteProceedTheTask();
        Hooks.delay(3);
        hoPage.InputNoteProceedTheTask("Task telah selesai di revisi,menunggu approval dari JP");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note revisi complete the task");
    }

    @And("User save revisi complete the task")
    public void user_save_revisi_complete_the_task() {
        Hooks.delay(3);
        hoPage.BtnSaveProceedTheTask();
        Hooks.delay(2);
        hoPage.BtnConfirmSaveProceedTheTask();
        Hooks.delay(5);
        extentTest.log(LogStatus.PASS, "User save revisi complete the task");
    }

    @And("User click button jp approval for revision task")
    public void user_click_button_jp_approval_for_revision_task() {
        Hooks.delay(2);
        hoPage.BtnJpApprovalTask();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button jp approval for revision task");
    }

    @And("User select jp approval for revision task")
    public void user_select_jp_approval_for_revision_task() {
        Hooks.delay(2);
        hoPage.BtnSelectJpApprovalTask();
        Hooks.delay(2);
        hoPage.SelectJpApprovalTask();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select jp approval for revision task");
    }

    @And("User input note jp approval for revision task")
    public void user_input_note_jp_approval_for_revision_task() {
        Hooks.delay(2);
        hoPage.InputDeleteNoteJpApprovalTask();
        Hooks.delay(2);
        hoPage.InputNoteJpApprovalTask("Lanjut untuk Approval ke Partner untuk yang kedua kali");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note jp approval for revision task");
    }

    @Then("User click button save jp approval for revision task")
    public void user_click_button_save_jp_approval_for_revision_task() {
        Hooks.delay(2);
        hoPage.BtnSaveJpApprovalTask();
        Hooks.delay(2);
        hoPage.BtnConfirmSaveJpApprovalTask();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save jp approval for revision task");
    }

    //Partner Approval Task
    @When("User click button partner approval task")
    public void user_click_button_partner_approval_task() {
        Hooks.delay(2);
        hoPage.BtnPartnerApprovalTask();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button partner approval task");
    }

    @And("User select partner approval task")
    public void user_select_partner_approval_task() {
        Hooks.delay(2);
        hoPage.BtnSelectPartnerApprovalTask();
        Hooks.delay(2);
        hoPage.SelectPartnerApproveApprovalTask();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select partner approval task");
    }

    @And("User input note partner approval task")
    public void user_input_note_partner_approval_task() {
        Hooks.delay(2);
        hoPage.InputDeleteNotePartnerApprovalTask();
        Hooks.delay(2);
        hoPage.InputNotePartnerApprovalTask("Kerja bagus untuk semua team yang telah berkontribusi");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note partner approval task");
    }

    @And("User click button save partner approval task")
    public void user_click_button_save_partner_approval_task() {
        Hooks.delay(2);
        hoPage.BtnSavePartnerApprovalTask();
        Hooks.delay(2);
        hoPage.BtnConfirmSavePartnerApprovalTask();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save partner approval task");
    }

    //Delete Task
    @When("User click icon delete task")
    public void user_click_icon_delete_task() {
        Hooks.delay(2);
        hoPage.BtnDeleteTask();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click icon delete task");
    }

    @Then("User click button confirm delete task")
    public void user_click_button_confirm_delete_task() {
        Hooks.delay(3);
        hoPage.BtnConfirmDeleteTask();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete task");
    }

    //JP Approval Activity
    @When("User click button jp approval activity")
    public void user_click_button_jp_approval_activity() {
        Hooks.delay(2);
        hoPage.BtnJpApprovalActivity();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button jp approval activity");
    }

    @And("User select jp approval activity")
    public void user_select_jp_approval_activity() {
        Hooks.delay(2);
        hoPage.BtnSelectJpApprovalActivity();
        Hooks.delay(2);
        hoPage.SelectJpApprovalActivity();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select jp approval activity");
    }

    @And("User input note jp approval activity")
    public void user_input_note_jp_approval_activity() {
        Hooks.delay(2);
        hoPage.InputDeleteNoteJpApprovalActivity();
        Hooks.delay(3);
        hoPage.InputNoteJpApprovalActivity("Lanjut untuk Approval ke Partner");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note jp approval activity");
    }

    @Then("User click button save jp approval activity")
    public void user_click_button_save_jp_approval_activity() {
        Hooks.delay(3);
        hoPage.BtnSaveJpApprovalActivity();
        Hooks.delay(2);
        hoPage.BtnConfirmSaveJpApprovalActivity();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save jp approval activity");
    }

    //Revision Activity
    @When("User click button partner for revision activity")
    public void user_click_button_partner_for_revision_activity() {
        Hooks.delay(2);
        hoPage.BtnPartnerApprovalActivity();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button partner for revision activity");
    }

    @And("User select partner for revision activity")
    public void user_select_partner_for_revision_activity() {
        Hooks.delay(2);
        hoPage.BtnSelectPartnerRevisionActivity();
        Hooks.delay(2);
        hoPage.SelectPartnerRevisiApprovalActivity();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select partner for revision activity");
    }

    @And("User input note partner for revision activity")
    public void user_input_note_partner_revision_activity() {
        Hooks.delay(2);
        hoPage.InputDeleteNotePartnerApprovalActivity();
        Hooks.delay(2);
        hoPage.InputNotePartnerApprovalTask("Revisi task yang sudah di submit karena ada data yang tidak sesuai");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note partner for revision activity");
    }

    @And("User click button save partner for revision activity")
    public void user_click_button_save_partner_for_revision_activity() {
        Hooks.delay(2);
        hoPage.BtnSavePartnerApprovalActivity();
        Hooks.delay(2);
        hoPage.BtnConfirmSavePartnerApprovalActivity();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save partner for revision activity");
    }

    @And("User click button revisi activity")
    public void user_click_button_revisi_activity() {
        Hooks.delay(2);
        hoPage.BtnRevisiActivity();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button revisi activity");
    }

    @And("User edit activity for revision")
    public void user_edit_activity_for_revision() {
        Hooks.delay(2);
        hoPage.InputDeleteNoteActivity();
        Hooks.delay(3);
        hoPage.InputNoteActivity("Activity telah selesai di revisi,menunggu approval dari JP");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit activity for revision");
    }

    @And("User save activity for revision")
    public void user_save_activity_for_revision() {
        Hooks.delay(3);
        hoPage.BtnSaveActivity();
        Hooks.delay(2);
        hoPage.BtnConfirmSaveActivity();
        Hooks.delay(4);
        extentTest.log(LogStatus.PASS, "User save activity for revision");
    }

    @And("User click button jp approval for revision activity")
    public void user_click_button_jp_approval_for_revision_activity() {
        Hooks.delay(2);
        hoPage.BtnJpApprovalActivity();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button jp approval for revision activity");
    }

    @And("User select jp approval for revision activity")
    public void user_select_jp_approval_for_revision_activity() {
        Hooks.delay(2);
        hoPage.BtnSelectJpApprovalActivity();
        Hooks.delay(2);
        hoPage.SelectJpApprovalTask();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select jp approval for revision activity");
    }

    @And("User input note jp approval for revision activity")
    public void user_input_note_jp_approval_for_revision_activity() {
        Hooks.delay(2);
        hoPage.InputDeleteNoteJpApprovalActivity();
        Hooks.delay(2);
        hoPage.InputNoteJpApprovalActivity("Lanjut untuk Approval ke Partner untuk yang kedua kali");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note jp approval for revision activity");
    }

    @Then("User click button save jp approval for revision activity")
    public void user_click_button_save_jp_approval_for_revision_activity() {
        Hooks.delay(2);
        hoPage.BtnSaveJpApprovalActivity();
        Hooks.delay(2);
        hoPage.BtnConfirmSaveJpApprovalActivity();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save jp approval for revision activity");
    }

    //Partner Approval Activity
    @When("User click button partner approval activity")
    public void user_click_button_partner_approval_activity() {
        Hooks.delay(2);
        hoPage.BtnPartnerApprovalActivity();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button partner approval activity");
    }

    @And("User select partner approval activity")
    public void user_select_partner_approval_activity() {
        Hooks.delay(2);
        hoPage.BtnSelectPartnerApprovalActivity();
        Hooks.delay(2);
        hoPage.SelectPartnerApproveApprovalActivity();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select partner approval activity");
    }

    @And("User input note partner approval activity")
    public void user_input_note_partner_approval_activity() {
        Hooks.delay(2);
        hoPage.InputDeleteNotePartnerApprovalActivity();
        Hooks.delay(2);
        hoPage.InputNotePartnerApprovalActivity("Kerja bagus untuk semua team yang telah berkontribusi");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note partner approval activity");
    }

    @Then("User click button save partner approval activity")
    public void user_click_button_save_partner_approval_activity() {
        Hooks.delay(2);
        hoPage.BtnSavePartnerApprovalActivity();
        Hooks.delay(2);
        hoPage.BtnConfirmSavePartnerApprovalActivity();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save partner approval activity");
    }

    //Delete Activity
    @When("User click icon delete activity")
    public void user_click_icon_delete_activity() {
        Hooks.delay(2);
        hoPage.BtnDeleteActivity();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click icon delete activity");
    }

    @Then("User click button confirm delete activity")
    public void user_click_button_confirm_delete_activity() {
        Hooks.delay(3);
        hoPage.BtnConfirmDeleteActivity();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete activity");
    }

    //Create Document RKPD
    @When("User click button create administrative documents for rkpd")
    public void user_click_button_create_administrative_documents_for_rkpd() {
        Hooks.delay(2);
        hoPage.BtnCreateAdministrativeDocuments();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button create administrative documents for rkpd ");
    }

    @And("User select document rkpd")
    public void user_select_document_rkpd() {
        Hooks.delay(2);
        hoPage.SelectDocumentRkpd();
        Hooks.delay(2);
        hoPage.BtnSelectAdministrativeDocuments();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select document rkpd");
    }

    @And("User select start date rkpd")
    public void user_select_start_date_rkpd() {
        Hooks.delay(2);
        hoPage.BtnStartDateRkpd();
        Hooks.delay(2);
        hoPage.BtnSelectTodayStartDateRkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select start date rkpd");
    }

    @And("User select end date rkpd")
    public void user_select_end_date_rkpd() {
        Hooks.delay(2);
        hoPage.BtnEndDateRkpd();
        Hooks.delay(2);
        hoPage.BtnSelectTodayEndDateRkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select end date rkpd");
    }

    @And("User select scope of work rkpd")
    public void user_select_scope_of_work_rkpd() {
        Hooks.delay(2);
        hoPage.BtnSowRkpd();
        Hooks.delay(2);
        hoPage.SelectSowRkpd();
        Hooks.delay(2);
        hoPage.BtnSelectSowRkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select scope of work rkpd");
    }

    @And("User select region rkpd")
    public void user_select_region_rkpd() {
        Hooks.delay(2);
        hoPage.BtnRegionRkpd();
        Hooks.delay(2);
        hoPage.SelectRegionRkpd();
        Hooks.delay(2);
        hoPage.BtnSelectRegionRkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select region rkpd");
    }

    @And("User input location rkpd")
    public void user_input_location_rkpd() {
        Hooks.delay(2);
        hoPage.InputLocationRkpd("Jakarta Timur");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input location rkpd");
    }

    @And("User input scope of work details rkpd")
    public void user_input_scope_of_work_details_rkpd() {
        Hooks.delay(2);
        hoPage.InputScopeOfWorkDetailsRkpd("Kerja bagus untuk semua team yang telah berkontribusi");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input scope of work details rkpd");
    }

    @And("User select assigned member rkpd")
    public void user_select_assigned_member_rkpd() {
        Hooks.delay(2);
        hoPage.BtnAssignedMemberRkppd();
        Hooks.delay(2);
        hoPage.SelectAssignedMember1Rkpd();
        Hooks.delay(2);
        hoPage.SelectAssignedMember2Rkpd();
        Hooks.delay(2);
        hoPage.BtnSelectAssignedMemberRkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select assigned member rkpd");
    }

    @And("User upload document rkpd")
    public void user_upload_document_rkpd() {
        Hooks.delay(2);
        hoPage.BtnUploadDocumentRkpd("C:\\Users\\M1403QA\\Downloads\\IAT DS API (Regular Sign Plus) - v3.3 Morfotech revisi16.07.24.xlsx");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User upload document rkpd");
    }

    @Then("User click button create document rkpd")
    public void user_click_button_create_document_rkpd() {
        Hooks.delay(2);
        hoPage.BtnCreateRkpd();
        Hooks.delay(2);
        hoPage.BtnConfirmCreateRkpd();
        Hooks.delay(3);
        hoPage.BtnCancelDownloadRkpd();
        Hooks.delay(4);
        extentTest.log(LogStatus.PASS, "User click button create document rkpd");
    }

    //JP Approval Document RKPD
    @When("User click button jp approval document rkpd")
    public void User_click_button_jp_approval_document_rkpd() {
        Hooks.delay(2);
        hoPage.BtnJpApprovalRkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button jp approval document rkpd");
    }

    @And("User select jp approval document rkpd")
    public void user_select_jp_approval_document_rkpd() {
        Hooks.delay(2);
        hoPage.BtnSelectJpApprovalRkpd();
        Hooks.delay(2);
        hoPage.SelectJpApprovalRkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select jp approval document rkpd");
    }

    @And("User input note jp approval rkpd")
    public void user_input_note_jp_approval_rkpd() {
        Hooks.delay(2);
        hoPage.InputNoteJpApprovalRkpd("Segera dikerjakan dengan sebaik-baiknya");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note jp approval rkpd");
    }

    @Then("User click button save jp approval rkpd")
    public void user_click_button_save_jp_approval_rkpd() {
        Hooks.delay(2);
        hoPage.BtnSaveJpApprovalRkpd();
        Hooks.delay(2);
        hoPage.BtnConfirmJpSaveApprovalRkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save jp approval rkpd");
    }

    //Partner Approval Document RKPD
    @When("User click button partner approval document rkpd")
    public void User_click_button_partner_approval_document_rkpd() {
        Hooks.delay(2);
        hoPage.BtnPartnerApprovalRkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button partner approval document rkpd");
    }

    @And("User select partner approval document rkpd")
    public void user_select_partner_approval_document_rkpd() {
        Hooks.delay(2);
        hoPage.BtnSelectPartnerApprovalRkpd();
        Hooks.delay(2);
        hoPage.SelectPartnerApprovalRkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select partner approval document rkpd");
    }

    @And("User input note partner approval rkpd")
    public void user_input_note_partner_approval_rkpd() {
        Hooks.delay(2);
        hoPage.InputNotePartnerApprovalRkpd("Kerja bagus untuk semuanya");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note partner approval rkpd");
    }

    @Then("User click button save partner approval rkpd")
    public void user_click_button_save_partner_approval_rkpd() {
        Hooks.delay(2);
        hoPage.BtnSavePartnerApprovalRkpd();
        Hooks.delay(2);
        hoPage.BtnConfirmPartnerSaveApprovalRkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save partner approval rkpd");
    }

    //Create Document Surat Tugas
    @When("User click button create administrative documents for surat tugas")
    public void user_click_button_create_administrative_documents_for_surat_tugas() {
        Hooks.delay(2);
        hoPage.BtnCreateAdministrativeDocuments();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button create administrative documents for surat tugas");
    }

    @And("User select document surat tugas")
    public void user_select_document_surat_tugas() {
        Hooks.delay(2);
        hoPage.SelectDocumentSuratTugas();
        Hooks.delay(2);
        hoPage.BtnSelectAdministrativeDocuments();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select document surat tugas");
    }

    @And("User select id rkpd surat tugas")
    public void user_select_id_rkpd_surat_tugas() {
        Hooks.delay(2);
        hoPage.BtnSearchIdRkpd();
        Hooks.delay(2);
        hoPage.SelectIdRkpd();
        Hooks.delay(2);
        hoPage.BtnSelectIdRkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select id rkpd surat tugas");
    }

    @And("User checklist list of expenses surat tugas")
    public void user_checklist_list_of_expenses_surat_tugas() {
        Hooks.delay(2);
        hoPage.ChecklistListofExpensesTicket();
        Hooks.delay(2);
        hoPage.ChecklistListofExpensesHotelCost();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User checklist list of expenses surat tugas");
    }

    @Then("User click button create document surat tugas")
    public void user_click_button_create_document_surat_tugas() {
        Hooks.delay(2);
        hoPage.BtnCreateSuratTugas();
        Hooks.delay(2);
        hoPage.BtnConfirmCreateSuratTugas();
        Hooks.delay(3);
        hoPage.BtnCancelDownloadSuratTugas();
        Hooks.delay(3);
        extentTest.log(LogStatus.PASS, "User click button create document surat tugas");
    }

    //Create Document LKPD
    @When("User click button create administrative documents for lkpd")
    public void user_click_button_create_administrative_documents_for_lkpd() {
        Hooks.delay(2);
        hoPage.BtnCreateAdministrativeDocuments();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create administrative documents for lkpd");
    }

    @And("User select document lkpd")
    public void user_select_document_lkpd() {
        Hooks.delay(2);
        hoPage.SelectDocumentLkpd();
        Hooks.delay(2);
        hoPage.BtnSelectAdministrativeDocuments();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select document lkpd");
    }

    @And("User select id st lkpd")
    public void user_select_id_st_lkpd() {
        Hooks.delay(2);
        hoPage.BtnSearchIdSt();
        Hooks.delay(2);
        hoPage.SelectIdSt();
        Hooks.delay(2);
        hoPage.BtnSelectIdSt();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select id st lkpd");
    }

    @And("User choose activity lkpd")
    public void user_choose_activity_lkpd() {
        Hooks.delay(2);
        hoPage.BtnChooseActivityLkpd();
        Hooks.delay(2);
        hoPage.ChooseActivityLkpd();
        Hooks.delay(2);
        hoPage.BtnSelectActivityLkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User choose activity lkpd");
    }

    @And("User select sow for next agenda lkpd")
    public void user_select_sow_for_next_agenda_lkpd() {
        Hooks.delay(2);
        hoPage.BtnSowNextAgendaLkpd();
        Hooks.delay(2);
        hoPage.SelectSowNextAgendaLkpd();
        Hooks.delay(2);
        hoPage.BtnSelectSowNextAgendaLkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select sow for next agenda lkpd");
    }

    @And("User select deadline for next agenda lkpd")
    public void user_select_deadline_for_next_agenda_lkpd() {
        Hooks.delay(2);
        hoPage.BtnDeadlineNextAgendaLkpd();
        Hooks.delay(2);
        hoPage.BtnSelectTodayDeadlineNextAgendaLkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select deadline for next agenda lkpd");
    }

    @And("User select pic for next agenda lkpd")
    public void user_select_pic_for_next_agenda_lkpd() {
        Hooks.delay(2);
        hoPage.BtnPicNextAgendaLkpd();
        Hooks.delay(2);
        hoPage.SelectPic1NextAgendaLkpd();
        Hooks.delay(2);
        hoPage.SelectPic2NextAgendaLkpd();
        Hooks.delay(2);
        hoPage.BtnSelectPicNextAgendaLkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select pic for next agenda lkpd");
    }

    @And("User input note for next agenda lkpd")
    public void user_input_note_for_next_agenda_lkpd() {
        Hooks.delay(2);
        hoPage.InputNoteNextAgendaLkpd("Kerjakan segera bersama team yang telah ditunjuk");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note for next agenda lkpd");
    }

    @Then("User click button create document lkpd")
    public void user_click_button_create_document_lkpd() {
        Hooks.delay(2);
        hoPage.BtnCreateLkpd();
        Hooks.delay(2);
        hoPage.BtnConfirmCreateLkpd();
        Hooks.delay(3);
        hoPage.BtnCancelDownloadLkpd();
        Hooks.delay(3);
        extentTest.log(LogStatus.PASS, "User click button create document lkpd");
    }

    //JP Approval Document LKPD
    @When("User click button jp approval document lkpd")
    public void User_click_button_jp_approval_document_lkpd() {
        Hooks.delay(2);
        hoPage.BtnJpApprovalLkpd();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button jp approval document lkpd");
    }

    @And("User select jp approval document lkpd")
    public void user_select_jp_approval_document_lkpd() {
        Hooks.delay(2);
        hoPage.BtnSelectJpApprovalLkpd();
        Hooks.delay(2);
        hoPage.SelectJpApprovalLkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select jp approval document lkpd");
    }

    @And("User input note jp approval lkpd")
    public void user_input_note_jp_approval_lkpd() {
        Hooks.delay(2);
        hoPage.InputNoteJpApprovalLkpd("Lanjutkan untuk approval partner");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note jp approval lkpd");
    }

    @Then("User click button save jp approval lkpd")
    public void user_click_button_save_jp_approval_lkpd() {
        Hooks.delay(2);
        hoPage.BtnSaveJpApprovalLkpd();
        Hooks.delay(2);
        hoPage.BtnConfirmJpSaveApprovalLkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save jp approval lkpd");
    }

    //Partner Approval Document LKPD
    @When("User click button partner approval document lkpd")
    public void User_click_button_partner_approval_document_lkpd() {
        Hooks.delay(2);
        hoPage.BtnPartnerApprovalLkpd();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button partner approval document lkpd");
    }

    @And("User select partner approval document lkpd")
    public void user_select_partner_approval_document_lkpd() {
        Hooks.delay(2);
        hoPage.BtnSelectPartnerApprovalLkpd();
        Hooks.delay(2);
        hoPage.SelectPartnerApprovalLkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select partner approval document lkpd");
    }

    @And("User input note partner approval lkpd")
    public void user_input_note_partner_approval_lkpd() {
        Hooks.delay(2);
        hoPage.InputNotePartnerApprovalLkpd("Lanjutkan untuk bikin LKPD");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note partner approval lkpd");
    }

    @Then("User click button save partner approval lkpd")
    public void user_click_button_save_partner_approval_lkpd() {
        Hooks.delay(2);
        hoPage.BtnSavePartnerApprovalLkpd();
        Hooks.delay(2);
        hoPage.BtnConfirmPartnerSaveApprovalLkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save partner approval lkpd");
    }

    //Create Document Reimbursement RKPD
    @When("User click button create administrative documents for reimbursement rkpd")
    public void user_click_button_create_administrative_documents_for_reimbursement_rkpd() {
        Hooks.delay(2);
        hoPage.BtnCreateAdministrativeDocuments();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button create administrative documents for reimbursement rkpd");
    }

    @And("User select document reimbursement rkpd")
    public void user_select_document_reimbursement_rkpd() {
        Hooks.delay(2);
        hoPage.SelectDocumentBonPutih();
        Hooks.delay(2);
        hoPage.BtnSelectAdministrativeDocuments();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select document reimbursement rkpd");
    }

    @And("User select id lkpd reimbursement rkpd")
    public void user_select_id_lkpd_reimbursement_rkpd() {
        Hooks.delay(2);
        hoPage.BtnSearchIdLkpdBonPutih();
        Hooks.delay(2);
        hoPage.SelectIdLkpdBonPutih();
        Hooks.delay(2);
        hoPage.BtnSelectIdLkpdBonPutih();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select id lkpd reimbursement rkpd");
    }

    @And("User checklist reimbursement reimbursement rkpd")
    public void user_checklist_reimbursement_reimbursement_rkpd() {
        Hooks.delay(2);
        hoPage.ChecklistReimbursement1BonPutih();
        Hooks.delay(2);
        hoPage.ChecklistReimbursement2BonPutih();
        Hooks.delay(2);
        hoPage.ChecklistReimbursement3BonPutih();
        Hooks.delay(2);
        hoPage.ChecklistReimbursement4BonPutih();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User checklist reimbursement reimbursement rkpd");
    }

    @Then("User click button create document reimbursement rkpd")
    public void user_click_button_create_document_reimbursement_rkpd() {
        Hooks.delay(2);
        hoPage.BtnCreateBonPutih();
        Hooks.delay(2);
        hoPage.BtnConfirmCreateBonPutih();
        Hooks.delay(3);
        hoPage.BtnCancelDownloadBonPutih();
        Hooks.delay(3);
        extentTest.log(LogStatus.PASS, "User click button create document reimbursement rkpd");
    }

    //JP Approval Document reimbursement rkpd
    @When("User click button jp approval document reimbursement rkpd")
    public void User_click_button_jp_approval_document_reimbursement_rkpd() {
        Hooks.delay(2);
        hoPage.BtnJpApprovalBonPutih();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button jp approval document reimbursement rkpd");
    }

    @And("User select jp approval document reimbursement rkpd")
    public void user_select_jp_approval_document_reimbursement_rkpd() {
        Hooks.delay(2);
        hoPage.BtnSelectJpApprovalBonPutih();
        Hooks.delay(2);
        hoPage.SelectJpApprovalBonPutih();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select jp approval document reimbursement rkpd");
    }

    @And("User input note jp approval reimbursement rkpd")
    public void user_input_note_jp_approval_reimbursement_rkpd() {
        Hooks.delay(2);
        hoPage.InputNoteJpApprovalBonPutih("Lanjutkan untuk approval partner");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note jp approval reimbursement rkpd");
    }

    @Then("User click button save jp approval reimbursement rkpd")
    public void user_click_button_save_jp_approval_reimbursement_rkpd() {
        Hooks.delay(2);
        hoPage.BtnSaveJpApprovalBonPutih();
        Hooks.delay(2);
        hoPage.BtnConfirmJpSaveApprovalBonPutih();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save jp approval reimbursement rkpd");
    }

    //Partner Approval Document reimbursement rkpd
    @When("User click button partner approval document reimbursement rkpd")
    public void User_click_button_partner_approval_document_reimbursement_rkpd() {
        Hooks.delay(2);
        hoPage.BtnPartnerApprovalBonPutih();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button partner approval document reimbursement rkpd");
    }

    @And("User select partner approval document reimbursement rkpd")
    public void user_select_partner_approval_document_reimbursement_rkpd() {
        Hooks.delay(2);
        hoPage.BtnSelectPartnerApprovalBonPutih();
        Hooks.delay(2);
        hoPage.SelectPartnerApprovalBonPutih();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select partner approval document reimbursement rkpd");
    }

    @And("User input note partner approval reimbursement rkpd")
    public void user_input_note_partner_approval_reimbursement_rkpd() {
        Hooks.delay(2);
        hoPage.InputNotePartnerApprovalBonPutih("Mantap Ganku");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note partner approval reimbursement rkpd");
    }

    @Then("User click button save partner approval reimbursement rkpd")
    public void user_click_button_save_partner_approval_reimbursement_rkpd() {
        Hooks.delay(2);
        hoPage.BtnSavePartnerApprovalBonPutih();
        Hooks.delay(2);
        hoPage.BtnConfirmPartnerSaveApprovalBonPutih();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save partner approval reimbursement rkpd");
    }

    //Create Document
    @When("User click button create finance documents for trip accomodation")
    public void user_click_button_create_finance_documents_for_trip_accomodation() {
        Hooks.delay(2);
        hoPage.BtnCreateFinanceDocuments();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button create finance documents for trip accomodation");
    }

    @And("User select document trip accomodation")
    public void user_select_document_trip_accomodation() {
        Hooks.delay(2);
        hoPage.SelectDocumentBonHijau();
        Hooks.delay(2);
        hoPage.BtnSelectFinanceDocuments();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select document trip accomodation");
    }

    @And("User select id st trip accomodation")
    public void user_select_id_st_trip_accomodation() {
        Hooks.delay(2);
        hoPage.BtnSearchIdStBonHijau();
        Hooks.delay(2);
        hoPage.SelectIdStBonHijau();
        Hooks.delay(2);
        hoPage.BtnSelectIdStBonHijau();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select id st trip accomodation");
    }

    @And("User input amount trip expenses trip accomodation")
    public void user_input_amount_trip_expenses_trip_accomodation() {
        Hooks.delay(2);
        hoPage.InputAmountTripExpensesBonHijau1("2500000");
        Hooks.delay(2);
        hoPage.InputAmountTripExpensesBonHijau2("1525000");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input amount trip expenses trip accomodation");
    }

    @And("User input note trip expenses trip accomodation")
    public void user_input_note_trip_expenses_trip_accomodation() {
        Hooks.delay(2);
        hoPage.InputNoteTripExpensesBonHijau1("Ticket penerbangan pesawat");
        Hooks.delay(2);
        hoPage.InputNoteTripExpensesBonHijau2("Untuk penginapan");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note trip expenses trip accomodation");
    }

    @And("User upload recipient trip expenses trip accomodation")
    public void user_upload_recipient_trip_expenses_trip_accomodation() {
        Hooks.delay(2);
        hoPage.BtnUploadRecipientTripExpensesBonHijau1("C:\\Users\\M1403QA\\Downloads\\ENFP - Bingo.png");
        Hooks.delay(2);
        hoPage.BtnUploadRecipientTripExpensesBonHijau2("C:\\Users\\M1403QA\\Downloads\\Proses kerja HO - disbursement trip.png");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User upload recipient trip expenses trip accomodation");
    }

    @Then("User click button create document trip accomodation")
    public void user_click_button_create_document_trip_accomodation() {
        Hooks.delay(2);
        hoPage.BtnCreateBonHijau();
        Hooks.delay(2);
        hoPage.BtnConfirmCreateBonHijau();
        Hooks.delay(3);
        hoPage.BtnCancelDownloadBonHijau();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create document trip accomodation");
    }

    //JP Approval Document trip accomodation
    @When("User click button jp approval document trip accomodation")
    public void User_click_button_jp_approval_document_trip_accomodation() {
        Hooks.delay(2);
        hoPage.BtnJpApprovalBonHijau();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button jp approval document trip accomodation");
    }

    @And("User select jp approval document trip accomodation")
    public void user_select_jp_approval_document_trip_accomodation() {
        Hooks.delay(2);
        hoPage.BtnSelectJpApprovalBonHijau();
        Hooks.delay(2);
        hoPage.SelectJpApprovalBonHijau();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select jp approval document trip accomodation");
    }

    @And("User input note jp approval trip accomodation")
    public void user_input_note_jp_approval_trip_accomodation() {
        Hooks.delay(2);
        hoPage.InputNoteJpApprovalBonHijau("Lanjutkan untuk approval partner");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note jp approval trip accomodation");
    }

    @Then("User click button save jp approval trip accomodation")
    public void user_click_button_save_jp_approval_trip_accomodation() {
        Hooks.delay(2);
        hoPage.BtnSaveJpApprovalBonHijau();
        Hooks.delay(2);
        hoPage.BtnConfirmJpSaveApprovalBonHijau();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save jp approval trip accomodation");
    }

    //Partner Approval Document trip accomodation
    @When("User click button partner approval document trip accomodation")
    public void User_click_button_partner_approval_document_trip_accomodation() {
        Hooks.delay(2);
        hoPage.BtnPartnerApprovalBonHijau();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button partner approval document trip accomodation");
    }

    @And("User select partner approval document trip accomodation")
    public void user_select_partner_approval_document_trip_accomodation() {
        Hooks.delay(2);
        hoPage.BtnSelectPartnerApprovalBonHijau();
        Hooks.delay(2);
        hoPage.SelectPartnerApprovalBonHijau();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select partner approval document trip accomodation");
    }

    @And("User input note partner approval trip accomodation")
    public void user_input_note_partner_approval_trip_accomodation() {
        Hooks.delay(2);
        hoPage.InputNotePartnerApprovalBonHijau("Mantap Ganku");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note partner approval trip accomodation");
    }

    @Then("User click button save partner approval trip accomodation")
    public void user_click_button_save_partner_approval_trip_accomodation() {
        Hooks.delay(2);
        hoPage.BtnSavePartnerApprovalBonHijau();
        Hooks.delay(2);
        hoPage.BtnConfirmPartnerSaveApprovalBonHijau();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save partner approval trip accomodation");
    }

    //Create Document disbursement trip
    @When("User click button create finance documents for disbursement trip")
    public void user_click_button_create_finance_documents_for_disbursement_trip() {
        Hooks.delay(2);
        hoPage.BtnCreateFinanceDocuments();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create finance documents for disbursement trip");
    }

    @And("User select document disbursement trip")
    public void user_select_document_disbursement_trip() {
        Hooks.delay(2);
        hoPage.SelectDocumentBonKuning();
        Hooks.delay(2);
        hoPage.BtnSelectFinanceDocuments();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select document disbursement trip");
    }

    @And("User select id reimbursement rkpd disbursement trip")
    public void user_select_id_reimbursement_rkpd_disbursement_trip() {
        Hooks.delay(2);
        hoPage.BtnSearchIdBonPutihBonKuning();
        Hooks.delay(2);
        hoPage.SelectIdBonPutihBonKuning();
        Hooks.delay(2);
        hoPage.BtnSelectIdBonPutihBonKuning();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select id reimbursement rkpd disbursement trip");
    }

    @And("User checklist team incurred expenses reimbursement disbursement trip")
    public void user_checklist_team_incurred_expenses_reimbursement_disbursement_trip() {
        Hooks.delay(2);
        hoPage.ChecklistProfessionalFee1BonKuning();
        Hooks.delay(2);
        hoPage.ChecklistCourtMoney1BonKuning();
        Hooks.delay(2);
        hoPage.ChecklistAllowance1BonKuning();
        Hooks.delay(2);
        hoPage.ChecklistMealAllowance1BonKuning();
        Hooks.delay(2);
        hoPage.ChecklistProfessionalFee2BonKuning();
        Hooks.delay(2);
        hoPage.ChecklistCourtMoney2BonKuning();
        Hooks.delay(2);
        hoPage.ChecklistAllowance2BonKuning();
        Hooks.delay(2);
        hoPage.ChecklistMealAllowance2BonKuning();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User checklist team incurred expenses reimbursement disbursement trip");
    }

    @Then("User click button create document disbursement trip")
    public void user_click_button_create_document_disbursement_trip() {
        Hooks.delay(2);
        hoPage.BtnCreateBonKuning();
        Hooks.delay(2);
        hoPage.BtnConfirmCreateBonKuning();
        Hooks.delay(3);
        hoPage.BtnCancelDownloadBonKuning();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create document disbursement trip");
    }

    //JP Approval Document disbursement trip
    @When("User click button jp approval document disbursement trip")
    public void User_click_button_jp_approval_document_disbursement_trip() {
        Hooks.delay(2);
        hoPage.BtnJpApprovalBonKuning();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button jp approval document disbursement trip");
    }

    @And("User select jp approval document disbursement trip")
    public void user_select_jp_approval_document_disbursement_trip() {
        Hooks.delay(2);
        hoPage.BtnSelectJpApprovalBonKuning();
        Hooks.delay(2);
        hoPage.SelectJpApprovalBonKuning();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select jp approval document disbursement trip");
    }

    @And("User input note jp approval disbursement trip")
    public void user_input_note_jp_approval_disbursement_trip() {
        Hooks.delay(2);
        hoPage.InputNoteJpApprovalBonKuning("Lanjutkan untuk approval partner");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note jp approval disbursement trip");
    }

    @Then("User click button save jp approval disbursement trip")
    public void user_click_button_save_jp_approval_disbursement_trip() {
        Hooks.delay(2);
        hoPage.BtnSaveJpApprovalBonKuning();
        Hooks.delay(2);
        hoPage.BtnConfirmJpSaveApprovalBonKuning();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save jp approval disbursement trip");
    }

    //Partner Approval Document disbursement trip
    @When("User click button partner approval document disbursement trip")
    public void User_click_button_partner_approval_document_disbursement_trip() {
        Hooks.delay(2);
        hoPage.BtnPartnerApprovalBonKuning();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button partner approval document disbursement trip");
    }

    @And("User select partner approval document disbursement trip")
    public void user_select_partner_approval_document_disbursement_trip() {
        Hooks.delay(2);
        hoPage.BtnSelectPartnerApprovalBonKuning();
        Hooks.delay(2);
        hoPage.SelectPartnerApprovalBonKuning();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select partner approval document disbursement trip");
    }

    @And("User input note partner approval disbursement trip")
    public void user_input_note_partner_approval_disbursement_trip() {
        Hooks.delay(2);
        hoPage.InputNotePartnerApprovalBonKuning("Mantap semuanya");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note partner approval disbursement trip");
    }

    @Then("User click button save partner approval disbursement trip")
    public void user_click_button_save_partner_approval_disbursement_trip() {
        Hooks.delay(2);
        hoPage.BtnSavePartnerApprovalBonKuning();
        Hooks.delay(2);
        hoPage.BtnConfirmPartnerSaveApprovalBonKuning();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save partner approval disbursement trip");
    }

    //Create Document deposit receipt
    @When("User click button create finance documents for deposit receipt")
    public void user_click_button_create_finance_documents_for_deposit_receipt() {
        Hooks.delay(2);
        hoPage.BtnCreateFinanceDocuments();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create finance documents for deposit receipt");
    }

    @And("User select document deposit receipt")
    public void user_select_document_deposit_receipt() {
        Hooks.delay(2);
        hoPage.SelectDocumentBonMerah();
        Hooks.delay(2);
        hoPage.BtnSelectFinanceDocuments();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select document deposit receipt");
    }

    @And("User input description deposit receipt")
    public void user_input_description_deposit_receipt() {
        Hooks.delay(2);
        hoPage.InputDescriptionBonMerah("Setoran untuk biaya jasa penanganan kasus");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input description deposit receipt");
    }

    @And("User select receipt date deposit receipt")
    public void user_select_receipt_date_deposit_receipt() {
        Hooks.delay(2);
        hoPage.SelectReceiptDateBonMerah();
        Hooks.delay(2);
        hoPage.BtnSelectTodayReceiptDateBonMerah();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select receipt date deposit receipt");
    }

    @And("User input account number deposit receipt")
    public void user_input_account_number_deposit_receipt() {
        Hooks.delay(2);
        hoPage.InputAccountNumberBonMerah("27384967382");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input account number deposit receipt");
    }

    @And("User input amount received deposit receipt")
    public void user_input_amount_received_deposit_receipt() {
        Hooks.delay(2);
        hoPage.InputAmountReceivedBonMerah("52000000");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input amount received deposit receipt");
    }

    @And("User input final value deposit receipt")
    public void user_input_final_value_deposit_receipt() {
        Hooks.delay(2);
        hoPage.InputFinalValueBonMerah("52000000");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input final value deposit receipt");
    }

    @Then("User click button create document deposit receipt")
    public void user_click_button_create_document_deposit_receipt() {
        Hooks.delay(2);
        hoPage.BtnCreateBonMerah();
        Hooks.delay(2);
        hoPage.BtnConfirmCreateBonMerah();
        Hooks.delay(3);
        hoPage.BtnCancelDownloadBonMerah();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create document deposit receipt");
    }

    //View RKPD
    @When("User click id rkpd")
    public void user_click_id_rkpd() {
        Hooks.delay(2);
        hoPage.BtnViewRkpd();
        Hooks.delay(2);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_UP);
            robot.keyRelease(KeyEvent.VK_PAGE_UP);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        Hooks.delay(3);
        hoPage.BtnBackViewRkpd();
        Hooks.delay(2);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        extentTest.log(LogStatus.PASS, "User click id rkpd");
    }

    //View Surat Tugas
    @When("User click id surat tugas")
    public void user_click_id_surat_tugas() {
        Hooks.delay(2);
        hoPage.BtnViewSuratTugas();
        Hooks.delay(2);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_UP);
            robot.keyRelease(KeyEvent.VK_PAGE_UP);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        Hooks.delay(3);
        hoPage.BtnBackViewSuratTugas();
        Hooks.delay(2);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        extentTest.log(LogStatus.PASS, "User click id surat tugas");
    }

    //View trip accomodation
    @When("User click id trip accomodation")
    public void user_click_id_trip_accomodation() {
        Hooks.delay(2);
        hoPage.BtnViewBonHijau();
        Hooks.delay(2);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_UP);
            robot.keyRelease(KeyEvent.VK_PAGE_UP);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        Hooks.delay(3);
        hoPage.BtnBackViewBonHijau();
        Hooks.delay(2);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        extentTest.log(LogStatus.PASS, "User click id trip accomodation");
    }

    //View LKPD
    @When("User click id lkpd")
    public void user_click_id_lkpd() {
        Hooks.delay(2);
        hoPage.BtnViewLkpd();
        Hooks.delay(2);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_UP);
            robot.keyRelease(KeyEvent.VK_PAGE_UP);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        Hooks.delay(3);
        hoPage.BtnBackViewLkpd();
        Hooks.delay(2);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        extentTest.log(LogStatus.PASS, "User click id lkpd");
    }

    //View reimbursement rkpd
    @When("User click id reimbursement rkpd")
    public void user_click_id_reimbursement_rkpd() {
        Hooks.delay(2);
        hoPage.BtnViewBonPutih();
        Hooks.delay(2);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_UP);
            robot.keyRelease(KeyEvent.VK_PAGE_UP);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        Hooks.delay(3);
        hoPage.BtnBackViewBonPutih();
        Hooks.delay(2);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        extentTest.log(LogStatus.PASS, "User click id reimbursement rkpd");
    }

    //View disbursement trip
    @When("User click id disbursement trip")
    public void user_click_id_disbursement_trip() {
        Hooks.delay(2);
        hoPage.BtnViewBonKuning();
        Hooks.delay(2);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_UP);
            robot.keyRelease(KeyEvent.VK_PAGE_UP);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        Hooks.delay(3);
        hoPage.BtnBackViewBonKuning();
        Hooks.delay(2);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        extentTest.log(LogStatus.PASS, "User click id disbursement trip");
    }

    //View Business Trip Recap
    @When("User click button view business trip recap 1")
    public void user_click_button_view_business_trip_recap_1() {
        Hooks.delay(2);
        hoPage.BtnViewBusinessTripRecap1();
        Hooks.delay(2);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_UP);
            robot.keyRelease(KeyEvent.VK_PAGE_UP);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        Hooks.delay(3);
        hoPage.BtnBackViewBusinessTripRecap();
        Hooks.delay(2);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        extentTest.log(LogStatus.PASS, "User click button view business trip recap 1");
    }

    //View Business Trip Expenses Recap
    @When("User click button view business trip expenses recap")
    public void user_click_button_view_business_trip_expenses_recap() {
        Hooks.delay(2);
        hoPage.BtnViewBusinessTripExpensesRecap();
        Hooks.delay(2);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_UP);
            robot.keyRelease(KeyEvent.VK_PAGE_UP);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        Hooks.delay(3);
        hoPage.BtnBackViewBusinessTripExpensesRecap();
        Hooks.delay(2);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        extentTest.log(LogStatus.PASS, "User click button view business trip expenses recap");
    }

    //Edit Document disbursement trip
    @When("User click button view business trip expenses recap for edit disbursement trip")
    public void user_click_button_view_business_trip_expenses_recap_for_edit_disbursement_trip() {
        Hooks.delay(2);
        hoPage.BtnViewBusinessTripExpensesRecap();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button view business trip expenses recap for edit disbursement trip");
    }

    @And("User click button edit document disbursement trip")
    public void user_click_button_edit_document_disbursement_trip() {
        Hooks.delay(2);
        hoPage.BtnEditBonKuning();
        Hooks.delay(3);
        extentTest.log(LogStatus.PASS, "User click button edit document disbursement trip");
    }

    @And("User edit data document disbursement trip")
    public void user_edit_data_document_disbursement_trip() {
        Hooks.delay(2);
        hoPage.UnchecklistMealAllowanceEditBonKuning();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit data document disbursement trip");
    }

    @Then("User save edit document disbursement trip")
    public void user_save_edit_document_disbursement_trip() {
        Hooks.delay(3);
        hoPage.BtnSaveEditBonKuning();
        Hooks.delay(2);
        hoPage.BtnConfirmSaveEditBonKuning();
        Hooks.delay(2);
        hoPage.BtnCancelDownloadBonKuning();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit document disbursement trip");
    }

    //Delete Document disbursement trip
    @When("User click button delete document disbursement trip")
    public void user_click_button_delete_document_disbursement_trip() {
        Hooks.delay(2);
        hoPage.BtnDeleteBonKuning();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button delete document disbursement trip");
    }

    @Then("User click button confirm delete document disbursement trip")
    public void user_click_button_confirm_delete_document_disbursement_trip() {
        Hooks.delay(3);
        hoPage.BtnConfirmDeleteBonKuning();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete document disbursement trip");
    }

    //Edit Document reimbursement rkpd
    @When("User click button edit document reimbursement rkpd")
    public void user_click_button_edit_document_reimbursement_rkpd() {
        Hooks.delay(2);
        hoPage.BtnEditBonPutih();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit document reimbursement rkpd");
    }

    @And("User edit data document reimbursement rkpd")
    public void user_edit_data_document_reimbursement_rkpd() {
        Hooks.delay(2);
        hoPage.UnchecklistMealAllowanceEditBonPutih();
        Hooks.delay(3);
        extentTest.log(LogStatus.PASS, "User edit data document reimbursement rkpd");
    }

    @Then("User save edit document reimbursement rkpd")
    public void user_save_edit_document_reimbursement_rkpd() {
        Hooks.delay(3);
        hoPage.BtnSaveEditBonPutih();
        Hooks.delay(2);
        hoPage.BtnConfirmSaveEditBonPutih();
        Hooks.delay(2);
        hoPage.BtnCancelDownloadBonPutih();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit document reimbursement rkpd");
    }

    //Delete Document reimbursement rkpd
    @When("User click button delete document reimbursement rkpd")
    public void user_click_button_delete_document_reimbursement_rkpd() {
        Hooks.delay(2);
        hoPage.BtnDeleteBonPutih();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button delete document reimbursement rkpd");
    }

    @Then("User click button confirm delete document reimbursement rkpd")
    public void user_click_button_confirm_delete_document_reimbursement_rkpd() {
        Hooks.delay(3);
        hoPage.BtnConfirmDeleteBonPutih();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete document reimbursement rkpd");
    }

    //Edit Document trip accomodation
    @When("User click button edit document trip accomodation")
    public void user_click_button_edit_document_trip_accomodation() {
        Hooks.delay(2);
        hoPage.BtnEditBonHijau();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit document trip accomodation");
    }

    @And("User edit data document trip accomodation")
    public void user_edit_data_document_trip_accomodation() {
        Hooks.delay(2);
        hoPage.BtnAddTripExpensesEditBonHijau();
        Hooks.delay(3);
        hoPage.InputListOfExpensesTripExpensesEditBonHijau("Shopping");
        Hooks.delay(3);
        hoPage.InputAmountTripExpensesEditBonHijau("1050000");
        Hooks.delay(3);
        hoPage.InputNoteTripExpensesEditBonHijau("Untuk kebutuhan belanja");
        Hooks.delay(3);
        hoPage.BtnUploadRecipientTripExpensesEditBonHijau("C:\\Users\\M1403QA\\Downloads\\WhatsApp Image 2024-02-20 at 17.26.10_42cde6da.jpg");
        Hooks.delay(3);
        extentTest.log(LogStatus.PASS, "User edit data document trip accomodation");
    }

    @Then("User save edit document trip accomodation")
    public void user_save_edit_document_trip_accomodation() {
        Hooks.delay(3);
        hoPage.BtnSaveEditBonHijau();
        Hooks.delay(2);
        hoPage.BtnConfirmSaveEditBonHijau();
        Hooks.delay(2);
        hoPage.BtnCancelDownloadBonHijau();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit document trip accomodation");
    }

    //Delete Document trip accomodation
    @When("User click button delete document trip accomodation")
    public void user_click_button_delete_document_trip_accomodation() {
        Hooks.delay(2);
        hoPage.BtnDeleteBonHijau();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button delete document trip accomodation");
    }

    @Then("User click button confirm delete document trip accomodation")
    public void user_click_button_confirm_delete_document_trip_accomodation() {
        Hooks.delay(3);
        hoPage.BtnConfirmDeleteBonHijau();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete document trip accomodation");
    }

    //Edit Document LKPD
    @When("User click button view business trip recap for edit administrative document")
    public void user_click_button_view_business_trip_recap_for_edit_administrative_document() {
        Hooks.delay(2);
        hoPage.BtnViewBusinessTripRecap();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button view business trip recap for edit administrative document");
    }

    @And("User click button edit document lkpd")
    public void user_click_button_edit_document_lkpd() {
        Hooks.delay(2);
        hoPage.BtnEditLkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit document lkpd");
    }

    @And("User edit data document lkpd")
    public void user_edit_data_document_lkpd() {
        Hooks.delay(2);
        hoPage.BtnChooseResultReportEditLkpd();
        Hooks.delay(3);
        hoPage.SelectActivityResultReportEditLkpd();
        Hooks.delay(3);
        hoPage.BtnSelectActivityResultReportEditLkpd();
        Hooks.delay(3);
        extentTest.log(LogStatus.PASS, "User edit data document lkpd");
    }

    @Then("User save edit document lkpd")
    public void user_save_edit_document_lkpd() {
        Hooks.delay(3);
        hoPage.BtnSaveEditLkpd();
        Hooks.delay(2);
        hoPage.BtnConfirmSaveEditLkpd();
        Hooks.delay(2);
        hoPage.BtnCancelDownloadLkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit document lkpd");
    }

    //Delete Document LKPD
    @When("User click button delete document lkpd")
    public void user_click_button_delete_document_lkpd() {
        Hooks.delay(2);
        hoPage.BtnDeleteLkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button delete document lkpd");
    }

    @Then("User click button confirm delete document lkpd")
    public void user_click_button_confirm_delete_document_lkpd() {
        Hooks.delay(3);
        hoPage.BtnConfirmDeleteLkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete document lkpd");
    }

    //Edit Document Surat Tugas
    @When("User click button edit document surat tugas")
    public void user_click_button_edit_document_surat_tugas() {
        Hooks.delay(2);
        hoPage.BtnEditSuratTugas();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit document surat tugas");
    }

    @And("User edit data document surat tugas")
    public void user_edit_data_document_surat_tugas() {
        Hooks.delay(2);
        hoPage.UnchecklistTicketListOfExpensesEditSuratTugas();
        Hooks.delay(3);
        extentTest.log(LogStatus.PASS, "User edit data document surat tugas");
    }

    @Then("User save edit document surat tugas")
    public void user_save_edit_document_surat_tugas() {
        Hooks.delay(3);
        hoPage.BtnSaveEditSuratTugas();
        Hooks.delay(2);
        hoPage.BtnConfirmSaveEditSuratTugas();
        Hooks.delay(2);
        hoPage.BtnCancelDownloadSuratTugas();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit document surat tugas");
    }

    //Delete Document Surat Tugas
    @When("User click button delete document surat tugas")
    public void user_click_button_delete_document_surat_tugas() {
        Hooks.delay(2);
        hoPage.BtnDeleteSuratTugas();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button delete document surat tugas");
    }

    @Then("User click button confirm delete document surat tugas")
    public void user_click_button_confirm_delete_document_surat_tugas() {
        Hooks.delay(3);
        hoPage.BtnConfirmDeleteSuratTugas();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete document surat tugas");
    }

    //Edit Document RKPD
    @When("User click button edit document rkpd")
    public void user_click_button_edit_document_rkpd() {
        Hooks.delay(2);
        hoPage.BtnEditRkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit document rkpd");
    }

    @And("User edit data document rkpd")
    public void user_edit_data_document_rkpd() {
        Hooks.delay(2);
        hoPage.BtnUploadTaskDocuments("C:\\Users\\M1403QA\\Downloads\\Rekap Absensi 03-05-2024.xlsx");
        Hooks.delay(3);
        extentTest.log(LogStatus.PASS, "User edit data document rkpd");
    }

    @Then("User save edit document rkpd")
    public void user_save_edit_document_rkpd() {
        Hooks.delay(3);
        hoPage.BtnSaveEditRkpd();
        Hooks.delay(2);
        hoPage.BtnConfirmSaveEditRkpd();
        Hooks.delay(2);
        hoPage.BtnCancelDownloadRkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit document rkpd");
    }

    //Delete Document RKPD
    @When("User click button delete document rkpd")
    public void user_click_button_delete_document_rkpd() {
        Hooks.delay(2);
        hoPage.BtnDeleteRkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button delete document rkpd");
    }

    @Then("User click button confirm delete document rkpd")
    public void user_click_button_confirm_delete_document_rkpd() {
        Hooks.delay(3);
        hoPage.BtnConfirmDeleteRkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete document rkpd");
    }

    //Upload Document HO Working Plan
    @When("User click button upload document")
    public void user_click_button_upload_document() {
        Hooks.delay(2);
        hoPage.BtnUploadDocumentHoWorkingPlan();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button upload document");
    }

    @And("User attach document for upload")
    public void user_attach_document_for_upload() {
        Hooks.delay(2);
        hoPage.BtnChooseFileUploadDocumentHoWorkingPlan("C:\\Users\\M1403QA\\Downloads\\Rekap Absensi 03-05-2024.xlsx");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User attach document for upload");
    }

    @Then("User click button upload")
    public void user_click_button_upload() {
        Hooks.delay(2);
        hoPage.BtnUploadDocument();
        Hooks.delay(2);
        hoPage.BtnConfirmUploadDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button upload");
    }

    //Delete Upload Document HO Working Plan
    @When("User click button delete upload document ho working plan")
    public void user_click_button_delete_upload_document_ho_working_plan() {
        Hooks.delay(2);
        hoPage.BtnDeleteUploadDocumentHoWorkingPlan();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button delete upload document ho working plan");
    }

    @Then("User click button confirm delete upload document ho working plan")
    public void user_click_button_confirm_delete_upload_document_ho_working_plan() {
        Hooks.delay(3);
        hoPage.BtnConfirmDeleteUploadDocumentHoWorkingPlan();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete upload document ho working plan");
    }

    //Create Notulen HO Working Plan
    @When("User click button notulen")
    public void user_click_button_notulen() {
        Hooks.delay(2);
        hoPage.BtnNotulenHoworkingPlan();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button notulen");
    }

    @And("User select name of team notulen")
    public void user_select_name_of_team_notulen() {
        Hooks.delay(2);
        hoPage.BtnSelectTeamNameOfTeamNotulen();
        Hooks.delay(2);
        hoPage.NameOfTeam1Notulen();
        Hooks.delay(2);
        hoPage.NameofTeam2Notulen();
        Hooks.delay(2);
        hoPage.BtnSelectNameOfTeamNotulen();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select name of team notulen");
    }

    @And("User input meeting leader")
    public void user_input_meeting_leader() {
        Hooks.delay(2);
        hoPage.InputMeetingLeaderNotulen("Wildanu");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input meeting leader");
    }

    @And("User input address notulen")
    public void user_input_address_notulen() {
        Hooks.delay(2);
        hoPage.InputAddressNotulen("Jalan Bangka No.18");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input address notulen");
    }

    @And("User input meeting participants notulen")
    public void user_input_meeting_participants_notulen() {
        Hooks.delay(2);
        hoPage.InputMeetingParticipantsNotulen("Rayfil");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input meeting participants notulen");
    }

    @And("User select date notulen")
    public void user_select_date_notulen() {
        Hooks.delay(2);
        hoPage.BtnDateNotulen();
        Hooks.delay(2);
        hoPage.BtnTodayDateNotulen();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select date notulen");
    }

    @And("User input meeting opened by notulen")
    public void user_input_meeting_opened_by_notulen() {
        Hooks.delay(2);
        hoPage.InputMeetingOpenedByNotulen("Pak Rahmad");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input meeting opened by notulen");
    }

    @And("User input meeting topic notulen")
    public void user_input_meeting_topic_notulen() {
        Hooks.delay(2);
        hoPage.InputMeetingTopicNotulen("Pembahasan Anggaran Perusahaan");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input meeting topic notulen");
    }

    @And("User input note notulen")
    public void user_input_note_notulen() {
        Hooks.delay(2);
        hoPage.InputNoteNotulen("Pembahasan untuk anggaran pada tahun 2025");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note notulen");
    }

    @And("User input meeting results notulen")
    public void user_input_meeting_results_notulen() {
        Hooks.delay(2);
        hoPage.InputMeetingResultNotulen("Anggran untuk tahun 2025 akan dinaikkan sebesar 23 %");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input meeting results notulen");
    }

    @Then("User click button create notulen")
    public void user_click_button_create_notulen() {
        Hooks.delay(2);
        hoPage.BtnCreateNotulen();
        Hooks.delay(2);
        hoPage.BtnConfirmCreateNotulen();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create notulen");
    }

    //Create HO Reimbursement HO Working Plan
    @When("User click button create reimbursement")
    public void user_click_button_create_reimbursement() {
        Hooks.delay(2);
        hoPage.BtnCreateReimbursementHoWorkingPlan();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create reimbursement");
    }

    @And("User select date ho reimbursement")
    public void user_select_date_ho_reimbursement() {
        Hooks.delay(2);
        hoPage.BtnDateHoReimbursement();
        Hooks.delay(2);
        hoPage.BtnTodayDateHoReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select date ho reimbursement");
    }

    @And("User input note ho reimbursement")
    public void User_input_note_ho_reimbursement() {
        Hooks.delay(2);
        hoPage.InputNoteHoReimbursement("Rembes pergi ketemu client");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note ho reimbursement");
    }

    @And("User select member on duty ho reimbursement")
    public void user_select_member_on_duty_ho_reimbursement() {
        Hooks.delay(2);
        hoPage.BtnSelectTeamNameOfTeamHoReimbursement();
        Hooks.delay(2);
        hoPage.MemberOnDuty1HoReimbursement();
        Hooks.delay(2);
        hoPage.MemberOnDuty2HoReimbursement();
        Hooks.delay(2);
        hoPage.BtnSelectMemberOnDutyHoReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select member on duty ho reimbursement");
    }

    @And("User input list of expenses reimbursement ho reimbursement")
    public void user_input_list_of_expenses_reimbursement_ho_reimbursement() {
        Hooks.delay(2);
        hoPage.InputListOfExpensesReibursementHoReimbursement("Makan di restoran");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input list of expenses reimbursement ho reimbursement");
    }

    @And("User input amount reimbursement ho reimbursement")
    public void user_input_amount_reimbursement_ho_reimbursement() {
        Hooks.delay(2);
        hoPage.InputAmountReibursementHoReimbursement("236000");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input amount reimbursement ho reimbursement");
    }

    @And("User input note reimbursement ho reimbursement")
    public void user_input_note_reimbursement_ho_reimbursement() {
        Hooks.delay(2);
        hoPage.InputNoteReibursementHoReimbursement("Makan bersama client");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note reimbursement ho reimbursement");
    }

    @And("User attach receipt reimbursement ho reimbursement")
    public void user_attach_receipt_reimbursement_ho_reimbursement() {
        Hooks.delay(2);
        hoPage.AttachReceiptReimbursementHoReimbursement("C:\\Users\\M1403QA\\Downloads\\fa1dfc8bc8824147a66b_Rekap TER 2024.pdf");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User attach receipt reimbursement ho reimbursement");
    }

    @Then("User click button create ho reimbursement")
    public void user_click_button_create_ho_reimbursement() {
        Hooks.delay(2);
        hoPage.BtnCreateHoReimbursement();
        Hooks.delay(2);
        hoPage.BtnConfirmCreateHoReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create ho reimbursement");
    }

    //Edit HO Reimbursement HO Working Plan
    @When("User click button edit ho reimbursement")
    public void user_click_button_edit_ho_reimbursement() {
        Hooks.delay(2);
        hoPage.BtnEditHoReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit ho reimbursement");
    }

    @And("User edit note ho reimbursement")
    public void user_edit_note_ho_reimbursement() {
        Hooks.delay(2);
        hoPage.InputDeleteNoteHoReimbursement();
        Hooks.delay(2);
        hoPage.InputEditNoteHoReimbursement("Untuk makan hari ini");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit note ho reimbursement");
    }

    @Then("User click button save edit ho reimbursement")
    public void user_click_button_save_edit_ho_reimbursement() {
        Hooks.delay(2);
        hoPage.BtnSaveEditHoReimbursement();
        Hooks.delay(2);
        hoPage.BtnConfirmSaveEditHoReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save edit ho reimbursement");
    }

    //View HO Reimbursement HO Working Plan
    @When("User click button view ho reimbursement")
    public void user_click_button_view_ho_reimbursement() {
        Hooks.delay(2);
        hoPage.BtnViewHoReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button view ho reimbursement");
    }

    @Then("User click button back view ho reimbursement")
    public void user_click_button_back_view_ho_reimbursement() {
        Hooks.delay(2);
        hoPage.BtnBackViewHoReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button back view ho reimbursement");
    }

    //JP Approval HO Reimbursement HO Working Plan
    @When("User click button approval ho reimbursement")
    public void user_click_button_approval_ho_reimbursement() {
        Hooks.delay(2);
        hoPage.BtnApprovalHoReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button approval ho reimbursement");
    }

    @And("User select jp approval ho reimbursement")
    public void user_select_jp_approval_ho_reimbursement() {
        Hooks.delay(2);
        hoPage.BtnSelectJpApprovalHoReimbursement();
        Hooks.delay(2);
        hoPage.SelectJpApproveApprovalHoReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select jp approval ho reimbursement");
    }

    @Then("User click button save jp approval ho reimbursement")
    public void user_click_button_save_jp_approval_ho_reimbursement() {
        Hooks.delay(2);
        hoPage.BtnSaveJpApprovalHoReimbursement();
        Hooks.delay(2);
        hoPage.BtnConfirmSaveJpApprovalHoReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save jp approval ho reimbursement");
    }

    //Delete HO Reimbursement HO Working Plan
    @When("User click button delete ho reimbursement")
    public void user_click_button_delete_ho_reimbursement() {
        Hooks.delay(2);
        hoPage.BtnDeleteHoReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button delete ho reimbursement");
    }

    @Then("User click button confirm delete ho reimbursement")
    public void user_click_button_confirm_delete_ho_reimbursement() {
        Hooks.delay(2);
        hoPage.BtnConfirmDeleteHoReimbursement();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete ho reimbursement");
    }

    //View HO Activities HO Working Plan
    @When("User click button view ho activities")
    public void user_click_button_view_ho_activities() {
        Hooks.delay(2);
        hoPage.BtnHoActivities();
        Hooks.delay(2);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        extentTest.log(LogStatus.PASS, "User click button view ho activities");
    }

    @Then("User click button back view ho activities")
    public void user_click_button_back_view_ho_activities() {
        Hooks.delay(2);
        hoPage.BtnBackHoActivities();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button back view ho activities");
    }

    //Complete HO
    @When("User click button tab dashboard ho")
    public void user_click_button_tab_dashboard_ho() {
        Hooks.delay(2);
        hoPage.TabHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button tab dashboard ho");
    }

    @And("User search valid data based id ho")
    public void user_search_valid_data_based_id_ho() {
        Hooks.delay(2);
        hoPage.InputSearchHoBerjalan("hodev004");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User search valid data based id ho");
    }

    @And("User click button complete ho")
    public void user_click_button_complete_ho() {
        Hooks.delay(2);
        hoPage.BtnCompleteHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button complete ho");
    }

    @Then("User click confirm complete ho")
    public void user_click_button_confirm_complete_ho() {
        Hooks.delay(2);
        hoPage.InputNoteCompleteHo("HO ini telah selesai dikerjakan");
        Hooks.delay(2);
        hoPage.BtnConfirmCompleteHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click confirm complete ho");
    }

    //Enter List Approval Page
    @When("User click tab list approval")
    public void user_click_list_approval() {
        Hooks.delay(1);
        hoPage.TabListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab list approval");
    }

    @Then("User get text title page list approval")
    public void user_get_text_title_page_list_approval() {
        Hooks.delay(1);
        Assert.assertEquals(hoPage.getTxtListApprovalHo(), "List Approval");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page list approval");
    }

    //JP Approval Task List Approval
    @When("User click button approval jp task list approval")
    public void user_click_button_approval_jp_task_list_approval() {
        Hooks.delay(1);
        hoPage.BtnApprovalJpTaskActivityListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button approval jp task list approval");
    }

    @And("User click button approve jp document task list approval")
    public void user_click_button_approve_jp_document_task_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSelectJpApprovalTaskActivityListApprovalHo();
        Hooks.delay(1);
        hoPage.SelectJpApproveApprovalTaskActivityListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button approve jp document task list approval");
    }

    @Then("User click button save jp approval task list approval")
    public void user_click_button_save_jp_approval_task_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSaveApprovalTaskActivityListApprovalHo();
        Hooks.delay(1);
        hoPage.BtnConfirmSaveApprovalTaskActivityListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button save jp approval task list approval");
    }

    //Partner Approval Task List Approval
    @When("User select filter partner approval task list approval")
    public void user_select_filter_partner_approval_task_list_approval() {
        Hooks.delay(1);
        hoPage.BtnFilterApprovalListApprovalHo();
        Hooks.delay(2);
        hoPage.SelectPartnerApprovalListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select filter partner approval task list approval");
    }

    @And("User click button approval partner task list approval")
    public void user_click_button_approval_partner_task_list_approval() {
        Hooks.delay(1);
        hoPage.BtnApprovalPartnerTaskActivityListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button approval partner task list approval");
    }

    @And("User click button approve partner approval document task list approval")
    public void user_click_button_approve_partner_approval_document_task_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSelectPartnerApprovalTaskActivityListApprovalHo();
        Hooks.delay(1);
        hoPage.SelectPartnerApproveApprovalTaskActivityListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button approve partner approval document task list approval");
    }

    @Then("User click button save partner approval task list approval")
    public void user_click_button_save_partner_approval_task_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSaveApprovalTaskActivityListApprovalHo();
        Hooks.delay(1);
        hoPage.BtnConfirmSaveApprovalTaskActivityListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button save partner approval task list approval");
    }

    //JP Approval RKPD List Approval
    @When("User select filter jp approval rkpd list approval")
    public void user_select_filter_jp_approval_rkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnFilterApprovalListApprovalHo();
        Hooks.delay(2);
        hoPage.SelectJpApprovalListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select filter jp approval rkpd list approval");
    }

    @And("User select sort by rkpd list approval")
    public void user_select_sort_by_rkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSortByApprovalListApprovalHo();
        Hooks.delay(2);
        hoPage.SelectSortByRkpdApprovalListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select sort by rkpd list approval");
    }

    @And("User click button approval jp rkpd list approval")
    public void user_click_button_jp_approval_rkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnApprovalJpRkpdListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button approval jp rkpd list approval");
    }

    @And("User click button approve jp document rkpd list approval")
    public void user_click_button_approve_jp_document_rkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSelectJpApprovalRkpdListApprovalHo();
        Hooks.delay(1);
        hoPage.SelectJpApproveApprovalRkpdListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button approve jp document rkpd list approval");
    }

    @Then("User click button save jp approval rkpd list approval")
    public void user_click_button_save_jp_approval_rkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSaveApprovalRkpdListApprovalHo();
        Hooks.delay(1);
        hoPage.BtnConfirmSaveApprovalRkpdListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button save jp approval rkpd list approval");
    }

    //Partner Approval RKPD List Approval
    @When("User select filter partner approval rkpd list approval")
    public void user_select_filter_partner_approval_rkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnFilterApprovalListApprovalHo();
        Hooks.delay(2);
        hoPage.SelectPartnerApprovalListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select filter partner approval rkpd list approval");
    }

    @And("User click button approval partner rkpd list approval")
    public void user_click_button_approval_partner_rkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnApprovalPartnerRkpdListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button approval partner rkpd list approval");
    }

    @And("User click button approve partner document rkpd list approval")
    public void user_click_button_approve_partner_document_rkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSelectPartnerApprovalRkpdListApprovalHo();
        Hooks.delay(1);
        hoPage.SelectPartnerApproveApprovalRkpdListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button approve partner document rkpd list approval");
    }

    @Then("User click button save partner approval rkpd list approval")
    public void user_click_button_save_partner_approval_rkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSaveApprovalRkpdListApprovalHo();
        Hooks.delay(1);
        hoPage.BtnConfirmSaveApprovalRkpdListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button save partner approval rkpd list approval");
    }

    //JP Approval LKPD List Approval
    @When("User select filter jp approval lkpd list approval")
    public void user_select_filter_jp_approval_lkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnFilterApprovalListApprovalHo();
        Hooks.delay(2);
        hoPage.SelectJpApprovalListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select filter jp approval lkpd list approval");
    }

    @And("User select sort by lkpd list approval")
    public void user_select_sort_by_lkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSortByApprovalListApprovalHo();
        Hooks.delay(2);
        hoPage.SelectSortByLkpdApprovalListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select sort by lkpd list approval");
    }

    @And("User click button approval jp lkpd list approval")
    public void user_click_button_jp_approval_lkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnApprovalJpLkpdListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button approval jp lkpd list approval");
    }

    @And("User click button approve jp document lkpd list approval")
    public void user_click_button_approve_jp_document_lkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSelectJpApprovalLkpdListApprovalHo();
        Hooks.delay(1);
        hoPage.SelectJpApproveApprovalLkpdListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button approve jp document lkpd list approval");
    }

    @Then("User click button save jp approval lkpd list approval")
    public void user_click_button_save_jp_approval_lkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSaveApprovalLkpdListApprovalHo();
        Hooks.delay(1);
        hoPage.BtnConfirmSaveApprovalLkpdListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button save jp approval lkpd list approval");
    }

    //Partner Approval LKPD List Approval
    @When("User select filter partner approval lkpd list approval")
    public void user_select_filter_partner_approval_lkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnFilterApprovalListApprovalHo();
        Hooks.delay(2);
        hoPage.SelectPartnerApprovalListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select filter partner approval lkpd list approval");
    }

    @And("User click button approval partner lkpd list approval")
    public void user_click_button_approval_partner_lkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnApprovalPartnerLkpdListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button approval partner lkpd list approval");
    }

    @And("User click button approve partner document lkpd list approval")
    public void user_click_button_approve_partner_document_lkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSelectPartnerApprovalLkpdListApprovalHo();
        Hooks.delay(1);
        hoPage.SelectPartnerApproveApprovalLkpdListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button approve partner document lkpd list approval");
    }

    @Then("User click button save partner approval lkpd list approval")
    public void user_click_button_save_partner_approval_lkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSaveApprovalLkpdListApprovalHo();
        Hooks.delay(1);
        hoPage.BtnConfirmSaveApprovalLkpdListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button save partner approval lkpd list approval");
    }

    //JP Approval Reimbursement RKPD List Approval
    @When("User select filter jp approval reimbursement rkpd list approval")
    public void user_select_filter_jp_approval_reimbursement_rkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnFilterApprovalListApprovalHo();
        Hooks.delay(2);
        hoPage.SelectJpApprovalListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select filter jp approval reimbursement rkpd list approval");
    }

    @And("User select sort by reimbursement rkpd list approval")
    public void user_select_sort_by_reimbursement_rkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSortByApprovalListApprovalHo();
        Hooks.delay(2);
        hoPage.SelectSortByReimbursementRkpdApprovalListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select sort by reimbursement rkpd list approval");
    }

    @And("User click button approval jp reimbursement rkpd list approval")
    public void user_click_button_jp_approval_reimbursement_rkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnApprovalJpReimbursementRkpdListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button approval jp reimbursement rkpd list approval");
    }

    @And("User click button approve jp document reimbursement rkpd list approval")
    public void user_click_button_approve_jp_document_reimbursement_rkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSelectJpApprovalReimbursementRkpdListApprovalHo();
        Hooks.delay(1);
        hoPage.SelectJpApproveApprovalReimbursementRkpdListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button approve jp document reimbursement rkpd list approval");
    }

    @Then("User click button save jp approval reimbursement rkpd list approval")
    public void user_click_button_save_jp_approval_reimbursement_rkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSaveApprovalReimbursementRkpdListApprovalHo();
        Hooks.delay(1);
        hoPage.BtnConfirmSaveApprovalReimbursementRkpdListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button save jp approval reimbursement rkpd list approval");
    }

    //Partner Approval Reimbursement RKPD List Approval
    @When("User select filter partner approval reimbursement rkpd list approval")
    public void user_select_filter_partner_approval_reimbursement_rkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnFilterApprovalListApprovalHo();
        Hooks.delay(2);
        hoPage.SelectPartnerApprovalListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select filter partner approval reimbursement rkpd list approval");
    }

    @And("User click button approval partner reimbursement rkpd list approval")
    public void user_click_button_approval_partner_reimbursement_rkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnApprovalPartnerReimbursementRkpdListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button approval partner reimbursement rkpd list approval");
    }

    @And("User click button approve partner document reimbursement rkpd list approval")
    public void user_click_button_approve_partner_document_reimbursement_rkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSelectPartnerApprovalReimbursementRkpdListApprovalHo();
        Hooks.delay(1);
        hoPage.SelectPartnerApproveApprovalReimbursementRkpdListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button approve partner document reimbursement rkpd list approval");
    }

    @Then("User click button save partner approval reimbursement rkpd list approval")
    public void user_click_button_save_partner_approval_reimbursement_rkpd_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSaveApprovalReimbursementRkpdListApprovalHo();
        Hooks.delay(1);
        hoPage.BtnConfirmSaveApprovalReimbursementRkpdListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button save partner approval reimbursement rkpd list approval");
    }

    //JP Approval Disbursement Trip List Approval
    @When("User select filter jp approval disbursement trip list approval")
    public void user_select_filter_jp_approval_disbursement_trip_list_approval() {
        Hooks.delay(1);
        hoPage.BtnFilterApprovalListApprovalHo();
        Hooks.delay(2);
        hoPage.SelectJpApprovalListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select filter jp approval disbursement trip list approval");
    }

    @And("User select sort by disbursement trip list approval")
    public void user_select_sort_by_disbursement_trip_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSortByApprovalListApprovalHo();
        Hooks.delay(2);
        hoPage.SelectSortByDisbursementTripApprovalListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select sort by disbursement trip list approval");
    }

    @And("User click button approval jp disbursement trip list approval")
    public void user_click_button_approval_jp_disbursement_trip_list_approval() {
        Hooks.delay(1);
        hoPage.BtnApprovalJpDisbursementTripListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button approval jp disbursement trip list approval");
    }

    @And("User click button approve jp document disbursement trip list approval")
    public void user_click_button_approve_jp_document_disbursement_trip_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSelectJpApprovalDisbursementTripListApprovalHo();
        Hooks.delay(1);
        hoPage.SelectJpApproveApprovalDisbursementTripListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button approve jp document disbursement trip list approval");
    }

    @Then("User click button save jp approval disbursement trip list approval")
    public void user_click_button_save_jp_approval_disbursement_trip_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSaveApprovalDisbursementTripListApprovalHo();
        Hooks.delay(1);
        hoPage.BtnConfirmSaveApprovalDisbursementTripListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button save jp approval disbursement trip list approval");
    }

    //Partner Approval Disbursement Trip List Approval
    @When("User select filter partner approval disbursement trip list approval")
    public void user_select_filter_partner_approval_disbursement_trip_list_approval() {
        Hooks.delay(1);
        hoPage.BtnFilterApprovalListApprovalHo();
        Hooks.delay(2);
        hoPage.SelectPartnerApprovalListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select filter partner approval disbursement trip list approval");
    }

    @And("User click button approval partner disbursement trip list approval")
    public void user_click_button_approval_partner_disbursement_trip_list_approval() {
        Hooks.delay(1);
        hoPage.BtnApprovalPartnerDisbursementTripListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button approval partner disbursement trip list approval");
    }

    @And("User click button approve partner document disbursement trip list approval")
    public void user_click_button_approve_partner_document_disbursement_trip_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSelectPartnerApprovalDisbursementTripListApprovalHo();
        Hooks.delay(1);
        hoPage.SelectPartnerApproveApprovalDisbursementTripListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button approve partner document disbursement trip list approval");
    }

    @Then("User click button save partner approval disbursement trip list approval")
    public void user_click_button_save_partner_approval_disbursement_trip_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSaveApprovalDisbursementTripListApprovalHo();
        Hooks.delay(1);
        hoPage.BtnConfirmSaveApprovalDisbursementTripListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button save partner approval disbursement trip list approval");
    }

    //JP Approval Trip Accommodation List Approval
    @When("User select filter jp approval trip accommodation list approval")
    public void user_select_filter_jp_approval_trip_accommodation_list_approval() {
        Hooks.delay(1);
        hoPage.BtnFilterApprovalListApprovalHo();
        Hooks.delay(2);
        hoPage.SelectJpApprovalListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select filter jp approval trip accommodation list approval");
    }

    @And("User select sort by trip accommodation list approval")
    public void user_select_sort_by_trip_accommodation_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSortByApprovalListApprovalHo();
        Hooks.delay(2);
        hoPage.SelectSortByTripAccommodationApprovalListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select sort by trip accommodation list approval");
    }

    @And("User click button approval jp trip accommodation list approval")
    public void user_click_button_approval_jp_trip_accommodation_list_approval() {
        Hooks.delay(1);
        hoPage.BtnApprovalJpTripAccommodationListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button approval jp trip accommodation list approval");
    }

    @And("User click button approve jp document trip accommodation list approval")
    public void user_click_button_approve_jp_document_trip_accommodation_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSelectJpApprovalTripAccommodationListApprovalHo();
        Hooks.delay(1);
        hoPage.SelectJpApproveApprovalTripAccommodationListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button approve jp document trip accommodation list approval");
    }

    @Then("User click button save jp approval trip accommodation list approval")
    public void user_click_button_save_jp_approval_trip_accommodation_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSaveApprovalTripAccommodationListApprovalHo();
        Hooks.delay(1);
        hoPage.BtnConfirmSaveApprovalTripAccommodationListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button save jp approval trip accommodation list approval");
    }

    //Partner Approval Trip Accommodation List Approval
    @When("User select filter partner approval trip accommodation list approval")
    public void user_select_filter_partner_approval_trip_accommodation_list_approval() {
        Hooks.delay(1);
        hoPage.BtnFilterApprovalListApprovalHo();
        Hooks.delay(2);
        hoPage.SelectPartnerApprovalListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select filter partner approval trip accommodation list approval");
    }

    @And("User click button partner approval trip accommodation list approval")
    public void user_click_button_approval_partner_tri_accommodation_list_approval() {
        Hooks.delay(1);
        hoPage.BtnApprovalPartnerTripAccommodationListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button partner approval trip accommodation list approval");
    }

    @And("User click button approve partner document trip accommodation list approval")
    public void user_click_button_approve_partner_document_trip_accommodation_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSelectPartnerApprovalTripAccommodationListApprovalHo();
        Hooks.delay(1);
        hoPage.SelectPartnerApproveApprovalTripAccommodationListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button approve partner document trip accommodation list approval");
    }

    @Then("User click button save partner approval trip accommodation list approval")
    public void user_click_button_save_partner_approval_trip_accommodation_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSaveApprovalTripAccommodationListApprovalHo();
        Hooks.delay(1);
        hoPage.BtnConfirmSaveApprovalTripAccommodationListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button save partner approval trip accommodation list approval");
    }

    //JP Approval HO Reimbursement List Approval
    @When("User select filter jp approval ho reimbursement list approval")
    public void user_select_filter_jp_approval_ho_reimbursement_list_approval() {
        Hooks.delay(1);
        hoPage.BtnFilterApprovalListApprovalHo();
        Hooks.delay(2);
        hoPage.SelectJpApprovalListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select filter jp approval ho reimbursement list approval");
    }

    @And("User select sort by ho reimbursement list approval")
    public void user_select_sort_by_ho_reimbursement_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSortByApprovalListApprovalHo();
        Hooks.delay(2);
        hoPage.SelectSortByHoReimbursementApprovalListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select sort by ho reimbursement list approval");
    }

    @And("User click button approval jp ho reimbursement list approval")
    public void user_click_button_approval_jp_ho_reimbursement_list_approval() {
        Hooks.delay(1);
        hoPage.BtnApprovalJpHoReimbursementListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button approval jp ho reimbursement list approval");
    }

    @And("User click button approve jp document ho reimbursement list approval")
    public void user_click_button_approve_jp_document_ho_reimbursement_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSelectJpApprovalHoReimbursementListApprovalHo();
        Hooks.delay(1);
        hoPage.SelectJpApproveApprovalHoReimbursementListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button approve jp document ho reimbursement list approval");
    }

    @Then("User click button save jp approval ho reimbursement list approval")
    public void user_click_button_save_jp_approval_ho_reimbursement_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSaveApprovalHoReimbursementListApprovalHo();
        Hooks.delay(1);
        hoPage.BtnConfirmSaveApprovalHoReimbursementListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button save jp approval ho reimbursement list approval");
    }

    //FD Approval HO Reimbursement List Approval
    @When("User select filter fd approval ho reimbursement list approval")
    public void user_select_filter_fd_approval_ho_reimbursement_list_approval() {
        Hooks.delay(1);
        hoPage.BtnFilterApprovalListApprovalHo();
        Hooks.delay(2);
        hoPage.SelectPartnerApprovalListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select filter fd approval ho reimbursement list approval");
    }

    @And("User click button approval fd ho reimbursement list approval")
    public void user_click_button_approval_fd_ho_reimbursement_list_approval() {
        Hooks.delay(1);
        hoPage.BtnApprovalPartnerHoReimbursementListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button approval fd ho reimbursement list approval");
    }

    @And("User click button approve fd document ho reimbursement list approval")
    public void user_click_button_approve_fd_document_ho_reimbursement_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSelectPartnerApprovalHoReimbursementListApprovalHo();
        Hooks.delay(1);
        hoPage.SelectPartnerApproveApprovalHoReimbursementListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button approve fd document ho reimbursement list approval");
    }

    @Then("User click button save fd approval ho reimbursement list approval")
    public void user_click_button_save_fd_approval_ho_reimbursement_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSaveApprovalHoReimbursementListApprovalHo();
        Hooks.delay(1);
        hoPage.BtnConfirmSaveApprovalHoReimbursementListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button save fd approval ho reimbursement list approval");
    }

    //Partner Approval HO Overtime List Approval
    @When("User select sort by ho overtime list approval")
    public void user_select_sort_by_ho_overtime_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSortByApprovalListApprovalHo();
        Hooks.delay(2);
        hoPage.SelectSortByHoOvertimeApprovalListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select sort by ho overtime list approval");
    }

    @And("User click button partner approval ho overtime list approval")
    public void user_click_button_partner_approval_ho_overtime_list_approval() {
        Hooks.delay(1);
        hoPage.BtnApprovalPartnerHoOvertimeListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button partner approval ho overtime list approval");
    }

    @And("User click button approve partner document ho overtime list approval")
    public void user_click_button_approve_partner_document_ho_overtime_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSelectPartnerApprovalHoOvertimeListApprovalHo();
        Hooks.delay(1);
        hoPage.SelectPartnerApproveApprovalHoOvertimeListApprovalHo();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button approve partner document ho overtime list approval");
    }

    @Then("User click button save partner approval ho overtime list approval")
    public void user_click_button_save_partner_approval_ho_overtime_list_approval() {
        Hooks.delay(1);
        hoPage.BtnSaveApprovalHoOvertimeListApprovalHo();
        Hooks.delay(1);
        hoPage.BtnConfirmSaveApprovalHoOvertimeListApprovalHo();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button save partner approval ho overtime list approval");
    }
}
