package SerenityAutomation.stepsDescriptions;

import SerenityAutomation.methods.BrowserMethods;
import net.thucydides.core.annotations.Step;

public class BrowserSteps {

    private BrowserMethods browserMethods;

    @Step
    public void openProjectDefinedPage() {
        browserMethods.open();
    }

    @Step
    public void openStoryDefinedPage(String pageURL)
    {
        browserMethods.openBrowserWithProvidedPage(pageURL);
    }

    @Step
    public void closeBrowser () {
        browserMethods.closeBrowser();
    }

    @Step
    public void closeBrowserAndDeleteCookies() {
        browserMethods.closeBrowserAndDeleteCookies();
    }
}
