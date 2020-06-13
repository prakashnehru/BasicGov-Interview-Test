package com.basicgov.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage {

    private WebDriver driver = null;

    @FindBy(xpath = "//*[@id='sfdc_username_container']//*[@class='input sfdc_usernameinput sfdc input']")
    public WebElement usernameInput;

    @FindBy(xpath = "//*[@id='sfdc_password_container']//*[@class='input sfdc_passwordinput sfdc input']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[text()='Log in']")
    public WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openUrl(){
        driver.get("https://sandbox-momentum-site-2423-17294a2541e.cs50.force.com/s/");
    }

    public void enterValidBusinessAccountCredentials(String username, String password) throws InterruptedException {
        Thread.sleep(5000);
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

}
