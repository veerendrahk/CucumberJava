Feature: Application Login 

@SmokeTest
Scenario: Home page default login
Given User is on Netbanking Landing page
When User login into application with user name "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"

@SmokeTest
Scenario: Home page default login
Given User is on Netbanking Landing page
When User login into application with user name "john" and password "4567"
Then Home page is populated
And Cards displayed are "false"

@RegTest
Scenario: Home page default login
Given User is on Netbanking Landing page
When User sign up into application with folowing details
| Jenny | abcd | john@abcd.com | Australia | 04333333 |

Then Home page is populated
And Cards displayed are "false"

@RegTest
Scenario Outline: Home page default login
Given User is on Netbanking Landing page
When User login in to application with user name <Username> and password <Password>
Then Home page is populated
And Cards displayed are "true"

Examples:
|Username|Password|
|user1   |pass1   |
|user2   |pass2   |
|user3   |pass3   |
|user4   |pass4   |
