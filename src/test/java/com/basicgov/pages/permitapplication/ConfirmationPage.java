package com.basicgov.pages.permitapplication;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage {

    private WebDriver driver = null;
    public static String confirmationMessage;

    @FindBy(xpath = "//div[@class='slds-media__body']//*[text()='Confirmation']")
    public WebElement confirmationTitleTextField;

    @FindBy(xpath = "//button[text()='Submit Permit Application']")
    public WebElement submitPermitButton;

    @FindBy(xpath = "//input[@class='checkbox']")
    public WebElement acknowledgementCheckbox;

    @FindBy(xpath = "//button[text()='I Agree']")
    public WebElement agreeButton;

    @FindBy(xpath = "//div[@class='uiBlock']")
    public WebElement confirmationMessageTextField;

    @FindBy(xpath = "//button[text()='Back To Home']")
    public WebElement backToHomeButton;

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void validateConfirmationDetails() throws InterruptedException {
        Thread.sleep(5000);
        submitPermitButton.click();
        Thread.sleep(7000);
        acknowledgementCheckbox.click();
        agreeButton.click();
        Thread.sleep(5000);
        confirmationMessage = confirmationMessageTextField.getText();
        Assert.assertTrue(confirmationMessage.startsWith("Your Permit Application has been submitted and is now being processed."));
        backToHomeButton.click();
        Thread.sleep(5000);
    }

}
