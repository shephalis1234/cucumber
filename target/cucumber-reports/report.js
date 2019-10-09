$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/HaudAPI/cucumberframework/src/main/java/feature/com/contact.feature");
formatter.feature({
  "line": 1,
  "name": "practice automation form",
  "description": "",
  "id": "practice-automation-form",
  "keyword": "Feature"
});
formatter.before({
  "duration": 400400,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Free form",
  "description": "",
  "id": "practice-automation-form;free-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title form page is free form",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on simple button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.user_is_already_on_Page()"
});
formatter.result({
  "duration": 6198951300,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.title_form_page_is_free_form()"
});
formatter.result({
  "duration": 827056100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cusername\u003e",
      "offset": 13
    },
    {
      "val": "\u003cpassword\u003e",
      "offset": 30
    }
  ],
  "location": "stepdefinition.user_enters_and(String,String)"
});
formatter.result({
  "duration": 759199900,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.user_clicks_on_simple_button()"
});
formatter.result({
  "duration": 6116911700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.close_the_browser()"
});
formatter.result({
  "duration": 734955700,
  "status": "passed"
});
formatter.after({
  "duration": 117400,
  "status": "passed"
});
});