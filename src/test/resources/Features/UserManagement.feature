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
      | name   | middle name | last name |
      | Jorge  | Alejandro   | Cruz      |
      | Ramiro | Jesus       | Gutierrez |
      
 # @SearchAndFindReport
 # Scenario Outline: Find a report using the search bar on the report page from the Pim page
 #   When the user clicks on the Report option
 #   And Searches for a <report> 
 #   And clicks on the search button
 #   Then the actions will be displayed 3

 #   Examples: 
 #     | name   | middle name | last name |
 #     | Jorge  | Alejandro   | Cruz      |
 #     | Ramiro | Jesus       | Gutierrez |