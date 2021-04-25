Feature: Validate all negative scenarios for Login

@Negative
Scenario: Test negative scenario for SignIn
	Given open the bbc url "https://www.bbc.co.uk/sport/football/scores-fixtures" and 2
	When  Enter wrong user name
	Then  verify the user message
	When  Enter wrong short password
	Then  verify the password message
	When  Enter wrong user and password
	Then  verify the user signin message
	Then  close the browser