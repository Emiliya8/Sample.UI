package com.sample.step_definitions;

import com.sample.pages.Sh_searchPage;
import com.sample.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sh_Search {

    Sh_searchPage shSearch = new Sh_searchPage();

    @Given("user is on home page")
    public void user_is_on_home_page() {

    }

    @When("user should go to search module")
    public void user_should_go_to_search_module() {

    }
    @When("user should enter job title")
    public void user_should_enter_job_title() {
        shSearch.jobSearchBox.sendKeys(ConfigurationReader.getProperty("searchJobTitle"));
    }
    @When("user should enter city")
    public void user_should_enter_city() {
        shSearch.locationBox.sendKeys(ConfigurationReader.getProperty("location"));
    }
    @When("user should select posted date")
    public void user_should_select_posted_date() {
        shSearch.postedDayToday.click();
    }
    @Then("user should see relate jobs")
    public void user_should_see_relate_jobs() {
        shSearch.searchJobTitle(ConfigurationReader.getProperty("searchJobTitle"));
    }
}
