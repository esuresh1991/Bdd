Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario

Given user is Already on login page
When Title of login page is Free_CRM
Then user enters username and password
		| username | password|
		| esuresh1991@gmail.com | Wersdf123 |
		
Then user clicks on login button
Then user is on Home page
Then user moves to new deal page
Then user enters deal details
	|title       | amount | probability | commission |
	| test deal145 | 1000 | 50 | 10 |
	| test deal2412 | 2000 | 60 | 20 |
	| test deal347 | 3000 | 70 | 30 |
	| poili deal122 | 1000 | 50 | 10 |
	| poili deal252 | 2000 | 60 | 20 |
	| tsd deal321 | 3000 | 70 | 30 |
	| tsdst dealsd1 | 1000 | 50 | 10 |
	| teddfst deadl2 | 2000 | 60 | 20 |
	| testd4 defal3 | 3000 | 70 | 30 |
	
Then Close the browser