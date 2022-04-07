package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.HomePage;
import com.trycloud.pages.ModulesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US03_AccessMainModulesStepDefinitions {

    HomePage homePage = new HomePage();
    ModulesPage modulesPage = new ModulesPage();

    @Given("User on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("the users log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {
       homePage.login();
    }
    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expected) {
        List<String> actual = new ArrayList<>();
        for (WebElement each : modulesPage.mainModules) {
            BrowserUtils.hover(each);
            BrowserUtils.highlight(each);
            actual.add(each.getText());
        }
        Assert.assertEquals(expected, actual);
    }
    }

