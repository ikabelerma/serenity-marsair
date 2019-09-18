package com.thoughtworks.marsair.steps.serenity;

import com.thoughtworks.marsair.pages.SearchPage;
import net.thucydides.core.annotations.Step;

public class CustomerSteps {

    SearchPage searchPage;

    @Step
    public void is_on_the_home_page() {
        searchPage.open();
    }
}