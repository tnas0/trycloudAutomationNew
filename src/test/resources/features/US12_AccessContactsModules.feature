Feature:As a user, I should be able to access to Contacts module.

  Scenario: verify user access to Talks module
    Given user on the dashboard page
    When user clicks the "Talk" module
    Then verify the page title is "Contacts = TryCloud QA"