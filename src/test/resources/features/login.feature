@Regression @smoke @login
Feature: Library login app  feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.
  Accounts are: librarian, student, admin
  Background: For the scenarios in the feature file user is expected to be on login page.
    Given  user is on login page
    #As we have given Given in Bacground we do not need  it in our scenario as they will take it from here
    # given will be executed before each scenario
  @librarian
  Scenario: Login as librarian
    #Given  user is on login page
    When user enters librarian username
    And  user enters librarian password
    Then  user should see the dashboard

    @student
    Scenario: Login as student
     # Given user is on login page
      When  user enter student username
      And  user enters student password
      Then user should see the dashboard

      @admin
      Scenario: Login as admin
       # Given  user is on login page
        When  user enter admin username
        And  user enters admin password
        Then user should see the dashboard

        #using tags we can control which scenarios will be executed
        # We can write as many tags as we want for each scenerio