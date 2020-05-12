Feature: register Feature

Scenario Outline: Test Register with valid Email
Given user navigates to register page
When user input userRegister name <userName>
And user input emailRegister name <emailName>
And user input passwordRegister <password>
And user click checkBox register agreement
And user click continue btnRegister
Then sistem direct url sehatq.com as user registered <userName>

	Examples:
		|	userName	|					emailName							|password|
		|ahmad faris|farisjr558+sehatQu@gmail.com|123456	|
	