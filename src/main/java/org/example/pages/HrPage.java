package org.example.pages;

import org.example.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HrPage {
    private WebDriver driver;

    public HrPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[contains(@class,'nav-active duration-500 bg-secondary-01 svelte-24n6es')])[1]")
    WebElement tabHr;

    @FindBy(xpath = "(//h1[normalize-space()='Human Resources'])[1]")
    WebElement txtHr;

    @FindBy(xpath = "(//a[contains(@href,'/hr/absen')])[1]")
    WebElement tabAttendance;

    @FindBy(xpath = "(//h1[normalize-space()='Attendance'])[1]")
    WebElement txtAttendance;

    @FindBy(xpath = "(//input[@placeholder='Find employees'])[1]")
    WebElement inputEmployeeNameAttendance;

    @FindBy(xpath = "(//a[normalize-space()='Abdul Wafiy'])[1]")
    WebElement btnEmployeeNameAttendance;

    @FindBy(xpath = "(//li[normalize-space()='Abdul Wafiy'])[1]")
    WebElement txtEmployeeNameAttendancePage;

    @FindBy(xpath = "(//button[normalize-space()='Monitoring'])[1]")
    WebElement tabMonitoring;

    @FindBy(xpath = "(//li[normalize-space()='Monitoring'])[1]")
    WebElement txtMonitoringPage;

    @FindBy(xpath = "(//input[@placeholder='Search...'])[1]")
    WebElement inputEmployeeNameMonitoring;

    @FindBy(xpath = "(//p[normalize-space()='Junior Associate'])[1]")
    WebElement btnEmployeeNameMonitoring;

    @FindBy(xpath = "(//li[normalize-space()='Naomi Astrid Sridinanti Nababan'])[1]")
    WebElement txtEmployeeNameMonitoringPage;

    @FindBy(xpath = "(//span[normalize-space()='HR Report'])[1]")
    WebElement tabHrReport;

    @FindBy(xpath = "(//h1[normalize-space()='HR Report'])[1]")
    WebElement txtHrReportPage;

    @FindBy(xpath = "(//a[normalize-space()='EXCEL'])[1]")
    WebElement btnDownloadKpiHoReport;

    @FindBy(xpath = "(//button[normalize-space()='KPI HO Detail'])[1]")
    WebElement tabKpiHoDetail;

    @FindBy(xpath = "(//a[normalize-space()='EXCEL'])[1]")
    WebElement btnDownloadKpiHoDetailReport;

    @FindBy(xpath = "(//button[normalize-space()='Resume Daily Report'])[1]")
    WebElement tabResumeDailyReport;

    @FindBy(xpath = "(//a[normalize-space()='PDF'])[1]")
    WebElement btnDownloadResumeDailyReport;

    @FindBy(xpath = "(//button[normalize-space()='Master Document Number'])[1]")
    WebElement tabHrMasterDocumentNumber;

    @FindBy(xpath = "(//input[@id='month'])[1]")
    WebElement inputMonthHrMasterDocumentNumber;

    @FindBy(xpath = "(//a[normalize-space()='EXCEL'])[1]")
    WebElement btnDownloadHrMasterDocumentNumber;

    @FindBy(xpath = "(//span[normalize-space()='Overtime'])[1]")
    WebElement tabOvertime;

    @FindBy(xpath = "(//h1[normalize-space()='Overtime'])[1]")
    WebElement txtOvertimePage;

    @FindBy(xpath = "(//a[normalize-space()='Create Overtime'])[1]")
    WebElement btnCreateOvertime;

    @FindBy(xpath = "(//input[@placeholder='First date'])[1]")
    WebElement btnStartDateOvertime;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    WebElement btnSelectTodayStartDateOvertime;

    @FindBy(xpath = "(//input[contains(@placeholder,'End date')])[1]")
    WebElement btnEndDateOvertime;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    WebElement btnSelectTodayEndDateOvertime;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectAuthorOvertime;

    @FindBy(xpath = "(//div[contains(text(),'Agus Senoaji')])[1]")
    WebElement selectAuthorOvertime;

    @FindBy(xpath = "(//button[@class='btn bg-black variant-filled'])[1]")
    WebElement btnConfirmSelectAuthorOvertime;

    @FindBy(xpath = "(//button[normalize-space()='Upload'])[1]")
    WebElement btnUploadDocumentOvertime;

    @FindBy(xpath = "(//textarea[@id='description'])[1]")
    WebElement inputNoteOvertime;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveOvertime;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveOvertime;

    @FindBy(xpath = "(//a[@class='btn-icon btn-icon-sm'])[1]")
    WebElement btnEditOvertime;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditOvertime;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditOvertime;

    @FindBy(xpath = "(//a[contains(text(),'Approval')])[1]")
    WebElement btnApprovalOvertime;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnSelectApprovalOvertime;

    @FindBy(xpath = "(//option[@value='approve'])[1]")
    WebElement selectApprovalOvertime;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveApprovalOvertime;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveApprovalOvertime;

    @FindBy(xpath = "(//a[@class='btn-icon btn-icon-sm'])[1]")
    WebElement btnViewOvertime;

    @FindBy(xpath = "(//h1[normalize-space()='View Overtime'])[1]")
    WebElement txtViewOvertimePage;

    @FindBy(xpath = "(//button[normalize-space()='Back'])[1]")
    WebElement btnBackViewOvertimePage;

    @FindBy(xpath = "(//span[normalize-space()='Log User'])[1]")
    WebElement tabLogUser;

    @FindBy(xpath = "(//h1[normalize-space()='Log User'])[1]")
    WebElement txtLogUserPage;

    @FindBy(xpath = "(//select[@class='cursor-pointer rounded-xl'])[1]")
    WebElement btnFilterByLogUser;

    @FindBy(xpath = "(//option[@value='fbd3893b-4e13-11ee-8ddc-00163e01cb9b'])[1]")
    WebElement selectEmployeeFilterByLogUser;

    @FindBy(xpath = "(//small[contains(text(),'Agus Senoaji')])[1]")
    WebElement txtEmployeeNameFilterByLogUser;

    @FindBy(xpath = "(//a[normalize-space()='EXCEL'])[1]")
    WebElement btnDownloadExcelLogUser;

    @FindBy(xpath = "(//a[normalize-space()='PDF'])[1]")
    WebElement btnDownloadPdfLogUser;

    @FindBy(xpath = "(//button[normalize-space()='Workload'])[1]")
    WebElement tabWorkload;

    @FindBy(xpath = "(//h1[normalize-space()='Workload'])[1]")
    WebElement txtWorkloadPage;

    @FindBy(xpath = "(//a[normalize-space()='EXCEL'])[1]")
    WebElement btnDownloadExcelWorkload;

    @FindBy(xpath = "(//a[normalize-space()='PDF'])[1]")
    WebElement btnDownloadPdfWorkload;

    @FindBy(xpath = "(//span[normalize-space()='Leave Permission'])[1]")
    WebElement tabLeavePermission;

    @FindBy(xpath = "(//h1[normalize-space()='Leave Permission'])[1]")
    WebElement txtLeavePermissionPage;

    @FindBy(xpath = "(//a[normalize-space()='Create Leave Permission'])[1]")
    WebElement btnCreateLeavePermission;

    @FindBy(xpath = "(//button[normalize-space()='Search Type of Leave'])[1]")
    WebElement btnSearchTypeOfLeave;

    @FindBy(xpath = "(//div[contains(text(),'Izin')])[1]")
    WebElement selectTypeOfLeave;

    @FindBy(xpath = "(//button[@class='btn bg-black variant-filled'])[1]")
    WebElement btnConfirmSelectTypeOfLeave;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectAuthorLeavePermission;

    @FindBy(xpath = "(//div[contains(text(),'Amalia Hidayat')])[1]")
    WebElement selectAuthorLeavePermission;

    @FindBy(xpath = "(//button[@class='btn bg-black variant-filled'])[1]")
    WebElement btnConfirmSelectAuthorLeavePermission;

    @FindBy(xpath = "(//input[@placeholder='First date'])[1]")
    WebElement btnStartDateLeavePermission;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    WebElement btnSelectTodayStartDateLeavePermission;

    @FindBy(xpath = "(//input[contains(@placeholder,'End date')])[1]")
    WebElement btnEndDateLeavePermission;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    WebElement btnSelectTodayEndDateLeavePermission;

    @FindBy(xpath = "(//button[normalize-space()='Upload'])[1]")
    WebElement btnUploadDocumentLeavePermission;

    @FindBy(xpath = "(//textarea[@id='description'])[1]")
    WebElement inputNoteLeavePermission;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveLeavePermission;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveLeavePermission;

    @FindBy(xpath = "(//a[@class='btn-icon btn-icon-sm'])[1]")
    WebElement btnEditLeavePermission;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditLeavePermission;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditLeavePermission;

    @FindBy(xpath = "(//a[normalize-space()='Approval'])[1]")
    WebElement btnApprovalLeavePermission;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnSelectApprovalLeavePermission;

    @FindBy(xpath = "(//option[@value='approve'])[1]")
    WebElement selectApprovalLeavePermission;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveApprovalLeavePermission;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveApprovalLeavePermission;

    @FindBy(xpath = "(//a[@class='btn-icon btn-icon-sm'])[1]")
    WebElement btnViewApprovedLeavePermission;

    @FindBy(xpath = "(//h1[normalize-space()='View Leave Permission'])[1]")
    WebElement txtViewApprovedLeavePermissionPage;

    @FindBy(xpath = "(//button[normalize-space()='Back'])[1]")
    WebElement btnBackViewLeavePermissionPage;

    @FindBy(xpath = "(//button[normalize-space()='Joint Holiday'])[1]")
    WebElement tabJointHoliday;

    @FindBy(xpath = "(//li[normalize-space()='Joint Holiday'])[1]")
    WebElement txtJointHolidayPage;

    @FindBy(xpath = "(//a[normalize-space()='Create Joint Holiday'])[1]")
    WebElement btnCreateJointHoliday;

    @FindBy(xpath = "(//input[@placeholder='Date'])[1]")
    WebElement btnDateJointHoliday;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    WebElement btnSelectTodayDateJointHoliday;

    @FindBy(xpath = "(//input[@id='nm_departemen'])[1]")
    WebElement inputTitleJointHoliday;

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    WebElement btnReduceBalanceJointHoliday;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveJointHoliday;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveJointHoliday;

    @FindBy(xpath = "(//a[@class='btn-icon btn-icon-sm'])[1]")
    WebElement btnEditJointHoliday;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditJointHoliday;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditJointHoliday;

    @FindBy(xpath = "(//span[normalize-space()='Employee'])[1]")
    WebElement tabEmployee;

    @FindBy(xpath = "(//h1[normalize-space()='Employee'])[1]")
    WebElement txtEmployeePage;

    @FindBy(xpath = "(//input[@placeholder='\uD83D\uDD0D Search'])[1]")
    WebElement searchBarEmployee;

    @FindBy(xpath = "(//td[@data-key='nm'])[1]")
    WebElement txtEmployeeName;














    public void TabHr() { tabHr.click();}
    public String getTxtHr(){return txtHr.getText();}
    public void TabAttendance() { tabAttendance.click();}
    public String getTxtAttendance(){return txtAttendance.getText();}
    public void InputEmployeeNameAttendance(String inputEmployeeNameAttendance) { this.inputEmployeeNameAttendance.sendKeys(inputEmployeeNameAttendance);}
    public void BtnEmployeeNameAttendance() { btnEmployeeNameAttendance.click();}
    public String getTxtEmployeeNameAttendancePage(){return txtEmployeeNameAttendancePage.getText();}
    public void TabMonitoring() { tabMonitoring.click();}
    public String getTxtMonitoringPage(){return txtMonitoringPage.getText();}
    public void InputEmployeeNameMonitoring(String inputEmployeeNameMonitoring) { this.inputEmployeeNameMonitoring.sendKeys(inputEmployeeNameMonitoring);}
    public void BtnEmployeeNameMonitoring() { btnEmployeeNameMonitoring.click();}
    public String getTxtEmployeeNameMonitoringPage(){return txtEmployeeNameMonitoringPage.getText();}
    public void TabHrReport() { tabHrReport.click();}
    public String getTxtHrReportPage(){return txtHrReportPage.getText();}
    public void BtnDownloadKpiHoReport() { btnDownloadKpiHoReport.click();}
    public void TabKpiHoDetail() { tabKpiHoDetail.click();}
    public void BtnDownloadKpiHoDetailReport() { btnDownloadKpiHoDetailReport.click();}
    public void TabResumeDailyReport() { tabResumeDailyReport.click();}
    public void BtnDownloadResumeDailyReport() { btnDownloadResumeDailyReport.click();}
    public void TabHrMasterDocumentNumber() { tabHrMasterDocumentNumber.click();}
    public void InputMonthHrMasterDocumentNumber(String inputMonthHrMasterDocumentNumber) { this.inputMonthHrMasterDocumentNumber.sendKeys(inputMonthHrMasterDocumentNumber);}
    public void BtnDownloadHrMasterDocumentNumber() { btnDownloadHrMasterDocumentNumber.click();}
    public void TabOvertime() { tabOvertime.click();}
    public String getTxtOvertimePage(){return txtOvertimePage.getText();}
    public void BtnCreateOvertime() { btnCreateOvertime.click();}
    public void BtnStartDateOvertime() { btnStartDateOvertime.click();}
    public void BtnSelectTodayStartDateOvertime() { btnSelectTodayStartDateOvertime.click();}
    public void BtnEndDateOvertime() { btnEndDateOvertime.click();}
    public void BtnSelectTodayEndDateOvertime() { btnSelectTodayEndDateOvertime.click();}
    public void BtnSelectAuthorOvertime() { btnSelectAuthorOvertime.click();}
    public void SelectAuthorOvertime() { selectAuthorOvertime.click();}
    public void BtnConfirmSelectAuthorOvertime() { btnConfirmSelectAuthorOvertime.click();}
    public void BtnUploadDocumentOvertime(String btnUploadDocumentOvertime) { this.btnUploadDocumentOvertime.sendKeys(btnUploadDocumentOvertime);}
    public void InputNoteOvertime(String inputNoteOvertime) { this.inputNoteOvertime.sendKeys(inputNoteOvertime);}
    public void BtnSaveOvertime() { btnSaveOvertime.click();}
    public void BtnConfirmSaveOvertime() { btnConfirmSaveOvertime.click();}
    public void BtnEditOvertime() { btnEditOvertime.click();}
    public void ClearNoteOvertime() { inputNoteOvertime.clear();}
    public void BtnSaveEditOvertime() { btnSaveEditOvertime.click();}
    public void BtnConfirmSaveEditOvertime() { btnConfirmSaveEditOvertime.click();}
    public void BtnApprovalOvertime() { btnApprovalOvertime.click();}
    public void BtnSelectApprovalOvertime() { btnSelectApprovalOvertime.click();}
    public void SelectApprovalOvertime() { selectApprovalOvertime.click();}
    public void BtnSaveApprovalOvertime() { btnSaveApprovalOvertime.click();}
    public void BtnConfirmSaveApprovalOvertime() { btnConfirmSaveApprovalOvertime.click();}
    public void BtnViewOvertime() { btnViewOvertime.click();}
    public String getTxtViewOvertimePage(){return txtViewOvertimePage.getText();}
    public void BtnBackViewOvertimePage() { btnBackViewOvertimePage.click();}
    public void TabLogUser() { tabLogUser.click();}
    public String getTxtLogUserPage(){return txtLogUserPage.getText();}
    public void BtnFilterByLogUser() { btnFilterByLogUser.click();}
    public void SelectEmployeeFilterByLogUser() { selectEmployeeFilterByLogUser.click();}
    public String getTxtEmployeeNameFilterByLogUser(){return txtEmployeeNameFilterByLogUser.getText();}
    public void BtnDownloadExcelLogUser() { btnDownloadExcelLogUser.click();}
    public void BtnDownloadPdfLogUser() { btnDownloadPdfLogUser.click();}
    public void TabWorkload() { tabWorkload.click();}
    public String getTxtWorkloadPage(){return txtWorkloadPage.getText();}
    public void BtnDownloadExcelWorkload() { btnDownloadExcelWorkload.click();}
    public void BtnDownloadPdfWorkload() { btnDownloadPdfWorkload.click();}
    public void TabLeavePermission() { tabLeavePermission.click();}
    public String getTxtLeavePermissionPage(){return txtLeavePermissionPage.getText();}
    public void BtnCreateLeavePermission() { btnCreateLeavePermission.click();}
    public void BtnSearchTypeOfLeave() { btnSearchTypeOfLeave.click();}
    public void SelectTypeOfLeave() { selectTypeOfLeave.click();}
    public void BtnConfirmSelectTypeOfLeave() { btnConfirmSelectTypeOfLeave.click();}
    public void BtnSelectAuthorLeavePermission() { btnSelectAuthorLeavePermission.click();}
    public void SelectAuthorLeavePermission() { selectAuthorLeavePermission.click();}
    public void BtnConfirmSelectAuthorLeavePermission() { btnConfirmSelectAuthorLeavePermission.click();}
    public void BtnStartDateLeavePermission() { btnStartDateLeavePermission.click();}
    public void BtnSelectTodayStartDateLeavePermission() { btnSelectTodayStartDateLeavePermission.click();}
    public void BtnEndDateLeavePermission() { btnEndDateLeavePermission.click();}
    public void BtnSelectTodayEndDateLeavePermission() { btnSelectTodayEndDateLeavePermission.click();}
    public void BtnUploadDocumentLeavePermission(String btnUploadDocumentLeavePermission) { this.btnUploadDocumentLeavePermission.sendKeys(btnUploadDocumentLeavePermission);}
    public void InputNoteLeavePermission(String inputNoteLeavePermission) { this.inputNoteLeavePermission.sendKeys(inputNoteLeavePermission);}
    public void BtnSaveLeavePermission() { btnSaveLeavePermission.click();}
    public void BtnConfirmSaveLeavePermission() { btnConfirmSaveLeavePermission.click();}
    public void BtnEditLeavePermission() { btnEditLeavePermission.click();}
    public void ClearNoteLeavePermission() { inputNoteLeavePermission.clear();}
    public void BtnSaveEditLeavePermission() { btnSaveEditLeavePermission.click();}
    public void BtnConfirmSaveEditLeavePermission() { btnConfirmSaveEditLeavePermission.click();}
    public void BtnApprovalLeavePermission() { btnApprovalLeavePermission.click();}
    public void BtnSelectApprovalLeavePermission() { btnSelectApprovalLeavePermission.click();}
    public void SelectApprovalLeavePermission() { selectApprovalLeavePermission.click();}
    public void BtnSaveApprovalLeavePermission() { btnSaveApprovalLeavePermission.click();}
    public void BtnConfirmSaveApprovalLeavePermission() { btnConfirmSaveApprovalLeavePermission.click();}
    public void BtnViewApprovedLeavePermission() { btnViewApprovedLeavePermission.click();}
    public String getTxtViewApprovedLeavePermissionPage(){return txtViewApprovedLeavePermissionPage.getText();}
    public void BtnBackViewLeavePermissionPage() { btnBackViewLeavePermissionPage.click();}
    public void TabJointHoliday() { tabJointHoliday.click();}
    public String getTxtJointHolidayPage(){return txtJointHolidayPage.getText();}
    public void BtnCreateJointHoliday() { btnCreateJointHoliday.click();}
    public void BtnDateJointHoliday() { btnDateJointHoliday.click();}
    public void BtnSelectTodayDateJointHoliday() { btnSelectTodayDateJointHoliday.click();}
    public void InputTitleJointHoliday(String inputTitleJointHoliday) { this.inputTitleJointHoliday.sendKeys(inputTitleJointHoliday);}
    public void BtnReduceBalanceJointHoliday() { btnReduceBalanceJointHoliday.click();}
    public void BtnSaveJointHoliday() { btnSaveJointHoliday.click();}
    public void BtnConfirmSaveJointHoliday() { btnConfirmSaveJointHoliday.click();}
    public void BtnEditJointHoliday() { btnEditJointHoliday.click();}
    public void ClearTitleJointHoliday() { inputTitleJointHoliday.clear();}
    public void BtnSaveEditJointHoliday() { btnSaveEditJointHoliday.click();}
    public void BtnConfirmSaveEditJointHoliday() { btnConfirmSaveEditJointHoliday.click();}
    public void TabEmployee() { tabEmployee.click();}
    public String getTxtEmployeePage(){return txtEmployeePage.getText();}
    public void SearchBarEmployee(String searchBarEmployee) { this.searchBarEmployee.sendKeys(searchBarEmployee);}
    public String getTxtEmployeeName(){return txtEmployeeName.getText();}
}
