Feature: Free CRM Login Feature

#Without Examples Keyword
#Scenario: Free CRM Login Test Scenario
#
#Given user is already on login page
#When title of login page is Free_CRM
#Then user enters "esuresh1991@gmail.com" and "Wersdf123"
#And user clicks the login button
#Then user is on home page


#With Examples Keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already on login page
When title of login page is Free_CRM
Then user enters "<un>" and "<pa>"
And user clicks the login button
Then user is on home page
Then close the browser

Examples:
	| un | pa |
	| esuresh1991@gmail.com | Wersdf123 |
	| surehs | 12345679 |