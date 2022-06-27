Feature: Biskane SignUp page

@Artistsignup
Scenario:
When I hover on Signup button
When click on Artist signup
Then I verify Artist signup page appears
Then I enter "<firstname>", "<lastname>" , "<email>", "<phoneNumber>", "<pw>", "<confirmpw>"
When I click on I agree checkbox

Examples:

| firstname | lastname | email            | phoneNumber | pw       | confirmpw  |
| Emma      | Brown    | ebrown@gmail.com | 988882333   | Test@123 | Test@123   |