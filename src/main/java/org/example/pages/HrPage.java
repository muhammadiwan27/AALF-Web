package org.example.pages;

import org.example.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HrPage {
    public HrPage() {
        WebDriver driver = DriverSingleton.getDriver();
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

    @FindBy(xpath = "(//a[normalize-space()='Create Employee'])[1]")
    WebElement btnCreateEmployee;

    @FindBy(xpath = "(//input[@id='user'])[1]")
    WebElement inputUsernameEmployee;

    @FindBy(xpath = "(//input[@id='pass'])[1]")
    WebElement inputPasswordEmployee;

    @FindBy(xpath = "(//select[@id='perusahaan'])[1]")
    WebElement btnSelectCompanyEmployee;

    @FindBy(xpath = "(//option[@value='Ariyanto Arnaldo Law Firm'])[1]")
    WebElement selectCompanyEmployee;

    @FindBy(xpath = "(//select[@id='role'])[1]")
    WebElement btnChooseRoleEmployee;

    @FindBy(xpath = "(//option[@value='Partner'])[1]")
    WebElement chooseRoleEmployee;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveDataEmployee;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveDataEmployee;

    @FindBy(xpath = "(//a)[46]")
    WebElement btnEditEmployee;

    @FindBy(xpath = "(//button[normalize-space()='Personal Data'])[1]")
    WebElement tabPersonalDataEmployee;

    @FindBy(xpath = "(//input[@id='tempatLahir'])[1]")
    WebElement inputBirthPlaceEmployee;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveEditPersonalDataEmployee;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditPersonalDataEmployee;

    @FindBy(xpath = "(//button[normalize-space()='Family Data'])[1]")
    WebElement tabFamilyDataEmployee;

    @FindBy(xpath = "(//input[@id='ayah_nm'])[1]")
    WebElement inputFatherNameEmployee;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveEditFamilyDataEmployee;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditFamilyDataEmployee;

    @FindBy(xpath = "(//button[normalize-space()='Employee Data'])[1]")
    WebElement tabEmployeeDataEmployee;

    @FindBy(xpath = "(//input[@placeholder='Conversion value'])[1]")
    WebElement inputBaseSalaryEmployee;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveEditEmployeeDataEmployee;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditEmployeeDataEmployee;

    @FindBy(xpath = "(//button[normalize-space()='Employee Data'])[1]")
    WebElement tabOperationalDataEmployee;

    @FindBy(xpath = "(//select[@id='grade'])[1]")
    WebElement btnSelectGradeEmployee;

    @FindBy(xpath = "(//option[@value='GRA15'])[1]")
    WebElement selectGradeEmployee;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveEditOperationalDataEmployee;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditOperationalDataEmployee;

    @FindBy(xpath = "(//span[normalize-space()='Master Input'])[1]")
    WebElement tabMasterInput;

    @FindBy(xpath = "(//h1[normalize-space()='Master Input'])[1]")
    WebElement txtMasterInputPage;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreateCompany;

    @FindBy(xpath = "(//input[contains(@type,'file')])[2]")
    WebElement btnUploadLetterHeadCompany;

    @FindBy(xpath = "(//input[contains(@type,'file')])[3]")
    WebElement btnUploadFooterCompany;

    @FindBy(xpath = "(//input[@id='nm_perusaha'])[1]")
    WebElement inputCompanyName;

    @FindBy(xpath = "(//textarea[@placeholder='Address'])[1]")
    WebElement inputCompanyAddress;

    @FindBy(xpath = "(//input[@id='rt_rw'])[1]")
    WebElement inputCompanyRt;

    @FindBy(xpath = "(//input[@id='rt_rw'])[2]")
    WebElement inputCompanyRw;

    @FindBy(xpath = "(//select[@id='provinsi'])[1]")
    WebElement btnSelectCompanyProvince;

    @FindBy(xpath = "(//option[@value='SUMATERA BARAT'])[1]")
    WebElement selectCompanyProvince;

    @FindBy(xpath = "(//select[@id='kab_kota'])[1]")
    WebElement btnSelectCompanyCity;

    @FindBy(xpath = "(//option[@value='KOTA PADANG'])[1]")
    WebElement selectCompanyCity;

    @FindBy(xpath = "(//select[@id='kab_kota'])[1]")
    WebElement btnSelectCompanyDistrict;

    @FindBy(xpath = "(//option[@value='KOTA PADANG'])[1]")
    WebElement selectCompanyDistrict;

    @FindBy(xpath = "(//select[@id='kab_kota'])[1]")
    WebElement btnSelectCompanySubDistrict;

    @FindBy(xpath = "(//option[@value='KOTA PADANG'])[1]")
    WebElement selectCompanySubDistrict;

    @FindBy(xpath = "(//input[@id='kode_pos'])[1]")
    WebElement inputCompanyPostalCode;

    @FindBy(xpath = "(//input[@id='no_telp'])[1]")
    WebElement inputCompanyPhoneNumber;

    @FindBy(xpath = "(//input[@id='no_fax'])[1]")
    WebElement inputCompanyFaxNumber;

    @FindBy(xpath = "(//input[@id='email'])[1]")
    WebElement inputCompanyEmail;

    @FindBy(xpath = "(//input[@id='npwp'])[1]")
    WebElement inputCompanyNpwp;

    @FindBy(xpath = "(//input[@id='bpjs_sehat'])[1]")
    WebElement inputCompanyBpjsKesehatan;

    @FindBy(xpath = "(//input[@id='bpjs_tk'])[1]")
    WebElement inputCompanyBpjsTk;

    @FindBy(xpath = "(//input[@id='nm_bank'])[1]")
    WebElement inputCompanyBankName;

    @FindBy(xpath = "(//input[@id='no_rek'])[1]")
    WebElement inputCompanyAccountNumber;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveCompanyData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveCompanyData;

    @FindBy(xpath = "(//a[@class='btn-icon btn-icon-sm'])[1]")
    WebElement btnEditCompany;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveEditCompanyData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditCompanyData;

    @FindBy(xpath = "(//input[@placeholder='\uD83D\uDD0D Search'])[1]")
    WebElement searchBarCompany;

    @FindBy(xpath = "(//td[@data-key='idPerusahaan'])[1]")
    WebElement txtIdCompany;

    @FindBy(xpath = "(//button[normalize-space()='Office Location'])[1]")
    WebElement tabOfficeLocation;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreateOfficeLocation;

    @FindBy(xpath = "(//input[@id='nm_cabang'])[1]")
    WebElement inputOfficeLocationName;

    @FindBy(xpath = "(//textarea[@placeholder='Address '])[1]")
    WebElement inputOfficeAddress;

    @FindBy(xpath = "(//input[@id='rt_rw'])[1]")
    WebElement inputOfficeRt;

    @FindBy(xpath = "(//input[@id='rt_rw'])[2]")
    WebElement inputOfficeRw;

    @FindBy(xpath = "(//select[@id='provinsi'])[1]")
    WebElement btnSelectOfficeProvince;

    @FindBy(xpath = "(//option[@value='DKI JAKARTA'])[1]")
    WebElement selectOfficeProvince;

    @FindBy(xpath = "(//select[@id='kab_kota'])[1]")
    WebElement btnSelectOfficeCity;

    @FindBy(xpath = "(//option[@value='KOTA ADM. JAKARTA SELATAN'])[1]")
    WebElement selectOfficeCity;

    @FindBy(xpath = "(//select[@id='kecamatan'])[1]")
    WebElement btnSelectOfficeDistrict;

    @FindBy(xpath = "(//option[@value='Kebayoran Baru'])[1]")
    WebElement selectOfficeDistrict;

    @FindBy(xpath = "(//select[@id='kelurahan'])[1]")
    WebElement btnSelectOfficeSubDistrict;

    @FindBy(xpath = "(//option[@value='Melawai'])[1]")
    WebElement selectOfficeSubDistrict;

    @FindBy(xpath = "(//input[@placeholder='Search location'])[1]")
    WebElement inputOfficeLatitudeLongitude;

    @FindBy(xpath = "(//button[normalize-space()='Search'])[1]")
    WebElement btnSearchOfficeLatitudeLongitude;

    @FindBy(xpath = "(//input[@id='no_fax'])[1]")
    WebElement inputOfficeRadius;

    @FindBy(xpath = "(//input[@id='kode_pos'])[1]")
    WebElement inputOfficePostalCode;

    @FindBy(xpath = "(//input[@id='no_telp'])[1]")
    WebElement inputOfficePhoneNumber;

    @FindBy(xpath = "(//input[@id='no_fax'])[2]")
    WebElement inputOfficeFaxNumber;

    @FindBy(xpath = "(//input[@id='email'])[1]")
    WebElement inputOfficeEmailAddress;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveOfficeLocationData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveOfficeLocationData;

    @FindBy(xpath = "(//input[@placeholder='\uD83D\uDD0D Search'])[1]")
    WebElement searchBarOfficeLocation;

    @FindBy(xpath = "(//td[@data-key='idCabang'])[1]")
    WebElement txtIdOfficeLocation;

    @FindBy(xpath = "(//a[@class='btn-icon btn-icon-sm'])[1]")
    WebElement btnEditOfficeLocation;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveEditOfficeLocationData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditOfficeLocationData;

    @FindBy(xpath = "(//button[normalize-space()='Office Location'])[1]")
    WebElement tabDepartment;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreateDepartment;

    @FindBy(xpath = "(//input[@id='nm_cabang'])[1]")
    WebElement inputDepartmentName;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveDepartment;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveDepartment;

    @FindBy(xpath = "(//input[@placeholder='\uD83D\uDD0D Search'])[1]")
    WebElement searchBarDepartment;

    @FindBy(xpath = "(//td[normalize-space()='DEP02'])[1]")
    WebElement txtIdDepartment;

    @FindBy(xpath = "(//a[@class='btn-icon btn-icon-sm'])[1]")
    WebElement btnEditDepartment;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveEditDepartmentData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditDepartmentData;

    @FindBy(xpath = "(//button[normalize-space()='Position'])[1]")
    WebElement tabPosition;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreatePosition;

    @FindBy(xpath = "(//input[@id='nm_jabatan'])[1]")
    WebElement inputPositionName;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSavePosition;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSavePosition;

    @FindBy(xpath = "(//input[@placeholder='\uD83D\uDD0D Search'])[1]")
    WebElement searchBarPosition;

    @FindBy(xpath = "(//td[@data-key='idJabatan'])[1]")
    WebElement txtIdPosition;

    @FindBy(xpath = "(//a[@class='btn-icon btn-icon-sm'])[1]")
    WebElement btnEditPosition;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveEditPositionData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditPositionData;

    @FindBy(xpath = "(//button[normalize-space()='Region'])[1]")
    WebElement tabRegion;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreateRegion;

    @FindBy(xpath = "(//input[@id='nm_wilayah'])[1]")
    WebElement inputRegionName;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveRegion;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveRegion;

    @FindBy(xpath = "(//input[@placeholder='\uD83D\uDD0D Search'])[1]")
    WebElement searchBarRegion;

    @FindBy(xpath = "(//td[@data-key='idWilayah'])[1]")
    WebElement txtIdRegion;

    @FindBy(xpath = "(//a[@class='btn-icon btn-icon-sm'])[1]")
    WebElement btnEditRegion;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveEditRegionData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditRegionData;

    @FindBy(xpath = "(//button[@class='w-full btn btn-sm w-[200px] duration-500 variant-filled-warning'])[1]")
    WebElement tabSow;

    @FindBy(xpath = "(//button[@class='btn btn-sm duration-500 variant-filled-warning'])[1]")
    WebElement subTabSow;

    @FindBy(xpath = "(//a[@class='btn btn-sm bg-primary-01 w-[120px]'])[1]")
    WebElement btnCreateSow;

    @FindBy(xpath = "(//input[@id='note'])[1]")
    WebElement inputSowName;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveSow;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveSow;

    @FindBy(xpath = "(//input[@placeholder='\uD83D\uDD0D Search'])[1]")
    WebElement searchBarSow;

    @FindBy(xpath = "(//td[@data-key='sow'])[1]")
    WebElement txtSowName;

    @FindBy(xpath = "(//a[@class='btn-icon btn-icon-sm'])[1]")
    WebElement btnEditSow;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditSowData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditSowData;

    @FindBy(xpath = "(//button[normalize-space()='SOW Tree & Score'])[1]")
    WebElement subTabSowTreeAndScore;

    @FindBy(xpath = "(//a[normalize-space()='Create SOW Tree & Score'])[1]")
    WebElement btnCreateSowTreeAndScore;

    @FindBy(xpath = "(//select[@class='select select-sm'])[1]")
    WebElement selectSowLevel;

    @FindBy(xpath = "(//option[@value='1'])[1]")
    WebElement chooseSowLevel;

    @FindBy(xpath = "(//button[normalize-space()='Select Parent'])[1]")
    WebElement selectSowParent;

    @FindBy(xpath = "(//div[contains(@class,'listbox-label-content flex-1')][normalize-space()='Corporate'])[1]")
    WebElement chooseSowParent;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectSowParent;

    @FindBy(xpath = "(//button[normalize-space()='Select SOW'])[1]")
    WebElement selectSowName;

    @FindBy(xpath = "(//div[contains(text(),'Anatomy of crime')])[1]")
    WebElement chooseSowName;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectSowName;

    @FindBy(xpath = "(//input[@id='score'])[1]")
    WebElement inputSowScore;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveSowTreeAndScore;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveSowTreeAndScore;

    @FindBy(xpath = "(//small[normalize-space()='Diskusi / Penelitian (ID: 4)'])[1]")
    WebElement btnEditSowTreeAndScore;

    @FindBy(xpath = "(//select[@class='cursor-pointer rounded select select-sm'])[1]")
    WebElement selectEditScoreSowTreeAndScore;

    @FindBy(xpath = "(//option[@value='6'])[1]")
    WebElement chooseEditScoreSowTreeAndScore;

    @FindBy(xpath = "(//button[normalize-space()='Submit'])[1]")
    WebElement btnSubmitEditScoreSowTreeAndScore;

    @FindBy(xpath = "(//button[normalize-space()='Type of Client'])[1]")
    WebElement tabTypeOfClient;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreateTypeOfClient;

    @FindBy(xpath = "(//input[@id='note'])[1]")
    WebElement inputTypeOfClientName;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveTypeOfClient;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveTypeOfClient;

    @FindBy(xpath = "(//input[@placeholder='\uD83D\uDD0D Search'])[1]")
    WebElement searchBarTypeOfClient;

    @FindBy(xpath = "(//td[@data-key='clientType'])[1]")
    WebElement txtTypeOfClientName;

    @FindBy(xpath = "(//a[@class='btn-icon btn-icon-sm'])[1]")
    WebElement btnEditTypeOfClient;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditTypeOfClientData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditTypeOfClientData;

    @FindBy(xpath = "(//button[normalize-space()='Grade'])[1]")
    WebElement tabGrade;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreateGrade;

    @FindBy(xpath = "(//input[@id='nm_grade'])[1]")
    WebElement inputGradeName;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveGrade;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveGrade;

    @FindBy(xpath = "(//input[@placeholder='\uD83D\uDD0D Search'])[1]")
    WebElement searchBarGrade;

    @FindBy(xpath = "(//td[@data-key='idGrade'])[1]")
    WebElement txtIdGrade;

    @FindBy(xpath = "(//a[@class='btn-icon btn-icon-sm'])[1]")
    WebElement btnEditGrade;

    @FindBy(xpath = "(//input[@placeholder='Conversion value'])[1]")
    WebElement inputCourtMoneyGrade;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveEditCourtMoneyGradeData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditCourtMoneyGradeData;

    @FindBy(xpath = "(//button[normalize-space()='Allowance'])[1]")
    WebElement tabAllowanceGrade;

    @FindBy(xpath = "(//input[@placeholder='Amount'])[1]")
    WebElement inputAllowanceDalamKotaGrade;

    @FindBy(xpath = "(//input[@placeholder='Amount'])[2]")
    WebElement inputAllowanceLuarKotaGrade;

    @FindBy(xpath = "(//input[@placeholder='Amount'])[3]")
    WebElement inputAllowanceLuarNegeriGrade;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveEditAllowanceGradeData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditAllowanceGradeData;

    @FindBy(xpath = "(//button[normalize-space()='Meal Allowance'])[1]")
    WebElement tabMealAllowanceGrade;

    @FindBy(xpath = "(//input[@placeholder='Amount'])[1]")
    WebElement inputMealAllowanceDalamKotaGrade;

    @FindBy(xpath = "(//input[@placeholder='Amount'])[2]")
    WebElement inputMealAllowanceLuarKotaGrade;

    @FindBy(xpath = "(//input[@placeholder='Amount'])[3]")
    WebElement inputMealAllowanceLuarNegeriGrade;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveEditMealAllowanceGradeData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditMealAllowanceGradeData;

    @FindBy(xpath = "(//button[normalize-space()='Professional Fee'])[1]")
    WebElement tabProfessionalFeeGrade;

    @FindBy(xpath = "(//input[@placeholder='Amount'])[1]")
    WebElement inputProfessionalFeeDalamKotaGrade;

    @FindBy(xpath = "(//input[@placeholder='Amount'])[2]")
    WebElement inputProfessionalFeeLuarKotaGrade;

    @FindBy(xpath = "(//input[@placeholder='Amount'])[3]")
    WebElement inputProfessionalFeeLuarNegeriGrade;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveEditProfessionalFeeGradeData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditProfessionalFeeGradeData;

    @FindBy(xpath = "(//button[normalize-space()='Hotel'])[1]")
    WebElement tabHotelGrade;

    @FindBy(xpath = "(//input[@placeholder='Amount'])[1]")
    WebElement inputHotelDalamKotaGrade;

    @FindBy(xpath = "(//input[@placeholder='Amount'])[2]")
    WebElement inputHotelLuarKotaGrade;

    @FindBy(xpath = "(//input[@placeholder='Amount'])[3]")
    WebElement inputHotelLuarNegeriGrade;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveEditHotelGradeData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditHotelGradeData;

    @FindBy(xpath = "(//button[normalize-space()='Flight'])[1]")
    WebElement tabFlightGrade;

    @FindBy(xpath = "(//select[@id='kelas'])[1]")
    WebElement btnSelectFlightGrade;

    @FindBy(xpath = "(//option[@value='First Class'])[1]")
    WebElement chooseSelectFlightGrade;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveEditFlightGradeData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditFlightGradeData;

    @FindBy(xpath = "(//button[normalize-space()='Working Hours'])[1]")
    WebElement tabWorkingHours;

    @FindBy(xpath = "(//input[@id='nilaipotongan'])[1]")
    WebElement inputLateFeeAmountWorkingHours;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveEditWorkingHoursData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditWorkingHoursData;

    @FindBy(xpath = "(//button[normalize-space()='Type of Leave'])[1]")
    WebElement tabTypeOfLeave;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreateTypeOfLeave;

    @FindBy(xpath = "(//input[@id='note'])[1]")
    WebElement inputTypeOfLeaveName;

    @FindBy(xpath = "(//textarea[@id='description'])[1]")
    WebElement inputTypeOfLeaveDescription;

    @FindBy(xpath = "(//input[@id='maxDays'])[1]")
    WebElement inputTypeOfLeaveMaximumDays;

    @FindBy(xpath = "(//button[normalize-space()='Select Reviewers'])[1]")
    WebElement btnAddTypeOfLeaveReviewer;

    @FindBy(xpath = "//div[normalize-space()='Abdul Wafiy']")
    WebElement chooseTypeOfLeaveReviewer1;

    @FindBy(xpath = "//div[normalize-space()='Abdullatif']")
    WebElement chooseTypeOfLeaveReviewer2;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectTypeOfLeaveReviewer;

    @FindBy(xpath = "(//input[contains(@type,'checkbox')])[1]")
    WebElement checklistTypeOfLeave1;

    @FindBy(xpath = "(//input[contains(@type,'checkbox')])[1]")
    WebElement checklistTypeOfLeave2;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveTypeOfLeave;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveTypeOfLeave;

    @FindBy(xpath = "(//input[@placeholder='\uD83D\uDD0D Search'])[1]")
    WebElement searchBarTypeOfLeave;

    @FindBy(xpath = "(//p[normalize-space()='Izin'])[1]")
    WebElement txtTypeOfLeaveName;

    @FindBy(xpath = "(//a[@class='btn-icon btn-icon-sm'])[1]")
    WebElement btnEditTypeOfLeave;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditTypeOfLeaveData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditTypeOfLeaveData;

    @FindBy(xpath = "(//button[normalize-space()='Overtime'])[1]")
    WebElement tabOvertimeMasterInput;

    @FindBy(xpath = "(//input[@class='input input-sm w-full'])[1]")
    WebElement inputOvertimeExpenses;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveEditOvertimeData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditOvertimeData;

    @FindBy(xpath = "(//button[normalize-space()='Mandatory Deductions'])[1]")
    WebElement tabMandatoryDeductions;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreateMandatoryDeductions;

    @FindBy(xpath = "(//input[@id='bpjsJHT'])[1]")
    WebElement inputNameMandatoryDeductions;

    @FindBy(xpath = "(//select[@class='select select-sm'])[1]")
    WebElement btnSelectDeductionType;

    @FindBy(xpath = "(//option[@value='nilai'])[1]")
    WebElement selectDeductionType;

    @FindBy(xpath = "(//input[contains(@type,'checkbox')])[1]")
    WebElement selectMandatoryDeductionDeductedFrom;

    @FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
    WebElement btnAddMandatoryDeductionsData;

    @FindBy(xpath = "(//input[@id='potongan wajib nama'])[1]")
    WebElement inputMandatoryDeductionsName;

    @FindBy(xpath = "(//input[@placeholder='Mandatory Deduction Value'])[1]")
    WebElement inputMandatoryDeductionsValue;

    @FindBy(xpath = "(//input[@id='potongan wajib nama'])[1]")
    WebElement inputMandatoryDeductionsBenefit;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveMandatoryDeductions;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveMandatoryDeductions;

    @FindBy(xpath = "(//input[@placeholder='\uD83D\uDD0D Search'])[1]")
    WebElement searchBarMandatoryDeductions;

    @FindBy(xpath = "(//td[@data-key='idPotonganWajib'])[1]")
    WebElement txtIdMandatoryDeductions;

    @FindBy(xpath = "(//a[normalize-space()='Add Employee'])[1]")
    WebElement btnAddEmployeeMandatoryDeductions;

    @FindBy(xpath = "(//a[normalize-space()='Add Employee'])[1]")
    WebElement btnSelectEmployeeMandatoryDeductions;

    @FindBy(xpath = "(//input[@placeholder='Search employee'])[1]")
    WebElement searchBarAddEmployeeMandatoryDeductions;

    @FindBy(xpath = "(//div[@class='listbox-label-content flex-1 '])[1]")
    WebElement chooseEmployeeMandatoryDeductions;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement selectEmployeeMandatoryDeductions;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveAddEmployeeMandatoryDeductions;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveAddEmployeeMandatoryDeductions;

    @FindBy(xpath = "(//a[@class='btn-icon btn-icon-sm'])[1]")
    WebElement btnEditMandatoryDeductions;

    @FindBy(xpath = "(//a[@class='btn-icon btn-icon-sm'])[1]")
    WebElement btnSaveEditMandatoryDeductionsData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditMandatoryDeductionsData;

    @FindBy(xpath = "(//button[normalize-space()='PPH21'])[1]")
    WebElement tabPph21;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreatePph21;

    @FindBy(xpath = "(//input[@placeholder='Category PPH'])[1]")
    WebElement inputCategoryPph21;

    @FindBy(xpath = "(//input[contains(@type,'checkbox')])[1]")
    WebElement selectPph21DeductedFrom;

    @FindBy(xpath = "(//input[contains(@placeholder,'From')])[1]")
    WebElement inputIncomeRangeFromPph21;

    @FindBy(xpath = "(//input[contains(@placeholder,'From')])[3]")
    WebElement inputIncomeRangeToPph21;

    @FindBy(xpath = "(//input[@id='reate value'])[1]")
    WebElement inputIncomeRangeRateValuePph21;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSavePph21;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSavePph21;

    @FindBy(xpath = "(//input[@placeholder='\uD83D\uDD0D Search'])[1]")
    WebElement searchBarPph21;

    @FindBy(xpath = "(//td[@data-key='nmPph'])[1]")
    WebElement txtNamePph21;

    @FindBy(xpath = "(//a[normalize-space()='Add Employee'])[1]")
    WebElement btnAddEmployeePph21;

    @FindBy(xpath = "(//button[normalize-space()='Select Employee'])[1]")
    WebElement btnSelectEmployeePph21;

    @FindBy(xpath = "(//input[@placeholder='Search employee'])[1]")
    WebElement searchBarAddEmployeePph21;

    @FindBy(xpath = "(//div[@class='listbox-label-content flex-1 '])[1]")
    WebElement chooseEmployeePph21;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement selectEmployeePph21;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveAddEmployeePph21;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveAddEmployeeMPph21;

    @FindBy(xpath = "(//a[@class='btn-icon btn-icon-sm'])[1]")
    WebElement btnEditPph21;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveEditPph21Data;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditPph21Data;

    @FindBy(xpath = "(//span[contains(@class,'ml-2 py-1')][normalize-space()='Document'])[2]")
    WebElement tabHrDocument;

    @FindBy(xpath = "(//li[normalize-space()='Document Number'])[1]")
    WebElement txtHrDocument;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreateHrDocumentNumber;

    @FindBy(xpath = "(//input[@id='note'])[1]")
    WebElement inputHrMasterDocumentName;

    @FindBy(xpath = "(//input[@id='number'])[1]")
    WebElement inputHrFormatDocumentNumber;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveHrDocumentNumber;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveHrDocumentNumber;

    @FindBy(xpath = "(//a)[50]")
    WebElement btnEditHrDocumentNumber;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditHrDocumentNumberData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditHrDocumentNumberData;

    @FindBy(xpath = "(//button)[19]")
    WebElement btnDeleteHrDocumentNumber;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmDeleteHrDocumentNumber;

    @FindBy(xpath = "(//button[normalize-space()='List Document'])[1]")
    WebElement tabHrListDocument;

    @FindBy(xpath = "(//li[normalize-space()='List Document'])[1]")
    WebElement txtHrListDocument;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreateHrListDocument;

    @FindBy(xpath = "(//select[@class='select select-sm'])[1]")
    WebElement btnSelectMasterDocumentNameHrListDocument;

    @FindBy(xpath = "(//option[@value='Surat Keputusan'])[1]")
    WebElement selectMasterDocumentNameHrListDocument;

    @FindBy(xpath = "(//input[@id='keterangan'])[1]")
    WebElement inputDocumentNameHrListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveHrListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveHrListDocument;

    @FindBy(xpath = "(//a[contains(text(),'Upload')])[1]")
    WebElement btnUploadHrListDocument;

    @FindBy(xpath = "(//input[@id='dokumen'])[1]")
    WebElement btnChooseFileHrListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Upload'])[1]")
    WebElement btnSaveUploadHrListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveUploadHrListDocument;

    @FindBy(xpath = "(//a)[50]")
    WebElement btnEditHrListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditHrListDocumentData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditHrListDocumentData;

    @FindBy(xpath = "(//button)[19]")
    WebElement btnDeleteHrListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmDeleteHrListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Request Letter'])[1]")
    WebElement tabHrRequestLetter;

    @FindBy(xpath = "(//li[normalize-space()='Request Letter'])[1]")
    WebElement txtHrRequestLetter;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreateHrRequestLetter;

    @FindBy(xpath = "(//input[@placeholder='Start date'])[1]")
    WebElement btnStartDateHrRequestLetter;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    WebElement btnSelectTodayStartDateHrRequestLetter;

    @FindBy(xpath = "(//input[@placeholder='End date'])[1]")
    WebElement btnEndDateHrRequestLetter;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    WebElement btnSelectTodayEndDateHrRequestLetter;

    @FindBy(xpath = "(//button[normalize-space()='Select Region'])[1]")
    WebElement btnSelectRegionHrRequestLetter;

    @FindBy(xpath = "(//option[@value='Dalam Kota'])[1]")
    WebElement selectRegionHrRequestLetter;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnConfirmSelectRegionHrRequestLetter;

    @FindBy(xpath = "(//input[@id='lokasi'])[1]")
    WebElement inputLocationHrRequestLetter;

    @FindBy(xpath = "(//textarea[@placeholder='Note '])[1]")
    WebElement inputNoteHrRequestLetter;

    @FindBy(xpath = "(//button[normalize-space()='Select Team'])[1]")
    WebElement btnSelectTeamMemberOnDutyHrRequestLetter;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[4]/div[1]/div[2]/div[1]")
    WebElement selectTeamMemberOnDutyHrRequestLetter1;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[5]/div[1]/div[2]/div[1]/small[1]")
    WebElement selectTeamMemberOnDutyHrRequestLetter2;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectMemberOnDutyHrRequestLetter;

    @FindBy(xpath = "(//input[contains(@type,'checkbox')])[2]")
    WebElement checklistEstimatedExpendituresHrRequestLetter;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveHrRequestLetter;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveHrRequestLetter;

    @FindBy(xpath = "(//a)[48]")
    WebElement btnEditHrRequestLetter;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditHrRequestLetterData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditHrRequestLetterData;

    @FindBy(xpath = "(//a[normalize-space()='Approve'])[1]")
    WebElement btnApprovalHrRequestLetter;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnSelectApprovalHrRequestLetter;

    @FindBy(xpath = "(//option[@value='approve'])[1]")
    WebElement selectApprovalHrRequestLetter;

    @FindBy(xpath = "(//textarea[@placeholder='Type here'])[1]")
    WebElement inputNoteApprovalHrRequestLetter;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveApprovalHrRequestLetter;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveApprovalHrRequestLetter;

    @FindBy(xpath = "(//a)[47]")
    WebElement btnViewApprovedHrRequestLetter;

    @FindBy(xpath = "(//h1[normalize-space()='View Document Request Letter'])[1]")
    WebElement txtViewApprovedHrRequestLetter;

    @FindBy(xpath = "(//button[normalize-space()='Back'])[1]")
    WebElement btnBackViewApprovedHrRequestLetter;























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
    public void BtnCreateEmployee() { btnCreateEmployee.click();}
    public void InputUsernameEmployee(String inputUsernameEmployee) { this.inputUsernameEmployee.sendKeys(inputUsernameEmployee);}
    public void InputPasswordEmployee(String inputPasswordEmployee) { this.inputPasswordEmployee.sendKeys(inputPasswordEmployee);}
    public void BtnSelectCompanyEmployee() { btnSelectCompanyEmployee.click();}
    public void SelectCompanyEmployee() { selectCompanyEmployee.click();}
    public void BtnChooseRoleEmployee() { btnChooseRoleEmployee.click();}
    public void ChooseRoleEmployee() { chooseRoleEmployee.click();}
    public void BtnSaveDataEmployee() { btnSaveDataEmployee.click();}
    public void BtnConfirmSaveDataEmployee() { btnConfirmSaveDataEmployee.click();}
    public void BtnEditEmployee() { btnEditEmployee.click();}
    public void TabPersonalDataEmployee() { tabPersonalDataEmployee.click();}
    public void ClearBirthPlaceEmployee() { inputBirthPlaceEmployee.clear();}
    public void InputBirthPlaceEmployee(String inputBirthPlaceEmployee) { this.inputBirthPlaceEmployee.sendKeys(inputBirthPlaceEmployee);}
    public void BtnSaveEditPersonalDataEmployee() { btnSaveEditPersonalDataEmployee.click();}
    public void BtnConfirmSaveEditPersonalDataEmployee() { btnConfirmSaveEditPersonalDataEmployee.click();}
    public void TabFamilyDataEmployee() { tabFamilyDataEmployee.click();}
    public void ClearFatherNameEmployee() { inputFatherNameEmployee.clear();}
    public void InputFatherNameEmployee(String inputFatherNameEmployee) { this.inputFatherNameEmployee.sendKeys(inputFatherNameEmployee);}
    public void BtnSaveEditFamilyDataEmployee() { btnSaveEditFamilyDataEmployee.click();}
    public void BtnConfirmSaveEditFamilyDataEmployee() { btnConfirmSaveEditFamilyDataEmployee.click();}
    public void TabEmployeeDataEmployee() { tabEmployeeDataEmployee.click();}
    public void ClearBaseSalaryEmployee() { inputBaseSalaryEmployee.clear();}
    public void InputBaseSalaryEmployee(String inputBaseSalaryEmployee) { this.inputBaseSalaryEmployee.sendKeys(inputBaseSalaryEmployee);}
    public void BtnSaveEditEmployeeDataEmployee() { btnSaveEditEmployeeDataEmployee.click();}
    public void BtnConfirmSaveEditEmployeeDataEmployee() { btnConfirmSaveEditEmployeeDataEmployee.click();}
    public void TabOperationalDataEmployee() { tabOperationalDataEmployee.click();}
    public void BtnSelectGradeEmployee() { btnSelectGradeEmployee.click();}
    public void SelectGradeEmployee() { selectGradeEmployee.click();}
    public void BtnSaveEditOperationalDataEmployee() { btnSaveEditOperationalDataEmployee.click();}
    public void BtnConfirmSaveEditOperationalDataEmployee() { btnConfirmSaveEditOperationalDataEmployee.click();}
    public void TabMasterInput() { tabMasterInput.click();}
    public String getTxtMasterInputPage(){return txtMasterInputPage.getText();}
    public void BtnCreateCompany() { btnCreateCompany.click();}
    public void BtnUploadLetterHeadCompany(String btnUploadLetterHeadCompany) { this.btnUploadLetterHeadCompany.sendKeys(btnUploadLetterHeadCompany);}
    public void BtnUploadFooterCompany(String btnUploadFooterCompany) { this.btnUploadFooterCompany.sendKeys(btnUploadFooterCompany);}
    public void InputCompanyName(String inputCompanyName) { this.inputCompanyName.sendKeys(inputCompanyName);}
    public void InputCompanyAddress(String inputCompanyAddress) { this.inputCompanyAddress.sendKeys(inputCompanyAddress);}
    public void InputCompanyRt(String inputCompanyRt) { this.inputCompanyRt.sendKeys(inputCompanyRt);}
    public void InputCompanyRw(String inputCompanyRw) { this.inputCompanyRw.sendKeys(inputCompanyRw);}
    public void BtnSelectCompanyProvince() { btnSelectCompanyProvince.click();}
    public void SelectCompanyProvince() { selectCompanyProvince.click();}
    public void BtnSelectCompanyCity() { btnSelectCompanyCity.click();}
    public void SelectCompanyCity() { selectCompanyCity.click();}
    public void BtnSelectCompanyDistrict() { btnSelectCompanyDistrict.click();}
    public void SelectCompanyDistrict() { selectCompanyDistrict.click();}
    public void BtnSelectCompanySubDistrict() { btnSelectCompanySubDistrict.click();}
    public void SelectCompanySubDistrict() { selectCompanySubDistrict.click();}
    public void InputCompanyPostalCode(String inputCompanyPostalCode) { this.inputCompanyPostalCode.sendKeys(inputCompanyPostalCode);}
    public void InputCompanyPhoneNumber(String inputCompanyPhoneNumber) { this.inputCompanyPhoneNumber.sendKeys(inputCompanyPhoneNumber);}
    public void InputCompanyFaxNumber(String inputCompanyFaxNumber) { this.inputCompanyFaxNumber.sendKeys(inputCompanyFaxNumber);}
    public void InputCompanyEmail(String inputCompanyEmail) { this.inputCompanyEmail.sendKeys(inputCompanyEmail);}
    public void InputCompanyNpwp(String inputCompanyNpwp) { this.inputCompanyNpwp.sendKeys(inputCompanyNpwp);}
    public void InputCompanyBpjsKesehatan(String inputCompanyBpjsKesehatan) { this.inputCompanyBpjsKesehatan.sendKeys(inputCompanyBpjsKesehatan);}
    public void InputCompanyBpjsTk(String inputCompanyBpjsTk) { this.inputCompanyBpjsTk.sendKeys(inputCompanyBpjsTk);}
    public void InputCompanyBankName(String inputCompanyBankName) { this.inputCompanyBankName.sendKeys(inputCompanyBankName);}
    public void InputCompanyAccountNumber(String inputCompanyAccountNumber) { this.inputCompanyAccountNumber.sendKeys(inputCompanyAccountNumber);}
    public void BtnSaveCompanyData() { btnSaveCompanyData.click();}
    public void BtnConfirmSaveCompanyData() { btnConfirmSaveCompanyData.click();}
    public void BtnEditCompany() { btnEditCompany.click();}
    public void BtnSaveEditCompanyData() { btnSaveEditCompanyData.click();}
    public void BtnConfirmSaveEditCompanyData() { btnConfirmSaveEditCompanyData.click();}
    public void SearchBarCompany(String searchBarCompany) { this.searchBarCompany.sendKeys(searchBarCompany);}
    public String getTxtIdCompany(){return txtIdCompany.getText();}
    public void TabOfficeLocation() { tabOfficeLocation.click();}
    public void BtnCreateOfficeLocation() { btnCreateOfficeLocation.click();}
    public void InputOfficeLocationName(String inputOfficeLocationName) { this.inputOfficeLocationName.sendKeys(inputOfficeLocationName);}
    public void InputOfficeAddress(String inputOfficeAddress) { this.inputOfficeAddress.sendKeys(inputOfficeAddress);}
    public void InputOfficeRt(String inputOfficeRt) { this.inputOfficeRt.sendKeys(inputOfficeRt);}
    public void InputOfficeRw(String inputOfficeRw) { this.inputOfficeRw.sendKeys(inputOfficeRw);}
    public void BtnSelectOfficeProvince() { btnSelectOfficeProvince.click();}
    public void SelectOfficeProvince() { selectOfficeProvince.click();}
    public void BtnSelectOfficeCity() { btnSelectOfficeCity.click();}
    public void SelectOfficeCity() { selectOfficeCity.click();}
    public void BtnSelectOfficeDistrict() { btnSelectOfficeDistrict.click();}
    public void SelectOfficeDistrict() { selectOfficeDistrict.click();}
    public void BtnSelectOfficeSubDistrict() { btnSelectOfficeSubDistrict.click();}
    public void SelectOfficeSubDistrict() { selectOfficeSubDistrict.click();}
    public void InputOfficeLatitudeLongitude(String inputOfficeLatitudeLongitude) { this.inputOfficeLatitudeLongitude.sendKeys(inputOfficeLatitudeLongitude);}
    public void BtnSearchOfficeLatitudeLongitude() { btnSearchOfficeLatitudeLongitude.click();}
    public void InputOfficeRadius(String inputOfficeRadius) { this.inputOfficeRadius.sendKeys(inputOfficeRadius);}
    public void InputOfficePostalCode(String inputOfficePostalCode) { this.inputOfficePostalCode.sendKeys(inputOfficePostalCode);}
    public void InputOfficePhoneNumber(String inputOfficePhoneNumber) { this.inputOfficePhoneNumber.sendKeys(inputOfficePhoneNumber);}
    public void InputOfficeFaxNumber(String inputOfficeFaxNumber) { this.inputOfficeFaxNumber.sendKeys(inputOfficeFaxNumber);}
    public void InputOfficeEmailAddress(String inputOfficeEmailAddress) { this.inputOfficeEmailAddress.sendKeys(inputOfficeEmailAddress);}
    public void BtnSaveOfficeLocationData() { btnSaveOfficeLocationData.click();}
    public void BtnConfirmSaveOfficeLocationData() { btnConfirmSaveOfficeLocationData.click();}
    public void SearchBarOfficeLocation(String searchBarOfficeLocation) { this.searchBarOfficeLocation.sendKeys(searchBarOfficeLocation);}
    public String getTxtIdOfficeLocation(){return txtIdOfficeLocation.getText();}
    public void BtnEditOfficeLocation() { btnEditOfficeLocation.click();}
    public void ClearInputOfficePhoneNumber() { inputOfficePhoneNumber.clear();}
    public void BtnSaveEditOfficeLocationData() { btnSaveEditOfficeLocationData.click();}
    public void BtnConfirmSaveEditOfficeLocationData() { btnConfirmSaveEditOfficeLocationData.click();}
    public void TabDepartment() { tabDepartment.click();}
    public void BtnCreateDepartment() { btnCreateDepartment.click();}
    public void InputDepartmentName(String inputDepartmentName) { this.inputDepartmentName.sendKeys(inputDepartmentName);}
    public void BtnSaveDepartment() { btnSaveDepartment.click();}
    public void BtnConfirmSaveDepartment() { btnConfirmSaveDepartment.click();}
    public void SearchBarDepartment(String searchBarDepartment) { this.searchBarDepartment.sendKeys(searchBarDepartment);}
    public String getTxtIdDepartment(){return txtIdDepartment.getText();}
    public void BtnEditDepartment() { btnEditDepartment.click();}
    public void ClearInputDepartmentName() { inputDepartmentName.clear();}
    public void BtnSaveEditDepartmentData() { btnSaveEditDepartmentData.click();}
    public void BtnConfirmSaveEditDepartmentData() { btnConfirmSaveEditDepartmentData.click();}
    public void TabPosition() { tabPosition.click();}
    public void BtnCreatePosition() { btnCreatePosition.click();}
    public void InputPositionName(String inputPositionName) { this.inputPositionName.sendKeys(inputPositionName);}
    public void BtnSavePosition() { btnSavePosition.click();}
    public void BtnConfirmSavePosition() { btnConfirmSavePosition.click();}
    public void SearchBarPosition(String searchBarPosition) { this.searchBarPosition.sendKeys(searchBarPosition);}
    public String getTxtIdPosition(){return txtIdPosition.getText();}
    public void BtnEditPosition() { btnEditPosition.click();}
    public void ClearInputPositionName() { inputPositionName.clear();}
    public void BtnSaveEditPositionData() { btnSaveEditPositionData.click();}
    public void BtnConfirmSaveEditPositionData() { btnConfirmSaveEditPositionData.click();}
    public void TabRegion() { tabRegion.click();}
    public void BtnCreateRegion() { btnCreateRegion.click();}
    public void InputRegionName(String inputRegionName) { this.inputRegionName.sendKeys(inputRegionName);}
    public void BtnSaveRegion() { btnSaveRegion.click();}
    public void BtnConfirmSaveRegion() { btnConfirmSaveRegion.click();}
    public void SearchBarRegion(String searchBarRegion) { this.searchBarRegion.sendKeys(searchBarRegion);}
    public String getTxtIdRegion(){return txtIdRegion.getText();}
    public void BtnEditRegion() { btnEditRegion.click();}
    public void ClearInputRegionName() { inputRegionName.clear();}
    public void BtnSaveEditRegionData() { btnSaveEditRegionData.click();}
    public void BtnConfirmSaveEditRegionData() { btnConfirmSaveEditRegionData.click();}
    public void TabSow() { tabSow.click();}
    public void SubTabSow() { subTabSow.click();}
    public void BtnCreateSow() { btnCreateSow.click();}
    public void InputSowName(String inputSowName) { this.inputSowName.sendKeys(inputSowName);}
    public void BtnSaveSow() { btnSaveSow.click();}
    public void BtnConfirmSaveSow() { btnConfirmSaveSow.click();}
    public void SearchBarSow(String searchBarSow) { this.searchBarSow.sendKeys(searchBarSow);}
    public String getTxtSowName(){return txtSowName.getText();}
    public void BtnEditSow() { btnEditSow.click();}
    public void ClearInputSowName() { inputSowName.clear();}
    public void BtnSaveEditSowData() { btnSaveEditSowData.click();}
    public void BtnConfirmSaveEditSowData() { btnConfirmSaveEditSowData.click();}
    public void SubTabSowTreeAndScore() { subTabSowTreeAndScore.click();}
    public void BtnCreateSowTreeAndScore() { btnCreateSowTreeAndScore.click();}
    public void SelectSowLevel() { selectSowLevel.click();}
    public void ChooseSowLevel() { chooseSowLevel.click();}
    public void SelectSowParent() { selectSowParent.click();}
    public void ChooseSowParent() { chooseSowParent.click();}
    public void BtnSelectSowParent() { btnSelectSowParent.click();}
    public void SelectSowName() { selectSowName.click();}
    public void ChooseSowName() { chooseSowName.click();}
    public void BtnSelectSowName() { btnSelectSowName.click();}
    public void InputSowScore(String inputSowScore) { this.inputSowScore.sendKeys(inputSowScore);}
    public void BtnSaveSowTreeAndScore() { btnSaveSowTreeAndScore.click();}
    public void BtnConfirmSaveSowTreeAndScore() { btnConfirmSaveSowTreeAndScore.click();}
    public void BtnEditSowTreeAndScore() { btnEditSowTreeAndScore.click();}
    public void SelectEditScoreSowTreeAndScore() { selectEditScoreSowTreeAndScore.click();}
    public void ChooseEditScoreSowTreeAndScore() { chooseEditScoreSowTreeAndScore.click();}
    public void BtnSubmitEditScoreSowTreeAndScore() { btnSubmitEditScoreSowTreeAndScore.click();}
    public void TabTypeOfClient() { tabTypeOfClient.click();}
    public void BtnCreateTypeOfClient() { btnCreateTypeOfClient.click();}
    public void InputTypeOfClientName(String inputTypeOfClientName) { this.inputTypeOfClientName.sendKeys(inputTypeOfClientName);}
    public void BtnSaveTypeOfClient() { btnSaveTypeOfClient.click();}
    public void BtnConfirmSaveTypeOfClient() { btnConfirmSaveTypeOfClient.click();}
    public void SearchBarTypeOfClient(String searchBarTypeOfClient) { this.searchBarTypeOfClient.sendKeys(searchBarTypeOfClient);}
    public String getTxtTypeOfClientName(){return txtTypeOfClientName.getText();}
    public void BtnEditTypeOfClient() { btnEditTypeOfClient.click();}
    public void ClearInputTypeOfClientName() { inputTypeOfClientName.clear();}
    public void BtnSaveEditTypeOfClientData() { btnSaveEditTypeOfClientData.click();}
    public void BtnConfirmSaveEditTypeOfClientData() { btnConfirmSaveEditTypeOfClientData.click();}
    public void TabGrade() { tabGrade.click();}
    public void BtnCreateGrade() { btnCreateGrade.click();}
    public void InputGradeName(String inputGradeName) { this.inputGradeName.sendKeys(inputGradeName);}
    public void BtnSaveGrade() { btnSaveGrade.click();}
    public void BtnConfirmSaveGrade() { btnConfirmSaveGrade.click();}
    public void SearchBarGrade(String searchBarGrade) { this.searchBarGrade.sendKeys(searchBarGrade);}
    public String getTxtIdGrade(){return txtIdGrade.getText();}
    public void BtnEditGrade() { btnEditGrade.click();}
    public void InputCourtMoneyGrade(String inputCourtMoneyGrade) { this.inputCourtMoneyGrade.sendKeys(inputCourtMoneyGrade);}
    public void BtnSaveEditCourtMoneyGradeData() { btnSaveEditCourtMoneyGradeData.click();}
    public void BtnConfirmSaveEditCourtMoneyGradeData() { btnConfirmSaveEditCourtMoneyGradeData.click();}
    public void TabAllowanceGrade() { tabAllowanceGrade.click();}
    public void InputAllowanceDalamKotaGrade(String inputAllowanceDalamKotaGrade) { this.inputAllowanceDalamKotaGrade.sendKeys(inputAllowanceDalamKotaGrade);}
    public void InputAllowanceLuarKotaGrade(String inputAllowanceLuarKotaGrade) { this.inputAllowanceLuarKotaGrade.sendKeys(inputAllowanceLuarKotaGrade);}
    public void InputAllowanceLuarNegeriGrade(String inputAllowanceLuarNegeriGrade) { this.inputAllowanceLuarNegeriGrade.sendKeys(inputAllowanceLuarNegeriGrade);}
    public void BtnSaveEditAllowanceGradeData() { btnSaveEditAllowanceGradeData.click();}
    public void BtnConfirmSaveEditAllowanceGradeData() { btnConfirmSaveEditAllowanceGradeData.click();}
    public void TabMealAllowanceGrade() { tabMealAllowanceGrade.click();}
    public void InputMealAllowanceDalamKotaGrade(String inputMealAllowanceDalamKotaGrade) { this.inputMealAllowanceDalamKotaGrade.sendKeys(inputMealAllowanceDalamKotaGrade);}
    public void InputMealAllowanceLuarKotaGrade(String inputMealAllowanceLuarKotaGrade) { this.inputMealAllowanceLuarKotaGrade.sendKeys(inputMealAllowanceLuarKotaGrade);}
    public void InputMealAllowanceLuarNegeriGrade(String inputMealAllowanceLuarNegeriGrade) { this.inputMealAllowanceLuarNegeriGrade.sendKeys(inputMealAllowanceLuarNegeriGrade);}
    public void BtnSaveEditMealAllowanceGradeData() { btnSaveEditMealAllowanceGradeData.click();}
    public void BtnConfirmSaveEditMealAllowanceGradeData() { btnConfirmSaveEditMealAllowanceGradeData.click();}
    public void TabProfessionalFeeGrade() { tabProfessionalFeeGrade.click();}
    public void InputProfessionalFeeDalamKotaGrade(String inputProfessionalFeeDalamKotaGrade) { this.inputProfessionalFeeDalamKotaGrade.sendKeys(inputProfessionalFeeDalamKotaGrade);}
    public void InputProfessionalFeeLuarKotaGrade(String inputProfessionalFeeLuarKotaGrade) { this.inputProfessionalFeeLuarKotaGrade.sendKeys(inputProfessionalFeeLuarKotaGrade);}
    public void InputProfessionalFeeLuarNegeriGrade(String inputProfessionalFeeLuarNegeriGrade) { this.inputProfessionalFeeLuarNegeriGrade.sendKeys(inputProfessionalFeeLuarNegeriGrade);}
    public void BtnSaveEditProfessionalFeeGradeData() { btnSaveEditProfessionalFeeGradeData.click();}
    public void BtnConfirmSaveEditProfessionalFeeGradeData() { btnConfirmSaveEditProfessionalFeeGradeData.click();}
    public void TabHotelGrade() { tabHotelGrade.click();}
    public void InputHotelDalamKotaGrade(String inputHotelDalamKotaGrade) { this.inputHotelDalamKotaGrade.sendKeys(inputHotelDalamKotaGrade);}
    public void InputHotelLuarKotaGrade(String inputHotelLuarKotaGrade) { this.inputHotelLuarKotaGrade.sendKeys(inputHotelLuarKotaGrade);}
    public void InputHotelLuarNegeriGrade(String inputHotelLuarNegeriGrade) { this.inputHotelLuarNegeriGrade.sendKeys(inputHotelLuarNegeriGrade);}
    public void BtnSaveEditHotelGradeData() { btnSaveEditHotelGradeData.click();}
    public void BtnConfirmSaveEditHotelGradeData() { btnConfirmSaveEditHotelGradeData.click();}
    public void TabFlightGrade() { tabFlightGrade.click();}
    public void BtnSelectFlightGrade() { btnSelectFlightGrade.click();}
    public void ChooseSelectFlightGrade() { chooseSelectFlightGrade.click();}
    public void BtnSaveEditFlightGradeData() { btnSaveEditFlightGradeData.click();}
    public void BtnConfirmSaveEditFlightGradeData() { btnConfirmSaveEditFlightGradeData.click();}
    public void TabWorkingHours() { tabWorkingHours.click();}
    public void ClearInputLateFeeAmountWorkingHours() { inputLateFeeAmountWorkingHours.clear();}
    public void InputLateFeeAmountWorkingHours(String inputLateFeeAmountWorkingHours) { this.inputLateFeeAmountWorkingHours.sendKeys(inputLateFeeAmountWorkingHours);}
    public void BtnSaveEditWorkingHoursData() { btnSaveEditWorkingHoursData.click();}
    public void BtnConfirmSaveEditWorkingHoursData() { btnConfirmSaveEditWorkingHoursData.click();}
    public void TabTypeOfLeave() { tabTypeOfLeave.click();}
    public void BtnCreateTypeOfLeave() { btnCreateTypeOfLeave.click();}
    public void InputTypeOfLeaveName(String inputTypeOfLeaveName) { this.inputTypeOfLeaveName.sendKeys(inputTypeOfLeaveName);}
    public void InputTypeOfLeaveDescription(String inputTypeOfLeaveDescription) { this.inputTypeOfLeaveDescription.sendKeys(inputTypeOfLeaveDescription);}
    public void InputTypeOfLeaveMaximumDays(String inputTypeOfLeaveMaximumDays) { this.inputTypeOfLeaveMaximumDays.sendKeys(inputTypeOfLeaveMaximumDays);}
    public void BtnAddTypeOfLeaveReviewer() { btnAddTypeOfLeaveReviewer.click();}
    public void ChooseTypeOfLeaveReviewer1() { chooseTypeOfLeaveReviewer1.click();}
    public void ChooseTypeOfLeaveReviewer2() { chooseTypeOfLeaveReviewer2.click();}
    public void BtnSelectTypeOfLeaveReviewer() { btnSelectTypeOfLeaveReviewer.click();}
    public void ChecklistTypeOfLeave1() { checklistTypeOfLeave1.click();}
    public void ChecklistTypeOfLeave2() { checklistTypeOfLeave2.click();}
    public void BtnSaveTypeOfLeave() { btnSaveTypeOfLeave.click();}
    public void BtnConfirmSaveTypeOfLeave() { btnConfirmSaveTypeOfLeave.click();}
    public void SearchBarTypeOfLeave(String searchBarTypeOfLeave) { this.searchBarTypeOfLeave.sendKeys(searchBarTypeOfLeave);}
    public String getTxtTypeOfLeaveName(){return txtTypeOfLeaveName.getText();}
    public void BtnEditTypeOfLeave() { btnEditTypeOfLeave.click();}
    public void ClearInputTypeOfLeaveMaximumDays() { inputTypeOfLeaveMaximumDays.clear();}
    public void BtnSaveEditTypeOfLeaveData() { btnSaveEditTypeOfLeaveData.click();}
    public void BtnConfirmSaveEditTypeOfLeaveData() { btnConfirmSaveEditTypeOfLeaveData.click();}
    public void TabOvertimeMasterInput() { tabOvertimeMasterInput.click();}
    public void ClearInputOvertimeExpenses() { inputOvertimeExpenses.clear();}
    public void InputOvertimeExpenses(String inputOvertimeExpenses) { this.inputOvertimeExpenses.sendKeys(inputOvertimeExpenses);}
    public void BtnSaveEditOvertimeData() { btnSaveEditOvertimeData.click();}
    public void BtnConfirmSaveEditOvertimeData() { btnConfirmSaveEditOvertimeData.click();}
    public void TabMandatoryDeductions() { tabMandatoryDeductions.click();}
    public void BtnCreateMandatoryDeductions() { btnCreateMandatoryDeductions.click();}
    public void InputNameMandatoryDeductions(String inputNameMandatoryDeductions) { this.inputNameMandatoryDeductions.sendKeys(inputNameMandatoryDeductions);}
    public void BtnSelectDeductionType() { btnSelectDeductionType.click();}
    public void SelectDeductionType() { selectDeductionType.click();}
    public void SelectMandatoryDeductionDeductedFrom() { selectMandatoryDeductionDeductedFrom.click();}
    public void BtnAddMandatoryDeductionsData() { btnAddMandatoryDeductionsData.click();}
    public void InputMandatoryDeductionsName(String inputMandatoryDeductionsName) { this.inputMandatoryDeductionsName.sendKeys(inputMandatoryDeductionsName);}
    public void InputMandatoryDeductionsValue(String inputMandatoryDeductionsValue) { this.inputMandatoryDeductionsValue.sendKeys(inputMandatoryDeductionsValue);}
    public void InputMandatoryDeductionsBenefit(String inputMandatoryDeductionsBenefit) { this.inputMandatoryDeductionsBenefit.sendKeys(inputMandatoryDeductionsBenefit);}
    public void BtnSaveMandatoryDeductions() { btnSaveMandatoryDeductions.click();}
    public void BtnConfirmSaveMandatoryDeductions() { btnConfirmSaveMandatoryDeductions.click();}
    public void SearchBarMandatoryDeductions(String searchBarMandatoryDeductions) { this.searchBarMandatoryDeductions.sendKeys(searchBarMandatoryDeductions);}
    public String getTxtIdMandatoryDeductions(){return txtIdMandatoryDeductions.getText();}
    public void BtnAddEmployeeMandatoryDeductions() { btnAddEmployeeMandatoryDeductions.click();}
    public void BtnSelectEmployeeMandatoryDeductions() { btnSelectEmployeeMandatoryDeductions.click();}
    public void SearchBarAddEmployeeMandatoryDeductions(String searchBarAddEmployeeMandatoryDeductions) { this.searchBarAddEmployeeMandatoryDeductions.sendKeys(searchBarAddEmployeeMandatoryDeductions);}
    public void ChooseEmployeeMandatoryDeductions() { chooseEmployeeMandatoryDeductions.click();}
    public void SelectEmployeeMandatoryDeductions() { selectEmployeeMandatoryDeductions.click();}
    public void BtnSaveAddEmployeeMandatoryDeductions() { btnSaveAddEmployeeMandatoryDeductions.click();}
    public void BtnConfirmSaveAddEmployeeMandatoryDeductions() { btnConfirmSaveAddEmployeeMandatoryDeductions.click();}
    public void BtnEditMandatoryDeductions() { btnEditMandatoryDeductions.click();}
    public void ClearInputNameMandatoryDeductions() { inputNameMandatoryDeductions.clear();}
    public void BtnSaveEditMandatoryDeductionsData() { btnSaveEditMandatoryDeductionsData.click();}
    public void BtnConfirmSaveEditMandatoryDeductionsData() { btnConfirmSaveEditMandatoryDeductionsData.click();}
    public void TabPph21() { tabPph21.click();}
    public void BtnCreatePph21() { btnCreatePph21.click();}
    public void InputCategoryPph21(String inputCategoryPph21) { this.inputCategoryPph21.sendKeys(inputCategoryPph21);}
    public void SelectPph21DeductedFrom() { selectPph21DeductedFrom.click();}
    public void InputIncomeRangeFromPph21(String inputIncomeRangeFromPph21) { this.inputIncomeRangeFromPph21.sendKeys(inputIncomeRangeFromPph21);}
    public void InputIncomeRangeToPph21(String inputIncomeRangeToPph21) { this.inputIncomeRangeToPph21.sendKeys(inputIncomeRangeToPph21);}
    public void InputIncomeRangeRateValuePph21(String inputIncomeRangeRateValuePph21) { this.inputIncomeRangeRateValuePph21.sendKeys(inputIncomeRangeRateValuePph21);}
    public void BtnSavePph21() { btnSavePph21.click();}
    public void BtnConfirmSavePph21() { btnConfirmSavePph21.click();}
    public void SearchBarPph21(String searchBarPph21) { this.searchBarPph21.sendKeys(searchBarPph21);}
    public String getTxtNamePph21(){return txtNamePph21.getText();}
    public void BtnAddEmployeePph21() { btnAddEmployeePph21.click();}
    public void BtnSelectEmployeePph21() { btnSelectEmployeePph21.click();}
    public void SearchBarAddEmployeePph21(String searchBarAddEmployeePph21) { this.searchBarAddEmployeePph21.sendKeys(searchBarAddEmployeePph21);}
    public void ChooseEmployeePph21() { chooseEmployeePph21.click();}
    public void SelectEmployeePph21() { selectEmployeePph21.click();}
    public void BtnSaveAddEmployeePph21() { btnSaveAddEmployeePph21.click();}
    public void BtnConfirmSaveAddEmployeeMPph21() { btnConfirmSaveAddEmployeeMPph21.click();}
    public void BtnEditPph21() { btnEditPph21.click();}
    public void ClearInputCategoryPph21() { inputCategoryPph21.clear();}
    public void BtnSaveEditPph21Data() { btnSaveEditPph21Data.click();}
    public void BtnConfirmSaveEditPph21Data() { btnConfirmSaveEditPph21Data.click();}
    public void TabHrDocument() { tabHrDocument.click();}
    public String getTxtHrDocument(){return txtHrDocument.getText();}
    public void BtnCreateHrDocumentNumber() { btnCreateHrDocumentNumber.click();}
    public void InputHrMasterDocumentName(String inputHrMasterDocumentName) { this.inputHrMasterDocumentName.sendKeys(inputHrMasterDocumentName);}
    public void InputHrFormatDocumentNumber(String inputHrFormatDocumentNumber) { this.inputHrFormatDocumentNumber.sendKeys(inputHrFormatDocumentNumber);}
    public void BtnSaveHrDocumentNumber() { btnSaveHrDocumentNumber.click();}
    public void BtnConfirmSaveHrDocumentNumber() { btnConfirmSaveHrDocumentNumber.click();}
    public void BtnEditHrDocumentNumber() { btnEditHrDocumentNumber.click();}
    public void ClearInputHrMasterDocumentName() { inputHrMasterDocumentName.clear();}
    public void BtnSaveEditHrDocumentNumberData() { btnSaveEditHrDocumentNumberData.click();}
    public void BtnConfirmSaveEditHrDocumentNumberData() { btnConfirmSaveEditHrDocumentNumberData.click();}
    public void BtnDeleteHrDocumentNumber() { btnDeleteHrDocumentNumber.click();}
    public void BtnConfirmDeleteHrDocumentNumber() { btnConfirmDeleteHrDocumentNumber.click();}
    public void TabHrListDocument() { tabHrListDocument.click();}
    public String getTxtHrListDocument(){return txtHrListDocument.getText();}
    public void BtnCreateHrListDocument() { btnCreateHrListDocument.click();}
    public void BtnSelectMasterDocumentNameHrListDocument() { btnSelectMasterDocumentNameHrListDocument.click();}
    public void SelectMasterDocumentNameHrListDocument() { selectMasterDocumentNameHrListDocument.click();}
    public void InputDocumentNameHrListDocument(String inputDocumentNameHrListDocument) { this.inputDocumentNameHrListDocument.sendKeys(inputDocumentNameHrListDocument);}
    public void BtnSaveHrListDocument() { btnSaveHrListDocument.click();}
    public void BtnConfirmSaveHrListDocument() { btnConfirmSaveHrListDocument.click();}
    public void BtnUploadHrListDocument() { btnUploadHrListDocument.click();}
    public void BtnChooseFileHrListDocument(String btnChooseFileHrListDocument) { this.btnChooseFileHrListDocument.sendKeys(btnChooseFileHrListDocument);}
    public void BtnSaveUploadHrListDocument() { btnSaveUploadHrListDocument.click();}
    public void BtnConfirmSaveUploadHrListDocument() { btnConfirmSaveUploadHrListDocument.click();}
    public void BtnEditHrListDocument() { btnEditHrListDocument.click();}
    public void ClearInputDocumentNameHrListDocument() { inputDocumentNameHrListDocument.clear();}
    public void BtnSaveEditHrListDocumentData() { btnSaveEditHrListDocumentData.click();}
    public void BtnConfirmSaveEditHrListDocumentData() { btnConfirmSaveEditHrListDocumentData.click();}
    public void BtnDeleteHrListDocument() { btnDeleteHrListDocument.click();}
    public void BtnConfirmDeleteHrListDocument() { btnConfirmDeleteHrListDocument.click();}
    public void TabHrRequestLetter() { tabHrRequestLetter.click();}
    public String getTxtHrRequestLetter(){return txtHrRequestLetter.getText();}
    public void BtnCreateHrRequestLetter() { btnCreateHrRequestLetter.click();}
    public void BtnStartDateHrRequestLetter() { btnStartDateHrRequestLetter.click();}
    public void BtnSelectTodayStartDateHrRequestLetter() { btnSelectTodayStartDateHrRequestLetter.click();}
    public void BtnEndDateHrRequestLetter() { btnEndDateHrRequestLetter.click();}
    public void BtnSelectTodayEndDateHrRequestLetter() { btnSelectTodayEndDateHrRequestLetter.click();}
    public void BtnSelectRegionHrRequestLetter() { btnSelectRegionHrRequestLetter.click();}
    public void SelectRegionHrRequestLetter() { selectRegionHrRequestLetter.click();}
    public void BtnConfirmSelectRegionHrRequestLetter() { btnConfirmSelectRegionHrRequestLetter.click();}
    public void InputLocationHrRequestLetter(String inputLocationHrRequestLetter) { this.inputLocationHrRequestLetter.sendKeys(inputLocationHrRequestLetter);}
    public void InputNoteHrRequestLetter(String inputNoteHrRequestLetter) { this.inputNoteHrRequestLetter.sendKeys(inputNoteHrRequestLetter);}
    public void BtnSelectTeamMemberOnDutyHrRequestLetter() { btnSelectTeamMemberOnDutyHrRequestLetter.click();}
    public void SelectTeamMemberOnDutyHrRequestLetter1() { selectTeamMemberOnDutyHrRequestLetter1.click();}
    public void SelectTeamMemberOnDutyHrRequestLetter2() { selectTeamMemberOnDutyHrRequestLetter2.click();}
    public void BtnSelectMemberOnDutyHrRequestLetter() { btnSelectMemberOnDutyHrRequestLetter.click();}
    public void ChecklistEstimatedExpendituresHrRequestLetter() { checklistEstimatedExpendituresHrRequestLetter.click();}
    public void BtnSaveHrRequestLetter() { btnSaveHrRequestLetter.click();}
    public void BtnConfirmSaveHrRequestLetter() { btnConfirmSaveHrRequestLetter.click();}
    public void BtnEditHrRequestLetter() { btnEditHrRequestLetter.click();}
    public void ClearInputNoteHrRequestLetter() { inputNoteHrRequestLetter.clear();}
    public void BtnSaveEditHrRequestLetterData() { btnSaveEditHrRequestLetterData.click();}
    public void BtnConfirmSaveEditHrRequestLetterData() { btnConfirmSaveEditHrRequestLetterData.click();}
    public void BtnApprovalHrRequestLetter() { btnApprovalHrRequestLetter.click();}
    public void BtnSelectApprovalHrRequestLetter() { btnSelectApprovalHrRequestLetter.click();}
    public void SelectApprovalHrRequestLetter() { selectApprovalHrRequestLetter.click();}
    public void InputNoteApprovalHrRequestLetter(String inputNoteApprovalHrRequestLetter) { this.inputNoteApprovalHrRequestLetter.sendKeys(inputNoteApprovalHrRequestLetter);}
    public void BtnSaveApprovalHrRequestLetter() { btnSaveApprovalHrRequestLetter.click();}
    public void BtnConfirmSaveApprovalHrRequestLetter() { btnConfirmSaveApprovalHrRequestLetter.click();}
    public void BtnViewApprovedHrRequestLetter() { btnViewApprovedHrRequestLetter.click();}
    public String getTxtViewApprovedHrRequestLetter(){return txtViewApprovedHrRequestLetter.getText();}
    public void BtnBackViewApprovedHrRequestLetter() { btnBackViewApprovedHrRequestLetter.click();}
}
