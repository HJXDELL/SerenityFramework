package SerenityAutomation.definitions.Google;

import SerenityAutomation.stepsDescriptions.Google.SearchHomeSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class SearchHomeDefinitions {

    @Steps
    SearchHomeSteps searchHomeSteps;

    @Then("Google logo should be visible")
    public void verifyGoogleLogoVisible () {
        searchHomeSteps.verifyGoogleLogoVisible();
    }

    @When("user searches for $searchPhrase phrase")
    public void searchForPhrase (String searchPhrase) {
        searchHomeSteps.searchForPhrase(searchPhrase);
    }

    @Then("results for $searchPhrase phrase are visible")
    public void resultsOfSearchAreVisible (String searchPhrase) {
        searchHomeSteps.resultsOfSearchAreVisible(searchPhrase);
    }

    @When("user clicks on $linkPosition link in search results list")
    public void selectLinkFromSearchResults (String linkPosition) {
        searchHomeSteps.selectLinkFromSearchResults(linkPosition);
    }

    @Then("selected page opens")
    public void verifyPageOpened () {
        searchHomeSteps.verifyPageOpened();
    }
}