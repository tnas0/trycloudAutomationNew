package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidLoginPage {
    public InvalidLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "user")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement warningMessage;
}
