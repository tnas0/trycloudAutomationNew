@us_10
Feature: Update settings feature
 As a user, I should be able to update settings.
  Background:
    Given user on the dashboard page
    When the user clicks the "Files" module
 @us_10_1
Scenario: Verify users update settings
And user clicks Settings on the left bottom corner
Then the user should be able to click any buttons
  @us_10_2
Scenario: Verify users to see the app storage usage
And user checks the current storage usage
And user uploads file with the upload file option
And user refresh the page
Then the user should be able to see storage usage is increase