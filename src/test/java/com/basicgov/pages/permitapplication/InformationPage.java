package com.basicgov.pages.permitapplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InformationPage {

    private WebDriver driver = null;

    @FindBy(xpath = "//div[@class='slds-media__body']//*[text()='Information']")
    public WebElement informationTitleText;

    @FindBy(xpath = "//button[text()='Next']")
    public WebElement nextButton;

    public InformationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterInformationDetails() throws InterruptedException {
        Thread.sleep(5000);
        nextButton.click();
    }

}