package SerenityAutomation.methods;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

public class BrowserMethods extends PageObject {

    public BrowserMethods(WebDriver driver) {
        super(driver);
    }

    public void closeBrowser () {
        getDriver().close();
    }

    public void closeBrowserAndDeleteCookies () {
        getDriver().manage().deleteAllCookies();
        getDriver().close();
    }

    public void openBrowserWithProvidedPage(String pageUrl) {
        getDriver().navigate().to(pageUrl);
    }
}