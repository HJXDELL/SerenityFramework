package SerenityAutomation.definitions;

import SerenityAutomation.stepsDescriptions.BrowserSteps;
import SerenityAutomation.stepsDescriptions.LoginSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;

public class BasicDefinitions {

    @Steps
    private BrowserSteps browserSteps;

    @Steps
    private LoginSteps loginSteps;

//    @BeforeScenario
//    public void openBrowserAndStart () {
//        browserSteps.openBrowserWithSuperDriver();
//    }

//   @AfterScenario
//    public void closeBrowserAndEndTest () {
//        browserSteps.closeBrowser();
//    }

    @Given("project defined page is opened")
    public void openProjectDefinedPage () {
        browserSteps.openProjectDefinedPage();
    }

    @Given("story defined page is opened")
    public void openStoryDefinedPage (@Named("pageUrl") String pageUrl) {
        browserSteps.openStoryDefinedPage(pageUrl);
    }

    @Then("user closes the browser")
    public void closeBrowser () {
        browserSteps.closeBrowser();
    }

    @Then("user closes the browser and deletes Cookies")
    public void closeBrowserAndDeleteCookies () {
        browserSteps.closeBrowserAndDeleteCookies();
    }
}