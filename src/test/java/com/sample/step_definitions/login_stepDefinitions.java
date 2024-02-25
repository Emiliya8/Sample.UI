package com.sample.step_definitions;

import com.sample.pages.Login;
import com.sample.pages.Main;
import com.sample.pages.dashboard;
import com.sample.utilities.BrowserUtils;
import com.sample.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_stepDefinitions {

    Login login = new Login();
    Main main = new Main();

    dashboard dashboard = new dashboard();

    @Given("user goes to main page")
    public void userGoesToMainPage() {
       // BrowserUtils.waitFor(2);
       // main.mainPageHeader.isDisplayed();
    }


    @When("user goes to login page")
    public void userGoesToLoginPage() {
        BrowserUtils.waitFor(2);

        main.loginPage.click();
    }
    @And("user enters Emiliya username")
    public void user_enters_emiliya_username() {

        BrowserUtils.waitFor(2);

        login.inputUserEmail.sendKeys(ConfigurationReader.getProperty("EmiliyaUsername"));

    }
    @And("user enters Emiliya password")
    public void user_enters_emiliya_password() {
        BrowserUtils.waitFor(2);

        login.inputUserPassword.sendKeys(ConfigurationReader.getProperty("EmiliyaPassword"));
    }

    @And("user should sign in")
    public void userShouldSignIn() {
        BrowserUtils.waitFor(2);

        login.buttonSign.click();
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {

        BrowserUtils.waitFor(2);

        dashboard.profile.isDisplayed();

    }



}
