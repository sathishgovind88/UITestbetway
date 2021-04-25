Feature: As a Sports user i would like to read article related sports

@Sports
Scenario: use the search option to find the article
	Given open the bbc url "https://www.bbc.co.uk/sport/football/scores-fixtures" and 2
	When  get sports article
	Then  close the browser