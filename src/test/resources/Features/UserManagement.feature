@PIM
Feature: Title of your feature
  I want to use this template for my feature file

#Should this be controlled with hooks? Before and After tags? when to use one or the other
  Background: 
    Given john is on the OrangeHRM login page
    When attempts to Login with valid Admin and admin123 
    Then will see the PIM page
#Should this be controlled with hooks? Before and After tags? when to use one or the other

  @AddNewEmployee
  Scenario Outline: Adding a new employee
    When the user clicks on the Add Employee option
    And fills the <name>, <middle name> and <last name> spaces
    And clicks on Save
    Then is navigated to the personal details page

    Examples: 
      | name   | middle name | last name | username | password |
      | Jorge  | Alejandro   | Cruz      | Admin    | admin123 |
      | Ramiro | Jesus       | Gutierrez | Admin    | admin123 |
