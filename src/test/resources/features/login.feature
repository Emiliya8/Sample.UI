Feature: User should be abe to login to Dice



  Scenario: Login as Emiliya
    Given user goes to login page
    When user enters Emiliya username
    When user enters Emiliya password
    Then user should see the dashboard
