package SerenityAutomation.definitions;

import SerenityAutomation.stepsDescriptions.LoginSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.When;
import org.jbehave.core.annotations.Named;

public class LoginDefinitions {

    @Steps
    private LoginSteps loginSteps;

    @When("user provides credentials and logs in")
    public void loginUsingCredentials (@Named("user") String login, @Named ("pass") String password) {
        loginSteps.loginUsingCredentials(login, password);
    }
}