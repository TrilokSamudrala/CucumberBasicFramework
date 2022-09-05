Feature: sample login1

@second
Scenario Outline: sampl login to app1

Given login to freecrm app
Then verify freecrm homepage
Then click on login button
Then enter <username> and <password> and click on freecrm signin button
Then close browser

Examples:
|username|password|
|trilok.samudrala@gmail.com|2904@Crm|
