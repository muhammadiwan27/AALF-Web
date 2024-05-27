package org.example.pages;

import org.example.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    private WebDriver driver;
    public DashboardPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//span[normalize-space()='Dashboard']")
    WebElement txtDashboard;

    @FindBy(xpath = "(//p[normalize-space()='Total HO Overall'])[1]")
    WebElement tabTotalHoOverallDashboard;

    @FindBy(xpath = "(//button[contains(text(),'✕')])[1]")
    WebElement buttonCloseTotalHoOverallDashboard;

    @FindBy(xpath = "(//p[normalize-space()='HO On Progress'])[1]")
    WebElement tabHoOnProgressDashboard;

    @FindBy(xpath = "(//button[contains(text(),'✕')])[1]")
    WebElement buttonCloseHoOnProgressDashboard;

    @FindBy(xpath = "(//p[normalize-space()='HO Completed'])[1]")
    WebElement tabHoOnCompletedDashboard;

    @FindBy(xpath = "(//button[contains(text(),'✕')])[1]")
    WebElement buttonCloseHoCompletedDashboard;

    @FindBy(xpath = "(//p[normalize-space()='Total Task'])[1]")
    WebElement tabTotalTaskDashboard;

    @FindBy(xpath = "(//button[contains(text(),'✕')])[1]")
    WebElement buttonCloseTotalTaskDashboard;

    @FindBy(xpath = "(//p[normalize-space()='TASK HAS NOT proceed'])[1]")
    WebElement tabTaskHasNotProceedDashboard;

    @FindBy(xpath = "(//button[contains(text(),'✕')])[1]")
    WebElement buttonCloseTaskHasNotProceedDashboard;

    @FindBy(xpath = "(//p[normalize-space()='Task Need Approval JP'])[1]")
    WebElement tabTaskNeedApprovalJpDashboard;

    @FindBy(xpath = "(//button[contains(text(),'✕')])[1]")
    WebElement buttonCloseTaskNeedApprovalJpDashboard;

    @FindBy(xpath = "(//p[normalize-space()='Task Need Approval Partner'])[1]")
    WebElement tabTaskNeedApprovalPartnerDashboard;

    @FindBy(xpath = "(//button[contains(text(),'✕')])[1]")
    WebElement buttonCloseTaskNeedApprovalPartnerDashboard;

    @FindBy(xpath = "(//p[normalize-space()='Task Finished'])[1]")
    WebElement tabTaskFinishedDashboard;

    @FindBy(xpath = "(//button[contains(text(),'✕')])[1]")
    WebElement buttonCloseTaskFinishedDashboard;

    @FindBy(xpath = "(//p[normalize-space()='Total Task'])[1]")
    WebElement tabTotalActivityDashboard;

    @FindBy(xpath = "(//button[contains(text(),'✕')])[1]")
    WebElement buttonCloseTotalActivityDashboard;

    @FindBy(xpath = "(//p[normalize-space()='TASK HAS NOT proceed'])[1]")
    WebElement tabActivityNeedRevisionDashboard;

    @FindBy(xpath = "(//button[contains(text(),'✕')])[1]")
    WebElement buttonCloseActivityNeedRevisionDashboard;

    @FindBy(xpath = "(//p[normalize-space()='Task Need Approval JP'])[1]")
    WebElement tabActivityNeedApprovalJpDashboard;

    @FindBy(xpath = "(//button[contains(text(),'✕')])[1]")
    WebElement buttonCloseActivityNeedApprovalJpDashboard;

    @FindBy(xpath = "(//p[normalize-space()='Task Need Approval Partner'])[1]")
    WebElement tabActivityNeedApprovalPartnerDashboard;

    @FindBy(xpath = "(//button[contains(text(),'✕')])[1]")
    WebElement buttonCloseActivityNeedApprovalPartnerDashboard;

    @FindBy(xpath = "(//p[normalize-space()='Task Finished'])[1]")
    WebElement tabActivityFinishedDashboard;

    @FindBy(xpath = "(//button[contains(text(),'✕')])[1]")
    WebElement buttonCloseActivityFinishedDashboard;

    @FindBy(xpath = "(//small[normalize-space()='hodev001 / Jason Kariatun / Drafting'])[1]")
    WebElement idHoOverdueDeadlineTask;

    @FindBy(xpath = "(//small[normalize-space()='hodev001 / Jason Kariatun / Meeting Weekly'])[1]")
    WebElement idHoUpcomingDeadlineTask;

    @FindBy(xpath = "(//small[normalize-space()='Event - Pergi main bowling'])[1]")
    WebElement eventCardOnCalendar;

    @FindBy(xpath = "(//a[normalize-space()='Add Event'])[1]")
    WebElement btnAddEvent;

    @FindBy(xpath = "(//input[@id='nm_item'])[1]")
    WebElement inputTitleEvent;

    @FindBy(xpath = "(//input[@placeholder='Start date'])[1]")
    WebElement btnStartDateEvent;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    WebElement btnSelectTodayStartDateEvent;

    @FindBy(xpath = "(//input[@placeholder='End date'])[1]")
    WebElement btnEndDateEvent;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    WebElement btnSelectTodayEndDateEvent;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    WebElement btnChooseReminderTypeEvent;

    @FindBy(xpath = "(//option[@value='3'])[1]")
    WebElement selectReminderTypeEvent;

    @FindBy(xpath = "(//textarea[@id='satuan_item'])[1]")
    WebElement inputNoteEvent;

    @FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
    WebElement buttonCreateEvent;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement buttonConfirmCreateEvent;

    @FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    WebElement buttonEditEvent;

    @FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
    WebElement buttonConfirmEditEvent;





    public String getTxtDashboard() { return txtDashboard.getText();}
    public void TabTotalHoOverallDashboard() { tabTotalHoOverallDashboard.click();}
    public void ButtonCloseTotalHoOverallDashboard() { buttonCloseTotalHoOverallDashboard.click();}
    public void TabHoOnProgressDashboard() { tabHoOnProgressDashboard.click();}
    public void ButtonCloseHoOnProgressDashboard() { buttonCloseHoOnProgressDashboard.click();}
    public void TabHoOnCompletedDashboard() { tabHoOnCompletedDashboard.click();}
    public void ButtonCloseHoCompletedDashboard() { buttonCloseHoCompletedDashboard.click();}
    public void TabTotalTaskDashboard() { tabTotalTaskDashboard.click();}
    public void ButtonCloseTotalTaskDashboard() { buttonCloseTotalTaskDashboard.click();}
    public void TabTaskHasNotProceedDashboard() { tabTaskHasNotProceedDashboard.click();}
    public void ButtonCloseTaskHasNotProceedDashboard() { buttonCloseTaskHasNotProceedDashboard.click();}
    public void TabTaskNeedApprovalJpDashboard() { tabTaskNeedApprovalJpDashboard.click();}
    public void ButtonCloseTaskNeedApprovalJpDashboard() { buttonCloseTaskNeedApprovalJpDashboard.click();}
    public void TabTaskNeedApprovalPartnerDashboard() { tabTaskNeedApprovalPartnerDashboard.click();}
    public void ButtonCloseTaskNeedApprovalPartnerDashboard() { buttonCloseTaskNeedApprovalPartnerDashboard.click();}
    public void TabTaskFinishedDashboard() { tabTaskFinishedDashboard.click();}
    public void ButtonCloseTaskFinishedDashboard() { buttonCloseTaskFinishedDashboard.click();}
    public void TabTotalActivityDashboard() { tabTotalActivityDashboard.click();}
    public void ButtonCloseTotalActivityDashboard() { buttonCloseTotalActivityDashboard.click();}
    public void TabActivityNeedRevisionDashboard() { tabActivityNeedRevisionDashboard.click();}
    public void ButtonCloseActivityNeedRevisionDashboard() { buttonCloseActivityNeedRevisionDashboard.click();}
    public void TabActivityNeedApprovalJpDashboard() { tabActivityNeedApprovalJpDashboard.click();}
    public void ButtonCloseActivityNeedApprovalJpDashboard() { buttonCloseActivityNeedApprovalJpDashboard.click();}
    public void TabActivityNeedApprovalPartnerDashboard() { tabActivityNeedApprovalPartnerDashboard.click();}
    public void ButtonCloseActivityNeedApprovalPartnerDashboard() { buttonCloseActivityNeedApprovalPartnerDashboard.click();}
    public void TabActivityFinishedDashboard() { tabActivityFinishedDashboard.click();}
    public void ButtonCloseActivityFinishedDashboard() { buttonCloseActivityFinishedDashboard.click();}
    public void IdHoOverdueDeadlineTask() { idHoOverdueDeadlineTask.click();}
    public void IdHoUpcomingDeadlineTask() { idHoUpcomingDeadlineTask.click();}
    public void EventCardOnCalendar() { eventCardOnCalendar.click();}
    public void BtnAddEvent() { btnAddEvent.click();}
    public void InputTitleEvent(String inputTitleEvent) { this.inputTitleEvent.sendKeys(inputTitleEvent);}
    public void BtnStartDateEvent() { btnStartDateEvent.click();}
    public void BtnSelectTodayStartDateEvent() { btnSelectTodayStartDateEvent.click();}
    public void BtnEndDateEvent() { btnEndDateEvent.click();}
    public void BtnSelectTodayEndDateEvent() { btnSelectTodayEndDateEvent.click();}
    public void BtnChooseReminderTypeEvent() { btnChooseReminderTypeEvent.click();}
    public void SelectReminderTypeEvent() { selectReminderTypeEvent.click();}
    public void InputNoteEvent(String inputNoteEvent) { this.inputNoteEvent.sendKeys(inputNoteEvent);}
    public void ButtonCreateEvent() { buttonCreateEvent.click();}
    public void ButtonConfirmCreateEvent() { buttonConfirmCreateEvent.click();}
    public void InputDeleteNoteEvent() { inputNoteEvent.clear();}
    public void ButtonEditEvent() { buttonEditEvent.click();}
    public void ButtonConfirmEditEvent() { buttonConfirmEditEvent.click();}
}




























