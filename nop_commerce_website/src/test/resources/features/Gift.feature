Feature: check user is able to view gifts page
Scenario: successful opening of gifts tabs
Given user opens the home page in default browsers
When user clicks on gifts tab
And user clicks on sort by filter and apply it then
And user clicks on display filter and apply it then
And user clicks on list views icon
And user clicks on any gifts category
And user clicked on add to cart button
Then user able to open particular gifts category