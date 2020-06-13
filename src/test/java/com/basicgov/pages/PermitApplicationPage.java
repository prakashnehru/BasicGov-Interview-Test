package com.basicgov.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PermitApplicationPage {
    private WebDriver driver = null;

    @FindBy(xpath = "//*[text()='Permit Application']")
    public WebElement permitApplicationTitleText;

    @FindBy(xpath = "//*[text()='Electrical']")
    public WebElement electricalTextLink;

    @FindBy(xpath = "//*[text()='Mechanical']")
    public WebElement mechanicalTextLink;

    @FindBy(xpath = "//*[text()='Plumbing']")
    public WebElement plumbingTextLink;

    @FindBy(xpath = "//*[@class='slds-is-relative bgccLargeIconButton']//*[@class='active-icon slds-icon_container_circle slds-icon-action-approval slds-icon_container']")
    public WebElement tickMarkEnabled;

    @FindBy(xpath = "//*[text()='Next']")
    public WebElement nextButton;

    public PermitApplicationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectPermit(String permit) throws InterruptedException {
        Thread.sleep(5000);
        if(permit.contains("Electrical")) {
            electricalTextLink.click();
        }else if(permit.contains("Mechanical")) {
            mechanicalTextLink.click();
        }else if(permit.contains("Plumbing")) {
            plumbingTextLink.click();
        }
        Thread.sleep(5000);
        nextButton.click();
    }

}
