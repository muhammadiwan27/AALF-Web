package org.example;

import io.cucumber.java.en.And;
import org.example.pages.HrPage;
import org.example.pages.LoginDanLogoutPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;


public class TestHr {
    static WebDriver driver;
    static ExtentTest extentTest;
    static HrPage hrPage = new HrPage();
    static LoginDanLogoutPage loginDanLogoutPage = new LoginDanLogoutPage();

    public TestHr() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

//Enter HR Page
    @When("User click tab hr")
    public void User_click_tab_hr() {
        Hooks.delay(1);
        hrPage.TabHr();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab hr");
    }

    @Then("User get text title page hr")
    public void user_get_text_title_page_hr() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtHr(), "Human Resources");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page hr");
    }

//Enter Attendance Page
    @When("User click tab attendance")
    public void User_click_tab_attendance() {
        Hooks.delay(1);
        hrPage.TabAttendance();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab attendance");
    }

    @Then("User get text title page attendance")
    public void user_get_text_title_page_attendace() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtAttendance(), "Attendance");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page attendance");
    }

//Search Employee Attendance by Name
    @When("User input employee name attendance")
    public void user_input_employee_name_attendance() {
        Hooks.delay(1);
        hrPage.InputEmployeeNameAttendance("Abdul Wafiy");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input employee name attendance");
    }

    @And("User enter employee attendance page")
    public void user_enter_employee_attendance_page() {
        Hooks.delay(1);
        hrPage.BtnEmployeeNameAttendance();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User enter employee attendance page");
    }

    @Then("User get text title page employee name attendance")
    public void user_get_text_title_page_employee_name_attendance() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtEmployeeNameAttendancePage(), "Abdul Wafiy");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page employee name attendance");
    }

//Enter Monitoring Page
    @When("User click tab monitoring")
    public void User_click_tab_monitoring() {
        Hooks.delay(1);
        hrPage.TabAttendance();
        Hooks.delay(1);
        hrPage.TabMonitoring();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab monitoring");
    }

    @Then("User get text title page monitoring")
    public void user_get_text_title_page_monitoring() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtMonitoringPage(), "Monitoring");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page monitoring");
    }

//Search Monitoring Employee by Name
    @When("User input employee name monitoring")
    public void User_input_employee_name_monitoring() {
        Hooks.delay(1);
        hrPage.InputEmployeeNameMonitoring("naomi astrid");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input employee name monitoring");
    }

    @And("User enter employee monitoring page")
    public void user_enter_employee_monitoring_page() {
        Hooks.delay(1);
        hrPage.BtnEmployeeNameMonitoring();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User enter employee monitoring page");
    }

    @Then("User get text title page employee name monitoring")
    public void user_get_text_title_page_employee_name_monitoring() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtEmployeeNameMonitoringPage(), "Naomi Astrid Sridinanti Nababan");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page employee name monitor");
    }

//Enter HR Report Page
    @When("User click tab hr report")
    public void User_click_tab_hr_report() {
        Hooks.delay(1);
        hrPage.TabHrReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab hr report");
    }

    @Then("User get text title page hr report")
    public void user_get_text_title_page_hr_report() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtHrReportPage(), "HR Report");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page hr report");
    }

//Download KPI HO Report
    @When("User click button excel kpi ho report")
    public void user_click_button_excel_kpi_ho_report() {
        Hooks.delay(1);
        hrPage.BtnDownloadKpiHoReport();
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
        extentTest.log(LogStatus.PASS, "User click button excel kpi ho report");
    }

//Download KPI HO Detail Report
    @When("User click tab kpi ho detail report")
    public void user_click_tab_kpi_detail_ho_report() {
        Hooks.delay(1);
        hrPage.TabKpiHoDetail();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab kpi ho detail report");
    }

    @Then("User click button excel kpi ho detail report")
    public void user_click_button_excel_kpi_ho_detail_report() {
        Hooks.delay(1);
        hrPage.BtnDownloadKpiHoDetailReport();
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
        extentTest.log(LogStatus.PASS, "User click button excel kpi ho detail report");
    }

//Download Resume Daily Report
    @When("User click tab resume daily report")
    public void user_click_tab_resume_daily_report() {
        Hooks.delay(1);
        hrPage.TabResumeDailyReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab kpi ho detail report");
    }

    @Then("User click button pdf resume daily report")
    public void user_click_button_pdf_resume_daily_report() {
        Hooks.delay(1);
        hrPage.BtnDownloadResumeDailyReport();
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
        extentTest.log(LogStatus.PASS, "User click button pdf resume daily report");
    }

//Download HR Master Document Number Report
    @When("User click tab hr master document number report")
    public void user_click_tab_hr_master_document_number_report() {
        Hooks.delay(1);
        hrPage.TabHrMasterDocumentNumber();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab hr master document number report");
    }

    @And("User select month hr master document number report")
    public void user_select_month_hr_master_document_number_report() {
        Hooks.delay(1);
        hrPage.InputMonthHrMasterDocumentNumber("September 2024");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select month hr master document number report");
    }

    @Then("User click button excel hr master document number report")
    public void user_click_button_excel_hr_master_document_number_report() {
        Hooks.delay(1);
        hrPage.BtnDownloadHrMasterDocumentNumber();
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
        extentTest.log(LogStatus.PASS, "User click button excel hr master document number report");
    }

//Enter Overtime Page
    @When("User click tab overtime")
    public void User_click_tab_overtime() {
        Hooks.delay(1);
        hrPage.TabOvertime();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab overtime");
    }

    @Then("User get text title page overtime")
    public void user_get_text_title_page_overtime() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtOvertimePage(), "Overtime");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page overtime");
    }

//Create Overtime
    @When("User click button create overtime")
    public void user_click_button_create_overtime() {
        Hooks.delay(1);
        hrPage.BtnCreateOvertime();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create overtime");
    }

    @And("User select start date end date overtime")
    public void user_select_start_date_end_date_overtime() {
        Hooks.delay(1);
        hrPage.BtnStartDateOvertime();
        Hooks.delay(2);
        hrPage.BtnSelectTodayStartDateOvertime();
        Hooks.delay(2);
        hrPage.BtnEndDateOvertime();
        Hooks.delay(2);
        hrPage.BtnSelectTodayEndDateOvertime();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select start date end date overtime");
    }

    @And("User select author overtime")
    public void user_select_author_overtime() {
        Hooks.delay(1);
        hrPage.BtnSelectAuthorOvertime();
        Hooks.delay(2);
        hrPage.SelectAuthorOvertime();
        Hooks.delay(2);
        hrPage.BtnConfirmSelectAuthorOvertime();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select author overtime");
    }

    @And("User upload document overtime")
    public void user_upload_document_overtime() {
        Hooks.delay(1);
        hrPage.BtnUploadDocumentOvertime("C:\\Users\\M1403QA\\Downloads\\MOGI-MAULID-2024.png");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User upload document overtime");
    }

    @And("User input note overtime")
    public void user_input_note_overtime() {
        Hooks.delay(1);
        hrPage.InputNoteOvertime("Jemput bos dulu");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note overtime");
    }

    @Then("User save overtime")
    public void user_save_overtime() {
        Hooks.delay(1);
        hrPage.BtnSaveOvertime();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveOvertime();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save overtime");
    }

//Edit Overtime
    @When("User click button edit overtime")
    public void user_click_button_edit_overtime() {
        Hooks.delay(2);
        hrPage.BtnEditOvertime();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit overtime");
    }

    @And("User edit note overtime")
    public void user_edit_note_overtime() {
        Hooks.delay(2);
        hrPage.ClearNoteOvertime();
        Hooks.delay(3);
        hrPage.InputNoteOvertime("Pergi shopping bersama ibuk");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit note overtime");
    }

    @Then("User save edit overtime")
    public void user_save_edit_overtime() {
        Hooks.delay(3);
        hrPage.BtnSaveEditOvertime();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditOvertime();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit overtime");
    }

//Approval Overtime
    @When("User click button approval overtime")
    public void user_click_button_approval_overtime() {
        Hooks.delay(2);
        hrPage.BtnApprovalOvertime();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click button approval overtime");
    }

    @And("User select approval overtime")
    public void user_select_approval_overtime() {
        Hooks.delay(2);
        hrPage.BtnSelectApprovalOvertime();
        Hooks.delay(2);
        hrPage.SelectApprovalOvertime();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select approval overtime");
    }

    @Then("User click button save approval overtime")
    public void user_click_button_save_approval_overtime() {
        Hooks.delay(3);
        hrPage.BtnSaveApprovalOvertime();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveApprovalOvertime();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save approval overtime");
    }

//View Approved Overtime Page
    @When("User click button view approved overtime")
    public void user_click_button_view_approved_overtime() {
        Hooks.delay(1);
        hrPage.BtnViewOvertime();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button view approved overtime");
    }

    @And("User get text title page view approved overtime")
    public void user_get_text_title_page_view_approved_overtime() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtViewOvertimePage(), "View Overtime");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User get text title page view approved overtime");
    }

    @Then("User back to overtime page")
    public void user_back_to_overtime_page() {
        Hooks.delay(1);
        hrPage.BtnBackViewOvertimePage();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User back to ho completed page");
    }

//Enter Log User Page
    @When("User click tab log user")
    public void User_click_tab_log_user() {
        Hooks.delay(1);
        hrPage.TabLogUser();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab log user");
    }

    @Then("User get text title page log user")
    public void user_get_text_title_page_log_user() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtLogUserPage(), "Log User");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page log user");
    }

//Search Log User by Employee Name
    @When("User select employee name on filter by")
    public void user_select_employee_name_on_filter_by() {
        Hooks.delay(1);
        hrPage.BtnFilterByLogUser();
        Hooks.delay(2);
        hrPage.SelectEmployeeFilterByLogUser();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select employee name on filter by");
    }

    @Then("User get text employee name log user")
    public void user_get_text_employee_name_log_user() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtEmployeeNameFilterByLogUser(), "Agus Senoaji");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text employee name log user");
    }

