$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/BusinessUser.feature");
formatter.feature({
  "name": "As a business user i would like to take all the items today",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Output all team names with a match today",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BusinessUser"
    }
  ]
});
formatter.step({
  "name": "open the bbc url \"https://www.bbc.co.uk/sport/football/scores-fixtures\" and 1",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.UITest.navigateurl(java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "record all the teams playing today",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.UITest.gettodayteam()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.UITest.closebrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/SignIn.feature");
formatter.feature({
  "name": "Validate all negative scenarios for Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test negative scenario for SignIn",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Negative"
    }
  ]
});
formatter.step({
  "name": "open the bbc url \"https://www.bbc.co.uk/sport/football/scores-fixtures\" and 2",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.UITest.navigateurl(java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter wrong user name",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.UITest.enter_wrong_user_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the user message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.UITest.verifyusermessage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter wrong short password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.UITest.enter_wrong_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the password message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.UITest.verifypassmessage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter wrong user and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.UITest.enter_wrong_userpassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the user signin message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.UITest.verifyusersignmessage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.UITest.closebrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/Sports.feature");
formatter.feature({
  "name": "As a Sports user i would like to read article related sports",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "use the search option to find the article",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sports"
    }
  ]
});
formatter.step({
  "name": "open the bbc url \"https://www.bbc.co.uk/sport/football/scores-fixtures\" and 2",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.UITest.navigateurl(java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get sports article",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.UITest.getsportsarticle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.UITest.closebrowser()"
});
formatter.result({
  "status": "passed"
});
});