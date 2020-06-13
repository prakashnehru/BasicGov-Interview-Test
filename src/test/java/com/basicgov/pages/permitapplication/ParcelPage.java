package com.basicgov.pages.permitapplication;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ParcelPage {

    private WebDriver driver = null;

    @FindBy(xpath = "//div[@class='slds-media__body']//*[text()='Parcel']")
    public WebElement parcelTitleText;

    @FindBy(xpath = "//input[@name='location']")
    public WebElement searchAddressInputField;

    @FindBy(xpath = "//div[@class='slds-truncate']")
    public WebElement selectAddressTextField;

    @FindBy(xpath = "//div[@class='selected-parcel']")
    public WebElement selectedParcelTitleTextField;

    @FindBy(xpath = "//button[text()='Next']")
    public WebElement nextButton;

    public ParcelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterParcelDetails() throws InterruptedException {
        Thread.sleep(5000);
        searchAddressInputField.clear();
        searchAddressInputField.sendKeys("810 Union Street Norfolk" + Keys.RETURN);
        selectAddressTextField.click();
        Thread.sleep(5000);
        nextButton.click();
    }

}
