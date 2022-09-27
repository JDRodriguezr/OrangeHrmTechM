@Login
Feature: Tests on the Login Module
  As an Admin of OrangeHRM
  I want to login into the website
  To manage registered users on the platform

  Background: 
    Given john is on the OrangeHRM login page

  @Test @SuccessfulLogin
  Scenario: Succesful Login into the admin website
  When attempts to Login with valid Admin and admin123
  Then will see the PIM page


  @Test @Logout
  Scenario: Logout from the admin page
  When attempts to Login with valid Admin and admin123
  And will see the PIM page
  And clicks on the profile picture
  And clicks on the logout option
  Then will see the home page


  @Test @OpensAboutPage
  Scenario: See the about page from the profile
  When attempts to Login with valid Admin and admin123
  And will see the PIM page
  And clicks on the profile picture
  And clicks on the about option
  Then will see the about popup window

  @Test @OpensSupportPage
  Scenario: See the support page from the profile dropdown
  When attempts to Login with valid Admin and admin123
  And will see the PIM page
  And clicks on the profile picture
  And clicks on the support option
  Then will see the support page from the profile dropdown

  
  @Test @ChangePassword
  Scenario Outline: Change password
    When attempts to Login with valid <username> and <password>
    And will see the PIM page
    And clicks on the profile picture
    And clicks on the change password option
    And enters <current password>, <new password>
    Then will see the success message

    Examples:
      | username | password | current password | new password |
      | Admin    | admin123 | admin123         | Admin1234!   |
  
  @Test @CancelChangePassword
  Scenario: Cancel actions on the profile dropdown
    When attempts to Login with valid Admin and admin123
    And will see the PIM page
    And clicks on the profile picture
    And clicks on the change password option
    And clicks the cancel button
    Then will be redirected to the previous page


      
 @Test @OpensSupportPage
  Scenario: See the support page from the profile dropdown
  When attempts to Login with invalid Admon and admin125
  Then will visualize the invalid credentials error message



  @Test @LinkHomeRedirection
  Scenario: user wants to go to the home page by clicking the OrangeHRM logo in the sidebar
    When attempts to Login with valid Admin and admin123
    And clicks the OrangeHRM logo on the sidebar
    Then will be redirected to the OrangeHRM home page


