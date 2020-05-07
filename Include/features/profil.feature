Feature: profil Feature

Scenario Outline: verify feature is exist at profil page
Given user navigates to login page
And user input emailLogin name <emailName>
And user input passwordLogin <password>
When user click continue btnLogin 
And user navigate url to profil page
Then system show feature keluarga is present and ClickAble
And system show feature aktivitas is present and ClickAble
And system show feature kalender is present and ClickAble
And system show feature healt record is present and ClickAble
Examples:
		|					emailName									|password|
		|farisjr558+sehatQaa1test@gmail.com	|123456	|