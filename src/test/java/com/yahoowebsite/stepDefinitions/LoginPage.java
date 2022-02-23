package com.yahoowebsite.stepDefinitions;

import com.yahoowebsite.base.AbstractSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.yahoowebsite.pageclass.LoginPageObjects.*;
import static com.yahoowebsite.pageclass.ProductPageObjects.logedInUserprofile;


public class LoginPage extends AbstractSteps {

    @And("^Launch automation practice in web$")
    public void launchAutomationPractice() throws Exception {
        getDriver();
    }

    @And("^The user Signin with credentials$")
    public void userSignIn() throws Exception {
        driver.findElement(By.xpath(consentWindow)).click();
        driver.findElement(By.xpath(SignInlink)).click();
        Thread.sleep(2000);
    }

    @Then("^Enter email and password$")
    public void enterEmailAndPassword() throws InterruptedException {
        driver.findElement(By.id(email)).sendKeys("test_api_1234@yahoo.com");
        driver.findElement(By.id(nextButton)).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(password)));
        driver.findElement(By.xpath(password)).sendKeys("Flower@1234");
        Thread.sleep(3000);
        driver.findElement(By.id(signinButton)).click();
        Thread.sleep(3000);
    }

    @Given("^Launch the Yahoo web site$")
    public void launchTheYahooWebSite() throws InterruptedException {
            getDriver();
        Thread.sleep(4000);

    }

    @And("^Verify user has successfully login with the provided email$")
    public void verifyUserHasSucessfullyLoged() throws InterruptedException {
        driver.findElement(By.xpath(logedInUserprofile)).click();
        driver.findElement(By.xpath(logedInUserprofile)).click();
        Thread.sleep(4000);
    }

    @And("^Log out from the account$")
    public void logOutFromTheAccount() {
       driver.findElement(By.xpath(signout)).click();


    }
}