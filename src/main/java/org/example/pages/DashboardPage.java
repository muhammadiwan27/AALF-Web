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

    @FindBy(xpath = "(//input[@placeholder='Start date'])[1]")
    WebElement startDateTaskActivityDashboard;

    @FindBy(xpath = "(//input[@placeholder='End date'])[1]")
    WebElement endDateTaskActivityDashboard;

    @FindBy(xpath = "(//button[contains(text(),'Apply')])[1]")
    WebElement btnApplyDateTaskActivityDashboard;

    @FindBy(xpath = "(//input[@placeholder='Start date'])[2]")
    WebElement startDateHoTeamDashboard;

    @FindBy(xpath = "(//input[@placeholder='End date'])[2]")
    WebElement endDateHoTeamDashboard;

    @FindBy(xpath = "(//button[contains(text(),'Apply')])[1]")
    WebElement btnApplyDateHoTeamDashboard;

    public String getTxtDashboard() { return txtDashboard.getText();}
    public void StartDateTaskActivityDashboard(String startDateTaskActivityDashboard) {this.startDateTaskActivityDashboard.sendKeys(startDateTaskActivityDashboard);}
    public void EndDateTaskActivityDashboard(String endDateTaskActivityDashboard) {this.endDateTaskActivityDashboard.sendKeys(endDateTaskActivityDashboard);}
    public void BtnApplyDateTaskActivityDashboard() { btnApplyDateTaskActivityDashboard.click();}
    public void StartDateHoTeamDashboard(String startDateHoTeamDashboard) {this.startDateHoTeamDashboard.sendKeys(startDateHoTeamDashboard);}
    public void EndDateHoTeamDashboard(String endDateHoTeamDashboard) {this.endDateHoTeamDashboard.sendKeys(endDateHoTeamDashboard);}
    public void BtnApplyDateHoTeamDashboard() { btnApplyDateHoTeamDashboard.click();}
}

