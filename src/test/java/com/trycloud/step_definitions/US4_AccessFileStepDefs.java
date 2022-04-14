package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.FilesPage;
import com.trycloud.pages.HomePage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US4_AccessFileStepDefs {
    HomePage homePage =new HomePage();
    FilesPage filesPage =new FilesPage();
//-----Scenario 1
    @Given("user on the dashboard page us4")
    public void user_on_the_dashboard_page_us4() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        homePage.login();

    }


    @When("user clicks {string} module us4")
    public void user_clicks_module_us4(String Files) {
        new DashboardPage().clickModule(Files);
    }


    @When("user click the top left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {
        filesPage.TopLeftCheckBox.click();
    }


    @Then("verify all the files are selected")
    public void verify_all_the_files_are_selected() {
        Assert.assertTrue(filesPage.TopLeftCheckBox.isSelected());

    }








}
