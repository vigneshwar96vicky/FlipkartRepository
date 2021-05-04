#Author: 1996m.vignesh@gmail.com
@vicky2
Feature: To validate lowest Priced Mobile

  Scenario: To validate lowest priced mobile
    When User close the login popup
    When User gets Price from excel
    When User evaluate for low price
    When User click on low price mobile
    When User handles window and takescreenshot
    When user close the window
    Then User quits browser
