$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/DataTableWithMaps.feature");
formatter.feature({
  "name": "sample login with Cucumber data table with maps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "sampl login to app with Cucumber data table with maps",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@fourth"
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
  "name": "enter username and password using datatable maps",
  "rows": [
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.sampl.steps.Steps.enter_username_and_password_using_datatable_maps(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "error_message": "java.lang.ClassCastException: class java.util.Collections$UnmodifiableRandomAccessList cannot be cast to class java.util.Map (java.util.Collections$UnmodifiableRandomAccessList and java.util.Map are in module java.base of loader \u0027bootstrap\u0027)\r\n\tat com.sampl.steps.Steps.enter_username_and_password_using_datatable_maps(Steps.java:91)\r\n\tat ✽.enter username and password using datatable maps(file:///C:/Users/tsamudra/git/CucumberBasicFramework/BasicCucumberFramework/src/test/resources/Features/DataTableWithMaps.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "com.sampl.steps.Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});