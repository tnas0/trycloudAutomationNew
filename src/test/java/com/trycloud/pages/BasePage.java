package com.trycloud.pages;


import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "user")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(id = "submit-form")
    public WebElement loginButton;




    public void login(){
        usernameBox.sendKeys(ConfigurationReader.getProperty("username"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }

    public void login(String username,String password){

        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);

    }

}