//Download Excel & PDF Log User Report
    @When("User click button download excel log user")
    public void user_click_button_download_excel_log_user () {
        Hooks.delay(1);
        hrPage.BtnDownloadExcelLogUser();
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
        extentTest.log(LogStatus.PASS, "User click button download excel log user");
    }

    @Then("User click button download pdf log user")
    public void user_click_button_download_pdf_log_user() {
        Hooks.delay(1);
        hrPage.BtnDownloadPdfLogUser();
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
        extentTest.log(LogStatus.PASS, "User click button download pdf log user");
    }

//Enter Workload Page
    @When("User click tab workload")
    public void User_click_tab_workload() {
        Hooks.delay(1);
        hrPage.TabWorkload();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab workload");
    }

    @Then("User get text title page workload")
    public void user_get_text_title_page_workload() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtWorkloadPage(), "Workload");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page workload");
    }

//Download Excel & PDF Workload Report
    @When("User click button download excel workload")
    public void user_click_button_download_excel_workload () {
        Hooks.delay(1);
        hrPage.BtnDownloadExcelWorkload();
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
        extentTest.log(LogStatus.PASS, "User click button download excel workload");
    }

    @Then("User click button download pdf workload")
    public void user_click_button_download_pdf_workload() {
        Hooks.delay(1);
        hrPage.BtnDownloadPdfWorkload();
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
        extentTest.log(LogStatus.PASS, "User click button download pdf workload");
    }

//Enter Leave Permission Page
    @When("User click tab leave permission")
    public void User_click_tab_leave_permission() {
        Hooks.delay(1);
        hrPage.TabLeavePermission();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab leave permission");
    }

    @Then("User get text title page leave permission")
    public void user_get_text_title_page_leave_permission() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtLeavePermissionPage(), "Leave Permission");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page leave permission");
    }

//Create Leave Permission
    @When("User click button create leave permission")
    public void user_click_button_create_leave_permission() {
        Hooks.delay(1);
        hrPage.BtnCreateLeavePermission();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create leave permission");
    }

    @And("User select type of leave")
    public void user_select_type_of_leave() {
        Hooks.delay(1);
        hrPage.BtnSearchTypeOfLeave();
        Hooks.delay(2);
        hrPage.SelectTypeOfLeave();
        Hooks.delay(2);
        hrPage.BtnConfirmSelectTypeOfLeave();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select type of leave");
    }

    @And("User select author leave permission")
    public void user_select_author_leave_permission() {
        Hooks.delay(1);
        hrPage.BtnSelectAuthorLeavePermission();
        Hooks.delay(2);
        hrPage.SelectAuthorLeavePermission();
        Hooks.delay(2);
        hrPage.BtnConfirmSelectAuthorLeavePermission();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select author leave permission");
    }

    @And("User select start date end date leave permission")
    public void user_select_start_date_end_date_leave_permission() {
        Hooks.delay(1);
        hrPage.BtnStartDateLeavePermission();
        Hooks.delay(2);
        hrPage.BtnSelectTodayStartDateLeavePermission();
        Hooks.delay(2);
        hrPage.BtnEndDateLeavePermission();
        Hooks.delay(2);
        hrPage.BtnSelectTodayEndDateLeavePermission();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select start date end date leave permission");
    }

    @And("User upload document leave permission")
    public void user_upload_document_leave_permission() {
        Hooks.delay(1);
        hrPage.BtnUploadDocumentLeavePermission("C:\\Users\\M1403QA\\Downloads\\Dokumen Slip Gaji 10-2024.pdf");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User upload document leave permission");
    }

    @And("User input note leave permission")
    public void user_input_note_leave_permission() {
        Hooks.delay(1);
        hrPage.InputNoteLeavePermission("Izin pergi kondangan");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note leave permission");
    }

    @Then("User save leave permission")
    public void user_save_leave_permission() {
        Hooks.delay(1);
        hrPage.BtnSaveLeavePermission();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveLeavePermission();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save leave permission");
    }

//Edit Leave Permission
    @When("User click button edit leave permission")
    public void user_click_button_edit_leave_permission() {
        Hooks.delay(2);
        hrPage.BtnEditLeavePermission();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit leave permission");
    }

    @And("User edit note leave permission")
    public void user_edit_note_leave_permission() {
        Hooks.delay(2);
        hrPage.ClearNoteLeavePermission();
        Hooks.delay(3);
        hrPage.InputNoteLeavePermission("Keluarga Inti Meninggal");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit note leave permission");
    }

    @Then("User save edit leave permission")
    public void user_save_edit_leave_permission() {
        Hooks.delay(3);
        hrPage.BtnSaveEditLeavePermission();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditLeavePermission();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit leave permission");
    }

//Approval Leave Permission
    @When("User switch account to first reviewer account")
    public void user_switch_account_to_first_reviewer_account() {
        Hooks.delay(2);
        loginDanLogoutPage.BtnLogout();
        Hooks.delay(2);
        loginDanLogoutPage.BtnLogoutOk();
        Hooks.delay(2);
        loginDanLogoutPage.EnterUsername("oktaviadwi335@gmail.com");
        Hooks.delay(2);
        loginDanLogoutPage.EnterPassword("aalf123");
        Hooks.delay(2);
        loginDanLogoutPage.BtnLogin();
        Hooks.delay(4);
        extentTest.log(LogStatus.PASS, "User switch account to first reviewer account");
    }

    @And("User click button first approval leave permission")
    public void user_click_button_first_approval_leave_permission() {
        Hooks.delay(2);
        hrPage.TabHr();
        Hooks.delay(2);
        hrPage.TabLeavePermission();
        Hooks.delay(2);
        hrPage.BtnApprovalLeavePermission();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button first approval leave permission");
    }

    @And("User select first approval leave permission")
    public void user_select_first_approval_leave_permission() {
        Hooks.delay(2);
        hrPage.BtnSelectApprovalLeavePermission();
        Hooks.delay(2);
        hrPage.SelectApprovalLeavePermission();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select first approval leave permission");
    }

    @And("User click button save first approval leave permission")
    public void user_click_button_save_first_approval_leave_permission() {
        Hooks.delay(3);
        hrPage.BtnSaveApprovalLeavePermission();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveApprovalLeavePermission();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save first approval leave permission");
    }

    @And("User switch account to second reviewer account")
    public void user_switch_account_to_second_reviewer_account() {
        Hooks.delay(2);
        loginDanLogoutPage.BtnLogout();
        Hooks.delay(2);
        loginDanLogoutPage.BtnLogoutOk();
        Hooks.delay(2);
        loginDanLogoutPage.EnterUsername("indah@ariyantoarnaldo.com");
        Hooks.delay(2);
        loginDanLogoutPage.EnterPassword("aalf123");
        Hooks.delay(2);
        loginDanLogoutPage.BtnLogin();
        Hooks.delay(4);
        extentTest.log(LogStatus.PASS, "User switch account to second reviewer account");
    }

    @And("User click button second approval leave permission")
    public void user_click_button_second_approval_leave_permission() {
        Hooks.delay(2);
        hrPage.TabHr();
        Hooks.delay(2);
        hrPage.TabLeavePermission();
        Hooks.delay(2);
        hrPage.BtnApprovalLeavePermission();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button second approval leave permission");
    }

    @And("User select second approval leave permission")
    public void user_select_second_approval_leave_permission() {
        Hooks.delay(2);
        hrPage.BtnSelectApprovalLeavePermission();
        Hooks.delay(2);
        hrPage.SelectApprovalLeavePermission();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select second approval leave permission");
    }

    @Then("User click button save second approval leave permission")
    public void user_click_button_save_second_approval_leave_permission() {
        Hooks.delay(3);
        hrPage.BtnSaveApprovalLeavePermission();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveApprovalLeavePermission();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save second approval leave permission");
    }

//View Approved Overtime Page
    @When("User switch account to master account")
    public void user_switch_account_to_master_account() {
        Hooks.delay(2);
        loginDanLogoutPage.BtnLogout();
        Hooks.delay(2);
        loginDanLogoutPage.BtnLogoutOk();
        Hooks.delay(2);
        loginDanLogoutPage.EnterUsername("go");
        Hooks.delay(2);
        loginDanLogoutPage.EnterPassword("go");
        Hooks.delay(2);
        loginDanLogoutPage.BtnLogin();
        Hooks.delay(4);
        extentTest.log(LogStatus.PASS, "User switch account to master account");
    }

    @And("User click button view approved leave permission")
    public void user_click_button_view_approved_leave_permission() {
        Hooks.delay(1);
        hrPage.TabHr();
        Hooks.delay(2);
        hrPage.TabLeavePermission();
        Hooks.delay(2);
        hrPage.BtnViewApprovedLeavePermission();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button view approved leave permission");
    }

    @And("User get text title page view approved leave permission")
    public void user_get_text_title_page_view_approved_leave_permission() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtViewApprovedLeavePermissionPage(), "View Leave Permission");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User get text title page view approved leave permission");
    }

    @Then("User back to leave permission page")
    public void user_back_to_leave_permission_page() {
        Hooks.delay(1);
        hrPage.BtnBackViewLeavePermissionPage();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User back to leave permission page");
    }

//Enter Joint Holiday Page
    @When("User click tab joint holiday")
    public void User_click_tab_joint_holiday() {
        Hooks.delay(1);
        hrPage.TabJointHoliday();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab joint holiday");
    }

    @Then("User get text title page joint holiday")
    public void user_get_text_title_page_joint_holiday() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtJointHolidayPage(), "Joint Holiday");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page joint holiday");
    }

