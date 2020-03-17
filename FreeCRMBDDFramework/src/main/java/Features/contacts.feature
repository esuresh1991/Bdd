Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new contact scenario

Given user is already on login page
When title of login page is Free_CRM
Then user enters "<un>" and "<pa>"
And user clicks the login button
Then user is on home page
Then user moves to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then close the browser

Examples:
	| un | pa | firstname | lastname | position |
	| esuresh1991@gmail.com | Wersdf123 | Tom 	  | Peter    | Manager  |
	| surehs | 12345679 | David | Dsouza   | Director |	