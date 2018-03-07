package SerenityAutomation.methods.Google;

import SerenityAutomation.pages.Google.SearchHomeElements;
import SerenityAutomation.pages.Google.SearchHomePage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class SearchHomeMethods {

    private static WebElementFacade selectedElement;

    public static void verifyGoogleLogoVisible() { SearchHomePage.googleLogo.waitUntilVisible();
    }

    public static void verifySearchTextBoxVisible() {
        SearchHomePage.searchTextBox.waitUntilVisible();
    }

    public static void inputSearchPhraseInSearchTextBox(String searchPhrase) {
        SearchHomePage.searchTextBox.sendKeys(searchPhrase);
        SearchHomePage.searchTextBox.sendKeys(Keys.ENTER);
    }

    public static void verifySearchTextBoxValue(String searchPhrase) {
        String actualValue = SearchHomePage.searchTextBox.getValue();
        Assert.assertEquals("The expected value is different than actual one!", searchPhrase, actualValue);
    }

    public static void selectLinkFromSearchResults(String linkPosition) {
        linkPositionSwitcher(linkPosition);
        selectedElement.waitUntilVisible();
        selectedElement.click();
    }

    private static void linkPositionSwitcher(String linkPosition) {
        switch (linkPosition) {
            case (SearchHomeElements.SearchResultLinks.firstLink):
                selectedElement = SearchHomePage.firstResultLink;
                break;
            case (SearchHomeElements.SearchResultLinks.secondLink):
                selectedElement = SearchHomePage.secondResultLink;
                break;
            case (SearchHomeElements.SearchResultLinks.thirdLink):
                selectedElement = SearchHomePage.thirdResultLink;
                break;
            default:
                Assert.fail("This link position was not found! " + linkPosition);
        }
    }

    public static void verifyPageOpened() {
        SearchHomePage.searchTextBox.waitUntilNotVisible();
    }
}