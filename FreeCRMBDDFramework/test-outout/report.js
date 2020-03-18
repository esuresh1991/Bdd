$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Suresh/git/Bdd/FreeCRMBDDFramework/src/main/java/Features/deals.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Create a new deal scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is Already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Title of login page is Free_CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "esuresh1991@gmail.com",
        "Wersdf123"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "test deal",
        "1000",
        "50",
        "10"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealsStepDefinition.user_is_Already_on_login_page()"
});
formatter.result({
  "duration": 22380615500,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.Title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 15637400,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 786174200,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_clicks_the_login_button()"
});
formatter.result({
  "duration": 153971000,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_is_on_Home_page()"
});
formatter.result({
  "duration": 12419800,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_moves_to_new_deal_page()"
});
formatter.result({
  "duration": 2021690500,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_enters_deal_details(DataTable)"
});
