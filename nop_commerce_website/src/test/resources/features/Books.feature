Feature: check user is able to view books tab
Scenario: successful opening of books tab
Given user opens the home page in the default browser
When user clicks on books tab
And user clicks on the sort by filter and apply it
And user clicks on the display filter and apply it
And user clicks on the price by filter and apply it
And user clicks on the list view icon
And user clicks on any books category
And user clicks on the add to cart button
Then user able to open view books tab