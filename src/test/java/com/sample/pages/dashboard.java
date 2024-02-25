package com.sample.pages;

import com.sample.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboard {


    
    public  dashboard(){
        PageFactory.initElements(Driver.getDriver(), this);
        
        
    }

    @FindBy(xpath = "//div[@data-ng-if='!freezeLoader']")
    public WebElement profile;
    
    
}
