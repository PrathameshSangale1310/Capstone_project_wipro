Feature: check user is able to register with valid credetials
Scenario Outline: successful register
Given home page should be open in default browser
When click on register link on the top
And click on gender checkbox
And click on first name field and enter <firstname>
And click on last name field and enter <lastname>
And click on email field and enter <email>
And click on password field and enter <password>
And click on confirm password field and enter <cpassword>
And click on register button
Then register successfully
Examples:
|firstname|lastname|email|password|cpassword|
|Prathames|Sangale|jbsjdkjsdk|123456|123456|
|Prathamesh|123456789|ilnbjkjsb@gmail.com|123456|123456|
|12345678|123456789|jknxsukbs@gmail.com|123456|123456|
|Prathamesh|Sangale|bjsjbsm@gmail.com|123456|147852|
|Prathamesh|Sangale|abccddhej@gmail.com|123456|123456|