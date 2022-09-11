$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Selendroid.feature");
formatter.feature({
  "line": 1,
  "name": "Test",
  "description": "",
  "id": "test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 19,
  "name": "User when click display text view button , text must be appear",
  "description": "",
  "id": "test;user-when-click-display-text-view-button-,-text-must-be-appear",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@wip"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User should pass onboarding screens",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "Click display text view button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Verify text must be appear",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_pass_onboarding_screens()"
});
formatter.result({
  "duration": 11864456541,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.clickDisplayTextViewButton()"
});
formatter.result({
  "duration": 651675292,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verifyTextMustBeAppear()"
});
formatter.result({
  "duration": 555923916,
  "status": "passed"
});
});