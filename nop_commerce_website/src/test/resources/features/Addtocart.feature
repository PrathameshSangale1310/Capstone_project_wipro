Feature: check user is able to add products in cart and update it
Scenario: Product added to cart and updation successfull
Given home page is opens in default the browser
When user clicks on searchbox and type in the searchbox
And user clicks search button
And click on the add to cart icon
And user click on shopping carts icon
And user clicks on qty box and enters qty
And user clicks on gift wrapping dropdown and select no
And user clicks on coupon and enter coupon
And user clicks on checkbox
Then product is added in cart