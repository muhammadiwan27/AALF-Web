package org.example;

import io.cucumber.java.en.And;
import org.example.pages.HoPage;
import org.example.pages.LoginDanLogoutPage;
import org.example.pages.DashboardPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;

public class TestDashboard {
    static WebDriver driver;
    static ExtentTest extentTest;
    static DashboardPage dashboardPage = new DashboardPage();
    static LoginDanLogoutPage loginPage = new LoginDanLogoutPage();
    static HoPage hoPage = new HoPage();
    public TestDashboard(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

//Dashboard Valid Functionality Test
    @When("User enter username")
    public void user_enter_username() {
        Hooks.delay(2);
        loginPage.clearUsername();
        Hooks.delay(2);
        loginPage.enterUsername("go");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User enter username");
    }

    @And("User enter password")
    public void user_enter_password() {
        loginPage.clearpassword();
        Hooks.delay(2);
        loginPage.enterPassword("go");
        Hooks.delay(2);
        loginPage.BtnLogin();
        Hooks.delay(3);
        extentTest.log(LogStatus.PASS, "User enter password");
    }

    @Then("User get text title page dashboard")
    public void user_get_text_title_page_dashboard() {
        Hooks.delay(2);
        Assert.assertEquals(dashboardPage.getTxtDashboard(),"Dashboard");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User get text title page dashboard");
    }

//Enter Dashboard Employee
    @When("User click tab dashboard employee")
    public void user_click_tab_dashboard_employee() {
        Hooks.delay(2);
        dashboardPage.TabDashboardEmployee();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab dashboard employee");
    }

    @Then("User get text title page dashboard employee")
    public void user_get_text_title_page_dashboard_employee() {
        Hooks.delay(2);
        dashboardPage.getTxtDashboardEmployee();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User get text title page dashboard employee");
    }

//Check Total HO Overall Dashboard Aplikasi Sipanda-Unik
    @When("User click tab total ho overall")
    public void user_click_tab_total_ho_overall() {
        Hooks.delay(2);
        dashboardPage.TabDashboardHo();
        Hooks.delay(2);
        dashboardPage.TabTotalHoOverallDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab total ho overall");
    }

    @Then("User close tab total ho overall")
    public void user_close_tab_total_ho_overall() {
        Hooks.delay(2);
        dashboardPage.ButtonCloseTotalHoOverallDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User close tab total ho overall");
    }

//Check HO On Progress Dashboard Aplikasi Sipanda-Unik
    @When("User click tab ho on progress")
    public void user_click_tab_ho_on_progress() {
        Hooks.delay(2);
        dashboardPage.TabHoOnProgressDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab ho on progress");
    }

    @Then("User close tab total ho on progress")
    public void user_close_tab_total_ho_on_progress() {
        Hooks.delay(2);
        dashboardPage.ButtonCloseHoOnProgressDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User close tab total ho on progress");
    }

//Check HO Completed Dashboard Aplikasi Sipanda-Unik
    @When("User click tab ho on completed")
    public void user_click_tab_ho_on_completed() {
        Hooks.delay(2);
        dashboardPage.TabHoOnCompletedDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab ho on completed");
    }

    @Then("User close tab ho on completed")
    public void user_close_tab_ho_on_completed() {
        Hooks.delay(2);
        dashboardPage.ButtonCloseHoCompletedDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User close tab ho on completed");
    }

//Check Total Task Dashboard Aplikasi Sipanda-Unik
    @When("User click tab total task")
    public void User_click_tab_total_task() {
        Hooks.delay(2);
        dashboardPage.TabTotalTaskDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab total task");
    }

    @Then("User close tab total task")
    public void user_close_tab_total_task() {
        Hooks.delay(2);
        dashboardPage.ButtonCloseTotalTaskDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User close tab total task");
    }

//Check Task Has Not Proceed Dashboard Aplikasi Sipanda-Unik
    @When("User click tab task has not proceed")
    public void user_click_tab_task_has_not_proceed() {
        Hooks.delay(2);
        dashboardPage.TabTaskHasNotProceedDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User close tab total task");
    }

    @Then("User close tab task has not proceed")
    public void user_close_tab_task_has_not_proceed() {
        Hooks.delay(2);
        dashboardPage.ButtonCloseTaskHasNotProceedDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User close tab task has not proceed");
    }

//Check Task Need Approval JP Dashboard Aplikasi Sipanda-Unik
    @When("User click tab task need approval jp")
    public void user_click_tab_task_need_approval_jp() {
        Hooks.delay(2);
        dashboardPage.TabTaskNeedApprovalJpDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab task need approval jp");
    }

    @Then("User close tab task need approval jp")
    public void user_close_tab_task_need_approval_jp() {
        Hooks.delay(2);
        dashboardPage.ButtonCloseTaskNeedApprovalJpDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User close tab task need approval jp");
    }

//Check Task Need Approval Partner Dashboard Aplikasi Sipanda-Unik
    @When("User click tab task need approval partner")
    public void user_click_tab_task_need_approval_partner() {
        Hooks.delay(2);
        dashboardPage.TabTaskNeedApprovalPartnerDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab task need approval partner");
    }

    @Then("User close tab task need approval partner")
    public void user_close_tab_task_need_approval_partner() {
        Hooks.delay(2);
        dashboardPage.ButtonCloseTaskNeedApprovalPartnerDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User close tab task need approval partner");
    }

//Check Task Finished Dashboard Aplikasi Sipanda-Unik
    @When("User click tab task finished")
    public void user_click_tab_task_fnished() {
        Hooks.delay(2);
        dashboardPage.TabTaskFinishedDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab task finished");
    }

    @Then("User close tab task finished")
    public void user_close_tab_task_finished() {
        Hooks.delay(2);
        dashboardPage.ButtonCloseTaskFinishedDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User close tab task finished");
    }

//Check Total Activity Dashboard Aplikasi Sipanda-Unik
    @When("User click tab total activity")
    public void User_click_tab_total_activity() {
        Hooks.delay(2);
        dashboardPage.TabTotalActivityDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab total activity");
    }

    @Then("User close tab total activity")
    public void user_close_tab_total_activity() {
        Hooks.delay(2);
        dashboardPage.ButtonCloseTotalActivityDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User close tab total activity");
    }

//Check Activity Need Revision Dashboard Aplikasi Sipanda-Unik
    @When("User click tab activity need revision")
    public void user_click_tab_activity_need_revision() {
        Hooks.delay(2);
        dashboardPage.TabActivityNeedRevisionDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab activity need revision");
    }

    @Then("User close tab activity need revision")
    public void user_close_tab_activity_need_revision() {
        Hooks.delay(2);
        dashboardPage.ButtonCloseActivityNeedRevisionDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User close tab activity need revision");
    }

//Check activity Need Approval JP Dashboard Aplikasi Sipanda-Unik
    @When("User click tab activity need approval jp")
    public void user_click_tab_activity_need_approval_jp() {
        Hooks.delay(2);
        dashboardPage.TabActivityNeedApprovalJpDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab activity need approval jp");
    }

    @Then("User close tab activity need approval jp")
    public void user_close_tab_activity_need_approval_jp() {
        Hooks.delay(2);
        dashboardPage.ButtonCloseActivityNeedApprovalJpDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User close tab activity need approval jp");
    }

//Check activity Need Approval Partner Dashboard Aplikasi Sipanda-Unik
    @When("User click tab activity need approval partner")
    public void user_click_tab_activity_need_approval_partner() {
        Hooks.delay(2);
        dashboardPage.TabActivityNeedApprovalPartnerDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab activity need approval partner");
    }

    @Then("User close tab activity need approval partner")
    public void user_close_tab_activity_need_approval_partner() {
        Hooks.delay(2);
        dashboardPage.ButtonCloseActivityNeedApprovalPartnerDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User close tab activity need approval partner");
    }

//Check activity Finished Dashboard Aplikasi Sipanda-Unik
    @When("User click tab activity finished")
    public void user_click_tab_activity_fnished() {
        Hooks.delay(2);
        dashboardPage.TabActivityFinishedDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab activity finished");
    }

    @Then("User close tab activity finished")
    public void user_close_tab_activity_finished() {
        Hooks.delay(2);
        dashboardPage.ButtonCloseActivityFinishedDashboard();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User close tab activity finished");
    }

//Proceed overdue deadline task Dashboard Aplikasi Sipanda-Unik
    @When("User click on id ho overdue deadline task to proceed")
    public void user_click_on_id_ho_overdue_deadline_task_to_proceed() {
        Hooks.delay(2);
        dashboardPage.IdHoOverdueDeadlineTask();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click on id ho overdue deadline task to proceed");
    }

    @And("User select approval overdue deadline task")
    public void user_select_approval_overdue_deadline_task() {
        Hooks.delay(2);
        hoPage.BtnSelectJpApprovalTask();
        Hooks.delay(2);
        hoPage.SelectJpApprovalTask();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select approval overdue deadline task");
    }

    @And("User input note approval overdue deadline task")
    public void user_input_note_approval_overdue_deadline_task() {
        Hooks.delay(2);
        hoPage.InputDeleteNoteJpApprovalTask();
        Hooks.delay(2);
        hoPage.InputNoteJpApprovalTask("Task sudah selesai di kerjakan");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note approval overdue deadline task");
    }

    @Then("User save approval overdue deadline task")
    public void user_save_approval_overdue_deadline_task() {
        Hooks.delay(2);
        hoPage.BtnSaveJpApprovalTask();
        Hooks.delay(2);
        hoPage.BtnConfirmSaveJpApprovalTask();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save approval overdue deadline task");
    }

//Proceed upcoming deadline task Dashboard Aplikasi Sipanda-Unik
    @When("User click on id ho upcoming deadline task to proceed")
    public void user_click_on_id_ho_upcoming_deadline_task_to_proceed() {
        Hooks.delay(2);
        dashboardPage.IdHoUpcomingDeadlineTask();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click on id ho upcoming deadline task to proceed");
    }

    @And("User select start date proceed the task upcoming deadline")
    public void user_select_start_date_proceed_the_task_upcoming_deadline() {
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
        extentTest.log(LogStatus.PASS, "User select start date proceed the task upcoming deadline");
    }

    @And("User select end date proceed the task upcoming deadline")
    public void user_select_end_date_proceed_the_task_upcoming_deadline() {
        Hooks.delay(2);
        hoPage.BtnEndDateProceedTheTask();
        Hooks.delay(2);
        hoPage.BtnSelectTodayEndDateProceedTheTask();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select end date proceed the task upcoming deadline");
    }

    @And("User upload activity photos proceed the task upcoming deadline")
    public void user_upload_activity_photos_proceed_the_task_upcoming_deadline() {
        Hooks.delay(2);
        hoPage.BtnUploadActivityPhotosProceedTheTask("C:\\Users\\M1403QA\\Downloads\\WhatsApp Image 2023-11-09 at 13.17.15_e44eaf04.jpg");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User upload activity photos proceed the task upcoming deadline");
    }

    @And("User upload activity documents proceed the task upcoming deadline")
    public void user_upload_activity_documents_proceed_the_task_upcoming_deadline() {
        Hooks.delay(2);
        hoPage.BtnUploadActivityDocumentsProceedTheTask("C:\\Users\\M1403QA\\Downloads\\Daily Report 2024-01-26.pdf");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User upload activity documents proceed the task upcoming deadline");
    }

    @And("User input note proceed the task upcoming deadline")
    public void user_input_note_proceed_the_task_upcoming_deadline() {
        Hooks.delay(2);
        hoPage.InputDeleteNoteProceedTheTask();
        Hooks.delay(3);
        hoPage.InputNoteProceedTheTask("Task telah selesai dikerjakan,menunggu approval dari JP");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note proceed the task upcoming deadline");
    }

    @Then("User save proceed the task upcoming deadline")
    public void user_save_proceed_the_task_upcoming_deadline() {
        Hooks.delay(3);
        hoPage.BtnSaveProceedTheTask();
        Hooks.delay(2);
        hoPage.BtnConfirmSaveProceedTheTask();
        Hooks.delay(5);
        extentTest.log(LogStatus.PASS, "User save proceed the task upcoming deadline");
    }

//Add event dashboard
    @When("User click button add event")
    public void user_click_button_add_event() {
        Hooks.delay(2);
        dashboardPage.BtnAddEvent();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button add event");
    }

    @And("User input title event")
    public void user_input_title_event() {
        Hooks.delay(2);
        dashboardPage.InputTitleEvent("Jalan-jalan bersama rekan bisnis");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input title event");
    }

    @And("User select start date event")
    public void user_select_start_date_event() {
        Hooks.delay(2);
        dashboardPage.BtnStartDateEvent();
        Hooks.delay(2);
        dashboardPage.BtnSelectTodayStartDateEvent();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select start date event");
    }

    @And("User select end date event")
    public void user_select_end_date_event() {
        Hooks.delay(2);
        dashboardPage.BtnEndDateEvent();
        Hooks.delay(2);
        dashboardPage.BtnSelectTodayEndDateEvent();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select end date event");
    }

    @And("User select reminder event")
    public void user_select_reminder_event() {
        Hooks.delay(2);
        dashboardPage.BtnChooseReminderTypeEvent();
        Hooks.delay(2);
        dashboardPage.SelectReminderTypeEvent();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select reminder event");
    }

    @And("User input note event")
    public void user_input_note_event() {
        Hooks.delay(2);
        dashboardPage.InputNoteEvent("Jalan jalan ke Singapore");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note event");
    }

    @Then("User click button create event")
    public void user_click_button_create_event() {
        Hooks.delay(2);
        dashboardPage.ButtonCreateEvent();
        Hooks.delay(2);
        dashboardPage.ButtonConfirmCreateEvent();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create event");
    }

//Edit event dashboard
    @When("User click card event dashboard")
    public void user_click_card_event_dashboard() {
        Hooks.delay(2);
        dashboardPage.EventCardOnCalendar();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click card event dashboard");
    }

    @And("User edit data event")
    public void user_edit_data_event() {
        Hooks.delay(2);
        dashboardPage.InputDeleteNoteEvent();
        Hooks.delay(3);
        dashboardPage.InputNoteEvent("Pergi shopping ke Paris");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit data event");
    }

    @Then("User save edit event")
    public void user_save_edit_event() {
        Hooks.delay(3);
        dashboardPage.ButtonEditEvent();
        Hooks.delay(2);
        dashboardPage.ButtonConfirmEditEvent();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit event");
    }
}
