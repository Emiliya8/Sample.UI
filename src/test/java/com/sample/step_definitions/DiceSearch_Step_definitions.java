package com.sample.step_definitions;

import com.sample.pages.DiceSearchPage;
import com.sample.utilities.BrowserUtils;
import com.sample.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiceSearch_Step_definitions {


  DiceSearchPage diceSearchPage = new DiceSearchPage();

    @Given("user is on the Dice homepage")
    public void user_is_on_the_dice_homepage() {

        Driver.getDriver().get("https://www.dice.com/home/home-feed");

    }
  
    @When("user types SDET in the search box")
    public void user_types_sdet_in_the_search_box() {

diceSearchPage.SearchBox.sendKeys("SDET");


    }
    @When("user click to SDET search button")
    public void user_click_to_sdet_search_button() {


diceSearchPage.buttonSubmitSearch.click();


    }

}
