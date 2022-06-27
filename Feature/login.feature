Feature: biskane login feature

@Userlogin
Scenario: Verify login feature

Given User is on biskane application
When User clicks on the login button
Then user enters "<email>" and "<password>"
Then User click on the signinButton

Examples:

|email                  |password  |
|pooja@katchintech.com  |Cust123   |
|pooja@katchintech.com  |Cust@123  |
