package com.sample.pages;

import com.sample.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiceSearchPage {

    public DiceSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[contains(@class, 'placeholder')]")
    public WebElement SearchBox;

    @FindBy(id = "submitSearch-button")
    public WebElement buttonSubmitSearch;
    

}