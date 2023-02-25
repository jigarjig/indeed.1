package com.indeed.uk.steps;

import com.indeed.uk.pages.MainHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class JobSearchPage {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on Reject all$")
    public void iClickOnRejectAll() {
        new MainHomePage().clickOnReject();
    }
}
