package com.sample.pages;

import com.sample.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
  
    
    public Login(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "email")
    public WebElement inputUserEmail;

    @FindBy(id = "password")
    public WebElement inputUserPassword;

    @FindBy(xpath = "//*[text() = 'Sign In ']")
    public WebElement buttonSign;
    
    

}
