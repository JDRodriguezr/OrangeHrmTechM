@Login
Feature: Tests on the Login Module
  As an Admin of OrangeHRM
  I want to login into the website
  To manage registered users on the platform

  Background: 
    Given john is on the OrangeHRM login page

  @Test @SuccessfulLogin
  Scenario Outline: Succesful Login into the admin website
    When attempts to Login with valid <username> and <password>
    Then will see the PIM page

    Examples: 
      | username | password |
      | Admin    | admin123 |
