Feature: User should be abe to login to Dice


@wip
  Scenario: Login as Emiliya
    Given user goes to main page
    When user goes to login page
    And user enters Emiliya username
    And user enters Emiliya password
    And user should sign in
    Then user should see the dashboard
