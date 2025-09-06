Feature: check all home page items work properly
Scenario: Home page features working properly
Given home page is open in the default browser
When click on currency dropdown and user able to change currency
And click on news link and check redirection
And click on details and check redirection
And click on view news archieve and check redirection
And click on footer links and check redirection
And click on social media icons and check redirection
And click on nopCommerce link and check redirection
And click on newsletter textbox and enter email
And click on subscribe button
Then all home pages should work properly