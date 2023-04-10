Feature: Test for FoodSpot (https://foodspot.co.id/login)

  Scenario: Test Login with Valid Credentials
    Given open chrome and start application
    When I enter valid email and valid password
    Then I can login successfully
    
  Scenario: Test Login with Invalid Email
    Given open chrome and start application
    When I enter invalid email and valid password
    Then I cannot login succesfully
    
  Scenario: Test Login with Invalid Password
    Given open chrome and start application
    When I enter valid email and invalid password
    Then I cannot login succesfully
    
  Scenario: Test Login with Empty Password
    Given open chrome and start application
    When I enter valid email and empty password
    Then I cannot login succesfully
    