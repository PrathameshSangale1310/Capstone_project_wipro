Feature: check user is able to view jewelry tab
Scenario: successful opening of jewelry tab
Given user opens the home page on the default browser
When user clicks on jewelry tab
And user clicks on the sort by filter and then apply it
And user clicks on the display filter and then apply it
And user clicks on the price by filter and then apply it
And user clicks on the list view icons
And user clicks on any jewelry category
And user clicked on the add to cart button
Then user able to open view jewelry tab