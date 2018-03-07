# SerenityFramework
Test Automation example using Serenity/Jbehave written in Java language.
#
This project is based on MAVEN, it is using Serenity libraries for automation User Browser Interactions (Selenium Webdriver for Chrome).
Tests are written in Gherkin Language (BDD) in Given/When/Then style of scenarios.
#
All properties of the project are managed in file /Serenity.properties
#
There is implemented automation of user Login with provided credentials 
(check class: src\test\java\SerenityAutomation\definitions\LoginDefinitions.java)
#
There are also included example test scenarios for Google Search interactions (searching for a Phrase and opening top result from the result links)
(check class: src\test\resources\stories\Google\ExampleTest.story)
All files used in this example can be found in "Google" folders inside src\test\java... classes
