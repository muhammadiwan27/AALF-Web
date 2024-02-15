package org.example.pages;

import org.example.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginDanLogoutPage {

    private WebDriver driver;
    public LoginDanLogoutPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement username;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement btnLogin;
    @FindBy(xpath = "//p[@class='mr-auto']")
    WebElement btnLogout;
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement btnLogoutOk;
    @FindBy(xpath = "//h1[normalize-space()='Dashboard Handling Order Management']")
    WebElement txtProfile;
    @FindBy(xpath = "(//p[@class='text-white w-[300px]'])[1]")
    WebElement txtInvalidCredentials;

    public void clearUsername() { username.clear();}
    public void clearpassword() { password.clear();}
    public void BtnLogout() { btnLogout.click();}
    public void BtnLogoutOk() { btnLogoutOk.click();}
    public void enterUsername(String username) {this.username.sendKeys(username);}
    public void enterPassword(String password){
        this.password.sendKeys(password);
    }
    public void BtnLogin(){
        btnLogin.click();
    }
    public String getTxtProfile(){
        return txtProfile.getText();
    }
    public String getTxtInvalidCredentials(){
        return txtInvalidCredentials.getText();
    }
    public String getAtributUsername(){
        return username.getAttribute("required"); // return true, value dari required
    }

}
