package com.sample.pages;

import com.sample.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sh_searchPage {



    public Sh_searchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    
    @FindBy(id = "typeaheadInput")
    public WebElement jobSearchBox;

    @FindBy(id = "google-location-search")
    public WebElement locationBox;

    @FindBy(id = "submitSearch-button")
    public WebElement searchButton;

    @FindBy(xpath = "//*[text() = ' Today ']")
    public WebElement postedDayToday;

    public WebElement searchJobTitle(String jobTitle){

        String xpath = "//a[text()='" + jobTitle + "']";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }
}
