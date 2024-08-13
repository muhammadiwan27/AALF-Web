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

    @FindBy(xpath = "(//button[normalize-space()='Client'])[1]")
    WebElement tabClientReport;

    @FindBy(xpath = "(//li[normalize-space()='Client'])[1]")
    WebElement txtClientReport;

    @FindBy(xpath = "(//button[normalize-space()='Administrative'])[1]")
    WebElement tabAdminstrativeReport;

    @FindBy(xpath = "(//li[normalize-space()='Administrative'])[1]")
    WebElement txtAdministrativeReport;

    @FindBy(xpath = "(//button[normalize-space()='Administrative Approval'])[1]")
    WebElement tabAdminstrativeApprovalReport;

    @FindBy(xpath = "(//li[normalize-space()='Administrative Approval'])[1]")
    WebElement txtAdministrativeApprovalReport;

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








    public void TabFinance() { tabFinance.click();}
    public String getTxtFinance(){return txtFinance.getText();}
    public void TabHoReport() { tabHoReport.click();}
    public String getTxtHoReport(){return txtHoReport.getText();}
    public void TabTaskActivityReport() { tabTaskActivityReport.click();}
    public String getTxtTaskActivityReport(){return txtTaskActivityReport.getText();}
    public void TabClientReport() { tabClientReport.click();}
    public String getTxtClientReport(){return txtClientReport.getText();}
    public void TabAdminstrativeReport() { tabAdminstrativeReport.click();}
    public String getTxtAdministrativeReport(){return txtAdministrativeReport.getText();}
    public void TabAdminstrativeApprovalReport() { tabAdminstrativeApprovalReport.click();}
    public String getTxtAdministrativeApprovalReport(){return txtAdministrativeApprovalReport.getText();}
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
    public void BtnDeleteClient() { btnDeleteClient.clear();}
    public void BtnConfirmDeleteClient() { btnConfirmDeleteClient.clear();}
    public void TabHoCompleted() { tabHoCompleted.click();}
    public String getTxtHoCompletedPage(){return txtHoCompletedPage.getText();}
    public void BtnViewHoCompletedPage() { btnViewHoCompletedPage.click();}
    public String getTxtViewHoCompletedPage(){return txtViewHoCompletedPage.getText();}
    public void BtnBackHoCompletedPage() { btnBackHoCompletedPage.click();}
    public void TabFinanceDocument() { tabFinanceDocument.click();}
    public String getTxtFinanceDocumentPage(){return txtFinanceDocumentPage.getText();}
}

