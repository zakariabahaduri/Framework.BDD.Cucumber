
Feature: Logging in successfully
  @smoke
  Scenario: users uses correct username and password
    When : The web Page is displayed. The title should be "Tek Insurance Service"
    When : user enters username "supervisor"
    And :  user enters Password1 "tek_supervisor"
    And : The login Button should be enabled.
    And : User clicks the submit button
    Then : User should be logedin Successfully.
    And : User should be able to identify accounts "Accounts"
    And : User should be able to identify plans "Plans"

    @US_7,smoke
    Scenario Outline: User uses wrong username and password
      When : user enters username "<username>"
      And :  user enters Password1 "<Password1>"

      And : User clicks the submit button
      Then : User gets an "<error_message>"
      Examples:

        | username       | Password1      | error_message        |
        | supervisor     | wrong password | Password Not Matched |
        | wrong username | tek_supervisor | User not found       |
      @US_8
Scenario: A CSR user logins successfully and clicks on plans the user should see plans and 4 rows
        When : user enters username "supervisor"
        And :  user enters Password1 "tek_supervisor"
        And : User clicks the submit button
        When : Click on Plans
        Then : the title section should be "Plans"