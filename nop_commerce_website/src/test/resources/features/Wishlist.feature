Feature: check user is able to add product in wishlist
Scenario: Product added to wishlist successful
Given home page open in default browser
When click on serachbox and type something
And click on the search button
And click on wishlist icon
And user click on wishlist link
And user clicks on qty box and enters the qty
And user clicks on update wishlist button
And user clicks on add to cart checkbox
And user click on an add to cart button
Then product added in wishlist