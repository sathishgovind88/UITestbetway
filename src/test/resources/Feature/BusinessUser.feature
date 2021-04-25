Feature: As a business user i would like to take all the items today

@BusinessUser
Scenario: Output all team names with a match today
	Given open the bbc url "https://www.bbc.co.uk/sport/football/scores-fixtures" and 1
	When  record all the teams playing today
	Then  close the browser