//Create Joint Holiday
    @When("User click button create joint holiday")
    public void user_click_button_create_joint_holiday() {
        Hooks.delay(1);
        hrPage.BtnCreateJointHoliday();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create joint holiday");
    }

    @And("User select date joint holiday")
    public void user_select_date_joint_holiday() {
        Hooks.delay(1);
        hrPage.BtnDateJointHoliday();
        Hooks.delay(2);
        hrPage.BtnSelectTodayDateJointHoliday();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select date joint holiday");
    }

    @And("User input title joint holiday")
    public void user_input_title_join_holiday() {
        Hooks.delay(1);
        hrPage.InputTitleJointHoliday("Cuti Bersama Kantor");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input title join holiday");
    }

    @And("User click reduce balance joint holiday")
    public void user_click_reduce_balance_joint_holiday() {
        Hooks.delay(1);
        hrPage.BtnReduceBalanceJointHoliday();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click reduce balance joint holiday");
    }

    @Then("User save joint holiday")
    public void user_save_joint_holiday() {
        Hooks.delay(1);
        hrPage.BtnSaveJointHoliday();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveJointHoliday();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save joint holiday");
    }

//Edit Joint Holiday
    @When("User click button edit joint holiday")
    public void user_click_button_edit_joint_holiday() {
        Hooks.delay(2);
        hrPage.BtnEditJointHoliday();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit joint holiday");
    }

    @And("User edit title joint holiday")
    public void user_edit_title_joint_holiday() {
        Hooks.delay(2);
        hrPage.ClearTitleJointHoliday();
        Hooks.delay(3);
        hrPage.InputTitleJointHoliday("Cuti Bersama Kantor Morfotech");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit title joint holiday");
    }

    @Then("User save edit joint holiday")
    public void user_save_edit_joint_holiday() {
        Hooks.delay(3);
        hrPage.BtnSaveEditJointHoliday();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditJointHoliday();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit joint holiday");
    }

    //Delete Joint Holiday
    @When("User click button delete joint holiday")
    public void user_click_button_delete_joint_holiday() {
        Hooks.delay(2);
        hrPage.BtnDeleteJointHoliday();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button delete joint holiday");
    }

    @Then("User click button confirm delete joint holiday")
    public void user_click_button_confirm_delete_joint_holiday() {
        Hooks.delay(2);
        hrPage.BtnConfirmDeleteJointHoliday();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete joint holiday");
    }

    //Enter Master Holiday Page
    @When("User click tab master holiday")
    public void user_click_tab_master_holiday() {
        Hooks.delay(1);
        hrPage.TabMasterHoliday();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab master holiday");
    }

    @Then("User get text title page master holiday")
    public void user_get_text_title_page_master_holiday() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtMasterHoliday(), "Document Number");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page master holiday");
    }

    //Edit Master Holiday
    @When("User click button edit master holiday")
    public void user_click_button_edit_master_holiday() {
        Hooks.delay(2);
        hrPage.BtnEditJointMasterHoliday();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit master holiday");
    }

    @And("User edit overtime multiplier master holiday")
    public void user_edit_overtime_multiplier_master_holiday() {
        Hooks.delay(2);
        hrPage.ClearOvertimeMultiplierMasterHoliday();
        Hooks.delay(3);
        hrPage.InputOvertimeMultiplierMasterHoliday("3");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit overtime multiplier master holiday");
    }

    @Then("User save edit master holiday")
    public void user_save_edit_master_holiday() {
        Hooks.delay(3);
        hrPage.BtnSaveEditMasterHoliday();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditMasterHoliday();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit master holiday");
    }

//Enter Employee Page
    @When("User click tab employee")
    public void User_click_tab_employee() {
        Hooks.delay(1);
        hrPage.TabEmployee();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab employee");
    }

    @Then("User get text title page employee")
    public void user_get_text_title_page_employee() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtEmployeePage(), "Employee");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page employee");
    }

//Search Employee by Name
    @When("User input employee name on search bar")
    public void user_input_employee_name_on_search_bar() {
        Hooks.delay(1);
        hrPage.SearchBarEmployee("Naomi Astrid");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input employee name on search bar");
    }

    @Then("User get text employee name")
    public void user_get_text_employee_name() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtEmployeeName(), "Naomi Astrid Sridinanti Nababan");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text employee name");
    }

//Create Employee
    @When("User click button create employee")
    public void user_click_button_create_employee() {
        Hooks.delay(1);
        hrPage.BtnCreateEmployee();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create employee");
    }

    @And("User input username employee")
    public void user_input_username_employee() {
        Hooks.delay(1);
        hrPage.InputUsernameEmployee("gian");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input username employee");
    }

    @And("User input password employee")
    public void user_input_password_employee() {
        Hooks.delay(1);
        hrPage.InputPasswordEmployee("gian");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input password employee");
    }

    @And("User select company employee")
    public void user_select_company_employee() {
        Hooks.delay(1);
        hrPage.BtnSelectCompanyEmployee();
        Hooks.delay(2);
        hrPage.SelectCompanyEmployee();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select company employee");
    }

    @And("User choose role employee")
    public void user_choose_role_employee() {
        Hooks.delay(1);
        hrPage.BtnChooseRoleEmployee();
        Hooks.delay(2);
        hrPage.ChooseRoleEmployee();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User choose role employee");
    }

    @Then("User save data employee")
    public void user_save_data_employee() {
        Hooks.delay(1);
        hrPage.BtnSaveDataEmployee();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveDataEmployee();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save data employee");
    }

//Edit Personal Data Employee
    @When("User click button edit employee")
    public void user_click_button_edit_employee() {
        Hooks.delay(2);
        hrPage.BtnEditEmployee();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit employee");
    }

    @And("User click tab personal data employee")
    public void user_click_tab_personal_data_employee() {
        Hooks.delay(2);
        hrPage.TabPersonalDataEmployee();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab personal data employee");
    }

    @And("User edit personal data employee")
    public void user_edit_personal_data_employee() {
        Hooks.delay(2);
        hrPage.ClearBirthPlaceEmployee();
        Hooks.delay(3);
        hrPage.InputBirthPlaceEmployee("Padang");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit personal data employee");
    }

    @Then("User save edit personal data employee")
    public void user_save_edit_personal_data_employee() {
        Hooks.delay(2);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        hrPage.BtnSaveEditPersonalDataEmployee();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditPersonalDataEmployee();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit personal data employee");
    }

//Edit Family Data Employee
    @When("User click tab family data employee")
    public void user_click_tab_family_data_employee() {
        Hooks.delay(2);
        hrPage.TabFamilyDataEmployee();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab family data employee");
    }

    @And("User edit family data employee")
    public void user_edit_family_data_employee() {
        Hooks.delay(2);
        hrPage.ClearFatherNameEmployee();
        Hooks.delay(3);
        hrPage.InputFatherNameEmployee("Jayanto");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit personal data employee");
    }

    @Then("User save edit family data employee")
    public void user_save_edit_family_data_employee() {
        Hooks.delay(2);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        hrPage.BtnSaveEditFamilyDataEmployee();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditFamilyDataEmployee();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit family data employee");
    }

//Edit Employee Data Employee
    @When("User click tab employee data employee")
    public void user_click_tab_employee_data_employee() {
        Hooks.delay(2);
        hrPage.TabEmployeeDataEmployee();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab employee data employee");
    }

    @And("User edit employee data employee")
    public void user_edit_employee_data_employee() {
        Hooks.delay(2);
        hrPage.ClearBaseSalaryEmployee();
        Hooks.delay(3);
        hrPage.InputBaseSalaryEmployee("7230000");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit employee data employee");
    }

    @Then("User save edit employee data employee")
    public void user_save_edit_employee_data_employee() {
        Hooks.delay(2);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        hrPage.BtnSaveEditEmployeeDataEmployee();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditEmployeeDataEmployee();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit employee data employee");
    }

//Edit Operational Data Employee
    @When("User click tab operational data employee")
    public void user_click_tab_operational_data_employee() {
        Hooks.delay(2);
        hrPage.TabOperationalDataEmployee();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab operational data employee");
    }

    @And("User edit operational data employee")
    public void user_edit_operational_data_employee() {
        Hooks.delay(2);
        hrPage.BtnSelectGradeEmployee();
        Hooks.delay(2);
        hrPage.SelectGradeEmployee();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit operational data employee");
    }

    @Then("User save edit operational data employee")
    public void user_save_edit_operational_data_employee() {
        Hooks.delay(2);
        hrPage.BtnSaveEditOperationalDataEmployee();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditOperationalDataEmployee();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit operational data employee");
    }

//Enter Master Input Page
    @When("User click tab master input")
    public void user_click_tab_master_input() {
        Hooks.delay(2);
        hrPage.TabMasterInput();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab master input");
    }

    @Then("User get text title page master input")
    public void user_get_text_title_page_master_input() {
        Hooks.delay(2);
        Assert.assertEquals(hrPage.getTxtMasterInputPage(),"Master Input");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User get text title page master input");
    }

