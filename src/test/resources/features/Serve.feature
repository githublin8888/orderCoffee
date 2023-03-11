Feature: Serve coffee

  Scenario Outline: buy different coffees
    Given A "<coffeeType>" is <price> kr
    And I have deposited <money> kr
    When I select <cup> "<coffeeType>"
    And I press the coffee "<button>"
    Then My order is "<order>"
    And I get my "<receipt>"

    Examples:
      | coffeeType | price | cup | money | button | order     |receipt|
      | Latte      | 10    | 2   | 20    | Yes    | Succeeded |2 Latte|
      | Mocha      | 8     | 3   | 12    | Yes    | Failed    |not order|
      | Espresso   | 12    | 1   | 12    | No     | Failed    |not order|