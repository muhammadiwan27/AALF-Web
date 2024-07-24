package org.example;

import io.cucumber.java.en.And;
import org.example.pages.FinancePage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;




public class TestFinance {
    static WebDriver driver;
    static ExtentTest extentTest;
    static FinancePage financePage = new FinancePage();

    public TestFinance() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

//Enter Finance Page
    @When("User click tab finance")
    public void User_click_tab_finance() {
        Hooks.delay(1);
        financePage.TabFinance();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab finance");
    }

    @Then("User get text title page finance")
    public void user_get_text_title_page_finance() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtFinance(), "Finance");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page finance");
    }

//Enter HO Report Finance Page
    @When("User click tab ho report finance")
    public void User_click_tab_ho_report_finance() {
        Hooks.delay(1);
        financePage.TabHoReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click tab ho report finance");
    }

    @Then("User get text title page ho report finance")
    public void user_get_text_title_page_ho_report_finance() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtHoReport(), "HO Report");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page ho report finance");
    }

//Enter Task & Activity Report Finance Page
    @When("User click sub tab task activity report finance")
    public void User_click_sub_tab_task_activity_report_finance() {
        Hooks.delay(1);
        financePage.TabTaskActivityReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click sub tab task activity report finance");
    }

    @Then("User get text title page task activity report finance")
    public void user_get_text_title_page_task_activity_report_finance() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtTaskActivityReport(), "Task & Activity");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page task activity report finance");
    }

//Enter Client Report Finance Page
    @When("User click sub tab client report finance")
    public void user_click_sub_tab_client_report_finance() {
        Hooks.delay(1);
        financePage.TabClientReport();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User click sub tab client report finance");
    }

    @Then("User get text title page client report finance")
    public void user_get_text_title_page_client_report_finance() {
        Hooks.delay(1);
        Assert.assertEquals(financePage.getTxtClientReport(), "Client");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User get text title page client report finance");
    }
}
