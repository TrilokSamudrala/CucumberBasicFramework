Feature: sample login

@First
Scenario: sampl login to app

Given login to freecrm app
Then verify freecrm homepage
Then click on login button
Then enter "trilok.samudrala@gmail.com" and "2904@Crm" and click on signin button
Then close browser
