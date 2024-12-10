package org.example.pages;

import org.example.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProcurementPage {
    public ProcurementPage() {
        WebDriver driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[normalize-space()='Procurement'])[1]")
    WebElement tabProcurement;

    @FindBy(xpath = "(//h1[normalize-space()='Purchase Requisition'])[1]")
    WebElement txtProcurementDashboardPage;

    @FindBy(xpath = "(//span[normalize-space()='PR Report'])[1]")
    WebElement tabProcurementReport;

    @FindBy(xpath = "(//h1[normalize-space()='PR Report'])[1]")
    WebElement txtProcurementReportPage;

    @FindBy(xpath = "(//input[@id='month'])[1]")
    WebElement btnMonthRoReport;

    @FindBy(xpath = "(//a[normalize-space()='EXCEL'])[1]")
    WebElement btnDownloadRoReport;

    @FindBy(xpath = "(//button[normalize-space()='RO Complete'])[1]")
    WebElement tabRoCompleteReport;

    @FindBy(xpath = "(//input[@id='month'])[1]")
    WebElement btnMonthRoCompleteReport;

    @FindBy(xpath = "(//a[normalize-space()='EXCEL'])[1]")
    WebElement btnDownloadRoCompleteReport;

    @FindBy(xpath = "(//span[normalize-space()='Request Order'])[1]")
    WebElement tabRequestOrder;

    @FindBy(xpath = "(//h1[normalize-space()='Request Order'])[1]")
    WebElement txtRequestOrderPage;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreateRequestOrder;

    @FindBy(xpath = "(//select[@id='nmVendor'])[1]")
    WebElement btnSelectVendorNameRequestOrder;

    @FindBy(xpath = "(//option[@value='Joyko'])[1]")
    WebElement selectVendorNameRequestOrder;

    @FindBy(xpath = "(//select[@id='nmCabang'])[1]")
    WebElement btnSelectOfficeLocationNameRequestOrder;

    @FindBy(xpath = "(//option[@value='Ariyanto Arnaldo Legal & Tax Revenue'])[1]")
    WebElement selectOfficeLocationNameRequestOrder;

    @FindBy(xpath = "(//textarea[@placeholder='Description'])[1]")
    WebElement inputDescriptionRequestOrder;

    @FindBy(xpath = "(//textarea[@placeholder='Remark'])[1]")
    WebElement inputRemarkRequestOrder;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectSubmittedByRequestOrder;

    @FindBy(xpath = "(//div[contains(text(),'Abdullatif')])[1]")
    WebElement selectSubmittedByRequestOrder;

    @FindBy(xpath = "(//button[@class='btn bg-black variant-filled'])[1]")
    WebElement btnConfirmSelectedSubmittedByRequestOrder;

    @FindBy(xpath = "(//button[normalize-space()='Select Item'])[1]")
    WebElement btnSelectItemRequestOrder;

    @FindBy(xpath = "(//small[normalize-space()='(ITM-0001)'])[1]")
    WebElement selectItemRequestOrder;

    @FindBy(xpath = "(//button[@class='btn bg-black variant-filled'])[1]")
    WebElement btnConfirmSelectedItemRequestOrder;

    @FindBy(xpath = "(//input[@id='ID Tambah'])[4]")
    WebElement inputQtyItemRequestOrder;

    @FindBy(xpath = "(//input[contains(@placeholder,'Type here')])[5]")
    WebElement inputPriceItemRequestOrder;

    @FindBy(xpath = "(//input[@id='ID Tambah'])[5]")
    WebElement inputRemarkItemRequestOrder;

    @FindBy(xpath = "(//button[normalize-space()='Upload'])[1]")
    WebElement btnUploadDocumentsQuotationRequestOrder;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveRequestOrderData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveRequestOrderData;

    @FindBy(xpath = "(//a)[50]")
    WebElement btnEditRequestOrder;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditRequestOrderData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditRequestOrderData;

    @FindBy(xpath = "(//a[contains(text(),'Approval')])[1]")
    WebElement btnApprovalFdRequestOrder;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnSelectApprovalFdRequestOrder;

    @FindBy(xpath = "(//option[@value='approve'])[1]")
    WebElement selectApprovalFdRequestOrder;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveApprovalFdRequestOrder;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveApprovalFdRequestOrder;

    @FindBy(xpath = "(//a[contains(text(),'Approval')])[3]")
    WebElement btnApprovalDirectorRequestOrder;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnSelectApprovalDirectorRequestOrder;

    @FindBy(xpath = "(//option[@value='approve'])[1]")
    WebElement selectApprovalDirectorRequestOrder;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveApprovalDirectorRequestOrder;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveApprovalDirectorRequestOrder;

    @FindBy(xpath = "(//a[normalize-space()='Upload Receipt'])[1]")
    WebElement btnUploadReceiptRequestOrder;

    @FindBy(xpath = "(//button[normalize-space()='Upload'])[1]")
    WebElement btnUploadDocumentsFakturPaymentRequestOrder;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveUploadReceiptRequestOrder;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveUploadReceiptRequestOrder;

    @FindBy(xpath = "(//a[normalize-space()='Upload Receipt'])[1]")
    WebElement btnPaidPaymentReceiptRequestOrder;

    @FindBy(xpath = "(//button[normalize-space()='Upload'])[1]")
    WebElement btnUploadDocumentsFakturDeliveryRequestOrder;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveUploadReceiptPaidPaymentRequestOrder;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveUploadReceiptPaidPaymentRequestOrder;

    @FindBy(xpath = "(//a[normalize-space()='Delivered'])[1]")
    WebElement btnDeliveredRequestOrder;

    @FindBy(xpath = "(//button[normalize-space()='Complete'])[1]")
    WebElement btnCompleteDeliveredRequestOrder;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmCompleteDeliveredRequestOrder;

    @FindBy(xpath = "(//span[normalize-space()='RO Complete'])[1]")
    WebElement tabRoCompleteProcurement;

    @FindBy(xpath = "(//h1[normalize-space()='Request Order Complete'])[1]")
    WebElement txtRoCompletedProcurementPage;

    @FindBy(xpath = "(//a)[46]")
    WebElement btnViewCompletedRequestOrder;

    @FindBy(xpath = "(//h1[normalize-space()='View Request Order PR2408120001'])[1]")
    WebElement txtViewCompletedRequestOrderPage;

    @FindBy(xpath = "(//a[normalize-space()='Back'])[1]")
    WebElement btnBackProcurementCompletedRequestOrderList;













    public void TabProcurement() { tabProcurement.click();}
    public String getTxtProcurementDashboardPage(){return txtProcurementDashboardPage.getText();}
    public void TabProcurementReport() { tabProcurementReport.click();}
    public String getTxtProcurementReportPage(){return txtProcurementReportPage.getText();}
    public void BtnMonthRoReport(String btnMonthRoReport) { this.btnMonthRoReport.sendKeys(btnMonthRoReport);}
    public void BtnDownloadRoReport() { btnDownloadRoReport.click();}
    public void TabRoCompleteReport() { tabRoCompleteReport.click();}
    public void BtnMonthRoCompleteReport(String btnMonthRoCompleteReport) { this.btnMonthRoCompleteReport.sendKeys(btnMonthRoCompleteReport);}
    public void BtnDownloadRoCompleteReport() { btnDownloadRoCompleteReport.click();}
    public void TabRequestOrder() { tabRequestOrder.click();}
    public String getTxtRequestOrderPage(){return txtRequestOrderPage.getText();}
    public void BtnCreateRequestOrder() { btnCreateRequestOrder.click();}
    public void BtnSelectVendorNameRequestOrder() { btnSelectVendorNameRequestOrder.click();}
    public void SelectVendorNameRequestOrder() { selectVendorNameRequestOrder.click();}
    public void BtnSelectOfficeLocationNameRequestOrder() { btnSelectOfficeLocationNameRequestOrder.click();}
    public void SelectOfficeLocationNameRequestOrder() { selectOfficeLocationNameRequestOrder.click();}
    public void InputDescriptionRequestOrder(String inputDescriptionRequestOrder) { this.inputDescriptionRequestOrder.sendKeys(inputDescriptionRequestOrder);}
    public void InputRemarkRequestOrder(String inputRemarkRequestOrder) { this.inputRemarkRequestOrder.sendKeys(inputRemarkRequestOrder);}
    public void BtnSelectSubmittedByRequestOrder() { btnSelectSubmittedByRequestOrder.click();}
    public void SelectSubmittedByRequestOrder() { selectSubmittedByRequestOrder.click();}
    public void BtnConfirmSelectedSubmittedByRequestOrder() { btnConfirmSelectedSubmittedByRequestOrder.click();}
    public void BtnSelectItemRequestOrder() { btnSelectItemRequestOrder.click();}
    public void SelectItemRequestOrder() { selectItemRequestOrder.click();}
    public void BtnConfirmSelectedItemRequestOrder() { btnConfirmSelectedItemRequestOrder.click();}
    public void InputQtyItemRequestOrder(String inputQtyItemRequestOrder) { this.inputQtyItemRequestOrder.sendKeys(inputQtyItemRequestOrder);}
    public void InputPriceItemRequestOrder(String inputPriceItemRequestOrder) { this.inputPriceItemRequestOrder.sendKeys(inputPriceItemRequestOrder);}
    public void InputRemarkItemRequestOrder(String inputRemarkItemRequestOrder) { this.inputRemarkItemRequestOrder.sendKeys(inputRemarkItemRequestOrder);}
    public void BtnUploadDocumentsQuotationRequestOrder(String btnUploadDocumentsQuotationRequestOrder) { this.btnUploadDocumentsQuotationRequestOrder.sendKeys(btnUploadDocumentsQuotationRequestOrder);}
    public void BtnSaveRequestOrderData() { btnSaveRequestOrderData.click();}
    public void BtnConfirmSaveRequestOrderData() { btnConfirmSaveRequestOrderData.click();}
    public void BtnEditRequestOrder() { btnEditRequestOrder.click();}
    public void ClearInputDescriptionRequestOrder() { inputDescriptionRequestOrder.clear();}
    public void BtnSaveEditRequestOrderData() { btnSaveEditRequestOrderData.click();}
    public void BtnConfirmSaveEditRequestOrderData() { btnConfirmSaveEditRequestOrderData.click();}
    public void BtnApprovalFdRequestOrder() { btnApprovalFdRequestOrder.click();}
    public void BtnSelectApprovalFdRequestOrder() { btnSelectApprovalFdRequestOrder.click();}
    public void SelectApprovalFdRequestOrder() { selectApprovalFdRequestOrder.click();}
    public void BtnSaveApprovalFdRequestOrder() { btnSaveApprovalFdRequestOrder.click();}
    public void BtnConfirmSaveApprovalFdRequestOrder() { btnConfirmSaveApprovalFdRequestOrder.click();}
    public void BtnApprovalDirectorRequestOrder() { btnApprovalDirectorRequestOrder.click();}
    public void BtnSelectApprovalDirectorRequestOrder() { btnSelectApprovalDirectorRequestOrder.click();}
    public void SelectApprovalDirectorRequestOrder() { selectApprovalDirectorRequestOrder.click();}
    public void BtnSaveApprovalDirectorRequestOrder() { btnSaveApprovalDirectorRequestOrder.click();}
    public void BtnConfirmSaveApprovalDirectorRequestOrder() { btnConfirmSaveApprovalDirectorRequestOrder.click();}
    public void BtnUploadReceiptRequestOrder() { btnUploadReceiptRequestOrder.click();}
    public void BtnUploadDocumentsFakturPaymentRequestOrder(String btnUploadDocumentsFakturPaymentRequestOrder) { this.btnUploadDocumentsFakturPaymentRequestOrder.sendKeys(btnUploadDocumentsFakturPaymentRequestOrder);}
    public void BtnSaveUploadReceiptRequestOrder() { btnSaveUploadReceiptRequestOrder.click();}
    public void BtnConfirmSaveUploadReceiptRequestOrder() { btnConfirmSaveUploadReceiptRequestOrder.click();}
    public void BtnPaidPaymentReceiptRequestOrder() { btnPaidPaymentReceiptRequestOrder.click();}
    public void BtnUploadDocumentsFakturDeliveryRequestOrder(String btnUploadDocumentsFakturDeliveryRequestOrder) { this.btnUploadDocumentsFakturDeliveryRequestOrder.sendKeys(btnUploadDocumentsFakturDeliveryRequestOrder);}
    public void BtnSaveUploadReceiptPaidPaymentRequestOrder() { btnSaveUploadReceiptPaidPaymentRequestOrder.click();}
    public void BtnConfirmSaveUploadReceiptPaidPaymentRequestOrder() { btnConfirmSaveUploadReceiptPaidPaymentRequestOrder.click();}
    public void BtnDeliveredRequestOrder() { btnDeliveredRequestOrder.click();}
    public void BtnCompleteDeliveredRequestOrder() { btnCompleteDeliveredRequestOrder.click();}
    public void BtnConfirmCompleteDeliveredRequestOrder() { btnConfirmCompleteDeliveredRequestOrder.click();}
    public void TabRoCompleteProcurement() { tabRoCompleteProcurement.click();}
    public String getTxtRoCompletedProcurementPage(){return txtRoCompletedProcurementPage.getText();}
    public void BtnViewCompletedRequestOrder() { btnViewCompletedRequestOrder.click();}
    public String getTxtViewCompletedRequestOrderPage(){return txtViewCompletedRequestOrderPage.getText();}
    public void BtnBackProcurementCompletedRequestOrderList() { btnBackProcurementCompletedRequestOrderList.click();}
}
