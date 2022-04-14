package com.trycloud.step_definitions;

import com.trycloud.pages.InvalidLoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US2_MT_StepDefinition {
    InvalidLoginPage invalidLoginPage=new InvalidLoginPage();
    @Given("user should on the login page")
    public void user_should_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String username, String password) {
        invalidLoginPage.UserNameBtn.sendKeys(username);
        invalidLoginPage.PasswordBtn.sendKeys(password);
    }
    @When("user click the login button")
    public void user_click_the_login_button() {
        invalidLoginPage.LoginBtn.click();
    }
    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String errormessage) {
        Assert.assertEquals(errormessage,invalidLoginPage.ErrorMessage.getText());
    }
}
