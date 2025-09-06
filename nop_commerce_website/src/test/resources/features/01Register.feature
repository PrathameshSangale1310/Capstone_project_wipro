Feature: check user is able to register with valid credetials
Scenario: successful register
Given home page should be open in default browser
When click on register link on the top
And click on gender checkbox
And click on first name field and enter first name
And click on last name field and enter last name
And click on email field and enter email
And click on password field and enter password
And click on confirm password field and enter cpassword
And click on register button
Then register successfully