Feature: check user is able to remove products from cart
Scenario: Product removed from cart successfull
Given home page is opened in default the browser
When user clicks on searchbox and type itemname in the searchbox
And user clicked search button
And user click on the add to cart icon
And user click on shopping cart icon
And user clicks on remove cross icon
Then product is removed from the cart