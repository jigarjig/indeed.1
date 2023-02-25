@regression
Feature: user on Indeed Job website
  As user I want to go to home page of website

  @smoke
  Scenario: User should navigate to Indeed home page successfully
    Given I am on homepage
    When I click on Reject all

