package org.example.pages;

import org.example.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DocumentPage {
    public DocumentPage() {
        WebDriver driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[contains(@class,'ml-2 py-1')][normalize-space()='Document'])[4]")
    WebElement tabDocument;

    @FindBy(xpath = "(//h1[normalize-space()='Dashboard Master Document'])[1]")
    WebElement txtDocument;

    @FindBy(xpath = "(//span[normalize-space()='Document Report'])[1]")
    WebElement tabDocumentReport;

    @FindBy(xpath = "(//h1[normalize-space()='Document Report'])[1]")
    WebElement txtDocumentReport;

    @FindBy(xpath = "(//input[@id='month'])[1]")
    WebElement inputMonthDocumentMasterDocumentNumber;

    @FindBy(xpath = "(//a[normalize-space()='EXCEL'])[1]")
    WebElement btnDownloadDocumentMasterDocumentNumber;

    @FindBy(xpath = "(//a[contains(@href,'/master-dokumen/dokumen-number')])[1]")
    WebElement tabDocumentNumber;

    @FindBy(xpath = "(//h1[normalize-space()='Document Number'])[1]")
    WebElement txtDocumentNumberPage;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreateDocumentNumberDocument;

    @FindBy(xpath = "(//input[@id='note'])[1]")
    WebElement inputMasterDocumentNameDocument;

    @FindBy(xpath = "(//input[@id='number'])[1]")
    WebElement inputFormatDocumentNumberDocument;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveDocumentNumberDocument;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveDocumentNumberDocument;

    @FindBy(xpath = "(//a)[50]")
    WebElement btnEditDocumentNumber;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditDocumentNumberData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditDocumentNumberData;

    @FindBy(xpath = "(//button)[17]")
    WebElement btnDeleteDocumentNumber;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmDeleteDocumentNumber;

    @FindBy(xpath = "(//span[normalize-space()='List Document'])[1]")
    WebElement tabListDocument;

    @FindBy(xpath = "(//h1[normalize-space()='List Document'])[1]")
    WebElement txtListDocumentPage;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreateListDocument;

    @FindBy(xpath = "(//select[@class='select select-sm'])[1]")
    WebElement btnSelectMasterDocumentNameListDocument;

    @FindBy(xpath = "(//option[@value='Progress Report'])[1]")
    WebElement selectMasterDocumentNameListDocument;

    @FindBy(xpath = "(//input[@id='keterangan'])[1]")
    WebElement inputDocumentNameListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveListDocument;

    @FindBy(xpath = "(//a[contains(text(),'Upload')])[1]")
    WebElement btnUploadListDocument;

    @FindBy(xpath = "(//input[@id='dokumen'])[1]")
    WebElement btnChooseFileListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Upload'])[1]")
    WebElement btnSaveUploadListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveUploadListDocument;

    @FindBy(xpath = "(//a)[51]")
    WebElement btnEditListDocument;

    @FindBy(xpath = "(//input[@id='dokumen'])[1]")
    WebElement btnChooseFileUploadNewDocumentListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditListDocumentData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditListDocumentData;

    @FindBy(xpath = "(//button)[25]")
    WebElement btnDeleteListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmDeleteListDocument;







    public void TabDocument() { tabDocument.click();}
    public String getTxtDocument(){return txtDocument.getText();}
    public void TabDocumentReport() { tabDocumentReport.click();}
    public String getTxtDocumentReport(){return txtDocumentReport.getText();}
    public void InputMonthDocumentMasterDocumentNumber(String inputMonthDocumentMasterDocumentNumber) { this.inputMonthDocumentMasterDocumentNumber.sendKeys(inputMonthDocumentMasterDocumentNumber);}
    public void BtnDownloadDocumentMasterDocumentNumber() { btnDownloadDocumentMasterDocumentNumber.click();}
    public void TabDocumentNumber() { tabDocumentNumber.click();}
    public String getTxtDocumentNumberPage(){return txtDocumentNumberPage.getText();}
    public void BtnCreateDocumentNumberDocument() { btnCreateDocumentNumberDocument.click();}
    public void InputMasterDocumentNameDocument(String inputMasterDocumentNameDocument) { this.inputMasterDocumentNameDocument.sendKeys(inputMasterDocumentNameDocument);}
    public void InputFormatDocumentNumberDocument(String inputFormatDocumentNumberDocument) { this.inputFormatDocumentNumberDocument.sendKeys(inputFormatDocumentNumberDocument);}
    public void BtnSaveDocumentNumberDocument() { btnSaveDocumentNumberDocument.click();}
    public void BtnConfirmSaveDocumentNumberDocument() { btnConfirmSaveDocumentNumberDocument.click();}
    public void BtnEditDocumentNumber() { btnEditDocumentNumber.click();}
    public void ClearInputMasterDocumentNameDocument() { inputMasterDocumentNameDocument.clear();}
    public void BtnSaveEditDocumentNumberData() { btnSaveEditDocumentNumberData.click();}
    public void BtnConfirmSaveEditDocumentNumberData() { btnConfirmSaveEditDocumentNumberData.click();}
    public void BtnDeleteDocumentNumber() { btnDeleteDocumentNumber.click();}
    public void BtnConfirmDeleteDocumentNumber() { btnConfirmDeleteDocumentNumber.click();}
    public void TabListDocument() { tabListDocument.click();}
    public String getTxtListDocumentPage(){return txtListDocumentPage.getText();}
    public void BtnCreateListDocument() { btnCreateListDocument.click();}
    public void BtnSelectMasterDocumentNameListDocument() { btnSelectMasterDocumentNameListDocument.click();}
    public void SelectMasterDocumentNameListDocument() { selectMasterDocumentNameListDocument.click();}
    public void InputDocumentNameListDocument(String inputDocumentNameListDocument) { this.inputDocumentNameListDocument.sendKeys(inputDocumentNameListDocument);}
    public void BtnSaveListDocument() { btnSaveListDocument.click();}
    public void BtnConfirmSaveListDocument() { btnConfirmSaveListDocument.click();}
    public void BtnUploadListDocument() { btnUploadListDocument.click();}
    public void BtnChooseFileListDocument(String btnChooseFileListDocument) { this.btnChooseFileListDocument.sendKeys(btnChooseFileListDocument);}
    public void BtnSaveUploadListDocument() { btnSaveUploadListDocument.click();}
    public void BtnConfirmSaveUploadListDocument() { btnConfirmSaveUploadListDocument.click();}
    public void BtnEditListDocument() { btnEditListDocument.click();}
    public void BtnChooseFileUploadNewDocumentListDocument(String btnChooseFileUploadNewDocumentListDocument) { this.btnChooseFileUploadNewDocumentListDocument.sendKeys(btnChooseFileUploadNewDocumentListDocument);}
    public void BtnSaveEditListDocumentData() { btnSaveEditListDocumentData.click();}
    public void BtnConfirmSaveEditListDocumentData() { btnConfirmSaveEditListDocumentData.click();}
    public void BtnDeleteListDocument() { btnDeleteListDocument.click();}
    public void BtnConfirmDeleteListDocument() { btnConfirmDeleteListDocument.click();}
}
