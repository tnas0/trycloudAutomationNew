package com.trycloud.step_definitions;

import com.trycloud.pages.HomePage;


import com.trycloud.pages.UpdateSettingsPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import javax.swing.text.html.HTML;
import java.awt.*;

public class US10_UpdateSettings_StepDefinitions {
    HomePage homePage =new HomePage();
    UpdateSettingsPage updateSettingsPage=new UpdateSettingsPage();
    double CurrentStorage;
    @Given("user will be on the dashboard page")
    public void userWillBeOnTheDashboardPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        homePage.login();
    }


    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        updateSettingsPage.files.click();
    }
    @When("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner() {
        updateSettingsPage.settings.click();
    }
    @Then("the user should be able to click any buttons")
    public void the_user_should_be_able_to_click_any_buttons() {


        updateSettingsPage.checkbox1.click();
        BrowserUtils.sleep(2);
        updateSettingsPage.checkbox1.click();
        BrowserUtils.sleep(2);
        updateSettingsPage.checkbox2.click();
        BrowserUtils.sleep(2);
        updateSettingsPage.checkbox2.click();
        BrowserUtils.sleep(2);
        updateSettingsPage.checkbox3.click();
        BrowserUtils.sleep(2);
        updateSettingsPage.checkbox3.click();

    }
    @When("user checks the current storage usage")
    public void user_checks_the_current_storage_usage() {
        String storage= updateSettingsPage.currentStorage.getText().
              substring(0,updateSettingsPage.currentStorage.getText().indexOf(" "));
      CurrentStorage=Double.parseDouble(storage);
        System.out.println(CurrentStorage);}


    @When("user uploads file with the upload file option")
    public void user_uploads_file_with_the_upload_file_option() {
        BrowserUtils.waitForClickablility(updateSettingsPage.addIcon, 5).click();
        String path = "C:\\Users\\tuban\\OneDrive\\Pictures\\Tuba's file.png";
        updateSettingsPage.UploadFileClick.sendKeys(path);
        BrowserUtils.sleep(5);
    }
    @When("user refresh the page")
    public void user_refresh_the_page() {
     Driver.getDriver().navigate().refresh();
     BrowserUtils.sleep(5);}
    @Then("the user should be able to see storage usage is increase")
    public void the_user_should_be_able_to_see_storage_usage_is_increase() {
        updateSettingsPage.currentStorage.getText();
        String storage2=updateSettingsPage.currentStorage.getText().
                substring(0,updateSettingsPage.currentStorage.getText().indexOf(" "));
        double newStorage=Double.parseDouble(storage2);
        Assert.assertTrue((newStorage-CurrentStorage)>0);}



}
