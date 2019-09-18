package com.thoughtworks.marsair.steps;

import com.thoughtworks.marsair.steps.serenity.CustomerSteps;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class DefinitionSteps {

    @Steps
    CustomerSteps customer;

    @Given("^I am on the MarsAir homepage$")
    public void iAmOnTheMarsAirHomepage() {
        customer.is_on_the_home_page();
    }
}
