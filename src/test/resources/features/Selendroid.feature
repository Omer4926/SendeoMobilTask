Feature: Test
@wip
  Scenario: User can add new register user
    Given User should pass onboarding screens
    And I navigate to Registration Page
    And I entered the information
    And Click register user button
    Then verify user seen successfully

  Scenario: Button is display or not
    Given User should pass onboarding screens
    Then verify button is display or not

  Scenario: Adds checbox button selected or not
    Given User should pass onboarding screens
    And Click I accept adds checkbox button
    Then Verify checkbox button selected or not

  Scenario: User when click display text view button , text must be appear
    Given User should pass onboarding screens
    And Click display text view button
    Then Verify text must be appear


