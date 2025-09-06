Feature: check user is able serach
Scenario Outline: Seraching is possible
Given home page should be open in the default browser
When click on searchbox and type <text>
And click on search button
Then User should be able to search
Examples:
|text|
|iphone|
|3523|
|$^)(|
|iphone12|