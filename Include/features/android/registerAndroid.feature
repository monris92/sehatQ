Feature: register for as new user, with email register

 
Background: Test login with valid Email
    Given user already open sehatQ app 
    And user is on homepage sehatQ android
    When user tap icon Login
    And user tap 'continue with email'
    Then system show login Page
    And System show 'belum terdaftar? sign up disini'
		And user Tap button 'belum terdaftar? sign up disini'


  Scenario Outline: as new user register with email
	Given user is on sign up Page
	When user input name <nameRegister> field
	And user input email <emailRegister> field
	And user input password <passwordRegister> field
	And user check privacy policy checkBox
	And user tap button Lanjutkan
	Then system direct open onboarding profil Page
	And user tap 'skip' button
	And user tap 'ya' option allert for completed register

	Examples:
		|nameRegister	|emailRegister												|passwordRegister|
		|ahmad faris	|farisjr558+sehatQandroid1@gmail.com		|123456	|
		
		
		
    
    
