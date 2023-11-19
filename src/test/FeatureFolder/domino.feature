Feature: To order in dominos website
  Scenario: Add and remove products
    Given launch url
    When User click order online now button
    And User Enter your address and pincode
    And User choose veg pizza section
    And User add pizzas
    And User choose beverage section
    And User add drinks
    And User removes products
    Then User Checkout




