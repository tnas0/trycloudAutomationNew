package com.trycloud.step_definitions;

import com.trycloud.pages.HomePage;
import com.trycloud.pages.InvalidPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US2_MT_StepDefinition {
    HomePage homePage = new HomePage();

    InvalidPage invalidPage=new InvalidPage();

    @Given("user should on the login page")
    public void user_should_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String string, String string2) {
        homePage.usernameBox.sendKeys(string);
        homePage.passwordBox.sendKeys(string2);

    }

    @When("user will click the login button")
    public void user_will_click_the_login_button() {
        homePage.loginButton.click();
    }

    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String string) {
        invalidPage.message.isDisplayed();
        Driver.closeDriver();
    }
}
