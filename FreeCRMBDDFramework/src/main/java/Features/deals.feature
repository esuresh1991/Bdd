Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario

Given user is Already on login page
When Title of login page is Free_CRM
Then user enters username and password
| esuresh1991@gmail.com | Wersdf123 |

Then user clicks on login button
Then user is on Home page
Then user moves to new deal page
Then user enters deal details
| test deal | 1000 | 50 | 10 |

Then Close the browser