Feature: Login feature

Scenario: Verify that user is able to login using a valid username and password
        Given A user is on google.com
        When User clicks on MyAccount link
        Then User is taken to Login page
        When User enters a valid username and password
        Then User is able to login sucessfully