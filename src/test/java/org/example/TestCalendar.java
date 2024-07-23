package org.example;

import io.cucumber.java.en.And;
import org.example.pages.CalendarPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class TestCalendar {
    static WebDriver driver;
    static ExtentTest extentTest;
    static CalendarPage CalendarPage = new CalendarPage();
    public TestCalendar() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

//Enter Calendar Page
    @When("User click tab calendar")
    public void user_click_tab_calendar() {
        Hooks.delay(1);
        CalendarPage.TabCalendar();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab calendar");
    }

    @Then("User get text title page calendar")
    public void user_get_text_title_page_calendar() {
        Hooks.delay(1);
        Assert.assertEquals(CalendarPage.getTxtCalendar(),"July 2024");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page calendar");
    }
}
