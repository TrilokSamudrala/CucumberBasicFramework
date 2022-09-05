$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Second.feature");
formatter.feature({
  "name": "sample login1",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "sampl login to app1",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@second"
    }
  ]
});
formatter.step({
  "name": "login to freecrm app",
  "keyword": "Given "
});
formatter.step({
  "name": "verify freecrm homepage",
  "keyword": "Then "
});
formatter.step({
  "name": "click on login button",
  "keyword": "Then "
});
formatter.step({
  "name": "enter \u003cusername\u003e and \u003cpassword\u003e and click on freecrm signin button",
  "keyword": "Then "
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "trilok.samudrala@gmail.com",
        "2904@Crm"
      ]
    }
  ]
});
formatter.scenario({
  "name": "sampl login to app1",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@second"
    }
  ]
});
formatter.step({
  "name": "login to freecrm app",
  "keyword": "Given "
});
formatter.match({
  "location": "com.sampl.steps.Steps.login_to_freecrm_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify freecrm homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "com.sampl.steps.Steps.verify_freecrm_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.sampl.steps.Steps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter trilok.samudrala@gmail.com and 2904@Crm and click on freecrm signin button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.sampl.steps.Steps.enter_username_and_password_and_click_on_freecrm_signin(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "com.sampl.steps.Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
});