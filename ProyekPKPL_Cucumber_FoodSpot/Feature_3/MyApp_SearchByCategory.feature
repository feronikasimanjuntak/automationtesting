Feature: Test for Food Spot (foodspot.co.id)

  Scenario: Test Edit Name with Valid Credentials
    Given open chrome and start application
    When I enter valid email and valid password
    Then I can login successfully
    Then I click icon "Snack Box"
    When I click "Pilih Area Antar" field
    Then I choose "kota" and "kecamatan" destination
    Then I click "Cari Berdasarkan" to sort the product  
    And I can search by category successfully
  	