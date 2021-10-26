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

  Scenario Outline: calculate reverse of square root of an integer
    Given One input value, <Input>
    When I give <opt>
    Then I expect the result nearly <result>

    Examples:
      | Input | opt | result |
      | 4     | rvs | 0.25   |
      | 4     | sqr | 2      |