//Create Company
    @When("User click button create company")
    public void user_click_button_create_company() {
        Hooks.delay(1);
        hrPage.BtnCreateCompany();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create company");
    }

    @And("User upload letterhead company")
    public void user_upload_letterhead_company() {
        Hooks.delay(2);
        hrPage.BtnUploadLetterHeadCompany("C:\\Users\\M1403QA\\Downloads\\header.png");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User upload letterhead company");
    }

    @And("User upload footer company")
    public void user_upload_footer_company() {
        Hooks.delay(2);
        hrPage.BtnUploadFooterCompany("C:\\Users\\M1403QA\\Downloads\\header.png");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User upload footer company");
    }

    @And("User input company name")
    public void user_input_company_name() {
        Hooks.delay(2);
        hrPage.InputCompanyName("PT.Maju Jaya Sejahtera");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input company name");
    }

    @And("User input company address")
    public void user_input_company_address() {
        Hooks.delay(2);
        hrPage.InputCompanyAddress("Jl.TB Simatupang");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input company address");
    }

    @And("User input company rt")
    public void user_input_company_rt() {
        Hooks.delay(2);
        hrPage.InputCompanyRt("2");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input company rt");
    }

    @And("User input company rw")
    public void user_input_company_rw() {
        Hooks.delay(2);
        hrPage.InputCompanyRw("5");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input company rw");
    }

    @And("User select company province")
    public void user_select_company_province() {
        Hooks.delay(2);
        hrPage.BtnSelectCompanyProvince();
        Hooks.delay(2);
        hrPage.SelectCompanyProvince();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select company province");
    }

    @And("User select company city")
    public void user_select_company_city() {
        Hooks.delay(2);
        hrPage.BtnSelectCompanyCity();
        Hooks.delay(2);
        hrPage.SelectCompanyCity();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select company city");
    }

    @And("User select company district")
    public void user_select_company_district() {
        Hooks.delay(2);
        hrPage.BtnSelectCompanyDistrict();
        Hooks.delay(2);
        hrPage.SelectCompanyDistrict();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select company district");
    }

    @And("User select company sub district")
    public void user_select_company_sub_district() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        Hooks.delay(2);
        hrPage.BtnSelectCompanySubDistrict();
        Hooks.delay(2);
        hrPage.SelectCompanySubDistrict();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select company sub district");
    }

    @And("User input company postal code")
    public void user_input_company_postal_code() {
        Hooks.delay(2);
        hrPage.InputCompanyPostalCode("25223");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input company postal code");
    }

    @And("User input company phone number")
    public void user_input_company_phone_number() {
        Hooks.delay(2);
        hrPage.InputCompanyPhoneNumber("082293844958");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input company phone number");
    }

    @And("User input company fax number")
    public void user_input_company_fax_number() {
        Hooks.delay(2);
        hrPage.InputCompanyFaxNumber("02183941");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input company fax number");
    }

    @And("User input company email")
    public void user_input_company_email() {
        Hooks.delay(2);
        hrPage.InputCompanyEmail("majujaya@gmail.com");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input company email");
    }

    @And("User input company npwp")
    public void user_input_company_npwp() {
        Hooks.delay(2);
        hrPage.InputCompanyNpwp("0092938989192893");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input company npwp");
    }

    @And("User input company bpjs kesehatan")
    public void user_input_company_bpjs_kesehatan() {
        Hooks.delay(2);
        hrPage.InputCompanyBpjsKesehatan("909391983910");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input company bpjs kesehatan");
    }

    @And("User input company bpjs tk")
    public void user_input_company_bpjs_tk() {
        Hooks.delay(2);
        hrPage.InputCompanyBpjsTk("909391983491");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input company bpjs tk");
    }

    @And("User input company bank name")
    public void user_input_company_bank_name() {
        Hooks.delay(2);
        hrPage.InputCompanyBankName("BCA");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input company bank name");
    }

    @And("User input company account number")
    public void user_input_company_account_number() {
        Hooks.delay(2);
        hrPage.InputCompanyAccountNumber("78819899192");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input company account number");
    }

    @Then("User save company data")
    public void user_save_company_data() {
        Hooks.delay(1);
        hrPage.BtnSaveCompanyData();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveCompanyData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save company data");
    }

//Search Company by ID Company
    @When("User input id company on search bar")
    public void user_input_id_company_on_search_bar() {
        Hooks.delay(1);
        hrPage.SearchBarCompany("AALF01");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input id company on search bar");
    }

    @Then("User get text id company")
    public void user_get_text_id_company() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtIdCompany(), "AALF01");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text id company");
    }

//Edit Company Data
    @When("User click button edit company")
    public void user_click_button_edit_company() {
        Hooks.delay(2);
        hrPage.BtnEditCompany();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit company");
    }

    @And("User edit npwp company")
    public void user_edit_npwp_company() {
        Hooks.delay(2);
        hrPage.InputCompanyNpwp("8919847816371");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit npwp company");
    }

    @Then("User save edit company data")
    public void user_save_edit_company_data() {
        Hooks.delay(2);
        hrPage.BtnSaveEditCompanyData();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditCompanyData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit company data");
    }

//Create Office Location
    @When("User click tab office location")
    public void user_click_tab_office_location() {
        Hooks.delay(1);
        hrPage.TabOfficeLocation();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab office location");
    }

    @And("User click button create office location")
    public void user_click_button_create_office_location() {
        Hooks.delay(2);
        hrPage.BtnCreateOfficeLocation();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create office location");
    }

    @And("User input office location name")
    public void user_input_office_location_name() {
        Hooks.delay(2);
        hrPage.InputOfficeLocationName("LKBH Morfotech");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input office location name");
    }

    @And("User input office address")
    public void user_input_office_address() {
        Hooks.delay(2);
        hrPage.InputOfficeAddress("Jl. Melawai 5, RT.3/RW.1, Melawai, Kec. Kby. Baru, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12160");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input office address");
    }

    @And("User input office rt")
    public void user_input_office_rt() {
        Hooks.delay(2);
        hrPage.InputOfficeRt("3");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input office rt");
    }

    @And("User input office rw")
    public void user_input_office_rw() {
        Hooks.delay(2);
        hrPage.InputOfficeRw("1");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input office rw");
    }

    @And("User select office province")
    public void user_select_office_province() {
        Hooks.delay(2);
        hrPage.BtnSelectOfficeProvince();
        Hooks.delay(2);
        hrPage.SelectOfficeProvince();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select office province");
    }

    @And("User select office city")
    public void user_select_office_city() {
        Hooks.delay(2);
        hrPage.BtnSelectOfficeCity();
        Hooks.delay(2);
        hrPage.SelectOfficeCity();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select office city");
    }

    @And("User select office district")
    public void user_select_office_district() {
        Hooks.delay(2);
        hrPage.BtnSelectOfficeDistrict();
        Hooks.delay(2);
        hrPage.SelectOfficeDistrict();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select office district");
    }

    @And("User select office sub district")
    public void user_select_office_sub_district() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        Hooks.delay(2);
        hrPage.BtnSelectOfficeSubDistrict();
        Hooks.delay(2);
        hrPage.SelectOfficeSubDistrict();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select office sub district");
    }

    @And("User input office latitude longitude")
    public void user_input_office_latitude_longitude() {
        Hooks.delay(2);
        hrPage.InputOfficeLatitudeLongitude("blok m");
        Hooks.delay(2);
        hrPage.BtnSearchOfficeLatitudeLongitude();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input office latitude longitude");
    }

    @And("User input office radius")
    public void user_input_office_radius() {
        Hooks.delay(2);
        hrPage.InputOfficeRadius("100");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input office radius");
    }

    @And("User input office postal code")
    public void user_input_office_postal_code() {
        Hooks.delay(2);
        hrPage.InputOfficePostalCode("12160");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input office postal code");
    }

    @And("User input office phone number")
    public void user_input_office_phone_number() {
        Hooks.delay(2);
        hrPage.InputOfficePhoneNumber("02183941");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input office phone number");
    }

    @And("User input office fax number")
    public void user_input_office_fax_number() {
        Hooks.delay(2);
        hrPage.InputOfficeFaxNumber("02183941");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input office fax number");
    }

    @And("User input office email")
    public void user_input_office_email() {
        Hooks.delay(2);
        hrPage.InputOfficeEmailAddress("morfotechmaju@gmail.com");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input office email");
    }

    @Then("User save office location data")
    public void user_save_office_location_data() {
        Hooks.delay(1);
        hrPage.BtnSaveOfficeLocationData();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveOfficeLocationData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save office location data");
    }

//Search Office Location by ID Office Location
    @When("User input id office location on search bar")
    public void user_input_id_office_location_on_search_bar() {
        Hooks.delay(1);
        hrPage.SearchBarOfficeLocation("CAB01");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input id office location on search bar");
    }

    @Then("User get text id office location")
    public void user_get_text_id_office_location() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtIdOfficeLocation(), "CAB01");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text id office location");
    }

//Edit Office Location Data
    @When("User click button edit office location")
    public void user_click_button_edit_office_location() {
        Hooks.delay(2);
        hrPage.BtnEditOfficeLocation();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit office location");
    }

    @And("User edit office phone number")
    public void user_edit_office_phone_number() {
        Hooks.delay(2);
        hrPage.ClearInputOfficePhoneNumber();
        Hooks.delay(2);
        hrPage.InputOfficePhoneNumber("02183941");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit office phone number");
    }

    @Then("User save edit office location data")
    public void user_save_edit_office_location_data() {
        Hooks.delay(2);
        hrPage.BtnSaveEditOfficeLocationData();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditOfficeLocationData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit office location data");
    }

//Create Department
    @When("User click tab department")
    public void user_click_tab_department() {
        Hooks.delay(1);
        hrPage.TabDepartment();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab department");
    }

    @And("User click button create department")
    public void user_click_button_create_department() {
        Hooks.delay(2);
        hrPage.BtnCreateDepartment();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create department");
    }

    @And("User input department name")
    public void user_input_department_name() {
        Hooks.delay(2);
        hrPage.InputDepartmentName("Finance");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input department name");
    }

    @Then("User save department data")
    public void user_save_department_data() {
        Hooks.delay(1);
        hrPage.BtnSaveDepartment();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveDepartment();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save department data");
    }

//Search Department by ID Department
    @When("User input id department on search bar")
    public void user_input_id_department_on_search_bar() {
        Hooks.delay(1);
        hrPage.SearchBarDepartment("DEP02");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input id department on search bar");
    }

    @Then("User get text id department")
    public void user_get_text_id_department() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtIdDepartment(), "DEP02");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text id department");
    }

//Edit Department Data
    @When("User click button edit department")
    public void user_click_button_edit_department() {
        Hooks.delay(2);
        hrPage.BtnEditDepartment();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit department");
    }

    @And("User edit department name")
    public void user_edit_department_name() {
        Hooks.delay(2);
        hrPage.ClearInputDepartmentName();
        Hooks.delay(2);
        hrPage.InputDepartmentName("Operationals");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit department name");
    }

    @Then("User save edit department data")
    public void user_save_edit_department_data() {
        Hooks.delay(2);
        hrPage.BtnSaveEditDepartmentData();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditDepartmentData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit department data");
    }

