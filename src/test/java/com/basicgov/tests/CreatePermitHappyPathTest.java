package com.basicgov.tests;

import com.basicgov.pages.permitapplication.*;
import com.basicgov.pages.utils.DriverFactory;
import com.basicgov.pages.HomePage;
import com.basicgov.pages.LoginPage;
import com.basicgov.pages.PermitApplicationPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class CreatePermitHappyPathTest {

    private WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    PermitApplicationPage permitApplicationPage;
    ApplicantInformationPage applicantInformationPage;
    InformationPage informationPage;
    ParcelPage parcelPage;
    WorkDescriptionPage workDescriptionPage;
    ConfirmationPage confirmationPage;

    @Before
    public void setUp(){
        driver = DriverFactory.getBrowser();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        permitApplicationPage = new PermitApplicationPage(driver);
        applicantInformationPage = new ApplicantInformationPage(driver);
        informationPage = new InformationPage(driver);
        parcelPage = new ParcelPage(driver);
        workDescriptionPage = new WorkDescriptionPage(driver);
        confirmationPage = new ConfirmationPage(driver);
    }

    @Test
    public void createPermitSuccessfully() throws InterruptedException {
        loginPage.openUrl();
        loginPage.enterValidBusinessAccountCredentials("prakashnehru66@gmail.com", "@Test123456");
        homePage.clickCreatePermit();
        permitApplicationPage.selectPermit("Electrical");
        applicantInformationPage.enterApplicantInformationDetails();
        informationPage.enterInformationDetails();
        parcelPage.enterParcelDetails();
        workDescriptionPage.enterWorkDescriptionDetails();
        confirmationPage.validateConfirmationDetails();
        Assert.assertEquals(homePage.newlyCreatedParcelAddress.getText(), "810 UNION STREET");
        Assert.assertTrue(confirmationPage.confirmationMessage.contains(homePage.parcelConfirmationNumber.getText()));
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
