@Admin
Feature: Administrate registered employees

  Background: 
    Given john is on the OrangeHRM login page
    When attempts to Login with valid Admin and admin123
    Then will see the PIM page

  @Test @AdminAddNationality
  Scenario Outline: The admin wants to add a new nationality to the list
  	When clicks on the Admin option in the sidebar
    And clicks on the nationality option
    And clicks on the Add button in the nationality page
    And types in the <nationality> in the textbox
    And clicks in the save button
    Then visualizes the succesful message

    Examples: 
      | nationality |
      | Colombbian  |

  #@Test @DirectorySearchByLocation
  #Scenario Outline: The user goes to the Directory page and searches for employees by the location
    #When clicks on the directory option in the sidebar
    #And search for a specific <location>
    #And clicks in the search button
    #Then a list of employees with the specified <location> should be displayed
#
    #Examples: 
      #| location              |
      #| Canadian Regional HQ  |
      #| HQ - CA, USA          |
      #| New York Sales Office |
      #| Texas R&D             |
