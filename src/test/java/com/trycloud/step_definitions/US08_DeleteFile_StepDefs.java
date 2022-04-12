package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import com.trycloud.pages.HomePage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US08_DeleteFile_StepDefs extends HomePage {
    HomePage homePage = new HomePage();
    FilesPage filesPage = new FilesPage();
    String deletedItemText;

    @Given("User On the Dashboard Page")
    public void User_On_the_Dashboard_Page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        homePage.login();
    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String moduleName) {
        filesPage.clickModule(moduleName);
    }

    @When("user click action-icon  from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        filesPage.actionBtn.click();
        deletedItemText = filesPage.deletedItem.getText();
    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String actionName) {
        filesPage.clickAction(actionName);
    }

    @When("the user clicks the {string} sub-module on the left side")
    public void the_user_clicks_the_sub_module_on_the_left_side(String moduleName) {
        for (WebElement each : filesPage.leftSideModules) {
            if (each.getText().equalsIgnoreCase(moduleName)) {
                each.click();
                break;
            }
        }
    }

    @Then("Verify the deleted file is displayed on the page.")
    public void verify_the_deleted_file_is_displayed_on_the_page() {
        String fileBeforeDelete = deletedItemText;
        BrowserUtils.sleep(3);
        String sameFileShownInDeletedFiles = filesPage.deletedFileList.get(filesPage.deletedFileList.size() - 1).getText();
        Assert.assertEquals(fileBeforeDelete, sameFileShownInDeletedFiles);
    }
}
