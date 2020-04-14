Feature: Account validation 

Background:
Given validate the browser
When browser is triggered
Then check if browser is started


@MobileTest
Scenario: Savings Account page
Given User is on Netbanking Landing page
When Click on Savings
Then Savings page is populated
And Cards displayed on saving account are



@WebTest
Scenario: Checking Account page
Given User is on Netbanking Landing page
When Click on Checking
Then Checkings page is populated