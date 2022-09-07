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
  @Test @Logout
  Scenario Outline: Logout from the admin page
  When attempts to Login with valid <username> and <password>
  And will see the PIM page
  And clicks on the profile picture
  And clicks on the logout option
  Then will see the home page
  
  Examples:
  | username | password |
  | Admin    | admin123 |
  @Test @OpensAboutPage
  Scenario Outline: See the about page from the profile
  When attempts to Login with valid <username> and <password>
  And will see the PIM page
  And clicks on the profile picture
  And clicks on the about option
  Then will see the about popup window
  
  Examples:
  | username | password |
  | Admin    | admin123 |
  @Test @OpensSupportPage
  Scenario Outline: See the support page from the profile dropdown
  When attempts to Login with valid <username> and <password>
  And will see the PIM page
  And clicks on the profile picture
  And clicks on the support option
  Then will see the support page from the profile dropdown
  
  Examples:
  | username | password |
  | Admin    | admin123 |
  
  @Test @ChangePassword
  Scenario Outline: See the support page from the profile dropdown
    When attempts to Login with valid <username> and <password>
    And will see the PIM page
    And clicks on the profile picture
    And clicks on the change password option
    And enters <current password>, <new password>
    Then will see the success message

    Examples: 
      | username | password | current password | new password |
      | Admin    | admin123 | admin123         | Admin1234!   | 
  
  @Test @ChangePassword
  Scenario Outline: Change the password
    When attempts to Login with valid <username> and <password>
    And will see the PIM page
    And clicks on the profile picture
    And clicks on the change password option
    And clicks the cancel button 
    Then will be redirected to the previous page

    Examples: 
      | username | password | current password | new password |
      | Admin    | admin123 | admin123         | Admin1234!   |   
      
 @Test @OpensSupportPage
  Scenario Outline: See the support page from the profile dropdown
  When attempts to Login with invalid <username> and <password>
  Then will visualize the invalid credentials error message
  
  Examples:
  | username | password |
  | Admon    | admin125 |  
  
  @Test @LinkHomeRedirection
  Scenario Outline: user wants to go to the home page by clicking the OrangeHRM logo in the sidebar
    When attempts to Login with valid <username> and <password>
    And clicks the OrangeHRM logo on the sidebar
    Then will be redirected to the OrangeHRM home page
    
    Examples:
  | username | password |
  | Admin    | admin123 |
