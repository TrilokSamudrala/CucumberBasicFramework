Feature: sample login with Cucumber data table

@third
Scenario: sampl login to app with Cucumber data table

 Given login to freecrm app
 Then verify freecrm homepage
 Then click on login button
 Then enter username and password using datatable
|trilok.samudrala@gmail.com|2904@Crm|
 Then close browser
