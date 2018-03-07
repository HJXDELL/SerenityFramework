Used for Developing

Meta:
@pageUrl TESTURL
@user USER
@pass PASSWORD
!--you can use different meta tags to differentiate your scenarios and stories!
@testType Develop

Narrative:
As a QA Engineer
I want to test debug a single story

Scenario: DEBUG_TEST
!--Here is a list of already prepared working Step Definitions
!--Below step opens URL provided in Serenity.properties
Given project defined page is opened
!-- Below step uses meta pageUrl value
Given story defined page is opened
!--Below step uses meta user & pass values
When user provides credentials and logs in
Then user closes the browser
Then user closes the browser and deletes Cookies
!--Add your steps here!!!