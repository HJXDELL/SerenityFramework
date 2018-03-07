package SerenityAutomation.stepsDescriptions.Google;

import SerenityAutomation.methods.Google.SearchHomeMethods;
import SerenityAutomation.pages.Google.SearchHomePage;
import net.thucydides.core.annotations.Step;

public class SearchHomeSteps {

    private SearchHomePage searchHomePage;

    @Step
    public void verifyGoogleLogoVisible() {
        SearchHomeMethods.verifyGoogleLogoVisible();
    }

    @Step
    public void searchForPhrase(String searchPhrase) {
        SearchHomeMethods.verifySearchTextBoxVisible();
        SearchHomeMethods.inputSearchPhraseInSearchTextBox(searchPhrase);
    }

    @Step
    public void resultsOfSearchAreVisible(String searchPhrase) {
        SearchHomeMethods.verifySearchTextBoxVisible();
        SearchHomeMethods.verifySearchTextBoxValue(searchPhrase);
    }

    @Step
    public void selectLinkFromSearchResults(String linkPosition) {
        SearchHomeMethods.selectLinkFromSearchResults(linkPosition);
    }

    @Step
    public void verifyPageOpened() {
        SearchHomeMethods.verifyPageOpened();
    }
}