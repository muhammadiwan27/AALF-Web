package org.example.pages;

import org.example.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoPage {
    private WebDriver driver;

    public HoPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@class='bg-secondary-50 mb-2 h-8 nav-active bg-primary-active-token svelte-1miuvmz'])[1]")
    WebElement tabHo;

    @FindBy(xpath = "(//p[@class='text-sm font-bold'])[1]")
    WebElement txtHo;

    @FindBy(xpath = "(//a[normalize-space()='Create HO'])[1]")
    WebElement btnCreateHo;

    @FindBy(xpath = "(//select[@id='perusahaan'])[1]")
    WebElement selectHandlingCompanyHo;

    @FindBy(xpath = "(//option[@value='Ariyanto Arnaldo Law Firm'])[1]")
    WebElement chooseHandlingCompanyHo;

    @FindBy(xpath = "(//input[@id='fQuotation'])[1]")
    WebElement btnUploadDocumentQuotationHo;

    @FindBy(xpath = "(//input[@id='fConfirmLetter'])[1]")
    WebElement btnUploadDocumentConfirmationLetterHo;

    @FindBy(xpath = "(//button[normalize-space()='Search Client'])[1]")
    WebElement btnSearchNameOfClientHo;

    @FindBy(xpath = "(//div[contains(text(),'Kingswood Capital Ltd')])[1]")
    WebElement chooseNameOfClientHo;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectSearchNameOfClientHo;

    @FindBy(xpath = "(//input[@id='fConfirmLetter'])[2]")
    WebElement btnUploadDocumentScopeOfWorkHo;

    @FindBy(xpath = "(//input[@id='nmPerkara'])[1]")
    WebElement inputCaseNameClientHo;

    @FindBy(xpath = "(//textarea[@id='klien_alamat'])[1]")
    WebElement inputAddressClientHo;

    @FindBy(xpath = "(//select[@id='klien_provinsi'])[1]")
    WebElement btnSelectClientProvinceHo;

    @FindBy(xpath = "(//option[@value='SUMATERA BARAT'])[1]")
    WebElement chooseProvinceClientHo;

    @FindBy(xpath = "(//select[@id='kab_kota'])[1]")
    WebElement btnSelectCityClientHo;

    @FindBy(xpath = "(//option[@value='KOTA PADANG'])[1]")
    WebElement chooseCityClientHo;

    @FindBy(xpath = "(//input[@id='klien_kdPos'])[1]")
    WebElement inputPostalCodeClientHo;

    @FindBy(xpath = "(//input[@id='rekomendasi'])[1]")
    WebElement inputRecommendationClientHo;

    @FindBy(xpath = "(//input[@id='klien_telpon'])[1]")
    WebElement inputClientTelephoneHo;

    @FindBy(xpath = "(//input[@id='klien_email'])[1]")
    WebElement inputClientEmailHo;

    @FindBy(xpath = "(//input[@id='klien_npwp'])[1]")
    WebElement inputClientNpwpHo;

    @FindBy(xpath = "(//select[@id='klien_jenis'])[1]")
    WebElement btnSelectTypeOfClientHo;

    @FindBy(xpath = "(//option[@value='Ad hoc'])[1]")
    WebElement chooseTypeOfClientHo;

    @FindBy(xpath = "(//textarea[@id='ringkasan'])[1]")
    WebElement inputCaseSummaryClientHo;

    @FindBy(xpath = "(//input[@id='jumlahJam'])[1]")
    WebElement inputTotalHoursClientHo;

    @FindBy(xpath = "(//button[contains(text(),'Add')])[2]")
    WebElement btnAddHandlingTeamHo;

    @FindBy(xpath = "(//div[contains(@class,'listbox-label-content flex-1')])[3]")
    WebElement chooseHandlingTeam1Ho;

    @FindBy(xpath = "(//div[contains(@class,'listbox-label-content flex-1')])[42]")
    WebElement chooseHandlingTeam2Ho;

    @FindBy(xpath = "(//div[contains(@class,'listbox-label-content flex-1')])[1]")
    WebElement chooseHandlingTeam3Ho;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectHandlingTeamHo;

    @FindBy(xpath = "(//button[contains(@type,'button')][normalize-space()='Create'])[1]")
    WebElement btnSaveHo;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveHo;

    @FindBy(xpath = "(//input[@placeholder='\uD83D\uDD0D Search'])[1]")
    WebElement inputSearchHoBerjalan;

    @FindBy(xpath = "(//a[contains(@class,'btn-icon btn-icon-sm relative')])[1]")
    WebElement btnHoWorkingPlan;

    @FindBy(xpath = "//h1[normalize-space()='HO Working Plan']")
    WebElement txtHoWorkingPlan;

    @FindBy(xpath = "(//a[normalize-space()='Detail'])[1]")
    WebElement btnDetailCost;

    @FindBy(xpath = "(//a[normalize-space()='Edit'])[1]")
    WebElement btnEditHo;

    @FindBy(xpath = "(//textarea[@id='ringkasan'])[1]")
    WebElement inputCaseSummaryEditHo;

    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Save'])[1]")
    WebElement btnSaveEditHo;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditHo;

    @FindBy(xpath = "(//h1[normalize-space()='Detail Cost hodev001'])[1]")
    WebElement txtDetailCost;

    @FindBy(xpath = "(//a[normalize-space()='Back'])[1]")
    WebElement btnBackDetailCost;

    @FindBy(xpath = "(//a[normalize-space()='Task'])[1]")
    WebElement btnAddTask;

    @FindBy(xpath = "(//button[normalize-space()='Select SOW'])[1]")
    WebElement btnSowTask;

    @FindBy(xpath = "(//option[@value='2_Perdata Umum_0_2'])[1]")
    WebElement selectSowLevel0Task;

    @FindBy(xpath = "(//option[@value='2_Pra Litigasi_0_14'])[1]")
    WebElement selectSowLevel1Task;

    @FindBy(xpath = "(//option[@value='2_Due Diligence_5_0'])[1]")
    WebElement selectSowLevel2Task;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectSowTask;

    @FindBy(xpath = "(//button[normalize-space()='Select SOW'])[1]")
    WebElement btnSowActivity;

    @FindBy(xpath = "(//option[@value='6_Pidana_0_2'])[1]")
    WebElement selectSowLevel0Activity;

    @FindBy(xpath = "(//option[@value='1_Corporate_0_16'])[1]")
    WebElement selectSowLevel1Activity;

    @FindBy(xpath = "(//option[@value='6_Diskusi / Penelitian_7_0'])[1]")
    WebElement selectSowLevel2Activity;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectSowActivity;

    @FindBy(xpath = "(//input[@placeholder='Deadline'])[1]")
    WebElement btnDeadline;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    WebElement btnSelectTodayDeadline;

    @FindBy(xpath = "(//button[normalize-space()='Select PIC'])[1]")
    WebElement btnPicTask;

    @FindBy(xpath = "(//small[normalize-space()='(Master)'])[1]")
    WebElement selectPicTask;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectPicTask;

    @FindBy(xpath = "(//input[@id='taskFoto'])[1]")
    WebElement btnUploadTaskPhotos;

    @FindBy(xpath = "(//input[@id='taskDokumen'])[1]")
    WebElement btnUploadTaskDocuments;

    @FindBy(xpath = "(//textarea[@placeholder='Note'])[1]")
    WebElement inputNoteTask;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveTask;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveTask;

    @FindBy(xpath = "(//a[normalize-space()='Activity'])[1]")
    WebElement btnAddActivity;

    @FindBy(xpath = "(//input[@placeholder='Start date'])[1]")
    WebElement btnStartDateActivity;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    WebElement btnSelectTodayStartDateActivity;

    @FindBy(xpath = "(//input[@placeholder='End date'])[1]")
    WebElement btnEndDateActivity;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    WebElement btnSelectTodayEndDateActivity;

    @FindBy(xpath = "(//button[normalize-space()='Select Team'])[1]")
    WebElement btnPicActivity;

    @FindBy(xpath = "(//small[normalize-space()='(Junior Partner)'])[1]")
    WebElement selectPicActivity;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectPicActivity;

    @FindBy(xpath = "(//input[@id='foto'])[1]")
    WebElement btnUploadActivityPhotos;

    @FindBy(xpath = "(//input[@id='dokumen'])[1]")
    WebElement btnUploadActivityDocuments;

    @FindBy(xpath = "(//textarea[@placeholder='Note'])[1]")
    WebElement inputNoteActivity;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveActivity;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveActivity;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[8]/div[1]/a[3]")
    WebElement btnEditTask;

    @FindBy(xpath = "(//textarea[@placeholder='Note'])[1]")
    WebElement inputEditNoteTask;

    @FindBy(xpath = "//tbody/tr[2]/td[8]/div[1]/a[1]/img[1]")
    WebElement btnViewTask;

    @FindBy(xpath = "(//button[normalize-space()='Back'])[1]")
    WebElement btnBackViewTask;

    @FindBy(xpath = "//tbody/tr[2]/td[9]/a[1]")
    WebElement btnProceedTheTask;

    @FindBy(xpath = "(//input[@placeholder='Start date'])[1]")
    WebElement btnStartDateProceedTheTask;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    WebElement btnSelectTodayStartDateProceedTheTask;

    @FindBy(xpath = "(//input[@placeholder='End date'])[1]")
    WebElement btnEndDateProceedTheTask;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    WebElement btnSelectTodayEndDateProceedTheTask;

    @FindBy(xpath = "(//input[@id='foto'])[1]")
    WebElement btnUploadActivityPhotosProceedTheTask;

    @FindBy(xpath = "(//input[@id='dokumen'])[1]")
    WebElement btnUploadActivityDocumentsProceedTheTask;

    @FindBy(xpath = "(//textarea[@placeholder='Enter any additional order notes...'])[1]")
    WebElement inputNoteProceedTheTask;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveProceedTheTask;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveProceedTheTask;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[5]/div[3]/a[1]")
    WebElement btnJpApprovalTask;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnSelectJpApprovalTask;

    @FindBy(xpath = "(//option[@value='approve'])[1]")
    WebElement selectJpApprovalTask;

    @FindBy(xpath = "(//textarea[@placeholder='Type here'])[1]")
    WebElement inputNoteJpApprovalTask;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveJpApprovalTask;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmJpSaveApprovalTask;

    @FindBy(xpath = "//div[contains(@class,'flex justify-center gap-6 show')]//img[contains(@alt,'revisi')]")
    WebElement btnPartnerApprovalTask;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnSelectPartnerApprovalTask;

    @FindBy(xpath = "(//option[@value='approve'])[1]")
    WebElement selectPartnerApproveApprovalTask;

    @FindBy(xpath = "(//option[@value='revisi'])[1]")
    WebElement selectPartnerRevisiApprovalTask;

    @FindBy(xpath = "(//textarea[@placeholder='Type here'])[1]")
    WebElement inputNotePartnerApprovalTask;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSavePartnerApprovalTask;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmPartnerSaveApprovalTask;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnSelectPartnerRevisionTask;

    @FindBy(xpath = "(//a[normalize-space()='Revisi'])[1]")
    WebElement btnRevisiTask;

    @FindBy(xpath = "(//button)[21]")
    WebElement btnDeleteTask;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmDeleteTask;

    @FindBy(xpath = "//tbody/tr[1]/td[5]/div[3]/a[1]/img[1]")
    WebElement btnJpApprovalActivity;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnSelectJpApprovalActivity;

    @FindBy(xpath = "(//option[@value='approve'])[1]")
    WebElement selectJpApprovalActivity;

    @FindBy(xpath = "(//textarea[@placeholder='Type here'])[1]")
    WebElement inputNoteJpApprovalActivity;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveJpApprovalActivity;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmJpSaveApprovalActivity;

    @FindBy(xpath = "//div[contains(@class,'flex justify-center gap-6 show')]//img[contains(@alt,'revisi')]")
    WebElement btnPartnerApprovalActivity;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnSelectPartnerApprovalActivity;

    @FindBy(xpath = "(//option[@value='approve'])[1]")
    WebElement selectPartnerApproveApprovalActivity;

    @FindBy(xpath = "(//option[@value='revisi'])[1]")
    WebElement selectPartnerRevisiApprovalActivity;

    @FindBy(xpath = "(//textarea[@placeholder='Type here'])[1]")
    WebElement inputNotePartnerApprovalActivity;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSavePartnerApprovalActivity;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmPartnerSaveApprovalActivity;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnSelectPartnerRevisionActivity;

    @FindBy(xpath = "(//a[contains(@class,'btn btn-sm bg-primary-500 text-white text-center flex')][normalize-space()='Revisi'])[1]")
    WebElement btnRevisiActivity;

    @FindBy(xpath = "(//button)[30]")
    WebElement btnDeleteActivity;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmDeleteActivity;

    @FindBy(xpath = "(//button[normalize-space()='Create Documents'])[1]")
    WebElement btnCreateAdministrativeDocuments;

    @FindBy(xpath = "(//option[@value='rkpd'])[1]")
    WebElement selectDocumentRkpd;

    @FindBy(xpath = "(//button[normalize-space()='Ok'])[1]")
    WebElement btnSelectAdministrativeDocuments;

    @FindBy(xpath = "(//button[normalize-space()='Select SOW'])[1]")
    WebElement btnSowRkpd;

    @FindBy(xpath = "(//option[@value='Pendampingan'])[1]")
    WebElement selectSowRkpd;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectSowRkpd;

    @FindBy(xpath = "(//button[normalize-space()='Select Region'])[1]")
    WebElement btnRegionRkpd;

    @FindBy(xpath = "(//option[@value='Dalam Kota'])[1]")
    WebElement selectRegionRkpd;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectRegionRkpd;

    @FindBy(xpath = "(//input[@placeholder='Start date'])[1]")
    WebElement btnStartDateRkpd;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    WebElement btnSelectTodayStartDateRkpd;

    @FindBy(xpath = "(//input[@placeholder='End date'])[1]")
    WebElement btnEndDateRkpd;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    WebElement btnSelectTodayEndDateRkpd;

    @FindBy(xpath = "(//textarea[@placeholder='Type here '])[1]")
    WebElement inputScopeOfWorkDetailsRkpd;

    @FindBy(xpath = "(//button[normalize-space()='Select Team'])[1]")
    WebElement btnAssignedMemberRkppd;

    @FindBy(xpath = "(//div[contains(@class,'listbox-label-content flex-1')])[3]")
    WebElement selectAssignedMember1Rkpd;

    @FindBy(xpath = "(//div[contains(@class,'listbox-label-content flex-1')])[5]")
    WebElement selectAssignedMember2Rkpd;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectAssignedMemberRkpd;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnCreateRkpd;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmCreateRkpd;

    @FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")
    WebElement btnCancelDownloadRkpd;

    @FindBy(xpath = "(//a[contains(text(),'Need Approve By JP')])[1]")
    WebElement btnJpApprovalRkpd;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnSelectJpApprovalRkpd;

    @FindBy(xpath = "(//option[@value='approve'])[1]")
    WebElement selectJpApprovalRkpd;

    @FindBy(xpath = "(//textarea[@placeholder='Type here'])[1]")
    WebElement inputNoteJpApprovalRkpd;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveJpApprovalRkpd;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmJpSaveApprovalRkpd;

    @FindBy(xpath = "(//a[contains(text(),'Need Approve By Partner')])[1]")
    WebElement btnPartnerApprovalRkpd;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnSelectPartnerApprovalRkpd;

    @FindBy(xpath = "(//option[@value='approve'])[1]")
    WebElement selectPartnerApprovalRkpd;

    @FindBy(xpath = "(//textarea[@placeholder='Type here'])[1]")
    WebElement inputNotePartnerApprovalRkpd;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSavePartnerApprovalRkpd;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmPartnerSaveApprovalRkpd;

    @FindBy(xpath = "(//option[@value='surat-tugas'])[1]")
    WebElement selectDocumentSuratTugas;

    @FindBy(xpath = "(//button[normalize-space()='Search'])[1]")
    WebElement btnSearchIdRkpd;

    @FindBy(xpath = "(//option[@value='0'])[1]")
    WebElement selectIdRkpd;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectIdRkpd;

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    WebElement checklistListofExpensesTicket;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    WebElement checklistListofExpensesHotelCost;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnCreateSuratTugas;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmCreateSuratTugas;

    @FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")
    WebElement btnCancelDownloadSuratTugas;

    @FindBy(xpath = "(//a[contains(text(),'Need Approve By Partner')])[2]")
    WebElement btnPartnerApprovalSuratTugas;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnSelectPartnerApprovalSuratTugas;

    @FindBy(xpath = "(//option[@value='approve'])[1]")
    WebElement selectPartnerApprovalSuratTugas;

    @FindBy(xpath = "(//textarea[@placeholder='Type here'])[1]")
    WebElement inputNotePartnerApprovalSuratTugas;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSavePartnerApprovalSuratTugas;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmPartnerSaveApprovalSuratTugas;

    @FindBy(xpath = "(//option[@value='lkpd'])[1]")
    WebElement selectDocumentLkpd;

    @FindBy(xpath = "(//button[normalize-space()='Search'])[1]")
    WebElement btnSearchIdSt;

    @FindBy(xpath = "(//option[@value='0'])[1]")
    WebElement selectIdSt;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectIdSt;

    @FindBy(xpath = "(//button[normalize-space()='Choose Activity'])[1]")
    WebElement btnChooseActivityLkpd;

    @FindBy(xpath = "(//option[@value='1'])[1]")
    WebElement chooseActivityLkpd;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectActivityLkpd;

    @FindBy(xpath = "(//button[normalize-space()='Select SOW'])[1]")
    WebElement btnSowNextAgendaLkpd;

    @FindBy(xpath = "(//option[@value='Final Report'])[1]")
    WebElement selectSowNextAgendaLkpd;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectSowNextAgendaLkpd;

    @FindBy(xpath = "//input[@placeholder='Deadline']")
    WebElement btnDeadlineNextAgendaLkpd;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    WebElement btnSelectTodayDeadlineNextAgendaLkpd;

    @FindBy(xpath = "(//button[normalize-space()='Select PIC'])[1]")
    WebElement btnPicNextAgendaLkpd;

    @FindBy(xpath = "(//div[contains(@class,'listbox-label flex items-center space-x-4')])[1]")
    WebElement selectPic1NextAgendaLkpd;

    @FindBy(xpath = "(//div[contains(@class,'listbox-label flex items-center space-x-4')])[3]")
    WebElement selectPic2NextAgendaLkpd;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectPicNextAgendaLkpd;

    @FindBy(xpath = "(//textarea[@placeholder='Note '])[1]")
    WebElement inputNoteNextAgendaLkpd;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnCreateLkpd;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmCreateLkpd;

    @FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")
    WebElement btnCancelDownloadLkpd;

    @FindBy(xpath = "(//a[contains(text(),'Need Approve By JP')])[1]")
    WebElement btnJpApprovalLkpd;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnSelectJpApprovalLkpd;

    @FindBy(xpath = "(//option[@value='approve'])[1]")
    WebElement selectJpApprovalLkpd;

    @FindBy(xpath = "(//textarea[@placeholder='Type here'])[1]")
    WebElement inputNoteJpApprovalLkpd;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveJpApprovalLkpd;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmJpSaveApprovalLkpd;

    @FindBy(xpath = "(//a[contains(text(),'Need Approve By Partner')])[1]")
    WebElement btnPartnerApprovalLkpd;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnSelectPartnerApprovalLkpd;

    @FindBy(xpath = "(//option[@value='approve'])[1]")
    WebElement selectPartnerApprovalLkpd;

    @FindBy(xpath = "(//textarea[@placeholder='Type here'])[1]")
    WebElement inputNotePartnerApprovalLkpd;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSavePartnerApprovalLkpd;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmPartnerSaveApprovalLkpd;

    @FindBy(xpath = "(//option[@value='bon-putih'])[1]")
    WebElement selectDocumentBonPutih;

    @FindBy(xpath = "(//button[normalize-space()='Search'])[1]")
    WebElement btnSearchIdLkpdBonPutih;

    @FindBy(xpath = "(//option[@value='007/LKPD/02/2024'])[1]")
    WebElement selectIdLkpdBonPutih;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectIdLkpdBonPutih;

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    WebElement checklistReimbursement1BonPutih;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    WebElement checklistReimbursement2BonPutih;

    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    WebElement checklistReimbursement3BonPutih;

    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    WebElement checklistReimbursement4BonPutih;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnCreateBonPutih;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmCreateBonPutih;

    @FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")
    WebElement btnCancelDownloadBonPutih;

    @FindBy(xpath = "(//a[contains(text(),'Need Approve By JP')])[1]")
    WebElement btnJpApprovalBonPutih;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnSelectJpApprovalBonPutih;

    @FindBy(xpath = "(//option[@value='approve'])[1]")
    WebElement selectJpApprovalBonPutih;

    @FindBy(xpath = "(//textarea[@placeholder='Type here'])[1]")
    WebElement inputNoteJpApprovalBonPutih;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveJpApprovalBonPutih;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmJpSaveApprovalBonPutih;

    @FindBy(xpath = "(//a[contains(text(),'Need Approve By Partner')])[1]")
    WebElement btnPartnerApprovalBonPutih;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnSelectPartnerApprovalBonPutih;

    @FindBy(xpath = "(//option[@value='approve'])[1]")
    WebElement selectPartnerApprovalBonPutih;

    @FindBy(xpath = "(//textarea[@placeholder='Type here'])[1]")
    WebElement inputNotePartnerApprovalBonPutih;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSavePartnerApprovalBonPutih;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmPartnerSaveApprovalBonPutih;

    @FindBy(xpath = "(//button[normalize-space()='Finance Documents'])[1]")
    WebElement btnCreateFinanceDocuments;

    @FindBy(xpath = "(//option[@value='bon-hijau'])[1]")
    WebElement selectDocumentBonHijau;

    @FindBy(xpath = "(//button[normalize-space()='Ok'])[1]")
    WebElement btnSelectFinanceDocuments;

    @FindBy(xpath = "(//button[normalize-space()='Search'])[1]")
    WebElement btnSearchIdStBonHijau;

    @FindBy(xpath = "(//option[@value='006/ST/02/2024'])[1]")
    WebElement selectIdStBonHijau;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectIdStBonHijau;

    @FindBy(xpath = "(//input[@placeholder='Amount'])[1]")
    WebElement inputAmountTripExpensesBonHijau1;

    @FindBy(xpath = "(//input[@id='caseName'])[3]")
    WebElement inputNoteTripExpensesBonHijau1;

    @FindBy(xpath = "(//input[@placeholder='Amount'])[3]")
    WebElement inputAmountTripExpensesBonHijau2;

    @FindBy(xpath = "(//input[@id='caseName'])[6]")
    WebElement inputNoteTripExpensesBonHijau2;

    @FindBy(xpath = "(//input[@type='file'])[1]")
    WebElement btnUploadRecipientTripExpensesBonHijau1;

    @FindBy(xpath = "(//input[@type='file'])[2]")
    WebElement btnUploadRecipientTripExpensesBonHijau2;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnCreateBonHijau;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmCreateBonHijau;

    @FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")
    WebElement btnCancelDownloadBonHijau;

    @FindBy(xpath = "(//a[contains(text(),'Need Approve By JP')])[1]")
    WebElement btnJpApprovalBonHijau;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnSelectJpApprovalBonHijau;

    @FindBy(xpath = "(//option[@value='approve'])[1]")
    WebElement selectJpApprovalBonHijau;

    @FindBy(xpath = "(//textarea[@placeholder='Type here'])[1]")
    WebElement inputNoteJpApprovalBonHijau;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveJpApprovalBonHijau;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmJpSaveApprovalBonHijau;

    @FindBy(xpath = "(//a[contains(text(),'Need Approve By Partner')])[1]")
    WebElement btnPartnerApprovalBonHijau;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnSelectPartnerApprovalBonHijau;

    @FindBy(xpath = "(//option[@value='approve'])[1]")
    WebElement selectPartnerApprovalBonHijau;

    @FindBy(xpath = "(//textarea[@placeholder='Type here'])[1]")
    WebElement inputNotePartnerApprovalBonHijau;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSavePartnerApprovalBonHijau;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmPartnerSaveApprovalBonHijau;

    @FindBy(xpath = "(//option[@value='bon-kuning'])[1]")
    WebElement selectDocumentBonKuning;

    @FindBy(xpath = "(//button[normalize-space()='Search'])[1]")
    WebElement btnSearchIdBonPutihBonKuning;

    @FindBy(xpath = "(//option[@value='BP007/02/24'])[1]")
    WebElement selectIdBonPutihBonKuning;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectIdBonPutihBonKuning;

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    WebElement checklistProfessionalFee1BonKuning;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    WebElement checklistCourtMoney1BonKuning;

    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    WebElement checklistAllowance1BonKuning;

    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    WebElement checklistMealAllowance1BonKuning;

    @FindBy(xpath = "(//input[@type='checkbox'])[5]")
    WebElement checklistProfessionalFee2BonKuning;

    @FindBy(xpath = "(//input[@type='checkbox'])[6]")
    WebElement checklistCourtMoney2BonKuning;

    @FindBy(xpath = "(//input[@type='checkbox'])[7]")
    WebElement checklistAllowance2BonKuning;

    @FindBy(xpath = "(//input[@type='checkbox'])[8]")
    WebElement checklistMealAllowance2BonKuning;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnCreateBonKuning;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmCreateBonKuning;

    @FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")
    WebElement btnCancelDownloadBonKuning;

    @FindBy(xpath = "(//a[contains(text(),'Need Approve By JP')])[1]")
    WebElement btnJpApprovalBonKuning;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnSelectJpApprovalBonKuning;

    @FindBy(xpath = "(//option[@value='approve'])[1]")
    WebElement selectJpApprovalBonKuning;

    @FindBy(xpath = "(//textarea[@placeholder='Type here'])[1]")
    WebElement inputNoteJpApprovalBonKuning;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSaveJpApprovalBonKuning;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmJpSaveApprovalBonKuning;

    @FindBy(xpath = "(//a[contains(text(),'Need Approve By Partner')])[1]")
    WebElement btnPartnerApprovalBonKuning;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnSelectPartnerApprovalBonKuning;

    @FindBy(xpath = "(//option[@value='approve'])[1]")
    WebElement selectPartnerApprovalBonKuning;

    @FindBy(xpath = "(//textarea[@placeholder='Type here'])[1]")
    WebElement inputNotePartnerApprovalBonKuning;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement btnSavePartnerApprovalBonKuning;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmPartnerSaveApprovalBonKuning;

    @FindBy(xpath = "(//option[@value='bon-merah'])[1]")
    WebElement selectDocumentBonMerah;

    @FindBy(xpath = "(//input[@id='diterima'])[5]")
    WebElement inputDescriptionBonMerah;

    @FindBy(xpath = "(//input[@placeholder='Receipt date'])[1]")
    WebElement selectReceiptDateBonMerah;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    WebElement btnSelectTodayReceiptDateBonMerah;

    @FindBy(xpath = "(//input[@id='akun'])[1]")
    WebElement inputAccountNumberBonMerah;

    @FindBy(xpath = "(//input[@placeholder='Conversion value'])[1]")
    WebElement inputAmountReceivedBonMerah;

    @FindBy(xpath = "(//input[@placeholder='Conversion value'])[2]")
    WebElement inputFinalValueBonMerah;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement btnCreateBonMerah;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmCreateBonMerah;

    @FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")
    WebElement btnCancelDownloadBonMerah;

    @FindBy(xpath = "(//a[normalize-space()='004/RKPD/01/2024'])[1]")
    WebElement btnViewRkpd;

    @FindBy(xpath = "(//button[normalize-space()='Back'])[1]")
    WebElement btnBackViewRkpd;

    @FindBy(xpath = "(//a[normalize-space()='006/ST/02/2024'])[1]")
    WebElement btnViewSuratTugas;

    @FindBy(xpath = "(//button[normalize-space()='Back'])[1]")
    WebElement btnBackViewSuratTugas;

    @FindBy(xpath = "(//a[normalize-space()='BH005/02/24'])[1]")
    WebElement btnViewBonHijau;

    @FindBy(xpath = "(//button[normalize-space()='Back'])[1]")
    WebElement btnBackViewBonHijau;

    @FindBy(xpath = "(//a[normalize-space()='003/LKPD/01/2024'])[1]")
    WebElement btnViewLkpd;

    @FindBy(xpath = "(//button[normalize-space()='Back'])[1]")
    WebElement btnBackViewLkpd;

    @FindBy(xpath = "(//a[normalize-space()='BP003/01/24'])[1]")
    WebElement btnViewBonPutih;

    @FindBy(xpath = "(//button[normalize-space()='Back'])[1]")
    WebElement btnBackViewBonPutih;

    @FindBy(xpath = "(//a[normalize-space()='BK002/02/24'])[1]")
    WebElement btnViewBonKuning;

    @FindBy(xpath = "(//button[normalize-space()='Back'])[1]")
    WebElement btnBackViewBonKuning;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[9]/div[1]/a[1]")
    WebElement btnViewBusinessTripRecap1;

    @FindBy(xpath = "//tbody/tr[4]/td[9]/div[1]/a[2]/img[1]")
    WebElement btnViewBusinessTripExpensesRecap;

    @FindBy(xpath = "(//button[normalize-space()='Back'])[1]")
    WebElement btnBackViewBusinessTripExpensesRecap;

    @FindBy(xpath = "//button[normalize-space()='Back']")
    WebElement btnBackViewBusinessTripRecap;

    @FindBy(xpath = "(//a[contains(text(),'Edit')])[4]")
    WebElement btnEditBonKuning;

    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    WebElement unchecklistMealAllowanceEditBonKuning;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditBonKuning;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditBonKuning;

    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Delete'])[4]")
    WebElement btnDeleteBonKuning;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmDeleteBonKuning;

    @FindBy(xpath = "(//a[contains(text(),'Edit')])[3]")
    WebElement btnEditBonPutih;

    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    WebElement unchecklistMealAllowanceEditBonPutih;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditBonPutih;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditBonPutih;

    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Delete'])[3]")
    WebElement btnDeleteBonPutih;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmDeleteBonPutih;

    @FindBy(xpath = "(//a[contains(text(),'Edit')])[3]")
    WebElement btnEditBonHijau;

    @FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
    WebElement btnAddTripExpensesEditBonHijau;

    @FindBy(xpath = "(//input[@id='caseName'])[7]")
    WebElement inputListOfExpensesTripExpensesEditBonHijau;

    @FindBy(xpath = "(//input[@id='caseName'])[7]")
    WebElement inputAmountTripExpensesEditBonHijau;

    @FindBy(xpath = "(//input[@id='caseName'])[9]")
    WebElement inputNoteTripExpensesEditBonHijau;

    @FindBy(xpath = "(//input[@type='file'])[3]")
    WebElement btnUploadRecipientTripExpensesEditBonHijau;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditBonHijau;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditBonHijau;

    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Delete'])[3]")
    WebElement btnDeleteBonHijau;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmDeleteBonHijau;

    @FindBy(xpath = "//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]")
    WebElement btnViewBusinessTripRecap;

    @FindBy(xpath = "(//a[contains(text(),'Edit')])[3]")
    WebElement btnEditLkpd;

    @FindBy(xpath = "(//button[normalize-space()='Choose Activity'])[1]")
    WebElement btnChooseResultReportEditLkpd;

    @FindBy(xpath = "(//option[@value='3'])[1]")
    WebElement selectActivityResultReportEditLkpd;

    @FindBy(xpath = "(//button[normalize-space()='Select'])[1]")
    WebElement btnSelectActivityResultReportEditLkpd;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditLkpd;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditLkpd;

    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Delete'])[3]")
    WebElement btnDeleteLkpd;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmDeleteLkpd;

    @FindBy(xpath = "(//a[@class='btn btn-sm variant-filled-primary rounded ms-auto lg:w-[120px] '][normalize-space()='Edit'])[1]")
    WebElement btnEditSuratTugas;

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    WebElement unchecklistTicketListOfExpensesEditSuratTugas;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditSuratTugas;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditSuratTugas;

    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Delete'])[2]")
    WebElement btnDeleteSuratTugas;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmDeleteSuratTugas;

    @FindBy(xpath = "(//a[@class='btn btn-sm variant-filled-primary rounded ms-auto lg:w-[120px] '][normalize-space()='Edit'])[1]")
    WebElement btnEditRkpd;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement btnSaveEditRkpd;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmSaveEditRkpd;

    @FindBy(xpath = "(//button[contains(@type,'button')][normalize-space()='Delete'])[1]")
    WebElement btnDeleteRkpd;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmDeleteRkpd;

    @FindBy(xpath = "(//a[normalize-space()='Upload Document'])[1]")
    WebElement btnUploadDocumentHoWorkingPlan;

    @FindBy(xpath = "(//input[@id='file'])[1]")
    WebElement btnChooseFileUploadDocumentHoWorkingPlan;

    @FindBy(xpath = "(//button[normalize-space()='Upload'])[1]")
    WebElement btnUploadDocument;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmUploadDocument;

    @FindBy(xpath = "(//button)[88]")
    WebElement btnDeleteUploadDocumentHoWorkingPlan;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement btnConfirmDeleteUploadDocumentHoWorkingPlan;

















    public void TabHo() {
        tabHo.click();
    }
    public String getTxtHo(){
        return txtHo.getText();
    }

    public void BtnCreateHo() { btnCreateHo.click();}
    public void SelectHandlingCompanyHo() { selectHandlingCompanyHo.click();}
    public void ChooseHandlingCompanyHo() { chooseHandlingCompanyHo.click();}
    public void BtnUploadDocumentQuotationHo(String btnUploadDocumentQuotationHo) { this.btnUploadDocumentQuotationHo.sendKeys(btnUploadDocumentQuotationHo);}
    public void BtnUploadDocumentConfirmationLetterHo(String btnUploadDocumentConfirmationLetterHo) { this.btnUploadDocumentConfirmationLetterHo.sendKeys(btnUploadDocumentConfirmationLetterHo);}
    public void BtnSearchNameOfClientHo() { btnSearchNameOfClientHo.click();}
    public void ChooseNameOfClientHo() { chooseNameOfClientHo.click();}
    public void BtnSelectSearchNameOfClientHo() { btnSelectSearchNameOfClientHo.click();}
    public void BtnUploadDocumentScopeOfWorkHo(String btnUploadDocumentScopeOfWorkHo) { this.btnUploadDocumentScopeOfWorkHo.sendKeys(btnUploadDocumentScopeOfWorkHo);}
    public void InputCaseNameClientHo(String inputCaseNameClientHo) { this.inputCaseNameClientHo.sendKeys(inputCaseNameClientHo);}
    public void InputAddressClientHo(String inputAddressClientHo) { this.inputAddressClientHo.sendKeys(inputAddressClientHo);}
    public void BtnSelectClientProvinceHo() { btnSelectClientProvinceHo.click();}
    public void ChooseProvinceClientHo() { chooseProvinceClientHo.click();}
    public void BtnSelectCityClientHo() { btnSelectCityClientHo.click();}
    public void ChooseCityClientHo() { chooseCityClientHo.click();}
    public void InputPostalCodeClientHo(String inputPostalCodeClientHo) { this.inputPostalCodeClientHo.sendKeys(inputPostalCodeClientHo);}
    public void InputRecommendationClientHo(String inputRecommendationClientHo) { this.inputRecommendationClientHo.sendKeys(inputRecommendationClientHo);}
    public void InputClientTelephoneHo(String inputClientTelephoneHo) { this.inputClientTelephoneHo.sendKeys(inputClientTelephoneHo);}
    public void InputClientEmailHo(String inputClientEmailHo) { this.inputClientEmailHo.sendKeys(inputClientEmailHo);}
    public void InputClientNpwpHo(String inputClientNpwpHo) { this.inputClientNpwpHo.sendKeys(inputClientNpwpHo);}
    public void BtnSelectTypeOfClientHo() { btnSelectTypeOfClientHo.click();}
    public void ChooseTypeOfClientHo() { chooseTypeOfClientHo.click();}
    public void InputCaseSummaryClientHo(String inputCaseSummaryClientHo) { this.inputCaseSummaryClientHo.sendKeys(inputCaseSummaryClientHo);}
    public void InputTotalHoursClientHo(String inputTotalHoursClientHo) { this.inputTotalHoursClientHo.sendKeys(inputTotalHoursClientHo);}
    public void BtnAddHandlingTeamHo() { btnAddHandlingTeamHo.click();}
    public void ChooseHandlingTeam1Ho() { chooseHandlingTeam1Ho.click();}
    public void ChooseHandlingTeam2Ho() { chooseHandlingTeam2Ho.click();}
    public void ChooseHandlingTeam3Ho() { chooseHandlingTeam3Ho.click();}
    public void BtnSelectHandlingTeamHo() { btnSelectHandlingTeamHo.click();}
    public void BtnSaveHo() { btnSaveHo.click();}
    public void BtnConfirmSaveHo() { btnConfirmSaveHo.click();}
    public void InputSearchHoBerjalan(String inputSearchHoBerjalan) { this.inputSearchHoBerjalan.sendKeys(inputSearchHoBerjalan);}
    public void BtnInputSearchHoBerjalan() { inputSearchHoBerjalan.click();}
    public void BtnHoWorkingPlan() { btnHoWorkingPlan.click();}
    public String getTxtHoWorkingPlan(){return txtHoWorkingPlan.getText();}
    public void BtnDetailCost() { btnDetailCost.click();}
    public String getTxtDetailCost(){return txtDetailCost.getText();}
    public void BtnBackDetailCost() { btnBackDetailCost.click();}
    public void BtnEditHo() { btnEditHo.click();}
    public void InputCaseSummaryEditHo(String inputCaseSummaryEditHo) { this.inputCaseSummaryEditHo.sendKeys(inputCaseSummaryEditHo);}
    public void BtnSaveEditHo() { btnSaveEditHo.click();}
    public void BtnConfirmSaveEditHo() { btnConfirmSaveEditHo.click();}
    public void BtnAddTask() { btnAddTask.click();}
    public void BtnSowTask() { btnSowTask.click();}
    public void BtnSowActivity() { btnSowActivity.click();}
    public void SelectSowLevel0Task() { selectSowLevel0Task.click();}
    public void SelectSowLevel1Task() { selectSowLevel1Task.click();}
    public void SelectSowLevel2Task() { selectSowLevel2Task.click();}
    public void SelectSowLevel0Activity() { selectSowLevel0Activity.click();}
    public void SelectSowLevel1Activity() { selectSowLevel1Activity.click();}
    public void SelectSowLevel2Activity() { selectSowLevel2Activity.click();}
    public void BtnSelectSowTask() { btnSelectSowTask.click();}
    public void BtnSelectSowActivity() { btnSelectSowActivity.click();}
    public void BtnDeadline() { btnDeadline.click();}
    public void BtnSelectTodayDeadline() { btnSelectTodayDeadline.click();}
    public void BtnPicTask() { btnPicTask.click();}
    public void SelectPicTask() { selectPicTask.click();}
    public void BtnSelectPicTask() { btnSelectPicTask.click();}
    public void BtnUploadTaskPhotos(String btnUploadTaskPhotos) { this.btnUploadTaskPhotos.sendKeys(btnUploadTaskPhotos);}
    public void BtnUploadTaskDocuments(String btnUploadTaskDocuments) { this.btnUploadTaskDocuments.sendKeys(btnUploadTaskDocuments);}
    public void InputNoteTask(String inputNoteTask) { this.inputNoteTask.sendKeys(inputNoteTask);}
    public void BtnSaveTask() { btnSaveTask.click();}
    public void BtnConfirmSaveTask() { btnConfirmSaveTask.click();}
    public void BtnAddActivity() { btnAddActivity.click();}
    public void BtnStartDateActivity() { btnStartDateActivity.click();}
    public void BtnSelectTodayStartDateActivity() { btnSelectTodayStartDateActivity.click();}
    public void BtnEndDateActivity() { btnEndDateActivity.click();}
    public void BtnSelectTodayEndDateActivity() { btnSelectTodayEndDateActivity.click();}
    public void BtnPicActivity() { btnPicActivity.click();}
    public void SelectPicActivity() { selectPicActivity.click();}
    public void BtnSelectPicActivity() { btnSelectPicActivity.click();}
    public void BtnUploadActivityPhotos(String btnUploadActivityPhotos) { this.btnUploadActivityPhotos.sendKeys(btnUploadActivityPhotos);}
    public void BtnUploadActivityDocuments(String btnUploadActivityDocuments) { this.btnUploadActivityDocuments.sendKeys(btnUploadActivityDocuments);}
    public void InputNoteActivity(String inputNoteActivity) { this.inputNoteActivity.sendKeys(inputNoteActivity);}
    public void BtnSaveActivity() { btnSaveActivity.click();}
    public void BtnConfirmSaveActivity() { btnConfirmSaveActivity.click();}
    public void BtnEditTask() { btnEditTask.click();}
    public void InputDeleteNoteTask() { inputNoteTask.clear();}
    public void InputDeleteNoteActivity() { inputNoteActivity.clear();}
    public void InputEditNoteTask(String inputEditNoteTask) { this.inputEditNoteTask.sendKeys(inputEditNoteTask);}
    public void BtnViewTask() { btnViewTask.click();}
    public void BtnBackViewTask() { btnBackViewTask.click();}
    public void BtnProceedTheTask() { btnProceedTheTask.click();}
    public void BtnStartDateProceedTheTask() { btnStartDateProceedTheTask.click();}
    public void BtnSelectTodayStartDateProceedTheTask() { btnSelectTodayStartDateProceedTheTask.click();}
    public void BtnEndDateProceedTheTask() { btnEndDateProceedTheTask.click();}
    public void BtnSelectTodayEndDateProceedTheTask() { btnSelectTodayEndDateProceedTheTask.click();}
    public void BtnUploadActivityPhotosProceedTheTask(String btnUploadActivityPhotosProceedTheTask) { this.btnUploadActivityPhotosProceedTheTask.sendKeys(btnUploadActivityPhotosProceedTheTask);}
    public void InputDeleteNoteProceedTheTask() { inputNoteProceedTheTask.clear();}
    public void BtnUploadActivityDocumentsProceedTheTask(String btnUploadActivityDocumentsProceedTheTask) { this.btnUploadActivityDocumentsProceedTheTask.sendKeys(btnUploadActivityDocumentsProceedTheTask);}
    public void InputNoteProceedTheTask(String inputNoteProceedTheTask) { this.inputNoteProceedTheTask.sendKeys(inputNoteProceedTheTask);}
    public void BtnSaveProceedTheTask() { btnSaveProceedTheTask.click();}
    public void BtnConfirmSaveProceedTheTask() { btnConfirmSaveProceedTheTask.click();}
    public void BtnJpApprovalTask() { btnJpApprovalTask.click();}
    public void BtnSelectJpApprovalTask() { btnSelectJpApprovalTask.click();}
    public void SelectJpApprovalTask() { selectJpApprovalTask.click();}
    public void InputDeleteNoteJpApprovalTask() { inputNoteJpApprovalTask.clear();}
    public void InputNoteJpApprovalTask(String inputNoteJpApprovalTask) { this.inputNoteJpApprovalTask.sendKeys(inputNoteJpApprovalTask);}
    public void BtnSaveJpApprovalTask() { btnSaveJpApprovalTask.click();}
    public void BtnConfirmSaveJpApprovalTask() { btnConfirmJpSaveApprovalTask.click();}
    public void BtnPartnerApprovalTask() { btnPartnerApprovalTask.click();}
    public void BtnSelectPartnerApprovalTask() { btnSelectPartnerApprovalTask.click();}
    public void SelectPartnerApproveApprovalTask() { selectPartnerApproveApprovalTask.click();}
    public void SelectPartnerRevisiApprovalTask() { selectPartnerRevisiApprovalTask.click();}
    public void InputDeleteNotePartnerApprovalTask() { inputNotePartnerApprovalTask.clear();}
    public void InputNotePartnerApprovalTask(String inputNotePartnerApprovalTask) { this.inputNotePartnerApprovalTask.sendKeys(inputNotePartnerApprovalTask);}
    public void BtnSavePartnerApprovalTask() { btnSavePartnerApprovalTask.click();}
    public void BtnConfirmSavePartnerApprovalTask() { btnConfirmPartnerSaveApprovalTask.click();}
    public void BtnSelectPartnerRevisionTask() { btnSelectPartnerRevisionTask.click();}
    public void BtnRevisiTask() { btnRevisiTask.click();}
    public void BtnDeleteTask() { btnDeleteTask.click();}
    public void BtnConfirmDeleteTask() { btnConfirmDeleteTask.click();}
    public void BtnDeleteActivity() { btnDeleteActivity.click();}
    public void BtnConfirmDeleteActivity() { btnConfirmDeleteActivity.click();}
    public void BtnJpApprovalActivity() { btnJpApprovalActivity.click();}
    public void BtnSelectJpApprovalActivity() { btnSelectJpApprovalActivity.click();}
    public void SelectJpApprovalActivity() { selectJpApprovalActivity.click();}
    public void InputDeleteNoteJpApprovalActivity() { inputNoteJpApprovalActivity.clear();}
    public void InputNoteJpApprovalActivity(String inputNoteJpApprovalActivity) { this.inputNoteJpApprovalActivity.sendKeys(inputNoteJpApprovalActivity);}
    public void BtnSaveJpApprovalActivity() { btnSaveJpApprovalActivity.click();}
    public void BtnConfirmSaveJpApprovalActivity() { btnConfirmJpSaveApprovalActivity.click();}
    public void BtnPartnerApprovalActivity() { btnPartnerApprovalActivity.click();}
    public void BtnSelectPartnerApprovalActivity() { btnSelectPartnerApprovalActivity.click();}
    public void SelectPartnerApproveApprovalActivity() { selectPartnerApproveApprovalActivity.click();}
    public void SelectPartnerRevisiApprovalActivity() { selectPartnerRevisiApprovalActivity.click();}
    public void InputDeleteNotePartnerApprovalActivity() { inputNotePartnerApprovalActivity.clear();}
    public void InputNotePartnerApprovalActivity(String inputNotePartnerApprovalActivity) { this.inputNotePartnerApprovalActivity.sendKeys(inputNotePartnerApprovalActivity);}
    public void BtnSavePartnerApprovalActivity() { btnSavePartnerApprovalActivity.click();}
    public void BtnConfirmSavePartnerApprovalActivity() { btnConfirmPartnerSaveApprovalActivity.click();}
    public void BtnSelectPartnerRevisionActivity() { btnSelectPartnerRevisionActivity.click();}
    public void BtnRevisiActivity() { btnRevisiActivity.click();}
    public void BtnCreateAdministrativeDocuments() { btnCreateAdministrativeDocuments.click();}
    public void SelectDocumentRkpd() { selectDocumentRkpd.click();}
    public void BtnSelectAdministrativeDocuments() { btnSelectAdministrativeDocuments.click();}
    public void BtnSowRkpd() { btnSowRkpd.click();}
    public void SelectSowRkpd() { selectSowRkpd.click();}
    public void BtnSelectSowRkpd() { btnSelectSowRkpd.click();}
    public void BtnRegionRkpd() { btnRegionRkpd.click();}
    public void SelectRegionRkpd() { selectRegionRkpd.click();}
    public void BtnSelectRegionRkpd() { btnSelectRegionRkpd.click();}
    public void BtnStartDateRkpd() { btnStartDateRkpd.click();}
    public void BtnSelectTodayStartDateRkpd() { btnSelectTodayStartDateRkpd.click();}
    public void BtnEndDateRkpd() { btnEndDateRkpd.click();}
    public void BtnSelectTodayEndDateRkpd() { btnSelectTodayEndDateRkpd.click();}
    public void InputScopeOfWorkDetailsRkpd(String inputScopeOfWorkDetailsRkpd) { this.inputScopeOfWorkDetailsRkpd.sendKeys(inputScopeOfWorkDetailsRkpd);}
    public void BtnAssignedMemberRkppd() { btnAssignedMemberRkppd.click();}
    public void SelectAssignedMember1Rkpd() { selectAssignedMember1Rkpd.click();}
    public void SelectAssignedMember2Rkpd() { selectAssignedMember2Rkpd.click();}
    public void BtnSelectAssignedMemberRkpd() { btnSelectAssignedMemberRkpd.click();}
    public void BtnCreateRkpd() { btnCreateRkpd.click();}
    public void BtnConfirmCreateRkpd() { btnConfirmCreateRkpd.click();}
    public void BtnCancelDownloadRkpd() { btnCancelDownloadRkpd.click();}
    public void BtnJpApprovalRkpd() { btnJpApprovalRkpd.click();}
    public void BtnSelectJpApprovalRkpd() { btnSelectJpApprovalRkpd.click();}
    public void SelectJpApprovalRkpd() { selectJpApprovalRkpd.click();}
    public void InputNoteJpApprovalRkpd(String inputNoteJpApprovalRkpd) { this.inputNoteJpApprovalRkpd.sendKeys(inputNoteJpApprovalRkpd);}
    public void BtnSaveJpApprovalRkpd() { btnSaveJpApprovalRkpd.click();}
    public void BtnConfirmJpSaveApprovalRkpd() { btnConfirmJpSaveApprovalRkpd.click();}
    public void BtnPartnerApprovalRkpd() { btnPartnerApprovalRkpd.click();}
    public void BtnSelectPartnerApprovalRkpd() { btnSelectPartnerApprovalRkpd.click();}
    public void SelectPartnerApprovalRkpd() { selectPartnerApprovalRkpd.click();}
    public void InputNotePartnerApprovalRkpd(String inputNotePartnerApprovalRkpd) { this.inputNotePartnerApprovalRkpd.sendKeys(inputNotePartnerApprovalRkpd);}
    public void BtnSavePartnerApprovalRkpd() { btnSavePartnerApprovalRkpd.click();}
    public void BtnConfirmPartnerSaveApprovalRkpd() { btnConfirmPartnerSaveApprovalRkpd.click();}
    public void SelectDocumentSuratTugas() { selectDocumentSuratTugas.click();}
    public void BtnSearchIdRkpd() { btnSearchIdRkpd.click();}
    public void SelectIdRkpd() { selectIdRkpd.click();}
    public void BtnSelectIdRkpd() { btnSelectIdRkpd.click();}
    public void ChecklistListofExpensesTicket() { checklistListofExpensesTicket.click();}
    public void ChecklistListofExpensesHotelCost() { checklistListofExpensesHotelCost.click();}
    public void BtnCreateSuratTugas() { btnCreateSuratTugas.click();}
    public void BtnConfirmCreateSuratTugas() { btnConfirmCreateSuratTugas.click();}
    public void BtnCancelDownloadSuratTugas() { btnCancelDownloadSuratTugas.click();}
    public void BtnPartnerApprovalSuratTugas() { btnPartnerApprovalSuratTugas.click();}
    public void BtnSelectPartnerApprovalSuratTugas() { btnSelectPartnerApprovalSuratTugas.click();}
    public void SelectPartnerApprovalSuratTugas() { selectPartnerApprovalSuratTugas.click();}
    public void InputNotePartnerApprovalSuratTugas(String inputNotePartnerApprovalSuratTugas) { this.inputNotePartnerApprovalSuratTugas.sendKeys(inputNotePartnerApprovalSuratTugas);}
    public void BtnSavePartnerApprovalSuratTugas() { btnSavePartnerApprovalSuratTugas.click();}
    public void BtnConfirmPartnerSaveApprovalSuratTugas() { btnConfirmPartnerSaveApprovalSuratTugas.click();}
    public void SelectDocumentLkpd() { selectDocumentLkpd.click();}
    public void BtnSearchIdSt() { btnSearchIdSt.click();}
    public void SelectIdSt() { selectIdSt.click();}
    public void BtnSelectIdSt() { btnSelectIdSt.click();}
    public void BtnChooseActivityLkpd() { btnChooseActivityLkpd.click();}
    public void ChooseActivityLkpd() { chooseActivityLkpd.click();}
    public void BtnSelectActivityLkpd() { btnSelectActivityLkpd.click();}
    public void BtnSowNextAgendaLkpd() { btnSowNextAgendaLkpd.click();}
    public void SelectSowNextAgendaLkpd() { selectSowNextAgendaLkpd.click();}
    public void BtnSelectSowNextAgendaLkpd() { btnSelectSowNextAgendaLkpd.click();}
    public void BtnDeadlineNextAgendaLkpd() { btnDeadlineNextAgendaLkpd.click();}
    public void BtnSelectTodayDeadlineNextAgendaLkpd() { btnSelectTodayDeadlineNextAgendaLkpd.click();}
    public void BtnPicNextAgendaLkpd() { btnPicNextAgendaLkpd.click();}
    public void SelectPic1NextAgendaLkpd() { selectPic1NextAgendaLkpd.click();}
    public void SelectPic2NextAgendaLkpd() { selectPic2NextAgendaLkpd.click();}
    public void BtnSelectPicNextAgendaLkpd() { btnSelectPicNextAgendaLkpd.click();}
    public void InputNoteNextAgendaLkpd(String inputNoteNextAgendaLkpd) { this.inputNoteNextAgendaLkpd.sendKeys(inputNoteNextAgendaLkpd);}
    public void BtnCreateLkpd() { btnCreateLkpd.click();}
    public void BtnConfirmCreateLkpd() { btnConfirmCreateLkpd.click();}
    public void BtnCancelDownloadLkpd() { btnCancelDownloadLkpd.click();}
    public void BtnJpApprovalLkpd() { btnJpApprovalLkpd.click();}
    public void BtnSelectJpApprovalLkpd() { btnSelectJpApprovalLkpd.click();}
    public void SelectJpApprovalLkpd() { selectJpApprovalLkpd.click();}
    public void InputNoteJpApprovalLkpd(String inputNoteJpApprovalLkpd) { this.inputNoteJpApprovalLkpd.sendKeys(inputNoteJpApprovalLkpd);}
    public void BtnSaveJpApprovalLkpd() { btnSaveJpApprovalLkpd.click();}
    public void BtnConfirmJpSaveApprovalLkpd() { btnConfirmJpSaveApprovalLkpd.click();}
    public void BtnPartnerApprovalLkpd() { btnPartnerApprovalLkpd.click();}
    public void BtnSelectPartnerApprovalLkpd() { btnSelectPartnerApprovalLkpd.click();}
    public void SelectPartnerApprovalLkpd() { selectPartnerApprovalLkpd.click();}
    public void InputNotePartnerApprovalLkpd(String inputNotePartnerApprovalLkpd) { this.inputNotePartnerApprovalLkpd.sendKeys(inputNotePartnerApprovalLkpd);}
    public void BtnSavePartnerApprovalLkpd() { btnSavePartnerApprovalLkpd.click();}
    public void BtnConfirmPartnerSaveApprovalLkpd() { btnConfirmPartnerSaveApprovalLkpd.click();}
    public void SelectDocumentBonPutih() { selectDocumentBonPutih.click();}
    public void BtnSearchIdLkpdBonPutih() { btnSearchIdLkpdBonPutih.click();}
    public void SelectIdLkpdBonPutih() { selectIdLkpdBonPutih.click();}
    public void BtnSelectIdLkpdBonPutih() { btnSelectIdLkpdBonPutih.click();}
    public void ChecklistReimbursement1BonPutih() { checklistReimbursement1BonPutih.click();}
    public void ChecklistReimbursement2BonPutih() { checklistReimbursement2BonPutih.click();}
    public void ChecklistReimbursement3BonPutih() { checklistReimbursement3BonPutih.click();}
    public void ChecklistReimbursement4BonPutih() { checklistReimbursement4BonPutih.click();}
    public void BtnCreateBonPutih() { btnCreateBonPutih.click();}
    public void BtnConfirmCreateBonPutih() { btnConfirmCreateBonPutih.click();}
    public void BtnCancelDownloadBonPutih() { btnCancelDownloadBonPutih.click();}
    public void BtnJpApprovalBonPutih() { btnJpApprovalBonPutih.click();}
    public void BtnSelectJpApprovalBonPutih() { btnSelectJpApprovalBonPutih.click();}
    public void SelectJpApprovalBonPutih() { selectJpApprovalBonPutih.click();}
    public void InputNoteJpApprovalBonPutih(String inputNoteJpApprovalBonPutih) { this.inputNoteJpApprovalBonPutih.sendKeys(inputNoteJpApprovalBonPutih);}
    public void BtnSaveJpApprovalBonPutih() { btnSaveJpApprovalBonPutih.click();}
    public void BtnConfirmJpSaveApprovalBonPutih() { btnConfirmJpSaveApprovalBonPutih.click();}
    public void BtnPartnerApprovalBonPutih() { btnPartnerApprovalBonPutih.click();}
    public void BtnSelectPartnerApprovalBonPutih() { btnSelectPartnerApprovalBonPutih.click();}
    public void SelectPartnerApprovalBonPutih() { selectPartnerApprovalBonPutih.click();}
    public void InputNotePartnerApprovalBonPutih(String inputNotePartnerApprovalBonPutih) { this.inputNotePartnerApprovalBonPutih.sendKeys(inputNotePartnerApprovalBonPutih);}
    public void BtnSavePartnerApprovalBonPutih() { btnSavePartnerApprovalBonPutih.click();}
    public void BtnConfirmPartnerSaveApprovalBonPutih() { btnConfirmPartnerSaveApprovalBonPutih.click();}
    public void BtnCreateFinanceDocuments() { btnCreateFinanceDocuments.click();}
    public void SelectDocumentBonHijau() { selectDocumentBonHijau.click();}
    public void BtnSelectFinanceDocuments() { btnSelectFinanceDocuments.click();}
    public void BtnSearchIdStBonHijau() { btnSearchIdStBonHijau.click();}
    public void SelectIdStBonHijau() { selectIdStBonHijau.click();}
    public void BtnSelectIdStBonHijau() { btnSelectIdStBonHijau.click();}
    public void InputAmountTripExpensesBonHijau1(String inputAmountTripExpensesBonHijau1) { this.inputAmountTripExpensesBonHijau1.sendKeys(inputAmountTripExpensesBonHijau1);}
    public void InputAmountTripExpensesBonHijau2(String inputAmountTripExpensesBonHijau2) { this.inputAmountTripExpensesBonHijau2.sendKeys(inputAmountTripExpensesBonHijau2);}
    public void InputNoteTripExpensesBonHijau1(String inputNoteTripExpensesBonHijau1) { this.inputNoteTripExpensesBonHijau1.sendKeys(inputNoteTripExpensesBonHijau1);}
    public void InputNoteTripExpensesBonHijau2(String inputNoteTripExpensesBonHijau2) { this.inputNoteTripExpensesBonHijau2.sendKeys(inputNoteTripExpensesBonHijau2);}
    public void BtnUploadRecipientTripExpensesBonHijau1(String btnUploadRecipientTripExpensesBonHijau1) { this.btnUploadRecipientTripExpensesBonHijau1.sendKeys(btnUploadRecipientTripExpensesBonHijau1);}
    public void BtnUploadRecipientTripExpensesBonHijau2(String btnUploadRecipientTripExpensesBonHijau2) { this.btnUploadRecipientTripExpensesBonHijau2.sendKeys(btnUploadRecipientTripExpensesBonHijau2);}
    public void BtnCreateBonHijau() { btnCreateBonHijau.click();}
    public void BtnConfirmCreateBonHijau() { btnConfirmCreateBonHijau.click();}
    public void BtnCancelDownloadBonHijau() { btnCancelDownloadBonHijau.click();}
    public void BtnJpApprovalBonHijau() { btnJpApprovalBonHijau.click();}
    public void BtnSelectJpApprovalBonHijau() { btnSelectJpApprovalBonHijau.click();}
    public void SelectJpApprovalBonHijau() { selectJpApprovalBonHijau.click();}
    public void InputNoteJpApprovalBonHijau(String inputNoteJpApprovalBonHijau) { this.inputNoteJpApprovalBonHijau.sendKeys(inputNoteJpApprovalBonHijau);}
    public void BtnSaveJpApprovalBonHijau() { btnSaveJpApprovalBonHijau.click();}
    public void BtnConfirmJpSaveApprovalBonHijau() { btnConfirmJpSaveApprovalBonHijau.click();}
    public void BtnPartnerApprovalBonHijau() { btnPartnerApprovalBonHijau.click();}
    public void BtnSelectPartnerApprovalBonHijau() { btnSelectPartnerApprovalBonHijau.click();}
    public void SelectPartnerApprovalBonHijau() { selectPartnerApprovalBonHijau.click();}
    public void InputNotePartnerApprovalBonHijau(String inputNotePartnerApprovalBonHijau) { this.inputNotePartnerApprovalBonHijau.sendKeys(inputNotePartnerApprovalBonHijau);}
    public void BtnSavePartnerApprovalBonHijau() { btnSavePartnerApprovalBonHijau.click();}
    public void BtnConfirmPartnerSaveApprovalBonHijau() { btnConfirmPartnerSaveApprovalBonHijau.click();}
    public void SelectDocumentBonKuning() { selectDocumentBonKuning.click();}
    public void BtnSearchIdBonPutihBonKuning() { btnSearchIdBonPutihBonKuning.click();}
    public void SelectIdBonPutihBonKuning() { selectIdBonPutihBonKuning.click();}
    public void BtnSelectIdBonPutihBonKuning() { btnSelectIdBonPutihBonKuning.click();}
    public void ChecklistProfessionalFee1BonKuning() { checklistProfessionalFee1BonKuning.click();}
    public void ChecklistCourtMoney1BonKuning() { checklistCourtMoney1BonKuning.click();}
    public void ChecklistAllowance1BonKuning() { checklistAllowance1BonKuning.click();}
    public void ChecklistMealAllowance1BonKuning() { checklistMealAllowance1BonKuning.click();}
    public void ChecklistProfessionalFee2BonKuning() { checklistProfessionalFee2BonKuning.click();}
    public void ChecklistCourtMoney2BonKuning() { checklistCourtMoney2BonKuning.click();}
    public void ChecklistAllowance2BonKuning() { checklistAllowance2BonKuning.click();}
    public void ChecklistMealAllowance2BonKuning() { checklistMealAllowance2BonKuning.click();}
    public void BtnCreateBonKuning() { btnCreateBonKuning.click();}
    public void BtnConfirmCreateBonKuning() { btnConfirmCreateBonKuning.click();}
    public void BtnCancelDownloadBonKuning() { btnCancelDownloadBonKuning.click();}
    public void BtnJpApprovalBonKuning() { btnJpApprovalBonKuning.click();}
    public void BtnSelectJpApprovalBonKuning() { btnSelectJpApprovalBonKuning.click();}
    public void SelectJpApprovalBonKuning() { selectJpApprovalBonKuning.click();}
    public void InputNoteJpApprovalBonKuning(String inputNoteJpApprovalBonKuning) { this.inputNoteJpApprovalBonKuning.sendKeys(inputNoteJpApprovalBonKuning);}
    public void BtnSaveJpApprovalBonKuning() { btnSaveJpApprovalBonKuning.click();}
    public void BtnConfirmJpSaveApprovalBonKuning() { btnConfirmJpSaveApprovalBonKuning.click();}
    public void BtnPartnerApprovalBonKuning() { btnPartnerApprovalBonKuning.click();}
    public void BtnSelectPartnerApprovalBonKuning() { btnSelectPartnerApprovalBonKuning.click();}
    public void SelectPartnerApprovalBonKuning() { selectPartnerApprovalBonKuning.click();}
    public void InputNotePartnerApprovalBonKuning(String inputNotePartnerApprovalBonKuning) { this.inputNotePartnerApprovalBonKuning.sendKeys(inputNotePartnerApprovalBonKuning);}
    public void BtnSavePartnerApprovalBonKuning() { btnSavePartnerApprovalBonKuning.click();}
    public void BtnConfirmPartnerSaveApprovalBonKuning() { btnConfirmPartnerSaveApprovalBonKuning.click();}
    public void SelectDocumentBonMerah() { selectDocumentBonMerah.click();}
    public void InputDescriptionBonMerah(String inputDescriptionBonMerah) { this.inputDescriptionBonMerah.sendKeys(inputDescriptionBonMerah);}
    public void SelectReceiptDateBonMerah() { selectReceiptDateBonMerah.click();}
    public void BtnSelectTodayReceiptDateBonMerah() { btnSelectTodayReceiptDateBonMerah.click();}
    public void InputAccountNumberBonMerah(String inputAccountNumberBonMerah) { this.inputAccountNumberBonMerah.sendKeys(inputAccountNumberBonMerah);}
    public void InputAmountReceivedBonMerah(String inputAmountReceivedBonMerah) { this.inputAmountReceivedBonMerah.sendKeys(inputAmountReceivedBonMerah);}
    public void InputFinalValueBonMerah(String inputFinalValueBonMerah) { this.inputFinalValueBonMerah.sendKeys(inputFinalValueBonMerah);}
    public void BtnCreateBonMerah() { btnCreateBonMerah.click();}
    public void BtnConfirmCreateBonMerah() { btnConfirmCreateBonMerah.click();}
    public void BtnCancelDownloadBonMerah() { btnCancelDownloadBonMerah.click();}
    public void BtnViewRkpd() { btnViewRkpd.click();}
    public void BtnBackViewRkpd() { btnBackViewRkpd.click();}
    public void BtnViewSuratTugas() { btnViewSuratTugas.click();}
    public void BtnBackViewSuratTugas() { btnBackViewSuratTugas.click();}
    public void BtnViewBonHijau() { btnViewBonHijau.click();}
    public void BtnBackViewBonHijau() { btnBackViewBonHijau.click();}
    public void BtnViewLkpd() { btnViewLkpd.click();}
    public void BtnBackViewLkpd() { btnBackViewLkpd.click();}
    public void BtnViewBonPutih() { btnViewBonPutih.click();}
    public void BtnBackViewBonPutih() { btnBackViewBonPutih.click();}
    public void BtnViewBonKuning() { btnViewBonKuning.click();}
    public void BtnBackViewBonKuning() { btnBackViewBonKuning.click();}
    public void BtnViewBusinessTripRecap1() { btnViewBusinessTripRecap1.click();}
    public void BtnBackViewBusinessTripRecap() { btnBackViewBusinessTripRecap.click();}
    public void BtnViewBusinessTripExpensesRecap() { btnViewBusinessTripExpensesRecap.click();}
    public void BtnBackViewBusinessTripExpensesRecap() { btnBackViewBusinessTripExpensesRecap.click();}
    public void BtnEditBonKuning() { btnEditBonKuning.click();}
    public void UnchecklistMealAllowanceEditBonKuning() { unchecklistMealAllowanceEditBonKuning.click();}
    public void BtnSaveEditBonKuning() { btnSaveEditBonKuning.click();}
    public void BtnConfirmSaveEditBonKuning() { btnConfirmSaveEditBonKuning.click();}
    public void BtnDeleteBonKuning() { btnDeleteBonKuning.click();}
    public void BtnConfirmDeleteBonKuning() { btnConfirmDeleteBonKuning.click();}
    public void BtnEditBonPutih() { btnEditBonPutih.click();}
    public void UnchecklistMealAllowanceEditBonPutih() { unchecklistMealAllowanceEditBonPutih.click();}
    public void BtnSaveEditBonPutih() { btnSaveEditBonPutih.click();}
    public void BtnConfirmSaveEditBonPutih() { btnConfirmSaveEditBonPutih.click();}
    public void BtnDeleteBonPutih() { btnDeleteBonPutih.click();}
    public void BtnConfirmDeleteBonPutih() { btnConfirmDeleteBonPutih.click();}
    public void BtnEditBonHijau() { btnEditBonHijau.click();}
    public void BtnAddTripExpensesEditBonHijau() { btnAddTripExpensesEditBonHijau.click();}
    public void InputListOfExpensesTripExpensesEditBonHijau(String inputListOfExpensesTripExpensesEditBonHijau) { this.inputListOfExpensesTripExpensesEditBonHijau.sendKeys(inputListOfExpensesTripExpensesEditBonHijau);}
    public void InputAmountTripExpensesEditBonHijau(String inputAmountTripExpensesEditBonHijau) { this.inputAmountTripExpensesEditBonHijau.sendKeys(inputAmountTripExpensesEditBonHijau);}
    public void InputNoteTripExpensesEditBonHijau(String inputNoteTripExpensesEditBonHijau) { this.inputNoteTripExpensesEditBonHijau.sendKeys(inputNoteTripExpensesEditBonHijau);}
    public void BtnUploadRecipientTripExpensesEditBonHijau(String btnUploadRecipientTripExpensesEditBonHijau) { this.btnUploadRecipientTripExpensesEditBonHijau.sendKeys(btnUploadRecipientTripExpensesEditBonHijau);}
    public void BtnSaveEditBonHijau() { btnSaveEditBonHijau.click();}
    public void BtnConfirmSaveEditBonHijau() { btnConfirmSaveEditBonHijau.click();}
    public void BtnDeleteBonHijau() { btnDeleteBonHijau.click();}
    public void BtnConfirmDeleteBonHijau() { btnConfirmDeleteBonHijau.click();}
    public void BtnViewBusinessTripRecap() { btnViewBusinessTripRecap.click();}
    public void BtnEditLkpd() { btnEditLkpd.click();}
    public void BtnChooseResultReportEditLkpd() { btnChooseResultReportEditLkpd.click();}
    public void SelectActivityResultReportEditLkpd() { selectActivityResultReportEditLkpd.click();}
    public void BtnSelectActivityResultReportEditLkpd() { btnSelectActivityResultReportEditLkpd.click();}
    public void BtnSaveEditLkpd() { btnSaveEditLkpd.click();}
    public void BtnConfirmSaveEditLkpd() { btnConfirmSaveEditLkpd.click();}
    public void BtnDeleteLkpd() { btnDeleteLkpd.click();}
    public void BtnConfirmDeleteLkpd() { btnConfirmDeleteLkpd.click();}
    public void BtnEditSuratTugas() { btnEditSuratTugas.click();}
    public void UnchecklistTicketListOfExpensesEditSuratTugas() { unchecklistTicketListOfExpensesEditSuratTugas.click();}
    public void BtnSaveEditSuratTugas() { btnSaveEditSuratTugas.click();}
    public void BtnConfirmSaveEditSuratTugas() { btnConfirmSaveEditSuratTugas.click();}
    public void BtnDeleteSuratTugas() { btnDeleteSuratTugas.click();}
    public void BtnConfirmDeleteSuratTugas() { btnConfirmDeleteSuratTugas.click();}
    public void BtnEditRkpd() { btnEditRkpd.click();}
    public void BtnSaveEditRkpd() { btnSaveEditRkpd.click();}
    public void BtnConfirmSaveEditRkpd() { btnConfirmSaveEditRkpd.click();}
    public void BtnDeleteRkpd() { btnDeleteRkpd.click();}
    public void BtnConfirmDeleteRkpd() { btnConfirmDeleteRkpd.click();}
    public void BtnUploadDocumentHoWorkingPlan() { btnUploadDocumentHoWorkingPlan.click();}
    public void BtnChooseFileUploadDocumentHoWorkingPlan(String btnChooseFileUploadDocumentHoWorkingPlan) { this.btnChooseFileUploadDocumentHoWorkingPlan.sendKeys(btnChooseFileUploadDocumentHoWorkingPlan);}
    public void BtnUploadDocument() { btnUploadDocument.click();}
    public void BtnConfirmUploadDocument() { btnConfirmUploadDocument.click();}
    public void BtnDeleteUploadDocumentHoWorkingPlan() { btnDeleteUploadDocumentHoWorkingPlan.click();}
    public void BtnConfirmDeleteUploadDocumentHoWorkingPlan() { btnConfirmDeleteUploadDocumentHoWorkingPlan.click();}
}
















































