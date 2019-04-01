Feature: Vehicelcheck


  @vehicleCheck

  Scenario: To verify user should be able to check vehicle exist
    Given User is on coverCheck page
    When enter vehicle registration number
    And click on Find vehicle
    Then result for register vehicles cover start and end date along with time should display