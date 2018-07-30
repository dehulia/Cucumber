Feature: Google Search

	@web
  Scenario: Validate google search text field
    Given I open a browser
    When I navigate to google page
    Then I validate the search text field

    
   Scenario: Validate My own scnario
    Given I found browser with x data
    When I navigate to google page to find y site
    Then I validate the search text field with z input