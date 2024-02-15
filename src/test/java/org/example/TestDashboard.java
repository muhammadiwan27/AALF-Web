package org.example;

import io.cucumber.java.en.And;
import org.example.pages.LoginDanLogoutPage;
import org.example.pages.DashboardPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestDashboard {
    static WebDriver driver;
    static ExtentTest extentTest;
    static DashboardPage dashboardPage = new DashboardPage();
    static LoginDanLogoutPage loginPage = new LoginDanLogoutPage();
    public TestDashboard(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

//Dashboard Valid Functionality Test
    @When("User get text title page dashboard")
    public void user_get_text_title_page_dashboard(){
        Hooks.delay(1);
        loginPage.clearUsername();
        loginPage.enterUsername("go");
        Hooks.delay(1);
        loginPage.clearpassword();
        loginPage.enterPassword("go");
        loginPage.BtnLogin();
        Hooks.delay(1);
        Assert.assertEquals(dashboardPage.getTxtDashboard(),"Dashboard");
        extentTest.log(LogStatus.PASS, "User get text title page dashboard");
    }

//Search Task & Team Activity Graphs By Date
    @When("User input on the search bar start date task activity")
    public void user_input_on_the_search_bar_start_date_task_activity() {
        Hooks.delay(1);
        dashboardPage.StartDateTaskActivityDashboard("January");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User input on the search bar start date task activity");
    }

    @And("User input on the search bar end date task activity")
    public void user_input_on_the_search_bar_end_date_task_activity() {
        Hooks.delay(1);
        dashboardPage.EndDateTaskActivityDashboard("March");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User input on the search bar end date task activity");
    }

    @Then("User click button apply search bar task activity graphs")
    public void user_click_button_apply_search_bar_task_activity_graphs() {
        Hooks.delay(1);
        dashboardPage.BtnApplyDateTaskActivityDashboard();
        extentTest.log(LogStatus.PASS, "User click button apply search bar task activity graphs");
    }

//Search HO Team Graphs By Date
    @When("User input on the search bar start date ho team")
    public void User_input_on_the_search_bar_start_date_ho_team() {
        Hooks.delay(1);
        dashboardPage.StartDateHoTeamDashboard("February");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User input on the search bar start date task activity");
    }

    @And("User input on the search bar end date ho team")
    public void user_input_on_the_search_bar_end_date_ho_team() {
        Hooks.delay(1);
        dashboardPage.EndDateHoTeamDashboard("June");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User input on the search bar end date task activity");
    }

    @Then("User click button apply search bar ho team graphs")
    public void user_click_button_apply_search_bar_ho_team_graphs() {
        Hooks.delay(1);
        dashboardPage.BtnApplyDateHoTeamDashboard();
        extentTest.log(LogStatus.PASS, "User click button apply search bar task activity graphs");
    }
}
