package SerenityAutomation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject {

    @FindBy(className = "Header_nav")
    public static WebElementFacade createMenuButton;

    @FindBy(xpath = "//tr/td[@id='ItemMiddle'][contains(text(), 'Start Order Package')]")
    public static WebElementFacade startOrderPackageLink;

    @FindBy(className = "nav-toggle-one")
    public static WebElementFacade openSubMenuButton;

    @FindBy(css = ".menu-item-enabled:nth-child(1) .menu-item-title")
    public static WebElementFacade dashboardMenuButton;
    @FindBy(css = ".menu-item-enabled:nth-child(2) .menu-item-title")
    public static WebElementFacade myFiltersMenuButton;
    @FindBy(css = ".menu-item-enabled:nth-child(3) .menu-item-title")
    public static WebElementFacade myWorkListMenuButton;
    @FindBy(css = ".menu-item-enabled:nth-child(4) .menu-item-title")
    public static WebElementFacade myWorkFlowsMenuButton;
    @FindBy(css = ".menu-item-enabled:nth-child(5) .menu-item-title")
    public static WebElementFacade calendarMenuButton;
    @FindBy(css = ".menu-item-enabled:nth-child(6) .menu-item-title")
    public static WebElementFacade reportAndLinksMenuButton;
    @FindBy(css = ".menu-item-enabled:nth-child(7) .menu-item-title")
    public static WebElementFacade knownIssuesMenuButton;
    @FindBy(css = ".menu-item-enabled:nth-child(8) .menu-item-title")
    public static WebElementFacade feedbackMenuButton;
    @FindBy(css = ".menu-item-enabled:nth-child(9) .menu-item-title")
    public static WebElementFacade releaseNotesMenuButton;
    @FindBy(css = ".menu-item-enabled:nth-child(10) .menu-item-title")
    public static WebElementFacade userGuideMenuButton;
    @FindBy(css = ".menu-item-enabled:nth-child(11) .menu-item-title")
    public static WebElementFacade workflowDelegationMenuButton;
    @FindBy(css = ".menu-item-enabled:nth-child(12) .menu-item-title")
    public static WebElementFacade configurationMenuButton;

    @FindBy(css = "img[tabindex='0']")
    public static WebElementFacade homeMyOrdersLogo;

    @FindBy(xpath = "//span/a[contains(text(), 'OP-')]")
    public static WebElementFacade latestRecentOrderPackageLink;

    @FindBy(className = "SearchResultsPromptText")
    public WebElementFacade researchField;

    @FindBy (id = "searchMenuButton")
    public WebElementFacade searchButton;

    @FindBy(xpath = "//div[@class='field-item dataLabelWrite']")
    public static WebElementFacade getStartedButton;
}