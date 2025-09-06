Feature: check user is able to login with valid credetials
Scenario: successful login
Given login page should be open in default browser
When click on email textbox and enter email
And click on password textbox and enter password
And click on login button
Then login successfully and open home page