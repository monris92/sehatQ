Feature: Login with email on apps
  I want to use this app login feature with email
  
  Background: user can go to login Page
    Given user already open sehatQ app 
    When user is on homepage sehatQ android
    Then user tap icon Login

  Scenario Outline: login with valid email
    Given system show login Page
    When user input email name form
    And user input passowrd name form
    And user tap Lanjutkan Login
    Then system show home page apps
    

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |