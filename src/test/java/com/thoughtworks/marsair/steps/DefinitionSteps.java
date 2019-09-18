package com.thoughtworks.marsair.steps;

import com.thoughtworks.marsair.steps.serenity.CustomerSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DefinitionSteps {

    @Steps
    CustomerSteps customer;

    @Given("^I am on the MarsAir homepage$")
    public void iAmOnTheMarsAirHomepage() {
        customer.is_on_the_home_page();
    }

    @When("^I select departing in (.*)$")
    public void iSelectDepartingIn(String date) {
        customer.selects_departing(date);
    }

    @And("^I select returning in (.*)$")
    public void iSelectReturningIn(String date) {
        customer.selects_returning(date);
    }

    @And("^I choose to Search$")
    public void iChooseToSearch() {
        customer.clicks_search();
    }

    @Then("^I see (.*)$")
    public void iSeeCallNowOnMARSAIRToBook(String message) {
        customer.sees_message(message);
    }
}
