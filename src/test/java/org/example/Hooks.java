package org.example;

import org.example.drivers.DriverSingleton;
import org.example.utils.Constants;
import org.example.utils.TestScenarios;
import org.example.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.AfterAll;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Hooks {

    static WebDriver driver;
    static ExtentTest extentTest;
    static ExtentReports reports = new ExtentReports("target/extent-report.html");

    @Before
    public static void setUp() {
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        TestScenarios[] test = TestScenarios.values();
        extentTest = reports.startTest(test[Utils.testCount].getTestCaseName());
        Utils.testCount++;
    }

    @AfterStep
    public void getResultStatus(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            String screeshotPath = Utils.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            extentTest.log(LogStatus.FAIL, scenario.getName() + "\n"
                    + extentTest.addScreenCapture(screeshotPath));
        }
    }

    @After
    public void endTestCase() {
        reports.endTest(extentTest);
        reports.flush();
    }

    @AfterAll
    public static void closeBrowser() {
        delay(3);
        DriverSingleton.closeObjectInstance();
    }

    public static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}