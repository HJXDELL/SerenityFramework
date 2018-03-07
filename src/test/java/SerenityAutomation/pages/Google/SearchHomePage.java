package SerenityAutomation.pages.Google;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchHomePage extends PageObject {

    @FindBy(id = "hplogo")
    public static WebElementFacade googleLogo;

    @FindBy(id = "lst-ib")
    public static WebElementFacade searchTextBox;

    private static final String linksResultList = "(//div[@class='g']//h3[@class='r']/a)";
    @FindBy(xpath = linksResultList+"[1]")
    public static WebElementFacade firstResultLink;
    @FindBy(xpath = linksResultList+"[2]")
    public static WebElementFacade secondResultLink;
    @FindBy(xpath = linksResultList+"[3]")
    public static WebElementFacade thirdResultLink;
}