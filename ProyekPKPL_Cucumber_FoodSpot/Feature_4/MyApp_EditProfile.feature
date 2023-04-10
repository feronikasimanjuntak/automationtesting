Feature: Test for FoodSpot (https://foodspot.co.id/login)

  Scenario: Test using valid edit name
    Given open chrome and start application
    When I enter valid email and valid password
    Then I can login successfully
    And I click profile icon
    And I click pengaturan akun
    Given I click ubah
		When I input valid name
		Then I can edit the profile
    
  Scenario: Test using empty name
    Given open chrome and start application
    When I enter valid email and valid password
    Then I can login successfully
    And I click profile icon
    And I click pengaturan akun
    Given I click ubah
		When I dont input name
		Then I cannot edit the profile
    