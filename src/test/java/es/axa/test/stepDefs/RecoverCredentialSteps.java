package es.axa.test.stepDefs;

import cucumber.api.java8.En;
import es.axa.test.pages.LoginPage;
import es.axa.test.pages.RecoverCredentialsPage;
import org.springframework.beans.factory.annotation.Autowired;

public class RecoverCredentialSteps implements En {

    private final RecoverCredentialsPage recoverCredentialsPage;

    @Autowired
    public RecoverCredentialSteps(RecoverCredentialsPage recoverCredentialsPage) {

        this.recoverCredentialsPage = recoverCredentialsPage;

        Given("^a user who wants to recover her credentials$", () -> {
            recoverCredentialsPage.goTo();
        });

        When("^she introduces wrong credentials", () -> {
            recoverCredentialsPage.performLogin("1111111X", "1234");
        });

        Then("^she gets an alert message$", () -> {
            assert (recoverCredentialsPage.getAlert() != null);
        });


    }

}
