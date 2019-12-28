$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Macy\u0027s.feature");
formatter.feature({
  "name": "Purchasing a product from Macy\u0027s webpage",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Purchase a watch from Macy\u0027s webpage and generate the order ID",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on Macy\u0027s Home page",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks on Sign In option and enters \"\u003cemail\u003e\" and \"\u003cpwd\u003e\" and click on Sign in button",
  "keyword": "When "
});
formatter.step({
  "name": "User searches \"\u003cprodName\u003e\" in search bar",
  "keyword": "When "
});
formatter.step({
  "name": "User selects the specified product from list of options and clicks Add to Bag",
  "keyword": "And "
});
formatter.step({
  "name": "User nagivates to Checkout page and clicks on View Bag \u0026 Checkout button",
  "keyword": "And "
});
formatter.step({
  "name": "User nagivates to payment page and proceed with payment options and order ID is generated",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "pwd",
        "prodName"
      ]
    },
    {
      "cells": [
        "dharani084@gmail.com",
        "Murali@2621",
        "watch"
      ]
    },
    {
      "cells": [
        "dharani084@gmail.com",
        "Murali@2621",
        "belt"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Purchase a watch from Macy\u0027s webpage and generate the order ID",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on Macy\u0027s Home page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks on Sign In option and enters \"dharani084@gmail.com\" and \"Murali@2621\" and click on Sign in button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User searches \"watch\" in search bar",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User selects the specified product from list of options and clicks Add to Bag",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User nagivates to Checkout page and clicks on View Bag \u0026 Checkout button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User nagivates to payment page and proceed with payment options and order ID is generated",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Purchase a watch from Macy\u0027s webpage and generate the order ID",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on Macy\u0027s Home page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks on Sign In option and enters \"dharani084@gmail.com\" and \"Murali@2621\" and click on Sign in button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User searches \"belt\" in search bar",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User selects the specified product from list of options and clicks Add to Bag",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User nagivates to Checkout page and clicks on View Bag \u0026 Checkout button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User nagivates to payment page and proceed with payment options and order ID is generated",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});