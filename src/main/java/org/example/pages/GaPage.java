package org.example.pages;

import org.example.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GaPage {
    public GaPage() {
        WebDriver driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[normalize-space()='GA'])[1]")
    WebElement tabGa;

    @FindBy(xpath = "(//h1[normalize-space()='General Affair'])[1]")
    WebElement txtGa;

    @FindBy(xpath = "(//span[normalize-space()='GA Report'])[1]")
    WebElement tabGaReport;

    @FindBy(xpath = "(//h1[normalize-space()='GA Report'])[1]")
    WebElement txtGaReport;

    @FindBy(xpath = "(//input[@id='month'])[1]")
    WebElement btnMonthMaintenanceReport;

    @FindBy(xpath = "(//a[normalize-space()='EXCEL'])[1]")
    WebElement btnDownloadMaintenanceReport;

    @FindBy(xpath = "(//button[normalize-space()='Asset'])[1]")
    WebElement tabAssetReport;

    @FindBy(xpath = "(//a[normalize-space()='EXCEL'])[1]")
    WebElement btnDownloadAssetReport;

    @FindBy(xpath = "(//button[normalize-space()='Stock Consumable'])[1]")
    WebElement tabStockConsumableReport;

    @FindBy(xpath = "(//a[normalize-space()='EXCEL'])[1]")
    WebElement btnDownloadStockConsumableReport;

    @FindBy(xpath = "(//button[normalize-space()='Master Document Number'])[1]")
    WebElement tabMovingStockReport;

    @FindBy(xpath = "(//a[normalize-space()='EXCEL'])[1]")
    WebElement btnDownloadMovingStockReport;

    @FindBy(xpath = "(//button[normalize-space()='Master Document Number'])[1]")
    WebElement tabGaMasterDocumentNumber;

    @FindBy(xpath = "(//input[@id='month'])[1]")
    WebElement inputMonthGaMasterDocumentNumber;

    @FindBy(xpath = "(//a[normalize-space()='EXCEL'])[1]")
    WebElement btnDownloadGaMasterDocumentNumber;

    @FindBy(xpath = "(//span[normalize-space()='Master GA'])[1]")
    WebElement tabMasterGa;

    @FindBy(xpath = "(//h1[normalize-space()='Master GA'])[1]")
    WebElement txtMasterGa;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreateCategoryMasterGa;

    @FindBy(xpath = "(//input[@id='nm_kategori'])[1]")
    WebElement inputCategoryNameMasterGa;

    @FindBy(xpath = "(//input[@id='nm_kategori'])[2]")
    WebElement inputPrefixCategoryMasterGA;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveCategoryMasterGa;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveCategoryMasterGa;

    @FindBy(xpath = "(//a)[60]")
    WebElement btnEditMasterGaCategory;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditMasterGaCategory;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditMasterGaCategory;

    @FindBy(xpath = "(//a)[47]")
    WebElement btnViewMasterGaCategory;

    @FindBy(xpath = "(//h1[normalize-space()='View Category'])[1]")
    WebElement txtViewMasterGaCategory;

    @FindBy(xpath = "(//a[normalize-space()='Back'])[1]")
    WebElement btnBackMasterGaPage;

    @FindBy(xpath = "(//button)[17]")
    WebElement btnDeleteMasterGaCategory;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmDeleteMasterGaCategory;

    @FindBy(xpath = "(//button[normalize-space()='Brand'])[1]")
    WebElement tabBrandMasterGa;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreateBrandMasterGa;

    @FindBy(xpath = "(//input[@id='nm_merk'])[1]")
    WebElement inputBrandNameMasterGa;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveBrandMasterGa;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveBrandMasterGa;

    @FindBy(xpath = "(//a)[48]")
    WebElement btnEditMasterGaBrand;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditMasterGaBrand;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditMasterGaBrand;

    @FindBy(xpath = "(//a)[47]")
    WebElement btnViewMasterGaBrand;

    @FindBy(xpath = "(//h1[normalize-space()='View Brand'])[1]")
    WebElement txtViewMasterGaBrand;

    @FindBy(xpath = "(//button)[25]")
    WebElement btnDeleteMasterGaBrand;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmDeleteMasterGaBrand;

    @FindBy(xpath = "(//button[normalize-space()='Type'])[1]")
    WebElement tabTypeMasterGa;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreateTypeMasterGa;

    @FindBy(xpath = "(//input[@id='nm_jenis'])[1]")
    WebElement inputTypeNameMasterGa;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveTypeMasterGa;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveTypeMasterGa;

    @FindBy(xpath = "(//a)[48]")
    WebElement btnEditMasterGaType;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditMasterGaType;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditMasterGaType;

    @FindBy(xpath = "(//a)[49]")
    WebElement btnViewMasterGaType;

    @FindBy(xpath = "(//h1[normalize-space()='Edit Type'])[1]")
    WebElement txtViewMasterGaType;

    @FindBy(xpath = "(//button)[15]")
    WebElement btnDeleteMasterGaType;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmDeleteMasterGaType;

    @FindBy(xpath = "(//span[normalize-space()='Asset Data'])[1]")
    WebElement tabAssetData;

    @FindBy(xpath = "(//li[normalize-space()='Asset Data'])[1]")
    WebElement txtAssetData;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreateAssetData;

    @FindBy(xpath = "(//input[@value='IT'])[1]")
    WebElement checklistTypeAssetAssetData;

    @FindBy(xpath = "(//input[@id='nm_aset'])[1]")
    WebElement inputAssetNameAssetData;

    @FindBy(xpath = "(//select[@id='category'])[1]")
    WebElement btnSelectCategoryAssetData;

    @FindBy(xpath = "(//option[@value='Elektronik'])[1]")
    WebElement selectCategoryAssetData;

    @FindBy(xpath = "(//select[@id='merk'])[1]")
    WebElement btnSelectMerkAssetData;

    @FindBy(xpath = "(//option[@value='Samsung'])[1]")
    WebElement selectMerkAssetData;

    @FindBy(xpath = "(//select[@id='jenis'])[1]")
    WebElement btnSelectTypeAssetData;

    @FindBy(xpath = "(//option[@value='-'][normalize-space()='-'])[2]")
    WebElement selectTypeAssetData;

    @FindBy(xpath = "(//input[@id='nm_aset'])[2]")
    WebElement inputSerialAssetData;

    @FindBy(xpath = "(//select[@id='lokasi'])[1]")
    WebElement btnSelectLocationAssetData;

    @FindBy(xpath = "(//option[@value='Equity (CV Ariyanto Arnaldo Law Firm)'])[1]")
    WebElement selectLocationAssetData;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnStatusAssetData;

    @FindBy(xpath = "(//option[@value='In Use'])[1]")
    WebElement selectStatusAssetData;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSearchUserAssetData;

    @FindBy(xpath = "(//option[@value='0e508d04-7882-11ee-8e60-00163e01cb9b'])[1]")
    WebElement selectUserAssetData;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectUserAssetData;

    @FindBy(xpath = "(//input[@placeholder='Conversion value'])[1]")
    WebElement inputPurchasePriceAssetData;

    @FindBy(xpath = "(//input[@placeholder='Purchase date'])[1]")
    WebElement btnPurchaseDateAssetData;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    WebElement btnTodayPurchaseDateAssetData;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveAssetData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveAssetData;

    @FindBy(xpath = "(//a)[48]")
    WebElement btnEditAssetData;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditAssetData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditAssetData;

    @FindBy(xpath = "(//a)[47]")
    WebElement btnViewAssetData;

    @FindBy(xpath = "(//h1[normalize-space()='View Asset Data'])[1]")
    WebElement txtViewAssetData;

    @FindBy(xpath = "(//button[normalize-space()='Back'])[1]")
    WebElement btnBackViewAssetData;

    @FindBy(xpath = "(//button)[24]")
    WebElement btnDeleteAssetData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmDeleteAssetData;

    @FindBy(xpath = "(//span[normalize-space()='Asset Maintenance'])[1]")
    WebElement tabAssetMaintenance;

    @FindBy(xpath = "(//h1[normalize-space()='Asset Maintenance'])[1]")
    WebElement txtAssetMaintenance;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreateAssetMaintenance;

    @FindBy(xpath = "(//button[normalize-space()='Search Asset'])[1]")
    WebElement btnSearchAssetMaintenance;

    @FindBy(xpath = "(//option[@value='AST-0001'])[1]")
    WebElement selectAssetForMaintenance;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectAssetForMaintenance;

    @FindBy(xpath = "(//input[@placeholder='Date'])[1]")
    WebElement btnDateAssetMaintenance;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    WebElement btnTodayDateAssetMaintenance;

    @FindBy(xpath = "(//textarea[@placeholder='Information'])[1]")
    WebElement inputInformationAssetMaintenance;

    @FindBy(xpath = "(//input[@id='lokasi'])[1]")
    WebElement inputVendorLocationAssetMaintenance;

    @FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
    WebElement btnAddEstimatedCostsAssetMaintenance;

    @FindBy(xpath = "(//input[@name='keterangan'])[1]")
    WebElement inputInformationEstimatedCostsAssetMaintenance;

    @FindBy(xpath = "(//input[@name='kebutuhanLain'])[1]")
    WebElement inputTotalCostEstimatedCostsAssetMaintenance;

    @FindBy(xpath = "(//button[normalize-space()='Upload'])[1]")
    WebElement uploadProofOfPaymentEstimatedCostsAssetMaintenance;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveAssetMaintenance;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveAssetMaintenance;

    @FindBy(xpath = "(//a)[47]")
    WebElement btnEditAssetMaintenance;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditAssetMaintenance;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditAssetMaintenance;

    @FindBy(xpath = "(//button)[16]")
    WebElement btnDeleteAssetMaintenance;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmDeleteAssetMaintenance;

    @FindBy(xpath = "(//span[normalize-space()='Master Consumable'])[1]")
    WebElement tabMasterConsumable;

    @FindBy(xpath = "(//h1[normalize-space()='Master Consumable'])[1]")
    WebElement txtMasterConsumable;

    @FindBy(xpath = "(//a[normalize-space()='Add Item'])[1]")
    WebElement btnAddMasterConsumable;

    @FindBy(xpath = "(//input[@id='nm_item'])[1]")
    WebElement inputItemNameMasterConsumable;

    @FindBy(xpath = "(//input[@id='satuan_item'])[1]")
    WebElement inputItemUnitMasterConsumable;

    @FindBy(xpath = "(//select[@id='kategori'])[1]")
    WebElement btnSelectCategoryMasterConsumable;

    @FindBy(xpath = "(//option[@value='Perlengkapan'])[1]")
    WebElement selectCategoryMasterConsumable;

    @FindBy(xpath = "(//select[@id='jenis'])[1]")
    WebElement btnSelectTypeMasterConsumable;

    @FindBy(xpath = "(//option[@value='-'])[1]")
    WebElement selectTypeMasterConsumable;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveMasterConsumable;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveMasterConsumable;

    @FindBy(xpath = "(//a)[47]")
    WebElement btnViewMasterConsumable;

    @FindBy(xpath = "(//h1[normalize-space()='View Master Consumable'])[1]")
    WebElement txtViewMasterConsumable;

    @FindBy(xpath = "(//a[normalize-space()='Back'])[1]")
    WebElement btnBackViewMasterConsumable;

    @FindBy(xpath = "(//span[normalize-space()='Consumable'])[1]")
    WebElement tabConsumable;

    @FindBy(xpath = "(//h1[normalize-space()='Consumable'])[1]")
    WebElement txtConsumablePage;

    @FindBy(xpath = "(//a[normalize-space()='Add Stock'])[1]")
    WebElement btnAddStockConsumable;

    @FindBy(xpath = "(//input[@placeholder='Purchase Date'])[1]")
    WebElement btnPurchaseDateAddStock;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    WebElement btnTodayDateAddStock;

    @FindBy(xpath = "(//button[normalize-space()='Select Item'])[1]")
    WebElement btnSelectItemConsumable;

    @FindBy(xpath = "(//small[normalize-space()='(ITM-0003)'])[1]")
    WebElement selectItemConsumable;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectAddItemConsumable;

    @FindBy(xpath = "(//input[@id='ID Tambah'])[3]")
    WebElement inputTotalAddStockConsumable;

    @FindBy(xpath = "(//button[normalize-space()='Upload'])[1]")
    WebElement btnUploadInvoiceAddStockConsumable;

    @FindBy(xpath = "(//select[@id='jenis'])[1]")
    WebElement btnChooseLocationAddStock;

    @FindBy(xpath = "(//option[@value='Equity (CV Ariyanto Arnaldo Law Firm)'])[1]")
    WebElement selectLocationAddStockConsumable;

    @FindBy(xpath = "(//textarea[@id='ket'])[1]")
    WebElement inputNoteAddStockConsumable;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveAddStockConsumable;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveAddStockConsumable;

    @FindBy(xpath = "(//a)[51]")
    WebElement btnEditAddStock;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditAddStock;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditAddStock;

    @FindBy(xpath = "(//a[normalize-space()='Consume'])[1]")
    WebElement btnConsume;

    @FindBy(xpath = "(//input[@placeholder='Date of item departure'])[1]")
    WebElement btnDateOfItemDepartureConsume;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    WebElement btnTodayDateOfItemDeparture;

    @FindBy(xpath = "(//button[normalize-space()='Select Item'])[1]")
    WebElement btnSelectItemConsume;

    @FindBy(xpath = "(//small[normalize-space()='(ITM-0002)'])[1]")
    WebElement selectItemConsume;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectAddItemConsume;

    @FindBy(xpath = "(//input[@id='Jumlah'])[1]")
    WebElement inputTotalConsume;

    @FindBy(xpath = "(//button[normalize-space()='Select PIC'])[1]")
    WebElement btnSelectPicConsume;

    @FindBy(xpath = "(//div[contains(text(),'Agus Senoaji')])[1]")
    WebElement selectPicConsume;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnConfirmSelectPicConsume;

    @FindBy(xpath = "(//select[@id='jenis'])[1]")
    WebElement btnSelectLocationConsume;

    @FindBy(xpath = "(//option[@value='Equity (CV Ariyanto Arnaldo Law Firm)'])[1]")
    WebElement selectLocationConsume;

    @FindBy(xpath = "(//textarea[@id='ket'])[1]")
    WebElement inputNoteConsume;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveConsumeData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveConsumeData;

    @FindBy(xpath = "(//a[normalize-space()='Moving Stock'])[1]")
    WebElement btnMovingStock;

    @FindBy(xpath = "(//input[@placeholder='Date'])[1]")
    WebElement btnDateMovingStock;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    WebElement btnTodayDateMovingStock;

    @FindBy(xpath = "(//select[@id='jenis'])[1]")
    WebElement btnSelectIntialLocationMovingStock;

    @FindBy(xpath = "(//option[@value='Equity (CV Ariyanto Arnaldo Law Firm)'][normalize-space()='Equity (CV Ariyanto Arnaldo Law Firm)'])[1]")
    WebElement selectIntialLocationMovingStock;

    @FindBy(xpath = "(//button[normalize-space()='Select Item'])[1]")
    WebElement btnSelectItemMovingStock;

    @FindBy(xpath = "(//small[normalize-space()='(ITM-0002)'])[1]")
    WebElement selectItemMovingStock;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnConfirmSelectItemMovingStock;

    @FindBy(xpath = "(//input[@id='total'])[1]")
    WebElement inputTotalMovingStock;

    @FindBy(xpath = "(//select[@id='jenis'])[2]")
    WebElement btnSelectRelocationMovingStock;

    @FindBy(xpath = "(//option[@value='Ariyanto Arnaldo Legal & Tax Revenue'][normalize-space()='Ariyanto Arnaldo Legal & Tax Revenue'])[2]")
    WebElement selectRelocationMovingStock;

    @FindBy(xpath = "(//textarea[@id='ket'])[1]")
    WebElement inputNoteMovingStock;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveMovingStockData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveMovingStockData;

    @FindBy(xpath = "(//a[contains(@href,'/ga/document')])[1]")
    WebElement tabGaDocument;

    @FindBy(xpath = "(//h1[normalize-space()='Document'])[1]")
    WebElement txtGaDocumentPage;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreateGaDocumentNumber;

    @FindBy(xpath = "(//input[@id='note'])[1]")
    WebElement inputGaMasterDocumentName;

    @FindBy(xpath = "(//input[@id='number'])[1]")
    WebElement inputGaFormatDocumentNumber;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveGaDocumentNumber;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveGaDocumentNumber;

    @FindBy(xpath = "(//a[@class=' btn-icon btn-icon-sm '])[1]")
    WebElement btnEditGaDocumentNumber;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditGaDocumentNumberData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditGaDocumentNumberData;

    @FindBy(xpath = "(//button[@class='btn-icon btn-icon-sm'])[1]")
    WebElement btnDeleteGaDocumentNumber;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmDeleteGaDocumentNumber;

    @FindBy(xpath = "(//button[normalize-space()='List Document'])[1]")
    WebElement tabGaListDocument;

    @FindBy(xpath = "(//li[normalize-space()='List Document'])[1]")
    WebElement txtGaListDocumentPage;

    @FindBy(xpath = "(//a[normalize-space()='Create'])[1]")
    WebElement btnCreateGaListDocument;

    @FindBy(xpath = "(//select[@class='select select-sm'])[1]")
    WebElement btnSelectMasterDocumentNameGaListDocument;

    @FindBy(xpath = "(//option[@value='Purchase Request'])[1]")
    WebElement selectMasterDocumentNameGaListDocument;

    @FindBy(xpath = "(//input[@id='keterangan'])[1]")
    WebElement inputDocumentNameGaListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnSaveGaListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveGaListDocument;

    @FindBy(xpath = "(//a[contains(text(),'Upload')])[5]")
    WebElement btnUploadGaListDocument;

    @FindBy(xpath = "(//input[@id='dokumen'])[1]")
    WebElement btnChooseFileGaListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Upload'])[1]")
    WebElement btnSaveUploadGaListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveUploadGaListDocument;

    @FindBy(xpath = "(//a)[60]")
    WebElement btnEditGaListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditGaListDocumentData;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditGaListDocumentData;

    @FindBy(xpath = "(//button)[19]")
    WebElement btnDeleteGaListDocument;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmDeleteGaListDocument;












    public void TabGa() { tabGa.click();}
    public String getTxtGa(){return txtGa.getText();}
    public void TabGaReport() { tabGaReport.click();}
    public String getTxtGaReport(){return txtGaReport.getText();}
    public void BtnMonthMaintenanceReport(String btnMonthMaintenanceReport) { this.btnMonthMaintenanceReport.sendKeys(btnMonthMaintenanceReport);}
    public void BtnDownloadMaintenanceReport() { btnDownloadMaintenanceReport.click();}
    public void TabAssetReport() { tabAssetReport.click();}
    public void BtnDownloadAssetReport() { btnDownloadAssetReport.click();}
    public void TabStockConsumableReport() { tabStockConsumableReport.click();}
    public void BtnDownloadStockConsumableReport() { btnDownloadStockConsumableReport.click();}
    public void TabMovingStockReport() { tabMovingStockReport.click();}
    public void BtnDownloadMovingStockReport() { btnDownloadMovingStockReport.click();}
    public void TabGaMasterDocumentNumber() { tabGaMasterDocumentNumber.click();}
    public void InputMonthGaMasterDocumentNumber(String inputMonthGaMasterDocumentNumber) { this.inputMonthGaMasterDocumentNumber.sendKeys(inputMonthGaMasterDocumentNumber);}
    public void BtnDownloadGaMasterDocumentNumber() { btnDownloadGaMasterDocumentNumber.click();}
    public void TabMasterGa() { tabMasterGa.click();}
    public String getTxtMasterGa(){return txtMasterGa.getText();}
    public void BtnCreateCategoryMasterGa() { btnCreateCategoryMasterGa.click();}
    public void InputCategoryNameMasterGa(String inputCategoryNameMasterGa) { this.inputCategoryNameMasterGa.sendKeys(inputCategoryNameMasterGa);}
    public void InputPrefixCategoryMasterGA(String inputPrefixCategoryMasterGA) { this.inputPrefixCategoryMasterGA.sendKeys(inputPrefixCategoryMasterGA);}
    public void BtnSaveCategoryMasterGa() { btnSaveCategoryMasterGa.click();}
    public void BtnConfirmSaveCategoryMasterGa() { btnConfirmSaveCategoryMasterGa.click();}
    public void BtnEditMasterGaCategory() { btnEditMasterGaCategory.click();}
    public void ClearInputPrefixCategoryMasterGA() { inputPrefixCategoryMasterGA.clear();}
    public void BtnSaveEditMasterGaCategory() { btnSaveEditMasterGaCategory.click();}
    public void BtnConfirmSaveEditMasterGaCategory() { btnConfirmSaveEditMasterGaCategory.click();}
    public void BtnViewMasterGaCategory() { btnViewMasterGaCategory.click();}
    public String getTxtViewMasterGaCategory(){return txtViewMasterGaCategory.getText();}
    public void BtnBackMasterGaPage() { btnBackMasterGaPage.click();}
    public void BtnDeleteMasterGaCategory() { btnDeleteMasterGaCategory.click();}
    public void BtnConfirmDeleteMasterGaCategory() { btnConfirmDeleteMasterGaCategory.click();}
    public void TabBrandMasterGa() { tabBrandMasterGa.click();}
    public void BtnCreateBrandMasterGa() { btnCreateBrandMasterGa.click();}
    public void InputBrandNameMasterGa(String inputBrandNameMasterGa) { this.inputBrandNameMasterGa.sendKeys(inputBrandNameMasterGa);}
    public void BtnSaveBrandMasterGa() { btnSaveBrandMasterGa.click();}
    public void BtnConfirmSaveBrandMasterGa() { btnConfirmSaveBrandMasterGa.click();}
    public void BtnEditMasterGaBrand() { btnEditMasterGaBrand.click();}
    public void ClearInputBrandNameMasterGa() { inputBrandNameMasterGa.clear();}
    public void BtnSaveEditMasterGaBrand() { btnSaveEditMasterGaBrand.click();}
    public void BtnConfirmSaveEditMasterGaBrand() { btnConfirmSaveEditMasterGaBrand.click();}
    public void BtnViewMasterGaBrand() { btnViewMasterGaBrand.click();}
    public String getTxtViewMasterGaBrand(){return txtViewMasterGaBrand.getText();}
    public void BtnDeleteMasterGaBrand() { btnDeleteMasterGaBrand.click();}
    public void BtnConfirmDeleteMasterGaBrand() { btnConfirmDeleteMasterGaBrand.click();}
    public void TabTypeMasterGa() { tabTypeMasterGa.click();}
    public void BtnCreateTypeMasterGa() { btnCreateTypeMasterGa.click();}
    public void InputTypeNameMasterGa(String inputTypeNameMasterGa) { this.inputTypeNameMasterGa.sendKeys(inputTypeNameMasterGa);}
    public void BtnSaveTypeMasterGa() { btnSaveTypeMasterGa.click();}
    public void BtnConfirmSaveTypeMasterGa() { btnConfirmSaveTypeMasterGa.click();}
    public void BtnEditMasterGaType() { btnEditMasterGaType.click();}
    public void ClearInputTypeNameMasterGa() { inputTypeNameMasterGa.clear();}
    public void BtnSaveEditMasterGaType() { btnSaveEditMasterGaType.click();}
    public void BtnConfirmSaveEditMasterGaType() { btnConfirmSaveEditMasterGaType.click();}
    public void BtnViewMasterGaType() { btnViewMasterGaType.click();}
    public String getTxtViewMasterGaType(){return txtViewMasterGaType.getText();}
    public void BtnDeleteMasterGaType() { btnDeleteMasterGaType.click();}
    public void BtnConfirmDeleteMasterGaType() { btnConfirmDeleteMasterGaType.click();}
    public void TabAssetData() { tabAssetData.click();}
    public String getTxtAssetData(){return txtAssetData.getText();}
    public void BtnCreateAssetData() { btnCreateAssetData.click();}
    public void ChecklistTypeAssetAssetData() { checklistTypeAssetAssetData.click();}
    public void InputAssetNameAssetData(String inputAssetNameAssetData) { this.inputAssetNameAssetData.sendKeys(inputAssetNameAssetData);}
    public void BtnSelectCategoryAssetData() { btnSelectCategoryAssetData.click();}
    public void SelectCategoryAssetData() { selectCategoryAssetData.click();}
    public void BtnSelectMerkAssetData() { btnSelectMerkAssetData.click();}
    public void SelectMerkAssetData() { selectMerkAssetData.click();}
    public void BtnSelectTypeAssetData() { btnSelectTypeAssetData.click();}
    public void SelectTypeAssetData() { selectTypeAssetData.click();}
    public void InputSerialAssetData(String inputSerialAssetData) { this.inputSerialAssetData.sendKeys(inputSerialAssetData);}
    public void BtnSelectLocationAssetData() { btnSelectLocationAssetData.click();}
    public void SelectLocationAssetData() { selectLocationAssetData.click();}
    public void BtnStatusAssetData() { btnStatusAssetData.click();}
    public void SelectStatusAssetData() { selectStatusAssetData.click();}
    public void BtnSearchUserAssetData() { btnSearchUserAssetData.click();}
    public void SelectUserAssetData() { selectUserAssetData.click();}
    public void BtnSelectUserAssetData() { btnSelectUserAssetData.click();}
    public void InputPurchasePriceAssetData(String inputPurchasePriceAssetData) { this.inputPurchasePriceAssetData.sendKeys(inputPurchasePriceAssetData);}
    public void BtnPurchaseDateAssetData() { btnPurchaseDateAssetData.click();}
    public void BtnTodayPurchaseDateAssetData() { btnTodayPurchaseDateAssetData.click();}
    public void BtnSaveAssetData() { btnSaveAssetData.click();}
    public void BtnConfirmSaveAssetData() { btnConfirmSaveAssetData.click();}
    public void BtnEditAssetData() { btnEditAssetData.click();}
    public void ClearInputSerialAssetData() { inputSerialAssetData.clear();}
    public void BtnSaveEditAssetData() { btnSaveEditAssetData.click();}
    public void BtnConfirmSaveEditAssetData() { btnConfirmSaveEditAssetData.click();}
    public void BtnViewAssetData() { btnViewAssetData.click();}
    public String getTxtViewAssetData(){return txtViewAssetData.getText();}
    public void BtnBackViewAssetData() { btnBackViewAssetData.click();}
    public void BtnDeleteAssetData() { btnDeleteAssetData.click();}
    public void BtnConfirmDeleteAssetData() { btnConfirmDeleteAssetData.click();}
    public void TabAssetMaintenance() { tabAssetMaintenance.click();}
    public String getTxtAssetMaintenance(){return txtAssetMaintenance.getText();}
    public void BtnCreateAssetMaintenance() { btnCreateAssetMaintenance.click();}
    public void BtnSearchAssetMaintenance() { btnSearchAssetMaintenance.click();}
    public void SelectAssetForMaintenance() { selectAssetForMaintenance.click();}
    public void BtnSelectAssetForMaintenance() { btnSelectAssetForMaintenance.click();}
    public void BtnDateAssetMaintenance() { btnDateAssetMaintenance.click();}
    public void BtnTodayDateAssetMaintenance() { btnTodayDateAssetMaintenance.click();}
    public void InputInformationAssetMaintenance(String inputInformationAssetMaintenance) { this.inputInformationAssetMaintenance.sendKeys(inputInformationAssetMaintenance);}
    public void InputVendorLocationAssetMaintenance(String inputVendorLocationAssetMaintenance) { this.inputVendorLocationAssetMaintenance.sendKeys(inputVendorLocationAssetMaintenance);}
    public void BtnAddEstimatedCostsAssetMaintenance() { btnAddEstimatedCostsAssetMaintenance.click();}
    public void InputInformationEstimatedCostsAssetMaintenance(String inputInformationEstimatedCostsAssetMaintenance) { this.inputInformationEstimatedCostsAssetMaintenance.sendKeys(inputInformationEstimatedCostsAssetMaintenance);}
    public void InputTotalCostEstimatedCostsAssetMaintenance(String inputTotalCostEstimatedCostsAssetMaintenance) { this.inputTotalCostEstimatedCostsAssetMaintenance.sendKeys(inputTotalCostEstimatedCostsAssetMaintenance);}
    public void UploadProofOfPaymentEstimatedCostsAssetMaintenance(String uploadProofOfPaymentEstimatedCostsAssetMaintenance) { this.uploadProofOfPaymentEstimatedCostsAssetMaintenance.sendKeys(uploadProofOfPaymentEstimatedCostsAssetMaintenance);}
    public void BtnSaveAssetMaintenance() { btnSaveAssetMaintenance.click();}
    public void BtnConfirmSaveAssetMaintenance() { btnConfirmSaveAssetMaintenance.click();}
    public void BtnEditAssetMaintenance() { btnEditAssetMaintenance.click();}
    public void ClearInputInformationAssetMaintenance() { inputInformationAssetMaintenance.clear();}
    public void BtnSaveEditAssetMaintenance() { btnSaveEditAssetMaintenance.click();}
    public void BtnConfirmSaveEditAssetMaintenance() { btnConfirmSaveEditAssetMaintenance.click();}
    public void BtnDeleteAssetMaintenance() { btnDeleteAssetMaintenance.click();}
    public void BtnConfirmDeleteAssetMaintenance() { btnConfirmDeleteAssetMaintenance.click();}
    public void TabMasterConsumable() { tabMasterConsumable.click();}
    public String getTxtMasterConsumable(){return txtMasterConsumable.getText();}
    public void BtnAddMasterConsumable() { btnAddMasterConsumable.click();}
    public void InputItemNameMasterConsumable(String inputItemNameMasterConsumable) { this.inputItemNameMasterConsumable.sendKeys(inputItemNameMasterConsumable);}
    public void InputItemUnitMasterConsumable(String inputItemUnitMasterConsumable) { this.inputItemUnitMasterConsumable.sendKeys(inputItemUnitMasterConsumable);}
    public void BtnSelectCategoryMasterConsumable() { btnSelectCategoryMasterConsumable.click();}
    public void SelectCategoryMasterConsumable() { selectCategoryMasterConsumable.click();}
    public void BtnSelectTypeMasterConsumable() { btnSelectTypeMasterConsumable.click();}
    public void SelectTypeMasterConsumable() { selectTypeMasterConsumable.click();}
    public void BtnSaveMasterConsumable() { btnSaveMasterConsumable.click();}
    public void BtnConfirmSaveMasterConsumable() { btnConfirmSaveMasterConsumable.click();}
    public void BtnViewMasterConsumable() { btnViewMasterConsumable.click();}
    public String getTxtViewMasterConsumable(){return txtViewMasterConsumable.getText();}
    public void BtnBackViewMasterConsumable() { btnBackViewMasterConsumable.click();}
    public void TabConsumable() { tabConsumable.click();}
    public String getTxtConsumablePage(){return txtConsumablePage.getText();}
    public void BtnAddStockConsumable() { btnAddStockConsumable.click();}
    public void BtnPurchaseDateAddStock() { btnPurchaseDateAddStock.click();}
    public void BtnTodayDateAddStock() { btnTodayDateAddStock.click();}
    public void BtnSelectItemConsumable() { btnSelectItemConsumable.click();}
    public void SelectItemConsumable() { selectItemConsumable.click();}
    public void BtnSelectAddItemConsumable() { btnSelectAddItemConsumable.click();}
    public void InputTotalAddStockConsumable(String inputTotalAddStockConsumable) { this.inputTotalAddStockConsumable.sendKeys(inputTotalAddStockConsumable);}
    public void BtnUploadInvoiceAddStockConsumable(String btnUploadInvoiceAddStockConsumable) { this.btnUploadInvoiceAddStockConsumable.sendKeys(btnUploadInvoiceAddStockConsumable);}
    public void BtnChooseLocationAddStock() { btnChooseLocationAddStock.click();}
    public void SelectLocationAddStockConsumable() { selectLocationAddStockConsumable.click();}
    public void InputNoteAddStockConsumable(String inputNoteAddStockConsumable) { this.inputNoteAddStockConsumable.sendKeys(inputNoteAddStockConsumable);}
    public void BtnSaveAddStockConsumable() { btnSaveAddStockConsumable.click();}
    public void BtnConfirmSaveAddStockConsumable() { btnConfirmSaveAddStockConsumable.click();}
    public void BtnEditAddStock() { btnEditAddStock.click();}
    public void ClearInputTotalAddStockConsumable() { inputTotalAddStockConsumable.clear();}
    public void BtnSaveEditAddStock() { btnSaveEditAddStock.click();}
    public void BtnConfirmSaveEditAddStock() { btnConfirmSaveEditAddStock.click();}
    public void BtnConsume() { btnConsume.click();}
    public void BtnDateOfItemDepartureConsume() { btnDateOfItemDepartureConsume.click();}
    public void BtnTodayDateOfItemDeparture() { btnTodayDateOfItemDeparture.click();}
    public void BtnSelectItemConsume() { btnSelectItemConsume.click();}
    public void SelectItemConsume() { selectItemConsume.click();}
    public void BtnSelectAddItemConsume() { btnSelectAddItemConsume.click();}
    public void ClearInputTotalConsume() { inputTotalConsume.clear();}
    public void InputTotalConsume(String inputTotalConsume) { this.inputTotalConsume.sendKeys(inputTotalConsume);}
    public void BtnSelectPicConsume() { btnSelectPicConsume.click();}
    public void SelectPicConsume() { selectPicConsume.click();}
    public void BtnConfirmSelectPicConsume() { btnConfirmSelectPicConsume.click();}
    public void BtnSelectLocationConsume() { btnSelectLocationConsume.click();}
    public void SelectLocationConsume() { selectLocationConsume.click();}
    public void InputNoteConsume(String inputNoteConsume) { this.inputNoteConsume.sendKeys(inputNoteConsume);}
    public void BtnSaveConsumeData() { btnSaveConsumeData.click();}
    public void BtnConfirmSaveConsumeData() { btnConfirmSaveConsumeData.click();}
    public void BtnMovingStock() { btnMovingStock.click();}
    public void BtnDateMovingStock() { btnDateMovingStock.click();}
    public void BtnTodayDateMovingStock() { btnTodayDateMovingStock.click();}
    public void BtnSelectIntialLocationMovingStock() { btnSelectIntialLocationMovingStock.click();}
    public void SelectIntialLocationMovingStock() { selectIntialLocationMovingStock.click();}
    public void BtnSelectItemMovingStock() { btnSelectItemMovingStock.click();}
    public void SelectItemMovingStock() { selectItemMovingStock.click();}
    public void BtnConfirmSelectItemMovingStock() { btnConfirmSelectItemMovingStock.click();}
    public void ClearInputTotalMovingStock() { inputTotalMovingStock.clear();}
    public void InputTotalMovingStock(String inputTotalMovingStock) { this.inputTotalMovingStock.sendKeys(inputTotalMovingStock);}
    public void BtnSelectRelocationMovingStock() { btnSelectRelocationMovingStock.click();}
    public void SelectRelocationMovingStock() { selectRelocationMovingStock.click();}
    public void InputNoteMovingStock(String inputNoteMovingStock) { this.inputNoteMovingStock.sendKeys(inputNoteMovingStock);}
    public void BtnSaveMovingStockData() { btnSaveMovingStockData.click();}
    public void BtnConfirmSaveMovingStockData() { btnConfirmSaveMovingStockData.click();}
    public void TabGaDocument() { tabGaDocument.click();}
    public String getTxtGaDocumentPage(){return txtGaDocumentPage.getText();}
    public void BtnCreateGaDocumentNumber() { btnCreateGaDocumentNumber.click();}
    public void InputGaMasterDocumentName(String inputGaMasterDocumentName) { this.inputGaMasterDocumentName.sendKeys(inputGaMasterDocumentName);}
    public void InputGaFormatDocumentNumber(String inputGaFormatDocumentNumber) { this.inputGaFormatDocumentNumber.sendKeys(inputGaFormatDocumentNumber);}
    public void BtnSaveGaDocumentNumber() { btnSaveGaDocumentNumber.click();}
    public void BtnConfirmSaveGaDocumentNumber() { btnConfirmSaveGaDocumentNumber.click();}
    public void BtnEditGaDocumentNumber() { btnEditGaDocumentNumber.click();}
    public void ClearInputGaFormatDocumentNumber() { inputGaFormatDocumentNumber.clear();}
    public void BtnSaveEditGaDocumentNumberData() { btnSaveEditGaDocumentNumberData.click();}
    public void BtnConfirmSaveEditGaDocumentNumberData() { btnConfirmSaveEditGaDocumentNumberData.click();}
    public void BtnDeleteGaDocumentNumber() { btnDeleteGaDocumentNumber.click();}
    public void BtnConfirmDeleteGaDocumentNumber() { btnConfirmDeleteGaDocumentNumber.click();}
    public void TabGaListDocument() { tabGaListDocument.click();}
    public String getTxtGaListDocumentPage(){return txtGaListDocumentPage.getText();}
    public void BtnCreateGaListDocument() { btnCreateGaListDocument.click();}
    public void BtnSelectMasterDocumentNameGaListDocument() { btnSelectMasterDocumentNameGaListDocument.click();}
    public void SelectMasterDocumentNameGaListDocument() { selectMasterDocumentNameGaListDocument.click();}
    public void InputDocumentNameGaListDocument(String inputDocumentNameGaListDocument) { this.inputDocumentNameGaListDocument.sendKeys(inputDocumentNameGaListDocument);}
    public void BtnSaveGaListDocument() { btnSaveGaListDocument.click();}
    public void BtnConfirmSaveGaListDocument() { btnConfirmSaveGaListDocument.click();}
    public void BtnUploadGaListDocument() { btnUploadGaListDocument.click();}
    public void BtnChooseFileGaListDocument(String btnChooseFileGaListDocument) { this.btnChooseFileGaListDocument.sendKeys(btnChooseFileGaListDocument);}
    public void BtnSaveUploadGaListDocument() { btnSaveUploadGaListDocument.click();}
    public void BtnConfirmSaveUploadGaListDocument() { btnConfirmSaveUploadGaListDocument.click();}
    public void BtnEditGaListDocument() { btnEditGaListDocument.click();}
    public void ClearInputDocumentNameGaListDocument() { inputDocumentNameGaListDocument.clear();}
    public void BtnSaveEditGaListDocumentData() { btnSaveEditGaListDocumentData.click();}
    public void BtnConfirmSaveEditGaListDocumentData() { btnConfirmSaveEditGaListDocumentData.click();}
    public void BtnDeleteGaListDocument() { btnDeleteGaListDocument.click();}
    public void BtnConfirmDeleteGaListDocument() { btnConfirmDeleteGaListDocument.click();}
}
