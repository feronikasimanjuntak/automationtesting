Feature: Test for Food Spot (foodspot.co.id)

  Scenario: Test Search with Valid Keyword
    Given open chrome and start application
    When I enter valid email and valid password
    Then I can login successfully
    When I type the keyword to be search
    And click "Any budget" bar to choose range price
    Then I can search successfully
    
  Scenario: Test Using Empty Search and Valid Range Price 
    Given open chrome and start application
    When I enter valid email and valid password
    Then I can login successfully
    When I dont type the keyword to be search
    Then click "Any budget" bar to choose range price
    And I cannot search successfully
    