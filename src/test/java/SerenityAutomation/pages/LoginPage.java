package SerenityAutomation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(id="username")
    public static WebElementFacade usernameTextbox;

    @FindBy(id="password")
    public static WebElementFacade passwordTextbox;
}