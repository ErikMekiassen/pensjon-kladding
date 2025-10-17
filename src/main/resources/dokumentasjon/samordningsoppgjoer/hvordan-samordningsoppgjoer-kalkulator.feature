Feature: Beregning av pensjon

  Scenario: Beregn pensjon basert på garantipensjonsnivå, trygdetid og pensjonsbeholdning
    Given garantipensjonsnivå er 100000
    And trygdetid er 40
    And pensjonsbeholdning er 500000
    When jeg beregner pensjonen
    Then resultatet skal være 200000.0