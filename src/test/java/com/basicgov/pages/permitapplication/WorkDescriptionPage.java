package com.basicgov.pages.permitapplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkDescriptionPage {

    private WebDriver driver = null;

    @FindBy(xpath = "//div[@class='slds-media__body']//*[text()='Work Description']")
    public WebElement workDescriptionTitleTextField;

    @FindBy(xpath = "//input[@name='Building_Number__c']")
    public WebElement buildingNumberInputField;

    @FindBy(xpath = "//input[@name='Unit_Number__c']")
    public WebElement unitNumberInputField;

    @FindBy(xpath = "//button[text()='Next']")
    public WebElement nextButton;

    public WorkDescriptionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterWorkDescriptionDetails() throws InterruptedException {
        Thread.sleep(5000);
        buildingNumberInputField.clear();
        buildingNumberInputField.sendKeys("1234567890");
        unitNumberInputField.clear();
        unitNumberInputField.sendKeys("1234567890");
        nextButton.click();
    }

}
