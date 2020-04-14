Feature: Search and place order for Vegitables


@SeleniumTest
Scenario: Search for items and validate result
Given User is on greencart landing page
When User serached for "Cucumber" Vegitables
Then "Cucumber" results are displayed


@SeleniumTest
Scenario: Search for items and and then move to checkout page
Given User is on greencart landing page
When User serached for "Brinjal" Vegitables
And added items to cart
And user processeded to checkout page for purchase
And verify selected "Brinjal" items are displayed on Check out page

