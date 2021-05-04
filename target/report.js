$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/A-FlipkartRedmiMobile.feature");
formatter.feature({
  "name": "To verify flipkart product",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@vicky"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Validate the Redmi mobile search",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User close the login popup",
  "keyword": "When "
});
formatter.step({
  "name": "User searches the product \"\u003cPRT\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User click search",
  "keyword": "And "
});
formatter.step({
  "name": "User gets mobile model and price",
  "keyword": "And "
});
formatter.step({
  "name": "User stores the mobile model and price in excel",
  "keyword": "And "
});
formatter.step({
  "name": "User in redmi page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "PRT"
      ]
    },
    {
      "cells": [
        "Redmi Mobile"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate the Redmi mobile search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@vicky"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User close the login popup",
  "keyword": "When "
});
formatter.match({
  "location": "FlipkartClassPage.user_close_the_login_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches the product \"Redmi Mobile\"",
  "keyword": "And "
});
formatter.match({
  "location": "FlipkartClassPage.user_searches_the_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click search",
  "keyword": "And "
});
formatter.match({
  "location": "FlipkartClassPage.user_click_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User gets mobile model and price",
  "keyword": "And "
});
formatter.match({
  "location": "FlipkartClassPage.user_gets_mobile_model_and_price()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User stores the mobile model and price in excel",
  "keyword": "And "
});
formatter.match({
  "location": "FlipkartClassPage.user_stores_the_mobile_model_and_price_in_excel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User in redmi page",
  "keyword": "Then "
});
formatter.match({
  "location": "FlipkartClassPage.user_in_redmi_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/Features/B-FindLowPricedRedMiMob.feature");
formatter.feature({
  "name": "To validate lowest Priced Mobile",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@vicky2"
    }
  ]
});
formatter.scenario({
  "name": "To validate lowest priced mobile",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@vicky2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User close the login popup",
  "keyword": "When "
});
formatter.match({
  "location": "FlipkartClassPage.user_close_the_login_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User gets Price from excel",
  "keyword": "When "
});
formatter.match({
  "location": "GflipkarttClassPage.user_gets_Price_from_excel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User evaluate for low price",
  "keyword": "When "
});
formatter.match({
  "location": "GflipkarttClassPage.user_evaluate_for_low_price()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on low price mobile",
  "keyword": "When "
});
formatter.match({
  "location": "GflipkarttClassPage.user_click_on_low_price_mobile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User handles window and takescreenshot",
  "keyword": "When "
});
formatter.match({
  "location": "GflipkarttClassPage.user_handles_window_and_takescreenshot()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user close the window",
  "keyword": "When "
});
formatter.match({
  "location": "GflipkarttClassPage.user_close_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User quits browser",
  "keyword": "Then "
});
formatter.match({
  "location": "GflipkarttClassPage.user_quits_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});