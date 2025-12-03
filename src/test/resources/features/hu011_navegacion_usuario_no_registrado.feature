Feature: HU011 - Navigation for unauthenticated users
  As a visitor of ViveMedellín
  I want to browse events without creating an account
  So that I can explore the city’s cultural agenda freely

  Background:
    Given the user is not authenticated
    And the user accesses the platform

  Scenario: Access without authentication
    When the user views the initial list of events
    Then the user should see the list of events without registering

  Scenario: Search events by keyword
    When the user searches for events using the keyword "<keyword>"
    Then the system should display the events that match the keyword "<keyword>"

    Examples:
      | keyword |
      | jazz   |
      | futsal |
      | festival    |

  Scenario: Apply basic filters
    When the user applies category, date, and location filters
    Then the system should update the event list showing only events that match the filters

  Scenario: View public event details
    When the user selects an event from the list
    Then the user should access the public details including full description, images, and map

  @wip
  Scenario: Restriction of advanced features
    When the user tries to save, share, or register for an event without authentication
    Then the system should display a message inviting the user to register or sign in
