package com.sample.pages;

import com.sample.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main {

    public Main(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//div[@class='fe-hero']")
    public WebElement mainPage;

    @FindBy(xpath = "//dhi-seds-nav-header")
    public WebElement loginPage;

    @FindBy(xpath = "//dhi-seds-nav-header")
    public WebElement jobSearch;
    
    
    
    
}
