Feature: Biskane shop Art feature

@ShopArts
Scenario Outline: Verify Art feature


Given User is on homepage
When user clicks on the login button
Then user enters "<email>" and "<password>"



Examples:

|email                  |password  |
|pooja@katchintech.com  |Cust@123  |



