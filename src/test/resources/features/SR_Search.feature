Feature: User should be able to search and apply

  @sh
  Scenario: User should be able to search
    Given user is on home page
    When user should go to search module
    And user should enter job title
    And user should enter city
    And user should select posted date
    Then user should see relate jobs
