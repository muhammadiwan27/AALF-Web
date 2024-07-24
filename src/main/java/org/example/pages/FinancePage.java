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




    public void TabFinance() { tabFinance.click();}
    public String getTxtFinance(){return txtFinance.getText();}
    public void TabHoReport() { tabHoReport.click();}
    public String getTxtHoReport(){return txtHoReport.getText();}
    public void TabTaskActivityReport() { tabTaskActivityReport.click();}
    public String getTxtTaskActivityReport(){return txtTaskActivityReport.getText();}
    public void TabClientReport() { tabClientReport.click();}
    public String getTxtClientReport(){return txtClientReport.getText();}
}
