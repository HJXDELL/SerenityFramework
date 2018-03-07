package SerenityAutomation.stepsDescriptions;

import net.thucydides.core.annotations.Step;

public class LoginSteps {

    private SerenityAutomation.methods.LoginMethods LoginMethods;

    @Step
    public void loginUsingCredentials(String user, String password) {
        LoginMethods.loginUsingCredentials(user, password);
    }
}