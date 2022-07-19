Feature: Biskane shop feature

  @Book
  Scenario: Verify shop feature
    When user click on the shop link
    Then user clicks on the books link
    Then user search book by title name
    When user clicks on a BuyNow button
    Then user scrolls down to the bottom of the page
    Then user clicks on the buy now button
    #Then user clicks on add to cart button
    Then user scrolls up the page
#Given user is logged in and on homepage
#When user hover on the shop link
