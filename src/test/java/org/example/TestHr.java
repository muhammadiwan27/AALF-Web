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
    public void user_click_button_approval_overime() {
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
}
