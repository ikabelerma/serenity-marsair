Feature: Searching for flights
  As a MarsAir Sales Director (Mark)
  I want potential customers to be able to search for flights to Mars
  So that they see what trips are available

  Scenario: Search for a valid flight
    Given I am on the MarsAir homepage
    When I select departing in July
    And I select returning in December (two years from now)
    And I choose to Search
    Then I see Call now on 0800 MARSAIR to book!
