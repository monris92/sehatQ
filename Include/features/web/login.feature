Feature: login Feature webSite

Scenario Outline: Test login with valid Email
Given user navigates to login page
When user input emailLogin name <emailName>
And user input passwordLogin <password>
And user click continue btnLogin
Then sistem show pop up with text Login Berhasil

	Examples:
		|	userName	|					emailName							|password|
		|ahmad faris|farisjr558+sehatQaa1test@gmail.com|123456	|
	