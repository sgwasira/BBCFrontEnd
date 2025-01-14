@F1Results2023
Feature:  F1 Results 2023

  Scenario: As a BBC editor, I want to accurately report the results of the 2023 Las Vegas Grand Prix
    Given I am use on the homepage of BBC Sport
    And I on the Formula One link on the nav
    And I click on the results link
    And I click on the 2023 tab
    When I select theLas Vegas Grand Prix drop dropdown
    Then I must see the displayed results of that Grand Prix

