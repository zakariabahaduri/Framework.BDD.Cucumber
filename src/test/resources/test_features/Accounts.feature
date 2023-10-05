Feature: Validate Accounts Table

  @US_9, @smoke
  Scenario: Validate account table rows
    Given : Login with username "supervisor" and password "tek_supervisor"
    When : wait for 2 Second
    When : click on "Accounts" Link
    When : wait for 60 Second
    Then : Validate table has 10 rows

  @US_10
  Scenario Outline: Validate Change Item per page
    Given : Login with username "supervisor" and password "tek_supervisor"
    When : wait for 2 Second
    When : click on "Accounts" Link
    When : wait for 60 Second
    Then : Validate table has 10 rows
    When change item per page to "<itemPerPage>"
    When : wait for 5 Second
    Then Validate accounts table have <itemPerPage> rows

    Examples:
      | itemPerPage |
      | 25          |
      | 100         |