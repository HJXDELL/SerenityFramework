package SerenityAutomation.methods;

import SerenityAutomation.pages.LoginPage;
import net.serenitybdd.core.pages.PageObject;

public class LoginMethods extends PageObject {

    private LoginPage loginPage;

    public void loginUsingCredentials(String username, String password) {
        displayInformationAboutPageLogin();
        inputUsername(username);
        inputPassword(password);
    }

    private void displayInformationAboutPageLogin() {
        String actualPageTitle = getDriver().getTitle();
        String actualPageUrl = getDriver().getCurrentUrl();
        System.out.println("Current page name is: " +actualPageTitle);
        System.out.println("Current page URL is: " +actualPageUrl);
        System.out.println("Login in using provided credentials...");
    }

    private void inputUsername(String username) {
        LoginPage.usernameTextbox.waitUntilVisible();
        LoginPage.usernameTextbox.type(username);
    }

    private void inputPassword(String password) {
        LoginPage.passwordTextbox.waitUntilVisible();
        LoginPage.passwordTextbox.typeAndEnter(password);
    }
}