//Create Position
    @When("User click tab position")
    public void user_click_tab_position() {
        Hooks.delay(1);
        hrPage.TabPosition();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab position");
    }

    @And("User click button create position")
    public void user_click_button_create_position() {
        Hooks.delay(2);
        hrPage.BtnCreatePosition();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create position");
    }

    @And("User input position name")
    public void user_input_position_name() {
        Hooks.delay(2);
        hrPage.InputPositionName("Para Hombres");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input position name");
    }

    @Then("User save position data")
    public void user_save_position_data() {
        Hooks.delay(1);
        hrPage.BtnSavePosition();
        Hooks.delay(2);
        hrPage.BtnConfirmSavePosition();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save position data");
    }

//Search Position by ID Position
    @When("User input id position on search bar")
    public void user_input_id_position_on_search_bar() {
        Hooks.delay(1);
        hrPage.SearchBarPosition("JAB02");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input id position on search bar");
    }

    @Then("User get text id position")
    public void user_get_text_id_position() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtIdPosition(), "JAB02");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text id position");
    }

//Edit Position Data
    @When("User click button edit position")
    public void user_click_button_edit_position() {
        Hooks.delay(2);
        hrPage.BtnEditPosition();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit position");
    }

    @And("User edit position name")
    public void user_edit_position_name() {
        Hooks.delay(2);
        hrPage.ClearInputPositionName();
        Hooks.delay(2);
        hrPage.InputPositionName("Partners");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit position name");
    }

    @Then("User save edit position data")
    public void user_save_edit_position_data() {
        Hooks.delay(2);
        hrPage.BtnSaveEditPositionData();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditPositionData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit position data");
    }

//Create Region
    @When("User click tab region")
    public void user_click_tab_region() {
        Hooks.delay(1);
        hrPage.TabRegion();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab region");
    }

    @And("User click button create region")
    public void user_click_button_create_region() {
        Hooks.delay(2);
        hrPage.BtnCreateRegion();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create region");
    }

    @And("User input region name")
    public void user_input_region_name() {
        Hooks.delay(2);
        hrPage.InputRegionName("Luar Kecamatan");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input region name");
    }

    @Then("User save region data")
    public void user_save_region_data() {
        Hooks.delay(1);
        hrPage.BtnSaveRegion();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveRegion();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save region data");
    }

//Search Region by ID Region
    @When("User input id region on search bar")
    public void user_input_id_region_on_search_bar() {
        Hooks.delay(1);
        hrPage.SearchBarRegion("WIL01");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input id region on search bar");
    }

    @Then("User get text id region")
    public void user_get_text_id_region() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtIdRegion(), "WIL01");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text id region");
    }

//Edit Region Data
    @When("User click button edit region")
    public void user_click_button_edit_region() {
        Hooks.delay(2);
        hrPage.BtnEditRegion();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit region");
    }

    @And("User edit region name")
    public void user_edit_region_name() {
        Hooks.delay(2);
        hrPage.ClearInputRegionName();
        Hooks.delay(2);
        hrPage.InputRegionName("Dalam Kota Jakarta");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit region name");
    }

    @Then("User save edit region data")
    public void user_save_edit_region_data() {
        Hooks.delay(2);
        hrPage.BtnSaveEditRegionData();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditRegionData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit region data");
    }

//Create SOW
    @When("User click tab sow")
    public void user_click_tab_sow() {
        Hooks.delay(1);
        hrPage.TabSow();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab sow");
    }

    @And("User click sub tab sow")
    public void user_click_sub_tab_sow() {
        Hooks.delay(1);
        hrPage.SubTabSow();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click sub tab sow");
    }

    @And("User click button create sow")
    public void user_click_button_create_sow() {
        Hooks.delay(2);
        hrPage.BtnCreateSow();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create sow");
    }

    @And("User input sow name")
    public void user_input_sow_name() {
        Hooks.delay(2);
        hrPage.SelectSowName();
        Hooks.delay(2);
        hrPage.ChooseSowName();
        Hooks.delay(2);
        hrPage.BtnSelectSowName();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input sow name");
    }

    @Then("User save sow data")
    public void user_save_sow_data() {
        Hooks.delay(1);
        hrPage.BtnSaveSow();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveSow();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save sow data");
    }

//Search SOW by SOW Name
    @When("User input sow name on search bar")
    public void user_input_sow_name_on_search_bar() {
        Hooks.delay(1);
        hrPage.SearchBarSow("Cue Card");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input sow name on search bar");
    }

    @Then("User get text sow name")
    public void user_get_text_sow_name() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtSowName(), "Cue Card");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text sow name");
    }

//Edit SOW Data
    @When("User click button edit sow")
    public void user_click_button_edit_sow() {
        Hooks.delay(2);
        hrPage.BtnEditSow();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit sow");
    }

    @And("User edit sow name")
    public void user_edit_sow_name() {
        Hooks.delay(2);
        hrPage.ClearInputSowName();
        Hooks.delay(2);
        hrPage.InputSowName("Cue Cards");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit sow name");
    }

    @Then("User save edit sow data")
    public void user_save_edit_sow_data() {
        Hooks.delay(2);
        hrPage.BtnSaveEditSowData();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditSowData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit sow data");
    }

//Create SOW Tree & Score
    @When("User click sub tab sow tree & score")
    public void user_click_sub_tab_sow_tree_and_score() {
        Hooks.delay(1);
        hrPage.SubTabSowTreeAndScore();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click sub tab sow tree & score");
    }

    @And("User click button create sow tree & score")
    public void user_click_button_create_sow_tree_and_score() {
        Hooks.delay(2);
        hrPage.BtnCreateSowTreeAndScore();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create sow tree & score");
    }

    @And("User select sow level")
    public void user_select_sow_level() {
        Hooks.delay(2);
        hrPage.SelectSowLevel();
        Hooks.delay(2);
        hrPage.ChooseSowLevel();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select sow level");
    }

    @And("User select sow parent")
    public void user_select_sow_parent() {
        Hooks.delay(2);
        hrPage.SelectSowParent();
        Hooks.delay(2);
        hrPage.ChooseSowParent();
        Hooks.delay(2);
        hrPage.BtnSelectSowParent();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select sow parent");
    }

    @And("User select sow name")
    public void user_select_sow_name() {
        Hooks.delay(2);
        hrPage.BtnSelectSowName();
        Hooks.delay(2);
        hrPage.ChooseSowName();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select sow parent");
    }

    @And("User input sow score")
    public void user_input_sow_score() {
        Hooks.delay(2);
        hrPage.InputSowScore("3");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input sow score");
    }

    @Then("User save sow tree & score data")
    public void user_save_sow_tree_and_score_data() {
        Hooks.delay(1);
        hrPage.BtnSaveSowTreeAndScore();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveSowTreeAndScore();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save sow tree & score data");
    }

//Edit SOW Tree & Score Data
    @When("User click sow tree & score")
    public void user_click_sow_tree_and_score() {
        Hooks.delay(2);
        hrPage.BtnEditSowTreeAndScore();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click sow tree & score");
    }

    @And("User edit sow score")
    public void user_edit_sow_score() {
        Hooks.delay(2);
        hrPage.SelectEditScoreSowTreeAndScore();
        Hooks.delay(2);
        hrPage.ChooseEditScoreSowTreeAndScore();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit sow score");
    }

    @Then("User submit edit sow tree & score data")
    public void user_submit_edit_sow_tree_and_score_data() {
        Hooks.delay(2);
        hrPage.BtnSubmitEditScoreSowTreeAndScore();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User submit edit sow tree & score data");
    }

//Create Type of Client
    @When("User click tab type of client")
    public void user_click_tab_type_of_client() {
        Hooks.delay(1);
        hrPage.TabTypeOfClient();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab type of client");
    }

    @And("User click button create type of client")
    public void user_click_button_create_type_of_client() {
        Hooks.delay(2);
        hrPage.BtnCreateTypeOfClient();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create type of client");
    }

    @And("User input type of client name")
    public void user_input_type_of_client_name() {
        Hooks.delay(2);
        hrPage.InputTypeOfClientName("Weekly");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input type of client name");
    }

    @Then("User save type of client data")
    public void user_save_type_of_client_data() {
        Hooks.delay(1);
        hrPage.BtnSaveTypeOfClient();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveTypeOfClient();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save type of client data");
    }

//Search Type of Client by Type of Client Name
    @When("User input type of client name on search bar")
    public void user_input_type_of_client_name_on_search_bar() {
        Hooks.delay(1);
        hrPage.SearchBarTypeOfClient("Hourly");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input type of client name on search bar");
    }

    @Then("User get text type of client name")
    public void user_get_text_type_of_client_name() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtTypeOfClientName(), "Hourly");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text type of client name");
    }

//Edit Type of Client Data
    @When("User click button edit type of client")
    public void user_click_button_edit_type_of_client() {
        Hooks.delay(2);
        hrPage.BtnEditTypeOfClient();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit type of client");
    }

    @And("User edit type of client name")
    public void user_edit_type_of_client_name() {
        Hooks.delay(2);
        hrPage.ClearInputTypeOfClientName();
        Hooks.delay(2);
        hrPage.InputTypeOfClientName("Per Hour");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit type of client name");
    }

    @Then("User save edit type of client data")
    public void user_save_edit_type_of_client_data() {
        Hooks.delay(2);
        hrPage.BtnSaveEditTypeOfClientData();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditTypeOfClientData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit type of client data");
    }

//Create Grade
    @When("User click tab grade")
    public void user_click_tab_grade() {
        Hooks.delay(1);
        hrPage.TabGrade();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab grade");
    }

    @And("User click button create grade")
    public void user_click_button_create_grade() {
        Hooks.delay(2);
        hrPage.BtnCreateGrade();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create grade");
    }

    @And("User input grade name")
    public void user_input_grade_name() {
        Hooks.delay(2);
        hrPage.InputGradeName("Direktur");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input grade name");
    }

    @Then("User save grade data")
    public void user_save_grade_data() {
        Hooks.delay(1);
        hrPage.BtnSaveGrade();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveGrade();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save grade data");
    }

