package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesPage {
    public FilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement TopLeftCheckBox;

    @FindBy(xpath = "//a[@data-action='menu']//span/..")
    public WebElement actionBtn;

    @FindBy(xpath = "//div[@id='rightClickMenu']//li")
    public List<WebElement> actionOption;

    @FindBy(xpath = "//div[@id='app-navigation']//a")
    public List<WebElement> leftSideModules;

    public void clickAction(String actionName) {
        String locator = "//div[@class='fileActionsMenu popovermenu bubble open menu']//span[contains(., '" + actionName + "')]";
        Driver.getDriver().findElement(By.xpath(locator)).click();
    }

    @FindBy(xpath = "//tr//span[@class='innernametext']/..")
    public List<WebElement> getLeftSideModules;

    @FindBy(xpath = "//tr[1]//span[@class='innernametext']")
    public WebElement deletedItem;

    @FindBy(xpath = "//a[@class='name']//span[@class='innernametext']")
    public List<WebElement> deletedFileList;

    public void clickModule(String moduleName) {
        String locator = "//ul[@id='appmenu']//span[normalize-space(.)='" + moduleName + "']/..";
        Driver.getDriver().findElement(By.xpath(locator)).click();

    }
}
