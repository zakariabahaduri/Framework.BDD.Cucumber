Feature: The header title should match the expected
  Scenario: As user opens the Tek Insurance App it should match the exact word
  ##  Given  User has opened the the website
    When  User inputs username "supervisor" and password "tek_supervisor"
    And  User clicks on submit button
    Then  The title should be "Tek Insurance Service"
    And  User should see the header "Tek Insurance App"
 ##   And  The browser should be closed