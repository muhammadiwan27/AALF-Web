package org.example.pages;

import org.example.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinancePage {
    private WebDriver driver;

    public FinancePage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[contains(@class,'nav-active duration-500 bg-secondary-01 svelte-wfxih7')])[1]")
    WebElement tabFinance;

    @FindBy(xpath = "(//h1[normalize-space()='Finance'])[1]")
    WebElement txtFinance;

    @FindBy(xpath = "(//a[contains(@href,'/finance/laporan')])[1]")
    WebElement tabHoReport;

    @FindBy(xpath = "(//h1[normalize-space()='HO Report'])[1]")
    WebElement txtHoReport;

    @FindBy(xpath = "(//button[normalize-space()='Task & Activity'])[1]")
    WebElement tabTaskActivityReport;

    @FindBy(xpath = "(//li[normalize-space()='Task & Activity'])[1]")
    WebElement txtTaskActivityReport;

    @FindBy(xpath = "(//button[normalize-space()='Task & Activity Summary'])[1]")
    WebElement tabTaskActivitySummaryReport;

    @FindBy(xpath = "(//li[normalize-space()='Task & Activity Summary'])[1]")
    WebElement txtTaskActivitySummaryReport;

    @FindBy(xpath = "(//button[normalize-space()='Client'])[1]")
    WebElement tabClientReport;

    @FindBy(xpath = "(//li[normalize-space()='Client'])[1]")
    WebElement txtClientReport;

    @FindBy(xpath = "(//button[normalize-space()='Administrative'])[1]")
    WebElement tabAdminstrativeReport;

    @FindBy(xpath = "(//li[normalize-space()='Administrative'])[1]")
    WebElement txtAdministrativeReport;

    @FindBy(xpath = "(//button[normalize-space()='Administrative Summary'])[1]")
    WebElement tabAdminstrativeSummaryReport;

    @FindBy(xpath = "(//li[normalize-space()='Administrative Summary'])[1]")
    WebElement txtAdministrativeSummaryReport;

    @FindBy(xpath = "(//button[normalize-space()='Administrative Approval'])[1]")
    WebElement tabAdminstrativeApprovalReport;

    @FindBy(xpath = "(//li[normalize-space()='Administrative Approval'])[1]")
    WebElement txtAdministrativeApprovalReport;

    @FindBy(xpath = "(//button[normalize-space()='HO Reimbursement'])[1]")
    WebElement tabHoReimbursementReport;

    @FindBy(xpath = "(//li[normalize-space()='HO Reimbursement'])[1]")
    WebElement txtHoReimbursementReport;

    @FindBy(xpath = "(//span[normalize-space()='Client'])[1]")
    WebElement tabClient;

    @FindBy(xpath = "(//li[normalize-space()='Client'])[1]")
    WebElement txtClientPage;

    @FindBy(xpath = "(//a[normalize-space()='Add Client'])[1]")
    WebElement btnAddClient;

    @FindBy(xpath = "(//input[@id='nm_client'])[1]")
    WebElement inputNameOfClient;

    @FindBy(xpath = "(//input[@id='email'])[1]")
    WebElement inputEmailClient;

    @FindBy(xpath = "(//input[@id='telp'])[1]")
    WebElement inputTelephoneClient;

    @FindBy(xpath = "(//input[@id='fax'])[1]")
    WebElement inputFaxClient;

    @FindBy(xpath = "(//input[@id='npwp'])[1]")
    WebElement inputNpwpClient;

    @FindBy(xpath = "(//textarea[@placeholder='Address'])[1]")
    WebElement inputAddressClient;

    @FindBy(xpath = "(//select[@id='provinsi'])[1]")
    WebElement btnSelectProvinceClient;

    @FindBy(xpath = "(//option[@value='SUMATERA BARAT'])[1]")
    WebElement selectProvinceClient;

    @FindBy(xpath = "(//select[@id='kota'])[1]")
    WebElement btnSelectCityClient;

    @FindBy(xpath = "(//option[@value='KOTA PADANG'])[1]")
    WebElement selectCityClient;

    @FindBy(xpath = "(//select[@id='kecamatan'])[1]")
    WebElement btnSelectDistrictClient;

    @FindBy(xpath = "(//option[@value='Lubuk Begalung'])[1]")
    WebElement selectDistrictClient;

    @FindBy(xpath = "(//select[@id='kelurahan'])[1]")
    WebElement btnSelectSubdistrictClient;

    @FindBy(xpath = "(//option[@value='Lubuk Begalung Nan XX'])[1]")
    WebElement selectSubdistrictClient;

    @FindBy(xpath = "(//input[@id='nm_pic'])[1]")
    WebElement inputPicNameClient;

    @FindBy(xpath = "(//input[@id='telp_pic'])[1]")
    WebElement inputTelephonePicClient;

    @FindBy(xpath = "(//input[@id='email_pic'])[1]")
    WebElement inputEmailPicClient;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveDataClient;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveDataClient;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/a[1]")
    WebElement btnEditClient;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/a[1]")
    WebElement btnDeleteClient;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmDeleteClient;

    @FindBy(xpath = "(//span[normalize-space()='HO Completed'])[1]")
    WebElement tabHoCompleted;

    @FindBy(xpath = "(//h1[normalize-space()='HO Completed'])[1]")
    WebElement txtHoCompletedPage;

    @FindBy(xpath = "(//a[contains(@class,'btn-icon btn-icon-sm')])[2]")
    WebElement btnViewHoCompletedPage;

    @FindBy(xpath = "(//h1[normalize-space()='View Completed HO'])[1]")
    WebElement txtViewHoCompletedPage;

    @FindBy(xpath = "(//button[normalize-space()='Back'])[1]")
    WebElement btnBackHoCompletedPage;

    @FindBy(xpath = "(//a[contains(@class,'lg:w-[196px] w-[220px] nav-active duration-500 bg-secondary-01 svelte-24n6es')])[1]")
    WebElement tabFinanceDocument;

    @FindBy(xpath = "(//h1[normalize-space()='Document'])[1]")
    WebElement txtFinanceDocumentPage;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreateFinanceDocumentNumber;

    @FindBy(xpath = "(//input[@id='note'])[1]")
    WebElement inputFinanceMasterDocumentName;

    @FindBy(xpath = "(//input[@id='number'])[1]")
    WebElement inputFinanceFormatDocumentNumber;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveFinanceDocumentNumber;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveFinanceDocumentNumber;

    @FindBy(xpath = "//tbody/tr[5]/td[4]/div[1]/a[1]/img[1]")
    WebElement btnEditFinanceDocumentNumber;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditFinanceDocumentNumber;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditFinanceDocumentNumber;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[2]/main[1]/div[1]/main[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[4]/div[1]/button[1]")
    WebElement btnDeleteFinanceFormatDocumentNumber;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmDeleteFinanceFormatDocumentNumber;

    @FindBy(xpath = "(//button[normalize-space()='List Document'])[1]")
    WebElement tabFinanceListDocument;

    @FindBy(xpath = "(//li[normalize-space()='List Document'])[1]")
    WebElement txtFinanceListDocumentPage;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreateFinanceListDocument;

    @FindBy(xpath = "(//select[@class='select select-sm'])[1]")
    WebElement btnSelectMasterDocumentNameFinanceListDocument;

    @FindBy(xpath = "(//option[@value='Surat Finance'])[1]")
    WebElement selectMasterDocumentNameFinanceListDocument;

    @FindBy(xpath = "(//input[@id='keterangan'])[1]")
    WebElement inputDocumentNameFinanceListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveFinanceListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveFinanceListDocument;

    @FindBy(xpath = "(//a[normalize-space()='Upload'])[1]")
    WebElement btnUploadFinanceListDocument;

    @FindBy(xpath = "(//input[@id='dokumen'])[1]")
    WebElement btnChooseFileDocumentFinanceListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Upload'])[1]")
    WebElement btnSaveUploadFinanceListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveUploadFinanceListDocument;

    @FindBy(xpath = "(//a[@class=' btn-icon btn-icon-sm'])[1]")
    WebElement btnEditFinanceListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditFinanceListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditFinanceListDocument;

    @FindBy(xpath = "(//button[@class='btn-icon btn-icon-sm'])[1]")
    WebElement btnDeleteFinanceListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmDeleteFinanceListDocument;

    @FindBy(xpath = "(//span[normalize-space()='Payroll'])[1]")
    WebElement tabFinancePayroll;

    @FindBy(xpath = "(//h1[normalize-space()='Payroll'])[1]")
    WebElement txtFinancePayrollPage;

    @FindBy(xpath = "(//a[normalize-space()='Create Payroll Periode'])[1]")
    WebElement btnCreateFinancePayrollPeriode;

    @FindBy(xpath = "(//input[@id='month'])[1]")
    WebElement inputMonthFinancePayrollPeriode;

    @FindBy(xpath = "(//input[@placeholder='Start date'])[1]")
    WebElement inputFirstDateFinancePayrollPeriode;

    @FindBy(xpath = "(//input[@placeholder='End date'])[1]")
    WebElement inputEndDateFinancePayrollPeriode;

    @FindBy(xpath = "(//input[@id='workDays'])[1]")
    WebElement inputWorkDaysFinancePayrollPeriode;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveFinancePayrollPeriode;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveFinancePayrollPeriode;

    @FindBy(xpath = "//tbody/tr[3]/td[5]/div[1]/a[1]/img[1]")
    WebElement btnEditFinanceDetailPayrollPeriode;

    @FindBy(xpath = "(//h1[normalize-space()='Detail Periode Payroll 2024-08'])[1]")
    WebElement txtFinanceDetailPayrollPeriode;

    @FindBy(xpath = "//tbody/tr[29]/td[5]/div[1]/a[1]/img[1]")
    WebElement btnEditFinancePayrollEmployee;

    @FindBy(xpath = "(//input[@placeholder='Other allowances'])[1]")
    WebElement inputOtherAllowancesFinancePayrollEmployee;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditFinancePayrollEmployee;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditFinancePayrollEmployee;

    @FindBy(xpath = "(//button)[12]")
    WebElement btnDeletePayrollPeriode;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmDeletePayrollPeriode;

    @FindBy(xpath = "(//span[normalize-space()='Reimbursement'])[1]")
    WebElement tabFinanceReibursement;

    @FindBy(xpath = "(//li[normalize-space()='Finance Reimbursement'])[1]")
    WebElement txtFinanceReimbursementPage;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreateFinanceReimbursement;

    @FindBy(xpath = "(//input[@placeholder='Date'])[1]")
    WebElement btnDateFinanceReimbursement;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    WebElement btnSelectTodayDateFinanceReimbursement;

    @FindBy(xpath = "(//textarea[@placeholder='Note'])[1]")
    WebElement inputNoteFinanceReimbursement;

    @FindBy(xpath = "(//button[normalize-space()='Select Team'])[1]")
    WebElement btnSelectTeamMemberOnDutyFinanceReimbursement;

    @FindBy(xpath = "(//div[contains(text(),'Ekania Salsabila Khairunissa')])[1]")
    WebElement selectMemberOnDutyFinanceReimbursement1;

    @FindBy(xpath = "(//div[contains(text(),'admin si panda')])[1]")
    WebElement selectMemberOnDutyFinanceReimbursement2;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectMemberOnDutyFinanceReimbursement;

    @FindBy(xpath = "(//textarea[@placeholder='Note'])[1]")
    WebElement inputListOfExpensesFinanceReimbursement;

    @FindBy(xpath = "(//textarea[@placeholder='Note'])[1]")
    WebElement inputAmountFinanceReimbursement;

    @FindBy(xpath = "(//input[@id='fBukti'])[1]")
    WebElement btnUploadReceiptFinanceReimbursement;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveFinanceReimbursement;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveFinanceReimbursement;

    @FindBy(xpath = "(//img[@src='/img/icon/pen.svg'])[1]")
    WebElement btnEditFinanceReimbursement;

    @FindBy(xpath = "(//textarea[@placeholder='Note'])[1]")
    WebElement inputEditNoteFinanceReimbursement;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveEditFinanceReimbursement;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditFinanceReimbursement;

    @FindBy(xpath = "(//a)[53]")
    WebElement btnViewFinanceReimbursement;

    @FindBy(xpath = "(//a[normalize-space()='Back'])[1]")
    WebElement btnBackViewFinanceReimbursement;

    @FindBy(xpath = "(//img[@src='/img/icon/trash.svg'])[1]")
    WebElement btnDeleteFinanceReimbursement;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmDeleteFinanceReimbursement;

    @FindBy(xpath = "(//span[normalize-space()='Payment'])[1]")
    WebElement tabFinancePayment;

    @FindBy(xpath = "(//li[normalize-space()='Finance Reimbursement'])[1]")
    WebElement txtFinancePaymentPage;

    @FindBy(xpath = "(//a[@class='btn btn-sm !text-black'][normalize-space()='Payment'])[1]")
    WebElement btnPaymentNeedToPaymentHoReimbursement;

    @FindBy(xpath = "(//button[normalize-space()='Upload'])[1]")
    WebElement btnUploadDocumentPaymentHoReimbursement;

    @FindBy(xpath = "(//input[@placeholder='0'])[1]")
    WebElement inputAmountApprovePaymentHoReimbursement;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnCreatePaymentHoReimbursement;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmCreatePaymentHoReimbursement;

    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Payment'])[1]")
    WebElement tabPaymentHoReimbursement;

    @FindBy(xpath = "(//a[@class='btn-icon btn-icon-sm'])[1]")
    WebElement btnPencilPaymentHoReimbursement;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveEditPaymentHoReimbursement;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditPaymentHoReimbursement;

    @FindBy(xpath = "(//a[@class='btn btn-sm rounded-none bg-primary-01'][normalize-space()='Approval'])[1]")
    WebElement btnApprovalPaymentHoReimbursement;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnSelectPartnerApprovalPaymentHoReimbursement;

    @FindBy(xpath = "(//option[@value='approve'])[1]")
    WebElement selectPartnerApprovalPaymentHoReimbursement;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSavePartnerApprovalPaymentHoReimbursement;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmPartnerApprovalPaymentHoReimbursement;

    @FindBy(xpath = "(//a)[48]")
    WebElement btnViewApprovedPaymentHoReimbursement;

    @FindBy(xpath = "(//button[normalize-space()='Back'])[1]")
    WebElement btnBackViewApprovedPaymentHoReimbursement;

    @FindBy(xpath = "(//button[normalize-space()='Finance Reimbursement'])[1]")
    WebElement tabFinanceReimbursementPayment;

    @FindBy(xpath = "(//li[normalize-space()='Finance Reimbursement'])[1]")
    WebElement txtFinanceReimbursementPaymentPage;

    @FindBy(xpath = "(//a[@class='btn btn-sm !text-black'][normalize-space()='Payment'])[1]")
    WebElement btnPaymentNeedToPaymentFinanceReimbursement;

    @FindBy(xpath = "(//button[normalize-space()='Upload'])[1]")
    WebElement btnUploadDocumentPaymentFinanceReimbursement;

    @FindBy(xpath = "(//input[@placeholder='0'])[1]")
    WebElement inputAmountApprovePaymentFinanceReimbursement;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnCreatePaymentFinanceReimbursement;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmCreatePaymentFinanceReimbursement;

    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Payment'])[1]")
    WebElement tabPaymentFinanceReimbursement;

    @FindBy(xpath = "(//a[@class='btn-icon btn-icon-sm'])[2]")
    WebElement btnPencilPaymentFinanceReimbursement;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveEditPaymentFinanceReimbursement;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditPaymentFinanceReimbursement;

    @FindBy(xpath = "(//a[@class='btn btn-sm rounded-none bg-primary-01'][normalize-space()='Approval'])[2]")
    WebElement btnApprovalPaymentFinanceReimbursement;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnSelectPartnerApprovalPaymentFinanceReimbursement;

    @FindBy(xpath = "(//option[@value='approve'])[1]")
    WebElement selectPartnerApprovalPaymentFinanceReimbursement;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSavePartnerApprovalPaymentFinanceReimbursement;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmPartnerApprovalPaymentFinanceReimbursement;

    @FindBy(xpath = "(//a[@class='btn-icon btn-icon-sm'])[1]")
    WebElement btnViewApprovedPaymentFinanceReimbursement;

    @FindBy(xpath = "(//button[normalize-space()='Back'])[1]")
    WebElement btnBackViewApprovedPaymentFinanceReimbursement;





    public void TabFinance() { tabFinance.click();}
    public String getTxtFinance(){return txtFinance.getText();}
    public void TabHoReport() { tabHoReport.click();}
    public String getTxtHoReport(){return txtHoReport.getText();}
    public void TabTaskActivityReport() { tabTaskActivityReport.click();}
    public String getTxtTaskActivityReport(){return txtTaskActivityReport.getText();}
    public void TabTaskActivitySummaryReport() { tabTaskActivitySummaryReport.click();}
    public String getTxtTaskActivitySummaryReport(){return txtTaskActivitySummaryReport.getText();}
    public void TabClientReport() { tabClientReport.click();}
    public String getTxtClientReport(){return txtClientReport.getText();}
    public void TabAdminstrativeReport() { tabAdminstrativeReport.click();}
    public String getTxtAdministrativeReport(){return txtAdministrativeReport.getText();}
    public void TabAdminstrativeSummaryReport() { tabAdminstrativeSummaryReport.click();}
    public String getTxtAdministrativeSummaryReport(){return txtAdministrativeSummaryReport.getText();}
    public void TabAdminstrativeApprovalReport() { tabAdminstrativeApprovalReport.click();}
    public String getTxtAdministrativeApprovalReport(){return txtAdministrativeApprovalReport.getText();}
    public void TabHoReimbursementReport() { tabHoReimbursementReport.click();}
    public String getTxtHoReimbursementReport(){return txtHoReimbursementReport.getText();}
    public void TabClient() { tabClient.click();}
    public String getTxtClientPage(){return txtClientPage.getText();}
    public void BtnAddClient() { btnAddClient.click();}
    public void InputNameOfClient(String inputNameOfClient) { this.inputNameOfClient.sendKeys(inputNameOfClient);}
    public void InputEmailClient(String inputEmailClient) { this.inputEmailClient.sendKeys(inputEmailClient);}
    public void InputTelephoneClient(String inputTelephoneClient) { this.inputTelephoneClient.sendKeys(inputTelephoneClient);}
    public void InputFaxClient(String inputFaxClient) { this.inputFaxClient.sendKeys(inputFaxClient);}
    public void InputNpwpClient(String inputNpwpClient) { this.inputNpwpClient.sendKeys(inputNpwpClient);}
    public void InputAddressClient(String inputAddressClient) { this.inputAddressClient.sendKeys(inputAddressClient);}
    public void BtnSelectProvinceClient() { btnSelectProvinceClient.click();}
    public void SelectProvinceClient() { selectProvinceClient.click();}
    public void BtnSelectCityClient() { btnSelectCityClient.click();}
    public void SelectCityClient() { selectCityClient.click();}
    public void BtnSelectDistrictClient() { btnSelectDistrictClient.click();}
    public void SelectDistrictClient() { selectDistrictClient.click();}
    public void BtnSelectSubdistrictClient() { btnSelectSubdistrictClient.click();}
    public void SelectSubdistrictClient() { selectSubdistrictClient.click();}
    public void InputPicNameClient(String inputPicNameClient) { this.inputPicNameClient.sendKeys(inputPicNameClient);}
    public void InputTelephonePicClient(String inputTelephonePicClient) { this.inputTelephonePicClient.sendKeys(inputTelephonePicClient);}
    public void InputEmailPicClient(String inputEmailPicClient) { this.inputEmailPicClient.sendKeys(inputEmailPicClient);}
    public void BtnSaveDataClient() { btnSaveDataClient.click();}
    public void BtnConfirmSaveDataClient() { btnConfirmSaveDataClient.click();}
    public void BtnEditClient() { btnEditClient.click();}
    public void ClearEmailClient() { inputEmailClient.clear();}
    public void BtnDeleteClient() { btnDeleteClient.click();}
    public void BtnConfirmDeleteClient() { btnConfirmDeleteClient.click();}
    public void TabHoCompleted() { tabHoCompleted.click();}
    public String getTxtHoCompletedPage(){return txtHoCompletedPage.getText();}
    public void BtnViewHoCompletedPage() { btnViewHoCompletedPage.click();}
    public String getTxtViewHoCompletedPage(){return txtViewHoCompletedPage.getText();}
    public void BtnBackHoCompletedPage() { btnBackHoCompletedPage.click();}
    public void TabFinanceDocument() { tabFinanceDocument.click();}
    public String getTxtFinanceDocumentPage(){return txtFinanceDocumentPage.getText();}
    public void BtnCreateFinanceDocumentNumber() { btnCreateFinanceDocumentNumber.click();}
    public void InputFinanceMasterDocumentName(String inputFinanceMasterDocumentName) { this.inputFinanceMasterDocumentName.sendKeys(inputFinanceMasterDocumentName);}
    public void InputFinanceFormatDocumentNumber(String inputFinanceFormatDocumentNumber) { this.inputFinanceFormatDocumentNumber.sendKeys(inputFinanceFormatDocumentNumber);}
    public void BtnSaveFinanceDocumentNumber() { btnSaveFinanceDocumentNumber.click();}
    public void BtnConfirmSaveFinanceDocumentNumber() { btnConfirmSaveFinanceDocumentNumber.click();}
    public void BtnEditFinanceDocumentNumber() { btnEditFinanceDocumentNumber.click();}
    public void ClearFinanceMasterDocumentName() { inputFinanceMasterDocumentName.clear();}
    public void BtnSaveEditFinanceDocumentNumber() { btnSaveEditFinanceDocumentNumber.click();}
    public void BtnConfirmSaveEditFinanceDocumentNumber() { btnConfirmSaveEditFinanceDocumentNumber.click();}
    public void BtnDeleteFinanceFormatDocumentNumber() { btnDeleteFinanceFormatDocumentNumber.click();}
    public void BtnConfirmDeleteFinanceFormatDocumentNumber() { btnConfirmDeleteFinanceFormatDocumentNumber.click();}
    public void TabFinanceListDocument() { tabFinanceListDocument.click();}
    public String getTxtFinanceListDocumentPage(){return txtFinanceListDocumentPage.getText();}
    public void BtnCreateFinanceListDocument() { btnCreateFinanceListDocument.click();}
    public void BtnSelectMasterDocumentNameFinanceListDocument() { btnSelectMasterDocumentNameFinanceListDocument.click();}
    public void SelectMasterDocumentNameFinanceListDocument() { selectMasterDocumentNameFinanceListDocument.click();}
    public void InputDocumentNameFinanceListDocument(String inputDocumentNameFinanceListDocument) { this.inputDocumentNameFinanceListDocument.sendKeys(inputDocumentNameFinanceListDocument);}
    public void BtnSaveFinanceListDocument() { btnSaveFinanceListDocument.click();}
    public void BtnConfirmSaveFinanceListDocument() { btnConfirmSaveFinanceListDocument.click();}
    public void BtnUploadFinanceListDocument() { btnUploadFinanceListDocument.click();}
    public void BtnChooseFileDocumentFinanceListDocument(String btnChooseFileDocumentFinanceListDocument) { this.btnChooseFileDocumentFinanceListDocument.sendKeys(btnChooseFileDocumentFinanceListDocument);}
    public void BtnSaveUploadFinanceListDocument() { btnSaveUploadFinanceListDocument.click();}
    public void BtnConfirmSaveUploadFinanceListDocument() { btnConfirmSaveUploadFinanceListDocument.click();}
    public void BtnEditFinanceListDocument() { btnEditFinanceListDocument.click();}
    public void ClearDocumentNameFinanceListDocument() { inputDocumentNameFinanceListDocument.clear();}
    public void BtnSaveEditFinanceListDocument() { btnSaveEditFinanceListDocument.click();}
    public void BtnConfirmSaveEditFinanceListDocument() { btnConfirmSaveEditFinanceListDocument.click();}
    public void BtnDeleteFinanceListDocument() { btnDeleteFinanceListDocument.click();}
    public void BtnConfirmDeleteFinanceListDocument() { btnConfirmDeleteFinanceListDocument.click();}
    public void TabFinancePayroll() { tabFinancePayroll.click();}
    public String getTxtFinancePayrollPage(){return txtFinancePayrollPage.getText();}
    public void BtnCreateFinancePayrollPeriode() { btnCreateFinancePayrollPeriode.click();}
    public void InputMonthFinancePayrollPeriode(String inputMonthFinancePayrollPeriode) { this.inputMonthFinancePayrollPeriode.sendKeys(inputMonthFinancePayrollPeriode);}
    public void InputFirstDateFinancePayrollPeriode(String inputFirstDateFinancePayrollPeriode) { this.inputFirstDateFinancePayrollPeriode.sendKeys(inputFirstDateFinancePayrollPeriode);}
    public void InputEndDateFinancePayrollPeriode(String inputEndDateFinancePayrollPeriode) { this.inputEndDateFinancePayrollPeriode.sendKeys(inputEndDateFinancePayrollPeriode);}
    public void InputWorkDaysFinancePayrollPeriode(String inputWorkDaysFinancePayrollPeriode) { this.inputWorkDaysFinancePayrollPeriode.sendKeys(inputWorkDaysFinancePayrollPeriode);}
    public void BtnSaveFinancePayrollPeriode() { btnSaveFinancePayrollPeriode.click();}
    public void BtnConfirmSaveFinancePayrollPeriode() { btnConfirmSaveFinancePayrollPeriode.click();}
    public void BtnEditFinanceDetailPayrollPeriode() { btnEditFinanceDetailPayrollPeriode.click();}
    public String getTxtFinanceDetailPayrollPeriode(){return txtFinanceDetailPayrollPeriode.getText();}
    public void BtnEditFinancePayrollEmployee() { btnEditFinancePayrollEmployee.click();}
    public void InputOtherAllowancesFinancePayrollEmployee(String inputOtherAllowancesFinancePayrollEmployee) { this.inputOtherAllowancesFinancePayrollEmployee.sendKeys(inputOtherAllowancesFinancePayrollEmployee);}
    public void BtnSaveEditFinancePayrollEmployee() { btnSaveEditFinancePayrollEmployee.click();}
    public void BtnConfirmSaveEditFinancePayrollEmployee() { btnConfirmSaveEditFinancePayrollEmployee.click();}
    public void BtnDeletePayrollPeriode() { btnDeletePayrollPeriode.click();}
    public void BtnConfirmDeletePayrollPeriode() { btnConfirmDeletePayrollPeriode.click();}
    public void TabFinanceReibursement() { tabFinanceReibursement.click();}
    public String getTxtFinanceReimbursementPage(){return txtFinanceReimbursementPage.getText();}
    public void BtnCreateFinanceReimbursement() { btnCreateFinanceReimbursement.click();}
    public void BtnDateFinanceReimbursement() { btnDateFinanceReimbursement.click();}
    public void BtnSelectTodayDateFinanceReimbursement() { btnSelectTodayDateFinanceReimbursement.click();}
    public void InputNoteFinanceReimbursement(String inputNoteFinanceReimbursement) { this.inputNoteFinanceReimbursement.sendKeys(inputNoteFinanceReimbursement);}
    public void BtnSelectTeamMemberOnDutyFinanceReimbursement() { btnSelectTeamMemberOnDutyFinanceReimbursement.click();}
    public void SelectMemberOnDutyFinanceReimbursement1() { selectMemberOnDutyFinanceReimbursement1.click();}
    public void SelectMemberOnDutyFinanceReimbursement2() { selectMemberOnDutyFinanceReimbursement2.click();}
    public void BtnSelectMemberOnDutyFinanceReimbursement() { btnSelectMemberOnDutyFinanceReimbursement.click();}
    public void InputListOfExpensesFinanceReimbursement(String inputListOfExpensesFinanceReimbursement) { this.inputListOfExpensesFinanceReimbursement.sendKeys(inputListOfExpensesFinanceReimbursement);}
    public void InputAmountFinanceReimbursement(String inputAmountFinanceReimbursement) { this.inputAmountFinanceReimbursement.sendKeys(inputAmountFinanceReimbursement);}
    public void BtnUploadReceiptFinanceReimbursement(String btnUploadReceiptFinanceReimbursement) { this.btnUploadReceiptFinanceReimbursement.sendKeys(btnUploadReceiptFinanceReimbursement);}
    public void BtnSaveFinanceReimbursement() { btnSaveFinanceReimbursement.click();}
    public void BtnConfirmSaveFinanceReimbursement() { btnConfirmSaveFinanceReimbursement.click();}
    public void BtnEditFinanceReimbursement() { btnEditFinanceReimbursement.click();}
    public void ClearNoteFinanceReimbursement() { inputNoteFinanceReimbursement.clear();}
    public void InputEditNoteFinanceReimbursement(String inputEditNoteFinanceReimbursement) { this.inputEditNoteFinanceReimbursement.sendKeys(inputEditNoteFinanceReimbursement);}
    public void BtnSaveEditFinanceReimbursement() { btnSaveEditFinanceReimbursement.click();}
    public void BtnConfirmSaveEditFinanceReimbursement() { btnConfirmSaveEditFinanceReimbursement.click();}
    public void BtnViewFinanceReimbursement() { btnViewFinanceReimbursement.click();}
    public void BtnBackViewFinanceReimbursement() { btnBackViewFinanceReimbursement.click();}
    public void BtnDeleteFinanceReimbursement() { btnDeleteFinanceReimbursement.click();}
    public void BtnConfirmDeleteFinanceReimbursement() { btnConfirmDeleteFinanceReimbursement.click();}
    public void TabFinancePayment() { tabFinancePayment.click();}
    public String getTxtFinancePaymentPage(){return txtFinancePaymentPage.getText();}
    public void BtnPaymentNeedToPaymentHoReimbursement() { btnPaymentNeedToPaymentHoReimbursement.click();}
    public void BtnUploadDocumentPaymentHoReimbursement(String btnUploadDocumentPaymentHoReimbursement) { this.btnUploadDocumentPaymentHoReimbursement.sendKeys(btnUploadDocumentPaymentHoReimbursement);}
    public void InputAmountApprovePaymentHoReimbursement(String inputAmountApprovePaymentHoReimbursement) { this.inputAmountApprovePaymentHoReimbursement.sendKeys(inputAmountApprovePaymentHoReimbursement);}
    public void BtnCreatePaymentHoReimbursement() { btnCreatePaymentHoReimbursement.click();}
    public void BtnConfirmCreatePaymentHoReimbursement() { btnConfirmCreatePaymentHoReimbursement.click();}
    public void TabPaymentHoReimbursement() { tabPaymentHoReimbursement.click();}
    public void BtnPencilPaymentHoReimbursement() { btnPencilPaymentHoReimbursement.click();}
    public void ClearInputAmountApprovePaymentHoReimbursement() { inputAmountApprovePaymentHoReimbursement.clear();}
    public void BtnSaveEditPaymentHoReimbursement() { btnSaveEditPaymentHoReimbursement.click();}
    public void BtnConfirmSaveEditPaymentHoReimbursement() { btnConfirmSaveEditPaymentHoReimbursement.click();}
    public void BtnApprovalPaymentHoReimbursement() { btnApprovalPaymentHoReimbursement.click();}
    public void BtnSelectPartnerApprovalPaymentHoReimbursement() { btnSelectPartnerApprovalPaymentHoReimbursement.click();}
    public void SelectPartnerApprovalPaymentHoReimbursement() { selectPartnerApprovalPaymentHoReimbursement.click();}
    public void BtnSavePartnerApprovalPaymentHoReimbursement() { btnSavePartnerApprovalPaymentHoReimbursement.click();}
    public void BtnConfirmPartnerApprovalPaymentHoReimbursement() { btnConfirmPartnerApprovalPaymentHoReimbursement.click();}
    public void BtnViewApprovedPaymentHoReimbursement() { btnViewApprovedPaymentHoReimbursement.click();}
    public void BtnBackViewApprovedPaymentHoReimbursement() { btnBackViewApprovedPaymentHoReimbursement.click();}
    public void TabFinanceReimbursementPayment() { tabFinanceReimbursementPayment.click();}
    public String geTxtFinanceReimbursementPaymentPage(){return txtFinanceReimbursementPaymentPage.getText();}
    public void BtnPaymentNeedToPaymentFinanceReimbursement() { btnPaymentNeedToPaymentFinanceReimbursement.click();}
    public void BtnUploadDocumentPaymentFinanceReimbursement(String btnUploadDocumentPaymentFinanceReimbursement) { this.btnUploadDocumentPaymentFinanceReimbursement.sendKeys(btnUploadDocumentPaymentFinanceReimbursement);}
    public void InputAmountApprovePaymentFinanceReimbursement(String inputAmountApprovePaymentFinanceReimbursement) { this.inputAmountApprovePaymentFinanceReimbursement.sendKeys(inputAmountApprovePaymentFinanceReimbursement);}
    public void BtnCreatePaymentFinanceReimbursement() { btnCreatePaymentFinanceReimbursement.click();}
    public void BtnConfirmCreatePaymentFinanceReimbursement() { btnConfirmCreatePaymentFinanceReimbursement.click();}
    public void TabPaymentFinanceReimbursement() { tabPaymentFinanceReimbursement.click();}
    public void BtnPencilPaymentFinanceReimbursement() { btnPencilPaymentFinanceReimbursement.click();}
    public void ClearInputAmountApprovePaymentFinanceReimbursement() { inputAmountApprovePaymentFinanceReimbursement.clear();}
    public void BtnSaveEditPaymentFinanceReimbursement() { btnSaveEditPaymentFinanceReimbursement.click();}
    public void BtnConfirmSaveEditPaymentFinanceReimbursement() { btnConfirmSaveEditPaymentFinanceReimbursement.click();}
    public void BtnApprovalPaymentFinanceReimbursement() { btnApprovalPaymentFinanceReimbursement.click();}
    public void BtnSelectPartnerApprovalPaymentFinanceReimbursement() { btnSelectPartnerApprovalPaymentFinanceReimbursement.click();}
    public void SelectPartnerApprovalPaymentFinanceReimbursement() { selectPartnerApprovalPaymentFinanceReimbursement.click();}
    public void BtnSavePartnerApprovalPaymentFinanceReimbursement() { btnSavePartnerApprovalPaymentFinanceReimbursement.click();}
    public void BtnConfirmPartnerApprovalPaymentFinanceReimbursement() { btnConfirmPartnerApprovalPaymentFinanceReimbursement.click();}
    public void BtnViewApprovedPaymentFinanceReimbursement() { btnViewApprovedPaymentFinanceReimbursement.click();}
    public void BtnBackViewApprovedPaymentFinanceReimbursement() { btnBackViewApprovedPaymentFinanceReimbursement.click();}
}