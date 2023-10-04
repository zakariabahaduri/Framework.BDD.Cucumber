Feature: Login button enabled and disabled
  Scenario: Validate Login Section title US_3
    Then : Validate the header title is "TEK Insurance Portal"
    Then : Validate the login section title "Customer Service Portal"
  Scenario: Validate login button is disabled or enabled US_4
    Then : login button should "disabled" when the username and password fields are blank
    When : user enters username "supervisor" and Password "tek_supervisor"
    Then : The login Button should be "enabled"