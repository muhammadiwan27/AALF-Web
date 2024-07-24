package org.example.pages;

import org.example.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {
    private WebDriver driver;

    public CalendarPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[normalize-space()='Calendar'])[1]")
    WebElement tabCalendar;

    @FindBy(xpath = "(//h2[normalize-space()='July 2024'])[1]")
    WebElement txtCalendar;





    public void TabCalendar() { tabCalendar.click();}
    public String getTxtCalendar() { return txtCalendar.getText();}
}


