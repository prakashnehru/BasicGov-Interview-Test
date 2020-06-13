package com.basicgov.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver = null;

    @FindBy(xpath = "//*[text()='Welcome']")
    public WebElement welcomeText;

    @FindBy(xpath = "//button[text()='Apply For Permit']")
    public WebElement createPermitButton;

    @FindBy(xpath = "//*[@class='slds-card__body']/ul/li[1]/div/h3")
    public WebElement newlyCreatedParcelAddress;

    @FindBy(xpath = "//*[@class='slds-card__body']/ul/li[1]/div[2]/div[2]/div[1]")
    public WebElement parcelConfirmationNumber;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickCreatePermit() throws InterruptedException {
        Thread.sleep(5000);
        createPermitButton.click();
    }

}
