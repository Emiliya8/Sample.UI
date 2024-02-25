package com.sample.step_definitions;

import com.sample.pages.Main;
import com.sample.pages.Sh_searchPage;
import com.sample.utilities.BrowserUtils;
import com.sample.utilities.ConfigurationReader;
import com.sample.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sh_Search {

    Sh_searchPage shSearch = new Sh_searchPage();
    Main main = new Main();


    @Given("user is on home page")
    public void user_is_on_home_page() {
    }

    @When("user should go to search module")
    public void user_should_go_to_search_module() {
        BrowserUtils.waitFor(3);
        main.jobSearch.click();
    }
    @When("user should enter job title")
    public void user_should_enter_job_title() {
        BrowserUtils.waitFor(3);
        shSearch.jobSearchBox.sendKeys(ConfigurationReader.getProperty("searchJobTitle"));
    }
    @When("user should enter city")
    public void user_should_enter_city() {
        BrowserUtils.waitFor(3);
        shSearch.locationBox.sendKeys(ConfigurationReader.getProperty("location"));
    }
    @When("user should select posted date")
    public void user_should_select_posted_date() {
        BrowserUtils.waitFor(3);
        shSearch.postedDayToday.click();
    }
    @Then("user should see relate jobs")
    public void user_should_see_relate_jobs() {
        BrowserUtils.waitFor(3);
        shSearch.searchJobTitle(ConfigurationReader.getProperty("searchJobTitle"));
    }
}