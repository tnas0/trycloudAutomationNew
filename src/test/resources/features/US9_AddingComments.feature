Feature: As a user, I should be able to write comments to files/folders
  @US_9
  Scenario: Verify users to write comment to files/folders
    Given user is on the Dashboard page
    When  user click the "Files" Module
    And user clicks action icon from any file on the page
    And user chooses the "Details" option
    And user clicks comments tab
    And user writes "Testing comment functionality" as comment inside the input box
    And user click the submit button to post it
    Then verify the comment is displayed in the comment section

