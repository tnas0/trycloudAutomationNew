package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.ContactsPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US12_AccessContactsModules {

    BasePage basePage = new BasePage();
    ContactsPage contactsPage = new ContactsPage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        basePage.login();
    }
    @When("user clicks the {string} module")
    public void user_clicks_the_module(String string) {
         contactsPage.talkModule.click();
    }
    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {
        String expectedTitle="Contacts = TryCloud QA";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
