package com.sample.step_definitions;

import com.sample.pages.Login;
import com.sample.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_stepDefinitions {

    Login login = new Login();


    @Given("user goes to login page")
    public void userGoesToLoginPage() {

    }
    @Given("user enters Emiliya username")
    public void user_enters_emiliya_username() {
        login.inputUserEmail.sendKeys(ConfigurationReader.getProperty("EmiliyaUsername"));

    }
    @When("user enters Emiliya password")
    public void user_enters_emiliya_password() {
        login.inputUserPassword.sendKeys(ConfigurationReader.getProperty("EmiliyaPassword"));
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {


    }


}
