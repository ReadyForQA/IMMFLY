@BAU-123
Feature: Sort by
#  @Sortby @FirstTime
#  Scenario: Validate the sort by function
#    Given I am in the product list
#    When I enter for the first time
#    Then the page is sorted by position Ascending
  @Sortby @dropdown
  Scenario: Validate the sort by function
    Given I am in the product list
    When I click with my mouse
    Then The “sort by” dropdown appear
    And Have Four options "Position", "product name", "price" and "new arrivals".
#  @Sortby @ArrowUp
#  Scenario: Validate the sort by function
#    Given I am in the product list
#    When I click on the arrow up
#    Then The list is sorted in descending order
#    And Have 4 options "Position", "product name", "price" and "new arrivals".

