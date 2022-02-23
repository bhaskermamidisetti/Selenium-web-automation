package com.yahoowebsite.stepDefinitions;

import com.yahoowebsite.base.AbstractSteps;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;


import static com.yahoowebsite.pageclass.ProductPageObjects.*;

public class ProductPage extends AbstractSteps {

    @And("^Click on the Finance tab$")
    public void clickOnTheFinanceTab() {
        driver.findElement(By.xpath(financetab)).click();
    }

    @And("^then click on the MarketData tab$")
    public void thenClickOnTheMarketDataTab() {

        driver.findElement(By.xpath(marketDataTab)).click();
    }

    @And("^then Capture the calender event option$")
    public void thenCaptureTheCalenderEventValues() {
        driver.findElement(By.cssSelector(calenderOption)).click();
        driver.findElement(By.xpath(calenderOption)).click();
    }

    @And("^Verify the values for the date captured$")
    public void verifyTheValuesForTheDateCaptured() {
        driver.findElement(By.xpath(selectedDate)).isDisplayed();
        driver.findElement(By.xpath(values)).isDisplayed();
    }
}