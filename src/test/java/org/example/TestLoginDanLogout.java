package org.example;

import org.example.pages.LoginDanLogoutPage;
import org.example.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLoginDanLogout {
    static WebDriver driver;
    static ExtentTest extentTest;
    static LoginDanLogoutPage loginDanLogoutPage = new LoginDanLogoutPage();

    public TestLoginDanLogout(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

//Login Valid Functionality Test
    @Given("User enter url AALF")
    public void user_enter_url_AALF(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User enter url AALF");
    }

    @When("User enter valid username")
    public void user_enter_valid_username(){
        Hooks.delay(1);
        loginDanLogoutPage.enterUsername("go");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User enter valid username");
    }

    @And("User enter valid password")
    public void user_enter_valid_password(){
        Hooks.delay(1);
        loginDanLogoutPage.enterPassword("go");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User enter valid password");
    }

    @Then("User click button login")
    public void user_click_button_login(){
        Hooks.delay(1);
        loginDanLogoutPage.BtnLogin();
        Hooks.delay(5);
        extentTest.log(LogStatus.PASS, "User click button login");
    }

//Login Invalid Functionality Test
    @When("User enter invalid username")
    public void user_enter_invalid_username(){
        Hooks.delay(3);
        loginDanLogoutPage.BtnLogout();
        Hooks.delay(1);
        loginDanLogoutPage.BtnLogoutOk();
        Hooks.delay(1);
        loginDanLogoutPage.enterUsername("qa.tester@hadir.con");
        extentTest.log(LogStatus.PASS,"User enter invalid username");
    }

    @And("User enter invalid password")
    public void user_enter_invalid_password(){
        Hooks.delay(1);
        loginDanLogoutPage.enterPassword("admin1234");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS,"User enter invalid password");
    }

    @Then("User get text invalid credentials")
    public void user_get_text_invalid_credentials(){
        Hooks.delay(1);
        Assert.assertEquals(loginDanLogoutPage.getTxtInvalidCredentials(),"Username or Password do not match");
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS,"User get text invalid credentials");
    }
}