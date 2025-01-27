@F1Results2023
Feature: F1 Results

  Background:
    Given I am on the BBC Sport homepage

  Scenario: Reporting the results of the Las Vegas Grand Prix in the year two thousand and twenty-three as a BBC editor
    Given I am on the Formula One section of the website
    And I click on the Results link
    And I select the Two Thousand and Twenty-Three tab
    When I select the Las Vegas Grand Prix from the dropdown menu
    Then I must see the displayed results for the Las Vegas Grand Prix in the year two thousand and twenty-three

  Scenario: Searching for Sport in the year two thousand and twenty-three and getting at least four relevant results
    Given I enter Sport in the year two thousand and twenty-three in the search bar
    And I click the search button
    Then the search results page must be displayed
    And there must be at least four relevant results related to Sport in the year two thousand and twenty-three


