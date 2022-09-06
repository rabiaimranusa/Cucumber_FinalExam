@Feature1
Feature: Background color changing

Background: 
Given in the provided url page
 
 @Scenario1
  Scenario: Sky Blue Backgroung
    Given set skyblue backgroung button exists
    When I click on the button
    Then the background color will change to sky blue
 
   @Scenario2
   Scenario: White Background Change
    Given set skywhite background button exists
    When I  click on the button
    Then the background color will change to white

   
