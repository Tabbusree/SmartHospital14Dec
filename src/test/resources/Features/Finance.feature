Feature: Checking the Functionality of Finance

@FinanceIncome
Scenario Outline: user need to send the Required parameters
 Given user need to be login into the page
  When user clicks on Income
  And user clicks on  Add Income 
  And user  needs to provide the "<name>" and "<Invoicenumber>" and "<amount>"  and "<date>" and "<description>"
  Then user validates the income record
@FinanceExpenses
Scenario Outline: User need to send the Required details
	Given user need to be login into the page
  When user clicks on Expenses
  And user clicks on Add Expenses
  And user needs to enters the "<name>" and "<Invoicenumber>" and "<amount>"  and "<date>" and "<description>" 
  And user saves the expense record
  Then user validates the expense record
  
  Examples:
     |name  | Invoicenumber| amount |date      | description                       |
     |mani  | 43254        | 25000  |11/13/2023| This is newly added record        |
     |deepak| 56783        | 27000  |10/22/2023| this is newly  added deepak record|
     