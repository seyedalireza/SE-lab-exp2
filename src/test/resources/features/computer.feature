@tag
Feature: Computer

  Scenario: reverse a number
    Given One input value, -3
    When I give "rvs"
    Then I expect the result nearly -0.33333333

  Scenario: square root of a number
    Given One input value, 7
    When I give "sqr"
    Then I expect the result nearly 2.645751311