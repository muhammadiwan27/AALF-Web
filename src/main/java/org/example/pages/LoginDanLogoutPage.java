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

    @FindBy(xpath = "(//p[@class='mr-auto'])[1]")
    WebElement btnLogout;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement btnLogoutOk;

    @FindBy(xpath = "(//p[@class='text-white w-[300px]'])[1]")
    WebElement txtInvalidCredentials;






    public void ClearUsername() { username.clear();}
    public void Clearpassword() { password.clear();}
    public void BtnLogout() { btnLogout.click();}
    public void BtnLogoutOk() { btnLogoutOk.click();}
    public void EnterUsername(String username) {this.username.sendKeys(username);}
    public void EnterPassword(String password){
        this.password.sendKeys(password);
    }
    public void BtnLogin(){
        btnLogin.click();
    }
    public String getTxtInvalidCredentials(){
        return txtInvalidCredentials.getText();
    }
    public String getAtributUsername(){
        return username.getAttribute("required"); // return true, value dari required
    }

}
