package com.basicgov.pages.permitapplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicantInformationPage {

    private WebDriver driver = null;

    @FindBy(xpath = "//div[@class='slds-media__body']//*[text()='Applicant Information']")
    public WebElement applicantInformationText;

    @FindBy(xpath = "//input[@name='LastName']")
    public WebElement lastNameInputField;

    @FindBy(xpath = "//input[@name='Name']")
    public WebElement accountNameInputField;

    @FindBy(xpath = "//button[text()='Next']")
    public WebElement nextButton;

    public ApplicantInformationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterApplicantInformationDetails() throws InterruptedException {
        Thread.sleep(5000);
        lastNameInputField.clear();
        lastNameInputField.sendKeys("Test");
        accountNameInputField.clear();;
        accountNameInputField.sendKeys("PrakashInterviewTest");
        nextButton.click();
    }

}
