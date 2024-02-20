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
        extentTest.log(LogStatus.PASS, "User click tab ho");
    }

    @Then("User get text title page ho")
    public void user_get_text_title_page_ho() {
        Hooks.delay(1);
        Assert.assertEquals(hoPage.getTxtHo(), "Monitoring HO");
        extentTest.log(LogStatus.PASS, "User get text title page ho");
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
        extentTest.log(LogStatus.PASS, "User input valid id ho");
    }

//Enter HO Working Plan Page
    @When("User click button ho working plan")
    public void user_click_button_ho_working_plan() {
        Hooks.delay(1);
        hoPage.BtnHoWorkingPlan();
        extentTest.log(LogStatus.PASS, "User click button ho working plan");
    }

    @Then("User get text title page ho working plan")
    public void user_get_text_title_page_ho_working_plan() {
        Hooks.delay(1);
        Assert.assertEquals(hoPage.getTxtHoWorkingPlan(), "HO Working Plan");
        extentTest.log(LogStatus.PASS, "User get text title page ho working plan");
    }

//Add Task
    @When("User click button add task")
    public void user_click_button_add_task() {
        Hooks.delay(1);
        hoPage.BtnAddTask();
        extentTest.log(LogStatus.PASS, "User click button add task");
    }

    @And("User select scope of work task")
    public void user_select_scope_of_work_task() {
        Hooks.delay(1);
        hoPage.BtnSow();
        Hooks.delay(1);
        hoPage.SelectSow1();
        Hooks.delay(1);
        hoPage.BtnSelectSow();
        extentTest.log(LogStatus.PASS, "User select scope of work task");
    }

    @And("User select deadline")
    public void user_select_deadline() {
        Hooks.delay(1);
        hoPage.BtnDeadline();
        Hooks.delay(1);
        hoPage.BtnSelectTodayDeadline();
        extentTest.log(LogStatus.PASS, "User select deadline");
    }

    @And("User select pic task")
    public void user_select_pic() {
        Hooks.delay(1);
        hoPage.BtnPicTask();
        Hooks.delay(1);
        hoPage.SelectPicTask();
        Hooks.delay(1);
        hoPage.BtnSelectPicTask();
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
        hoPage.InputNoteTask("Selamat Pagi pemirsa ANTV dimana pun anda berada");
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
        Hooks.delay(3);
        hoPage.BtnAddActivity();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button add activity");
    }

    @And("User select scope of work activity")
    public void user_select_scope_of_work_activity() {
        Hooks.delay(1);
        hoPage.BtnSow();
        Hooks.delay(1);
        hoPage.SelectSow2();
        Hooks.delay(1);
        hoPage.BtnSelectSow();
        extentTest.log(LogStatus.PASS, "User select scope of work activity");
    }

    @And("User select start date activity")
    public void user_select_start_date_activity() {
        Hooks.delay(1);
        hoPage.BtnStartDateActivity();
        Hooks.delay(1);
        hoPage.BtnSelectTodayStartDateActivity();
        extentTest.log(LogStatus.PASS, "User select start date activity");
    }

    @And("User select end date activity")
    public void user_select_end_date_activity() {
        Hooks.delay(1);
        hoPage.BtnEndDateActivity();
        Hooks.delay(1);
        hoPage.BtnSelectTodayEndDateActivity();
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
        Hooks.delay(3);
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

//Complete The task
    @When("User click button complete the task")
    public void user_click_button_complete_the_task() {
        Hooks.delay(1);
        hoPage.BtnKerjakanTask();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button complete the task");
    }

    @And("User select start date complete the task")
    public void user_select_start_date_complete_the_task() {
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
        hoPage.BtnStartDateCompleteTask();
        Hooks.delay(2);
        hoPage.BtnSelectTodayStartDateCompleteTask();
        extentTest.log(LogStatus.PASS, "User select start date complete the task");
    }

    @And("User select end date complete the task")
    public void user_select_end_date_complete_the_task() {
        Hooks.delay(2);
        hoPage.BtnEndDateCompleteTask();
        Hooks.delay(2);
        hoPage.BtnSelectTodayEndDateCompleteTask();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User select end date complete the task");
    }

    @And("User upload activity photos complete the task")
    public void user_upload_activity_photos_complete_the_task() {
        Hooks.delay(1);
        hoPage.BtnUploadActivityPhotosCompleteTheTask("C:\\Users\\M1403QA\\Downloads\\WhatsApp Image 2023-11-09 at 13.17.15_e44eaf04.jpg");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User upload activity photos complete the task");
    }

    @And("User upload activity documents complete the task")
    public void user_upload_activity_documents_complete_the_task() {
        Hooks.delay(1);
        hoPage.BtnUploadActivityDocumentsCompleteTheTask("C:\\Users\\M1403QA\\Downloads\\Daily Report 2024-01-26.pdf");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User upload activity documents complete the task");
    }

    @And("User input note complete the task")
    public void user_input_note_complete_the_task() {
        Hooks.delay(2);
        hoPage.InputDeleteNoteCompleteTheTask();
        Hooks.delay(3);
        hoPage.InputNoteCompleteTheTask("Task telah selesai dikerjakan,menunggu approval dari JP");
        extentTest.log(LogStatus.PASS, "User input note complete the task");
    }

    @Then("User save complete the task")
    public void user_save_complete_the_task() {
        Hooks.delay(3);
        hoPage.BtnSaveCompleteTheTask();
        Hooks.delay(2);
        hoPage.BtnConfirmSaveCompleteTheTask();
        Hooks.delay(5);
        extentTest.log(LogStatus.PASS, "User save complete the task");
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
        extentTest.log(LogStatus.PASS, "User select jp approval task");
    }

    @And("User input note jp approval task")
    public void user_input_note_jp_approval_task() {
        Hooks.delay(2);
        hoPage.InputDeleteNoteJpApprovalTask();
        Hooks.delay(3);
        hoPage.InputNoteJpApprovalTask("Lanjut untuk Approval ke Partner");
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
        Hooks.delay(1);
        hoPage.BtnRevisiTask();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button revisi");
    }

    @And("User input note revisi complete the task")
    public void user_input_note_revisi_complete_the_task() {
        Hooks.delay(2);
        hoPage.InputDeleteNoteCompleteTheTask();
        Hooks.delay(3);
        hoPage.InputNoteCompleteTheTask("Task telah selesai di revisi,menunggu approval dari JP");
        extentTest.log(LogStatus.PASS, "User input note revisi complete the task");
    }

    @And("User save revisi complete the task")
    public void user_save_revisi_complete_the_task() {
        Hooks.delay(3);
        hoPage.BtnSaveCompleteTheTask();
        Hooks.delay(2);
        hoPage.BtnConfirmSaveCompleteTheTask();
        Hooks.delay(5);
        extentTest.log(LogStatus.PASS, "User save revisi complete the task");
    }

    @And("User click button jp approval for revision task")
    public void user_click_button_jp_approval_for_revision_task() {
        Hooks.delay(2);
        hoPage.BtnJpApprovalTask();
        Hooks.delay(1);
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
        Hooks.delay(1);
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
        extentTest.log(LogStatus.PASS, "User select jp approval activity");
    }

    @And("User input note jp approval activity")
    public void user_input_note_jp_approval_activity() {
        Hooks.delay(2);
        hoPage.InputDeleteNoteJpApprovalActivity();
        Hooks.delay(3);
        hoPage.InputNoteJpApprovalActivity("Lanjut untuk Approval ke Partner");
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
        Hooks.delay(1);
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
        Hooks.delay(1);
        hoPage.BtnRevisiActivity();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button revisi activity");
    }

    @And("User edit activity for revision")
    public void user_edit_activity_for_revision() {
        Hooks.delay(2);
        hoPage.InputDeleteNoteActivity();
        Hooks.delay(3);
        hoPage.InputNoteActivity("Activity telah selesai di revisi,menunggu approval dari JP");
        extentTest.log(LogStatus.PASS, "User edit activity for revision");
    }

    @And("User save activity for revision")
    public void user_save_activity_for_revision() {
        Hooks.delay(3);
        hoPage.BtnSaveActivity();
        Hooks.delay(2);
        hoPage.BtnConfirmSaveActivity();
        Hooks.delay(5);
        extentTest.log(LogStatus.PASS, "User save activity for revision");
    }

    @And("User click button jp approval for revision activity")
    public void user_click_button_jp_approval_for_revision_activity() {
        Hooks.delay(2);
        hoPage.BtnJpApprovalActivity();
        Hooks.delay(1);
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
        extentTest.log(LogStatus.PASS, "User select document rkpd");
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

    @Then("User click button create document rkpd")
    public void user_click_button_create_document_rkpd() {
        Hooks.delay(2);
        hoPage.BtnCreateRkpd();
        Hooks.delay(2);
        hoPage.BtnConfirmCreateRkpd();
        Hooks.delay(3);
        hoPage.BtnCancelDownloadRkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create document rkpd");
    }

// Create Document Surat Tugas
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
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button create administrative documents for lkpd");
    }

    @And("User select document lkpd")
    public void user_select_document_lkpd() {
        Hooks.delay(2);
        hoPage.SelectDocumentLkpd();
        Hooks.delay(2);
        hoPage.BtnSelectAdministrativeDocuments();
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

//Create Document Bon Putih
    @When("User click button create administrative documents for bon putih")
    public void user_click_button_create_administrative_documents_for_bon_putih() {
        Hooks.delay(2);
        hoPage.BtnCreateAdministrativeDocuments();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button create administrative documents for bon putih");
    }

    @And("User select document bon putih")
    public void user_select_document_bon_putih() {
        Hooks.delay(2);
        hoPage.SelectDocumentBonPutih();
        Hooks.delay(2);
        hoPage.BtnSelectAdministrativeDocuments();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select document bon putih");
    }

    @And("User select id lkpd bon putih")
    public void user_select_id_lkpd_bon_putih() {
        Hooks.delay(2);
        hoPage.BtnSearchIdLkpdBonPutih();
        Hooks.delay(2);
        hoPage.SelectIdLkpdBonPutih();
        Hooks.delay(2);
        hoPage.BtnSelectIdLkpdBonPutih();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select id lkpd bon putih");
    }

    @And("User checklist reimbursement bon putih")
    public void user_checklist_reimbursement_bon_putih() {
        Hooks.delay(2);
        hoPage.ChecklistReimbursement1BonPutih();
        Hooks.delay(2);
        hoPage.ChecklistReimbursement2BonPutih();
        Hooks.delay(2);
        hoPage.ChecklistReimbursement3BonPutih();
        Hooks.delay(2);
        hoPage.ChecklistReimbursement4BonPutih();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User checklist reimbursement bon putih");
    }

    @Then("User click button create document bon putih")
    public void user_click_button_create_document_bon_putih() {
        Hooks.delay(2);
        hoPage.BtnCreateBonPutih();
        Hooks.delay(2);
        hoPage.BtnConfirmCreateBonPutih();
        Hooks.delay(3);
        hoPage.BtnCancelDownloadBonPutih();
        Hooks.delay(3);
        extentTest.log(LogStatus.PASS, "User click button create document bon putih");
    }

//Create Document Bon Hijau
    @When("User click button create finance documents for bon hijau")
    public void user_click_button_create_finance_documents_for_bon_hijau() {
        Hooks.delay(2);
        hoPage.BtnCreateFinanceDocuments();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button create finance documents for bon hijau");
    }

    @And("User select document bon hijau")
    public void user_select_document_bon_hijau() {
        Hooks.delay(2);
        hoPage.SelectDocumentBonHijau();
        Hooks.delay(2);
        hoPage.BtnSelectFinanceDocuments();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select document bon hijau");
    }

    @And("User select id st bon hijau")
    public void user_select_id_st_bon_hijau() {
        Hooks.delay(2);
        hoPage.BtnSearchIdStBonHijau();
        Hooks.delay(2);
        hoPage.SelectIdStBonHijau();
        Hooks.delay(2);
        hoPage.BtnSelectIdStBonHijau();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select id st bon hijau");
    }

    @And("User input amount trip expenses bon hijau")
    public void user_input_amount_trip_expenses_bon_hijau() {
        Hooks.delay(2);
        hoPage.InputAmountTripExpensesBonHijau("2500000");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input amount trip expenses bon hijau");
    }

    @And("User input note trip expenses bon hijau")
    public void user_input_note_trip_expenses_bon_hijau() {
        Hooks.delay(2);
        hoPage.InputNoteTripExpensesBonHijau("Segera di infokan");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note trip expenses bon hijau");
    }

    @And("User upload recipient trip expenses bon hijau")
    public void user_upload_recipient_trip_expenses_bon_hijau() {
        Hooks.delay(2);
        hoPage.BtnUploadRecipientTripExpensesBonHijau("C:\\Users\\M1403QA\\Downloads\\ENFP - Bingo.png");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User upload recipient trip expenses bon hijau");
    }

    @Then("User click button create document bon hijau")
    public void user_click_button_create_document_bon_hijau() {
        Hooks.delay(2);
        hoPage.BtnCreateBonHijau();
        Hooks.delay(2);
        hoPage.BtnConfirmCreateBonHijau();
        Hooks.delay(3);
        hoPage.BtnCancelDownloadBonHijau();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create document bon hijau");
    }

//Create Document Bon Kuning
    @When("User click button create finance documents for bon kuning")
    public void user_click_button_create_finance_documents_for_bon_kuning() {
        Hooks.delay(2);
        hoPage.BtnCreateFinanceDocuments();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button create finance documents for bon kuning");
    }

    @And("User select document bon kuning")
    public void user_select_document_bon_kuning() {
        Hooks.delay(2);
        hoPage.SelectDocumentBonKuning();
        Hooks.delay(2);
        hoPage.BtnSelectFinanceDocuments();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select document bon kuning");
    }

    @And("User select id bon putih bon kuning")
    public void user_select_id_bon_putih_bon_kuning() {
        Hooks.delay(2);
        hoPage.BtnSearchIdBonPutihBonKuning();
        Hooks.delay(2);
        hoPage.SelectIdBonPutihBonKuning();
        Hooks.delay(2);
        hoPage.BtnSelectIdBonPutihBonKuning();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select id bon putih bon kuning");
    }

    @And("User checklist team incurred expenses reimbursement bon kuning")
    public void user_checklist_team_incurred_expenses_reimbursement_bon_kuning() {
        Hooks.delay(2);
        hoPage.ChecklistTeamIncurredExpensesReimbursement1BonKuning();
        Hooks.delay(2);
        hoPage.ChecklistTeamIncurredExpensesReimbursement2BonKuning();
        Hooks.delay(2);
        hoPage.ChecklistTeamIncurredExpensesReimbursement3BonKuning();
        Hooks.delay(2);
        hoPage.ChecklistTeamIncurredExpensesReimbursement4BonKuning();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User checklist team incurred expenses reimbursement bon kuning");
    }

    @Then("User click button create document bon kuning")
    public void user_click_button_create_document_bon_kuning() {
        Hooks.delay(2);
        hoPage.BtnCreateBonKuning();
        Hooks.delay(2);
        hoPage.BtnConfirmCreateBonKuning();
        Hooks.delay(3);
        hoPage.BtnCancelDownloadBonKuning();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create document bon kuning");
    }

//Create Document Bon Merah
    @When("User click button create finance documents for bon merah")
    public void user_click_button_create_finance_documents_for_bon_merah() {
        Hooks.delay(2);
        hoPage.BtnCreateFinanceDocuments();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button create finance documents for bon merah");
    }

    @And("User select document bon merah")
    public void user_select_document_bon_merah() {
        Hooks.delay(2);
        hoPage.SelectDocumentBonMerah();
        Hooks.delay(2);
        hoPage.BtnSelectFinanceDocuments();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select document bon merah");
    }

    @And("User input description bon merah")
    public void user_input_description_bon_merah() {
        Hooks.delay(2);
        hoPage.InputDescriptionBonMerah("Setoran untuk biaya jasa penanganan kasus");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input description bon merah");
    }

    @And("User select receipt date bon merah")
    public void user_select_receipt_date_bon_merah() {
        Hooks.delay(2);
        hoPage.SelectReceiptDateBonMerah();
        Hooks.delay(2);
        hoPage.BtnSelectTodayReceiptDateBonMerah();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select receipt date bon merah");
    }

    @And("User input account number bon merah")
    public void user_input_account_number_bon_merah() {
        Hooks.delay(2);
        hoPage.InputAccountNumberBonMerah("27384967382");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input account number bon merah");
    }

    @And("User input amount received bon merah")
    public void user_input_amount_received_bon_merah() {
        Hooks.delay(2);
        hoPage.InputAmountReceivedBonMerah("52000000");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input amount received bon merah");
    }

    @And("User input final value bon merah")
    public void user_input_final_value_bon_merah() {
        Hooks.delay(2);
        hoPage.InputFinalValueBonMerah("52000000");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input final value bon merah");
    }

    @Then("User click button create document bon merah")
    public void user_click_button_create_document_bon_merah() {
        Hooks.delay(2);
        hoPage.BtnCreateBonMerah();
        Hooks.delay(2);
        hoPage.BtnConfirmCreateBonMerah();
        Hooks.delay(3);
        hoPage.BtnCancelDownloadBonMerah();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create document bon merah");
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

//View Bon Hijau
    @When("User click id bon hijau")
    public void user_click_id_bon_hijau() {
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
        extentTest.log(LogStatus.PASS, "User click id bon hijau");
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

//View Bon Putih
    @When("User click id bon putih")
    public void user_click_id_bon_putih() {
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
        extentTest.log(LogStatus.PASS, "User click id bon putih");
    }

//View Bon Kuning
    @When("User click id bon kuning")
    public void user_click_id_bon_kuning() {
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
        extentTest.log(LogStatus.PASS, "User click id bon kuning");
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

//Edit Document RKPD
    @When("User click button view business trip recap 2")
    public void user_click_button_view_business_trip_recap_2() {
        Hooks.delay(2);
        hoPage.BtnViewBusinessTripRecap2();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button view business trip recap 2");
    }

    @And("User click button edit document rkpd")
    public void user_click_button_edit_document_rkpd() {
        Hooks.delay(2);
        hoPage.BtnEditRkpd();
        Hooks.delay(3);
        extentTest.log(LogStatus.PASS, "User click button edit document rkpd");
    }

    @And("User edit data document rkpd")
    public void user_edit_data_document_rkpd() {
        hoPage.InputDeleteScopeOfWorkDetailsRkpd();
        Hooks.delay(2);
        hoPage.InputScopeOfWorkDetailsRkpd("Kerjakan segera dengan seluruh tim yang telah ditunjuk");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit data document rkpd");
    }

    @Then("User save edit document rkpd")
    public void user_save_edit_document_rkpd() {
        Hooks.delay(3);
        hoPage.BtnSaveEditRkpd();
        Hooks.delay(2);
        hoPage.BtnConfirmSaveEditRkpd();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit document rkpd");
    }
}

