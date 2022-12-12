Feature: Login functionality

  Scenario Outline: Verify login page
    Given user is open browser
    And user open using URL as <url>
    When user enters valid credentials username as <uname> and password as <pwd>
    And user clicks login button
    Then user navigated to Home Page
    And user is closed browser
    Examples:
      | url                                                | uname   | pwd    |
      | https://demosite.executeautomation.com/Login.html | admin | admin |

