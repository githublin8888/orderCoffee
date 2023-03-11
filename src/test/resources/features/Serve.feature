Feature: Serve coffee

  Scenario Outline: buy different coffees
    Given A <coffeeType> is <price> kr
    And I have deposited <money> kr
    When I select <cup> <coffeeType>
    And I press the <button>
    Then My order is <order>

    Examples:
      | coffeeType | price | money | cup | button | order     |
      | Latte      | 10    | 20    | 2   | Yes    | Succeeded |
      | Mocha      | 8     | 12    | 3   | Yes    | Failed    |
      | Espresso   | 12    | 12    | 1   | No     | Failed    |