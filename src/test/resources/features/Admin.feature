@Admin
Feature: Administrate registered employees

  Background: 
    Given john is on the OrangeHRM login page
    When attempts to Login with valid Admin and admin123
    Then will see the PIM page

  @Test @AdminAddNationality
  Scenario: The admin wants to add a new nationality to the list
  When clicks on the Admin option in the sidebar
  And clicks on the nationality option
  And clicks on the Add button in the nationality page
  And types in the Asgardian in the textbox
  And clicks in the save button
  Then visualizes the succesful message
  

  
  @Test @EditBrandingPrimaryColor
  Scenario: Change the corporate branding by changing characteristics in the branding page
  When clicks on the Admin option in the sidebar
  And clicks on the corporate branding option
  And changes the primary color to the desired color
  And clicks on the search publish button
  Then will see that the page will update and the primary color will be the selected one
  
  @Test @AddNewJobTitle
  Scenario Outline: Change the corporate branding by changing characteristics in the branding page
  When clicks on the Admin option in the sidebar
  And clicks on the Job dropdown
  And clicks on Job Titles
  And clicks on the add button in the job title page
  And enters a job title <job title>
  And clicks in the job title save button
  Then will see the created job on the list
  
  Examples:
  | job title    |
  | Abstract Job |
  | Architect    |
  
  @Test @AlreadyExistsTitleJob
  Scenario Outline: The user tries to add an existing job
    When clicks on the Admin option in the sidebar
    And  clicks on the Job dropdown
    And  clicks on Job Titles
    And  clicks on the add button in the job title page
    And  enters a existing <job title>
    And  clicks in the job title save button
    Then will see the Already exists error message

    Examples: 
      | job title               |
      | Chief Executive Officer |
      
  @Test @DeleteTitleJob
  Scenario: The user tries to add an existing job
    When clicks on the Admin option in the sidebar
    And  clicks on the Job dropdown
    And  clicks on Job Titles
    And  clicks on the delete button of any JobTitle
    And  clicks on the delete confirmation button
    Then visualizes the succesful message
    
  @Test @AddNewPayGrade
  Scenario: The user tries to add an existing job
    When clicks on the Admin option in the sidebar
    And  clicks on the Job dropdown
    And  clicks on Pay Grades
    And  clicks on the add button in the pay grades page
    And  enters a pay grade Grade 13
    And  clicks in the pay grade save button
    Then will see the new added pay grade on the list

 
  @Test @AlreadyExistsPayGrade
  Scenario: The user tries to add an existing job
    When clicks on the Admin option in the sidebar
    And  clicks on the Job dropdown
    And  clicks on Pay Grades
    And  clicks on the add button in the pay grades page
    And  enters a pay grade Grade 13
    And  clicks in the pay grade save button
    Then will see the Already exists error message

  @Test @DeletePayGrade
  Scenario: The user tries to add an existing pay grades
    When clicks on the Admin option in the sidebar
    And  clicks on the Job dropdown
    And  clicks on Pay Grades
    And  clicks on the delete button of any Pay Grade
    And  clicks on the delete confirmation button
    Then visualizes the succesful message


