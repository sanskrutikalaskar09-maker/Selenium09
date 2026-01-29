Feature:Test login functionality

Scenario Outline:Check login is successful with
Given chrome browser is open 
And user is on login page 
When user enters <username> and <password>
And user clicks on login 
Then user is navigated to home page 

Examples:
|username|password|
|standard_user|secret_sauce|
|deepti|1234|
|vidhi|1234|
|standard_user|secret_sauce|