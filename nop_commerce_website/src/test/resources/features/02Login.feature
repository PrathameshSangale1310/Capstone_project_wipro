Feature: check user is able to login with valid credetials
Scenario Outline: successful login
Given login page should be open in default browser
When click on email textbox and enter <email>
And click on password textbox and enter <password>
And click on login button
Then login successfully and open home page
Examples:
|email|password|
|jbsjdkjsdk|123456|
|ilnbjkjsb@gmail.com|147852|
|abccddhej@gmail.com|123456|