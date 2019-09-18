package com.thoughtworks.marsair.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://marsair.thoughtworks-labs.net/helpingrecruiting")
public class SearchPage extends PageObject {

    @FindBy(id = "departing")
    public WebElementFacade departing;

    @FindBy(id = "returning")
    public WebElementFacade returning;

    @FindBy(css = "input[value='Search']")
    public WebElementFacade search;

    @FindBy(id = "content")
    public WebElementFacade content;
}