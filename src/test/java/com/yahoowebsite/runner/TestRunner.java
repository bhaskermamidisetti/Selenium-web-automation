package com.yahoowebsite.runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        glue = {"com.yahoowebsite"},
        features = {"src/test/resources/features"},
        tags = {"@Yahoo"},
        format = {"pretty", "html:target/report"}
)
public class TestRunner {
}