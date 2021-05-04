#Author: 1996m.vignesh@gmail.com
@vicky
Feature: To verify flipkart product
  
  Scenario Outline: Validate the Redmi mobile search
    #Given User launches flipkart URL
    When User close the login popup
    And User searches the product "<PRT>"
    And User click search
    And User gets mobile model and price
    And User stores the mobile model and price in excel
    
    Then User in redmi page

    Examples: 
      | PRT          |
      | Redmi Mobile |

     