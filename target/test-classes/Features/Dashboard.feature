@Dashboard
Feature: Tests on the Dashboard Page
  As an Admin of OrangeHRM
  I want to use the dashboard page
  To view employe statistics

  Background: 
    Given john is on the OrangeHRM login page
    When attempts to Login with valid Admin and admin123
    Then will see the PIM page

  @Test @DashboardPageUnderConstruction
  Scenario Outline: The user goes to the dashboard page
    When clicks on the dashboard
    And is redirected to the dashboard page
    Then will validate the <title>

    Examples: 
      | title          |
      | Launching Soon |
