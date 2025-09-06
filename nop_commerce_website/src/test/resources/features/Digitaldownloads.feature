Feature: check user is able to view digital downloads page
Scenario: successful opening of digital downloads tabs
Given user opens the home page in default browser
When user clicks on digital downloads tab
And user clicks on sort by filter and apply it
And user clicks on display filter and apply it
And user clicks on list view icon
And user clicks on any digital downloads category
And user clicks on add to cart button
Then user able to open particular digital downloads category