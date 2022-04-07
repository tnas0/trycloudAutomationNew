package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateSettingsPage {
    public UpdateSettingsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@aria-label='Files']")
    public WebElement files;

    @FindBy(xpath = "//button[@class='settings-button']")
    public WebElement settings;

    @FindBy(xpath = "//input[@class='checkbox']/..")
    public WebElement allCkeckboxes;

    @FindBy(xpath = "//label[@for='showRichWorkspacesToggle']")
    public WebElement checkbox1;
    @FindBy(xpath = "//label[@for='recommendationsEnabledToggle']")
    public WebElement checkbox2;
    @FindBy(xpath = "//label[@for='showhiddenfilesToggle']")
    public WebElement checkbox3;
   // @FindBy(xpath = "//li[@id='quota']//p")
    @FindBy(xpath = "//a[@class='icon-quota svg']//p")
    public WebElement currentStorage;
   // @FindBy(xpath = "(//div//ul)[8]")
    @FindBy(xpath ="//a[@class='button new']")
   // @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement addIcon;
    @FindBy(xpath = "//input[@id='file_upload_start']")
   // @FindBy(xpath = "//span[@class='displayname']")
    public WebElement UploadFileClick;
    @FindBy(xpath = "//span[@class='innernametext']")
    public WebElement UploadFile;
    @FindBy(xpath = "//tr[@data-type='file']")
    public WebElement UploadFilelocation;
}
