Feature: Biskane shop Art feature

  Background: 
    Given User is on homepage
    When user clicks on the login button
    Then user enters email and password
    And user clicks the login button

  @ShopArt
  Scenario: Shop art by handmade selection
    When user is on home page
    When user hovers on the shop link
    Then user clicks on the Art button
    And user selects the Handmade filter

 #Scenario: Shop art by Art supply
  #  When user clicks on the art supply selection
   # Then user clicks on the Monalisa painting
