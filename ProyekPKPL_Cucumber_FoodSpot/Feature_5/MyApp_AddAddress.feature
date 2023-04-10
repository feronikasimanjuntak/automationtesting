Feature: Test for FoodSpot (https://foodspot.co.id/login)

  Scenario: Test add address with valid input
    Given open chrome and start application
    When I enter valid email and valid password
    Then I can login successfully
    And I click profile icon
    And I click pengaturan alamat
    Given I click button tambah
    When I input to all field
    Then I can add new address

  Scenario: Test add address with empty tipe alamat 
    Given open chrome and start application
    When I enter valid email and valid password
    Then I can login successfully
    And I click profile icon
    And I click pengaturan alamat
    Given I click button tambah
    When I dont input to tipe alamat field
    Then I cannot add new address
    
  Scenario: Test add address with empty nomor telepon 
    Given open chrome and start application
    When I enter valid email and valid password
    Then I can login successfully
    And I click profile icon
    And I click pengaturan alamat
    Given I click button tambah
    When I dont input to nomor telepon field
    Then I cannot add new address

  Scenario: Test add address with empty nama penerima 
    Given open chrome and start application
    When I enter valid email and valid password
    Then I can login successfully
    And I click profile icon
    And I click pengaturan alamat
    Given I click button tambah
    When I dont input to nama penerima field
    Then I cannot add new address
			
  Scenario: Test add address with empty nama gedung 
    Given open chrome and start application
    When I enter valid email and valid password
    Then I can login successfully
    And I click profile icon
    And I click pengaturan alamat
    Given I click button tambah
    When I dont input to nama gedung field
    Then I cannot add new address
	
  Scenario: Test add address with empty alamat lengkap 
    Given open chrome and start application
    When I enter valid email and valid password
    Then I can login successfully
    And I click profile icon
    And I click pengaturan alamat
    Given I click button tambah
    When I dont input to alamat lengkap field
    Then I cannot add new address