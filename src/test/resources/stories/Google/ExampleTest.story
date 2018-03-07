Used for Developing

Meta:
@pageUrl https://www.google.com
@user USER
@pass PASSWORD
@testType Develop

Narrative:
As a QA Engineer
I want to test search module of Google.com page

Scenario: Open Google.com Page and verify Search text box is visible
Given story defined page is opened
Then Google logo should be visible

Scenario: Input TEST phrase into Search and verify that search gives at least one correct result
When user searches for TEST phrase
Then results for TEST phrase are visible
When user clicks on First link in search results list
Then selected page opens