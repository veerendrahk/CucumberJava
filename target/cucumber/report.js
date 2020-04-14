$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/search.feature");
formatter.feature({
  "name": "Search and place order for Vegitables",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search for items and validate result",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SeleniumTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on greencart landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepDefinitions.user_is_on_greencart_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User serached for \"Cucumber\" Vegitables",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepDefinitions.user_serached_for_something_vegitables(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Cucumber\" results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefinitions.something_results_are_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search for items and and then move to checkout page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SeleniumTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on greencart landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepDefinitions.user_is_on_greencart_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User serached for \"Brinjal\" Vegitables",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepDefinitions.user_serached_for_something_vegitables(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "added items to cart",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDefinitions.added_items_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user processeded to checkout page for purchase",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDefinitions.user_processeded_to_checkout_page_for_purchase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify selected \"Brinjal\" items are displayed on Check out page",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDefinitions.verify_selected_something_items_are_displayed_on_check_out_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});