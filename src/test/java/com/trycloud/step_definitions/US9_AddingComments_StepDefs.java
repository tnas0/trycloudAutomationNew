package com.trycloud.step_definitions;

import com.trycloud.pages.AddingCommentsPage;
import com.trycloud.pages.HomePage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US9_AddingComments_StepDefs {
    HomePage homePage = new HomePage();
    AddingCommentsPage addingCommentsPage = new AddingCommentsPage();

    @Given("user is on the Dashboard page")
    public void user_is_on_the_Dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        homePage.login();
    }
    @When("user click the {string} Module")
    public void user_click_the_Module(String string) {
        addingCommentsPage.FilesModule.click();
    }
    @When("user clicks action icon from any file on the page")
    public void user_clicks_action_icon_from_any_file_on_the_page() {
        addingCommentsPage.ActionBtn.click();
    }
    @When("user chooses the {string} option")
    public void user_chooses_the_option(String string) {
        addingCommentsPage.DetailsDropDown.click();
    }
    @When("user clicks comments tab")
    public void user_clicks_comments_tab() {
        addingCommentsPage.CommentBtn.click();
    }
    @When("user writes {string} as comment inside the input box")
    public void user_writes_as_comment_inside_the_input_box(String string) {
        addingCommentsPage.CommentBox.sendKeys("Hello!");
    }
    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
        addingCommentsPage.ActualMessage.click();
    }
    @Then("verify the comment is displayed in the comment section")
    public void verify_the_comment_is_displayed_in_the_comment_section() {
        String expectedMessage= "Hello!";
        Assert.assertEquals(expectedMessage,addingCommentsPage.ActualMessage.getText());
    }
}
