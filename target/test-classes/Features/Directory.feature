@Login
Feature: Finding specific employees with detailed information about them

  Background: 
    Given john is on the OrangeHRM login page
    When attempts to Login with valid Admin and admin123
    Then will see the PIM page

  @Test @DirectorySearchByJobTitle
  Scenario Outline: The user goes to the Directory page and searches for employees
    by the job title

    When clicks on the directory option in the sidebar
    And searches for a specific <Job Title>
    And clicks in the search button
    Then a list of employees with the specified job title should be displayed

    Examples: 
      | Job Title               |
      | Account Assistant       |
      | Chief Executive Officer |
      | Chief Financial Officer |

  @Test @DirectorySearchByLocation
  Scenario Outline: The user goes to the Directory page and searches for employees by the location
    When clicks on the directory option in the sidebar
    And search for a specific <location>
    And clicks in the search button
    Then a list of employees with the specified <location> should be displayed

    Examples: 
      | location              |
      | Canadian Regional HQ  |
      | HQ - CA, USA          |
      | New York Sales Office |
      | Texas R&D             |
