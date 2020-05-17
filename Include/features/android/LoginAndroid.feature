Feature: Login with email on apps
  I want to use this app login feature with email
  
  Background: user can go to login Page
    Given user already open sehatQ app 
    When user is on homepage sehatQ android
    Then user tap icon Login
    And user tap 'continue with email'

  Scenario Outline: login with valid email but user has not complete fill profil
    Given system show login Page
    When user input <emailRegister>email name form 
    And user input <passwordRegister>password name form
    And user tap Lanjutkan Login
    Then system direct open onboarding profil Page  

    Examples: 
|emailRegister												|passwordRegister|
|farisjr558+sehatQ3@gmail.com					|123456	|