//Search Grade by ID Grade
    @When("User input id grade on search bar")
    public void user_input_id_grade_on_search_bar() {
        Hooks.delay(1);
        hrPage.SearchBarGrade("GRA01");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input id grade on search bar");
    }

    @Then("User get text id grade")
    public void user_get_text_id_grade() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtIdGrade(), "GRA01");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text id grade");
    }

//Edit Court Money Grade
    @When("User click button edit grade")
    public void user_click_button_edit_grade() {
        Hooks.delay(2);
        hrPage.BtnEditGrade();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit type of grade");
    }

    @And("User edit court money grade")
    public void user_edit_court_money_grade() {
        Hooks.delay(2);
        hrPage.InputCourtMoneyGrade("3800000");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit court money grade");
    }

    @Then("User save edit court money grade data")
    public void user_save_edit_court_money_grade_data() {
        Hooks.delay(2);
        hrPage.BtnSaveEditCourtMoneyGradeData();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditCourtMoneyGradeData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit court money grade data");
    }

//Edit Allowance Grade
    @When("User click tab allowance grade")
    public void user_click_tab_allowance_grade() {
        Hooks.delay(2);
        hrPage.TabAllowanceGrade();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab allowance grade");
    }

    @And("User edit allowance grade")
    public void user_edit_allowance_grade() {
        Hooks.delay(2);
        hrPage.InputAllowanceDalamKotaGrade("1000000");
        Hooks.delay(2);
        hrPage.InputAllowanceLuarKotaGrade("2000000");
        Hooks.delay(2);
        hrPage.InputAllowanceLuarNegeriGrade("3000000");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit allowance grade");
    }

    @Then("User save edit allowance grade data")
    public void user_save_allowance_grade_data() {
        Hooks.delay(2);
        hrPage.BtnSaveEditAllowanceGradeData();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditAllowanceGradeData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit type of client data");
    }

//Edit Meal Allowance Grade
    @When("User click tab meal allowance grade")
        public void user_click_tab_meal_allowance_grade() {
        Hooks.delay(2);
        hrPage.TabMealAllowanceGrade();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab meal allowance grade");
}

    @And("User edit meal allowance grade")
    public void user_edit_meal_allowance_grade() {
        Hooks.delay(2);
        hrPage.InputMealAllowanceDalamKotaGrade("150000");
        Hooks.delay(2);
        hrPage.InputMealAllowanceLuarKotaGrade("400000");
        Hooks.delay(2);
        hrPage.InputMealAllowanceLuarNegeriGrade("750000");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit meal allowance grade");
    }

    @Then("User save edit meal allowance grade data")
    public void user_save_meal_allowance_grade_data() {
        Hooks.delay(2);
        hrPage.BtnSaveEditMealAllowanceGradeData();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditMealAllowanceGradeData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit meal allowance grade data");
    }

//Edit Professional Fee Grade
    @When("User click tab professional fee grade")
    public void user_click_tab_professional_fee_grade() {
        Hooks.delay(2);
        hrPage.TabProfessionalFeeGrade();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab professional fee grade");
}

    @And("User edit professional fee grade")
    public void user_edit_professional_fee_grade() {
        Hooks.delay(2);
        hrPage.InputProfessionalFeeDalamKotaGrade("1000000");
        Hooks.delay(2);
        hrPage.InputProfessionalFeeLuarKotaGrade("2000000");
        Hooks.delay(2);
        hrPage.InputProfessionalFeeLuarNegeriGrade("3000000");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit professional fee grade");
    }

    @Then("User save edit professional fee grade data")
    public void user_save_professional_fee_grade_data() {
        Hooks.delay(2);
        hrPage.BtnSaveEditProfessionalFeeGradeData();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditProfessionalFeeGradeData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit professional fee grade data");
    }

//Edit Hotel Grade
    @When("User click tab hotel grade")
    public void user_click_tab_hotel_grade() {
        Hooks.delay(2);
        hrPage.TabHotelGrade();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab hotel grade");
}

    @And("User edit hotel grade")
    public void user_edit_hotel_grade() {
        Hooks.delay(2);
        hrPage.InputHotelDalamKotaGrade("450000");
        Hooks.delay(2);
        hrPage.InputHotelLuarKotaGrade("700000");
        Hooks.delay(2);
        hrPage.InputHotelLuarNegeriGrade("1200000");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit hotel grade");
    }

    @Then("User save edit hotel grade data")
    public void user_save_hotel_grade_data() {
        Hooks.delay(2);
        hrPage.BtnSaveEditHotelGradeData();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditHotelGradeData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit hotel data");
    }

//Edit Flight Grade
    @When("User click tab flight grade")
    public void user_click_tab_flight_grade() {
        Hooks.delay(2);
        hrPage.TabFlightGrade();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab flight grade");
}

    @And("User edit flight grade")
    public void user_edit_flight_grade() {
        Hooks.delay(2);
        hrPage.BtnSelectFlightGrade();
        Hooks.delay(2);
        hrPage.ChooseSelectFlightGrade();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit flight grade");
    }

    @Then("User save edit flight grade data")
    public void user_save_flight_grade_data() {
        Hooks.delay(2);
        hrPage.BtnSaveEditFlightGradeData();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditFlightGradeData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit flight data");
    }

//Edit Working Hours Data
    @When("User click tab working hours")
    public void user_click_tab_working_hours() {
        Hooks.delay(2);
        hrPage.TabWorkingHours();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab working hours");
    }

    @And("User edit late fee amount")
    public void user_edit_late_fee_amount() {
        Hooks.delay(2);
        hrPage.ClearInputLateFeeAmountWorkingHours();
        Hooks.delay(2);
        hrPage.InputLateFeeAmountWorkingHours("75000");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit late fee amount");
    }

    @Then("User save edit working hours data")
    public void user_save_edit_working_hours_data() {
        Hooks.delay(2);
        hrPage.BtnSaveEditWorkingHoursData();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditWorkingHoursData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit working hours data");
    }

//Create Type of Leave
    @When("User click tab type of leave")
    public void user_click_tab_type_of_leave() {
        Hooks.delay(1);
        hrPage.TabTypeOfLeave();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab type of leave");
    }

    @And("User click button create type of leave")
    public void user_click_button_create_type_of_leave() {
        Hooks.delay(2);
        hrPage.BtnCreateTypeOfLeave();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create type of leave");
    }

    @And("User input type of leave name")
    public void user_input_type_of_leave_name() {
        Hooks.delay(2);
        hrPage.InputTypeOfLeaveName("Menikah");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input type of leave name");
    }

    @And("User input type of leave description")
    public void user_input_type_of_leave_description() {
        Hooks.delay(2);
        hrPage.InputTypeOfLeaveDescription("Cuti Menikah");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input type of leave description");
    }

    @And("User input type of leave maximum days")
    public void user_input_type_of_leave_maximum_days() {
        Hooks.delay(2);
        hrPage.InputTypeOfLeaveMaximumDays("7");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input type of leave maximum days");
    }

    @And("User select reviewer type of leave")
    public void user_select_reviewer_type_of_leave() {
        Hooks.delay(2);
        hrPage.BtnAddTypeOfLeaveReviewer();
        Hooks.delay(2);
        hrPage.ChooseTypeOfLeaveReviewer1();
        Hooks.delay(2);
        hrPage.ChooseTypeOfLeaveReviewer2();
        Hooks.delay(2);
        hrPage.BtnSelectTypeOfLeaveReviewer();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select reviewer type of leave");
    }

    @And("User checklist condition type of leave")
    public void user_checklist_condition_type_of_leave() {
        Hooks.delay(2);
        hrPage.ChecklistTypeOfLeave1();
        Hooks.delay(2);
        hrPage.ChecklistTypeOfLeave2();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User checklist condition type of leave");
    }

    @Then("User save type of leave data")
    public void user_save_type_of_leave_data() {
        Hooks.delay(1);
        hrPage.BtnSaveTypeOfLeave();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveTypeOfLeave();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save type of leave data");
    }

//Search Type of Leave by Type of Leave Name
    @When("User input name type of leave on search bar")
    public void user_name_type_of_leave_on_search_bar() {
        Hooks.delay(1);
        hrPage.SearchBarTypeOfLeave("Izin");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input name type of leave on search bar");
    }

    @Then("User get text name type of leave")
    public void user_get_text_name_type_of_leave() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtTypeOfLeaveName(), "Izin");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text name type of leave");
    }

//Edit Type of Leave Data
    @When("User click button edit type of leave")
    public void user_click_button_edit_type_of_leave() {
        Hooks.delay(2);
        hrPage.BtnEditTypeOfLeave();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit type of leave");
    }

    @And("User edit type of leave description")
    public void user_edit_type_of_leave_description() {
        Hooks.delay(2);
        hrPage.ClearInputTypeOfLeaveMaximumDays();
        Hooks.delay(2);
        hrPage.InputTypeOfLeaveMaximumDays("5");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit type of leave description");
    }

    @Then("User save edit type of leave data")
    public void user_save_edit_type_of_leave_data() {
        Hooks.delay(2);
        hrPage.BtnSaveEditTypeOfLeaveData();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditTypeOfLeaveData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit type of leave data");
    }

//Edit Overtime Data
    @When("User click tab master input overtime")
    public void user_click_tab_master_input_overtime() {
        Hooks.delay(2);
        hrPage.TabOvertimeMasterInput();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab master input overtime");
    }

    @And("User edit overtime expenses")
    public void user_edit_overtime_expenses() {
        Hooks.delay(2);
        hrPage.ClearInputOvertimeExpenses();
        Hooks.delay(2);
        hrPage.InputOvertimeExpenses("75500");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit overtime expenses");
    }

    @Then("User save edit overtime data")
    public void user_save_edit_overtime_data() {
        Hooks.delay(2);
        hrPage.BtnSaveEditOvertimeData();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditOvertimeData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit working hours data");
    }

//Create Mandatory Deductions
    @When("User click tab mandatory deductions")
    public void user_click_tab_mandatory_deductions() {
        Hooks.delay(1);
        hrPage.TabMandatoryDeductions();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab mandatory deductions");
    }

    @And("User click button create mandatory deductions")
    public void user_click_button_create_mandatory_deductions() {
        Hooks.delay(2);
        hrPage.BtnCreateMandatoryDeductions();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create mandatory deductions");
    }

    @And("User input name mandatory deductions")
    public void user_input_name_mandatory_deductions() {
        Hooks.delay(2);
        hrPage.InputNameMandatoryDeductions("Potongan Bulanan");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input name mandatory deductions");
    }

    @And("User select mandatory deductions deduction type")
    public void user_select_mandatory_deductions_deduction_type() {
        Hooks.delay(2);
        hrPage.BtnSelectDeductionType();
        Hooks.delay(2);
        hrPage.SelectDeductionType();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select mandatory deductions deduction type");
    }

    @And("User choose where mandatory deductions will be deducted from")
    public void user_choose_where_mandatory_deductions_will_be_deducted_from() {
        Hooks.delay(2);
        hrPage.SelectMandatoryDeductionDeductedFrom();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User choose where mandatory deductions will be deducted from");
    }

    @And("User add mandatory deductions data")
    public void user_add_mandatory_deductions_data() {
        Hooks.delay(2);
        hrPage.BtnAddMandatoryDeductionsData();
        Hooks.delay(2);
        hrPage.InputMandatoryDeductionsName("Potongan Makan");
        Hooks.delay(2);
        hrPage.InputMandatoryDeductionsValue("0");
        Hooks.delay(2);
        hrPage.InputMandatoryDeductionsBenefit("3000000");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User add mandatory deductions data");
    }

    @Then("User save mandatory deductions data")
    public void user_save_mandatory_deductions_data() {
        Hooks.delay(1);
        hrPage.BtnSaveMandatoryDeductions();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveMandatoryDeductions();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save mandatory deductions data");
    }

//Search Mandatory Deductions by ID Mandatory Deductions
    @When("User input id mandatory deductions on search bar")
    public void user_input_id_mandatory_deductions_on_search_bar() {
        Hooks.delay(1);
        hrPage.SearchBarMandatoryDeductions("PW02");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input id mandatory deductions on search bar");
    }

    @Then("User get text id mandatory deductions")
    public void user_get_text_id_mandatory_deductions() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtIdMandatoryDeductions(), "PW02");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text id mandatory deductions");
    }

//Add Employee Mandatory Deductions
    @When("User click button add employee mandatory deductions")
    public void user_click_button_add_employee_mandatory_deductions() {
        Hooks.delay(2);
        hrPage.BtnAddEmployeeMandatoryDeductions();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button add employee mandatory deductions");
    }

    @And("User select employee mandatory deductions")
    public void user_select_employee_mandatory_deductions() {
        Hooks.delay(2);
        hrPage.BtnSelectEmployeeMandatoryDeductions();
        Hooks.delay(2);
        hrPage.SearchBarAddEmployeeMandatoryDeductions("wildan");
        Hooks.delay(2);
        hrPage.ChooseEmployeeMandatoryDeductions();
        Hooks.delay(2);
        hrPage.SelectEmployeeMandatoryDeductions();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select employee mandatory deductions");
    }

    @Then("User save add employee mandatory deductions")
    public void user_save_add_employee_mandatory_deductions() {
        Hooks.delay(2);
        hrPage.BtnSaveAddEmployeeMandatoryDeductions();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveAddEmployeeMandatoryDeductions();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save add employee mandatory deductions");
    }

//Edit Mandatory Deductions Data
    @When("User click button edit mandatory deductions")
    public void user_click_button_edit_mandatory_deductions() {
        Hooks.delay(2);
        hrPage.SearchBarMandatoryDeductions("PW02");
        Hooks.delay(2);
        hrPage.BtnEditMandatoryDeductions();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit mandatory deductions");
    }

    @And("User edit name mandatory deductions")
    public void user_edit_name_mandatory_deductions() {
        Hooks.delay(2);
        hrPage.ClearInputNameMandatoryDeductions();
        Hooks.delay(2);
        hrPage.InputMandatoryDeductionsName("Potongan Kantor AALF");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit name mandatory deductions");
    }

    @Then("User save edit mandatory deductions data")
    public void user_save_edit_mandatory_deductions_data() {
        Hooks.delay(2);
        hrPage.BtnSaveEditMandatoryDeductionsData();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditMandatoryDeductionsData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit mandatory deductions data");
    }

//Create PPH21
    @When("User click tab pph21")
    public void user_click_tab_pph21() {
        Hooks.delay(1);
        hrPage.TabPph21();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab pph21");
    }

    @And("User click button create pph21")
    public void user_click_button_create_pph21() {
        Hooks.delay(2);
        hrPage.BtnCreatePph21();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create pph21");
    }

    @And("User input category pph21")
    public void user_input_category_pph21() {
        Hooks.delay(2);
        hrPage.InputCategoryPph21("C");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input category pph21");
    }

    @And("User choose where pph21 will be deducted from")
    public void user_choose_where_pph21_will_be_deducted_from() {
        Hooks.delay(2);
        hrPage.SelectPph21DeductedFrom();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User choose where pph21 will be deducted from");
    }

    @And("User input income range pph21")
    public void user_input_income_range_pph21() {
        Hooks.delay(2);
        hrPage.InputIncomeRangeFromPph21("5000000");
        Hooks.delay(2);
        hrPage.InputIncomeRangeToPph21("7500000");
        Hooks.delay(2);
        hrPage.InputIncomeRangeRateValuePph21("5");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input income range pph21");
    }

    @Then("User save pph21 data")
    public void user_save_pph21_data() {
        Hooks.delay(1);
        hrPage.BtnSavePph21();
        Hooks.delay(2);
        hrPage.BtnConfirmSavePph21();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save pph21 data");
    }

//Search PPH21 by Name PPH21
    @When("User input name pph21 on search bar")
    public void user_input_name_pph21_on_search_bar() {
        Hooks.delay(1);
        hrPage.SearchBarPph21("B");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input name pph21 on search bar");
    }

    @Then("User get text name pph21")
    public void user_get_text_name_pph21() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtNamePph21(), "B");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text name pph21");
    }

//Add Employee PPH21
    @When("User click button add employee pph21")
    public void user_click_button_add_employee_pph21() {
        Hooks.delay(2);
        hrPage.BtnAddEmployeePph21();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button add employee pph21");
    }

    @And("User select employee pph21")
    public void user_select_employee_pph21() {
        Hooks.delay(2);
        hrPage.BtnSelectEmployeePph21();
        Hooks.delay(2);
        hrPage.SearchBarAddEmployeePph21("wildan");
        Hooks.delay(2);
        hrPage.ChooseEmployeePph21();
        Hooks.delay(2);
        hrPage.SelectEmployeePph21();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select employee pph21");
    }

    @Then("User save add employee pph21")
    public void user_save_add_employee_pph21() {
        Hooks.delay(2);
        hrPage.BtnSaveAddEmployeePph21();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveAddEmployeeMPph21();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save add employee pph21");
    }

//Edit PPH21 Data
    @When("User click button edit pph21")
    public void user_click_button_edit_pph21() {
        Hooks.delay(2);
        hrPage.SearchBarPph21("B");
        Hooks.delay(2);
        hrPage.BtnEditPph21();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit pph21");
    }

    @And("User edit category pph21")
    public void user_edit_category_pph21() {
        Hooks.delay(2);
        hrPage.ClearInputCategoryPph21();
        Hooks.delay(2);
        hrPage.InputCategoryPph21("D");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit category pph21");
    }

    @Then("User save edit pph21 data")
    public void user_save_edit_pph21_data() {
        Hooks.delay(2);
        hrPage.BtnSaveEditPph21Data();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditPph21Data();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit pph21 data");
    }

//Enter HR Document Page
    @When("User click tab hr document")
    public void user_click_tab_hr_document() {
        Hooks.delay(1);
        hrPage.TabHrDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab hr document");
    }

    @Then("User get text title page hr document number")
    public void user_get_text_title_page_hr_document_number() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtHrDocument(), "Document Number");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page hr document number");
    }

//Create HR Document Number
    @When("User click button create hr document number")
    public void user_click_button_create_hr_document_number() {
        Hooks.delay(1);
        hrPage.BtnCreateHrDocumentNumber();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create hr document number");
    }

    @And("User input master document name hr document number")
    public void user_input_master_document_name_hr_document_number() {
        Hooks.delay(1);
        hrPage.InputHrMasterDocumentName("Surat Peringatan");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input master document name hr document number");
    }

    @And("User input format document number hr document number")
    public void user_input_format_document_number_hr_document_number() {
        Hooks.delay(1);
        hrPage.InputHrFormatDocumentNumber("xxxx/SP/MM/YYYY");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input format document number hr document number");
    }

    @Then("User save hr document number data")
    public void user_save_hr_document_number_data() {
        Hooks.delay(1);
        hrPage.BtnSaveHrDocumentNumber();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveHrDocumentNumber();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save hr document number data");
    }

//Edit HR Document Number Data
    @When("User click button edit hr document number")
    public void user_click_button_edit_hr_document_number() {
        Hooks.delay(2);
        hrPage.BtnEditHrDocumentNumber();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit hr document number");
    }

    @And("User edit master document name hr document number")
    public void user_edit_master_document_name_hr_document_number() {
        Hooks.delay(2);
        hrPage.ClearInputHrMasterDocumentName();
        Hooks.delay(2);
        hrPage.InputHrMasterDocumentName("Memorandums");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit master document name hr document number");
    }

    @Then("User save edit hr document number data")
    public void user_save_edit_hr_document_number_data() {
        Hooks.delay(2);
        hrPage.BtnSaveEditHrDocumentNumberData();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditHrDocumentNumberData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit hr document number data");
    }

