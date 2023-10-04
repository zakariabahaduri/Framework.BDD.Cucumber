Feature: Plans page features
  Background: Login and navigate to Plans
    Given : Login with username "supervisor" and password "tek_supervisor"
    When : wait for 2 Second
    When : click on "Plans" Link
    And : wait for 2 Second


  @US_8
  Scenario: Validate plans and table exist the in the page

    Then : Validate Section title is "Plans"
    Then : Validate table has 4 rows
    And : Validate all plans rows are valid "Valid"
    @US_11
    Scenario: Validate Plan code headers
      Then : Validate Section title is "Plans"
      Then : Validate Plan table header
        | Plan Type | Base Price | Date Expire | Created By | Date Created | Plan Expired |