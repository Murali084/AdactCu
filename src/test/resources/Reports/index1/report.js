$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/EB.feature");
formatter.feature({
  "name": "Purchasing a product from Eddie Bauer site",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Purchase a product from Eddie Bauer site and generate the order ID",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on Eddie Bauer Home page",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks on Settings option and clicks sign in and enters \"\u003cemail\u003e\" and \"\u003cpwd\u003e\" and click on Sign in button",
  "keyword": "When "
});
formatter.step({
  "name": "User searches \"\u003cproduct\u003e\" in search bar",
  "keyword": "When "
});
formatter.step({
  "name": "User nagivates to product list page,selects a product",
  "keyword": "And "
});
formatter.step({
  "name": "User selects the color and \"\u003csize\u003e\" and clicks on Add to Bag",
  "keyword": "And "
});
formatter.step({
  "name": "User nagivates to payment page and completes payment",
  "keyword": "When "
});
formatter.step({
  "name": "Order is placed and Order ID is generated",
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
        "product",
        "size"
      ]
    },
    {
      "cells": [
        "vivek.msc39@gmail.com",
        "Clothes@123",
        "shirt",
        "XL"
      ]
    },
    {
      "cells": [
        "vivek.msc39@gmail.com",
        "Clothes@123",
        "jacket",
        "XL"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Purchase a product from Eddie Bauer site and generate the order ID",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on Eddie Bauer Home page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks on Settings option and clicks sign in and enters \"vivek.msc39@gmail.com\" and \"Clothes@123\" and click on Sign in button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User searches \"shirt\" in search bar",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User nagivates to product list page,selects a product",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User selects the color and \"XL\" and clicks on Add to Bag",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User nagivates to payment page and completes payment",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Order is placed and Order ID is generated",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Purchase a product from Eddie Bauer site and generate the order ID",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on Eddie Bauer Home page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks on Settings option and clicks sign in and enters \"vivek.msc39@gmail.com\" and \"Clothes@123\" and click on Sign in button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User searches \"jacket\" in search bar",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User nagivates to product list page,selects a product",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User selects the color and \"XL\" and clicks on Add to Bag",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User nagivates to payment page and completes payment",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Order is placed and Order ID is generated",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});