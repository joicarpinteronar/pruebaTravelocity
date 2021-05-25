package com.travelocity.Testing.TestAutomation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resource/features",
        glue= {"com.travelocity.Testing.TestAutomation.stepDefinitions"}
)
public class TravelocityRunner {

}
