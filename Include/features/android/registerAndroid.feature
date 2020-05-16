Feature: register for as new user, with email register

Background: 
    Given user is on homepage sehatQ android
    And system show login Icon
    When user tap icon Login
    And system show three option for register
    And user tap 'continue with email'
    Then system show login Page
    And System show 'belum terdaftar? sign up disini'
		But user Tap button 'belum terdaftar? sign up disini'


  Scenario Outline: as new user register with email
	Given user is on sign up Page
	When user fill full name input
	And user fill email name input
	And user fill password input
	And user check privacy policy checkBox
	And user tap button 'Lanjutkan'
	Then system direct open Next step for register
	But user tap 'skip' button
	And system show allert for skip action
	And user tap 'ya' option for completed register
	
		
		
		
    
    
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |