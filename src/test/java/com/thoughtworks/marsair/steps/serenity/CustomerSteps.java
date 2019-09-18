package com.thoughtworks.marsair.steps.serenity;

import com.thoughtworks.marsair.pages.SearchPage;
import net.thucydides.core.annotations.Step;

public class CustomerSteps {

    SearchPage searchPage;

    @Step
    public void is_on_the_home_page() {
        searchPage.open();
    }

    public void selects_departing(String date) {
        searchPage.departing.selectByVisibleText(date);
    }

    public void selects_returning(String date) {
        searchPage.returning.selectByVisibleText(date);
    }

    public void clicks_search() {
        searchPage.search.click();
    }

    public void sees_message(String message) {
        searchPage.content.shouldContainText(message);
    }
}