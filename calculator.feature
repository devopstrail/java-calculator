Feature: 1. Simple number arithmetic
  As a user
  I want to be able to do simple number arithmetic
  So that I can answer my exam questions

  Scenario: 1. Add two numbers
    Given the numbers 3 and 4
    When I add the two numbers
    Then the result should be 7

  Scenario: 2. Subtract two numbers
    Given the numbers 2 and 1
    When I subtract the two numbers
    Then the result should be 1