//Delete HR Document Number
    @When("User click button delete hr document number")
    public void user_click_button_delete_hr_document_number() {
        Hooks.delay(2);
        hrPage.BtnDeleteHrDocumentNumber();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button delete hr document number");
    }

    @Then("User click button confirm delete hr document number")
    public void user_click_button_confirm_delete_hr_document_number() {
        Hooks.delay(2);
        hrPage.BtnConfirmDeleteHrDocumentNumber();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete hr document number");
    }

//Enter HR List Document Page
    @When("User click tab hr list document")
    public void user_click_tab_list_document() {
        Hooks.delay(1);
        hrPage.TabHrListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab hr list document");
    }

    @Then("User get text title page hr list document page")
    public void user_get_text_title_page_hr_list_document_page() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtHrListDocument(), "List Document");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page hr list document page");
    }

//Create HR List Document
    @When("User click button create hr list document")
    public void user_click_button_create_hr_list_document() {
        Hooks.delay(1);
        hrPage.BtnCreateHrListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create hr list document");
    }

    @And("User choose master document name hr list document")
    public void user_choose_master_document_name_hr_list_document() {
        Hooks.delay(1);
        hrPage.BtnSelectMasterDocumentNameHrListDocument();
        Hooks.delay(2);
        hrPage.SelectMasterDocumentNameHrListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User choose master document name hr list document");
    }

    @And("User input document name hr list document")
    public void user_input_document_name_hr_list_document() {
        Hooks.delay(1);
        hrPage.InputDocumentNameHrListDocument("Surat Keputusan MK");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input document name hr list document");
    }

    @Then("User save hr list document data")
    public void user_save_hr_list_document_data() {
        Hooks.delay(1);
        hrPage.BtnSaveHrListDocument();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveHrListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save hr list document data");
    }

//Upload document HR List Document
    @When("User click button upload hr list document")
    public void user_click_button_upload_hr_list_document() {
        Hooks.delay(1);
        hrPage.BtnUploadHrListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button upload hr list document");
    }

    @And("User choose file upload document hr list document")
    public void user_choose_file_upload_document_hr_list_document() {
        Hooks.delay(1);
        hrPage.BtnChooseFileHrListDocument("C:\\Users\\M1403QA\\Downloads\\Document RKPD 17-07-2024.pdf");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User choose file upload document hr list document");
    }

    @Then("User upload document hr list document")
    public void user_upload_document_hr_list_document() {
        Hooks.delay(1);
        hrPage.BtnSaveUploadHrListDocument();
        Hooks.delay(1);
        hrPage.BtnConfirmSaveUploadHrListDocument();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User upload document hr list document");
    }

//Edit HR List Document Data
    @When("User click button edit hr list document")
    public void user_click_button_edit_hr_list_document() {
        Hooks.delay(2);
        hrPage.BtnEditHrListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit hr list document");
    }

    @And("User edit document name hr list document")
    public void user_edit_document_name_hr_list_document() {
        Hooks.delay(2);
        hrPage.ClearInputDocumentNameHrListDocument();
        Hooks.delay(2);
        hrPage.InputDocumentNameHrListDocument("Test bung");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit document name hr list document");
    }

    @Then("User save edit hr list document data")
    public void user_save_edit_hr_list_document_data() {
        Hooks.delay(2);
        hrPage.BtnSaveEditHrListDocumentData();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditHrListDocumentData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit hr list document data");
    }

//Delete HR List Document
    @When("User click button delete hr list document")
    public void user_click_button_delete_hr_list_document() {
        Hooks.delay(2);
        hrPage.BtnDeleteHrListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button delete hr list document");
    }

    @Then("User click button confirm delete hr list document")
    public void user_click_button_confirm_delete_hr_list_document() {
        Hooks.delay(2);
        hrPage.BtnConfirmDeleteHrListDocument();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button confirm delete hr list document");
    }

//Enter HR Request Letter Page
    @When("User click tab hr request letter")
    public void User_click_tab_hr_request_letter() {
        Hooks.delay(1);
        hrPage.TabHrRequestLetter();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab hr request letter");
    }

    @Then("User get text title page hr request letter page")
    public void user_get_text_title_page_hr_request_letter_page() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtHrRequestLetter(), "Request Letter");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page hr request letter page");
    }

//Create HR Request Letter
    @When("User click button create hr request letter")
    public void user_click_button_create_hr_request_letter() {
        Hooks.delay(1);
        hrPage.BtnCreateHrRequestLetter();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button create hr request letter");
    }

    @And("User input start date hr request letter")
    public void user_input_start_date_hr_request_letter() {
        Hooks.delay(1);
        hrPage.BtnStartDateHrRequestLetter();
        Hooks.delay(2);
        hrPage.BtnSelectTodayStartDateHrRequestLetter();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input start date hr request letter");
    }

    @And("User input end date hr request letter")
    public void user_input_end_date_hr_request_letter() {
        Hooks.delay(1);
        hrPage.BtnEndDateHrRequestLetter();
        Hooks.delay(2);
        hrPage.BtnSelectTodayEndDateHrRequestLetter();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input end date hr request letter");
    }

    @And("User select region hr request letter")
    public void user_select_region_hr_request_letter() {
        Hooks.delay(1);
        hrPage.BtnSelectRegionHrRequestLetter();
        Hooks.delay(2);
        hrPage.SelectRegionHrRequestLetter();
        Hooks.delay(2);
        hrPage.BtnConfirmSelectRegionHrRequestLetter();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select region hr request letter");
    }

    @And("User input location hr request letter")
    public void user_input_location_hr_request_letter() {
        Hooks.delay(1);
        hrPage.InputLocationHrRequestLetter("Jakarta Selatan");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input location hr request letter");
    }

    @And("User input note hr request letter")
    public void user_input_note_hr_request_letter() {
        Hooks.delay(1);
        hrPage.InputNoteHrRequestLetter("Segera dilaksanakan");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note hr request letter");
    }

    @And("User select member on duty hr request letter")
    public void user_select_member_on_duty_hr_request_letter() {
        Hooks.delay(1);
        hrPage.BtnSelectTeamMemberOnDutyHrRequestLetter();
        Hooks.delay(2);
        hrPage.SelectTeamMemberOnDutyHrRequestLetter1();
        Hooks.delay(2);
        hrPage.SelectTeamMemberOnDutyHrRequestLetter2();
        Hooks.delay(2);
        hrPage.BtnSelectMemberOnDutyHrRequestLetter();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User select member on duty hr request letter");
    }

    @And("User checklist estimated expenditures hr request letter")
    public void user_checklist_estimated_expenditures_hr_request_letter() {
        Hooks.delay(1);
        hrPage.ChecklistEstimatedExpendituresHrRequestLetter();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User checklist estimated expenditures hr request letter");
    }

    @Then("User save hr request letter data")
    public void user_save_hr_request_letter_data() {
        Hooks.delay(1);
        hrPage.BtnSaveHrRequestLetter();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveHrRequestLetter();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save hr request letter data");
    }

//Edit HR Request Letter Data
    @When("User click button edit hr request letter")
    public void user_click_button_edit_hr_request_letter() {
        Hooks.delay(2);
        hrPage.BtnEditHrRequestLetter();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button edit hr request letter");
    }

    @And("User edit note hr request letter")
    public void user_edit_note_hr_request_letter() {
        Hooks.delay(2);
        hrPage.ClearInputNoteHrRequestLetter();
        Hooks.delay(2);
        hrPage.InputNoteHrRequestLetter("Test dulu bosku");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User edit note hr request letter");
    }

    @Then("User save edit hr request letter data")
    public void user_save_edit_hr_request_letter_data() {
        Hooks.delay(2);
        hrPage.BtnSaveEditHrRequestLetterData();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveEditHrRequestLetterData();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save edit hr request letter data");
    }

//Approval HR Request Letter
    @When("User click button approval hr request letter")
    public void user_click_button_approval_hr_request_letter() {
        Hooks.delay(2);
        hrPage.BtnApprovalHrRequestLetter();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button approval hr request letter");
    }

    @And("User choose approval hr request letter")
    public void user_choose_approval_hr_request_letter() {
        Hooks.delay(2);
        hrPage.BtnSelectApprovalHrRequestLetter();
        Hooks.delay(2);
        hrPage.SelectApprovalHrRequestLetter();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User choose approval hr request letter");
    }

    @And("User input note approval hr request letter")
    public void user_input_note_approval_hr_request_letter() {
        Hooks.delay(2);
        hrPage.InputNoteApprovalHrRequestLetter("Kerja bagus");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User input note approval hr request letter");
    }

    @Then("User save approval hr request letter")
    public void user_save_approval_hr_request_letter() {
        Hooks.delay(2);
        hrPage.BtnSaveApprovalHrRequestLetter();
        Hooks.delay(2);
        hrPage.BtnConfirmSaveApprovalHrRequestLetter();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User save approval hr request letter");
    }

//View Approved HR Request Letter
    @When("User click button view approved hr request letter")
    public void user_click_button_view_approved_hr_request_letter() {
        Hooks.delay(2);
        hrPage.BtnViewApprovedHrRequestLetter();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click button view approved hr request letter");
    }

    @And("User get text title page approved hr request letter")
    public void user_get_text_title_page_approved_hr_request_letter() {
        Hooks.delay(1);
        Assert.assertEquals(hrPage.getTxtViewApprovedHrRequestLetter(), "View Document Request Letter");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page approved hr request letter");
    }

    @Then("User back to hr request letter page")
    public void user_back_to_hr_request_letter_page() {
        Hooks.delay(2);
        hrPage.BtnBackViewApprovedHrRequestLetter();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User back to hr request letter page");
    }
}
