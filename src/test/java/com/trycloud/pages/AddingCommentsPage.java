package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class AddingCommentsPage {
    public AddingCommentsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//li[@data-id='files'])[1]")
    public WebElement FilesModule;
    @FindBy(xpath = "//a[@class='action action-menu permanent']")
    public WebElement ActionBtn;
    @FindBy(xpath = "//a[@class='menuitem action action-details permanent']")
    public WebElement DetailsDropDown;
    @FindBy(xpath = "//a[@id='commentsTabView']")
    public WebElement CommentBtn;
    @FindBy(xpath = "(//div[@class='message'])[1]")
    public WebElement CommentBox;
    @FindBy(xpath = "//div[.='Hello!']")
    public WebElement ActualMessage;
}







